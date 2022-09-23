import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fd implements ArgumentType<fd.b> {
   private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}");
   private final hd<cjt> b;

   public fd(dl $$0) {
      this.b = $$0.a(hm.h);
   }

   public static fd a(dl $$0) {
      return new fd($$0);
   }

   public fd.b a(StringReader $$0) throws CommandSyntaxException {
      return a(this.b, $$0);
   }

   public static fd.b a(hd<cjt> $$0, StringReader $$1) throws CommandSyntaxException {
      return (fd.b)ff.b($$0, $$1, true).map($$0x -> new fd.a($$0x.a(), $$0x.b().keySet(), $$0x.c()), $$0x -> new fd.c($$0x.a(), $$0x.b(), $$0x.c()));
   }

   public static Predicate<cvs> a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return (Predicate<cvs>)$$0.getArgument($$1, fd.b.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return ff.a(this.b, $$1, true, true);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static class a implements fd.b {
      private final cvo a;
      private final Set<cwr<?>> b;
      @Nullable
      private final pj c;

      public a(cvo $$0, Set<cwr<?>> $$1, @Nullable pj $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean a(cvs $$0) {
         cvo $$1 = $$0.a();
         if (!$$1.a(this.a.b())) {
            return false;
         } else {
            for(cwr<?> $$2 : this.b) {
               if ($$1.c($$2) != this.a.c($$2)) {
                  return false;
               }
            }

            if (this.c == null) {
               return true;
            } else {
               cti $$3 = $$0.b();
               return $$3 != null && pv.a(this.c, $$3.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.c != null;
      }
   }

   public interface b extends Predicate<cvs> {
      boolean a();
   }

   static class c implements fd.b {
      private final he<cjt> a;
      @Nullable
      private final pj b;
      private final Map<String, String> c;

      c(he<cjt> $$0, Map<String, String> $$1, @Nullable pj $$2) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
      }

      public boolean a(cvs $$0) {
         cvo $$1 = $$0.a();
         if (!$$1.a(this.a)) {
            return false;
         } else {
            for(Entry<String, String> $$2 : this.c.entrySet()) {
               cwr<?> $$3 = $$1.b().k().a((String)$$2.getKey());
               if ($$3 == null) {
                  return false;
               }

               Comparable<?> $$4 = (Comparable)$$3.b((String)$$2.getValue()).orElse(null);
               if ($$4 == null) {
                  return false;
               }

               if ($$1.c($$3) != $$4) {
                  return false;
               }
            }

            if (this.b == null) {
               return true;
            } else {
               cti $$5 = $$0.b();
               return $$5 != null && pv.a(this.b, $$5.m(), true);
            }
         }
      }

      @Override
      public boolean a() {
         return this.b != null;
      }
   }
}
