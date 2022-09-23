import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bcc extends bbn {
   private static final Logger b = LogUtils.getLogger();
   private static final UUID c = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
   private static final UUID d = UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038");
   private static final UUID e = UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce");
   private static final bdb bE = new bdb(c, "Sprinting speed boost", 0.3F, bdb.a.c);
   public static final int ao = 2;
   public static final int ap = 4;
   public static final int aq = 98;
   public static final int ar = 100;
   public static final int as = 6;
   public static final int at = 100;
   private static final int bF = 40;
   public static final double au = 0.003;
   public static final double av = 0.08;
   public static final int aw = 20;
   private static final int bG = 7;
   private static final int bH = 10;
   private static final int bI = 2;
   public static final int ax = 4;
   private static final double bJ = 128.0;
   protected static final int ay = 1;
   protected static final int az = 2;
   protected static final int aA = 4;
   protected static final aaj<Byte> aB = aam.a(bcc.class, aal.a);
   private static final aaj<Float> bK = aam.a(bcc.class, aal.c);
   private static final aaj<Integer> bL = aam.a(bcc.class, aal.b);
   private static final aaj<Boolean> bM = aam.a(bcc.class, aal.i);
   private static final aaj<Integer> bN = aam.a(bcc.class, aal.b);
   private static final aaj<Integer> bO = aam.a(bcc.class, aal.b);
   private static final aaj<Optional<gt>> bP = aam.a(bcc.class, aal.m);
   protected static final float aC = 1.74F;
   protected static final bbo aD = bbo.c(0.2F, 0.2F);
   public static final float aE = 0.5F;
   private final bda bQ;
   private final bav bR = new bav(this);
   private final Map<bbe, bbg> bS = Maps.newHashMap();
   private final hi<cax> bT = hi.a(2, cax.b);
   private final hi<cax> bU = hi.a(4, cax.b);
   public boolean aF;
   private boolean bV = false;
   public bai aG;
   public int aH;
   public int aI;
   public int aJ;
   public int aK;
   public int aL;
   public float aM;
   public int aN;
   public float aO;
   public float aP;
   protected int aQ;
   public float aR;
   public float aS;
   public float aT;
   public final int aU = 20;
   public final float aV;
   public final float aW;
   public float aX;
   public float aY;
   public float aZ;
   public float ba;
   public float bb = 0.02F;
   @Nullable
   protected buc bc;
   protected int bd;
   protected boolean be;
   protected int bf;
   protected float bg;
   protected float bh;
   protected float bi;
   protected float bj;
   protected float bk;
   protected int bl;
   protected float bm;
   protected boolean bn;
   public float bo;
   public float bp;
   public float bq;
   protected int br;
   protected double bs;
   protected double bt;
   protected double bu;
   protected double bv;
   protected double bw;
   protected double bx;
   protected int by;
   private boolean bW = true;
   @Nullable
   private bcc bX;
   private int bY;
   private bcc bZ;
   private int ca;
   private float cb;
   private int cc;
   private float cd;
   protected cax bz = cax.b;
   protected int bA;
   protected int bB;
   private gt ce;
   private Optional<gt> cf = Optional.empty();
   @Nullable
   private baw cg;
   private long ch;
   protected int bC;
   private float ci;
   private float cj;
   protected bcx<?> bD;
   private boolean ck;

   protected bcc(bbr<? extends bcc> $$0, cgx $$1) {
      super($$0, $$1);
      this.bQ = new bda(bde.a($$0));
      this.c(this.et());
      this.q = true;
      this.aW = (float)((Math.random() + 1.0) * 0.01F);
      this.am();
      this.aV = (float)Math.random() * 12398.0F;
      this.o((float)(Math.random() * (float) (Math.PI * 2)));
      this.aZ = this.dq();
      this.P = 0.6F;
      pu $$2 = pu.a;
      this.bD = this.a(new Dynamic($$2, (qc)$$2.createMap(ImmutableMap.of($$2.a("memories"), (qc)$$2.emptyMap()))));
   }

   public bcx<?> dy() {
      return this.bD;
   }

   protected bcx.b<?> dz() {
      return bcx.a(ImmutableList.of(), ImmutableList.of());
   }

   protected bcx<?> a(Dynamic<?> $$0) {
      return this.dz().a($$0);
   }

   @Override
   public void ag() {
      this.a(baw.m, Float.MAX_VALUE);
   }

   public boolean a(bbr<?> $$0) {
      return true;
   }

   @Override
   protected void a_() {
      this.Y.a(aB, (byte)0);
      this.Y.a(bL, 0);
      this.Y.a(bM, false);
      this.Y.a(bN, 0);
      this.Y.a(bO, 0);
      this.Y.a(bK, 1.0F);
      this.Y.a(bP, Optional.empty());
   }

   public static bdc.a dA() {
      return bdc.a().a(bdd.a).a(bdd.c).a(bdd.d).a(bdd.i).a(bdd.j);
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
      if (!this.aR()) {
         this.aZ();
      }

      if (!this.s.y && $$1 && this.L > 0.0F) {
         this.dF();
         this.dG();
      }

      if (!this.s.y && this.L > 3.0F && $$1) {
         float $$4 = (float)ami.f(this.L - 3.0F);
         if (!$$2.h()) {
            double $$5 = Math.min((double)(0.2F + $$4 / 15.0F), 2.5);
            int $$6 = (int)(150.0 * $$5);
            ((agg)this.s).a(new ig(io.c, $$2), this.df(), this.dh(), this.dl(), $$6, 0.0, 0.0, 0.0, 0.15F);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public boolean dB() {
      return this.ey() == bch.b;
   }

   public float a(float $$0) {
      return ami.i($$0, this.cj, this.ci);
   }

   @Override
   public void an() {
      this.aO = this.aP;
      if (this.X) {
         this.fh().ifPresent(this::a);
      }

      if (this.dC()) {
         this.dD();
      }

      super.an();
      this.s.ac().a("livingEntityBaseTick");
      if (this.aQ() || this.s.y) {
         this.au();
      }

      if (this.bo()) {
         boolean $$0 = this instanceof buc;
         if (this.bp()) {
            this.a(baw.f, 1.0F);
         } else if ($$0 && !this.s.p_().a(this.cy())) {
            double $$1 = this.s.p_().a(this) + this.s.p_().n();
            if ($$1 < 0.0) {
               double $$2 = this.s.p_().o();
               if ($$2 > 0.0) {
                  this.a(baw.f, (float)Math.max(1, ami.b(-$$1 * $$2)));
               }
            }
         }

         if (this.a(akp.a) && !this.s.a_(new gt(this.df(), this.dj(), this.dl())).a(cju.lO)) {
            boolean $$3 = !this.dB() && !bbh.c(this) && (!$$0 || !((buc)this).fB().a);
            if ($$3) {
               this.i(this.m(this.ca()));
               if (this.ca() == -20) {
                  this.i(0);
                  dwq $$4 = this.dd();

                  for(int $$5 = 0; $$5 < 8; ++$$5) {
                     double $$6 = this.R.j() - this.R.j();
                     double $$7 = this.R.j() - this.R.j();
                     double $$8 = this.R.j() - this.R.j();
                     this.s.a(io.e, this.df() + $$6, this.dh() + $$7, this.dl() + $$8, $$4.c, $$4.d, $$4.e);
                  }

                  this.a(baw.h, 2.0F);
               }
            }

            if (!this.s.y && this.bI() && this.cQ() != null && !this.cQ().bK()) {
               this.p();
            }
         } else if (this.ca() < this.bZ()) {
            this.i(this.n(this.ca()));
         }

         if (!this.s.y) {
            gt $$9 = this.da();
            if (!Objects.equal(this.ce, $$9)) {
               this.ce = $$9;
               this.c($$9);
            }
         }
      }

      if (this.bo() && (this.aT() || this.al)) {
         if (!this.s.y && this.an) {
            this.ay();
         }

         this.au();
      }

      if (this.aK > 0) {
         --this.aK;
      }

      if (this.W > 0 && !(this instanceof agh)) {
         --this.W;
      }

      if (this.eg() && this.s.h(this)) {
         this.dL();
      }

      if (this.bd > 0) {
         --this.bd;
      } else {
         this.bc = null;
      }

      if (this.bZ != null && !this.bZ.bo()) {
         this.bZ = null;
      }

      if (this.bX != null) {
         if (!this.bX.bo()) {
            this.a(null);
         } else if (this.S - this.bY > 100) {
            this.a(null);
         }
      }

      this.dX();
      this.bj = this.bi;
      this.aY = this.aX;
      this.ba = this.aZ;
      this.w = this.dq();
      this.x = this.ds();
      this.s.ac().c();
   }

   public boolean dC() {
      return this.S % 5 == 0 && this.dd().c != 0.0 && this.dd().e != 0.0 && !this.B_() && cet.k(this) && this.dE();
   }

   protected void dD() {
      dwq $$0 = this.dd();
      this.s
         .a(
            io.H,
            this.df() + (this.R.j() - 0.5) * (double)this.cW(),
            this.dh() + 0.1,
            this.dl() + (this.R.j() - 0.5) * (double)this.cW(),
            $$0.c * -0.2,
            0.1,
            $$0.e * -0.2
         );
      float $$1 = this.R.i() * 0.4F + this.R.i() > 0.9F ? 0.6F : 0.0F;
      this.a(ajw.tw, $$1, 0.6F + this.R.i() * 0.4F);
   }

   protected boolean dE() {
      return this.s.a_(this.aE()).a(akl.aE);
   }

   @Override
   protected float aD() {
      return this.dE() && cet.a(cev.l, this) > 0 ? 1.0F : super.aD();
   }

   protected boolean b(cvo $$0) {
      return !$$0.h() || this.fc();
   }

   protected void dF() {
      bcz $$0 = this.a(bdd.d);
      if ($$0 != null) {
         if ($$0.a(d) != null) {
            $$0.b(d);
         }

      }
   }

   protected void dG() {
      if (!this.bb().h()) {
         int $$0 = cet.a(cev.l, this);
         if ($$0 > 0 && this.dE()) {
            bcz $$1 = this.a(bdd.d);
            if ($$1 == null) {
               return;
            }

            $$1.b(new bdb(d, "Soul speed boost", (double)(0.03F * (1.0F + (float)$$0 * 0.35F)), bdb.a.a));
            if (this.dQ().i() < 0.04F) {
               cax $$2 = this.c(bbs.c);
               $$2.a(1, this, $$0x -> $$0x.d(bbs.c));
            }
         }
      }

   }

   protected void dH() {
      bcz $$0 = this.a(bdd.d);
      if ($$0 != null) {
         if ($$0.a(e) != null) {
            $$0.b(e);
         }

      }
   }

   protected void dI() {
      if (!this.bb().h()) {
         int $$0 = this.cb();
         if ($$0 > 0) {
            bcz $$1 = this.a(bdd.d);
            if ($$1 == null) {
               return;
            }

            float $$2 = -0.05F * this.cc();
            $$1.b(new bdb(e, "Powder snow slow", (double)$$2, bdb.a.a));
         }
      }

   }

   protected void c(gt $$0) {
      int $$1 = cet.a(cev.j, this);
      if ($$1 > 0) {
         cey.a(this, this.s, $$0, $$1);
      }

      if (this.b(this.bb())) {
         this.dF();
      }

      this.dG();
   }

   public boolean y_() {
      return false;
   }

   public float dJ() {
      return this.y_() ? 0.5F : 1.0F;
   }

   protected boolean dK() {
      return true;
   }

   @Override
   public boolean bK() {
      return false;
   }

   protected void dL() {
      ++this.aN;
      if (this.aN == 20 && !this.s.k_()) {
         this.s.a(this, (byte)60);
         this.a(bbn.c.a);
      }

   }

   public boolean dM() {
      return !this.y_();
   }

   protected boolean dN() {
      return !this.y_();
   }

   protected int m(int $$0) {
      int $$1 = cet.e(this);
      return $$1 > 0 && this.R.a($$1 + 1) > 0 ? $$0 : $$0 - 1;
   }

   protected int n(int $$0) {
      return Math.min($$0 + 4, this.bZ());
   }

   public int dO() {
      return 0;
   }

   protected boolean dP() {
      return false;
   }

   public amn dQ() {
      return this.R;
   }

   @Nullable
   public bcc dR() {
      return this.bX;
   }

   public int dS() {
      return this.bY;
   }

   public void d(@Nullable buc $$0) {
      this.bc = $$0;
      this.bd = this.S;
   }

   public void a(@Nullable bcc $$0) {
      this.bX = $$0;
      this.bY = this.S;
   }

   @Nullable
   public bcc dT() {
      return this.bZ;
   }

   public int dU() {
      return this.ca;
   }

   public void x(bbn $$0) {
      if ($$0 instanceof bcc) {
         this.bZ = (bcc)$$0;
      } else {
         this.bZ = null;
      }

      this.ca = this.S;
   }

   public int dV() {
      return this.bf;
   }

   public void o(int $$0) {
      this.bf = $$0;
   }

   public boolean dW() {
      return this.bV;
   }

   public void p(boolean $$0) {
      this.bV = $$0;
   }

   protected boolean a(bbs $$0) {
      return true;
   }

   public void a(bbs $$0, cax $$1, cax $$2) {
      boolean $$3 = $$2.b() && $$1.b();
      if (!$$3 && !cax.d($$1, $$2) && !this.X) {
         if ($$0.a() == bbs.a.b) {
            this.c($$2);
         }

         if (this.a($$0)) {
            this.a(czv.v);
         }

      }
   }

   protected void c(cax $$0) {
      if (!$$0.b() && !this.B_()) {
         ajv $$1 = $$0.O();
         if ($$1 != null) {
            this.a($$1, 1.0F, 1.0F);
         }

      }
   }

   @Override
   public void b(pj $$0) {
      $$0.a("Health", this.ef());
      $$0.a("HurtTime", (short)this.aK);
      $$0.a("HurtByTimestamp", this.bY);
      $$0.a("DeathTime", (short)this.aN);
      $$0.a("AbsorptionAmount", this.eQ());
      $$0.a("Attributes", (qc)this.ex().c());
      if (!this.bS.isEmpty()) {
         pp $$1 = new pp();

         for(bbg $$2 : this.bS.values()) {
            $$1.add($$2.a(new pj()));
         }

         $$0.a("ActiveEffects", (qc)$$1);
      }

      $$0.a("FallFlying", this.fc());
      this.fh().ifPresent($$1 -> {
         $$0.a("SleepingX", $$1.u());
         $$0.a("SleepingY", $$1.v());
         $$0.a("SleepingZ", $$1.w());
      });
      DataResult<qc> $$3 = this.bD.a(pu.a);
      $$3.resultOrPartial(b::error).ifPresent($$1 -> $$0.a("Brain", $$1));
   }

   @Override
   public void a(pj $$0) {
      this.t($$0.j("AbsorptionAmount"));
      if ($$0.b("Attributes", 9) && this.s != null && !this.s.y) {
         this.ex().a($$0.c("Attributes", 10));
      }

      if ($$0.b("ActiveEffects", 9)) {
         pp $$1 = $$0.c("ActiveEffects", 10);

         for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            pj $$3 = $$1.a($$2);
            bbg $$4 = bbg.b($$3);
            if ($$4 != null) {
               this.bS.put($$4.b(), $$4);
            }
         }
      }

      if ($$0.b("Health", 99)) {
         this.c($$0.j("Health"));
      }

      this.aK = $$0.g("HurtTime");
      this.aN = $$0.g("DeathTime");
      this.bY = $$0.h("HurtByTimestamp");
      if ($$0.b("Team", 8)) {
         String $$5 = $$0.l("Team");
         dxm $$6 = this.s.H().f($$5);
         boolean $$7 = $$6 != null && this.s.H().a(this.cp(), $$6);
         if (!$$7) {
            b.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$5);
         }
      }

      if ($$0.q("FallFlying")) {
         this.b(7, true);
      }

      if ($$0.b("SleepingX", 99) && $$0.b("SleepingY", 99) && $$0.b("SleepingZ", 99)) {
         gt $$8 = new gt($$0.h("SleepingX"), $$0.h("SleepingY"), $$0.h("SleepingZ"));
         this.e($$8);
         this.Y.b(ad, bco.c);
         if (!this.X) {
            this.a($$8);
         }
      }

      if ($$0.b("Brain", 10)) {
         this.bD = this.a(new Dynamic(pu.a, $$0.c("Brain")));
      }

   }

   protected void dX() {
      Iterator<bbe> $$0 = this.bS.keySet().iterator();

      try {
         while($$0.hasNext()) {
            bbe $$1 = (bbe)$$0.next();
            bbg $$2 = (bbg)this.bS.get($$1);
            if (!$$2.a(this, () -> this.a($$2, true, null))) {
               if (!this.s.y) {
                  $$0.remove();
                  this.a($$2);
               }
            } else if ($$2.c() % 600 == 0) {
               this.a($$2, false, null);
            }
         }
      } catch (ConcurrentModificationException var11) {
      }

      if (this.bW) {
         if (!this.s.y) {
            this.F();
            this.n();
         }

         this.bW = false;
      }

      int $$3 = this.Y.a(bL);
      boolean $$4 = this.Y.a(bM);
      if ($$3 > 0) {
         boolean $$5;
         if (this.bX()) {
            $$5 = this.R.a(15) == 0;
         } else {
            $$5 = this.R.h();
         }

         if ($$4) {
            $$5 &= this.R.a(5) == 0;
         }

         if ($$5 && $$3 > 0) {
            double $$7 = (double)($$3 >> 16 & 0xFF) / 255.0;
            double $$8 = (double)($$3 >> 8 & 0xFF) / 255.0;
            double $$9 = (double)($$3 >> 0 & 0xFF) / 255.0;
            this.s.a($$4 ? io.a : io.v, this.d(0.5), this.di(), this.g(0.5), $$7, $$8, $$9);
         }
      }

   }

   protected void F() {
      if (this.bS.isEmpty()) {
         this.ea();
         this.j(false);
      } else {
         Collection<bbg> $$0 = this.bS.values();
         this.Y.b(bM, c($$0));
         this.Y.b(bL, ccu.a($$0));
         this.j(this.a(bbi.n));
      }

   }

   private void n() {
      boolean $$0 = this.bW();
      if (this.h(6) != $$0) {
         this.b(6, $$0);
      }

   }

   public double y(@Nullable bbn $$0) {
      double $$1 = 1.0;
      if (this.bO()) {
         $$1 *= 0.8;
      }

      if (this.bX()) {
         float $$2 = this.eB();
         if ($$2 < 0.1F) {
            $$2 = 0.1F;
         }

         $$1 *= 0.7 * (double)$$2;
      }

      if ($$0 != null) {
         cax $$3 = this.c(bbs.f);
         bbr<?> $$4 = $$0.ad();
         if ($$4 == bbr.aE && $$3.a(caz.si) || $$4 == bbr.bj && $$3.a(caz.sl) || $$4 == bbr.q && $$3.a(caz.sm)) {
            $$1 *= 0.5;
         }
      }

      return $$1;
   }

   public boolean c(bcc $$0) {
      return $$0 instanceof buc && this.s.ag() == bag.a ? false : $$0.dY();
   }

   public boolean a(bcc $$0, bmf $$1) {
      return $$1.a(this, $$0);
   }

   public boolean dY() {
      return !this.ci() && this.dZ();
   }

   public boolean dZ() {
      return !this.B_() && this.bo();
   }

   public static boolean c(Collection<bbg> $$0) {
      for(bbg $$1 : $$0) {
         if ($$1.f() && !$$1.e()) {
            return false;
         }
      }

      return true;
   }

   protected void ea() {
      this.Y.b(bM, false);
      this.Y.b(bL, 0);
   }

   public boolean eb() {
      if (this.s.y) {
         return false;
      } else {
         Iterator<bbg> $$0 = this.bS.values().iterator();

         boolean $$1;
         for($$1 = false; $$0.hasNext(); $$1 = true) {
            this.a((bbg)$$0.next());
            $$0.remove();
         }

         return $$1;
      }
   }

   public Collection<bbg> ec() {
      return this.bS.values();
   }

   public Map<bbe, bbg> ed() {
      return this.bS;
   }

   public boolean a(bbe $$0) {
      return this.bS.containsKey($$0);
   }

   @Nullable
   public bbg b(bbe $$0) {
      return (bbg)this.bS.get($$0);
   }

   public final boolean b(bbg $$0) {
      return this.b($$0, null);
   }

   public boolean b(bbg $$0, @Nullable bbn $$1) {
      if (!this.c($$0)) {
         return false;
      } else {
         bbg $$2 = (bbg)this.bS.get($$0.b());
         if ($$2 == null) {
            this.bS.put($$0.b(), $$0);
            this.a($$0, $$1);
            return true;
         } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            return true;
         } else {
            return false;
         }
      }
   }

   public boolean c(bbg $$0) {
      if (this.ey() == bch.b) {
         bbe $$1 = $$0.b();
         if ($$1 == bbi.j || $$1 == bbi.s) {
            return false;
         }
      }

      return true;
   }

   public void c(bbg $$0, @Nullable bbn $$1) {
      if (this.c($$0)) {
         bbg $$2 = (bbg)this.bS.put($$0.b(), $$0);
         if ($$2 == null) {
            this.a($$0, $$1);
         } else {
            this.a($$0, true, $$1);
         }

      }
   }

   public boolean ee() {
      return this.ey() == bch.b;
   }

   @Nullable
   public bbg c(@Nullable bbe $$0) {
      return (bbg)this.bS.remove($$0);
   }

   public boolean d(bbe $$0) {
      bbg $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1);
         return true;
      } else {
         return false;
      }
   }

   protected void a(bbg $$0, @Nullable bbn $$1) {
      this.bW = true;
      if (!this.s.y) {
         $$0.b().b(this, this.ex(), $$0.d());
      }

   }

   protected void a(bbg $$0, boolean $$1, @Nullable bbn $$2) {
      this.bW = true;
      if ($$1 && !this.s.y) {
         bbe $$3 = $$0.b();
         $$3.a(this, this.ex(), $$0.d());
         $$3.b(this, this.ex(), $$0.d());
      }

   }

   protected void a(bbg $$0) {
      this.bW = true;
      if (!this.s.y) {
         $$0.b().a(this, this.ex(), $$0.d());
      }

   }

   public void b(float $$0) {
      float $$1 = this.ef();
      if ($$1 > 0.0F) {
         this.c($$1 + $$0);
      }

   }

   public float ef() {
      return this.Y.a(bK);
   }

   public void c(float $$0) {
      this.Y.b(bK, ami.a($$0, 0.0F, this.et()));
   }

   public boolean eg() {
      return this.ef() <= 0.0F;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.s.y) {
         return false;
      } else if (this.eg()) {
         return false;
      } else if ($$0.u() && this.a(bbi.l)) {
         return false;
      } else {
         if (this.fj() && !this.s.y) {
            this.fk();
         }

         this.bf = 0;
         float $$2 = $$1;
         boolean $$3 = false;
         float $$4 = 0.0F;
         if ($$1 > 0.0F && this.e($$0)) {
            this.q($$1);
            $$4 = $$1;
            $$1 = 0.0F;
            if (!$$0.b()) {
               bbn $$5 = $$0.l();
               if ($$5 instanceof bcc) {
                  this.d((bcc)$$5);
               }
            }

            $$3 = true;
         }

         this.aS = 1.5F;
         boolean $$6 = true;
         if ((float)this.W > 10.0F) {
            if ($$1 <= this.bm) {
               return false;
            }

            this.f($$0, $$1 - this.bm);
            this.bm = $$1;
            $$6 = false;
         } else {
            this.bm = $$1;
            this.W = 20;
            this.f($$0, $$1);
            this.aL = 10;
            this.aK = this.aL;
         }

         if ($$0.g() && !this.c(bbs.f).b()) {
            this.c($$0, $$1);
            $$1 *= 0.75F;
         }

         this.aM = 0.0F;
         bbn $$7 = $$0.m();
         if ($$7 != null) {
            if ($$7 instanceof bcc && !$$0.v()) {
               this.a((bcc)$$7);
            }

            if ($$7 instanceof buc) {
               this.bd = 100;
               this.bc = (buc)$$7;
            } else if ($$7 instanceof boh $$8 && $$8.q()) {
               this.bd = 100;
               bcc $$9 = $$8.fK();
               if ($$9 != null && $$9.ad() == bbr.bn) {
                  this.bc = (buc)$$9;
               } else {
                  this.bc = null;
               }
            }
         }

         if ($$6) {
            if ($$3) {
               this.s.a(this, (byte)29);
            } else if ($$0 instanceof bax && ((bax)$$0).G()) {
               this.s.a(this, (byte)33);
            } else {
               byte $$10;
               if ($$0 == baw.h) {
                  $$10 = 36;
               } else if ($$0.u()) {
                  $$10 = 37;
               } else if ($$0 == baw.u) {
                  $$10 = 44;
               } else if ($$0 == baw.v) {
                  $$10 = 57;
               } else {
                  $$10 = 2;
               }

               this.s.a(this, $$10);
            }

            if ($$0 != baw.h && (!$$3 || $$1 > 0.0F)) {
               this.bi();
            }

            if ($$7 != null) {
               double $$15 = $$7.df() - this.df();

               double $$16;
               for($$16 = $$7.dl() - this.dl(); $$15 * $$15 + $$16 * $$16 < 1.0E-4; $$16 = (Math.random() - Math.random()) * 0.01) {
                  $$15 = (Math.random() - Math.random()) * 0.01;
               }

               this.aM = (float)(ami.d($$16, $$15) * 180.0F / (float)Math.PI - (double)this.dq());
               this.p(0.4F, $$15, $$16);
            } else {
               this.aM = (float)((int)(Math.random() * 2.0) * 180);
            }
         }

         if (this.eg()) {
            if (!this.g($$0)) {
               ajv $$17 = this.x_();
               if ($$6 && $$17 != null) {
                  this.a($$17, this.eC(), this.eD());
               }

               this.a($$0);
            }
         } else if ($$6) {
            this.d($$0);
         }

         boolean $$18 = !$$3 || $$1 > 0.0F;
         if ($$18) {
            this.cg = $$0;
            this.ch = this.s.U();
         }

         if (this instanceof agh) {
            aj.h.a((agh)this, $$0, $$2, $$1, $$3);
            if ($$4 > 0.0F && $$4 < 3.4028235E37F) {
               ((agh)this).a(akg.K, Math.round($$4 * 10.0F));
            }
         }

         if ($$7 instanceof agh) {
            aj.g.a((agh)$$7, this, $$0, $$2, $$1, $$3);
         }

         return $$18;
      }
   }

   protected void d(bcc $$0) {
      $$0.e(this);
   }

   protected void e(bcc $$0) {
      $$0.p(0.5, $$0.df() - this.df(), $$0.dl() - this.dl());
   }

   private boolean g(baw $$0) {
      if ($$0.i()) {
         return false;
      } else {
         cax $$1 = null;

         for(bai $$2 : bai.values()) {
            cax $$3 = this.b($$2);
            if ($$3.a(caz.tn)) {
               $$1 = $$3.o();
               $$3.g(1);
               break;
            }
         }

         if ($$1 != null) {
            if (this instanceof agh $$4) {
               $$4.b(akg.c.b(caz.tn));
               aj.B.a($$4, $$1);
            }

            this.c(1.0F);
            this.eb();
            this.b(new bbg(bbi.j, 900, 1));
            this.b(new bbg(bbi.v, 100, 1));
            this.b(new bbg(bbi.l, 800, 0));
            this.s.a(this, (byte)35);
         }

         return $$1 != null;
      }
   }

   @Nullable
   public baw eh() {
      if (this.s.U() - this.ch > 40L) {
         this.cg = null;
      }

      return this.cg;
   }

   protected void d(baw $$0) {
      ajv $$1 = this.c($$0);
      if ($$1 != null) {
         this.a($$1, this.eC(), this.eD());
      }

   }

   public boolean e(baw $$0) {
      bbn $$1 = $$0.l();
      boolean $$2 = false;
      if ($$1 instanceof bui $$3 && $$3.s() > 0) {
         $$2 = true;
      }

      if (!$$0.f() && this.fa() && !$$2) {
         dwq $$4 = $$0.E();
         if ($$4 != null) {
            dwq $$5 = this.e(1.0F);
            dwq $$6 = $$4.a(this.cY()).d();
            $$6 = new dwq($$6.c, 0.0, $$6.e);
            if ($$6.b($$5) < 0.0) {
               return true;
            }
         }
      }

      return false;
   }

   private void j(cax $$0) {
      if (!$$0.b()) {
         if (!this.aM()) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.kb, this.cR(), 0.8F, 0.8F + this.s.w.i() * 0.4F, false);
         }

         this.a($$0, 5);
      }

   }

   public void a(baw $$0) {
      if (!this.dt() && !this.be) {
         bbn $$1 = $$0.m();
         bcc $$2 = this.es();
         if (this.bl >= 0 && $$2 != null) {
            $$2.a(this, this.bl, $$0);
         }

         if (this.fj()) {
            this.fk();
         }

         if (!this.s.y && this.Y()) {
            b.info("Named entity {} died: {}", this, this.er().b().getString());
         }

         this.be = true;
         this.er().g();
         if (this.s instanceof agg) {
            if ($$1 == null || $$1.a((agg)this.s, this)) {
               this.a(czv.q);
               this.f($$0);
               this.f($$2);
            }

            this.s.a(this, (byte)3);
         }

         this.b(bco.h);
      }
   }

   protected void f(@Nullable bcc $$0) {
      if (!this.s.y) {
         boolean $$1 = false;
         if ($$0 instanceof bqj) {
            if (this.s.W().b(cgt.c)) {
               gt $$2 = this.da();
               cvo $$3 = cju.bP.m();
               if (this.s.a_($$2).h() && $$3.a((cha)this.s, $$2)) {
                  this.s.a($$2, $$3, 3);
                  $$1 = true;
               }
            }

            if (!$$1) {
               bqv $$4 = new bqv(this.s, this.df(), this.dh(), this.dl(), new cax(caz.cN));
               this.s.b($$4);
            }
         }

      }
   }

   protected void f(baw $$0) {
      bbn $$1 = $$0.m();
      int $$2;
      if ($$1 instanceof buc) {
         $$2 = cet.h((bcc)$$1);
      } else {
         $$2 = 0;
      }

      boolean $$4 = this.bd > 0;
      if (this.dN() && this.s.W().b(cgt.f)) {
         this.a($$0, $$4);
         this.a($$0, $$2, $$4);
      }

      this.ei();
      this.ej();
   }

   protected void ei() {
   }

   protected void ej() {
      if (this.s instanceof agg && !this.em() && (this.dP() || this.bd > 0 && this.dM() && this.s.W().b(cgt.f))) {
         bbt.a((agg)this.s, this.cY(), this.dO());
      }

   }

   protected void a(baw $$0, int $$1, boolean $$2) {
   }

   public abb ek() {
      return this.ad().j();
   }

   protected void a(baw $$0, boolean $$1) {
      abb $$2 = this.ek();
      dsg $$3 = this.s.n().aH().a($$2);
      dsd.a $$4 = this.a($$1, $$0);
      $$3.b($$4.a(duk.f), this::b);
   }

   protected dsd.a a(boolean $$0, baw $$1) {
      dsd.a $$2 = new dsd.a((agg)this.s).a(this.R).a(dul.a, this).a(dul.f, this.cY()).a(dul.c, $$1).b(dul.d, $$1.m()).b(dul.e, $$1.l());
      if ($$0 && this.bc != null) {
         $$2 = $$2.a(dul.b, this.bc).a(this.bc.fX());
      }

      return $$2;
   }

   public void p(double $$0, double $$1, double $$2) {
      $$0 *= 1.0 - this.b(bdd.c);
      if (!($$0 <= 0.0)) {
         this.af = true;
         dwq $$3 = this.dd();
         dwq $$4 = new dwq($$1, 0.0, $$2).d().a($$0);
         this.n($$3.c / 2.0 - $$4.c, this.y ? Math.min(0.4, $$3.d / 2.0 + $$0) : $$3.d, $$3.e / 2.0 - $$4.e);
      }
   }

   @Nullable
   protected ajv c(baw $$0) {
      return ajw.hq;
   }

   @Nullable
   protected ajv x_() {
      return ajw.hl;
   }

   private ajv c(int $$0) {
      return $$0 > 4 ? this.en().b() : this.en().a();
   }

   public void el() {
      this.ck = true;
   }

   public boolean em() {
      return this.ck;
   }

   public bcc.a en() {
      return new bcc.a(ajw.hr, ajw.hj);
   }

   protected ajv d(cax $$0) {
      return $$0.M();
   }

   public ajv e(cax $$0) {
      return $$0.N();
   }

   @Override
   public void c(boolean $$0) {
      super.c($$0);
      if ($$0) {
         this.cf = Optional.empty();
      }

   }

   public Optional<gt> eo() {
      return this.cf;
   }

   public boolean b_() {
      if (this.B_()) {
         return false;
      } else {
         gt $$0 = this.da();
         cvo $$1 = this.db();
         if ($$1.a(akl.aG)) {
            this.cf = Optional.of($$0);
            return true;
         } else if ($$1.b() instanceof crv && this.c($$0, $$1)) {
            this.cf = Optional.of($$0);
            return true;
         } else {
            return false;
         }
      }
   }

   private boolean c(gt $$0, cvo $$1) {
      if ($$1.c(crv.a)) {
         cvo $$2 = this.s.a_($$0.c());
         if ($$2.a(cju.cx) && $$2.c(cnp.a) == $$1.c(crv.aD)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean bo() {
      return !this.dt() && this.ef() > 0.0F;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      int $$4 = this.d($$0, $$1);
      if ($$4 > 0) {
         this.a(this.c($$4), 1.0F, 1.0F);
         this.ep();
         this.a($$2, (float)$$4);
         return true;
      } else {
         return $$3;
      }
   }

   protected int d(float $$0, float $$1) {
      bbg $$2 = this.b(bbi.h);
      float $$3 = $$2 == null ? 0.0F : (float)($$2.d() + 1);
      return ami.f(($$0 - 3.0F - $$3) * $$1);
   }

   protected void ep() {
      if (!this.aM()) {
         int $$0 = ami.b(this.df());
         int $$1 = ami.b(this.dh() - 0.2F);
         int $$2 = ami.b(this.dl());
         cvo $$3 = this.s.a_(new gt($$0, $$1, $$2));
         if (!$$3.h()) {
            cqw $$4 = $$3.r();
            this.a($$4.g(), $$4.a() * 0.5F, $$4.b() * 0.75F);
         }

      }
   }

   @Override
   public void bD() {
      this.aL = 10;
      this.aK = this.aL;
      this.aM = 0.0F;
   }

   public int eq() {
      return ami.b(this.b(bdd.i));
   }

   protected void b(baw $$0, float $$1) {
   }

   protected void c(baw $$0, float $$1) {
   }

   protected void q(float $$0) {
   }

   protected float d(baw $$0, float $$1) {
      if (!$$0.f()) {
         this.b($$0, $$1);
         $$1 = bau.a($$1, (float)this.eq(), (float)this.b(bdd.j));
      }

      return $$1;
   }

   protected float e(baw $$0, float $$1) {
      if ($$0.j()) {
         return $$1;
      } else {
         if (this.a(bbi.k) && $$0 != baw.m) {
            int $$2 = (this.b(bbi.k).d() + 1) * 5;
            int $$3 = 25 - $$2;
            float $$4 = $$1 * (float)$$3;
            float $$5 = $$1;
            $$1 = Math.max($$4 / 25.0F, 0.0F);
            float $$6 = $$5 - $$1;
            if ($$6 > 0.0F && $$6 < 3.4028235E37F) {
               if (this instanceof agh) {
                  ((agh)this).a(akg.M, Math.round($$6 * 10.0F));
               } else if ($$0.m() instanceof agh) {
                  ((agh)$$0.m()).a(akg.I, Math.round($$6 * 10.0F));
               }
            }
         }

         if ($$1 <= 0.0F) {
            return 0.0F;
         } else if ($$0.k()) {
            return $$1;
         } else {
            int $$7 = cet.a(this.bF(), $$0);
            if ($$7 > 0) {
               $$1 = bau.a($$1, (float)$$7);
            }

            return $$1;
         }
      }
   }

   protected void f(baw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var8 = Math.max($$1 - this.eQ(), 0.0F);
         this.t(this.eQ() - ($$1 - var8));
         float $$3 = $$1 - var8;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F && $$0.m() instanceof agh) {
            ((agh)$$0.m()).a(akg.H, Math.round($$3 * 10.0F));
         }

         if (var8 != 0.0F) {
            float $$4 = this.ef();
            this.c($$4 - var8);
            this.er().a($$0, $$4, var8);
            this.t(this.eQ() - var8);
            this.a(czv.p);
         }
      }
   }

   public bav er() {
      return this.bR;
   }

   @Nullable
   public bcc es() {
      if (this.bR.c() != null) {
         return this.bR.c();
      } else if (this.bc != null) {
         return this.bc;
      } else {
         return this.bX != null ? this.bX : null;
      }
   }

   public final float et() {
      return (float)this.b(bdd.a);
   }

   public final int eu() {
      return this.Y.a(bN);
   }

   public final void p(int $$0) {
      this.Y.b(bN, $$0);
   }

   public final int ev() {
      return this.Y.a(bO);
   }

   public final void q(int $$0) {
      this.Y.b(bO, $$0);
   }

   private int r() {
      if (bbh.a(this)) {
         return 6 - (1 + bbh.b(this));
      } else {
         return this.a(bbi.d) ? 6 + (1 + this.b(bbi.d).d()) * 2 : 6;
      }
   }

   public void a(bai $$0) {
      this.a($$0, false);
   }

   public void a(bai $$0, boolean $$1) {
      if (!this.aF || this.aH >= this.r() / 2 || this.aH < 0) {
         this.aH = -1;
         this.aF = true;
         this.aG = $$0;
         if (this.s instanceof agg) {
            tj $$2 = new tj(this, $$0 == bai.a ? 0 : 3);
            age $$3 = ((agg)this.s).k();
            if ($$1) {
               $$3.a(this, $$2);
            } else {
               $$3.b(this, $$2);
            }
         }
      }

   }

   @Override
   public void a(byte $$0) {
      switch($$0) {
         case 2:
         case 33:
         case 36:
         case 37:
         case 44:
         case 57:
            this.aS = 1.5F;
            this.W = 20;
            this.aL = 10;
            this.aK = this.aL;
            this.aM = 0.0F;
            if ($$0 == 33) {
               this.a(ajw.uI, this.eC(), (this.R.i() - this.R.i()) * 0.2F + 1.0F);
            }

            baw $$1;
            if ($$0 == 37) {
               $$1 = baw.c;
            } else if ($$0 == 36) {
               $$1 = baw.h;
            } else if ($$0 == 44) {
               $$1 = baw.u;
            } else if ($$0 == 57) {
               $$1 = baw.v;
            } else {
               $$1 = baw.n;
            }

            ajv $$6 = this.c($$1);
            if ($$6 != null) {
               this.a($$6, this.eC(), (this.R.i() - this.R.i()) * 0.2F + 1.0F);
            }

            this.a(baw.n, 0.0F);
            this.cg = $$1;
            this.ch = this.s.U();
            break;
         case 3:
            ajv $$7 = this.x_();
            if ($$7 != null) {
               this.a($$7, this.eC(), (this.R.i() - this.R.i()) * 0.2F + 1.0F);
            }

            if (!(this instanceof buc)) {
               this.c(0.0F);
               this.a(baw.n);
            }
            break;
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 31:
         case 32:
         case 34:
         case 35:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 45:
         case 53:
         case 56:
         case 58:
         case 59:
         default:
            super.a($$0);
            break;
         case 29:
            this.a(ajw.sj, 1.0F, 0.8F + this.s.w.i() * 0.4F);
            break;
         case 30:
            this.a(ajw.sk, 0.8F, 0.8F + this.s.w.i() * 0.4F);
            break;
         case 46:
            int $$8 = 128;

            for(int $$9 = 0; $$9 < 128; ++$$9) {
               double $$10 = (double)$$9 / 127.0;
               float $$11 = (this.R.i() - 0.5F) * 0.2F;
               float $$12 = (this.R.i() - 0.5F) * 0.2F;
               float $$13 = (this.R.i() - 0.5F) * 0.2F;
               double $$14 = ami.d($$10, this.t, this.df()) + (this.R.j() - 0.5) * (double)this.cW() * 2.0;
               double $$15 = ami.d($$10, this.u, this.dh()) + this.R.j() * (double)this.cX();
               double $$16 = ami.d($$10, this.v, this.dl()) + (this.R.j() - 0.5) * (double)this.cW() * 2.0;
               this.s.a(io.W, $$14, $$15, $$16, (double)$$11, (double)$$12, (double)$$13);
            }
            break;
         case 47:
            this.j(this.c(bbs.a));
            break;
         case 48:
            this.j(this.c(bbs.b));
            break;
         case 49:
            this.j(this.c(bbs.f));
            break;
         case 50:
            this.j(this.c(bbs.e));
            break;
         case 51:
            this.j(this.c(bbs.d));
            break;
         case 52:
            this.j(this.c(bbs.c));
            break;
         case 54:
            cnd.b(this);
            break;
         case 55:
            this.w();
            break;
         case 60:
            this.u();
      }

   }

   private void u() {
      for(int $$0 = 0; $$0 < 20; ++$$0) {
         double $$1 = this.R.k() * 0.02;
         double $$2 = this.R.k() * 0.02;
         double $$3 = this.R.k() * 0.02;
         this.s.a(io.V, this.d(1.0), this.di(), this.g(1.0), $$1, $$2, $$3);
      }

   }

   private void w() {
      cax $$0 = this.c(bbs.b);
      this.a(bbs.b, this.c(bbs.a));
      this.a(bbs.a, $$0);
   }

   @Override
   protected void av() {
      this.a(baw.m, 4.0F);
   }

   protected void ew() {
      int $$0 = this.r();
      if (this.aF) {
         ++this.aH;
         if (this.aH >= $$0) {
            this.aH = 0;
            this.aF = false;
         }
      } else {
         this.aH = 0;
      }

      this.aP = (float)this.aH / (float)$$0;
   }

   @Nullable
   public bcz a(bcy $$0) {
      return this.ex().a($$0);
   }

   public double b(bcy $$0) {
      return this.ex().c($$0);
   }

   public double c(bcy $$0) {
      return this.ex().d($$0);
   }

   public bda ex() {
      return this.bQ;
   }

   public bch ey() {
      return bch.a;
   }

   public cax ez() {
      return this.c(bbs.a);
   }

   public cax eA() {
      return this.c(bbs.b);
   }

   public boolean b(cat $$0) {
      return this.b((Predicate<cax>)($$1 -> $$1.a($$0)));
   }

   public boolean b(Predicate<cax> $$0) {
      return $$0.test(this.ez()) || $$0.test(this.eA());
   }

   public cax b(bai $$0) {
      if ($$0 == bai.a) {
         return this.c(bbs.a);
      } else if ($$0 == bai.b) {
         return this.c(bbs.b);
      } else {
         throw new IllegalArgumentException("Invalid hand " + $$0);
      }
   }

   public void a(bai $$0, cax $$1) {
      if ($$0 == bai.a) {
         this.a(bbs.a, $$1);
      } else {
         if ($$0 != bai.b) {
            throw new IllegalArgumentException("Invalid hand " + $$0);
         }

         this.a(bbs.b, $$1);
      }

   }

   public boolean b(bbs $$0) {
      return !this.c($$0).b();
   }

   @Override
   public abstract Iterable<cax> bF();

   public abstract cax c(bbs var1);

   @Override
   public abstract void a(bbs var1, cax var2);

   protected void f(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 != null) {
         $$0.c().b($$1);
      }

   }

   public float eB() {
      Iterable<cax> $$0 = this.bF();
      int $$1 = 0;
      int $$2 = 0;

      for(cax $$3 : $$0) {
         if (!$$3.b()) {
            ++$$2;
         }

         ++$$1;
      }

      return $$1 > 0 ? (float)$$2 / (float)$$1 : 0.0F;
   }

   @Override
   public void g(boolean $$0) {
      super.g($$0);
      bcz $$1 = this.a(bdd.d);
      if ($$1.a(c) != null) {
         $$1.d(bE);
      }

      if ($$0) {
         $$1.b(bE);
      }

   }

   protected float eC() {
      return 1.0F;
   }

   public float eD() {
      return this.y_() ? (this.R.i() - this.R.i()) * 0.2F + 1.5F : (this.R.i() - this.R.i()) * 0.2F + 1.0F;
   }

   protected boolean eE() {
      return this.eg();
   }

   @Override
   public void g(bbn $$0) {
      if (!this.fj()) {
         super.g($$0);
      }

   }

   private void a(bbn $$0) {
      dwq $$1;
      if (this.dt()) {
         $$1 = this.cY();
      } else if (!$$0.dt() && !this.s.a_($$0.da()).a(akl.aA)) {
         $$1 = $$0.b(this);
      } else {
         double $$2 = Math.max(this.dh(), $$0.dh());
         $$1 = new dwq(this.df(), $$2, this.dl());
      }

      this.a($$1.c, $$1.d, $$1.e);
   }

   @Override
   public boolean cu() {
      return this.ct();
   }

   protected float eF() {
      return 0.42F * this.aC();
   }

   public double eG() {
      return this.a(bbi.h) ? (double)(0.1F * (float)(this.b(bbi.h).d() + 1)) : 0.0;
   }

   protected void eH() {
      double $$0 = (double)this.eF() + this.eG();
      dwq $$1 = this.dd();
      this.n($$1.c, $$0, $$1.e);
      if (this.bR()) {
         float $$2 = this.dq() * (float) (Math.PI / 180.0);
         this.f(this.dd().b((double)(-ami.a($$2) * 0.2F), 0.0, (double)(ami.b($$2) * 0.2F)));
      }

      this.af = true;
   }

   protected void eI() {
      this.f(this.dd().b(0.0, -0.04F, 0.0));
   }

   protected void c(akz<dpu> $$0) {
      this.f(this.dd().b(0.0, 0.04F, 0.0));
   }

   protected float eJ() {
      return 0.8F;
   }

   public boolean a(dpv $$0) {
      return false;
   }

   public void g(dwq $$0) {
      if (this.eP() || this.cP()) {
         double $$1 = 0.08;
         boolean $$2 = this.dd().d <= 0.0;
         if ($$2 && this.a(bbi.B)) {
            $$1 = 0.01;
            this.m();
         }

         dpv $$3 = this.s.b_(this.da());
         if (this.aR() && this.dK() && !this.a($$3)) {
            double $$4 = this.dh();
            float $$5 = this.bR() ? 0.9F : this.eJ();
            float $$6 = 0.02F;
            float $$7 = (float)cet.f(this);
            if ($$7 > 3.0F) {
               $$7 = 3.0F;
            }

            if (!this.y) {
               $$7 *= 0.5F;
            }

            if ($$7 > 0.0F) {
               $$5 += (0.54600006F - $$5) * $$7 / 3.0F;
               $$6 += (this.eK() - $$6) * $$7 / 3.0F;
            }

            if (this.a(bbi.D)) {
               $$5 = 0.96F;
            }

            this.a($$6, $$0);
            this.a(bci.a, this.dd());
            dwq $$8 = this.dd();
            if (this.z && this.b_()) {
               $$8 = new dwq($$8.c, 0.2, $$8.e);
            }

            this.f($$8.d((double)$$5, 0.8F, (double)$$5));
            dwq $$9 = this.a($$1, $$2, this.dd());
            this.f($$9);
            if (this.z && this.f($$9.c, $$9.d + 0.6F - this.dh() + $$4, $$9.e)) {
               this.n($$9.c, 0.3F, $$9.e);
            }
         } else if (this.bf() && this.dK() && !this.a($$3)) {
            double $$10 = this.dh();
            this.a(0.02F, $$0);
            this.a(bci.a, this.dd());
            if (this.b(akp.b) <= this.cV()) {
               this.f(this.dd().d(0.5, 0.8F, 0.5));
               dwq $$11 = this.a($$1, $$2, this.dd());
               this.f($$11);
            } else {
               this.f(this.dd().a(0.5));
            }

            if (!this.aN()) {
               this.f(this.dd().b(0.0, -$$1 / 4.0, 0.0));
            }

            dwq $$12 = this.dd();
            if (this.z && this.f($$12.c, $$12.d + 0.6F - this.dh() + $$10, $$12.e)) {
               this.n($$12.c, 0.3F, $$12.e);
            }
         } else if (this.fc()) {
            dwq $$13 = this.dd();
            if ($$13.d > -0.5) {
               this.L = 1.0F;
            }

            dwq $$14 = this.by();
            float $$15 = this.ds() * (float) (Math.PI / 180.0);
            double $$16 = Math.sqrt($$14.c * $$14.c + $$14.e * $$14.e);
            double $$17 = $$13.h();
            double $$18 = $$14.f();
            double $$19 = Math.cos((double)$$15);
            $$19 = $$19 * $$19 * Math.min(1.0, $$18 / 0.4);
            $$13 = this.dd().b(0.0, $$1 * (-1.0 + $$19 * 0.75), 0.0);
            if ($$13.d < 0.0 && $$16 > 0.0) {
               double $$20 = $$13.d * -0.1 * $$19;
               $$13 = $$13.b($$14.c * $$20 / $$16, $$20, $$14.e * $$20 / $$16);
            }

            if ($$15 < 0.0F && $$16 > 0.0) {
               double $$21 = $$17 * (double)(-ami.a($$15)) * 0.04;
               $$13 = $$13.b(-$$14.c * $$21 / $$16, $$21 * 3.2, -$$14.e * $$21 / $$16);
            }

            if ($$16 > 0.0) {
               $$13 = $$13.b(($$14.c / $$16 * $$17 - $$13.c) * 0.1, 0.0, ($$14.e / $$16 * $$17 - $$13.e) * 0.1);
            }

            this.f($$13.d(0.99F, 0.98F, 0.99F));
            this.a(bci.a, this.dd());
            if (this.z && !this.s.y) {
               double $$22 = this.dd().h();
               double $$23 = $$17 - $$22;
               float $$24 = (float)($$23 * 10.0 - 3.0);
               if ($$24 > 0.0F) {
                  this.a(this.c((int)$$24), 1.0F, 1.0F);
                  this.a(baw.l, $$24);
               }
            }

            if (this.y && !this.s.y) {
               this.b(7, false);
            }
         } else {
            gt $$25 = this.aE();
            float $$26 = this.s.a_($$25).b().h();
            float $$27 = this.y ? $$26 * 0.91F : 0.91F;
            dwq $$28 = this.a($$0, $$26);
            double $$29 = $$28.d;
            if (this.a(bbi.y)) {
               $$29 += (0.05 * (double)(this.b(bbi.y).d() + 1) - $$28.d) * 0.2;
               this.m();
            } else if (this.s.y && !this.s.E($$25)) {
               if (this.dh() > (double)this.s.u_()) {
                  $$29 = -0.1;
               } else {
                  $$29 = 0.0;
               }
            } else if (!this.aN()) {
               $$29 -= $$1;
            }

            if (this.dW()) {
               this.n($$28.c, $$29, $$28.e);
            } else {
               this.n($$28.c * (double)$$27, $$29 * 0.98F, $$28.e * (double)$$27);
            }
         }
      }

      this.a(this, this instanceof bnn);
   }

   public void a(bcc $$0, boolean $$1) {
      $$0.aR = $$0.aS;
      double $$2 = $$0.df() - $$0.t;
      double $$3 = $$1 ? $$0.dh() - $$0.u : 0.0;
      double $$4 = $$0.dl() - $$0.v;
      float $$5 = (float)Math.sqrt($$2 * $$2 + $$3 * $$3 + $$4 * $$4) * 4.0F;
      if ($$5 > 1.0F) {
         $$5 = 1.0F;
      }

      $$0.aS += ($$5 - $$0.aS) * 0.4F;
      $$0.aT += $$0.aS;
   }

   public dwq a(dwq $$0, float $$1) {
      this.a(this.u($$1), $$0);
      this.f(this.i(this.dd()));
      this.a(bci.a, this.dd());
      dwq $$2 = this.dd();
      if ((this.z || this.bn) && (this.b_() || this.db().a(cju.pn) && cpc.a(this))) {
         $$2 = new dwq($$2.c, 0.2, $$2.e);
      }

      return $$2;
   }

   public dwq a(double $$0, boolean $$1, dwq $$2) {
      if (!this.aN() && !this.bR()) {
         double $$3;
         if ($$1 && Math.abs($$2.d - 0.005) >= 0.003 && Math.abs($$2.d - $$0 / 16.0) < 0.003) {
            $$3 = -0.003;
         } else {
            $$3 = $$2.d - $$0 / 16.0;
         }

         return new dwq($$2.c, $$3, $$2.e);
      } else {
         return $$2;
      }
   }

   private dwq i(dwq $$0) {
      if (this.b_()) {
         this.m();
         float $$1 = 0.15F;
         double $$2 = ami.a($$0.c, -0.15F, 0.15F);
         double $$3 = ami.a($$0.e, -0.15F, 0.15F);
         double $$4 = Math.max($$0.d, -0.15F);
         if ($$4 < 0.0 && !this.db().a(cju.mD) && this.fb() && this instanceof buc) {
            $$4 = 0.0;
         }

         $$0 = new dwq($$2, $$4, $$3);
      }

      return $$0;
   }

   private float u(float $$0) {
      return this.y ? this.eK() * (0.21600002F / ($$0 * $$0 * $$0)) : this.bb;
   }

   public float eK() {
      return this.cb;
   }

   public void r(float $$0) {
      this.cb = $$0;
   }

   public boolean z(bbn $$0) {
      this.x($$0);
      return false;
   }

   @Override
   public void k() {
      super.k();
      this.A();
      this.D();
      if (!this.s.y) {
         int $$0 = this.eu();
         if ($$0 > 0) {
            if (this.aI <= 0) {
               this.aI = 20 * (30 - $$0);
            }

            --this.aI;
            if (this.aI <= 0) {
               this.p($$0 - 1);
            }
         }

         int $$1 = this.ev();
         if ($$1 > 0) {
            if (this.aJ <= 0) {
               this.aJ = 20 * (30 - $$1);
            }

            --this.aJ;
            if (this.aJ <= 0) {
               this.q($$1 - 1);
            }
         }

         this.x();
         if (this.S % 20 == 0) {
            this.er().g();
         }

         if (this.fj() && !this.E()) {
            this.fk();
         }
      }

      if (!this.dt()) {
         this.w_();
      }

      double $$2 = this.df() - this.t;
      double $$3 = this.dl() - this.v;
      float $$4 = (float)($$2 * $$2 + $$3 * $$3);
      float $$5 = this.aX;
      float $$6 = 0.0F;
      this.bg = this.bh;
      float $$7 = 0.0F;
      if ($$4 > 0.0025000002F) {
         $$7 = 1.0F;
         $$6 = (float)Math.sqrt((double)$$4) * 3.0F;
         float $$8 = (float)ami.d($$3, $$2) * 180.0F / (float)Math.PI - 90.0F;
         float $$9 = ami.e(ami.g(this.dq()) - $$8);
         if (95.0F < $$9 && $$9 < 265.0F) {
            $$5 = $$8 - 180.0F;
         } else {
            $$5 = $$8;
         }
      }

      if (this.aP > 0.0F) {
         $$5 = this.dq();
      }

      if (!this.y) {
         $$7 = 0.0F;
      }

      this.bh += ($$7 - this.bh) * 0.3F;
      this.s.ac().a("headTurn");
      $$6 = this.e($$5, $$6);
      this.s.ac().c();
      this.s.ac().a("rangeChecks");

      while(this.dq() - this.w < -180.0F) {
         this.w -= 360.0F;
      }

      while(this.dq() - this.w >= 180.0F) {
         this.w += 360.0F;
      }

      while(this.aX - this.aY < -180.0F) {
         this.aY -= 360.0F;
      }

      while(this.aX - this.aY >= 180.0F) {
         this.aY += 360.0F;
      }

      while(this.ds() - this.x < -180.0F) {
         this.x -= 360.0F;
      }

      while(this.ds() - this.x >= 180.0F) {
         this.x += 360.0F;
      }

      while(this.aZ - this.ba < -180.0F) {
         this.ba -= 360.0F;
      }

      while(this.aZ - this.ba >= 180.0F) {
         this.ba += 360.0F;
      }

      this.s.ac().c();
      this.bi += $$6;
      if (this.fc()) {
         ++this.bB;
      } else {
         this.bB = 0;
      }

      if (this.fj()) {
         this.p(0.0F);
      }

   }

   private void x() {
      Map<bbs, cax> $$0 = this.y();
      if ($$0 != null) {
         this.a($$0);
         if (!$$0.isEmpty()) {
            this.b($$0);
         }
      }

   }

   @Nullable
   private Map<bbs, cax> y() {
      Map<bbs, cax> $$0 = null;

      for(bbs $$1 : bbs.values()) {
         cax $$2;
         switch($$1.a()) {
            case a:
               $$2 = this.f($$1);
               break;
            case b:
               $$2 = this.e($$1);
               break;
            default:
               continue;
         }

         cax $$5 = this.c($$1);
         if (!cax.b($$5, $$2)) {
            if ($$0 == null) {
               $$0 = Maps.newEnumMap(bbs.class);
            }

            $$0.put($$1, $$5);
            if (!$$2.b()) {
               this.ex().a($$2.a($$1));
            }

            if (!$$5.b()) {
               this.ex().b($$5.a($$1));
            }
         }
      }

      return $$0;
   }

   private void a(Map<bbs, cax> $$0) {
      cax $$1 = (cax)$$0.get(bbs.a);
      cax $$2 = (cax)$$0.get(bbs.b);
      if ($$1 != null && $$2 != null && cax.b($$1, this.f(bbs.b)) && cax.b($$2, this.f(bbs.a))) {
         ((agg)this.s).k().b(this, new ug(this, (byte)55));
         $$0.remove(bbs.a);
         $$0.remove(bbs.b);
         this.c(bbs.a, $$1.o());
         this.c(bbs.b, $$2.o());
      }

   }

   private void b(Map<bbs, cax> $$0) {
      List<Pair<bbs, cax>> $$1 = Lists.newArrayListWithCapacity($$0.size());
      $$0.forEach(($$1x, $$2) -> {
         cax $$3 = $$2.o();
         $$1.add(Pair.of($$1x, $$3));
         switch($$1x.a()) {
            case a:
               this.c($$1x, $$3);
               break;
            case b:
               this.b($$1x, $$3);
         }

      });
      ((agg)this.s).k().b(this, new wl(this.ae(), $$1));
   }

   private cax e(bbs $$0) {
      return this.bU.get($$0.b());
   }

   private void b(bbs $$0, cax $$1) {
      this.bU.set($$0.b(), $$1);
   }

   private cax f(bbs $$0) {
      return this.bT.get($$0.b());
   }

   private void c(bbs $$0, cax $$1) {
      this.bT.set($$0.b(), $$1);
   }

   protected float e(float $$0, float $$1) {
      float $$2 = ami.g($$0 - this.aX);
      this.aX += $$2 * 0.3F;
      float $$3 = ami.g(this.dq() - this.aX);
      boolean $$4 = $$3 < -90.0F || $$3 >= 90.0F;
      if ($$3 < -75.0F) {
         $$3 = -75.0F;
      }

      if ($$3 >= 75.0F) {
         $$3 = 75.0F;
      }

      this.aX = this.dq() - $$3;
      if ($$3 * $$3 > 2500.0F) {
         this.aX += $$3 * 0.2F;
      }

      if ($$4) {
         $$1 *= -1.0F;
      }

      return $$1;
   }

   public void w_() {
      if (this.cc > 0) {
         --this.cc;
      }

      if (this.cP()) {
         this.br = 0;
         this.d(this.df(), this.dh(), this.dl());
      }

      if (this.br > 0) {
         double $$0 = this.df() + (this.bs - this.df()) / (double)this.br;
         double $$1 = this.dh() + (this.bt - this.dh()) / (double)this.br;
         double $$2 = this.dl() + (this.bu - this.dl()) / (double)this.br;
         double $$3 = ami.f(this.bv - (double)this.dq());
         this.o(this.dq() + (float)$$3 / (float)this.br);
         this.p(this.ds() + (float)(this.bw - (double)this.ds()) / (float)this.br);
         --this.br;
         this.e($$0, $$1, $$2);
         this.a(this.dq(), this.ds());
      } else if (!this.eP()) {
         this.f(this.dd().a(0.98));
      }

      if (this.by > 0) {
         this.aZ += (float)ami.f(this.bx - (double)this.aZ) / (float)this.by;
         --this.by;
      }

      dwq $$4 = this.dd();
      double $$5 = $$4.c;
      double $$6 = $$4.d;
      double $$7 = $$4.e;
      if (Math.abs($$4.c) < 0.003) {
         $$5 = 0.0;
      }

      if (Math.abs($$4.d) < 0.003) {
         $$6 = 0.0;
      }

      if (Math.abs($$4.e) < 0.003) {
         $$7 = 0.0;
      }

      this.n($$5, $$6, $$7);
      this.s.ac().a("ai");
      if (this.eE()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      } else if (this.eP()) {
         this.s.ac().a("newAi");
         this.eM();
         this.s.ac().c();
      }

      this.s.ac().c();
      this.s.ac().a("jump");
      if (this.bn && this.dK()) {
         double $$8;
         if (this.bf()) {
            $$8 = this.b(akp.b);
         } else {
            $$8 = this.b(akp.a);
         }

         boolean $$10 = this.aR() && $$8 > 0.0;
         double $$11 = this.cV();
         if (!$$10 || this.y && !($$8 > $$11)) {
            if (!this.bf() || this.y && !($$8 > $$11)) {
               if ((this.y || $$10 && $$8 <= $$11) && this.cc == 0) {
                  this.eH();
                  this.cc = 10;
               }
            } else {
               this.c(akp.b);
            }
         } else {
            this.c(akp.a);
         }
      } else {
         this.cc = 0;
      }

      this.s.ac().c();
      this.s.ac().a("travel");
      this.bo *= 0.98F;
      this.bq *= 0.98F;
      this.z();
      dwl $$12 = this.cy();
      this.g(new dwq((double)this.bo, (double)this.bp, (double)this.bq));
      this.s.ac().c();
      this.s.ac().a("freezing");
      boolean $$13 = this.ad().a(akn.j);
      if (!this.s.y && !this.eg()) {
         int $$14 = this.cb();
         if (this.al && this.do()) {
            this.j(Math.min(this.ce(), $$14 + 1));
         } else {
            this.j(Math.max(0, $$14 - 2));
         }
      }

      this.dH();
      this.dI();
      if (!this.s.y && this.S % 40 == 0 && this.cd() && this.do()) {
         int $$15 = $$13 ? 5 : 1;
         this.a(baw.v, (float)$$15);
      }

      this.s.ac().c();
      this.s.ac().a("push");
      if (this.bC > 0) {
         --this.bC;
         this.a($$12, this.cy());
      }

      this.eN();
      this.s.ac().c();
      if (!this.s.y && this.eL() && this.aT()) {
         this.a(baw.h, 1.0F);
      }

   }

   public boolean eL() {
      return false;
   }

   private void z() {
      boolean $$0 = this.h(7);
      if ($$0 && !this.y && !this.bI() && !this.a(bbi.y)) {
         cax $$1 = this.c(bbs.e);
         if ($$1.a(caz.mv) && bzw.d($$1)) {
            $$0 = true;
            int $$2 = this.bB + 1;
            if (!this.s.y && $$2 % 10 == 0) {
               int $$3 = $$2 / 10;
               if ($$3 % 2 == 0) {
                  $$1.a(1, this, $$0x -> $$0x.d(bbs.e));
               }

               this.a(czv.o);
            }
         } else {
            $$0 = false;
         }
      } else {
         $$0 = false;
      }

      if (!this.s.y) {
         this.b(7, $$0);
      }

   }

   protected void eM() {
   }

   protected void eN() {
      List<bbn> $$0 = this.s.a(this, this.cy(), bbq.a(this));
      if (!$$0.isEmpty()) {
         int $$1 = this.s.W().c(cgt.t);
         if ($$1 > 0 && $$0.size() > $$1 - 1 && this.R.a(4) == 0) {
            int $$2 = 0;

            for(int $$3 = 0; $$3 < $$0.size(); ++$$3) {
               if (!((bbn)$$0.get($$3)).bI()) {
                  ++$$2;
               }
            }

            if ($$2 > $$1 - 1) {
               this.a(baw.g, 6.0F);
            }
         }

         for(int $$4 = 0; $$4 < $$0.size(); ++$$4) {
            bbn $$5 = (bbn)$$0.get($$4);
            this.A($$5);
         }
      }

   }

   protected void a(dwl $$0, dwl $$1) {
      dwl $$2 = $$0.b($$1);
      List<bbn> $$3 = this.s.a_(this, $$2);
      if (!$$3.isEmpty()) {
         for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            bbn $$5 = (bbn)$$3.get($$4);
            if ($$5 instanceof bcc) {
               this.g((bcc)$$5);
               this.bC = 0;
               this.f(this.dd().a(-0.2));
               break;
            }
         }
      } else if (this.z) {
         this.bC = 0;
      }

      if (!this.s.y && this.bC <= 0) {
         this.c(4, false);
      }

   }

   protected void A(bbn $$0) {
      $$0.g(this);
   }

   protected void g(bcc $$0) {
   }

   public boolean eO() {
      return (this.Y.a(aB) & 4) != 0;
   }

   @Override
   public void p() {
      bbn $$0 = this.cQ();
      super.p();
      if ($$0 != null && $$0 != this.cQ() && !this.s.y) {
         this.a($$0);
      }

   }

   @Override
   public void br() {
      super.br();
      this.bg = this.bh;
      this.bh = 0.0F;
      this.m();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.bs = $$0;
      this.bt = $$1;
      this.bu = $$2;
      this.bv = (double)$$3;
      this.bw = (double)$$4;
      this.br = $$5;
   }

   @Override
   public void a(float $$0, int $$1) {
      this.bx = (double)$$0;
      this.by = $$1;
   }

   public void q(boolean $$0) {
      this.bn = $$0;
   }

   public void a(bqv $$0) {
      buc $$1 = $$0.l() != null ? this.s.b($$0.l()) : null;
      if ($$1 instanceof agh) {
         aj.O.a((agh)$$1, $$0.i(), this);
      }

   }

   public void a(bbn $$0, int $$1) {
      if (!$$0.dt() && !this.s.y && ($$0 instanceof bqv || $$0 instanceof bui || $$0 instanceof bbt)) {
         ((agg)this.s).k().b($$0, new xd($$0.ae(), this.ae(), $$1));
      }

   }

   public boolean B(bbn $$0) {
      if ($$0.s != this.s) {
         return false;
      } else {
         dwq $$1 = new dwq(this.df(), this.dj(), this.dl());
         dwq $$2 = new dwq($$0.df(), $$0.dj(), $$0.dl());
         if ($$2.f($$1) > 128.0) {
            return false;
         } else {
            return this.s.a(new cgg($$1, $$2, cgg.a.a, cgg.b.a, this)).c() == dwo.a.a;
         }
      }
   }

   @Override
   public float g(float $$0) {
      return $$0 == 1.0F ? this.aZ : ami.i($$0, this.ba, this.aZ);
   }

   public float s(float $$0) {
      float $$1 = this.aP - this.aO;
      if ($$1 < 0.0F) {
         ++$$1;
      }

      return this.aO + $$1 * $$0;
   }

   public boolean eP() {
      return !this.s.y;
   }

   @Override
   public boolean bk() {
      return !this.dt();
   }

   @Override
   public boolean bl() {
      return this.bo() && !this.B_() && !this.b_();
   }

   @Override
   public float cg() {
      return this.aZ;
   }

   @Override
   public void l(float $$0) {
      this.aZ = $$0;
   }

   @Override
   public void m(float $$0) {
      this.aX = $$0;
   }

   @Override
   protected dwq a(gy.a $$0, n.a $$1) {
      return h(super.a($$0, $$1));
   }

   public static dwq h(dwq $$0) {
      return new dwq($$0.c, $$0.d, 0.0);
   }

   public float eQ() {
      return this.cd;
   }

   public void t(float $$0) {
      if ($$0 < 0.0F) {
         $$0 = 0.0F;
      }

      this.cd = $$0;
   }

   public void h() {
   }

   public void i() {
   }

   protected void eR() {
      this.bW = true;
   }

   public abstract bbx eS();

   public boolean eT() {
      return (this.Y.a(aB) & 1) > 0;
   }

   public bai eU() {
      return (this.Y.a(aB) & 2) > 0 ? bai.b : bai.a;
   }

   private void A() {
      if (this.eT()) {
         if (cax.d(this.b(this.eU()), this.bz)) {
            this.bz = this.b(this.eU());
            this.a(this.bz);
         } else {
            this.eZ();
         }
      }

   }

   protected void a(cax $$0) {
      $$0.b(this.s, this, this.eW());
      if (this.C()) {
         this.b($$0, 5);
      }

      if (--this.bA == 0 && !this.s.y && !$$0.s()) {
         this.v();
      }

   }

   private boolean C() {
      int $$0 = this.eW();
      bwj $$1 = this.bz.c().w();
      boolean $$2 = $$1 != null && $$1.e();
      $$2 |= $$0 <= this.bz.q() - 7;
      return $$2 && $$0 % 4 == 0;
   }

   private void D() {
      this.cj = this.ci;
      if (this.bT()) {
         this.ci = Math.min(1.0F, this.ci + 0.09F);
      } else {
         this.ci = Math.max(0.0F, this.ci - 0.09F);
      }

   }

   protected void c(int $$0, boolean $$1) {
      int $$2 = this.Y.a(aB);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.Y.b(aB, (byte)$$2);
   }

   public void c(bai $$0) {
      cax $$1 = this.b($$0);
      if (!$$1.b() && !this.eT()) {
         this.bz = $$1;
         this.bA = $$1.q();
         if (!this.s.y) {
            this.c(1, true);
            this.c(2, $$0 == bai.b);
            this.a(czv.D);
         }

      }
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (bP.equals($$0)) {
         if (this.s.y) {
            this.fh().ifPresent(this::a);
         }
      } else if (aB.equals($$0) && this.s.y) {
         if (this.eT() && this.bz.b()) {
            this.bz = this.b(this.eU());
            if (!this.bz.b()) {
               this.bA = this.bz.q();
            }
         } else if (!this.eT() && !this.bz.b()) {
            this.bz = cax.b;
            this.bA = 0;
         }
      }

   }

   @Override
   public void a(ea.a $$0, dwq $$1) {
      super.a($$0, $$1);
      this.ba = this.aZ;
      this.aX = this.aZ;
      this.aY = this.aX;
   }

   protected void b(cax $$0, int $$1) {
      if (!$$0.b() && this.eT()) {
         if ($$0.r() == ccn.c) {
            this.a(this.d($$0), 0.5F, this.s.w.i() * 0.1F + 0.9F);
         }

         if ($$0.r() == ccn.b) {
            this.a($$0, $$1);
            this.a(this.e($$0), 0.5F + 0.5F * (float)this.R.a(2), (this.R.i() - this.R.i()) * 0.2F + 1.0F);
         }

      }
   }

   private void a(cax $$0, int $$1) {
      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         dwq $$3 = new dwq(((double)this.R.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
         $$3 = $$3.a(-this.ds() * (float) (Math.PI / 180.0));
         $$3 = $$3.b(-this.dq() * (float) (Math.PI / 180.0));
         double $$4 = (double)(-this.R.i()) * 0.6 - 0.3;
         dwq $$5 = new dwq(((double)this.R.i() - 0.5) * 0.3, $$4, 0.6);
         $$5 = $$5.a(-this.ds() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(-this.dq() * (float) (Math.PI / 180.0));
         $$5 = $$5.b(this.df(), this.dj(), this.dl());
         this.s.a(new ik(io.N, $$0), $$5.c, $$5.d, $$5.e, $$3.c, $$3.d + 0.05, $$3.e);
      }

   }

   protected void v() {
      if (!this.s.y || this.eT()) {
         bai $$0 = this.eU();
         if (!this.bz.equals(this.b($$0))) {
            this.eY();
         } else {
            if (!this.bz.b() && this.eT()) {
               this.b(this.bz, 16);
               cax $$1 = this.bz.a(this.s, this);
               if ($$1 != this.bz) {
                  this.a($$0, $$1);
               }

               this.eZ();
            }

         }
      }
   }

   public cax eV() {
      return this.bz;
   }

   public int eW() {
      return this.bA;
   }

   public int eX() {
      return this.eT() ? this.bz.q() - this.eW() : 0;
   }

   public void eY() {
      if (!this.bz.b()) {
         this.bz.a(this.s, this, this.eW());
         if (this.bz.s()) {
            this.A();
         }
      }

      this.eZ();
   }

   public void eZ() {
      if (!this.s.y) {
         boolean $$0 = this.eT();
         this.c(1, false);
         if ($$0) {
            this.a(czv.C);
         }
      }

      this.bz = cax.b;
      this.bA = 0;
   }

   public boolean fa() {
      if (this.eT() && !this.bz.b()) {
         cat $$0 = this.bz.c();
         if ($$0.c(this.bz) != ccn.d) {
            return false;
         } else {
            return $$0.b(this.bz) - this.bA >= 5;
         }
      } else {
         return false;
      }
   }

   public boolean fb() {
      return this.bL();
   }

   public boolean fc() {
      return this.h(7);
   }

   @Override
   public boolean bT() {
      return super.bT() || !this.fc() && this.c(bco.b);
   }

   public int fd() {
      return this.bB;
   }

   public boolean a(double $$0, double $$1, double $$2, boolean $$3) {
      double $$4 = this.df();
      double $$5 = this.dh();
      double $$6 = this.dl();
      double $$7 = $$1;
      boolean $$8 = false;
      gt $$9 = new gt($$0, $$1, $$2);
      cgx $$10 = this.s;
      if ($$10.E($$9)) {
         boolean $$11 = false;

         while(!$$11 && $$9.v() > $$10.u_()) {
            gt $$12 = $$9.c();
            cvo $$13 = $$10.a_($$12);
            if ($$13.d().c()) {
               $$11 = true;
            } else {
               --$$7;
               $$9 = $$12;
            }
         }

         if ($$11) {
            this.b($$0, $$7, $$2);
            if ($$10.g(this) && !$$10.d(this.cy())) {
               $$8 = true;
            }
         }
      }

      if (!$$8) {
         this.b($$4, $$5, $$6);
         return false;
      } else {
         if ($$3) {
            $$10.a(this, (byte)46);
         }

         if (this instanceof bcl) {
            ((bcl)this).D().n();
         }

         return true;
      }
   }

   public boolean fe() {
      return true;
   }

   public boolean ff() {
      return true;
   }

   public void a(gt $$0, boolean $$1) {
   }

   public boolean g(cax $$0) {
      return false;
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }

   @Override
   public bbo a(bco $$0) {
      return $$0 == bco.c ? aD : super.a($$0).a(this.dJ());
   }

   public ImmutableList<bco> fg() {
      return ImmutableList.of(bco.a);
   }

   public dwl g(bco $$0) {
      bbo $$1 = this.a($$0);
      return new dwl((double)(-$$1.a / 2.0F), 0.0, (double)(-$$1.a / 2.0F), (double)($$1.a / 2.0F), (double)$$1.b, (double)($$1.a / 2.0F));
   }

   public Optional<gt> fh() {
      return this.Y.a(bP);
   }

   public void e(gt $$0) {
      this.Y.b(bP, Optional.of($$0));
   }

   public void fi() {
      this.Y.b(bP, Optional.empty());
   }

   public boolean fj() {
      return this.fh().isPresent();
   }

   public void b(gt $$0) {
      if (this.bI()) {
         this.p();
      }

      cvo $$1 = this.s.a_($$0);
      if ($$1.b() instanceof cjm) {
         this.s.a($$0, $$1.a(cjm.b, Boolean.valueOf(true)), 3);
      }

      this.b(bco.c);
      this.a($$0);
      this.e($$0);
      this.f(dwq.b);
      this.af = true;
   }

   private void a(gt $$0) {
      this.e((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
   }

   private boolean E() {
      return this.fh().map($$0 -> this.s.a_($$0).b() instanceof cjm).orElse(false);
   }

   public void fk() {
      this.fh().filter(this.s::E).ifPresent($$0x -> {
         cvo $$1 = this.s.a_($$0x);
         if ($$1.b() instanceof cjm) {
            this.s.a($$0x, $$1.a(cjm.b, Boolean.valueOf(false)), 3);
            dwq $$2 = (dwq)cjm.a(this.ad(), this.s, $$0x, this.dq()).orElseGet(() -> {
               gt $$1x = $$0x.b();
               return new dwq((double)$$1x.u() + 0.5, (double)$$1x.v() + 0.1, (double)$$1x.w() + 0.5);
            });
            dwq $$3 = dwq.c($$0x).d($$2).d();
            float $$4 = (float)ami.f(ami.d($$3.e, $$3.c) * 180.0F / (float)Math.PI - 90.0);
            this.e($$2.c, $$2.d, $$2.e);
            this.o($$4);
            this.p(0.0F);
         }

      });
      dwq $$0 = this.cY();
      this.b(bco.a);
      this.e($$0.c, $$0.d, $$0.e);
      this.fi();
   }

   @Nullable
   public gy fl() {
      gt $$0 = (gt)this.fh().orElse(null);
      return $$0 != null ? cjm.a(this.s, $$0) : null;
   }

   @Override
   public boolean bp() {
      return !this.fj() && super.bp();
   }

   @Override
   protected final float a(bco $$0, bbo $$1) {
      return $$0 == bco.c ? 0.2F : this.b($$0, $$1);
   }

   protected float b(bco $$0, bbo $$1) {
      return super.a($$0, $$1);
   }

   public cax h(cax $$0) {
      return cax.b;
   }

   public cax a(cgx $$0, cax $$1) {
      if ($$1.L()) {
         $$0.a(null, this.df(), this.dh(), this.dl(), this.e($$1), ajx.g, 1.0F, 1.0F + ($$0.w.i() - $$0.w.i()) * 0.4F);
         this.a($$1, $$0, this);
         if (!(this instanceof buc) || !((buc)this).fB().d) {
            $$1.g(1);
         }

         this.a(czv.n);
      }

      return $$1;
   }

   private void a(cax $$0, cgx $$1, bcc $$2) {
      cat $$3 = $$0.c();
      if ($$3.v()) {
         for(Pair<bbg, Float> $$5 : $$3.w().f()) {
            if (!$$1.y && $$5.getFirst() != null && $$1.w.i() < $$5.getSecond()) {
               $$2.b(new bbg((bbg)$$5.getFirst()));
            }
         }
      }

   }

   private static byte g(bbs $$0) {
      switch($$0) {
         case a:
            return 47;
         case b:
            return 48;
         case f:
            return 49;
         case e:
            return 50;
         case c:
            return 52;
         case d:
            return 51;
         default:
            return 47;
      }
   }

   public void d(bbs $$0) {
      this.s.a(this, g($$0));
   }

   public void d(bai $$0) {
      this.d($$0 == bai.a ? bbs.a : bbs.b);
   }

   @Override
   public dwl cz() {
      if (this.c(bbs.f).a(caz.sn)) {
         float $$0 = 0.5F;
         return this.cy().c(0.5, 0.5, 0.5);
      } else {
         return super.cz();
      }
   }

   public static bbs i(cax $$0) {
      cat $$1 = $$0.c();
      if (!$$0.a(caz.es) && (!($$1 instanceof byx) || !(((byx)$$1).e() instanceof ciq))) {
         if ($$1 instanceof byo) {
            return ((byo)$$1).b();
         } else if ($$0.a(caz.mv)) {
            return bbs.e;
         } else {
            return $$0.a(caz.tm) ? bbs.b : bbs.a;
         }
      } else {
         return bbs.f;
      }
   }

   private static bct a(bcc $$0, bbs $$1) {
      return $$1 != bbs.f && $$1 != bbs.a && $$1 != bbs.b ? bct.a($$0, $$1, $$1x -> $$1x.b() || bce.i($$1x) == $$1) : bct.a($$0, $$1);
   }

   @Nullable
   private static bbs d(int $$0) {
      if ($$0 == 100 + bbs.f.b()) {
         return bbs.f;
      } else if ($$0 == 100 + bbs.e.b()) {
         return bbs.e;
      } else if ($$0 == 100 + bbs.d.b()) {
         return bbs.d;
      } else if ($$0 == 100 + bbs.c.b()) {
         return bbs.c;
      } else if ($$0 == 98) {
         return bbs.a;
      } else {
         return $$0 == 99 ? bbs.b : null;
      }
   }

   @Override
   public bct k(int $$0) {
      bbs $$1 = d($$0);
      return $$1 != null ? a(this, $$1) : super.k($$0);
   }

   @Override
   public boolean do() {
      if (this.B_()) {
         return false;
      } else {
         boolean $$0 = !this.c(bbs.f).a(aks.au) && !this.c(bbs.e).a(aks.au) && !this.c(bbs.d).a(aks.au) && !this.c(bbs.c).a(aks.au);
         return $$0 && super.do();
      }
   }

   @Override
   public boolean bW() {
      return !this.s.k_() && this.a(bbi.x) || super.bW();
   }

   @Override
   public float dr() {
      return this.aX;
   }

   @Override
   public void a(tg $$0) {
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      float $$4 = $$0.l();
      float $$5 = $$0.k();
      this.d($$1, $$2, $$3);
      this.aX = $$0.m();
      this.aZ = $$0.m();
      this.aY = this.aX;
      this.ba = this.aZ;
      this.e($$0.b());
      this.a_($$0.c());
      this.a($$1, $$2, $$3, $$4, $$5);
      this.n($$0.h(), $$0.i(), $$0.j());
   }

   public boolean fm() {
      return this.ez().c() instanceof byt;
   }

   public static record a(ajv a, ajv b) {
   }
}
