import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class ea implements ArgumentType<ea.a> {
   private static final Collection<String> a = Arrays.asList("eyes", "feet");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("argument.anchor.invalid", $$0));

   public static ea.a a(CommandContext<dr> $$0, String $$1) {
      return (ea.a)$$0.getArgument($$1, ea.a.class);
   }

   public static ea a() {
      return new ea();
   }

   public ea.a a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      String $$2 = $$0.readUnquotedString();
      ea.a $$3 = ea.a.a($$2);
      if ($$3 == null) {
         $$0.setCursor($$1);
         throw b.createWithContext($$0, $$2);
      } else {
         return $$3;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.b(ea.a.c.keySet(), $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static enum a {
      a("feet", ($$0, $$1) -> $$0),
      b("eyes", ($$0, $$1) -> new dwq($$0.c, $$0.d + (double)$$1.cA(), $$0.e));

      static final Map<String, ea.a> c = ad.a(Maps.newHashMap(), $$0 -> {
         for(ea.a $$1 : values()) {
            $$0.put($$1.d, $$1);
         }

      });
      private final String d;
      private final BiFunction<dwq, bbn, dwq> e;

      private a(String $$0, BiFunction<dwq, bbn, dwq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      @Nullable
      public static ea.a a(String $$0) {
         return (ea.a)c.get($$0);
      }

      public dwq a(bbn $$0) {
         return (dwq)this.e.apply($$0.cY(), $$0);
      }

      public dwq a(dr $$0) {
         bbn $$1 = $$0.g();
         return $$1 == null ? $$0.e() : (dwq)this.e.apply($$0.e(), $$1);
      }
   }
}
