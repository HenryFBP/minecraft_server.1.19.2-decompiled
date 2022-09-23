import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fe implements ArgumentType<fc> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
   private final hd<cjt> b;

   public fe(dl $$0) {
      this.b = $$0.a(hm.h);
   }

   public static fe a(dl $$0) {
      return new fe($$0);
   }

   public fc a(StringReader $$0) throws CommandSyntaxException {
      ff.a $$1 = ff.a(this.b, $$0, true);
      return new fc($$1.a(), $$1.b().keySet(), $$1.c());
   }

   public static fc a(CommandContext<dr> $$0, String $$1) {
      return (fc)$$0.getArgument($$1, fc.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ff.a(this.b, $$1, false, true);
   }

   public Collection<String> getExamples() {
      return a;
   }
}
