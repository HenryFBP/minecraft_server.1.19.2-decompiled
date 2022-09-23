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

public class fh implements ArgumentType<fj> {
   private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.pos.unloaded"));
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.pos.outofworld"));
   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(rq.c("argument.pos.outofbounds"));

   public static fh a() {
      return new fh();
   }

   public static gt a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      gt $$2 = ((fj)$$0.getArgument($$1, fj.class)).c((dr)$$0.getSource());
      if (!((dr)$$0.getSource()).f().E($$2)) {
         throw a.create();
      } else if (!((dr)$$0.getSource()).f().j($$2)) {
         throw b.create();
      } else {
         return $$2;
      }
   }

   public static gt b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      gt $$2 = ((fj)$$0.getArgument($$1, fj.class)).c((dr)$$0.getSource());
      if (!cgx.k($$2)) {
         throw c.create();
      } else {
         return $$2;
      }
   }

   public fj a(StringReader $$0) throws CommandSyntaxException {
      return (fj)($$0.canRead() && $$0.peek() == '^' ? fk.a($$0) : fq.a($$0));
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
            $$3 = ((dt)$$0.getSource()).y();
         }

         return dt.a($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return d;
   }
}
