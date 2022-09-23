import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

public class fv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(rq.c("argument.item.tag.disallowed"));
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> rq.a("argument.item.id.invalid", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> rq.a("arguments.item.tag.unknown", $$0));
   private static final char d = '{';
   private static final char e = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> f = SuggestionsBuilder::buildFuture;
   private final hd<cat> g;
   private final StringReader h;
   private final boolean i;
   private Either<hc<cat>, he<cat>> j;
   @Nullable
   private pj k;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> l = f;

   private fv(hd<cat> $$0, StringReader $$1, boolean $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
   }

   public static fv.a a(hd<cat> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fv $$3 = new fv($$0, $$1, false);
         $$3.d();
         hc<cat> $$4 = (hc)$$3.j.left().orElseThrow(() -> new IllegalStateException("Parser returned unexpected tag name"));
         return new fv.a($$4, $$3.k);
      } catch (CommandSyntaxException var5) {
         $$1.setCursor($$2);
         throw var5;
      }
   }

   public static Either<fv.a, fv.b> b(hd<cat> $$0, StringReader $$1) throws CommandSyntaxException {
      int $$2 = $$1.getCursor();

      try {
         fv $$3 = new fv($$0, $$1, true);
         $$3.d();
         return $$3.j.mapBoth($$1x -> new fv.a($$1x, $$3.k), $$1x -> new fv.b($$1x, $$3.k));
      } catch (CommandSyntaxException var4) {
         $$1.setCursor($$2);
         throw var4;
      }
   }

   public static CompletableFuture<Suggestions> a(hd<cat> $$0, SuggestionsBuilder $$1, boolean $$2) {
      StringReader $$3 = new StringReader($$1.getInput());
      $$3.setCursor($$1.getStart());
      fv $$4 = new fv($$0, $$3, $$2);

      try {
         $$4.d();
      } catch (CommandSyntaxException var6) {
      }

      return (CompletableFuture<Suggestions>)$$4.l.apply($$1.createOffset($$3.getCursor()));
   }

   private void a() throws CommandSyntaxException {
      int $$0 = this.h.getCursor();
      abb $$1 = abb.a(this.h);
      Optional<hc<cat>> $$2 = this.g.a(aba.a(hm.k, $$1));
      this.j = Either.left((hc)$$2.orElseThrow(() -> {
         this.h.setCursor($$0);
         return b.createWithContext(this.h, $$1);
      }));
   }

   private void b() throws CommandSyntaxException {
      if (!this.i) {
         throw a.createWithContext(this.h);
      } else {
         int $$0 = this.h.getCursor();
         this.h.expect('#');
         this.l = this::b;
         abb $$1 = abb.a(this.h);
         Optional<? extends he<cat>> $$2 = this.g.a(akz.a(hm.k, $$1));
         this.j = Either.right((he)$$2.orElseThrow(() -> {
            this.h.setCursor($$0);
            return c.createWithContext(this.h, $$1);
         }));
      }
   }

   private void c() throws CommandSyntaxException {
      this.k = new qd(this.h).f();
   }

   private void d() throws CommandSyntaxException {
      if (this.i) {
         this.l = this::d;
      } else {
         this.l = this::c;
      }

      if (this.h.canRead() && this.h.peek() == '#') {
         this.b();
      } else {
         this.a();
      }

      this.l = this::a;
      if (this.h.canRead() && this.h.peek() == '{') {
         this.l = f;
         this.c();
      }

   }

   private CompletableFuture<Suggestions> a(SuggestionsBuilder $$0) {
      if ($$0.getRemaining().isEmpty()) {
         $$0.suggest(String.valueOf('{'));
      }

      return $$0.buildFuture();
   }

   private CompletableFuture<Suggestions> b(SuggestionsBuilder $$0) {
      return dt.a(this.g.b().map(akz::b), $$0, String.valueOf('#'));
   }

   private CompletableFuture<Suggestions> c(SuggestionsBuilder $$0) {
      return dt.a(this.g.a().map(aba::a), $$0);
   }

   private CompletableFuture<Suggestions> d(SuggestionsBuilder $$0) {
      this.b($$0);
      return this.c($$0);
   }

   public static record a(hc<cat> a, @Nullable pj b) {
   }

   public static record b(he<cat> a, @Nullable pj b) {
   }
}
