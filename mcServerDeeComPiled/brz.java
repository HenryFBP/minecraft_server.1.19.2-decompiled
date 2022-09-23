import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class brz extends bce implements bri {
   private static final aaj<Integer> bX = aam.a(brz.class, aal.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bW;
   private boolean bY;

   public brz(bbr<? extends brz> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new brz.d(this);
   }

   @Override
   protected void u() {
      this.bS.a(1, new brz.b(this));
      this.bS.a(2, new brz.a(this));
      this.bS.a(3, new brz.e(this));
      this.bS.a(5, new brz.c(this));
      this.bT.a(1, new bkh(this, buc.class, 10, true, false, $$0 -> Math.abs($$0.dh() - this.dh()) <= 4.0));
      this.bT.a(3, new bkh(this, bnq.class, true));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ami.a($$0, 1, 127);
      this.Y.b(bX, $$2);
      this.am();
      this.z_();
      this.a(bdd.a).a((double)($$2 * $$2));
      this.a(bdd.d).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bdd.f).a((double)$$2);
      if ($$1) {
         this.c(this.et());
      }

      this.bN = $$2;
   }

   public int fL() {
      return this.Y.a(bX);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Size", this.fL() - 1);
      $$0.a("wasOnGround", this.bY);
   }

   @Override
   public void a(pj $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bY = $$0.q("wasOnGround");
   }

   public boolean fM() {
      return this.fL() <= 1;
   }

   protected im q() {
      return io.P;
   }

   @Override
   protected boolean Q() {
      return this.fL() > 0;
   }

   @Override
   public void k() {
      this.e += (this.d - this.e) * 0.5F;
      this.bW = this.e;
      super.k();
      if (this.y && !this.bY) {
         int $$0 = this.fL();

         for(int $$1 = 0; $$1 < $$0 * 8; ++$$1) {
            float $$2 = this.R.i() * (float) (Math.PI * 2);
            float $$3 = this.R.i() * 0.5F + 0.5F;
            float $$4 = ami.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = ami.b($$2) * (float)$$0 * 0.5F * $$3;
            this.s.a(this.q(), this.df() + (double)$$4, this.dh(), this.dl() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.fJ(), this.eC(), ((this.R.i() - this.R.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.y && this.bY) {
         this.d = 1.0F;
      }

      this.bY = this.y;
      this.fG();
   }

   @Override
   protected void fG() {
      this.d *= 0.6F;
   }

   protected int t() {
      return this.R.a(20) + 10;
   }

   @Override
   public void z_() {
      double $$0 = this.df();
      double $$1 = this.dh();
      double $$2 = this.dl();
      super.z_();
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(aaj<?> $$0) {
      if (bX.equals($$0)) {
         this.z_();
         this.o(this.aZ);
         this.aX = this.aZ;
         if (this.aR() && this.R.a(20) == 0) {
            this.ba();
         }
      }

      super.a($$0);
   }

   @Override
   public bbr<? extends brz> ad() {
      return super.ad();
   }

   @Override
   public void a(bbn.c $$0) {
      int $$1 = this.fL();
      if (!this.s.y && $$1 > 1 && this.eg()) {
         rq $$2 = this.Z();
         boolean $$3 = this.fA();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.R.a(3);

         for(int $$7 = 0; $$7 < $$6; ++$$7) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            brz $$10 = this.ad().a(this.s);
            if (this.fr()) {
               $$10.fp();
            }

            $$10.b($$2);
            $$10.s($$3);
            $$10.m(this.ci());
            $$10.a($$5, true);
            $$10.b(this.df() + (double)$$8, this.dh() + 0.5, this.dl() + (double)$$9, this.R.i() * 360.0F, 0.0F);
            this.s.b($$10);
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bbn $$0) {
      super.g($$0);
      if ($$0 instanceof bnq && this.fH()) {
         this.k((bcc)$$0);
      }

   }

   @Override
   public void b_(buc $$0) {
      if (this.fH()) {
         this.k($$0);
      }

   }

   protected void k(bcc $$0) {
      if (this.bo()) {
         int $$1 = this.fL();
         if (this.f((bbn)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.B($$0) && $$0.a(baw.c(this), this.fI())) {
            this.a(ajw.sV, 1.0F, (this.R.i() - this.R.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }

   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.625F * $$1.b;
   }

   protected boolean fH() {
      return !this.fM() && this.eP();
   }

   protected float fI() {
      return (float)this.b(bdd.f);
   }

   @Override
   protected ajv c(baw $$0) {
      return this.fM() ? ajw.tM : ajw.sX;
   }

   @Override
   protected ajv x_() {
      return this.fM() ? ajw.tL : ajw.sW;
   }

   protected ajv fJ() {
      return this.fM() ? ajw.tO : ajw.sZ;
   }

   public static boolean c(bbr<brz> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      if ($$1.ag() != bag.a) {
         if ($$1.w($$3).a(akk.al) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.al() && $$1.D($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof chp)) {
            return false;
         }

         cge $$5 = new cge($$3);
         boolean $$6 = dbo.a($$5.e, $$5.f, ((chp)$$1).B(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eC() {
      return 0.4F * (float)this.fL();
   }

   @Override
   public int U() {
      return 0;
   }

   protected boolean fN() {
      return this.fL() > 0;
   }

   @Override
   protected void eH() {
      dwq $$0 = this.dd();
      this.n($$0.c, (double)this.eF(), $$0.e);
      this.af = true;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         ++$$6;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float n() {
      float $$0 = this.fM() ? 1.4F : 0.8F;
      return ((this.R.i() - this.R.i()) * 0.2F + 1.0F) * $$0;
   }

   protected ajv fK() {
      return this.fM() ? ajw.tN : ajw.sY;
   }

   @Override
   public bbo a(bco $$0) {
      return super.a($$0).a(0.255F * (float)this.fL());
   }

   static class a extends bip {
      private final brz a;
      private int b;

      public a(brz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.b));
      }

      @Override
      public boolean a() {
         bcc $$0 = this.a.G();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.A() instanceof brz.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bcc $$0 = this.a.G();
         if ($$0 == null) {
            return false;
         } else if (!this.a.c($$0)) {
            return false;
         } else {
            return --this.b > 0;
         }
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         bcc $$0 = this.a.G();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         ((brz.d)this.a.A()).a(this.a.dq(), this.a.fH());
      }
   }

   static class b extends bip {
      private final brz a;

      public b(brz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.c, bip.a.a));
         $$0.D().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aR() || this.a.bf()) && this.a.A() instanceof brz.d;
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.dQ().i() < 0.8F) {
            this.a.C().a();
         }

         ((brz.d)this.a.A()).a(1.2);
      }
   }

   static class c extends bip {
      private final brz a;

      public c(brz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.c, bip.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bI();
      }

      @Override
      public void e() {
         ((brz.d)this.a.A()).a(1.0);
      }
   }

   static class d extends bhs {
      private float l;
      private int m;
      private final brz n;
      private boolean o;

      public d(brz $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dq() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bhs.a.b;
      }

      @Override
      public void a() {
         this.d.o(this.a(this.d.dq(), this.l, 90.0F));
         this.d.aZ = this.d.dq();
         this.d.aX = this.d.dq();
         if (this.k != bhs.a.b) {
            this.d.u(0.0F);
         } else {
            this.k = bhs.a.a;
            if (this.d.aw()) {
               this.d.r((float)(this.h * this.d.b(bdd.d)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.C().a();
                  if (this.n.fN()) {
                     this.n.a(this.n.fK(), this.n.eC(), this.n.n());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.r(0.0F);
               }
            } else {
               this.d.r((float)(this.h * this.d.b(bdd.d)));
            }

         }
      }
   }

   static class e extends bip {
      private final brz a;
      private float b;
      private int c;

      public e(brz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.b));
      }

      @Override
      public boolean a() {
         return this.a.G() == null && (this.a.y || this.a.aR() || this.a.bf() || this.a.a(bbi.y)) && this.a.A() instanceof brz.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dQ().a(60));
            this.b = (float)this.a.dQ().a(360);
         }

         ((brz.d)this.a.A()).a(this.b, false);
      }
   }
}
