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

public class fi implements ArgumentType<fj> {
   private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.pos2d.incomplete"));

   public static fi a() {
      return new fi();
   }

   public static afx a(CommandContext<dr> $$0, String $$1) {
      gt $$2 = ((fj)$$0.getArgument($$1, fj.class)).c((dr)$$0.getSource());
      return new afx($$2.u(), $$2.w());
   }

   public fj a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      if (!$$0.canRead()) {
         throw a.createWithContext($$0);
      } else {
         fp $$2 = fp.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            fp $$3 = fp.a($$0);
            return new fq($$2, new fp(true, 0.0), $$3);
         } else {
            $$0.setCursor($$1);
            throw a.createWithContext($$0);
         }
      }
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

         return dt.b($$2, $$3, $$1, ds.a(this::a));
      }
   }

   public Collection<String> getExamples() {
      return b;
   }
}
