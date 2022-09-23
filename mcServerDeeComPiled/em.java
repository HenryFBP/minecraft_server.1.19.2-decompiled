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

public class em implements ArgumentType<im> {
   private static final Collection<String> b = Arrays.asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> rq.a("particle.notFound", $$0));

   public static em a() {
      return new em();
   }

   public static im a(CommandContext<dr> $$0, String $$1) {
      return (im)$$0.getArgument($$1, im.class);
   }

   public im a(StringReader $$0) throws CommandSyntaxException {
      return b($$0);
   }

   public Collection<String> getExamples() {
      return b;
   }

   public static im b(StringReader $$0) throws CommandSyntaxException {
      abb $$1 = abb.a($$0);
      in<?> $$2 = (in)hm.aa.b($$1).orElseThrow(() -> a.create($$1));
      return a($$0, $$2);
   }

   private static <T extends im> T a(StringReader $$0, in<T> $$1) throws CommandSyntaxException {
      return $$1.d().b($$1, $$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return dt.a(hm.aa.d(), $$1);
   }
}
