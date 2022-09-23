import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class buc extends bcc {
   private static final Logger b = LogUtils.getLogger();
   public static final int bE = 16;
   public static final int bF = 20;
   public static final int bG = 100;
   public static final int bH = 10;
   public static final int bI = 200;
   public static final float bJ = 1.5F;
   public static final float bK = 0.6F;
   public static final float bL = 0.6F;
   public static final float bM = 1.62F;
   public static final bbo bN = bbo.b(0.6F, 1.8F);
   private static final Map<bco, bbo> c = ImmutableMap.builder()
      .put(bco.a, bN)
      .put(bco.c, aD)
      .put(bco.b, bbo.b(0.6F, 0.6F))
      .put(bco.d, bbo.b(0.6F, 0.6F))
      .put(bco.e, bbo.b(0.6F, 0.6F))
      .put(bco.f, bbo.b(0.6F, 1.5F))
      .put(bco.h, bbo.c(0.2F, 0.2F))
      .build();
   private static final int d = 25;
   private static final aaj<Float> e = aam.a(buc.class, aal.c);
   private static final aaj<Integer> f = aam.a(buc.class, aal.b);
   protected static final aaj<Byte> bO = aam.a(buc.class, aal.a);
   protected static final aaj<Byte> bP = aam.a(buc.class, aal.a);
   protected static final aaj<pj> bQ = aam.a(buc.class, aal.q);
   protected static final aaj<pj> bR = aam.a(buc.class, aal.q);
   private long co;
   private final bub cp = new bub(this);
   protected bxu bS = new bxu();
   public final bxl bT;
   public bwm bU;
   protected bwi bV = new bwi();
   protected bti bW = new bti(0, 0, 0);
   protected int bX;
   public float bY;
   public float bZ;
   public int ca;
   public double cb;
   public double cc;
   public double cd;
   public double ce;
   public double cf;
   public double cg;
   private int cq;
   protected boolean ch;
   private final btz cr = new btz();
   public int ci;
   public int cj;
   public float ck;
   protected int cl;
   protected final float cm = 0.02F;
   private int cs;
   private final GameProfile ct;
   @Nullable
   private final buf cu;
   private boolean cv;
   private cax cw = cax.b;
   private final cau cx = this.j();
   private Optional<hb> cy = Optional.empty();
   @Nullable
   public buq cn;

   public buc(cgx $$0, gt $$1, float $$2, GameProfile $$3, @Nullable buf $$4) {
      super(bbr.bn, $$0);
      this.a_(hr.a($$3));
      this.ct = $$3;
      this.cu = $$4;
      this.bT = new bxl(this.cp, !$$0.y, this);
      this.bU = this.bT;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(cgx $$0, gt $$1, cgu $$2) {
      if (!$$2.e()) {
         return false;
      } else if ($$2 == cgu.d) {
         return true;
      } else if (this.fN()) {
         return false;
      } else {
         cax $$3 = this.ez();
         return $$3.b() || !$$3.b($$0.s().d(hm.h), new cvs($$0, $$1, false));
      }
   }

   public static bdc.a fn() {
      return bcc.dA().a(bdd.f, 1.0).a(bdd.d, 0.1F).a(bdd.h).a(bdd.k);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(e, 0.0F);
      this.Y.a(f, 0);
      this.Y.a(bO, (byte)0);
      this.Y.a(bP, (byte)1);
      this.Y.a(bQ, new pj());
      this.Y.a(bR, new pj());
   }

   @Override
   public void k() {
      this.Q = this.B_();
      if (this.B_()) {
         this.y = false;
      }

      if (this.ca > 0) {
         --this.ca;
      }

      if (this.fj()) {
         ++this.cq;
         if (this.cq > 100) {
            this.cq = 100;
         }

         if (!this.s.y && this.s.M()) {
            this.a(false, true);
         }
      } else if (this.cq > 0) {
         ++this.cq;
         if (this.cq >= 110) {
            this.cq = 0;
         }
      }

      this.fr();
      super.k();
      if (!this.s.y && this.bU != null && !this.bU.a(this)) {
         this.q();
         this.bU = this.bT;
      }

      this.r();
      if (!this.s.y) {
         this.bV.a(this);
         this.bW.a();
         this.a(akg.k);
         this.a(akg.l);
         if (this.bo()) {
            this.a(akg.m);
         }

         if (this.bO()) {
            this.a(akg.o);
         }

         if (!this.fj()) {
            this.a(akg.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ami.a(this.df(), -2.9999999E7, 2.9999999E7);
      double $$2 = ami.a(this.dl(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.df() || $$2 != this.dl()) {
         this.e($$1, this.dh(), $$2);
      }

      ++this.aQ;
      cax $$3 = this.ez();
      if (!cax.b(this.cw, $$3)) {
         if (!cax.d(this.cw, $$3)) {
            this.fV();
         }

         this.cw = $$3.o();
      }

      this.n();
      this.cx.a();
      this.fs();
   }

   public boolean fo() {
      return this.bL();
   }

   protected boolean fp() {
      return this.bL();
   }

   protected boolean fq() {
      return this.bL();
   }

   protected boolean fr() {
      this.ch = this.a(akp.a);
      return this.ch;
   }

   private void n() {
      cax $$0 = this.c(bbs.f);
      if ($$0.a(caz.mM) && !this.a(akp.a)) {
         this.b(new bbg(bbi.m, 200, 0, false, false, true));
      }

   }

   protected cau j() {
      return new cau();
   }

   private void r() {
      this.cb = this.ce;
      this.cc = this.cf;
      this.cd = this.cg;
      double $$0 = this.df() - this.ce;
      double $$1 = this.dh() - this.cf;
      double $$2 = this.dl() - this.cg;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ce = this.df();
         this.cb = this.ce;
      }

      if ($$2 > 10.0) {
         this.cg = this.dl();
         this.cd = this.cg;
      }

      if ($$1 > 10.0) {
         this.cf = this.dh();
         this.cc = this.cf;
      }

      if ($$0 < -10.0) {
         this.ce = this.df();
         this.cb = this.ce;
      }

      if ($$2 < -10.0) {
         this.cg = this.dl();
         this.cd = this.cg;
      }

      if ($$1 < -10.0) {
         this.cf = this.dh();
         this.cc = this.cf;
      }

      this.ce += $$0 * 0.25;
      this.cg += $$2 * 0.25;
      this.cf += $$1 * 0.25;
   }

   protected void fs() {
      if (this.d(bco.d)) {
         bco $$0;
         if (this.fc()) {
            $$0 = bco.b;
         } else if (this.fj()) {
            $$0 = bco.c;
         } else if (this.bS()) {
            $$0 = bco.d;
         } else if (this.eO()) {
            $$0 = bco.e;
         } else if (this.bL() && !this.cr.b) {
            $$0 = bco.f;
         } else {
            $$0 = bco.a;
         }

         bco $$6;
         if (this.B_() || this.bI() || this.d($$0)) {
            $$6 = $$0;
         } else if (this.d(bco.f)) {
            $$6 = bco.f;
         } else {
            $$6 = bco.d;
         }

         this.b($$6);
      }
   }

   @Override
   public int ar() {
      return this.cr.a ? 1 : 80;
   }

   @Override
   protected ajv aG() {
      return ajw.qb;
   }

   @Override
   protected ajv aH() {
      return ajw.pZ;
   }

   @Override
   protected ajv aI() {
      return ajw.qa;
   }

   @Override
   public int bC() {
      return 10;
   }

   @Override
   public void a(ajv $$0, float $$1, float $$2) {
      this.s.a(this, this.df(), this.dh(), this.dl(), $$0, this.cR(), $$1, $$2);
   }

   public void a(ajv $$0, ajx $$1, float $$2, float $$3) {
   }

   @Override
   public ajx cR() {
      return ajx.h;
   }

   @Override
   protected int cS() {
      return 20;
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 9) {
         this.v();
      } else if ($$0 == 23) {
         this.cv = false;
      } else if ($$0 == 22) {
         this.cv = true;
      } else if ($$0 == 43) {
         this.a(io.f);
      } else {
         super.a($$0);
      }

   }

   private void a(im $$0) {
      for(int $$1 = 0; $$1 < 5; ++$$1) {
         double $$2 = this.R.k() * 0.02;
         double $$3 = this.R.k() * 0.02;
         double $$4 = this.R.k() * 0.02;
         this.s.a($$0, this.d(1.0), this.di() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }

   }

   protected void q() {
      this.bU = this.bT;
   }

   @Override
   public void br() {
      if (!this.s.y && this.fp() && this.bI()) {
         this.p();
         this.f(false);
      } else {
         double $$0 = this.df();
         double $$1 = this.dh();
         double $$2 = this.dl();
         super.br();
         this.bY = this.bZ;
         this.bZ = 0.0F;
         this.r(this.df() - $$0, this.dh() - $$1, this.dl() - $$2);
      }
   }

   @Override
   protected void eM() {
      super.eM();
      this.ew();
      this.aZ = this.dq();
   }

   @Override
   public void w_() {
      if (this.bX > 0) {
         --this.bX;
      }

      if (this.s.ag() == bag.a && this.s.W().b(cgt.j)) {
         if (this.ef() < this.et() && this.S % 20 == 0) {
            this.b(1.0F);
         }

         if (this.bV.c() && this.S % 10 == 0) {
            this.bV.a(this.bV.a() + 1);
         }
      }

      this.cp.j();
      this.bY = this.bZ;
      super.w_();
      this.bb = 0.02F;
      if (this.bR()) {
         this.bb += 0.006F;
      }

      this.r((float)this.b(bdd.d));
      float $$1;
      if (this.y && !this.eg() && !this.bS()) {
         $$1 = Math.min(0.1F, (float)this.dd().h());
      } else {
         $$1 = 0.0F;
      }

      this.bZ += ($$1 - this.bZ) * 0.4F;
      if (this.ef() > 0.0F && !this.B_()) {
         dwl $$2;
         if (this.bI() && !this.cQ().dt()) {
            $$2 = this.cy().b(this.cQ().cy()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cy().c(1.0, 0.5, 1.0);
         }

         List<bbn> $$4 = this.s.a_(this, $$2);
         List<bbn> $$5 = Lists.newArrayList();

         for(int $$6 = 0; $$6 < $$4.size(); ++$$6) {
            bbn $$7 = (bbn)$$4.get($$6);
            if ($$7.ad() == bbr.C) {
               $$5.add($$7);
            } else if (!$$7.dt()) {
               this.c($$7);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ad.a($$5, this.R));
         }
      }

      this.c(this.fS());
      this.c(this.fT());
      if (!this.s.y && (this.L > 0.5F || this.aR()) || this.cr.b || this.fj() || this.al) {
         this.fP();
      }

   }

   private void c(@Nullable pj $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.s.w.a(200) == 0) {
         String $$1 = $$0.l("id");
         bbr.a($$1).filter($$0x -> $$0x == bbr.ao).ifPresent($$0x -> {
            if (!bnu.a(this.s, this)) {
               this.s.a(null, this.df(), this.dh(), this.dl(), bnu.a(this.s, this.s.w), this.cR(), 1.0F, bnu.a(this.s.w));
            }

         });
      }

   }

   private void c(bbn $$0) {
      $$0.b_(this);
   }

   public int ft() {
      return this.Y.a(f);
   }

   public void r(int $$0) {
      this.Y.b(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.ft();
      this.Y.b(f, $$1 + $$0);
   }

   public void t(int $$0) {
      this.bC = $$0;
      if (!this.s.y) {
         this.fP();
         this.c(4, true);
      }

   }

   @Override
   public void a(baw $$0) {
      super.a($$0);
      this.am();
      if (!this.B_()) {
         this.f($$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ami.b((this.aM + this.dq()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ami.a((this.aM + this.dq()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(akg.N);
      this.a(akg.i.b(akg.m));
      this.a(akg.i.b(akg.n));
      this.au();
      this.a_(false);
      this.a(Optional.of(hb.a(this.s.ab(), this.da())));
   }

   @Override
   protected void ei() {
      super.ei();
      if (!this.s.W().b(cgt.d)) {
         this.fu();
         this.cp.k();
      }

   }

   protected void fu() {
      for(int $$0 = 0; $$0 < this.cp.b(); ++$$0) {
         cax $$1 = this.cp.a($$0);
         if (!$$1.b() && cet.e($$1)) {
            this.cp.b($$0);
         }
      }

   }

   @Override
   protected ajv c(baw $$0) {
      if ($$0 == baw.c) {
         return ajw.pV;
      } else if ($$0 == baw.h) {
         return ajw.pT;
      } else if ($$0 == baw.u) {
         return ajw.pW;
      } else {
         return $$0 == baw.v ? ajw.pU : ajw.pS;
      }
   }

   @Override
   protected ajv x_() {
      return ajw.pR;
   }

   @Nullable
   public bqv a(cax $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public bqv a(cax $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.s.y) {
            this.a(bai.a);
         }

         double $$3 = this.dj() - 0.3F;
         bqv $$4 = new bqv(this.s, this.df(), $$3, this.dl(), $$0);
         $$4.a(40);
         if ($$2) {
            $$4.c(this.co());
         }

         if ($$1) {
            float $$5 = this.R.i() * 0.5F;
            float $$6 = this.R.i() * (float) (Math.PI * 2);
            $$4.n((double)(-ami.a($$6) * $$5), 0.2F, (double)(ami.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ami.a(this.ds() * (float) (Math.PI / 180.0));
            float $$9 = ami.b(this.ds() * (float) (Math.PI / 180.0));
            float $$10 = ami.a(this.dq() * (float) (Math.PI / 180.0));
            float $$11 = ami.b(this.dq() * (float) (Math.PI / 180.0));
            float $$12 = this.R.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.R.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.R.i() - this.R.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float c(cvo $$0) {
      float $$1 = this.cp.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cet.g(this);
         cax $$3 = this.ez();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bbh.a(this)) {
         $$1 *= 1.0F + (float)(bbh.b(this) + 1) * 0.2F;
      }

      if (this.a(bbi.d)) {
         $$1 *= switch(this.b(bbi.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(akp.a) && !cet.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.y) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean d(cvo $$0) {
      return !$$0.t() || this.cp.f().b($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a_(hr.a(this.ct));
      pp $$1 = $$0.c("Inventory", 10);
      this.cp.b($$1);
      this.cp.k = $$0.h("SelectedItemSlot");
      this.cq = $$0.g("SleepTimer");
      this.ck = $$0.j("XpP");
      this.ci = $$0.h("XpLevel");
      this.cj = $$0.h("XpTotal");
      this.cl = $$0.h("XpSeed");
      if (this.cl == 0) {
         this.cl = this.R.f();
      }

      this.r($$0.h("Score"));
      this.bV.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         bti.a.parse(new Dynamic(pu.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.bW = $$0x);
      }

      this.cr.b($$0);
      this.a(bdd.d).a((double)this.cr.b());
      if ($$0.b("EnderItems", 9)) {
         this.bS.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(hb.a.parse(pu.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("DataVersion", ab.b().getWorldVersion());
      $$0.a("Inventory", (qc)this.cp.a(new pp()));
      $$0.a("SelectedItemSlot", this.cp.k);
      $$0.a("SleepTimer", (short)this.cq);
      $$0.a("XpP", this.ck);
      $$0.a("XpLevel", this.ci);
      $$0.a("XpTotal", this.cj);
      $$0.a("XpSeed", this.cl);
      $$0.a("Score", this.ft());
      this.bV.b($$0);
      bti.a.encodeStart(pu.a, this.bW).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.cr.a($$0);
      $$0.a("EnderItems", (qc)this.bS.g());
      if (!this.fS().f()) {
         $$0.a("ShoulderEntityLeft", (qc)this.fS());
      }

      if (!this.fT().f()) {
         $$0.a("ShoulderEntityRight", (qc)this.fT());
      }

      this.ga().flatMap($$0x -> hb.a.encodeStart(pu.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(baw $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0 == baw.h) {
         return !this.s.W().b(cgt.B);
      } else if ($$0.B()) {
         return !this.s.W().b(cgt.C);
      } else if ($$0.u()) {
         return !this.s.W().b(cgt.D);
      } else if ($$0 == baw.v) {
         return !this.s.W().b(cgt.E);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cr.a && !$$0.i()) {
         return false;
      } else {
         this.bf = 0;
         if (this.eg()) {
            return false;
         } else {
            if (!this.s.y) {
               this.fP();
            }

            if ($$0.y()) {
               if (this.s.ag() == bag.a) {
                  $$1 = 0.0F;
               }

               if (this.s.ag() == bag.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.s.ag() == bag.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bcc $$0) {
      super.d($$0);
      if ($$0.fm()) {
         this.r(true);
      }

   }

   @Override
   public boolean dY() {
      return !this.fB().a && super.dY();
   }

   public boolean a(buc $$0) {
      dxq $$1 = this.bY();
      dxq $$2 = $$0.bY();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(baw $$0, float $$1) {
      this.cp.a($$0, $$1, bub.f);
   }

   @Override
   protected void c(baw $$0, float $$1) {
      this.cp.a($$0, $$1, bub.g);
   }

   @Override
   protected void q(float $$0) {
      if (this.bz.a(caz.tm)) {
         if (!this.s.y) {
            this.b(akg.c.b(this.bz.c()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ami.d($$0);
            bai $$2 = this.eU();
            this.bz.a($$1, this, $$1x -> $$1x.d($$2));
            if (this.bz.b()) {
               if ($$2 == bai.a) {
                  this.a(bbs.a, cax.b);
               } else {
                  this.a(bbs.b, cax.b);
               }

               this.bz = cax.b;
               this.a(ajw.sk, 0.8F, 0.8F + this.s.w.i() * 0.4F);
            }
         }

      }
   }

   @Override
   protected void f(baw $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var8 = Math.max($$1 - this.eQ(), 0.0F);
         this.t(this.eQ() - ($$1 - var8));
         float $$3 = $$1 - var8;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(akg.L, Math.round($$3 * 10.0F));
         }

         if (var8 != 0.0F) {
            this.u($$0.h());
            float $$4 = this.ef();
            this.c(this.ef() - var8);
            this.er().a($$0, $$4, var8);
            if (var8 < 3.4028235E37F) {
               this.a(akg.J, Math.round(var8 * 10.0F));
            }

         }
      }
   }

   @Override
   protected boolean dE() {
      return !this.cr.b && super.dE();
   }

   public void a(cuk $$0) {
   }

   public void a(cfy $$0) {
   }

   public void a(ctp $$0) {
   }

   public void a(cuo $$0) {
   }

   public void a(cub $$0) {
   }

   public void a(bpa $$0, bac $$1) {
   }

   public OptionalInt a(@Nullable bam $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cfw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cax $$0, bai $$1) {
   }

   public baj a(bbn $$0, bai $$1) {
      if (this.B_()) {
         if ($$0 instanceof bam) {
            this.a((bam)$$0);
         }

         return baj.d;
      } else {
         cax $$2 = this.b($$1);
         cax $$3 = $$2.o();
         baj $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cr.d && $$2 == this.b($$1) && $$2.K() < $$3.K()) {
               $$2.e($$3.K());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof bcc) {
               if (this.cr.d) {
                  $$2 = $$3;
               }

               baj $$5 = $$2.a(this, (bcc)$$0, $$1);
               if ($$5.a()) {
                  if ($$2.b() && !this.cr.d) {
                     this.a($$1, cax.b);
                  }

                  return $$5;
               }
            }

            return baj.d;
         }
      }
   }

   @Override
   public double bs() {
      return -0.35;
   }

   @Override
   public void bw() {
      super.bw();
      this.r = 0;
   }

   @Override
   protected boolean eE() {
      return super.eE() || this.fj();
   }

   @Override
   public boolean dK() {
      return !this.cr.b;
   }

   @Override
   protected dwq a(dwq $$0, bci $$1) {
      if (!this.cr.b && $$0.d <= 0.0 && ($$1 == bci.a || $$1 == bci.b) && this.fq() && this.t()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while($$2 != 0.0 && this.s.a(this, this.cy().d($$2, (double)(-this.P), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while($$3 != 0.0 && this.s.a(this, this.cy().d(0.0, (double)(-this.P), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while($$2 != 0.0 && $$3 != 0.0 && this.s.a(this, this.cy().d($$2, (double)(-this.P), $$3))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }

            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         $$0 = new dwq($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean t() {
      return this.y || this.L < this.P && !this.s.a(this, this.cy().d(0.0, (double)(this.L - this.P), 0.0));
   }

   public void d(bbn $$0) {
      if ($$0.ch()) {
         if (!$$0.r(this)) {
            float $$1 = (float)this.b(bdd.f);
            float $$2;
            if ($$0 instanceof bcc) {
               $$2 = cet.a(this.ez(), ((bcc)$$0).ey());
            } else {
               $$2 = cet.a(this.ez(), bch.a);
            }

            float $$4 = this.v(0.5F);
            $$1 *= 0.2F + $$4 * $$4 * 0.8F;
            $$2 *= $$4;
            this.fV();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$5 = $$4 > 0.9F;
               boolean $$6 = false;
               int $$7 = 0;
               $$7 += cet.c(this);
               if (this.bR() && $$5) {
                  this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pJ, this.cR(), 1.0F, 1.0F);
                  ++$$7;
                  $$6 = true;
               }

               boolean $$8 = $$5 && this.L > 0.0F && !this.y && !this.b_() && !this.aR() && !this.a(bbi.o) && !this.bI() && $$0 instanceof bcc;
               $$8 = $$8 && !this.bR();
               if ($$8) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$9 = false;
               double $$10 = (double)(this.I - this.H);
               if ($$5 && !$$8 && !$$6 && this.y && $$10 < (double)this.eK()) {
                  cax $$11 = this.b(bai.a);
                  if ($$11.c() instanceof ccf) {
                     $$9 = true;
                  }
               }

               float $$12 = 0.0F;
               boolean $$13 = false;
               int $$14 = cet.d(this);
               if ($$0 instanceof bcc) {
                  $$12 = ((bcc)$$0).ef();
                  if ($$14 > 0 && !$$0.bH()) {
                     $$13 = true;
                     $$0.f(1);
                  }
               }

               dwq $$15 = $$0.dd();
               boolean $$16 = $$0.a(baw.a(this), $$1);
               if ($$16) {
                  if ($$7 > 0) {
                     if ($$0 instanceof bcc) {
                        ((bcc)$$0)
                           .p(
                              (double)((float)$$7 * 0.5F),
                              (double)ami.a(this.dq() * (float) (Math.PI / 180.0)),
                              (double)(-ami.b(this.dq() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.i(
                           (double)(-ami.a(this.dq() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F),
                           0.1,
                           (double)(ami.b(this.dq() * (float) (Math.PI / 180.0)) * (float)$$7 * 0.5F)
                        );
                     }

                     this.f(this.dd().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$9) {
                     float $$17 = 1.0F + cet.a(this) * $$1;

                     for(bcc $$19 : this.s.a(bcc.class, $$0.cy().c(1.0, 0.25, 1.0))) {
                        if ($$19 != this && $$19 != $$0 && !this.p($$19) && (!($$19 instanceof bql) || !((bql)$$19).t()) && this.f($$19) < 9.0) {
                           $$19.p(0.4F, (double)ami.a(this.dq() * (float) (Math.PI / 180.0)), (double)(-ami.b(this.dq() * (float) (Math.PI / 180.0))));
                           $$19.a(baw.a(this), $$17);
                        }
                     }

                     this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pM, this.cR(), 1.0F, 1.0F);
                     this.fv();
                  }

                  if ($$0 instanceof agh && $$0.D) {
                     ((agh)$$0).b.a(new wk($$0));
                     $$0.D = false;
                     $$0.f($$15);
                  }

                  if ($$8) {
                     this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pI, this.cR(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$8 && !$$9) {
                     if ($$5) {
                        this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pL, this.cR(), 1.0F, 1.0F);
                     } else {
                        this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pN, this.cR(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.x($$0);
                  if ($$0 instanceof bcc) {
                     cet.a((bcc)$$0, this);
                  }

                  cet.b(this, $$0);
                  cax $$20 = this.ez();
                  bbn $$21 = $$0;
                  if ($$0 instanceof bpn) {
                     $$21 = ((bpn)$$0).b;
                  }

                  if (!this.s.y && !$$20.b() && $$21 instanceof bcc) {
                     $$20.a((bcc)$$21, this);
                     if ($$20.b()) {
                        this.a(bai.a, cax.b);
                     }
                  }

                  if ($$0 instanceof bcc) {
                     float $$22 = $$12 - ((bcc)$$0).ef();
                     this.a(akg.G, Math.round($$22 * 10.0F));
                     if ($$14 > 0) {
                        $$0.f($$14 * 4);
                     }

                     if (this.s instanceof agg && $$22 > 2.0F) {
                        int $$23 = (int)((double)$$22 * 0.5);
                        ((agg)this.s).a(io.h, $$0.df(), $$0.e(0.5), $$0.dl(), $$23, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.u(0.1F);
               } else {
                  this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pK, this.cR(), 1.0F, 1.0F);
                  if ($$13) {
                     $$0.au();
                  }
               }
            }

         }
      }
   }

   @Override
   protected void g(bcc $$0) {
      this.d((bbn)$$0);
   }

   public void r(boolean $$0) {
      float $$1 = 0.25F + (float)cet.g(this) * 0.05F;
      if ($$0) {
         $$1 += 0.75F;
      }

      if (this.R.i() < $$1) {
         this.fW().a(caz.tm, 100);
         this.eZ();
         this.s.a(this, (byte)30);
      }

   }

   @Override
   public void a(bbn $$0) {
   }

   public void b(bbn $$0) {
   }

   public void fv() {
      double $$0 = (double)(-ami.a(this.dq() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ami.b(this.dq() * (float) (Math.PI / 180.0));
      if (this.s instanceof agg) {
         ((agg)this.s).a(io.ac, this.df() + $$0, this.e(0.5), this.dl() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }

   }

   public void fw() {
   }

   @Override
   public void a(bbn.c $$0) {
      super.a($$0);
      this.bT.b(this);
      if (this.bU != null) {
         this.bU.b(this);
      }

   }

   public boolean fx() {
      return false;
   }

   public GameProfile fy() {
      return this.ct;
   }

   @Nullable
   public buf fz() {
      return this.cu;
   }

   public bub fA() {
      return this.cp;
   }

   public btz fB() {
      return this.cr;
   }

   public void a(cax $$0, cax $$1, bwu $$2) {
   }

   public boolean fC() {
      return this.bU != this.bT;
   }

   public Either<buc.a, anf> a(gt $$0) {
      this.b($$0);
      this.cq = 0;
      return Either.right(anf.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fk();
      if (this.s instanceof agg && $$1) {
         ((agg)this.s).e();
      }

      this.cq = $$0 ? 0 : 100;
   }

   @Override
   public void fk() {
      this.a(true, true);
   }

   public static Optional<dwq> a(agg $$0, gt $$1, float $$2, boolean $$3, boolean $$4) {
      cvo $$5 = $$0.a_($$1);
      cjt $$6 = $$5.b();
      if ($$6 instanceof cpr && $$5.c(cpr.c) > 0 && cpr.a($$0)) {
         Optional<dwq> $$7 = cpr.a(bbr.bn, $$0, $$1);
         if (!$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(cpr.c, Integer.valueOf($$5.c(cpr.c) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cjm && cjm.a($$0)) {
         return cjm.a(bbr.bn, $$0, $$1, $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.Y_();
         boolean $$9 = $$0.a_($$1.b()).b().Y_();
         return $$8 && $$9 ? Optional.of(new dwq((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fD() {
      return this.fj() && this.cq >= 100;
   }

   public int fE() {
      return this.cq;
   }

   public void a(rq $$0, boolean $$1) {
   }

   public void a(abb $$0) {
      this.b(akg.i.b($$0));
   }

   public void a(abb $$0, int $$1) {
      this.a(akg.i.b($$0), $$1);
   }

   public void b(akd<?> $$0) {
      this.a($$0, 1);
   }

   public void a(akd<?> $$0, int $$1) {
   }

   public void a(akd<?> $$0) {
   }

   public int a(Collection<cdp<?>> $$0) {
      return 0;
   }

   public void a(abb[] $$0) {
   }

   public int b(Collection<cdp<?>> $$0) {
      return 0;
   }

   @Override
   public void eH() {
      super.eH();
      this.a(akg.E);
      if (this.bR()) {
         this.u(0.2F);
      } else {
         this.u(0.05F);
      }

   }

   @Override
   public void g(dwq $$0) {
      double $$1 = this.df();
      double $$2 = this.dh();
      double $$3 = this.dl();
      if (this.bS() && !this.bI()) {
         double $$4 = this.by().d;
         double $$5 = $$4 < -0.2 ? 0.085 : 0.06;
         if ($$4 <= 0.0 || this.bn || !this.s.a_(new gt(this.df(), this.dh() + 1.0 - 0.1, this.dl())).p().c()) {
            dwq $$6 = this.dd();
            this.f($$6.b(0.0, ($$4 - $$6.d) * $$5, 0.0));
         }
      }

      if (this.cr.b && !this.bI()) {
         double $$7 = this.dd().d;
         float $$8 = this.bb;
         this.bb = this.cr.a() * (float)(this.bR() ? 2 : 1);
         super.g($$0);
         dwq $$9 = this.dd();
         this.n($$9.c, $$7 * 0.6, $$9.e);
         this.bb = $$8;
         this.m();
         this.b(7, false);
      } else {
         super.g($$0);
      }

      this.q(this.df() - $$1, this.dh() - $$2, this.dl() - $$3);
   }

   @Override
   public void aX() {
      if (this.cr.b) {
         this.h(false);
      } else {
         super.aX();
      }

   }

   protected boolean f(gt $$0) {
      return !this.s.a_($$0).o(this.s, $$0);
   }

   @Override
   public float eK() {
      return (float)this.b(bdd.d);
   }

   public void q(double $$0, double $$1, double $$2) {
      if (!this.bI()) {
         if (this.bS()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(akg.C, $$3);
               this.u(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(akp.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(akg.w, $$4);
               this.u(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aR()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(akg.s, $$5);
               this.u(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.b_()) {
            if ($$1 > 0.0) {
               this.a(akg.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.y) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bR()) {
                  this.a(akg.r, $$6);
                  this.u(0.1F * (float)$$6 * 0.01F);
               } else if (this.bQ()) {
                  this.a(akg.q, $$6);
                  this.u(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(akg.p, $$6);
                  this.u(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fc()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(akg.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(akg.v, $$8);
            }
         }

      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bI()) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         if ($$3 > 0) {
            bbn $$4 = this.cQ();
            if ($$4 instanceof bvt) {
               this.a(akg.x, $$3);
            } else if ($$4 instanceof bvv) {
               this.a(akg.y, $$3);
            } else if ($$4 instanceof bnv) {
               this.a(akg.z, $$3);
            } else if ($$4 instanceof bpa) {
               this.a(akg.A, $$3);
            } else if ($$4 instanceof bsd) {
               this.a(akg.D, $$3);
            }
         }
      }

   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      if (this.cr.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(akg.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public rl aW() {
      return new rl(this.fy().getId(), this.fz());
   }

   public boolean fF() {
      if (!this.y && !this.fc() && !this.aR() && !this.a(bbi.y)) {
         cax $$0 = this.c(bbs.e);
         if ($$0.a(caz.mv) && bzw.d($$0)) {
            this.fG();
            return true;
         }
      }

      return false;
   }

   public void fG() {
      this.b(7, true);
   }

   public void fH() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void ba() {
      if (!this.B_()) {
         super.ba();
      }

   }

   @Override
   public bcc.a en() {
      return new bcc.a(ajw.pY, ajw.pO);
   }

   @Override
   public boolean a(agg $$0, bcc $$1) {
      this.b(akg.g.b($$1.ad()));
      return true;
   }

   @Override
   public void a(cvo $$0, dwq $$1) {
      if (!this.cr.b) {
         super.a($$0, $$1);
      }

   }

   public void d(int $$0) {
      this.s($$0);
      this.ck += (float)$$0 / (float)this.fJ();
      this.cj = ami.a(this.cj + $$0, 0, Integer.MAX_VALUE);

      while(this.ck < 0.0F) {
         float $$1 = this.ck * (float)this.fJ();
         if (this.ci > 0) {
            this.c(-1);
            this.ck = 1.0F + $$1 / (float)this.fJ();
         } else {
            this.c(-1);
            this.ck = 0.0F;
         }
      }

      while(this.ck >= 1.0F) {
         this.ck = (this.ck - 1.0F) * (float)this.fJ();
         this.c(1);
         this.ck /= (float)this.fJ();
      }

   }

   public int fI() {
      return this.cl;
   }

   @Override
   public void a(cax $$0, int $$1) {
      this.ci -= $$1;
      if (this.ci < 0) {
         this.ci = 0;
         this.ck = 0.0F;
         this.cj = 0;
      }

      this.cl = this.R.f();
   }

   public void c(int $$0) {
      this.ci += $$0;
      if (this.ci < 0) {
         this.ci = 0;
         this.ck = 0.0F;
         this.cj = 0;
      }

      if ($$0 > 0 && this.ci % 5 == 0 && (float)this.cs < (float)this.S - 100.0F) {
         float $$1 = this.ci > 30 ? 1.0F : (float)this.ci / 30.0F;
         this.s.a(null, this.df(), this.dh(), this.dl(), ajw.pX, this.cR(), $$1 * 0.75F, 1.0F);
         this.cs = this.S;
      }

   }

   public int fJ() {
      if (this.ci >= 30) {
         return 112 + (this.ci - 30) * 9;
      } else {
         return this.ci >= 15 ? 37 + (this.ci - 15) * 5 : 7 + this.ci * 2;
      }
   }

   public void u(float $$0) {
      if (!this.cr.a) {
         if (!this.s.y) {
            this.bV.a($$0);
         }

      }
   }

   public bti fK() {
      return this.bW;
   }

   public bwi fL() {
      return this.bV;
   }

   public boolean s(boolean $$0) {
      return this.cr.a || $$0 || this.bV.c();
   }

   public boolean fM() {
      return this.ef() > 0.0F && this.ef() < this.et();
   }

   public boolean fN() {
      return this.cr.e;
   }

   public boolean a(gt $$0, gy $$1, cax $$2) {
      if (this.cr.e) {
         return true;
      } else {
         gt $$3 = $$0.a($$1.g());
         cvs $$4 = new cvs(this.s, $$3, false);
         return $$2.a(this.s.s().d(hm.h), $$4);
      }
   }

   @Override
   public int dO() {
      if (!this.s.W().b(cgt.d) && !this.B_()) {
         int $$0 = this.ci * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean dP() {
      return true;
   }

   @Override
   public boolean cu() {
      return true;
   }

   @Override
   protected bbn.b aO() {
      return this.cr.b || this.y && this.bO() ? bbn.b.a : bbn.b.d;
   }

   @Override
   public void w() {
   }

   @Override
   public rq X() {
      return rq.b(this.ct.getName());
   }

   public bxu fO() {
      return this.bS;
   }

   @Override
   public cax c(bbs $$0) {
      if ($$0 == bbs.a) {
         return this.cp.f();
      } else if ($$0 == bbs.b) {
         return this.cp.j.get(0);
      } else {
         return $$0.a() == bbs.a.b ? this.cp.i.get($$0.b()) : cax.b;
      }
   }

   @Override
   protected boolean a(bbs $$0) {
      return $$0.a() == bbs.a.b;
   }

   @Override
   public void a(bbs $$0, cax $$1) {
      this.f($$1);
      if ($$0 == bbs.a) {
         this.a($$0, this.cp.h.set(this.cp.k, $$1), $$1);
      } else if ($$0 == bbs.b) {
         this.a($$0, this.cp.j.set(0, $$1), $$1);
      } else if ($$0.a() == bbs.a.b) {
         this.a($$0, this.cp.i.set($$0.b(), $$1), $$1);
      }

   }

   public boolean j(cax $$0) {
      return this.cp.e($$0);
   }

   @Override
   public Iterable<cax> bE() {
      return Lists.newArrayList(new cax[]{this.ez(), this.eA()});
   }

   @Override
   public Iterable<cax> bF() {
      return this.cp.i;
   }

   public boolean h(pj $$0) {
      if (this.bI() || !this.y || this.aR() || this.al) {
         return false;
      } else if (this.fS().f()) {
         this.i($$0);
         this.co = this.s.U();
         return true;
      } else if (this.fT().f()) {
         this.j($$0);
         this.co = this.s.U();
         return true;
      } else {
         return false;
      }
   }

   protected void fP() {
      if (this.co + 20L < this.s.U()) {
         this.k(this.fS());
         this.i(new pj());
         this.k(this.fT());
         this.j(new pj());
      }

   }

   private void k(pj $$0) {
      if (!this.s.y && !$$0.f()) {
         bbr.a($$0, this.s).ifPresent($$0x -> {
            if ($$0x instanceof bcw) {
               ((bcw)$$0x).b(this.aj);
            }

            $$0x.e(this.df(), this.dh() + 0.7F, this.dl());
            ((agg)this.s).c($$0x);
         });
      }

   }

   @Override
   public abstract boolean B_();

   @Override
   public boolean bS() {
      return !this.cr.b && !this.B_() && super.bS();
   }

   public abstract boolean f();

   @Override
   public boolean cr() {
      return !this.cr.b;
   }

   public dxo fQ() {
      return this.s.H();
   }

   @Override
   public rq C_() {
      sb $$0 = dxm.a(this.bY(), this.X());
      return this.a($$0);
   }

   private sb a(sb $$0) {
      String $$1 = this.fy().getName();
      return $$0.a($$1x -> $$1x.a(new ro(ro.a.d, "/tell " + $$1 + " ")).a(this.cx()).a($$1));
   }

   @Override
   public String cq() {
      return this.fy().getName();
   }

   @Override
   public float b(bco $$0, bbo $$1) {
      switch($$0) {
         case d:
         case b:
         case e:
            return 0.4F;
         case f:
            return 1.27F;
         default:
            return 1.62F;
      }
   }

   @Override
   public void t(float $$0) {
      if ($$0 < 0.0F) {
         $$0 = 0.0F;
      }

      this.ai().b(e, $$0);
   }

   @Override
   public float eQ() {
      return this.ai().a(e);
   }

   public boolean a(bud $$0) {
      return (this.ai().a(bO) & $$0.a()) == $$0.a();
   }

   @Override
   public bct k(int $$0) {
      if ($$0 >= 0 && $$0 < this.cp.h.size()) {
         return bct.a(this.cp, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bS.b() ? bct.a(this.bS, $$1) : super.k($$0);
      }
   }

   public boolean fR() {
      return this.cv;
   }

   public void t(boolean $$0) {
      this.cv = $$0;
   }

   @Override
   public void g(int $$0) {
      super.g(this.cr.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bbx eS() {
      return this.Y.a(bP) == 0 ? bbx.a : bbx.b;
   }

   public void a(bbx $$0) {
      this.Y.b(bP, (byte)($$0 == bbx.a ? 0 : 1));
   }

   public pj fS() {
      return this.Y.a(bQ);
   }

   protected void i(pj $$0) {
      this.Y.b(bQ, $$0);
   }

   public pj fT() {
      return this.Y.a(bR);
   }

   protected void j(pj $$0) {
      this.Y.b(bR, $$0);
   }

   public float fU() {
      return (float)(1.0 / this.b(bdd.h) * 20.0);
   }

   public float v(float $$0) {
      return ami.a(((float)this.aQ + $$0) / this.fU(), 0.0F, 1.0F);
   }

   public void fV() {
      this.aQ = 0;
   }

   public cau fW() {
      return this.cx;
   }

   @Override
   protected float aD() {
      return !this.cr.b && !this.fc() ? super.aD() : 1.0F;
   }

   public float fX() {
      return (float)this.b(bdd.k);
   }

   public boolean fY() {
      return this.cr.d && this.B() >= 2;
   }

   @Override
   public boolean g(cax $$0) {
      bbs $$1 = bce.i($$0);
      return this.c($$1).b();
   }

   @Override
   public bbo a(bco $$0) {
      return (bbo)c.getOrDefault($$0, bN);
   }

   @Override
   public ImmutableList<bco> fg() {
      return ImmutableList.of(bco.a, bco.f, bco.d);
   }

   @Override
   public cax h(cax $$0) {
      if (!($$0.c() instanceof cbm)) {
         return cax.b;
      } else {
         Predicate<cax> $$1 = ((cbm)$$0.c()).e();
         cax $$2 = cbm.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cbm)$$0.c()).b();

            for(int $$3 = 0; $$3 < this.cp.b(); ++$$3) {
               cax $$4 = this.cp.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cr.d ? new cax(caz.mR) : cax.b;
         }
      }
   }

   @Override
   public cax a(cgx $$0, cax $$1) {
      this.fL().a($$1.c(), $$1);
      this.b(akg.c.b($$1.c()));
      $$0.a(null, this.df(), this.dh(), this.dl(), ajw.pQ, ajx.h, 0.5F, $$0.w.i() * 0.1F + 0.9F);
      if (this instanceof agh) {
         aj.z.a((agh)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean b(cvo $$0) {
      return this.cr.b || super.b($$0);
   }

   @Override
   public dwq n(float $$0) {
      double $$1 = 0.22 * (this.eS() == bbx.b ? -1.0 : 1.0);
      float $$2 = ami.i($$0 * 0.5F, this.ds(), this.x) * (float) (Math.PI / 180.0);
      float $$3 = ami.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fc() || this.eO()) {
         dwq $$4 = this.e($$0);
         dwq $$5 = this.dd();
         double $$6 = $$5.i();
         double $$7 = $$4.i();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.c * $$4.c + $$5.e * $$4.e) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.c * $$4.e - $$5.e * $$4.c;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.k($$0).e(new dwq($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bT()) {
         return this.k($$0).e(new dwq($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cy().c() - 1.0;
         double $$13 = this.bQ() ? -0.2 : 0.07;
         return this.k($$0).e(new dwq($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dx() {
      return true;
   }

   public boolean fZ() {
      return this.eT() && this.eV().a(caz.pg);
   }

   @Override
   public boolean dw() {
      return false;
   }

   public Optional<hb> ga() {
      return this.cy;
   }

   public void a(Optional<hb> $$0) {
      this.cy = $$0;
   }

   public static enum a {
      a,
      b(rq.c("block.minecraft.bed.no_sleep")),
      c(rq.c("block.minecraft.bed.too_far_away")),
      d(rq.c("block.minecraft.bed.obstructed")),
      e,
      f(rq.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final rq g;

      private a() {
         this.g = null;
      }

      private a(rq $$0) {
         this.g = $$0;
      }

      @Nullable
      public rq a() {
         return this.g;
      }
   }
}
