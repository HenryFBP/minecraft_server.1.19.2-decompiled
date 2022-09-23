import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dz implements ArgumentType<abb> {
   private static final Collection<String> a = (Collection<String>)Stream.of(cgx.e, cgx.f).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("argument.dimension.invalid", $$0));

   public abb a(StringReader $$0) throws CommandSyntaxException {
      return abb.a($$0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return $$0.getSource() instanceof dt ? dt.a(((dt)$$0.getSource()).u().stream().map(aba::a), $$1) : Suggestions.empty();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static dz a() {
      return new dz();
   }

   public static agg a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      abb $$2 = (abb)$$0.getArgument($$1, abb.class);
      aba<cgx> $$3 = aba.a(hm.P, $$2);
      agg $$4 = ((dr)$$0.getSource()).m().a($$3);
      if ($$4 == null) {
         throw b.create($$2);
      } else {
         return $$4;
      }
   }
}
