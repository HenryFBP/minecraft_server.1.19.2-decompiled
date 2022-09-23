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

public class ee implements ArgumentType<cer> {
   private static final Collection<String> b = Arrays.asList("unbreaking", "silk_touch");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("enchantment.unknown", $$0));

   public static ee a() {
      return new ee();
   }

   public static cer a(CommandContext<dr> $$0, String $$1) {
      return (cer)$$0.getArgument($$1, cer.class);
   }

   public cer a(StringReader $$0) throws CommandSyntaxException {
      abb $$1 = abb.a($$0);
      return (cer)hm.W.b($$1).orElseThrow(() -> a.create($$1));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.a(hm.W.d(), $$1);
   }

   public Collection<String> getExamples() {
      return b;
   }
}
