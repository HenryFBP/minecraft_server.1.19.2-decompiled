import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bql extends bcc {
   public static final int b = 5;
   private static final boolean bO = true;
   private static final hp bP = new hp(0.0F, 0.0F, 0.0F);
   private static final hp bQ = new hp(0.0F, 0.0F, 0.0F);
   private static final hp bR = new hp(-10.0F, 0.0F, -10.0F);
   private static final hp bS = new hp(-15.0F, 0.0F, 10.0F);
   private static final hp bT = new hp(-1.0F, 0.0F, -1.0F);
   private static final hp bU = new hp(1.0F, 0.0F, 1.0F);
   private static final bbo bV = new bbo(0.0F, 0.0F, true);
   private static final bbo bW = bbr.d.m().a(0.5F);
   private static final double bX = 0.1;
   private static final double bY = 0.9;
   private static final double bZ = 0.4;
   private static final double ca = 1.6;
   public static final int c = 8;
   public static final int d = 16;
   public static final int e = 1;
   public static final int f = 4;
   public static final int bE = 8;
   public static final int bF = 16;
   public static final aaj<Byte> bG = aam.a(bql.class, aal.a);
   public static final aaj<hp> bH = aam.a(bql.class, aal.k);
   public static final aaj<hp> bI = aam.a(bql.class, aal.k);
   public static final aaj<hp> bJ = aam.a(bql.class, aal.k);
   public static final aaj<hp> bK = aam.a(bql.class, aal.k);
   public static final aaj<hp> bL = aam.a(bql.class, aal.k);
   public static final aaj<hp> bM = aam.a(bql.class, aal.k);
   private static final Predicate<bbn> cb = $$0 -> $$0 instanceof bvt && ((bvt)$$0).r() == bvt.a.a;
   private final hi<cax> cc = hi.a(2, cax.b);
   private final hi<cax> cd = hi.a(4, cax.b);
   private boolean ce;
   public long bN;
   private int cf;
   private hp cg = bP;
   private hp ch = bQ;
   private hp ci = bR;
   private hp cj = bS;
   private hp ck = bT;
   private hp cl = bU;

   public bql(bbr<? extends bql> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 0.0F;
   }

   public bql(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.d, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   public void z_() {
      double $$0 = this.df();
      double $$1 = this.dh();
      double $$2 = this.dl();
      super.z_();
      this.e($$0, $$1, $$2);
   }

   private boolean C() {
      return !this.t() && !this.aN();
   }

   @Override
   public boolean eP() {
      return super.eP() && this.C();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bG, (byte)0);
      this.Y.a(bH, bP);
      this.Y.a(bI, bQ);
      this.Y.a(bJ, bR);
      this.Y.a(bK, bS);
      this.Y.a(bL, bT);
      this.Y.a(bM, bU);
   }

   @Override
   public Iterable<cax> bE() {
      return this.cc;
   }

   @Override
   public Iterable<cax> bF() {
      return this.cd;
   }

   @Override
   public cax c(bbs $$0) {
      switch($$0.a()) {
         case a:
            return this.cc.get($$0.b());
         case b:
            return this.cd.get($$0.b());
         default:
            return cax.b;
      }
   }

   @Override
   public void a(bbs $$0, cax $$1) {
      this.f($$1);
      switch($$0.a()) {
         case a:
            this.a($$0, this.cc.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cd.set($$0.b(), $$1), $$1);
      }

   }

   @Override
   public boolean g(cax $$0) {
      bbs $$1 = bce.i($$0);
      return this.c($$1).b() && !this.e($$1);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      pp $$1 = new pp();

      for(cax $$2 : this.cd) {
         pj $$3 = new pj();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", (qc)$$1);
      pp $$4 = new pp();

      for(cax $$5 : this.cc) {
         pj $$6 = new pj();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", (qc)$$4);
      $$0.a("Invisible", this.bX());
      $$0.a("Small", this.n());
      $$0.a("ShowArms", this.q());
      $$0.a("DisabledSlots", this.cf);
      $$0.a("NoBasePlate", this.r());
      if (this.t()) {
         $$0.a("Marker", this.t());
      }

      $$0.a("Pose", (qc)this.D());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("ArmorItems", 9)) {
         pp $$1 = $$0.c("ArmorItems", 10);

         for(int $$2 = 0; $$2 < this.cd.size(); ++$$2) {
            this.cd.set($$2, cax.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         pp $$3 = $$0.c("HandItems", 10);

         for(int $$4 = 0; $$4 < this.cc.size(); ++$$4) {
            this.cc.set($$4, cax.a($$3.a($$4)));
         }
      }

      this.j($$0.q("Invisible"));
      this.a($$0.q("Small"));
      this.r($$0.q("ShowArms"));
      this.cf = $$0.h("DisabledSlots");
      this.s($$0.q("NoBasePlate"));
      this.t($$0.q("Marker"));
      this.Q = !this.C();
      pj $$5 = $$0.p("Pose");
      this.c($$5);
   }

   private void c(pj $$0) {
      pp $$1 = $$0.c("Head", 5);
      this.a($$1.isEmpty() ? bP : new hp($$1));
      pp $$2 = $$0.c("Body", 5);
      this.b($$2.isEmpty() ? bQ : new hp($$2));
      pp $$3 = $$0.c("LeftArm", 5);
      this.c($$3.isEmpty() ? bR : new hp($$3));
      pp $$4 = $$0.c("RightArm", 5);
      this.d($$4.isEmpty() ? bS : new hp($$4));
      pp $$5 = $$0.c("LeftLeg", 5);
      this.e($$5.isEmpty() ? bT : new hp($$5));
      pp $$6 = $$0.c("RightLeg", 5);
      this.f($$6.isEmpty() ? bU : new hp($$6));
   }

   private pj D() {
      pj $$0 = new pj();
      if (!bP.equals(this.cg)) {
         $$0.a("Head", (qc)this.cg.a());
      }

      if (!bQ.equals(this.ch)) {
         $$0.a("Body", (qc)this.ch.a());
      }

      if (!bR.equals(this.ci)) {
         $$0.a("LeftArm", (qc)this.ci.a());
      }

      if (!bS.equals(this.cj)) {
         $$0.a("RightArm", (qc)this.cj.a());
      }

      if (!bT.equals(this.ck)) {
         $$0.a("LeftLeg", (qc)this.ck.a());
      }

      if (!bU.equals(this.cl)) {
         $$0.a("RightLeg", (qc)this.cl.a());
      }

      return $$0;
   }

   @Override
   public boolean bl() {
      return false;
   }

   @Override
   protected void A(bbn $$0) {
   }

   @Override
   protected void eN() {
      List<bbn> $$0 = this.s.a(this, this.cy(), cb);

      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         bbn $$2 = (bbn)$$0.get($$1);
         if (this.f($$2) <= 0.2) {
            $$2.g(this);
         }
      }

   }

   @Override
   public baj a(buc $$0, dwq $$1, bai $$2) {
      cax $$3 = $$0.b($$2);
      if (this.t() || $$3.a(caz.sH)) {
         return baj.d;
      } else if ($$0.B_()) {
         return baj.a;
      } else if ($$0.s.y) {
         return baj.b;
      } else {
         bbs $$4 = bce.i($$3);
         if ($$3.b()) {
            bbs $$5 = this.i($$1);
            bbs $$6 = this.e($$5) ? $$4 : $$5;
            if (this.b($$6) && this.a($$0, $$6, $$3, $$2)) {
               return baj.a;
            }
         } else {
            if (this.e($$4)) {
               return baj.e;
            }

            if ($$4.a() == bbs.a.a && !this.q()) {
               return baj.e;
            }

            if (this.a($$0, $$4, $$3, $$2)) {
               return baj.a;
            }
         }

         return baj.d;
      }
   }

   private bbs i(dwq $$0) {
      bbs $$1 = bbs.a;
      boolean $$2 = this.n();
      double $$3 = $$2 ? $$0.d * 2.0 : $$0.d;
      bbs $$4 = bbs.c;
      if ($$3 >= 0.1 && $$3 < 0.1 + ($$2 ? 0.8 : 0.45) && this.b($$4)) {
         $$1 = bbs.c;
      } else if ($$3 >= 0.9 + ($$2 ? 0.3 : 0.0) && $$3 < 0.9 + ($$2 ? 1.0 : 0.7) && this.b(bbs.e)) {
         $$1 = bbs.e;
      } else if ($$3 >= 0.4 && $$3 < 0.4 + ($$2 ? 1.0 : 0.8) && this.b(bbs.d)) {
         $$1 = bbs.d;
      } else if ($$3 >= 1.6 && this.b(bbs.f)) {
         $$1 = bbs.f;
      } else if (!this.b(bbs.a) && this.b(bbs.b)) {
         $$1 = bbs.b;
      }

      return $$1;
   }

   private boolean e(bbs $$0) {
      return (this.cf & 1 << $$0.c()) != 0 || $$0.a() == bbs.a.a && !this.q();
   }

   private boolean a(buc $$0, bbs $$1, cax $$2, bai $$3) {
      cax $$4 = this.c($$1);
      if (!$$4.b() && (this.cf & 1 << $$1.c() + 8) != 0) {
         return false;
      } else if ($$4.b() && (this.cf & 1 << $$1.c() + 16) != 0) {
         return false;
      } else if ($$0.fB().d && $$4.b() && !$$2.b()) {
         cax $$5 = $$2.o();
         $$5.e(1);
         this.a($$1, $$5);
         return true;
      } else if ($$2.b() || $$2.K() <= 1) {
         this.a($$1, $$2);
         $$0.a($$3, $$4);
         return true;
      } else if (!$$4.b()) {
         return false;
      } else {
         cax $$6 = $$2.o();
         $$6.e(1);
         this.a($$1, $$6);
         $$2.g(1);
         return true;
      }
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.s.y || this.dt()) {
         return false;
      } else if (baw.m.equals($$0)) {
         this.ag();
         return false;
      } else if (this.b($$0) || this.ce || this.t()) {
         return false;
      } else if ($$0.d()) {
         this.h($$0);
         this.ag();
         return false;
      } else if (baw.a.equals($$0)) {
         if (this.bH()) {
            this.g($$0, 0.15F);
         } else {
            this.f(5);
         }

         return false;
      } else if (baw.c.equals($$0) && this.ef() > 0.5F) {
         this.g($$0, 4.0F);
         return false;
      } else {
         boolean $$2 = $$0.l() instanceof bui;
         boolean $$3 = $$2 && ((bui)$$0.l()).s() > 0;
         boolean $$4 = "player".equals($$0.w());
         if (!$$4 && !$$2) {
            return false;
         } else if ($$0.m() instanceof buc && !((buc)$$0.m()).fB().e) {
            return false;
         } else if ($$0.D()) {
            this.G();
            this.E();
            this.ag();
            return $$3;
         } else {
            long $$5 = this.s.U();
            if ($$5 - this.bN > 5L && !$$2) {
               this.s.a(this, (byte)32);
               this.a(czv.p, $$0.m());
               this.bN = $$5;
            } else {
               this.g($$0);
               this.E();
               this.ag();
            }

            return true;
         }
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 32) {
         if (this.s.y) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.am, this.cR(), 0.3F, 1.0F, false);
            this.bN = this.s.U();
         }
      } else {
         super.a($$0);
      }

   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cy().a() * 4.0;
      if (Double.isNaN($$1) || $$1 == 0.0) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   private void E() {
      if (this.s instanceof agg) {
         ((agg)this.s)
            .a(
               new ig(io.c, cju.n.m()),
               this.df(),
               this.e(0.6666666666666666),
               this.dl(),
               10,
               (double)(this.cW() / 4.0F),
               (double)(this.cX() / 4.0F),
               (double)(this.cW() / 4.0F),
               0.05
            );
      }

   }

   private void g(baw $$0, float $$1) {
      float $$2 = this.ef();
      $$2 -= $$1;
      if ($$2 <= 0.5F) {
         this.h($$0);
         this.ag();
      } else {
         this.c($$2);
         this.a(czv.p, $$0.m());
      }

   }

   private void g(baw $$0) {
      cjt.a(this.s, this.da(), new cax(caz.sB));
      this.h($$0);
   }

   private void h(baw $$0) {
      this.G();
      this.f($$0);

      for(int $$1 = 0; $$1 < this.cc.size(); ++$$1) {
         cax $$2 = this.cc.get($$1);
         if (!$$2.b()) {
            cjt.a(this.s, this.da().b(), $$2);
            this.cc.set($$1, cax.b);
         }
      }

      for(int $$3 = 0; $$3 < this.cd.size(); ++$$3) {
         cax $$4 = this.cd.get($$3);
         if (!$$4.b()) {
            cjt.a(this.s, this.da().b(), $$4);
            this.cd.set($$3, cax.b);
         }
      }

   }

   private void G() {
      this.s.a(null, this.df(), this.dh(), this.dl(), ajw.ak, this.cR(), 1.0F, 1.0F);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.aY = this.w;
      this.aX = this.dq();
      return 0.0F;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * (this.y_() ? 0.5F : 0.9F);
   }

   @Override
   public double bs() {
      return this.t() ? 0.0 : 0.1F;
   }

   @Override
   public void g(dwq $$0) {
      if (this.C()) {
         super.g($$0);
      }
   }

   @Override
   public void m(float $$0) {
      this.aY = this.w = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void l(float $$0) {
      this.aY = this.w = $$0;
      this.ba = this.aZ = $$0;
   }

   @Override
   public void k() {
      super.k();
      hp $$0 = this.Y.a(bH);
      if (!this.cg.equals($$0)) {
         this.a($$0);
      }

      hp $$1 = this.Y.a(bI);
      if (!this.ch.equals($$1)) {
         this.b($$1);
      }

      hp $$2 = this.Y.a(bJ);
      if (!this.ci.equals($$2)) {
         this.c($$2);
      }

      hp $$3 = this.Y.a(bK);
      if (!this.cj.equals($$3)) {
         this.d($$3);
      }

      hp $$4 = this.Y.a(bL);
      if (!this.ck.equals($$4)) {
         this.e($$4);
      }

      hp $$5 = this.Y.a(bM);
      if (!this.cl.equals($$5)) {
         this.f($$5);
      }

   }

   @Override
   protected void F() {
      this.j(this.ce);
   }

   @Override
   public void j(boolean $$0) {
      this.ce = $$0;
      super.j($$0);
   }

   @Override
   public boolean y_() {
      return this.n();
   }

   @Override
   public void ag() {
      this.a(bbn.c.a);
      this.a(czv.q);
   }

   @Override
   public boolean cE() {
      return this.bX();
   }

   @Override
   public dqb c_() {
      return this.t() ? dqb.d : super.c_();
   }

   private void a(boolean $$0) {
      this.Y.b(bG, this.a(this.Y.a(bG), 1, $$0));
   }

   public boolean n() {
      return (this.Y.a(bG) & 1) != 0;
   }

   private void r(boolean $$0) {
      this.Y.b(bG, this.a(this.Y.a(bG), 4, $$0));
   }

   public boolean q() {
      return (this.Y.a(bG) & 4) != 0;
   }

   private void s(boolean $$0) {
      this.Y.b(bG, this.a(this.Y.a(bG), 8, $$0));
   }

   public boolean r() {
      return (this.Y.a(bG) & 8) != 0;
   }

   private void t(boolean $$0) {
      this.Y.b(bG, this.a(this.Y.a(bG), 16, $$0));
   }

   public boolean t() {
      return (this.Y.a(bG) & 16) != 0;
   }

   private byte a(byte $$0, int $$1, boolean $$2) {
      if ($$2) {
         $$0 = (byte)($$0 | $$1);
      } else {
         $$0 = (byte)($$0 & ~$$1);
      }

      return $$0;
   }

   public void a(hp $$0) {
      this.cg = $$0;
      this.Y.b(bH, $$0);
   }

   public void b(hp $$0) {
      this.ch = $$0;
      this.Y.b(bI, $$0);
   }

   public void c(hp $$0) {
      this.ci = $$0;
      this.Y.b(bJ, $$0);
   }

   public void d(hp $$0) {
      this.cj = $$0;
      this.Y.b(bK, $$0);
   }

   public void e(hp $$0) {
      this.ck = $$0;
      this.Y.b(bL, $$0);
   }

   public void f(hp $$0) {
      this.cl = $$0;
      this.Y.b(bM, $$0);
   }

   public hp u() {
      return this.cg;
   }

   public hp w() {
      return this.ch;
   }

   public hp x() {
      return this.ci;
   }

   public hp y() {
      return this.cj;
   }

   public hp z() {
      return this.ck;
   }

   public hp A() {
      return this.cl;
   }

   @Override
   public boolean bk() {
      return super.bk() && !this.t();
   }

   @Override
   public boolean r(bbn $$0) {
      return $$0 instanceof buc && !this.s.a((buc)$$0, this.da());
   }

   @Override
   public bbx eS() {
      return bbx.b;
   }

   @Override
   public bcc.a en() {
      return new bcc.a(ajw.al, ajw.al);
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.am;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.ak;
   }

   @Override
   public void a(agg $$0, bcb $$1) {
   }

   @Override
   public boolean fe() {
      return false;
   }

   @Override
   public void a(aaj<?> $$0) {
      if (bG.equals($$0)) {
         this.z_();
         this.q = !this.t();
      }

      super.a($$0);
   }

   @Override
   public boolean ff() {
      return false;
   }

   @Override
   public bbo a(bco $$0) {
      return this.u(this.t());
   }

   private bbo u(boolean $$0) {
      if ($$0) {
         return bV;
      } else {
         return this.y_() ? bW : this.ad().m();
      }
   }

   @Override
   public dwq j(float $$0) {
      if (this.t()) {
         dwl $$1 = this.u(false).a(this.cY());
         gt $$2 = this.da();
         int $$3 = Integer.MIN_VALUE;

         for(gt $$4 : gt.a(new gt($$1.a, $$1.b, $$1.c), new gt($$1.d, $$1.e, $$1.f))) {
            int $$5 = Math.max(this.s.a(chg.b, $$4), this.s.a(chg.a, $$4));
            if ($$5 == 15) {
               return dwq.a($$4);
            }

            if ($$5 > $$3) {
               $$3 = $$5;
               $$2 = $$4.h();
            }
         }

         return dwq.a($$2);
      } else {
         return super.j($$0);
      }
   }

   @Override
   public cax dn() {
      return new cax(caz.sB);
   }

   @Override
   public boolean dZ() {
      return !this.bX() && !this.t();
   }
}
