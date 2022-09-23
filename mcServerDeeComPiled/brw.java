import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class brw extends bnc implements bri {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bdb bX = new bdb(e, "Covered armor bonus", 20.0, bdb.a.a);
   protected static final aaj<gy> b = aam.a(brw.class, aal.n);
   protected static final aaj<Byte> c = aam.a(brw.class, aal.a);
   protected static final aaj<Byte> d = aam.a(brw.class, aal.a);
   private static final int bY = 6;
   private static final byte bZ = 16;
   private static final byte ca = 16;
   private static final int cb = 8;
   private static final int cc = 8;
   private static final int cd = 5;
   private static final float ce = 0.05F;
   static final k cf = ad.a((Supplier<k>)(() -> {
      hs $$0 = gy.d.q();
      return new k((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   }));
   private float cg;
   private float ch;
   @Nullable
   private gt ci;
   private int cj;
   private static final float ck = 1.0F;

   public brw(bbr<? extends brw> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new brw.d(this);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bix(this, buc.class, 8.0F, 0.02F, true));
      this.bS.a(4, new brw.a());
      this.bS.a(7, new brw.f());
      this.bS.a(8, new bjk(this));
      this.bT.a(1, new bkg(this, this.getClass()).a());
      this.bT.a(2, new brw.e(this));
      this.bT.a(3, new brw.c(this));
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected ajv r() {
      return ajw.sr;
   }

   @Override
   public void K() {
      if (!this.fN()) {
         super.K();
      }

   }

   @Override
   protected ajv x_() {
      return ajw.sx;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.fN() ? ajw.sz : ajw.sy;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, gy.a);
      this.Y.a(c, (byte)0);
      this.Y.a(d, (byte)16);
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 30.0);
   }

   @Override
   protected bhn y() {
      return new brw.b(this);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(gy.a($$0.f("AttachFace")));
      this.Y.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.Y.b(d, $$0.f("Color"));
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.Y.a(c));
      $$0.a("Color", this.Y.a(d));
   }

   @Override
   public void k() {
      super.k();
      if (!this.s.y && !this.bI() && !this.a(this.da(), this.t())) {
         this.fK();
      }

      if (this.fL()) {
         this.fM();
      }

      if (this.s.y) {
         if (this.cj > 0) {
            --this.cj;
         } else {
            this.ci = null;
         }
      }

   }

   private void fK() {
      gy $$0 = this.g(this.da());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.q();
      }

   }

   @Override
   protected dwl al() {
      float $$0 = A(this.ch);
      gy $$1 = this.t().g();
      float $$2 = this.ad().k() / 2.0F;
      return a($$1, $$0).d(this.df() - (double)$$2, this.dh(), this.dl() - (double)$$2);
   }

   private static float A(float $$0) {
      return 0.5F - ami.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean fL() {
      this.cg = this.ch;
      float $$0 = (float)this.fP() * 0.01F;
      if (this.ch == $$0) {
         return false;
      } else {
         if (this.ch > $$0) {
            this.ch = ami.a(this.ch - 0.05F, $$0, 1.0F);
         } else {
            this.ch = ami.a(this.ch + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void fM() {
      this.am();
      float $$0 = A(this.ch);
      float $$1 = A(this.cg);
      gy $$2 = this.t().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for(bbn $$5 : this.s.a(this, a($$2, $$1, $$0).d(this.df() - 0.5, this.dh(), this.dl() - 0.5), bbq.f.and($$0x -> !$$0x.v(this)))) {
            if (!($$5 instanceof brw) && !$$5.Q) {
               $$5.a(bci.e, new dwq((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }

      }
   }

   public static dwl a(gy $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static dwl a(gy $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new dwl(gt.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public double bs() {
      bbr<?> $$0 = this.cQ().ad();
      return $$0 != bbr.j && $$0 != bbr.ac ? super.bs() : 0.1875 - this.cQ().bt();
   }

   @Override
   public boolean a(bbn $$0, boolean $$1) {
      if (this.s.k_()) {
         this.ci = null;
         this.cj = 0;
      }

      this.a(gy.a);
      return super.a($$0, $$1);
   }

   @Override
   public void p() {
      super.p();
      if (this.s.y) {
         this.ci = this.da();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.o(0.0F);
      this.aZ = this.dq();
      this.bh();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bci $$0, dwq $$1) {
      if ($$0 == bci.d) {
         this.q();
      } else {
         super.a($$0, $$1);
      }

   }

   @Override
   public dwq dd() {
      return dwq.b;
   }

   @Override
   public void f(dwq $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gt $$3 = this.da();
      if (this.bI()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)ami.b($$0) + 0.5, (double)ami.b($$1 + 0.5), (double)ami.b($$2) + 0.5);
      }

      if (this.S != 0) {
         gt $$4 = this.da();
         if (!$$4.equals($$3)) {
            this.Y.b(c, (byte)0);
            this.af = true;
            if (this.s.y && !this.bI() && !$$4.equals(this.ci)) {
               this.ci = $$3;
               this.cj = 6;
               this.M = this.df();
               this.N = this.dh();
               this.O = this.dl();
            }
         }

      }
   }

   @Nullable
   protected gy g(gt $$0) {
      for(gy $$1 : gy.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(gt $$0, gy $$1) {
      if (this.h($$0)) {
         return false;
      } else {
         gy $$2 = $$1.g();
         if (!this.s.a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            dwl $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.s.a(this, $$3);
         }
      }
   }

   private boolean h(gt $$0) {
      cvo $$1 = this.s.a_($$0);
      if ($$1.h()) {
         return false;
      } else {
         boolean $$2 = $$1.a(cju.bD) && $$0.equals(this.da());
         return !$$2;
      }
   }

   protected boolean q() {
      if (!this.fA() && this.bo()) {
         gt $$0 = this.da();

         for(int $$1 = 0; $$1 < 5; ++$$1) {
            gt $$2 = $$0.b(ami.b(this.R, -8, 8), ami.b(this.R, -8, 8), ami.b(this.R, -8, 8));
            if ($$2.v() > this.s.u_() && this.s.x($$2) && this.s.p_().a($$2) && this.s.a(this, new dwl($$2).h(1.0E-6))) {
               gy $$3 = this.g($$2);
               if ($$3 != null) {
                  this.ab();
                  this.a($$3);
                  this.a(ajw.sC, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.s.a(czv.T, $$0, czv.a.a(this));
                  this.Y.b(c, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.br = 0;
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.fN()) {
         bbn $$2 = $$0.l();
         if ($$2 instanceof bui) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ef() < (double)this.et() * 0.5 && this.R.a(4) == 0) {
            this.q();
         } else if ($$0.b()) {
            bbn $$3 = $$0.l();
            if ($$3 != null && $$3.ad() == bbr.aC) {
               this.fO();
            }
         }

         return true;
      }
   }

   private boolean fN() {
      return this.fP() == 0;
   }

   private void fO() {
      dwq $$0 = this.cY();
      dwl $$1 = this.cy();
      if (!this.fN() && this.q()) {
         int $$2 = this.s.a(bbr.aB, $$1.g(8.0), bbn::bo).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.s.w.i() < $$3)) {
            brw $$4 = bbr.aB.a(this.s);
            bzq $$5 = this.fJ();
            if ($$5 != null) {
               $$4.a($$5);
            }

            $$4.d($$0);
            this.s.b($$4);
         }
      }
   }

   @Override
   public boolean bq() {
      return this.bo();
   }

   public gy t() {
      return this.Y.a(b);
   }

   private void a(gy $$0) {
      this.Y.b(b, $$0);
   }

   @Override
   public void a(aaj<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.al());
      }

      super.a($$0);
   }

   private int fP() {
      return this.Y.a(c);
   }

   void a(int $$0) {
      if (!this.s.y) {
         this.a(bdd.i).d(bX);
         if ($$0 == 0) {
            this.a(bdd.i).c(bX);
            this.a(ajw.sw, 1.0F, 1.0F);
            this.a(czv.j);
         } else {
            this.a(ajw.sA, 1.0F, 1.0F);
            this.a(czv.k);
         }
      }

      this.Y.b(c, (byte)$$0);
   }

   public float y(float $$0) {
      return ami.i($$0, this.cg, this.ch);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.5F;
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
   }

   @Override
   public int U() {
      return 180;
   }

   @Override
   public int V() {
      return 180;
   }

   @Override
   public void g(bbn $$0) {
   }

   @Override
   public float bx() {
      return 0.0F;
   }

   public Optional<dwq> z(float $$0) {
      if (this.ci != null && this.cj > 0) {
         double $$1 = (double)((float)this.cj - $$0) / 6.0;
         $$1 *= $$1;
         gt $$2 = this.da();
         double $$3 = (double)($$2.u() - this.ci.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ci.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ci.w()) * $$1;
         return Optional.of(new dwq(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   private void a(bzq $$0) {
      this.Y.b(d, (byte)$$0.a());
   }

   @Nullable
   public bzq fJ() {
      byte $$0 = this.Y.a(d);
      return $$0 != 16 && $$0 <= 15 ? bzq.a($$0) : null;
   }

   class a extends bip {
      private int b;

      public a() {
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         bcc $$0 = brw.this.G();
         if ($$0 != null && $$0.bo()) {
            return brw.this.s.ag() != bag.a;
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         this.b = 20;
         brw.this.a(100);
      }

      @Override
      public void d() {
         brw.this.a(0);
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         if (brw.this.s.ag() != bag.a) {
            --this.b;
            bcc $$0 = brw.this.G();
            if ($$0 != null) {
               brw.this.z().a($$0, 180.0F, 180.0F);
               double $$1 = brw.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + brw.this.R.a(10) * 20 / 2;
                     brw.this.s.b(new buw(brw.this.s, brw.this, $$0, brw.this.t().o()));
                     brw.this.a(ajw.sB, 2.0F, (brw.this.R.i() - brw.this.R.i()) * 0.2F + 1.0F);
                  }
               } else {
                  brw.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends bhn {
      public b(bce $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends bkh<bcc> {
      public c(brw $$0) {
         super($$0, bcc.class, 10, true, false, $$0x -> $$0x instanceof bri);
      }

      @Override
      public boolean a() {
         return this.e.bY() == null ? false : super.a();
      }

      @Override
      protected dwl a(double $$0) {
         gy $$1 = ((brw)this.e).t();
         if ($$1.o() == gy.a.a) {
            return this.e.cy().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == gy.a.c ? this.e.cy().c($$0, $$0, 4.0) : this.e.cy().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bhr {
      public d(bce $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         gy $$0 = brw.this.t().g();
         k $$1 = brw.cf.e();
         $$1.a($$0.b());
         hs $$2 = $$0.q();
         k $$3 = new k((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.e($$1);
         double $$4 = this.e - this.a.df();
         double $$5 = this.f - this.a.dj();
         double $$6 = this.g - this.a.dl();
         k $$7 = new k((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.d($$7);
         float $$9 = $$1.d($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ami.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends bkh<buc> {
      public e(brw $$0) {
         super($$0, buc.class, true);
      }

      @Override
      public boolean a() {
         return brw.this.s.ag() == bag.a ? false : super.a();
      }

      @Override
      protected dwl a(double $$0) {
         gy $$1 = ((brw)this.e).t();
         if ($$1.o() == gy.a.a) {
            return this.e.cy().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == gy.a.c ? this.e.cy().c($$0, $$0, 4.0) : this.e.cy().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bip {
      private int b;

      @Override
      public boolean a() {
         return brw.this.G() == null && brw.this.R.a(b(40)) == 0 && brw.this.a(brw.this.da(), brw.this.t());
      }

      @Override
      public boolean b() {
         return brw.this.G() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + brw.this.R.a(3)));
         brw.this.a(30);
      }

      @Override
      public void d() {
         if (brw.this.G() == null) {
            brw.this.a(0);
         }

      }

      @Override
      public void e() {
         --this.b;
      }
   }
}
