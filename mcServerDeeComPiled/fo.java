import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class fo implements ArgumentType<fj> {
   private static final Collection<String> c = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "0.1 -0.5 .9", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.pos3d.incomplete"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.pos.mixed"));
   private final boolean d;

   public fo(boolean $$0) {
      this.d = $$0;
   }

   public static fo a() {
      return new fo(true);
   }

   public static fo a(boolean $$0) {
      return new fo($$0);
   }

   public static dwq a(CommandContext<dr> $$0, String $$1) {
      return ((fj)$$0.getArgument($$1, fj.class)).a((dr)$$0.getSource());
   }

   public static fj b(CommandContext<dr> $$0, String $$1) {
      return (fj)$$0.getArgument($$1, fj.class);
   }

   public fj a(StringReader $$0) throws CommandSyntaxException {
      return (fj)($$0.canRead() && $$0.peek() == '^' ? fk.a($$0) : fq.a($$0, this.d));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      if (!($$0.getSource() instanceof dt)) {
         return Suggestions.empty();
      } else {
         String $$2 = $$1.getRemaining();
         Collection<dt.b> $$3;
         if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
            $$3 = Collections.singleton(dt.b.a);
         } else {
            $$3 = ((dt)$$0.getSource()).z();
         }

         return dt.a($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return c;
   }
}
