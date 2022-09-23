import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class brr extends brq {
   @Nullable
   private gt b;
   private boolean c;
   private boolean d;

   protected brr(bbr<? extends brr> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(4, new brr.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", (qc)pv.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = pv.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   @Override
   public double bs() {
      return -0.45;
   }

   public boolean fK() {
      return true;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$2 != bcg.p && $$2 != bcg.h && $$2 != bcg.d && $$0.r_().i() < 0.06F && this.fK()) {
         this.c = true;
      }

      if (this.fP()) {
         this.a(bbs.f, bvj.s());
         this.a(bbs.f, 2.0F);
      }

      if ($$2 == bcg.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bbr<? extends brr> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a(chg.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void g(gt $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gt fL() {
      return this.b;
   }

   public boolean fM() {
      return this.b != null;
   }

   public void v(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean fP() {
      return this.c;
   }

   public boolean fQ() {
      return true;
   }

   public void fR() {
      this.b = this.da().b(-500 + this.R.a(1000), 0, -500 + this.R.a(1000));
      this.d = true;
   }

   protected boolean fS() {
      return this.d;
   }

   protected void w(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends brr> extends bip {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.s.U() < this.e;
         return this.b.fS() && this.b.G() == null && !this.b.bJ() && this.b.fM() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.fP();
         blc $$1 = this.b.D();
         if ($$1.l()) {
            List<brr> $$2 = this.h();
            if (this.b.fS() && $$2.isEmpty()) {
               this.b.w(false);
            } else if ($$0 && this.b.fL().a(this.b.cY(), 10.0)) {
               this.b.fR();
            } else {
               dwq $$3 = dwq.c(this.b.fL());
               dwq $$4 = this.b.cY();
               dwq $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               dwq $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gt $$7 = new gt($$6);
               $$7 = this.b.s.a(dar.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.s.U() + 200L;
               } else if ($$0) {
                  for(brr $$8 : $$2) {
                     $$8.g($$7);
                  }
               }
            }
         }

      }

      private List<brr> h() {
         return this.b.s.a(brr.class, this.b.cy().g(16.0), $$0 -> $$0.fQ() && !$$0.q(this.b));
      }

      private boolean i() {
         amn $$0 = this.b.dQ();
         gt $$1 = this.b.s.a(dar.a.f, this.b.da().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.D().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
