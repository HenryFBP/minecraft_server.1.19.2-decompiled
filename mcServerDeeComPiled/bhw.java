import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bhw<T extends bcc> extends bip {
   protected final bcl a;
   private final double i;
   private final double j;
   @Nullable
   protected T b;
   protected final float c;
   @Nullable
   protected dql d;
   protected final blc e;
   protected final Class<T> f;
   protected final Predicate<bcc> g;
   protected final Predicate<bcc> h;
   private final bmf k;

   public bhw(bcl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, bbq.e::test);
   }

   public bhw(bcl $$0, Class<T> $$1, Predicate<bcc> $$2, float $$3, double $$4, double $$5, Predicate<bcc> $$6) {
      this.a = $$0;
      this.f = $$1;
      this.g = $$2;
      this.c = $$3;
      this.i = $$4;
      this.j = $$5;
      this.h = $$6;
      this.e = $$0.D();
      this.a(EnumSet.of(bip.a.a));
      this.k = bmf.a().a((double)$$3).a($$6.and($$2));
   }

   public bhw(bcl $$0, Class<T> $$1, float $$2, double $$3, double $$4, Predicate<bcc> $$5) {
      this($$0, $$1, $$0x -> true, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a() {
      this.b = this.a
         .s
         .a(this.a.s.a(this.f, this.a.cy().c((double)this.c, 3.0, (double)this.c), $$0x -> true), this.k, this.a, this.a.df(), this.a.dh(), this.a.dl());
      if (this.b == null) {
         return false;
      } else {
         dwq $$0 = bmj.a(this.a, 16, 7, this.b.cY());
         if ($$0 == null) {
            return false;
         } else if (this.b.h($$0.c, $$0.d, $$0.e) < this.b.f(this.a)) {
            return false;
         } else {
            this.d = this.e.a($$0.c, $$0.d, $$0.e, 0);
            return this.d != null;
         }
      }
   }

   @Override
   public boolean b() {
      return !this.e.l();
   }

   @Override
   public void c() {
      this.e.a(this.d, this.i);
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public void e() {
      if (this.a.f(this.b) < 49.0) {
         this.a.D().a(this.j);
      } else {
         this.a.D().a(this.i);
      }

   }
}
