import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bce extends bcc {
   private static final aaj<Byte> b = aam.a(bce.class, aal.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 4;
   protected static final int f = 1;
   private static final hs bW = new hs(1, 0, 1);
   public static final float bE = 0.15F;
   public static final float bF = 0.55F;
   public static final float bG = 0.5F;
   public static final float bH = 0.25F;
   public static final String bI = "Leash";
   public static final float bJ = 0.085F;
   public static final int bK = 2;
   public static final int bL = 2;
   public int bM;
   protected int bN;
   protected bhr bO;
   protected bhs bP;
   protected bhq bQ;
   private final bhn bX;
   protected blc bR;
   protected final biq bS;
   protected final biq bT;
   @Nullable
   private bcc bY;
   private final blx bZ;
   private final hi<cax> ca = hi.a(2, cax.b);
   protected final float[] bU = new float[2];
   private final hi<cax> cb = hi.a(4, cax.b);
   protected final float[] bV = new float[4];
   private boolean cc;
   private boolean cd;
   private final Map<dqh, Float> ce = Maps.newEnumMap(dqh.class);
   @Nullable
   private abb cf;
   private long cg;
   @Nullable
   private bbn ch;
   private int ci;
   @Nullable
   private pj cj;
   private gt ck = gt.b;
   private float cl = -1.0F;

   protected bce(bbr<? extends bce> $$0, cgx $$1) {
      super($$0, $$1);
      this.bS = new biq($$1.ad());
      this.bT = new biq($$1.ad());
      this.bO = new bhr(this);
      this.bP = new bhs(this);
      this.bQ = new bhq(this);
      this.bX = this.y();
      this.bR = this.a($$1);
      this.bZ = new blx(this);
      Arrays.fill(this.bV, 0.085F);
      Arrays.fill(this.bU, 0.085F);
      if ($$1 != null && !$$1.y) {
         this.u();
      }

   }

   @Override
   protected void u() {
   }

   public static bdc.a w() {
      return bcc.dA().a(bdd.b, 16.0).a(bdd.g);
   }

   protected blc a(cgx $$0) {
      return new blb(this, $$0);
   }

   protected boolean x() {
      return false;
   }

   public float a(dqh $$0) {
      bce $$1;
      if (this.cQ() instanceof bce && ((bce)this.cQ()).x()) {
         $$1 = (bce)this.cQ();
      } else {
         $$1 = this;
      }

      Float $$3 = (Float)$$1.ce.get($$0);
      return $$3 == null ? $$0.a() : $$3;
   }

   public void a(dqh $$0, float $$1) {
      this.ce.put($$0, $$1);
   }

   public boolean b(dqh $$0) {
      return $$0 != dqh.n && $$0 != dqh.p && $$0 != dqh.r && $$0 != dqh.d;
   }

   protected bhn y() {
      return new bhn(this);
   }

   public bhr z() {
      return this.bO;
   }

   public bhs A() {
      return this.bI() && this.cQ() instanceof bce $$0 ? $$0.A() : this.bP;
   }

   public bhq C() {
      return this.bQ;
   }

   public blc D() {
      return this.bI() && this.cQ() instanceof bce $$0 ? $$0.D() : this.bR;
   }

   public blx E() {
      return this.bZ;
   }

   @Nullable
   public bcc G() {
      return this.bY;
   }

   public void h(@Nullable bcc $$0) {
      this.bY = $$0;
   }

   @Override
   public boolean a(bbr<?> $$0) {
      return $$0 != bbr.I;
   }

   public boolean a(cbm $$0) {
      return false;
   }

   public void I() {
      this.a(czv.n);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, (byte)0);
   }

   public int J() {
      return 80;
   }

   public void K() {
      ajv $$0 = this.r();
      if ($$0 != null) {
         this.a($$0, this.eC(), this.eD());
      }

   }

   @Override
   public void an() {
      super.an();
      this.s.ac().a("mobBaseTick");
      if (this.bo() && this.R.a(1000) < this.bM++) {
         this.n();
         this.K();
      }

      this.s.ac().c();
   }

   @Override
   protected void d(baw $$0) {
      this.n();
      super.d($$0);
   }

   private void n() {
      this.bM = -this.J();
   }

   @Override
   public int dO() {
      if (this.bN > 0) {
         int $$0 = this.bN;

         for(int $$1 = 0; $$1 < this.cb.size(); ++$$1) {
            if (!this.cb.get($$1).b() && this.bV[$$1] <= 1.0F) {
               $$0 += 1 + this.R.a(3);
            }
         }

         for(int $$2 = 0; $$2 < this.ca.size(); ++$$2) {
            if (!this.ca.get($$2).b() && this.bU[$$2] <= 1.0F) {
               $$0 += 1 + this.R.a(3);
            }
         }

         return $$0;
      } else {
         return this.bN;
      }
   }

   public void L() {
      if (this.s.y) {
         for(int $$0 = 0; $$0 < 20; ++$$0) {
            double $$1 = this.R.k() * 0.02;
            double $$2 = this.R.k() * 0.02;
            double $$3 = this.R.k() * 0.02;
            double $$4 = 10.0;
            this.s.a(io.V, this.c(1.0) - $$1 * 10.0, this.di() - $$2 * 10.0, this.g(1.0) - $$3 * 10.0, $$1, $$2, $$3);
         }
      } else {
         this.s.a(this, (byte)20);
      }

   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 20) {
         this.L();
      } else {
         super.a($$0);
      }

   }

   @Override
   public void k() {
      super.k();
      if (!this.s.y) {
         this.fx();
         if (this.S % 5 == 0) {
            this.M();
         }
      }

   }

   protected void M() {
      boolean $$0 = !(this.cG() instanceof bce);
      boolean $$1 = !(this.cQ() instanceof bvv);
      this.bS.a(bip.a.a, $$0);
      this.bS.a(bip.a.c, $$0 && $$1);
      this.bS.a(bip.a.b, $$0);
   }

   @Override
   protected float e(float $$0, float $$1) {
      this.bX.a();
      return $$1;
   }

   @Nullable
   protected ajv r() {
      return null;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fq());
      $$0.a("PersistenceRequired", this.cd);
      pp $$1 = new pp();

      for(cax $$2 : this.cb) {
         pj $$3 = new pj();
         if (!$$2.b()) {
            $$2.b($$3);
         }

         $$1.add($$3);
      }

      $$0.a("ArmorItems", (qc)$$1);
      pp $$4 = new pp();

      for(cax $$5 : this.ca) {
         pj $$6 = new pj();
         if (!$$5.b()) {
            $$5.b($$6);
         }

         $$4.add($$6);
      }

      $$0.a("HandItems", (qc)$$4);
      pp $$7 = new pp();

      for(float $$8 : this.bV) {
         $$7.add(pm.a($$8));
      }

      $$0.a("ArmorDropChances", (qc)$$7);
      pp $$9 = new pp();

      for(float $$10 : this.bU) {
         $$9.add(pm.a($$10));
      }

      $$0.a("HandDropChances", (qc)$$9);
      if (this.ch != null) {
         pj $$11 = new pj();
         if (this.ch instanceof bcc) {
            UUID $$12 = this.ch.co();
            $$11.a("UUID", $$12);
         } else if (this.ch instanceof bqn) {
            gt $$13 = ((bqn)this.ch).w();
            $$11.a("X", $$13.u());
            $$11.a("Y", $$13.v());
            $$11.a("Z", $$13.w());
         }

         $$0.a("Leash", (qc)$$11);
      } else if (this.cj != null) {
         $$0.a("Leash", (qc)this.cj.g());
      }

      $$0.a("LeftHanded", this.fB());
      if (this.cf != null) {
         $$0.a("DeathLootTable", this.cf.toString());
         if (this.cg != 0L) {
            $$0.a("DeathLootTableSeed", this.cg);
         }
      }

      if (this.fA()) {
         $$0.a("NoAI", this.fA());
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("CanPickUpLoot", 1)) {
         this.r($$0.q("CanPickUpLoot"));
      }

      this.cd = $$0.q("PersistenceRequired");
      if ($$0.b("ArmorItems", 9)) {
         pp $$1 = $$0.c("ArmorItems", 10);

         for(int $$2 = 0; $$2 < this.cb.size(); ++$$2) {
            this.cb.set($$2, cax.a($$1.a($$2)));
         }
      }

      if ($$0.b("HandItems", 9)) {
         pp $$3 = $$0.c("HandItems", 10);

         for(int $$4 = 0; $$4 < this.ca.size(); ++$$4) {
            this.ca.set($$4, cax.a($$3.a($$4)));
         }
      }

      if ($$0.b("ArmorDropChances", 9)) {
         pp $$5 = $$0.c("ArmorDropChances", 5);

         for(int $$6 = 0; $$6 < $$5.size(); ++$$6) {
            this.bV[$$6] = $$5.i($$6);
         }
      }

      if ($$0.b("HandDropChances", 9)) {
         pp $$7 = $$0.c("HandDropChances", 5);

         for(int $$8 = 0; $$8 < $$7.size(); ++$$8) {
            this.bU[$$8] = $$7.i($$8);
         }
      }

      if ($$0.b("Leash", 10)) {
         this.cj = $$0.p("Leash");
      }

      this.t($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.cf = new abb($$0.l("DeathLootTable"));
         this.cg = $$0.i("DeathLootTableSeed");
      }

      this.s($$0.q("NoAI"));
   }

   @Override
   protected void a(baw $$0, boolean $$1) {
      super.a($$0, $$1);
      this.cf = null;
   }

   @Override
   protected dsd.a a(boolean $$0, baw $$1) {
      return super.a($$0, $$1).a(this.cg, this.R);
   }

   @Override
   public final abb ek() {
      return this.cf == null ? this.N() : this.cf;
   }

   protected abb N() {
      return super.ek();
   }

   public void u(float $$0) {
      this.bq = $$0;
   }

   public void v(float $$0) {
      this.bp = $$0;
   }

   public void w(float $$0) {
      this.bo = $$0;
   }

   @Override
   public void r(float $$0) {
      super.r($$0);
      this.u($$0);
   }

   @Override
   public void w_() {
      super.w_();
      this.s.ac().a("looting");
      if (!this.s.y && this.fq() && this.bo() && !this.be && this.s.W().b(cgt.c)) {
         hs $$0 = this.O();

         for(bqv $$2 : this.s.a(bqv.class, this.cy().c((double)$$0.u(), (double)$$0.v(), (double)$$0.w()))) {
            if (!$$2.dt() && !$$2.i().b() && !$$2.s() && this.l($$2.i())) {
               this.b($$2);
            }
         }
      }

      this.s.ac().c();
   }

   protected hs O() {
      return bW;
   }

   protected void b(bqv $$0) {
      cax $$1 = $$0.i();
      if (this.j($$1)) {
         this.a($$0);
         this.a($$0, $$1.K());
         $$0.ah();
      }

   }

   public boolean j(cax $$0) {
      bbs $$1 = i($$0);
      cax $$2 = this.c($$1);
      boolean $$3 = this.a($$0, $$2);
      if ($$3 && this.k($$0)) {
         double $$4 = (double)this.f($$1);
         if (!$$2.b() && (double)Math.max(this.R.i() - 0.1F, 0.0F) < $$4) {
            this.b($$2);
         }

         this.b($$1, $$0);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void b(bbs $$0, cax $$1) {
      this.a($$0, $$1);
      this.e($$0);
      this.cd = true;
   }

   public void e(bbs $$0) {
      switch($$0.a()) {
         case a:
            this.bU[$$0.b()] = 2.0F;
            break;
         case b:
            this.bV[$$0.b()] = 2.0F;
      }

   }

   protected boolean a(cax $$0, cax $$1) {
      if ($$1.b()) {
         return true;
      } else if ($$0.c() instanceof ccf) {
         if (!($$1.c() instanceof ccf)) {
            return true;
         } else {
            ccf $$2 = (ccf)$$0.c();
            ccf $$3 = (ccf)$$1.c();
            if ($$2.i() != $$3.i()) {
               return $$2.i() > $$3.i();
            } else {
               return this.b($$0, $$1);
            }
         }
      } else if ($$0.c() instanceof bzc && $$1.c() instanceof bzc) {
         return this.b($$0, $$1);
      } else if ($$0.c() instanceof bzk && $$1.c() instanceof bzk) {
         return this.b($$0, $$1);
      } else if ($$0.c() instanceof byo) {
         if (cet.d($$1)) {
            return false;
         } else if (!($$1.c() instanceof byo)) {
            return true;
         } else {
            byo $$4 = (byo)$$0.c();
            byo $$5 = (byo)$$1.c();
            if ($$4.e() != $$5.e()) {
               return $$4.e() > $$5.e();
            } else if ($$4.f() != $$5.f()) {
               return $$4.f() > $$5.f();
            } else {
               return this.b($$0, $$1);
            }
         }
      } else {
         if ($$0.c() instanceof bzm) {
            if ($$1.c() instanceof byx) {
               return true;
            }

            if ($$1.c() instanceof bzm) {
               bzm $$6 = (bzm)$$0.c();
               bzm $$7 = (bzm)$$1.c();
               if ($$6.d() != $$7.d()) {
                  return $$6.d() > $$7.d();
               }

               return this.b($$0, $$1);
            }
         }

         return false;
      }
   }

   public boolean b(cax $$0, cax $$1) {
      if ($$0.j() >= $$1.j() && (!$$0.t() || $$1.t())) {
         if ($$0.t() && $$1.t()) {
            return $$0.u().d().stream().anyMatch($$0x -> !$$0x.equals("Damage")) && !$$1.u().d().stream().anyMatch($$0x -> !$$0x.equals("Damage"));
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public boolean k(cax $$0) {
      return true;
   }

   public boolean l(cax $$0) {
      return this.k($$0);
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean P() {
      return this.bI();
   }

   protected boolean Q() {
      return false;
   }

   @Override
   public void dm() {
      if (this.s.ag() == bag.a && this.Q()) {
         this.ah();
      } else if (!this.fr() && !this.P()) {
         bbn $$0 = this.s.a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.f(this);
            int $$2 = this.ad().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.ah();
            }

            int $$4 = this.ad().f().g();
            int $$5 = $$4 * $$4;
            if (this.bf > 600 && this.R.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.ah();
            } else if ($$1 < (double)$$5) {
               this.bf = 0;
            }
         }

      } else {
         this.bf = 0;
      }
   }

   @Override
   protected final void eM() {
      ++this.bf;
      this.s.ac().a("sensing");
      this.bZ.a();
      this.s.ac().c();
      int $$0 = this.s.n().ag() + this.ae();
      if ($$0 % 2 != 0 && this.S > 1) {
         this.s.ac().a("targetSelector");
         this.bT.a(false);
         this.s.ac().c();
         this.s.ac().a("goalSelector");
         this.bS.a(false);
         this.s.ac().c();
      } else {
         this.s.ac().a("targetSelector");
         this.bT.b();
         this.s.ac().c();
         this.s.ac().a("goalSelector");
         this.bS.b();
         this.s.ac().c();
      }

      this.s.ac().a("navigation");
      this.bR.c();
      this.s.ac().c();
      this.s.ac().a("mob tick");
      this.T();
      this.s.ac().c();
      this.s.ac().a("controls");
      this.s.ac().a("move");
      this.bP.a();
      this.s.ac().b("look");
      this.bO.a();
      this.s.ac().b("jump");
      this.bQ.b();
      this.s.ac().c();
      this.s.ac().c();
      this.R();
   }

   protected void R() {
      xl.a(this.s, this, this.bS);
   }

   protected void T() {
   }

   public int U() {
      return 40;
   }

   public int V() {
      return 75;
   }

   public int fn() {
      return 10;
   }

   public void a(bbn $$0, float $$1, float $$2) {
      double $$3 = $$0.df() - this.df();
      double $$4 = $$0.dl() - this.dl();
      double $$6;
      if ($$0 instanceof bcc $$5) {
         $$6 = $$5.dj() - this.dj();
      } else {
         $$6 = ($$0.cy().b + $$0.cy().e) / 2.0 - this.dj();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(ami.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(ami.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.p(this.a(this.ds(), $$10, $$2));
      this.o(this.a(this.dq(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = ami.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bbr<? extends bce> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      gt $$5 = $$3.c();
      return $$2 == bcg.c || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(cgy $$0, bcg $$1) {
      return true;
   }

   public boolean a(cha $$0) {
      return !$$0.d(this.cy()) && $$0.f(this);
   }

   public int fo() {
      return 4;
   }

   public boolean d(int $$0) {
      return false;
   }

   @Override
   public int cl() {
      if (this.G() == null) {
         return 3;
      } else {
         int $$0 = (int)(this.ef() - this.et() * 0.33F);
         $$0 -= (3 - this.s.ag().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return $$0 + 3;
      }
   }

   @Override
   public Iterable<cax> bE() {
      return this.ca;
   }

   @Override
   public Iterable<cax> bF() {
      return this.cb;
   }

   @Override
   public cax c(bbs $$0) {
      switch($$0.a()) {
         case a:
            return this.ca.get($$0.b());
         case b:
            return this.cb.get($$0.b());
         default:
            return cax.b;
      }
   }

   @Override
   public void a(bbs $$0, cax $$1) {
      this.f($$1);
      switch($$0.a()) {
         case a:
            this.a($$0, this.ca.set($$0.b(), $$1), $$1);
            break;
         case b:
            this.a($$0, this.cb.set($$0.b(), $$1), $$1);
      }

   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for(bbs $$3 : bbs.values()) {
         cax $$4 = this.c($$3);
         float $$5 = this.f($$3);
         boolean $$6 = $$5 > 1.0F;
         if (!$$4.b() && !cet.e($$4) && ($$2 || $$6) && Math.max(this.R.i() - (float)$$1 * 0.01F, 0.0F) < $$5) {
            if (!$$6 && $$4.h()) {
               $$4.b($$4.k() - this.R.a(1 + this.R.a(Math.max($$4.k() - 3, 1))));
            }

            this.b($$4);
            this.a($$3, cax.b);
         }
      }

   }

   protected float f(bbs $$0) {
      return switch($$0.a()) {
         case a -> this.bU[$$0.b()];
         case b -> this.bV[$$0.b()];
         default -> 0.0F;
      };
   }

   protected void a(amn $$0, bah $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.s.ag() == bag.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            ++$$2;
         }

         if ($$0.i() < 0.095F) {
            ++$$2;
         }

         if ($$0.i() < 0.095F) {
            ++$$2;
         }

         boolean $$4 = true;

         for(bbs $$5 : bbs.values()) {
            if ($$5.a() == bbs.a.b) {
               cax $$6 = this.c($$5);
               if (!$$4 && $$0.i() < $$3) {
                  break;
               }

               $$4 = false;
               if ($$6.b()) {
                  cat $$7 = a($$5, $$2);
                  if ($$7 != null) {
                     this.a($$5, new cax($$7));
                  }
               }
            }
         }
      }

   }

   @Nullable
   public static cat a(bbs $$0, int $$1) {
      switch($$0) {
         case f:
            if ($$1 == 0) {
               return caz.nU;
            } else if ($$1 == 1) {
               return caz.ok;
            } else if ($$1 == 2) {
               return caz.nY;
            } else if ($$1 == 3) {
               return caz.oc;
            } else if ($$1 == 4) {
               return caz.og;
            }
         case e:
            if ($$1 == 0) {
               return caz.nV;
            } else if ($$1 == 1) {
               return caz.ol;
            } else if ($$1 == 2) {
               return caz.nZ;
            } else if ($$1 == 3) {
               return caz.od;
            } else if ($$1 == 4) {
               return caz.oh;
            }
         case d:
            if ($$1 == 0) {
               return caz.nW;
            } else if ($$1 == 1) {
               return caz.om;
            } else if ($$1 == 2) {
               return caz.oa;
            } else if ($$1 == 3) {
               return caz.oe;
            } else if ($$1 == 4) {
               return caz.oi;
            }
         case c:
            if ($$1 == 0) {
               return caz.nX;
            } else if ($$1 == 1) {
               return caz.on;
            } else if ($$1 == 2) {
               return caz.ob;
            } else if ($$1 == 3) {
               return caz.of;
            } else if ($$1 == 4) {
               return caz.oj;
            }
         default:
            return null;
      }
   }

   protected void b(amn $$0, bah $$1) {
      float $$2 = $$1.d();
      this.a($$0, $$2);

      for(bbs $$3 : bbs.values()) {
         if ($$3.a() == bbs.a.b) {
            this.a($$0, $$2, $$3);
         }
      }

   }

   protected void a(amn $$0, float $$1) {
      if (!this.ez().b() && $$0.i() < 0.25F * $$1) {
         this.a(bbs.a, cet.a($$0, this.ez(), (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }

   }

   protected void a(amn $$0, float $$1, bbs $$2) {
      cax $$3 = this.c($$2);
      if (!$$3.b() && $$0.i() < 0.5F * $$1) {
         this.a($$2, cet.a($$0, $$3, (int)(5.0F + $$1 * (float)$$0.a(18)), false));
      }

   }

   @Nullable
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      this.a(bdd.b).c(new bdb("Random spawn bonus", $$5.a(0.0, 0.11485000000000001), bdb.a.b));
      if ($$5.i() < 0.05F) {
         this.t(true);
      } else {
         this.t(false);
      }

      return $$3;
   }

   public void fp() {
      this.cd = true;
   }

   public void a(bbs $$0, float $$1) {
      switch($$0.a()) {
         case a:
            this.bU[$$0.b()] = $$1;
            break;
         case b:
            this.bV[$$0.b()] = $$1;
      }

   }

   public boolean fq() {
      return this.cc;
   }

   public void r(boolean $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean g(cax $$0) {
      bbs $$1 = i($$0);
      return this.c($$1).b() && this.fq();
   }

   public boolean fr() {
      return this.cd;
   }

   @Override
   public final baj a(buc $$0, bai $$1) {
      if (!this.bo()) {
         return baj.d;
      } else if (this.fz() == $$0) {
         this.a(true, !$$0.fB().d);
         return baj.a(this.s.y);
      } else {
         baj $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            return $$2;
         } else {
            $$2 = this.b($$0, $$1);
            if ($$2.a()) {
               this.a(czv.r);
               return $$2;
            } else {
               return super.a($$0, $$1);
            }
         }
      }
   }

   private baj c(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.sG) && this.a($$0)) {
         this.b($$0, true);
         $$2.g(1);
         return baj.a(this.s.y);
      } else {
         if ($$2.a(caz.sH)) {
            baj $$3 = $$2.a($$0, this, $$1);
            if ($$3.a()) {
               return $$3;
            }
         }

         if ($$2.c() instanceof cbz) {
            if (this.s instanceof agg) {
               cbz $$4 = (cbz)$$2.c();
               Optional<bce> $$5 = $$4.a($$0, this, this.ad(), (agg)this.s, this.cY(), $$2);
               $$5.ifPresent($$1x -> this.a($$0, $$1x));
               return $$5.isPresent() ? baj.a : baj.d;
            } else {
               return baj.b;
            }
         } else {
            return baj.d;
         }
      }
   }

   protected void a(buc $$0, bce $$1) {
   }

   protected baj b(buc $$0, bai $$1) {
      return baj.d;
   }

   public boolean fs() {
      return this.a(this.da());
   }

   public boolean a(gt $$0) {
      if (this.cl == -1.0F) {
         return true;
      } else {
         return this.ck.j($$0) < (double)(this.cl * this.cl);
      }
   }

   public void a(gt $$0, int $$1) {
      this.ck = $$0;
      this.cl = (float)$$1;
   }

   public gt ft() {
      return this.ck;
   }

   public float fu() {
      return this.cl;
   }

   public void fv() {
      this.cl = -1.0F;
   }

   public boolean fw() {
      return this.cl != -1.0F;
   }

   @Nullable
   public <T extends bce> T a(bbr<T> $$0, boolean $$1) {
      if (this.dt()) {
         return null;
      } else {
         T $$2 = $$0.a(this.s);
         $$2.s(this);
         $$2.a(this.y_());
         $$2.s(this.fA());
         if (this.Y()) {
            $$2.b(this.Z());
            $$2.n(this.ct());
         }

         if (this.fr()) {
            $$2.fp();
         }

         $$2.m(this.ci());
         if ($$1) {
            $$2.r(this.fq());

            for(bbs $$3 : bbs.values()) {
               cax $$4 = this.c($$3);
               if (!$$4.b()) {
                  $$2.a($$3, $$4.o());
                  $$2.a($$3, this.f($$3));
                  $$4.e(0);
               }
            }
         }

         this.s.b($$2);
         if (this.bI()) {
            bbn $$5 = this.cQ();
            this.p();
            $$2.a($$5, true);
         }

         this.ah();
         return $$2;
      }
   }

   protected void fx() {
      if (this.cj != null) {
         this.fG();
      }

      if (this.ch != null) {
         if (!this.bo() || !this.ch.bo()) {
            this.a(true, true);
         }

      }
   }

   public void a(boolean $$0, boolean $$1) {
      if (this.ch != null) {
         this.ch = null;
         this.cj = null;
         if (!this.s.y && $$1) {
            this.a(caz.sG);
         }

         if (!this.s.y && $$0 && this.s instanceof agg) {
            ((agg)this.s).k().b(this, new wj(this, null));
         }
      }

   }

   public boolean a(buc $$0) {
      return !this.fy() && !(this instanceof bri);
   }

   public boolean fy() {
      return this.ch != null;
   }

   @Nullable
   public bbn fz() {
      if (this.ch == null && this.ci != 0 && this.s.y) {
         this.ch = this.s.a(this.ci);
      }

      return this.ch;
   }

   public void b(bbn $$0, boolean $$1) {
      this.ch = $$0;
      this.cj = null;
      if (!this.s.y && $$1 && this.s instanceof agg) {
         ((agg)this.s).k().b(this, new wj(this, this.ch));
      }

      if (this.bI()) {
         this.p();
      }

   }

   public void r(int $$0) {
      this.ci = $$0;
      this.a(false, false);
   }

   @Override
   public boolean a(bbn $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.fy()) {
         this.a(true, true);
      }

      return $$2;
   }

   private void fG() {
      if (this.cj != null && this.s instanceof agg) {
         if (this.cj.b("UUID")) {
            UUID $$0 = this.cj.a("UUID");
            bbn $$1 = ((agg)this.s).a($$0);
            if ($$1 != null) {
               this.b($$1, true);
               return;
            }
         } else if (this.cj.b("X", 99) && this.cj.b("Y", 99) && this.cj.b("Z", 99)) {
            gt $$2 = pv.b(this.cj);
            this.b(bqp.b(this.s, $$2), true);
            return;
         }

         if (this.S > 100) {
            this.a(caz.sG);
            this.cj = null;
         }
      }

   }

   @Override
   public boolean cP() {
      return this.cH() && super.cP();
   }

   @Override
   public boolean eP() {
      return super.eP() && !this.fA();
   }

   public void s(boolean $$0) {
      byte $$1 = this.Y.a(b);
      this.Y.b(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void t(boolean $$0) {
      byte $$1 = this.Y.a(b);
      this.Y.b(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void u(boolean $$0) {
      byte $$1 = this.Y.a(b);
      this.Y.b(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean fA() {
      return (this.Y.a(b) & 1) != 0;
   }

   public boolean fB() {
      return (this.Y.a(b) & 2) != 0;
   }

   public boolean fC() {
      return (this.Y.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bbx eS() {
      return this.fB() ? bbx.a : bbx.b;
   }

   public double i(bcc $$0) {
      return (double)(this.cW() * 2.0F * this.cW() * 2.0F + $$0.cW());
   }

   public boolean j(bcc $$0) {
      double $$1 = this.h($$0.df(), $$0.dh(), $$0.dl());
      return $$1 <= this.i($$0);
   }

   @Override
   public boolean z(bbn $$0) {
      float $$1 = (float)this.b(bdd.f);
      float $$2 = (float)this.b(bdd.g);
      if ($$0 instanceof bcc) {
         $$1 += cet.a(this.ez(), ((bcc)$$0).ey());
         $$2 += (float)cet.c(this);
      }

      int $$3 = cet.d(this);
      if ($$3 > 0) {
         $$0.f($$3 * 4);
      }

      boolean $$4 = $$0.a(baw.c(this), $$1);
      if ($$4) {
         if ($$2 > 0.0F && $$0 instanceof bcc) {
            ((bcc)$$0).p((double)($$2 * 0.5F), (double)ami.a(this.dq() * (float) (Math.PI / 180.0)), (double)(-ami.b(this.dq() * (float) (Math.PI / 180.0))));
            this.f(this.dd().d(0.6, 1.0, 0.6));
         }

         if ($$0 instanceof buc $$5) {
            this.a($$5, this.ez(), $$5.eT() ? $$5.eV() : cax.b);
         }

         this.a(this, $$0);
         this.x($$0);
      }

      return $$4;
   }

   private void a(buc $$0, cax $$1, cax $$2) {
      if (!$$1.b() && !$$2.b() && $$1.c() instanceof byt && $$2.a(caz.tm)) {
         float $$3 = 0.25F + (float)cet.g(this) * 0.05F;
         if (this.R.i() < $$3) {
            $$0.fW().a(caz.tm, 100);
            this.s.a($$0, (byte)30);
         }
      }

   }

   protected boolean fD() {
      if (this.s.M() && !this.s.y) {
         float $$0 = this.bg();
         gt $$1 = new gt(this.df(), this.dj(), this.dl());
         boolean $$2 = this.aT() || this.al || this.am;
         if ($$0 > 0.5F && this.R.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.s.g($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(akz<dpu> $$0) {
      if (this.D().q()) {
         super.c($$0);
      } else {
         this.f(this.dd().b(0.0, 0.3, 0.0));
      }

   }

   public void fE() {
      this.bS.a();
      this.dy().g();
   }

   @Override
   protected void cj() {
      super.cj();
      this.a(true, false);
      this.bG().forEach($$0 -> $$0.e(0));
   }

   @Nullable
   @Override
   public cax dn() {
      cbz $$0 = cbz.a(this.ad());
      return $$0 == null ? null : new cax($$0);
   }

   public Iterable<gt> fF() {
      return ImmutableSet.of(
         new gt(this.cy().a, (double)this.dg(), this.cy().c),
         new gt(this.cy().a, (double)this.dg(), this.cy().f),
         new gt(this.cy().d, (double)this.dg(), this.cy().c),
         new gt(this.cy().d, (double)this.dg(), this.cy().f)
      );
   }
}
