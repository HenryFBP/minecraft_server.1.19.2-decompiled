import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class ef implements eu<ef.b> {
   private static final Collection<String> a = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
   private static final Logger b = LogUtils.getLogger();

   public static ef a() {
      return new ef();
   }

   public static rq a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      ef.b $$2 = (ef.b)$$0.getArgument($$1, ef.b.class);
      return $$2.b((dr)$$0.getSource());
   }

   public static ef.a b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      ef.b $$2 = (ef.b)$$0.getArgument($$1, ef.b.class);
      rq $$3 = $$2.b((dr)$$0.getSource());
      dp $$4 = ((dr)$$0.getSource()).o();
      sd $$5 = $$4.a($$1);
      if ($$5 == null) {
         ri $$6 = new ri($$2.a, $$3);
         return new ef.a(sd.a($$6));
      } else {
         return new ef.a(rh.attachIfNotDecorated($$5, $$3));
      }
   }

   public ef.b a(StringReader $$0) throws CommandSyntaxException {
      return ef.b.a($$0, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public String a(ef.b $$0) {
      return $$0.a();
   }

   public CompletableFuture<rq> a(dr $$0, ef.b $$1) throws CommandSyntaxException {
      return $$1.a($$0);
   }

   @Override
   public Class<ef.b> b() {
      return ef.b.class;
   }

   static void a(dr $$0, CompletableFuture<?> $$1) {
      $$1.exceptionally($$1x -> {
         b.error("Encountered unexpected exception while resolving chat message argument from '{}'", $$0.b().getString(), $$1x);
         return null;
      });
   }

   public static record a(sd a) {
      public void a(dr $$0, Consumer<sd> $$1) {
         MinecraftServer $$2 = $$0.m();
         $$0.p().append(() -> {
            CompletableFuture<agv> $$3 = this.a($$0, this.a.b().b());
            CompletableFuture<sd> $$4 = $$2.bf().decorate($$0.j(), this.a);
            return CompletableFuture.allOf($$3, $$4).thenAcceptAsync($$3x -> {
               sd $$4x = ((sd)$$4.join()).a(((agv)$$3.join()).e());
               $$1.accept($$4x);
            }, $$2);
         });
      }

      private CompletableFuture<agv> a(dr $$0, String $$1) {
         agh $$2 = $$0.j();
         return $$2 != null && this.a.a($$2.co()) ? $$2.T().a($$1) : CompletableFuture.completedFuture(agv.a($$1));
      }

      public void a(dr $$0) {
         if (!this.a.f().b()) {
            this.a($$0, (Consumer<sd>)($$1 -> {
               aiz $$2 = $$0.m().ac();
               $$2.a($$1, Set.of());
            }));
         }

      }
   }

   public static class b {
      final String a;
      private final ef.c[] b;

      public b(String $$0, ef.c[] $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String a() {
         return this.a;
      }

      public ef.c[] b() {
         return this.b;
      }

      CompletableFuture<rq> a(dr $$0) throws CommandSyntaxException {
         rq $$1 = this.b($$0);
         CompletableFuture<rq> $$2 = $$0.m().bf().decorate($$0.j(), $$1);
         ef.a($$0, $$2);
         return $$2;
      }

      rq b(dr $$0) throws CommandSyntaxException {
         return this.a($$0, $$0.c(2));
      }

      public rq a(dr $$0, boolean $$1) throws CommandSyntaxException {
         if (this.b.length != 0 && $$1) {
            sb $$2 = rq.b(this.a.substring(0, this.b[0].a()));
            int $$3 = this.b[0].a();

            for(ef.c $$4 : this.b) {
               rq $$5 = $$4.a($$0);
               if ($$3 < $$4.a()) {
                  $$2.f(this.a.substring($$3, $$4.a()));
               }

               if ($$5 != null) {
                  $$2.b($$5);
               }

               $$3 = $$4.b();
            }

            if ($$3 < this.a.length()) {
               $$2.f(this.a.substring($$3));
            }

            return $$2;
         } else {
            return rq.b(this.a);
         }
      }

      public static ef.b a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
         String $$2 = $$0.getString().substring($$0.getCursor(), $$0.getTotalLength());
         if (!$$1) {
            $$0.setCursor($$0.getTotalLength());
            return new ef.b($$2, new ef.c[0]);
         } else {
            List<ef.c> $$3 = Lists.newArrayList();
            int $$4 = $$0.getCursor();

            while(true) {
               int $$5;
               fz $$7;
               while(true) {
                  if (!$$0.canRead()) {
                     return new ef.b($$2, (ef.c[])$$3.toArray(new ef.c[0]));
                  }

                  if ($$0.peek() == '@') {
                     $$5 = $$0.getCursor();

                     try {
                        ga $$6 = new ga($$0);
                        $$7 = $$6.t();
                        break;
                     } catch (CommandSyntaxException var8) {
                        if (var8.getType() != ga.h && var8.getType() != ga.f) {
                           throw var8;
                        }

                        $$0.setCursor($$5 + 1);
                     }
                  } else {
                     $$0.skip();
                  }
               }

               $$3.add(new ef.c($$5 - $$4, $$0.getCursor() - $$4, $$7));
            }
         }
      }
   }

   public static class c {
      private final int a;
      private final int b;
      private final fz c;

      public c(int $$0, int $$1, fz $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public int a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public fz c() {
         return this.c;
      }

      @Nullable
      public rq a(dr $$0) throws CommandSyntaxException {
         return fz.a(this.c.b($$0));
      }
   }
}
