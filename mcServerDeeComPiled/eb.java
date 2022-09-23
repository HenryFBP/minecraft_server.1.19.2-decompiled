import com.google.common.collect.Iterables;
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eb implements ArgumentType<fz> {
   private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.entity.toomany"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.player.toomany"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("argument.player.entities"));
   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(rq.c("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(rq.c("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(rq.c("argument.entity.selector.not_allowed"));
   final boolean h;
   final boolean i;

   protected eb(boolean $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public static eb a() {
      return new eb(true, false);
   }

   public static bbn a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fz)$$0.getArgument($$1, fz.class)).a((dr)$$0.getSource());
   }

   public static eb b() {
      return new eb(false, false);
   }

   public static Collection<? extends bbn> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      Collection<? extends bbn> $$2 = c($$0, $$1);
      if ($$2.isEmpty()) {
         throw d.create();
      } else {
         return $$2;
      }
   }

   public static Collection<? extends bbn> c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fz)$$0.getArgument($$1, fz.class)).b((dr)$$0.getSource());
   }

   public static Collection<agh> d(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fz)$$0.getArgument($$1, fz.class)).d((dr)$$0.getSource());
   }

   public static eb c() {
      return new eb(true, true);
   }

   public static agh e(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return ((fz)$$0.getArgument($$1, fz.class)).c((dr)$$0.getSource());
   }

   public static eb d() {
      return new eb(false, true);
   }

   public static Collection<agh> f(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      List<agh> $$2 = ((fz)$$0.getArgument($$1, fz.class)).d((dr)$$0.getSource());
      if ($$2.isEmpty()) {
         throw e.create();
      } else {
         return $$2;
      }
   }

   public fz a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = 0;
      ga $$2 = new ga($$0);
      fz $$3 = $$2.t();
      if ($$3.a() > 1 && this.h) {
         if (this.i) {
            $$0.setCursor(0);
            throw b.createWithContext($$0);
         } else {
            $$0.setCursor(0);
            throw a.createWithContext($$0);
         }
      } else if ($$3.b() && this.i && !$$3.c()) {
         $$0.setCursor(0);
         throw c.createWithContext($$0);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Object $$3 = $$0.getSource();
      if ($$3 instanceof dt $$2) {
         StringReader $$3 = new StringReader($$1.getInput());
         $$3.setCursor($$1.getStart());
         ga $$4 = new ga($$3, $$2.c(2));

         try {
            $$4.t();
         } catch (CommandSyntaxException var7) {
         }

         return $$4.a($$1, $$1x -> {
            Collection<String> $$2x = $$2.q();
            Iterable<String> $$3x = (Iterable)(this.i ? $$2x : Iterables.concat($$2x, $$2.x()));
            dt.b($$3x, $$1x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return g;
   }

   public static class a implements gf<eb, eb.a.a> {
      private static final byte a = 1;
      private static final byte b = 2;

      public void a(eb.a.a $$0, qx $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         if ($$0.c) {
            $$2 |= 2;
         }

         $$1.writeByte($$2);
      }

      public eb.a.a a(qx $$0) {
         byte $$1 = $$0.readByte();
         return new eb.a.a(($$1 & 1) != 0, ($$1 & 2) != 0);
      }

      public void a(eb.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "single" : "multiple");
         $$1.addProperty("type", $$0.c ? "players" : "entities");
      }

      public eb.a.a a(eb $$0) {
         return new eb.a.a($$0.h, $$0.i);
      }

      public final class a implements gf.a<eb> {
         final boolean b;
         final boolean c;

         a(boolean $$1, boolean $$2) {
            this.b = $$1;
            this.c = $$2;
         }

         public eb a(dl $$0) {
            return new eb(this.b, this.c);
         }

         @Override
         public gf<eb, ?> a() {
            return a.this;
         }
      }
   }
}
