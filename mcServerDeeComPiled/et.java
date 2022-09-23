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

public class et implements ArgumentType<Integer> {
   private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("argument.scoreboardDisplaySlot.invalid", $$0));

   private et() {
   }

   public static et a() {
      return new et();
   }

   public static int a(CommandContext<dr> $$0, String $$1) {
      return $$0.getArgument($$1, Integer.class);
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      String $$1 = $$0.readUnquotedString();
      int $$2 = dxo.j($$1);
      if ($$2 == -1) {
         throw a.create($$1);
      } else {
         return $$2;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.a(dxo.h(), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
