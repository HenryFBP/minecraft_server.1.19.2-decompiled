import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fa implements ArgumentType<Integer> {
   private static final Collection<String> a = Arrays.asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.time.invalid_unit"));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> rq.a("argument.time.invalid_tick_count", $$0));
   private static final Object2IntMap<String> d = new Object2IntOpenHashMap();

   public static fa a() {
      return new fa();
   }

   public Integer a(StringReader $$0) throws CommandSyntaxException {
      float $$1 = $$0.readFloat();
      String $$2 = $$0.readUnquotedString();
      int $$3 = d.getOrDefault($$2, 0);
      if ($$3 == 0) {
         throw b.create();
      } else {
         int $$4 = Math.round($$1 * (float)$$3);
         if ($$4 < 0) {
            throw c.create($$4);
         } else {
            return $$4;
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      StringReader $$2 = new StringReader($$1.getRemaining());

      try {
         $$2.readFloat();
      } catch (CommandSyntaxException var5) {
         return $$1.buildFuture();
      }

      return dt.b(d.keySet(), $$1.createOffset($$1.getStart() + $$2.getCursor()));
   }

   public Collection<String> getExamples() {
      return a;
   }

   static {
      d.put("d", 24000);
      d.put("s", 20);
      d.put("t", 1);
      d.put("", 1);
   }
}
