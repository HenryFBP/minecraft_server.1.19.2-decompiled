import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bof extends bne {
   private static final aaj<gt> ca = aam.a(bof.class, aal.l);
   private static final aaj<Boolean> cb = aam.a(bof.class, aal.i);
   private static final aaj<Boolean> cc = aam.a(bof.class, aal.i);
   private static final aaj<gt> cd = aam.a(bof.class, aal.l);
   private static final aaj<Boolean> ce = aam.a(bof.class, aal.i);
   private static final aaj<Boolean> cf = aam.a(bof.class, aal.i);
   public static final cdm bX = cdm.a(cju.bj.l());
   int cg;
   public static final Predicate<bcc> bY = $$0 -> $$0.y_() && !$$0.aR();

   public bof(bbr<? extends bof> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.j, 0.0F);
      this.a(dqh.v, -1.0F);
      this.a(dqh.u, -1.0F);
      this.a(dqh.t, -1.0F);
      this.bP = new bof.e(this);
      this.P = 1.0F;
   }

   public void g(gt $$0) {
      this.Y.b(ca, $$0);
   }

   gt fK() {
      return this.Y.a(ca);
   }

   void h(gt $$0) {
      this.Y.b(cd, $$0);
   }

   gt fL() {
      return this.Y.a(cd);
   }

   public boolean q() {
      return this.Y.a(cb);
   }

   void v(boolean $$0) {
      this.Y.b(cb, $$0);
   }

   public boolean t() {
      return this.Y.a(cc);
   }

   void w(boolean $$0) {
      this.cg = $$0 ? 1 : 0;
      this.Y.b(cc, $$0);
   }

   boolean fR() {
      return this.Y.a(ce);
   }

   void x(boolean $$0) {
      this.Y.b(ce, $$0);
   }

   boolean fS() {
      return this.Y.a(cf);
   }

   void y(boolean $$0) {
      this.Y.b(cf, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ca, gt.b);
      this.Y.a(cb, false);
      this.Y.a(cd, gt.b);
      this.Y.a(ce, false);
      this.Y.a(cf, false);
      this.Y.a(cc, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.fK().u());
      $$0.a("HomePosY", this.fK().v());
      $$0.a("HomePosZ", this.fK().w());
      $$0.a("HasEgg", this.q());
      $$0.a("TravelPosX", this.fL().u());
      $$0.a("TravelPosY", this.fL().v());
      $$0.a("TravelPosZ", this.fL().w());
   }

   @Override
   public void a(pj $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.g(new gt($$1, $$2, $$3));
      super.a($$0);
      this.v($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.h(new gt($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.g(this.da());
      this.h(gt.b);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bbr<bof> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$3.v() < $$1.m_() + 4 && crz.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bof.f(this, 1.2));
      this.bS.a(1, new bof.a(this, 1.0));
      this.bS.a(1, new bof.d(this, 1.0));
      this.bS.a(2, new bjw(this, 1.1, bX, false));
      this.bS.a(3, new bof.c(this, 1.0));
      this.bS.a(4, new bof.b(this, 1.0));
      this.bS.a(7, new bof.i(this, 1.0));
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(9, new bof.h(this, 1.0, 100));
   }

   public static bdc.a fJ() {
      return bce.w().a(bdd.a, 30.0).a(bdd.d, 0.25);
   }

   @Override
   public boolean cr() {
      return false;
   }

   @Override
   public boolean dB() {
      return true;
   }

   @Override
   public bch ey() {
      return bch.e;
   }

   @Override
   public int J() {
      return 200;
   }

   @Nullable
   @Override
   protected ajv r() {
      return !this.aR() && this.y && !this.y_() ? ajw.vg : super.r();
   }

   @Override
   protected void d(float $$0) {
      super.d($$0 * 1.5F);
   }

   @Override
   protected ajv aG() {
      return ajw.vr;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return this.y_() ? ajw.vn : ajw.vm;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return this.y_() ? ajw.vi : ajw.vh;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      ajv $$2 = this.y_() ? ajw.vq : ajw.vp;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean fM() {
      return super.fM() && !this.q();
   }

   @Override
   protected float aF() {
      return this.J + 0.15F;
   }

   @Override
   public float dJ() {
      return this.y_() ? 0.3F : 1.0F;
   }

   @Override
   protected blc a(cgx $$0) {
      return new bof.g(this, $$0);
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return bbr.aX.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(cju.bj.l());
   }

   @Override
   public float a(gt $$0, cha $$1) {
      if (!this.fR() && $$1.b_($$0).a(akp.a)) {
         return 10.0F;
      } else {
         return crz.a($$1, $$0) ? 10.0F : $$1.z($$0);
      }
   }

   @Override
   public void w_() {
      super.w_();
      if (this.bo() && this.t() && this.cg >= 1 && this.cg % 5 == 0) {
         gt $$0 = this.da();
         if (crz.a(this.s, $$0)) {
            this.s.c(2001, $$0, cjt.i(this.s.a_($$0.c())));
         }
      }

   }

   @Override
   protected void n() {
      super.n();
      if (!this.y_() && this.s.W().b(cgt.f)) {
         this.a(caz.mN, 1);
      }

   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(0.1F, $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
         if (this.G() == null && (!this.fR() || !this.fK().a(this.cY(), 20.0))) {
            this.f(this.dd().b(0.0, -0.005, 0.0));
         }
      } else {
         super.g($$0);
      }

   }

   @Override
   public boolean a(buc $$0) {
      return false;
   }

   @Override
   public void a(agg $$0, bcb $$1) {
      this.a(baw.b, Float.MAX_VALUE);
   }

   static class a extends bib {
      private final bof d;

      a(bof $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.q();
      }

      @Override
      protected void g() {
         agh $$0 = this.a.fO();
         if ($$0 == null && this.c.fO() != null) {
            $$0 = this.c.fO();
         }

         if ($$0 != null) {
            $$0.a(akg.P);
            aj.o.a($$0, this.a, this.c, null);
         }

         this.d.v(true);
         this.a.fQ();
         this.c.fQ();
         amn $$1 = this.a.dQ();
         if (this.b.W().b(cgt.f)) {
            this.b.b(new bbt(this.b, this.a.df(), this.a.dh(), this.a.dl(), $$1.a(7) + 1));
         }

      }
   }

   static class b extends bip {
      private final bof a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(bof $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.y_()) {
            return false;
         } else if (this.a.q()) {
            return true;
         } else if (this.a.dQ().a(b(700)) != 0) {
            return false;
         } else {
            return !this.a.fK().a(this.a.cY(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.x(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.x(false);
      }

      @Override
      public boolean b() {
         return !this.a.fK().a(this.a.cY(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         gt $$0 = this.a.fK();
         boolean $$1 = $$0.a(this.a.cY(), 16.0);
         if ($$1) {
            ++this.d;
         }

         if (this.a.D().l()) {
            dwq $$2 = dwq.c($$0);
            dwq $$3 = bmj.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = bmj.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.s.a_(new gt($$3)).a(cju.C)) {
               $$3 = bmj.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.D().a($$3.c, $$3.d, $$3.e, this.b);
         }

      }
   }

   static class c extends bjc {
      private static final int g = 1200;
      private final bof h;

      c(bof $$0, double $$1) {
         super($$0, $$0.y_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.aR() && this.d <= 1200 && this.a(this.h.s, this.e);
      }

      @Override
      public boolean a() {
         if (this.h.y_() && !this.h.aR()) {
            return super.a();
         } else {
            return !this.h.fR() && !this.h.aR() && !this.h.q() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         return $$0.a_($$1).a(cju.C);
      }
   }

   static class d extends bjc {
      private final bof g;

      d(bof $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.q() && this.g.fK().a(this.g.cY(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.q() && this.g.fK().a(this.g.cY(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         gt $$0 = this.g.da();
         if (!this.g.aR() && this.m()) {
            if (this.g.cg < 1) {
               this.g.w(true);
            } else if (this.g.cg > this.a(200)) {
               cgx $$1 = this.g.s;
               $$1.a(null, $$0, ajw.vo, ajx.e, 0.3F, 0.9F + $$1.w.i() * 0.2F);
               $$1.a(this.e.b(), cju.kR.m().a(crz.e, Integer.valueOf(this.g.R.a(4) + 1)), 3);
               this.g.v(false);
               this.g.w(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               ++this.g.cg;
            }
         }

      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         return !$$0.x($$1.b()) ? false : crz.b($$0, $$1);
      }
   }

   static class e extends bhs {
      private final bof l;

      e(bof $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.aR()) {
            this.l.f(this.l.dd().b(0.0, 0.005, 0.0));
            if (!this.l.fK().a(this.l.cY(), 16.0)) {
               this.l.r(Math.max(this.l.eK() / 2.0F, 0.08F));
            }

            if (this.l.y_()) {
               this.l.r(Math.max(this.l.eK() / 3.0F, 0.06F));
            }
         } else if (this.l.y) {
            this.l.r(Math.max(this.l.eK() / 2.0F, 0.06F));
         }

      }

      @Override
      public void a() {
         this.g();
         if (this.k == bhs.a.b && !this.l.D().l()) {
            double $$0 = this.e - this.l.df();
            double $$1 = this.f - this.l.dh();
            double $$2 = this.g - this.l.dl();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            $$1 /= $$3;
            float $$4 = (float)(ami.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.o(this.a(this.l.dq(), $$4, 90.0F));
            this.l.aX = this.l.dq();
            float $$5 = (float)(this.h * this.l.b(bdd.d));
            this.l.r(ami.i(0.125F, this.l.eK(), $$5));
            this.l.f(this.l.dd().b(0.0, (double)this.l.eK() * $$1 * 0.1, 0.0));
         } else {
            this.l.r(0.0F);
         }
      }
   }

   static class f extends bji {
      f(bof $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            gt $$0 = this.a(this.b.s, this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends bkz {
      g(bof $$0, cgx $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(gt $$0) {
         bce var3 = this.a;
         if (var3 instanceof bof $$1 && $$1.fS()) {
            return this.b.a_($$0).a(cju.C);
         }

         return !this.b.a_($$0.c()).h();
      }
   }

   static class h extends bjl {
      private final bof i;

      h(bof $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.aR() && !this.i.fR() && !this.i.q() ? super.a() : false;
      }
   }

   static class i extends bip {
      private final bof a;
      private final double b;
      private boolean c;

      i(bof $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.fR() && !this.a.q() && this.a.aR();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         amn $$2 = this.a.R;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dh() > (double)(this.a.s.m_() - 1)) {
            $$4 = 0;
         }

         gt $$6 = new gt((double)$$3 + this.a.df(), (double)$$4 + this.a.dh(), (double)$$5 + this.a.dl());
         this.a.h($$6);
         this.a.y(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.D().l()) {
            dwq $$0 = dwq.c(this.a.fL());
            dwq $$1 = bmj.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = bmj.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ami.b($$1.c);
               int $$3 = ami.b($$1.e);
               int $$4 = 34;
               if (!this.a.s.b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.D().a($$1.c, $$1.d, $$1.e, this.b);
         }

      }

      @Override
      public boolean b() {
         return !this.a.D().l() && !this.c && !this.a.fR() && !this.a.fP() && !this.a.q();
      }

      @Override
      public void d() {
         this.a.y(false);
         super.d();
      }
   }
}
