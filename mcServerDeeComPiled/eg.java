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

public class eg implements ArgumentType<bbe> {
   private static final Collection<String> b = Arrays.asList("spooky", "effect");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("effect.effectNotFound", $$0));

   public static eg a() {
      return new eg();
   }

   public static bbe a(CommandContext<dr> $$0, String $$1) {
      return (bbe)$$0.getArgument($$1, bbe.class);
   }

   public bbe a(StringReader $$0) throws CommandSyntaxException {
      abb $$1 = abb.a($$0);
      return (bbe)hm.U.b($$1).orElseThrow(() -> a.create($$1));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.a(hm.U.d(), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
