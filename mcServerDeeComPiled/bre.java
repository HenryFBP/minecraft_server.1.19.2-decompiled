import java.util.EnumSet;
import javax.annotation.Nullable;

public class bre extends bsj implements bru {
   public static final float b = 0.03F;
   boolean ca;
   protected final ble c;
   protected final blb d;

   public bre(bbr<? extends bre> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 1.0F;
      this.bP = new bre.d(this);
      this.a(dqh.j, 0.0F);
      this.c = new ble(this, $$1);
      this.d = new blb(this, $$1);
   }

   @Override
   protected void n() {
      this.bS.a(1, new bre.c(this, 1.0));
      this.bS.a(2, new bre.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new bre.a(this, 1.0, false));
      this.bS.a(5, new bre.b(this, 1.0));
      this.bS.a(6, new bre.e(this, 1.0, this.s.m_()));
      this.bS.a(7, new bjl(this, 1.0));
      this.bT.a(1, new bkg(this, bre.class).a(bsl.class));
      this.bT.a(2, new bkh(this, buc.class, 10, true, false, this::k));
      this.bT.a(3, new bkh(this, btk.class, false));
      this.bT.a(3, new bkh(this, bnq.class, true));
      this.bT.a(3, new bkh(this, bol.class, true, false));
      this.bT.a(5, new bkh(this, bof.class, 10, true, false, bof.bY));
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bbs.b).b() && $$0.r_().i() < 0.03F) {
         this.a(bbs.b, new cax(caz.tK));
         this.e(bbs.b);
      }

      return $$3;
   }

   public static boolean a(bbr<bre> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      if (!$$1.b_($$3.c()).a(akp.a)) {
         return false;
      } else {
         hc<cht> $$5 = $$1.w($$3);
         boolean $$6 = $$1.ag() != bag.a && a($$1, $$3, $$4) && ($$2 == bcg.c || $$1.b_($$3).a(akp.a));
         if ($$5.a(akk.ak)) {
            return $$4.a(15) == 0 && $$6;
         } else {
            return $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cgy $$0, gt $$1) {
      return $$1.v() < $$0.m_() - 5;
   }

   @Override
   protected boolean q() {
      return false;
   }

   @Override
   protected ajv r() {
      return this.aR() ? ajw.eY : ajw.eX;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.aR() ? ajw.fc : ajw.fb;
   }

   @Override
   protected ajv x_() {
      return this.aR() ? ajw.fa : ajw.eZ;
   }

   @Override
   protected ajv t() {
      return ajw.fe;
   }

   @Override
   protected ajv aG() {
      return ajw.ff;
   }

   @Override
   protected cax fJ() {
      return cax.b;
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bbs.a, new cax(caz.tI));
         } else {
            this.a(bbs.a, new cax(caz.pe));
         }
      }

   }

   @Override
   protected boolean a(cax $$0, cax $$1) {
      if ($$1.a(caz.tK)) {
         return false;
      } else if ($$1.a(caz.tI)) {
         if ($$0.a(caz.tI)) {
            return $$0.j() < $$1.j();
         } else {
            return false;
         }
      } else {
         return $$0.a(caz.tI) ? true : super.a($$0, $$1);
      }
   }

   @Override
   protected boolean fK() {
      return false;
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this);
   }

   public boolean k(@Nullable bcc $$0) {
      if ($$0 != null) {
         return !this.s.M() || $$0.aR();
      } else {
         return false;
      }
   }

   @Override
   public boolean cr() {
      return !this.bS();
   }

   boolean fT() {
      if (this.ca) {
         return true;
      } else {
         bcc $$0 = this.G();
         return $$0 != null && $$0.aR();
      }
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR() && this.fT()) {
         this.a(0.01F, $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
      } else {
         super.g($$0);
      }

   }

   @Override
   public void aX() {
      if (!this.s.y) {
         if (this.eP() && this.aR() && this.fT()) {
            this.bR = this.c;
            this.h(true);
         } else {
            this.bR = this.d;
            this.h(false);
         }
      }

   }

   protected boolean fL() {
      dql $$0 = this.D().j();
      if ($$0 != null) {
         gt $$1 = $$0.m();
         if ($$1 != null) {
            double $$2 = this.h((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bcc $$0, float $$1) {
      bvg $$2 = new bvg(this.s, this, new cax(caz.tI));
      double $$3 = $$0.df() - this.df();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dh();
      double $$5 = $$0.dl() - this.dl();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.s.ag().a() * 4));
      this.a(ajw.fd, 1.0F, 1.0F / (this.dQ().i() * 0.4F + 0.8F));
      this.s.b($$2);
   }

   public void v(boolean $$0) {
      this.ca = $$0;
   }

   static class a extends bkd {
      private final bre b;

      public a(bre $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.k(this.b.G());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.k(this.b.G());
      }
   }

   static class b extends bjc {
      private final bre g;

      public b(bre $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.s.M() && this.g.aR() && this.g.dh() >= (double)(this.g.s.m_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         gt $$2 = $$1.b();
         return $$0.x($$2) && $$0.x($$2.b()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.v(false);
         this.g.bR = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bip {
      private final bcl a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cgx f;

      public c(bcl $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.s;
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.M()) {
            return false;
         } else if (this.a.aR()) {
            return false;
         } else {
            dwq $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.D().l();
      }

      @Override
      public void c() {
         this.a.D().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private dwq h() {
         amn $$0 = this.a.dQ();
         gt $$1 = this.a.da();

         for(int $$2 = 0; $$2 < 10; ++$$2) {
            gt $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cju.C)) {
               return dwq.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bhs {
      private final bre l;

      public d(bre $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bcc $$0 = this.l.G();
         if (this.l.fT() && this.l.aR()) {
            if ($$0 != null && $$0.dh() > this.l.dh() || this.l.ca) {
               this.l.f(this.l.dd().b(0.0, 0.002, 0.0));
            }

            if (this.k != bhs.a.b || this.l.D().l()) {
               this.l.r(0.0F);
               return;
            }

            double $$1 = this.e - this.l.df();
            double $$2 = this.f - this.l.dh();
            double $$3 = this.g - this.l.dl();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(ami.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.o(this.a(this.l.dq(), $$5, 90.0F));
            this.l.aX = this.l.dq();
            float $$6 = (float)(this.h * this.l.b(bdd.d));
            float $$7 = ami.i(0.125F, this.l.eK(), $$6);
            this.l.r($$7);
            this.l.f(this.l.dd().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.y) {
               this.l.f(this.l.dd().b(0.0, -0.008, 0.0));
            }

            super.a();
         }

      }
   }

   static class e extends bip {
      private final bre a;
      private final double b;
      private final int c;
      private boolean d;

      public e(bre $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.s.M() && this.a.aR() && this.a.dh() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dh() < (double)(this.c - 1) && (this.a.D().l() || this.a.fL())) {
            dwq $$0 = bmj.a(this.a, 4, 8, new dwq(this.a.df(), (double)(this.c - 1), this.a.dl()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.D().a($$0.c, $$0.d, $$0.e, this.b);
         }

      }

      @Override
      public void c() {
         this.a.v(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.v(false);
      }
   }

   static class f extends bjn {
      private final bre a;

      public f(bru $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (bre)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.ez().a(caz.tI);
      }

      @Override
      public void c() {
         super.c();
         this.a.u(true);
         this.a.c(bai.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.eZ();
         this.a.u(false);
      }
   }
}
