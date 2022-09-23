import java.util.EnumSet;
import javax.annotation.Nullable;

public class bjw extends bip {
   private static final bmf c = bmf.b().a(10.0).d();
   private final bmf d;
   protected final bcl a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected buc b;
   private int k;
   private boolean l;
   private final cdm m;
   private final boolean n;

   public bjw(bcl $$0, double $$1, cdm $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         --this.k;
         return false;
      } else {
         this.b = this.a.s.a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bcc $$0) {
      return this.m.a($$0.ez()) || this.m.a($$0.eA());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.f(this.b) < 36.0) {
            if (this.b.h(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.ds() - this.i) > 5.0 || Math.abs((double)this.b.dq() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.df();
            this.g = this.b.dh();
            this.h = this.b.dl();
         }

         this.i = (double)this.b.ds();
         this.j = (double)this.b.dq();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.df();
      this.g = this.b.dh();
      this.h = this.b.dl();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.D().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.z().a(this.b, (float)(this.a.V() + 20), (float)this.a.U());
      if (this.a.f(this.b) < 6.25) {
         this.a.D().n();
      } else {
         this.a.D().a(this.b, this.e);
      }

   }

   public boolean i() {
      return this.l;
   }
}
