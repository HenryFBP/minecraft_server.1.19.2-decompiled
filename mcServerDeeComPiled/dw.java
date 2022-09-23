import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class dw implements ArgumentType<p> {
   private static final Collection<String> b = Arrays.asList("red", "green");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("argument.color.invalid", $$0));

   private dw() {
   }

   public static dw a() {
      return new dw();
   }

   public static p a(CommandContext<dr> $$0, String $$1) {
      return (p)$$0.getArgument($$1, p.class);
   }

   public p a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      p $$2 = p.b($$1);
      if ($$2 != null && !$$2.d()) {
         return $$2;
      } else {
         throw a.create($$1);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.b(p.a(true, false), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
