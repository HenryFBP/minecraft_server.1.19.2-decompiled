import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class es implements ArgumentType<es.b> {
   public static final SuggestionProvider<dr> a = ($$0, $$1) -> {
      StringReader $$2 = new StringReader($$1.getInput());
      $$2.setCursor($$1.getStart());
      ga $$3 = new ga($$2);

      try {
         $$3.t();
      } catch (CommandSyntaxException var5) {
      }

      return $$3.a($$1, $$1x -> dt.b(((dr)$$0.getSource()).q(), $$1x));
   };
   private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("argument.scoreHolder.empty"));
   final boolean d;

   public es(boolean $$0) {
      this.d = $$0;
   }

   public static String a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return (String)b($$0, $$1).iterator().next();
   }

   public static Collection<String> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, Collections::emptyList);
   }

   public static Collection<String> c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return a($$0, $$1, ((dr)$$0.getSource()).m().aF()::e);
   }

   public static Collection<String> a(CommandContext<dr> $$0, String $$1, Supplier<Collection<String>> $$2) throws CommandSyntaxException {
      Collection<String> $$3 = ((es.b)$$0.getArgument($$1, es.b.class)).getNames((dr)$$0.getSource(), $$2);
      if ($$3.isEmpty()) {
         throw eb.d.create();
      } else {
         return $$3;
      }
   }

   public static es a() {
      return new es(false);
   }

   public static es b() {
      return new es(true);
   }

   public es.b a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '@') {
         ga $$1 = new ga($$0);
         fz $$2 = $$1.t();
         if (!this.d && $$2.a() > 1) {
            throw eb.a.create();
         } else {
            return new es.c($$2);
         }
      } else {
         int $$3 = $$0.getCursor();

         while($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
         }

         String $$4 = $$0.getString().substring($$3, $$0.getCursor());
         if ($$4.equals("*")) {
            return ($$0x, $$1) -> {
               Collection<String> $$2 = (Collection)$$1.get();
               if ($$2.isEmpty()) {
                  throw c.create();
               } else {
                  return $$2;
               }
            };
         } else {
            Collection<String> $$5 = Collections.singleton($$4);
            return ($$1, $$2) -> $$5;
         }
      }
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static class a implements gf<es, es.a.a> {
      private static final byte a = 1;

      public void a(es.a.a $$0, qx $$1) {
         int $$2 = 0;
         if ($$0.b) {
            $$2 |= 1;
         }

         $$1.writeByte($$2);
      }

      public es.a.a a(qx $$0) {
         byte $$1 = $$0.readByte();
         boolean $$2 = ($$1 & 1) != 0;
         return new es.a.a($$2);
      }

      public void a(es.a.a $$0, JsonObject $$1) {
         $$1.addProperty("amount", $$0.b ? "multiple" : "single");
      }

      public es.a.a a(es $$0) {
         return new es.a.a($$0.d);
      }

      public final class a implements gf.a<es> {
         final boolean b;

         a(boolean $$1) {
            this.b = $$1;
         }

         public es a(dl $$0) {
            return new es(this.b);
         }

         @Override
         public gf<es, ?> a() {
            return a.this;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      Collection<String> getNames(dr var1, Supplier<Collection<String>> var2) throws CommandSyntaxException;
   }

   public static class c implements es.b {
      private final fz a;

      public c(fz $$0) {
         this.a = $$0;
      }

      @Override
      public Collection<String> getNames(dr $$0, Supplier<Collection<String>> $$1) throws CommandSyntaxException {
         List<? extends bbn> $$2 = this.a.b($$0);
         if ($$2.isEmpty()) {
            throw eb.d.create();
         } else {
            List<String> $$3 = Lists.newArrayList();

            for(bbn $$4 : $$2) {
               $$3.add($$4.cq());
            }

            return $$3;
         }
      }
   }
}
