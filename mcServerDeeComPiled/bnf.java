import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bnf extends bne implements bcj, bnn {
   public static final float bX = 120.32113F;
   public static final int bY = ami.f(1.4959966F);
   private static final aaj<Byte> ch = aam.a(bnf.class, aal.a);
   private static final aaj<Integer> ci = aam.a(bnf.class, aal.b);
   private static final int cj = 2;
   private static final int ck = 4;
   private static final int cl = 8;
   private static final int cm = 1200;
   private static final int cn = 2400;
   private static final int co = 3600;
   private static final int cp = 4;
   private static final int cq = 10;
   private static final int cr = 10;
   private static final int cs = 18;
   private static final int ct = 32;
   private static final int cu = 2;
   private static final int cv = 16;
   private static final int cw = 20;
   public static final String ca = "CropsGrownSincePollination";
   public static final String cb = "CannotEnterHiveTicks";
   public static final String cc = "TicksSincePollination";
   public static final String cd = "HasStung";
   public static final String ce = "HasNectar";
   public static final String cf = "FlowerPos";
   public static final String cg = "HivePos";
   private static final azu cx = anc.a(20, 39);
   @Nullable
   private UUID cy;
   private float cz;
   private float cA;
   private int cB;
   int cC;
   private int cD;
   private int cE;
   private static final int cF = 200;
   int cG;
   private static final int cH = 200;
   int cI = ami.a(this.R, 20, 60);
   @Nullable
   gt cJ;
   @Nullable
   gt cK;
   bnf.k cL;
   bnf.e cM;
   private bnf.f cN;
   private int cO;

   public bnf(bbr<? extends bnf> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhp(this, 20, true);
      this.bO = new bnf.j(this);
      this.a(dqh.n, -1.0F);
      this.a(dqh.j, -1.0F);
      this.a(dqh.k, 16.0F);
      this.a(dqh.z, -1.0F);
      this.a(dqh.h, -1.0F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ch, (byte)0);
      this.Y.a(ci, 0);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return $$1.a_($$0).h() ? 10.0F : 0.0F;
   }

   @Override
   protected void u() {
      this.bS.a(0, new bnf.b(this, 1.4F, true));
      this.bS.a(1, new bnf.d());
      this.bS.a(2, new bib(this, 1.0));
      this.bS.a(3, new bjw(this, 1.25, cdm.a(aks.O), false));
      this.cL = new bnf.k();
      this.bS.a(4, this.cL);
      this.bS.a(5, new bio(this, 1.25));
      this.bS.a(5, new bnf.i());
      this.cM = new bnf.e();
      this.bS.a(5, this.cM);
      this.cN = new bnf.f();
      this.bS.a(6, this.cN);
      this.bS.a(7, new bnf.g());
      this.bS.a(8, new bnf.l());
      this.bS.a(9, new bij(this));
      this.bT.a(1, new bnf.h(this).a(new Class[0]));
      this.bT.a(2, new bnf.c(this));
      this.bT.a(3, new bkn<>(this, true));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.fR()) {
         $$0.a("HivePos", (qc)pv.a(this.fS()));
      }

      if (this.t()) {
         $$0.a("FlowerPos", (qc)pv.a(this.q()));
      }

      $$0.a("HasNectar", this.fU());
      $$0.a("HasStung", this.fV());
      $$0.a("TicksSincePollination", this.cC);
      $$0.a("CannotEnterHiveTicks", this.cD);
      $$0.a("CropsGrownSincePollination", this.cE);
      this.c($$0);
   }

   @Override
   public void a(pj $$0) {
      this.cK = null;
      if ($$0.e("HivePos")) {
         this.cK = pv.b($$0.p("HivePos"));
      }

      this.cJ = null;
      if ($$0.e("FlowerPos")) {
         this.cJ = pv.b($$0.p("FlowerPos"));
      }

      super.a($$0);
      this.v($$0.q("HasNectar"));
      this.w($$0.q("HasStung"));
      this.cC = $$0.h("TicksSincePollination");
      this.cD = $$0.h("CannotEnterHiveTicks");
      this.cE = $$0.h("CropsGrownSincePollination");
      this.a(this.s, $$0);
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = $$0.a(baw.b((bcc)this), (float)((int)this.b(bdd.f)));
      if ($$1) {
         this.a(this, $$0);
         if ($$0 instanceof bcc) {
            ((bcc)$$0).q(((bcc)$$0).ev() + 1);
            int $$2 = 0;
            if (this.s.ag() == bag.c) {
               $$2 = 10;
            } else if (this.s.ag() == bag.d) {
               $$2 = 18;
            }

            if ($$2 > 0) {
               ((bcc)$$0).b(new bbg(bbi.s, $$2 * 20, 0), this);
            }
         }

         this.w(true);
         this.H_();
         this.a(ajw.bn, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public void k() {
      super.k();
      if (this.fU() && this.gd() < 10 && this.R.i() < 0.05F) {
         for(int $$0 = 0; $$0 < this.R.a(2) + 1; ++$$0) {
            this.a(this.s, this.df() - 0.3F, this.df() + 0.3F, this.dl() - 0.3F, this.dl() + 0.3F, this.e(0.5), io.ar);
         }
      }

      this.gb();
   }

   private void a(cgx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, im $$6) {
      $$0.a($$6, ami.d($$0.w.j(), $$1, $$2), $$5, ami.d($$0.w.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void h(gt $$0) {
      dwq $$1 = dwq.c($$0);
      int $$2 = 0;
      gt $$3 = this.da();
      int $$4 = (int)$$1.d - $$3.v();
      if ($$4 > 2) {
         $$2 = 4;
      } else if ($$4 < -2) {
         $$2 = -4;
      }

      int $$5 = 6;
      int $$6 = 8;
      int $$7 = $$3.k($$0);
      if ($$7 < 15) {
         $$5 = $$7 / 2;
         $$6 = $$7 / 2;
      }

      dwq $$8 = bmi.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bR.a(0.5F);
         this.bR.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public gt q() {
      return this.cJ;
   }

   public boolean t() {
      return this.cJ != null;
   }

   public void g(gt $$0) {
      this.cJ = $$0;
   }

   @ang
   public int fJ() {
      return Math.max(this.cM.d, this.cN.d);
   }

   @ang
   public List<gt> fK() {
      return this.cM.f;
   }

   private boolean fZ() {
      return this.cC > 3600;
   }

   boolean ga() {
      if (this.cD <= 0 && !this.cL.l() && !this.fV() && this.G() == null) {
         boolean $$0 = this.fZ() || this.s.Y() || this.s.N() || this.fU();
         return $$0 && !this.gc();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cD = $$0;
   }

   public float y(float $$0) {
      return ami.i($$0, this.cA, this.cz);
   }

   private void gb() {
      this.cA = this.cz;
      if (this.gh()) {
         this.cz = Math.min(1.0F, this.cz + 0.2F);
      } else {
         this.cz = Math.max(0.0F, this.cz - 0.24F);
      }

   }

   @Override
   protected void T() {
      boolean $$0 = this.fV();
      if (this.aU()) {
         ++this.cO;
      } else {
         this.cO = 0;
      }

      if (this.cO > 20) {
         this.a(baw.h, 1.0F);
      }

      if ($$0) {
         ++this.cB;
         if (this.cB % 5 == 0 && this.R.a(ami.a(1200 - this.cB, 1, 1200)) == 0) {
            this.a(baw.n, this.ef());
         }
      }

      if (!this.fU()) {
         ++this.cC;
      }

      if (!this.s.y) {
         this.a((agg)this.s, false);
      }

   }

   public void fL() {
      this.cC = 0;
   }

   private boolean gc() {
      if (this.cK == null) {
         return false;
      } else {
         cti $$0 = this.s.c_(this.cK);
         return $$0 instanceof ctf && ((ctf)$$0).c();
      }
   }

   @Override
   public int a() {
      return this.Y.a(ci);
   }

   @Override
   public void a(int $$0) {
      this.Y.b(ci, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cy;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cy = $$0;
   }

   @Override
   public void c() {
      this.a(cx.a(this.R));
   }

   private boolean i(gt $$0) {
      cti $$1 = this.s.c_($$0);
      if ($$1 instanceof ctf) {
         return !((ctf)$$1).f();
      } else {
         return false;
      }
   }

   @ang
   public boolean fR() {
      return this.cK != null;
   }

   @Nullable
   @ang
   public gt fS() {
      return this.cK;
   }

   @ang
   public biq fT() {
      return this.bS;
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   int gd() {
      return this.cE;
   }

   private void ge() {
      this.cE = 0;
   }

   void gf() {
      ++this.cE;
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y) {
         if (this.cD > 0) {
            --this.cD;
         }

         if (this.cG > 0) {
            --this.cG;
         }

         if (this.cI > 0) {
            --this.cI;
         }

         boolean $$0 = this.I_() && !this.fV() && this.G() != null && this.G().f(this) < 4.0;
         this.x($$0);
         if (this.S % 20 == 0 && !this.gg()) {
            this.cK = null;
         }
      }

   }

   boolean gg() {
      if (!this.fR()) {
         return false;
      } else {
         cti $$0 = this.s.c_(this.cK);
         return $$0 != null && $$0.v() == ctk.G;
      }
   }

   public boolean fU() {
      return this.u(8);
   }

   void v(boolean $$0) {
      if ($$0) {
         this.fL();
      }

      this.d(8, $$0);
   }

   public boolean fV() {
      return this.u(4);
   }

   private void w(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gh() {
      return this.u(2);
   }

   private void x(boolean $$0) {
      this.d(2, $$0);
   }

   boolean j(gt $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.Y.b(ch, (byte)(this.Y.a(ch) | $$0));
      } else {
         this.Y.b(ch, (byte)(this.Y.a(ch) & ~$$0));
      }

   }

   private boolean u(int $$0) {
      return (this.Y.a(ch) & $$0) != 0;
   }

   public static bdc.a fW() {
      return bce.w().a(bdd.a, 10.0).a(bdd.e, 0.6F).a(bdd.d, 0.3F).a(bdd.f, 2.0).a(bdd.b, 48.0);
   }

   @Override
   protected blc a(cgx $$0) {
      bla $$1 = new bla(this, $$0) {
         @Override
         public boolean a(gt $$0) {
            return !this.b.a_($$0.c()).h();
         }

         @Override
         public void c() {
            if (!bnf.this.cL.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      return $$1;
   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(aks.O);
   }

   boolean k(gt $$0) {
      return this.s.o($$0) && this.s.a_($$0).a(akl.Q);
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
   }

   @Override
   protected ajv r() {
      return null;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.bk;
   }

   @Override
   protected ajv x_() {
      return ajw.bj;
   }

   @Override
   protected float eC() {
      return 0.4F;
   }

   public bnf b(agg $$0, bbk $$1) {
      return bbr.h.a((cgx)$$0);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? $$1.b * 0.5F : $$1.b * 0.5F;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
   }

   @Override
   public boolean aL() {
      return this.fX() && this.S % bY == 0;
   }

   @Override
   public boolean fX() {
      return !this.y;
   }

   public void fY() {
      this.v(false);
      this.ge();
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.s.y) {
            this.cL.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public bch ey() {
      return bch.c;
   }

   @Override
   protected void c(akz<dpu> $$0) {
      this.f(this.dd().b(0.0, 0.01, 0.0));
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.5F * this.cA()), (double)(this.cW() * 0.2F));
   }

   boolean b(gt $$0, int $$1) {
      return $$0.a(this.da(), (double)$$1);
   }

   abstract class a extends bip {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !bnf.this.I_();
      }

      @Override
      public boolean b() {
         return this.i() && !bnf.this.I_();
      }
   }

   class b extends biz {
      b(bcl $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && bnf.this.I_() && !bnf.this.fV();
      }

      @Override
      public boolean b() {
         return super.b() && bnf.this.I_() && !bnf.this.fV();
      }
   }

   static class c extends bkh<buc> {
      c(bnf $$0) {
         super($$0, buc.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.G() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         bnf $$0 = (bnf)this.e;
         return $$0.I_() && !$$0.fV();
      }
   }

   class d extends bnf.a {
      @Override
      public boolean h() {
         if (bnf.this.fR() && bnf.this.ga() && bnf.this.cK.a(bnf.this.cY(), 2.0)) {
            cti $$0 = bnf.this.s.c_(bnf.this.cK);
            if ($$0 instanceof ctf $$1) {
               if (!$$1.f()) {
                  return true;
               }

               bnf.this.cK = null;
            }
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cti $$0 = bnf.this.s.c_(bnf.this.cK);
         if ($$0 instanceof ctf $$1) {
            $$1.a(bnf.this, bnf.this.fU());
         }

      }
   }

   @ang
   public class e extends bnf.a {
      public static final int b = 600;
      int d = bnf.this.s.w.a(10);
      private static final int e = 3;
      final List<gt> f = Lists.newArrayList();
      @Nullable
      private dql g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean h() {
         return bnf.this.cK != null && !bnf.this.fw() && bnf.this.ga() && !this.d(bnf.this.cK) && bnf.this.s.a_(bnf.this.cK).a(akl.ax);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         this.i = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         bnf.this.bR.n();
         bnf.this.bR.g();
      }

      @Override
      public void e() {
         if (bnf.this.cK != null) {
            ++this.d;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!bnf.this.bR.m()) {
               if (!bnf.this.b(bnf.this.cK, 16)) {
                  if (bnf.this.j(bnf.this.cK)) {
                     this.m();
                  } else {
                     bnf.this.h(bnf.this.cK);
                  }
               } else {
                  boolean $$0 = this.a(bnf.this.cK);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && bnf.this.bR.j().a(this.g)) {
                     ++this.i;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = bnf.this.bR.j();
                  }

               }
            }
         }
      }

      private boolean a(gt $$0) {
         bnf.this.bR.a(10.0F);
         bnf.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 1.0);
         return bnf.this.bR.j() != null && bnf.this.bR.j().j();
      }

      boolean b(gt $$0) {
         return this.f.contains($$0);
      }

      private void c(gt $$0) {
         this.f.add($$0);

         while(this.f.size() > 3) {
            this.f.remove(0);
         }

      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (bnf.this.cK != null) {
            this.c(bnf.this.cK);
         }

         this.m();
      }

      private void m() {
         bnf.this.cK = null;
         bnf.this.cG = 200;
      }

      private boolean d(gt $$0) {
         if (bnf.this.b($$0, 2)) {
            return true;
         } else {
            dql $$1 = bnf.this.bR.j();
            return $$1 != null && $$1.m().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends bnf.a {
      private static final int c = 600;
      int d = bnf.this.s.w.a(10);

      f() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean h() {
         return bnf.this.cJ != null && !bnf.this.fw() && this.k() && bnf.this.k(bnf.this.cJ) && !bnf.this.b(bnf.this.cJ, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         bnf.this.bR.n();
         bnf.this.bR.g();
      }

      @Override
      public void e() {
         if (bnf.this.cJ != null) {
            ++this.d;
            if (this.d > this.a(600)) {
               bnf.this.cJ = null;
            } else if (!bnf.this.bR.m()) {
               if (bnf.this.j(bnf.this.cJ)) {
                  bnf.this.cJ = null;
               } else {
                  bnf.this.h(bnf.this.cJ);
               }
            }
         }
      }

      private boolean k() {
         return bnf.this.cC > 2400;
      }
   }

   class g extends bnf.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (bnf.this.gd() >= 10) {
            return false;
         } else if (bnf.this.R.i() < 0.3F) {
            return false;
         } else {
            return bnf.this.fU() && bnf.this.gg();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (bnf.this.R.a(this.a(30)) == 0) {
            for(int $$0 = 1; $$0 <= 2; ++$$0) {
               gt $$1 = bnf.this.da().c($$0);
               cvo $$2 = bnf.this.s.a_($$1);
               cjt $$3 = $$2.b();
               boolean $$4 = false;
               cwo $$5 = null;
               if ($$2.a(akl.az)) {
                  if ($$3 instanceof clf $$6) {
                     if (!$$6.h($$2)) {
                        $$4 = true;
                        $$5 = $$6.b();
                     }
                  } else if ($$3 instanceof crf) {
                     int $$7 = $$2.c(crf.b);
                     if ($$7 < 7) {
                        $$4 = true;
                        $$5 = crf.b;
                     }
                  } else if ($$2.a(cju.mT)) {
                     int $$8 = $$2.c(crn.b);
                     if ($$8 < 3) {
                        $$4 = true;
                        $$5 = crn.b;
                     }
                  } else if ($$2.a(cju.qe) || $$2.a(cju.qf)) {
                     ((cjv)$$2.b()).a((agg)bnf.this.s, bnf.this.R, $$1, $$2);
                  }

                  if ($$4) {
                     bnf.this.s.c(2005, $$1, 0);
                     bnf.this.s.b($$1, $$2.a($$5, Integer.valueOf($$2.c($$5) + 1)));
                     bnf.this.gf();
                  }
               }
            }

         }
      }
   }

   class h extends bkg {
      h(bnf $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return bnf.this.I_() && super.b();
      }

      @Override
      protected void a(bce $$0, bcc $$1) {
         if ($$0 instanceof bnf && this.e.B($$1)) {
            $$0.h($$1);
         }

      }
   }

   class i extends bnf.a {
      @Override
      public boolean h() {
         return bnf.this.cG == 0 && !bnf.this.fR() && bnf.this.ga();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         bnf.this.cG = 200;
         List<gt> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for(gt $$1 : $$0) {
               if (!bnf.this.cM.b($$1)) {
                  bnf.this.cK = $$1;
                  return;
               }
            }

            bnf.this.cM.k();
            bnf.this.cK = (gt)$$0.get(0);
         }
      }

      private List<gt> k() {
         gt $$0 = bnf.this.da();
         bms $$1 = ((agg)bnf.this.s).x();
         Stream<bmt> $$2 = $$1.c($$0x -> $$0x.a(aku.c), $$0, 20, bms.b.c);
         return (List<gt>)$$2.map(bmt::f).filter(bnf.this::i).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends bhr {
      j(bce $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!bnf.this.I_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !bnf.this.cL.l();
      }
   }

   class k extends bnf.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<cvo> f = $$0 -> {
         if ($$0.b(cwe.C) && $$0.c(cwe.C)) {
            return false;
         } else if ($$0.a(akl.Q)) {
            if ($$0.a(cju.hB)) {
               return $$0.c(clr.a) == cwk.a;
            } else {
               return true;
            }
         } else {
            return false;
         }
      };
      private static final double g = 0.1;
      private static final int h = 25;
      private static final float i = 0.35F;
      private static final float j = 0.6F;
      private static final float k = 0.33333334F;
      private int l;
      private int m;
      private boolean n;
      @Nullable
      private dwq o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean h() {
         if (bnf.this.cI > 0) {
            return false;
         } else if (bnf.this.fU()) {
            return false;
         } else if (bnf.this.s.Y()) {
            return false;
         } else {
            Optional<gt> $$0 = this.p();
            if ($$0.isPresent()) {
               bnf.this.cJ = (gt)$$0.get();
               bnf.this.bR.a((double)bnf.this.cJ.u() + 0.5, (double)bnf.this.cJ.v() + 0.5, (double)bnf.this.cJ.w() + 0.5, 1.2F);
               return true;
            } else {
               bnf.this.cI = ami.a(bnf.this.R, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!bnf.this.t()) {
            return false;
         } else if (bnf.this.s.Y()) {
            return false;
         } else if (this.k()) {
            return bnf.this.R.i() < 0.2F;
         } else if (bnf.this.S % 20 == 0 && !bnf.this.k(bnf.this.cJ)) {
            bnf.this.cJ = null;
            return false;
         } else {
            return true;
         }
      }

      private boolean k() {
         return this.l > 400;
      }

      boolean l() {
         return this.n;
      }

      void m() {
         this.n = false;
      }

      @Override
      public void c() {
         this.l = 0;
         this.p = 0;
         this.m = 0;
         this.n = true;
         bnf.this.fL();
      }

      @Override
      public void d() {
         if (this.k()) {
            bnf.this.v(true);
         }

         this.n = false;
         bnf.this.bR.n();
         bnf.this.cI = 200;
      }

      @Override
      public boolean E_() {
         return true;
      }

      @Override
      public void e() {
         ++this.p;
         if (this.p > 600) {
            bnf.this.cJ = null;
         } else {
            dwq $$0 = dwq.c(bnf.this.cJ).b(0.0, 0.6F, 0.0);
            if ($$0.f(bnf.this.cY()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = bnf.this.cY().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  bnf.this.cJ = null;
               } else {
                  if ($$1) {
                     boolean $$3 = bnf.this.R.a(25) == 0;
                     if ($$3) {
                        this.o = new dwq($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        bnf.this.bR.n();
                     } else {
                        $$2 = false;
                     }

                     bnf.this.z().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  ++this.l;
                  if (bnf.this.R.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     bnf.this.a(ajw.bo, 1.0F, 1.0F);
                  }

               }
            }
         }
      }

      private void n() {
         bnf.this.A().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (bnf.this.R.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<gt> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<gt> a(Predicate<cvo> $$0, double $$1) {
         gt $$2 = bnf.this.da();
         gt.a $$3 = new gt.a();

         for(int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for(int $$5 = 0; (double)$$5 < $$1; ++$$5) {
               for(int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for(int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(bnf.this.s.a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bip {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         return bnf.this.bR.l() && bnf.this.R.a(10) == 0;
      }

      @Override
      public boolean b() {
         return bnf.this.bR.m();
      }

      @Override
      public void c() {
         dwq $$0 = this.h();
         if ($$0 != null) {
            bnf.this.bR.a(bnf.this.bR.a(new gt($$0), 1), 1.0);
         }

      }

      @Nullable
      private dwq h() {
         dwq $$1;
         if (bnf.this.gg() && !bnf.this.b(bnf.this.cK, 22)) {
            dwq $$0 = dwq.a(bnf.this.cK);
            $$1 = $$0.d(bnf.this.cY()).d();
         } else {
            $$1 = bnf.this.e(0.0F);
         }

         int $$3 = 8;
         dwq $$4 = bml.a(bnf.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : bmh.a(bnf.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
