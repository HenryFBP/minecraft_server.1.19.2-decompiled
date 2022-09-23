import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class ft implements ArgumentType<fu> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
   private final hd<cat> b;

   public ft(dl $$0) {
      this.b = $$0.a(hm.k);
   }

   public static ft a(dl $$0) {
      return new ft($$0);
   }

   public fu a(StringReader $$0) throws CommandSyntaxException {
      fv.a $$1 = fv.a(this.b, $$0);
      return new fu($$1.a(), $$1.b());
   }

   public static <S> fu a(CommandContext<S> $$0, String $$1) {
      return (fu)$$0.getArgument($$1, fu.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fv.a(this.b, $$1, false);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
