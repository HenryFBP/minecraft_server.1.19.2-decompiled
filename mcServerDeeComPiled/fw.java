import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fw implements ArgumentType<fw.a> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private final hd<cat> b;

   public fw(dl $$0) {
      this.b = $$0.a(hm.k);
   }

   public static fw a(dl $$0) {
      return new fw($$0);
   }

   public fw.a a(StringReader $$0) throws CommandSyntaxException {
      Either<fv.a, fv.b> $$1 = fv.b(this.b, $$0);
      return (fw.a)$$1.map($$0x -> a($$1x -> $$1x == $$0x.a(), $$0x.b()), $$0x -> a($$0x.a()::a, $$0x.b()));
   }

   public static Predicate<cax> a(CommandContext<dr> $$0, String $$1) {
      return (Predicate<cax>)$$0.getArgument($$1, fw.a.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return fv.a(this.b, $$1, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   private static fw.a a(Predicate<hc<cat>> $$0, @Nullable pj $$1) {
      return $$1 != null ? $$2 -> $$2.a($$0) && pv.a($$1, $$2.u(), true) : $$1x -> $$1x.a($$0);
   }

   public interface a extends Predicate<cax> {
   }
}
