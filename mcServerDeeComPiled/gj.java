import com.google.common.collect.Maps;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class gj {
   private static final Map<abb, SuggestionProvider<dt>> e = Maps.newHashMap();
   private static final abb f = new abb("ask_server");
   public static final SuggestionProvider<dt> a = a(f, ($$0, $$1) -> ((dt)$$0.getSource()).a($$0));
   public static final SuggestionProvider<dr> b = a(new abb("all_recipes"), ($$0, $$1) -> dt.a(((dt)$$0.getSource()).t(), $$1));
   public static final SuggestionProvider<dr> c = a(new abb("available_sounds"), ($$0, $$1) -> dt.a(((dt)$$0.getSource()).s(), $$1));
   public static final SuggestionProvider<dr> d = a(
      new abb("summonable_entities"), ($$0, $$1) -> dt.a(hm.X.r().filter(bbr::c), $$1, bbr::a, $$0x -> rq.c(ad.a("entity", bbr.a($$0x))))
   );

   public static <S extends dt> SuggestionProvider<S> a(abb $$0, SuggestionProvider<dt> $$1) {
      if (e.containsKey($$0)) {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + $$0);
      } else {
         e.put($$0, $$1);
         return new gj.a($$0, $$1);
      }
   }

   public static SuggestionProvider<dt> a(abb $$0) {
      return (SuggestionProvider<dt>)e.getOrDefault($$0, a);
   }

   public static abb a(SuggestionProvider<dt> $$0) {
      return $$0 instanceof gj.a ? ((gj.a)$$0).b : f;
   }

   public static SuggestionProvider<dt> b(SuggestionProvider<dt> $$0) {
      return $$0 instanceof gj.a ? $$0 : a;
   }

   protected static class a implements SuggestionProvider<dt> {
      private final SuggestionProvider<dt> a;
      final abb b;

      public a(abb $$0, SuggestionProvider<dt> $$1) {
         this.a = $$1;
         this.b = $$0;
      }

      public CompletableFuture<Suggestions> getSuggestions(CommandContext<dt> $$0, SuggestionsBuilder $$1) throws CommandSyntaxException {
         return this.a.getSuggestions($$0, $$1);
      }
   }
}
