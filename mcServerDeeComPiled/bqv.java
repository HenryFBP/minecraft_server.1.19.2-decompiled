import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class bqv extends bbn {
   private static final aaj<cax> c = aam.a(bqv.class, aal.g);
   private static final int d = 6000;
   private static final int e = 32767;
   private static final int f = -32768;
   private int ao;
   private int ap;
   private int aq = 5;
   @Nullable
   private UUID ar;
   @Nullable
   private UUID as;
   public final float b;

   public bqv(bbr<? extends bqv> $$0, cgx $$1) {
      super($$0, $$1);
      this.b = this.R.i() * (float) Math.PI * 2.0F;
      this.o(this.R.i() * 360.0F);
   }

   public bqv(cgx $$0, double $$1, double $$2, double $$3, cax $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$0.w.j() * 0.2 - 0.1, 0.2, $$0.w.j() * 0.2 - 0.1);
   }

   public bqv(cgx $$0, double $$1, double $$2, double $$3, cax $$4, double $$5, double $$6, double $$7) {
      this(bbr.T, $$0);
      this.e($$1, $$2, $$3);
      this.n($$5, $$6, $$7);
      this.a($$4);
   }

   private bqv(bqv $$0) {
      super($$0.ad(), $$0.s);
      this.a($$0.i().o());
      this.s($$0);
      this.ao = $$0.ao;
      this.b = $$0.b;
   }

   @Override
   public boolean aP() {
      return this.i().a(aks.aw);
   }

   public bbn h() {
      return ad.a(this.l(), this.s::b);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   protected void a_() {
      this.ai().a(c, cax.b);
   }

   @Override
   public void k() {
      if (this.i().b()) {
         this.ah();
      } else {
         super.k();
         if (this.ap > 0 && this.ap != 32767) {
            --this.ap;
         }

         this.t = this.df();
         this.u = this.dh();
         this.v = this.dl();
         dwq $$0 = this.dd();
         float $$1 = this.cA() - 0.11111111F;
         if (this.aR() && this.b(akp.a) > (double)$$1) {
            this.y();
         } else if (this.bf() && this.b(akp.b) > (double)$$1) {
            this.z();
         } else if (!this.aN()) {
            this.f(this.dd().b(0.0, -0.04, 0.0));
         }

         if (this.s.y) {
            this.Q = false;
         } else {
            this.Q = !this.s.a(this, this.cy().h(1.0E-7));
            if (this.Q) {
               this.l(this.df(), (this.cy().b + this.cy().e) / 2.0, this.dl());
            }
         }

         if (!this.y || this.dd().i() > 1.0E-5F || (this.S + this.ae()) % 4 == 0) {
            this.a(bci.a, this.dd());
            float $$2 = 0.98F;
            if (this.y) {
               $$2 = this.s.a_(new gt(this.df(), this.dh() - 1.0, this.dl())).b().h() * 0.98F;
            }

            this.f(this.dd().d((double)$$2, 0.98, (double)$$2));
            if (this.y) {
               dwq $$3 = this.dd();
               if ($$3.d < 0.0) {
                  this.f($$3.d(1.0, -0.5, 1.0));
               }
            }
         }

         boolean $$4 = ami.b(this.t) != ami.b(this.df()) || ami.b(this.u) != ami.b(this.dh()) || ami.b(this.v) != ami.b(this.dl());
         int $$5 = $$4 ? 2 : 40;
         if (this.S % $$5 == 0 && !this.s.y && this.C()) {
            this.A();
         }

         if (this.ao != -32768) {
            ++this.ao;
         }

         this.af |= this.aY();
         if (!this.s.y) {
            double $$6 = this.dd().d($$0).g();
            if ($$6 > 0.01) {
               this.af = true;
            }
         }

         if (!this.s.y && this.ao >= 6000) {
            this.ah();
         }

      }
   }

   private void y() {
      dwq $$0 = this.dd();
      this.n($$0.c * 0.99F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.99F);
   }

   private void z() {
      dwq $$0 = this.dd();
      this.n($$0.c * 0.95F, $$0.d + (double)($$0.d < 0.06F ? 5.0E-4F : 0.0F), $$0.e * 0.95F);
   }

   private void A() {
      if (this.C()) {
         for(bqv $$1 : this.s.a(bqv.class, this.cy().c(0.5, 0.0, 0.5), $$0 -> $$0 != this && $$0.C())) {
            if ($$1.C()) {
               this.a($$1);
               if (this.dt()) {
                  break;
               }
            }
         }

      }
   }

   private boolean C() {
      cax $$0 = this.i();
      return this.bo() && this.ap != 32767 && this.ao != -32768 && this.ao < 6000 && $$0.K() < $$0.f();
   }

   private void a(bqv $$0) {
      cax $$1 = this.i();
      cax $$2 = $$0.i();
      if (Objects.equals(this.j(), $$0.j()) && a($$1, $$2)) {
         if ($$2.K() < $$1.K()) {
            a(this, $$1, $$0, $$2);
         } else {
            a($$0, $$2, this, $$1);
         }

      }
   }

   public static boolean a(cax $$0, cax $$1) {
      if (!$$1.a($$0.c())) {
         return false;
      } else if ($$1.K() + $$0.K() > $$1.f()) {
         return false;
      } else if ($$1.t() ^ $$0.t()) {
         return false;
      } else {
         return !$$1.t() || $$1.u().equals($$0.u());
      }
   }

   public static cax a(cax $$0, cax $$1, int $$2) {
      int $$3 = Math.min(Math.min($$0.f(), $$2) - $$0.K(), $$1.K());
      cax $$4 = $$0.o();
      $$4.f($$3);
      $$1.g($$3);
      return $$4;
   }

   private static void a(bqv $$0, cax $$1, cax $$2) {
      cax $$3 = a($$1, $$2, 64);
      $$0.a($$3);
   }

   private static void a(bqv $$0, cax $$1, bqv $$2, cax $$3) {
      a($$0, $$1, $$3);
      $$0.ap = Math.max($$0.ap, $$2.ap);
      $$0.ao = Math.min($$0.ao, $$2.ao);
      if ($$3.b()) {
         $$2.ah();
      }

   }

   @Override
   public boolean aQ() {
      return this.i().c().x() || super.aQ();
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.i().b() && this.i().a(caz.so) && $$0.d()) {
         return false;
      } else if (!this.i().c().a($$0)) {
         return false;
      } else if (this.s.y) {
         return true;
      } else {
         this.bi();
         this.aq = (int)((float)this.aq - $$1);
         this.a(czv.p, $$0.m());
         if (this.aq <= 0) {
            this.i().a(this);
            this.ah();
         }

         return true;
      }
   }

   @Override
   public void b(pj $$0) {
      $$0.a("Health", (short)this.aq);
      $$0.a("Age", (short)this.ao);
      $$0.a("PickupDelay", (short)this.ap);
      if (this.l() != null) {
         $$0.a("Thrower", this.l());
      }

      if (this.j() != null) {
         $$0.a("Owner", this.j());
      }

      if (!this.i().b()) {
         $$0.a("Item", (qc)this.i().b(new pj()));
      }

   }

   @Override
   public void a(pj $$0) {
      this.aq = $$0.g("Health");
      this.ao = $$0.g("Age");
      if ($$0.e("PickupDelay")) {
         this.ap = $$0.g("PickupDelay");
      }

      if ($$0.b("Owner")) {
         this.as = $$0.a("Owner");
      }

      if ($$0.b("Thrower")) {
         this.ar = $$0.a("Thrower");
      }

      pj $$1 = $$0.p("Item");
      this.a(cax.a($$1));
      if (this.i().b()) {
         this.ah();
      }

   }

   @Override
   public void b_(buc $$0) {
      if (!this.s.y) {
         cax $$1 = this.i();
         cat $$2 = $$1.c();
         int $$3 = $$1.K();
         if (this.ap == 0 && (this.as == null || this.as.equals($$0.co())) && $$0.fA().e($$1)) {
            $$0.a(this, $$3);
            if ($$1.b()) {
               this.ah();
               $$1.e($$3);
            }

            $$0.a(akg.e.b($$2), $$3);
            $$0.a(this);
         }

      }
   }

   @Override
   public rq X() {
      rq $$0 = this.Z();
      return (rq)($$0 != null ? $$0 : rq.c(this.i().p()));
   }

   @Override
   public boolean ch() {
      return false;
   }

   @Nullable
   @Override
   public bbn b(agg $$0) {
      bbn $$1 = super.b($$0);
      if (!this.s.y && $$1 instanceof bqv) {
         ((bqv)$$1).A();
      }

      return $$1;
   }

   public cax i() {
      return this.ai().a(c);
   }

   public void a(cax $$0) {
      this.ai().b(c, $$0);
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (c.equals($$0)) {
         this.i().a((bbn)this);
      }

   }

   @Nullable
   public UUID j() {
      return this.as;
   }

   public void b(@Nullable UUID $$0) {
      this.as = $$0;
   }

   @Nullable
   public UUID l() {
      return this.ar;
   }

   public void c(@Nullable UUID $$0) {
      this.ar = $$0;
   }

   public int n() {
      return this.ao;
   }

   public void o() {
      this.ap = 10;
   }

   public void q() {
      this.ap = 0;
   }

   public void r() {
      this.ap = 32767;
   }

   public void a(int $$0) {
      this.ap = $$0;
   }

   public boolean s() {
      return this.ap > 0;
   }

   public void t() {
      this.ao = -32768;
   }

   public void u() {
      this.ao = -6000;
   }

   public void w() {
      this.r();
      this.ao = 5999;
   }

   public float a(float $$0) {
      return ((float)this.n() + $$0) / 20.0F + this.b;
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   public bqv x() {
      return new bqv(this);
   }

   @Override
   public ajx cR() {
      return ajx.i;
   }

   @Override
   public float dr() {
      return 180.0F - this.a(0.5F) / (float) (Math.PI * 2) * 360.0F;
   }
}
