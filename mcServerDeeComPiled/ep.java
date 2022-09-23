import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ep<T> implements ArgumentType<aba<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("attribute.unknown", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> rq.a("commands.place.feature.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> rq.a("commands.place.structure.invalid", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> rq.a("commands.place.jigsaw.invalid", $$0));
   final aba<? extends hm<T>> f;

   public ep(aba<? extends hm<T>> $$0) {
      this.f = $$0;
   }

   public static <T> ep<T> a(aba<? extends hm<T>> $$0) {
      return new ep<>($$0);
   }

   private static <T> aba<T> a(CommandContext<dr> $$0, String $$1, aba<hm<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aba<?> $$4 = (aba)$$0.getArgument($$1, aba.class);
      Optional<aba<T>> $$5 = $$4.c($$2);
      return (aba<T>)$$5.orElseThrow(() -> $$3.create($$4));
   }

   private static <T> hm<T> a(CommandContext<dr> $$0, aba<? extends hm<T>> $$1) {
      return ((dr)$$0.getSource()).m().aX().d($$1);
   }

   private static <T> hc<T> b(CommandContext<dr> $$0, String $$1, aba<hm<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      aba<T> $$4 = a($$0, $$1, $$2, $$3);
      return (hc<T>)a($$0, $$2).b($$4).orElseThrow(() -> $$3.create($$4.a()));
   }

   public static bcy a(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      aba<bcy> $$2 = a($$0, $$1, hm.w, b);
      return (bcy)a($$0, hm.w).f($$2).orElseThrow(() -> b.create($$2.a()));
   }

   public static hc<ddg<?, ?>> b(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, hm.aL, c);
   }

   public static hc<dlb> c(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, hm.aN, d);
   }

   public static hc<dmk> d(CommandContext<dr> $$0, String $$1) throws CommandSyntaxException {
      return b($$0, $$1, hm.aQ, e);
   }

   public aba<T> a(StringReader $$0) throws CommandSyntaxException {
      abb $$1 = abb.a($$0);
      return aba.a(this.f, $$1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Object var4 = $$0.getSource();
      return var4 instanceof dt $$2 ? $$2.a(this.f, dt.a.b, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gf<ep<T>, ep.a<T>.a> {
      public void a(ep.a.a $$0, qx $$1) {
         $$1.a($$0.b.a());
      }

      public ep.a<T>.a a(qx $$0) {
         abb $$1 = $$0.r();
         return new ep.a.a(aba.a($$1));
      }

      public void a(ep.a.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public ep.a<T>.a a(ep<T> $$0) {
         return new ep.a.a($$0.f);
      }

      public final class a implements gf.a<ep<T>> {
         final aba<? extends hm<T>> b;

         a(aba<? extends hm<T>> $$1) {
            this.b = $$1;
         }

         public ep<T> a(dl $$0) {
            return new ep<>(this.b);
         }

         @Override
         public gf<ep<T>, ?> a() {
            return a.this;
         }
      }
   }
}
