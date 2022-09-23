import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Triple;

public final class i {
   private final d a;
   private boolean b;
   @Nullable
   private k c;
   @Nullable
   private g d;
   @Nullable
   private k e;
   @Nullable
   private g f;
   private static final i g = ad.a((Supplier<i>)(() -> {
      d $$0 = new d();
      $$0.b();
      i $$1 = new i($$0);
      $$1.e();
      return $$1;
   }));

   public i(@Nullable d $$0) {
      if ($$0 == null) {
         this.a = g.a;
      } else {
         this.a = $$0;
      }

   }

   public i(@Nullable k $$0, @Nullable g $$1, @Nullable k $$2, @Nullable g $$3) {
      this.a = a($$0, $$1, $$2, $$3);
      this.c = $$0 != null ? $$0 : new k();
      this.d = $$1 != null ? $$1 : g.a.k();
      this.e = $$2 != null ? $$2 : new k(1.0F, 1.0F, 1.0F);
      this.f = $$3 != null ? $$3 : g.a.k();
      this.b = true;
   }

   public static i a() {
      return g;
   }

   public i a(i $$0) {
      d $$1 = this.c();
      $$1.b($$0.c());
      return new i($$1);
   }

   @Nullable
   public i b() {
      if (this == g) {
         return this;
      } else {
         d $$0 = this.c();
         return $$0.f() ? new i($$0) : null;
      }
   }

   private void h() {
      if (!this.b) {
         Pair<c, k> $$0 = a(this.a);
         Triple<g, k, g> $$1 = ((c)$$0.getFirst()).b();
         this.c = (k)$$0.getSecond();
         this.d = (g)$$1.getLeft();
         this.e = (k)$$1.getMiddle();
         this.f = (g)$$1.getRight();
         this.b = true;
      }

   }

   private static d a(@Nullable k $$0, @Nullable g $$1, @Nullable k $$2, @Nullable g $$3) {
      d $$4 = new d();
      $$4.b();
      if ($$1 != null) {
         $$4.b(new d($$1));
      }

      if ($$2 != null) {
         $$4.b(d.b($$2.a(), $$2.b(), $$2.c()));
      }

      if ($$3 != null) {
         $$4.b(new d($$3));
      }

      if ($$0 != null) {
         $$4.d = $$0.a();
         $$4.h = $$0.b();
         $$4.l = $$0.c();
      }

      return $$4;
   }

   public static Pair<c, k> a(d $$0) {
      $$0.a(1.0F / $$0.p);
      k $$1 = new k($$0.d, $$0.h, $$0.l);
      c $$2 = new c($$0);
      return Pair.of($$2, $$1);
   }

   public d c() {
      return this.a.h();
   }

   public k d() {
      this.h();
      return this.c.e();
   }

   public g e() {
      this.h();
      return this.d.k();
   }

   public k f() {
      this.h();
      return this.e.e();
   }

   public g g() {
      this.h();
      return this.f.k();
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         i $$1 = (i)$$0;
         return Objects.equals(this.a, $$1.a);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.a});
   }

   public i a(i $$0, float $$1) {
      k $$2 = this.d();
      g $$3 = this.e();
      k $$4 = this.f();
      g $$5 = this.g();
      $$2.a($$0.d(), $$1);
      $$3.a($$0.e(), $$1);
      $$4.a($$0.f(), $$1);
      $$5.a($$0.g(), $$1);
      return new i($$2, $$3, $$4, $$5);
   }
}
