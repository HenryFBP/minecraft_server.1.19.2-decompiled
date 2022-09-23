import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class pb implements ArgumentType<pa> {
   private static final Collection<String> a = Arrays.asList("techtests.piston", "techtests");

   public pa a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      Optional<pa> $$2 = ol.e($$1);
      if ($$2.isPresent()) {
         return (pa)$$2.get();
      } else {
         Message $$3 = rq.b("No such test: " + $$1);
         throw new CommandSyntaxException(new SimpleCommandExceptionType($$3), $$3);
      }
   }

   public static pb a() {
      return new pb();
   }

   public static pa a(CommandContext<dr> $$0, String $$1) {
      return (pa)$$0.getArgument($$1, pa.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ol.a().stream().map(pa::a);
      return dt.b($$2, $$1);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
