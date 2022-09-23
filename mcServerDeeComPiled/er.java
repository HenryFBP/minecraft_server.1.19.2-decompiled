import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class er<T> implements ArgumentType<er.c<T>> {
   private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
   final aba<? extends hm<T>> b;

   public er(aba<? extends hm<T>> $$0) {
      this.b = $$0;
   }

   public static <T> er<T> a(aba<? extends hm<T>> $$0) {
      return new er<>($$0);
   }

   public static <T> er.c<T> a(CommandContext<dr> $$0, String $$1, aba<hm<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
      er.c<?> $$4 = (er.c)$$0.getArgument($$1, er.c.class);
      Optional<er.c<T>> $$5 = $$4.a($$2);
      return (er.c<T>)$$5.orElseThrow(() -> $$3.create($$4));
   }

   public er.c<T> a(StringReader $$0) throws CommandSyntaxException {
      if ($$0.canRead() && $$0.peek() == '#') {
         int $$1 = $$0.getCursor();

         try {
            $$0.skip();
            abb $$2 = abb.a($$0);
            return new er.d<>(akz.a(this.b, $$2));
         } catch (CommandSyntaxException var4) {
            $$0.setCursor($$1);
            throw var4;
         }
      } else {
         abb $$4 = abb.a($$0);
         return new er.b<>(aba.a(this.b, $$4));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      Object var4 = $$0.getSource();
      return var4 instanceof dt $$2 ? $$2.a(this.b, dt.a.c, $$1, $$0) : $$1.buildFuture();
   }

   public Collection<String> getExamples() {
      return a;
   }

   public static class a<T> implements gf<er<T>, er.a<T>.a> {
      public void a(er.a<T>.a $$0, qx $$1) {
         $$1.a($$0.b.a());
      }

      public er.a<T>.a a(qx $$0) {
         abb $$1 = $$0.r();
         return new er.a.a(aba.a($$1));
      }

      public void a(er.a<T>.a $$0, JsonObject $$1) {
         $$1.addProperty("registry", $$0.b.a().toString());
      }

      public er.a<T>.a a(er<T> $$0) {
         return new er.a.a($$0.b);
      }

      public final class a implements gf.a<er<T>> {
         final aba<? extends hm<T>> b;

         a(aba<? extends hm<T>> $$1) {
            this.b = $$1;
         }

         public er<T> a(dl $$0) {
            return new er<>(this.b);
         }

         @Override
         public gf<er<T>, ?> a() {
            return a.this;
         }
      }
   }

   static record b<T>(aba<T> a) implements er.c<T> {
      @Override
      public Either<aba<T>, akz<T>> a() {
         return Either.left(this.a);
      }

      @Override
      public <E> Optional<er.c<E>> a(aba<? extends hm<E>> $$0) {
         return this.a.c($$0).map(er.b::new);
      }

      public boolean a(hc<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return this.a.a().toString();
      }

      public aba<T> c() {
         return this.a;
      }
   }

   public interface c<T> extends Predicate<hc<T>> {
      Either<aba<T>, akz<T>> a();

      <E> Optional<er.c<E>> a(aba<? extends hm<E>> var1);

      String b();
   }

   static record d<T>(akz<T> a) implements er.c<T> {
      @Override
      public Either<aba<T>, akz<T>> a() {
         return Either.right(this.a);
      }

      @Override
      public <E> Optional<er.c<E>> a(aba<? extends hm<E>> $$0) {
         return this.a.d($$0).map(er.d::new);
      }

      public boolean a(hc<T> $$0) {
         return $$0.a(this.a);
      }

      @Override
      public String b() {
         return "#" + this.a.b();
      }

      public akz<T> c() {
         return this.a;
      }
   }
}
