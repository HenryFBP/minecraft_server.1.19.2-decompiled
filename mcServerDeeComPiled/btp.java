import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class btp extends btk implements bcq, btr {
   private static final Logger cd = LogUtils.getLogger();
   private static final aaj<btq> ce = aam.a(btp.class, aal.r);
   public static final int bZ = 12;
   public static final Map<cat, Integer> ca = ImmutableMap.of(caz.nT, 4, caz.sd, 1, caz.sc, 1, caz.te, 1);
   private static final int cf = 2;
   private static final Set<cat> cg = ImmutableSet.of(caz.nT, caz.sd, caz.sc, caz.nS, caz.nR, caz.te, new cat[]{caz.tf});
   private static final int ch = 10;
   private static final int ci = 1200;
   private static final int cj = 24000;
   private static final int ck = 25;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cb = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private buc cq;
   private boolean cr;
   private int cs;
   private final bkq ct = new bkq();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cz;
   private boolean cA;
   private static final ImmutableList<bku<?>> cB = ImmutableList.of(
      bku.b,
      bku.c,
      bku.d,
      bku.e,
      bku.g,
      bku.h,
      bku.i,
      bku.j,
      bku.k,
      bku.l,
      bku.K,
      bku.m,
      new bku[]{bku.n, bku.q, bku.r, bku.t, bku.v, bku.w, bku.x, bku.y, bku.A, bku.f, bku.C, bku.D, bku.E, bku.G, bku.H, bku.I, bku.F}
   );
   private static final ImmutableList<blz<? extends bly<? super btp>>> cC = ImmutableList.of(blz.c, blz.d, blz.b, blz.e, blz.f, blz.g, blz.h, blz.i, blz.j);
   public static final Map<bku<hb>, BiPredicate<btp, hc<bmv>>> cc = ImmutableMap.of(
      bku.b,
      (BiPredicate)($$0, $$1) -> $$1.a(bmw.n),
      bku.c,
      (BiPredicate)($$0, $$1) -> $$0.fU().b().b().test($$1),
      bku.d,
      (BiPredicate)($$0, $$1) -> bts.a.test($$1),
      bku.e,
      (BiPredicate)($$0, $$1) -> $$1.a(bmw.o)
   );

   public btp(bbr<? extends btp> $$0, cgx $$1) {
      this($$0, $$1, btu.c);
   }

   public btp(bbr<? extends btp> $$0, cgx $$1, btu $$2) {
      super($$0, $$1);
      ((blb)this.D()).b(true);
      this.D().a(true);
      this.r(true);
      this.a(this.fU().a($$2).a(bts.b));
   }

   @Override
   public bcx<btp> dy() {
      return super.dy();
   }

   @Override
   protected bcx.b<btp> dz() {
      return bcx.a(cB, cC);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      bcx<btp> $$1 = this.dz().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(agg $$0) {
      bcx<btp> $$1 = this.dy();
      $$1.b($$0, this);
      this.bD = $$1.h();
      this.a(this.dy());
   }

   private void a(bcx<btp> $$0) {
      bts $$1 = this.fU().b();
      if (this.y_()) {
         $$0.a(bvp.e);
         $$0.a(bvn.d, bgv.a(0.5F));
      } else {
         $$0.a(bvp.f);
         $$0.a(bvn.c, bgv.b($$1, 0.5F), ImmutableSet.of(Pair.of(bku.c, bkv.a)));
      }

      $$0.a(bvn.a, bgv.a($$1, 0.5F));
      $$0.a(bvn.f, bgv.d($$1, 0.5F), ImmutableSet.of(Pair.of(bku.e, bkv.a)));
      $$0.a(bvn.e, bgv.c($$1, 0.5F));
      $$0.a(bvn.b, bgv.e($$1, 0.5F));
      $$0.a(bvn.g, bgv.f($$1, 0.5F));
      $$0.a(bvn.i, bgv.g($$1, 0.5F));
      $$0.a(bvn.h, bgv.h($$1, 0.5F));
      $$0.a(bvn.j, bgv.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(bvn.a));
      $$0.b(bvn.b);
      $$0.a(bvn.b);
      $$0.a(this.s.V(), this.s.U());
   }

   @Override
   protected void n() {
      super.n();
      if (this.s instanceof agg) {
         this.c((agg)this.s);
      }

   }

   public static bdc.a fT() {
      return bce.w().a(bdd.d, 0.5).a(bdd.b, 48.0);
   }

   public boolean fV() {
      return this.cA;
   }

   @Override
   protected void T() {
      this.s.ac().a("villagerBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      if (this.cA) {
         this.cA = false;
      }

      if (!this.fL() && this.co > 0) {
         --this.co;
         if (this.co <= 0) {
            if (this.cp) {
               this.gq();
               this.cp = false;
            }

            this.b(new bbg(bbi.j, 200, 0));
         }
      }

      if (this.cq != null && this.s instanceof agg) {
         ((agg)this.s).a(bmp.e, this.cq, this);
         this.s.a(this, (byte)14);
         this.cq = null;
      }

      if (!this.fA() && this.R.a(100) == 0) {
         bvj $$0 = ((agg)this.s).c(this.da());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.s.a(this, (byte)42);
         }
      }

      if (this.fU().b() == bts.b && this.fL()) {
         this.fQ();
      }

      super.T();
   }

   @Override
   public void k() {
      super.k();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.gs();
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.rJ) || !this.bo() || this.fL() || this.fj()) {
         return super.b($$0, $$1);
      } else if (this.y_()) {
         this.gg();
         return baj.a(this.s.y);
      } else {
         boolean $$3 = this.fM().isEmpty();
         if ($$1 == bai.a) {
            if ($$3 && !this.s.y) {
               this.gg();
            }

            $$0.a(akg.S);
         }

         if ($$3) {
            return baj.a(this.s.y);
         } else {
            if (!this.s.y && !this.bY.isEmpty()) {
               this.g($$0);
            }

            return baj.a(this.s.y);
         }
      }
   }

   private void gg() {
      this.s(40);
      if (!this.s.k_()) {
         this.a(ajw.vJ, this.eC(), this.eD());
      }

   }

   private void g(buc $$0) {
      this.h($$0);
      this.e($$0);
      this.a($$0, this.C_(), this.fU().c());
   }

   @Override
   public void e(@Nullable buc $$0) {
      boolean $$1 = this.fK() != null && $$0 == null;
      super.e($$0);
      if ($$1) {
         this.fQ();
      }

   }

   @Override
   protected void fQ() {
      super.fQ();
      this.gh();
   }

   private void gh() {
      for(cfv $$0 : this.fM()) {
         $$0.l();
      }

   }

   @Override
   public boolean fW() {
      return true;
   }

   @Override
   public boolean fS() {
      return this.W().y;
   }

   public void fX() {
      this.gl();

      for(cfv $$0 : this.fM()) {
         $$0.h();
      }

      this.cx = this.s.U();
      ++this.cy;
   }

   private boolean gi() {
      for(cfv $$0 : this.fM()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gj() {
      return this.cy == 0 || this.cy < 2 && this.s.U() > this.cx + 2400L;
   }

   public boolean fY() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.s.U();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.s.V();
      if (this.cz > 0L) {
         long $$4 = this.cz / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cz = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gt();
      }

      return this.gj() && this.gi();
   }

   private void gk() {
      int $$0 = 2 - this.cy;
      if ($$0 > 0) {
         for(cfv $$1 : this.fM()) {
            $$1.h();
         }
      }

      for(int $$2 = 0; $$2 < $$0; ++$$2) {
         this.gl();
      }

   }

   private void gl() {
      for(cfv $$0 : this.fM()) {
         $$0.e();
      }

   }

   private void h(buc $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for(cfv $$2 : this.fM()) {
            $$2.a(-ami.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bbi.F)) {
         bbg $$3 = $$0.b(bbi.F);
         int $$4 = $$3.d();

         for(cfv $$5 : this.fM()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().K());
            $$5.a(-Math.max($$7, 1));
         }
      }

   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ce, new btq(btu.c, bts.b, 1));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      btq.c.encodeStart(pu.a, this.fU()).resultOrPartial(cd::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", (qc)this.ct.a(pu.a).getValue());
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cy);
      if (this.cA) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<btq> $$1 = btq.c.parse(new Dynamic(pu.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(cd::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bY = new cfw($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      pp $$2 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(pu.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      this.r(true);
      if (this.s instanceof agg) {
         this.c((agg)this.s);
      }

      this.cy = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cA = $$0.q("AssignProfessionWhenSpawned");
      }

   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected ajv r() {
      if (this.fj()) {
         return null;
      } else {
         return this.fL() ? ajw.vK : ajw.vF;
      }
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.vI;
   }

   @Override
   protected ajv x_() {
      return ajw.vH;
   }

   public void fZ() {
      ajv $$0 = this.fU().b().f();
      if ($$0 != null) {
         this.a($$0, this.eC(), this.eD());
      }

   }

   @Override
   public void a(btq $$0) {
      btq $$1 = this.fU();
      if ($$1.b() != $$0.b()) {
         this.bY = null;
      }

      this.Y.b(ce, $$0);
   }

   @Override
   public btq fU() {
      return this.Y.a(ce);
   }

   @Override
   protected void b(cfv $$0) {
      int $$1 = 3 + this.R.a(4);
      this.cw += $$0.o();
      this.cq = this.fK();
      if (this.gp()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.s.b(new bbt(this.s, this.df(), this.dh() + 0.5, this.dl(), $$1));
      }

   }

   public void w(boolean $$0) {
      this.cr = $$0;
   }

   public boolean ga() {
      return this.cr;
   }

   @Override
   public void a(@Nullable bcc $$0) {
      if ($$0 != null && this.s instanceof agg) {
         ((agg)this.s).a(bmp.c, $$0, this);
         if (this.bo() && $$0 instanceof buc) {
            this.s.a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(baw $$0) {
      cd.info("Villager {} died, message: '{}'", this, $$0.a((bcc)this).getString());
      bbn $$1 = $$0.m();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gm();
      super.a($$0);
   }

   private void gm() {
      this.a(bku.b);
      this.a(bku.c);
      this.a(bku.d);
      this.a(bku.e);
   }

   private void a(bbn $$0) {
      cgx $$3 = this.s;
      if ($$3 instanceof agg $$1) {
         Optional<bkw> $$3 = this.bD.c(bku.h);
         if (!$$3.isEmpty()) {
            ((bkw)$$3.get()).b(bcq.class::isInstance).forEach($$2x -> $$1.a(bmp.d, $$0, (bcq)$$2x));
         }
      }
   }

   public void a(bku<hb> $$0) {
      if (this.s instanceof agg) {
         MinecraftServer $$1 = ((agg)this.s).n();
         this.bD.c($$0).ifPresent($$2 -> {
            agg $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bms $$4 = $$3.x();
               Optional<hc<bmv>> $$5 = $$4.c($$2.b());
               BiPredicate<btp, hc<bmv>> $$6 = (BiPredicate)cc.get($$0);
               if ($$5.isPresent() && $$6.test(this, (hc)$$5.get())) {
                  $$4.b($$2.b());
                  xl.c($$3, $$2.b());
               }

            }
         });
      }
   }

   @Override
   public boolean g() {
      return this.cs + this.gr() >= 12 && this.j() == 0;
   }

   private boolean gn() {
      return this.cs < 12;
   }

   private void go() {
      if (this.gn() && this.gr() != 0) {
         for(int $$0 = 0; $$0 < this.t().b(); ++$$0) {
            cax $$1 = this.t().a($$0);
            if (!$$1.b()) {
               Integer $$2 = (Integer)ca.get($$1.c());
               if ($$2 != null) {
                  int $$3 = $$1.K();

                  for(int $$4 = $$3; $$4 > 0; --$$4) {
                     this.cs += $$2;
                     this.t().a($$0, 1);
                     if (!this.gn()) {
                        return;
                     }
                  }
               }
            }
         }

      }
   }

   public int f(buc $$0) {
      return this.ct.a($$0.co(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cs -= $$0;
   }

   public void gb() {
      this.go();
      this.v(12);
   }

   public void b(cfw $$0) {
      this.bY = $$0;
   }

   private boolean gp() {
      int $$0 = this.fU().c();
      return btq.d($$0) && this.cw >= btq.c($$0);
   }

   private void gq() {
      this.a(this.fU().a(this.fU().c() + 1));
      this.fR();
   }

   @Override
   protected rq cf() {
      return rq.c(this.ad().g() + "." + hm.ap.b(this.fU().b()).a());
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 12) {
         this.a(io.L);
      } else if ($$0 == 13) {
         this.a(io.b);
      } else if ($$0 == 14) {
         this.a(io.J);
      } else if ($$0 == 42) {
         this.a(io.af);
      } else {
         super.a($$0);
      }

   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$2 == bcg.e) {
         this.a(this.fU().a(bts.b));
      }

      if ($$2 == bcg.n || $$2 == bcg.m || $$2 == bcg.c || $$2 == bcg.o) {
         this.a(this.fU().a(btu.a($$0.w(this.da()))));
      }

      if ($$2 == bcg.d) {
         this.cA = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public btp b(agg $$0, bbk $$1) {
      double $$2 = this.R.j();
      btu $$3;
      if ($$2 < 0.5) {
         $$3 = btu.a($$0.w(this.da()));
      } else if ($$2 < 0.75) {
         $$3 = this.fU().a();
      } else {
         $$3 = ((btp)$$1).fU().a();
      }

      btp $$6 = new btp(bbr.aZ, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.da()), bcg.e, null, null);
      return $$6;
   }

   @Override
   public void a(agg $$0, bcb $$1) {
      if ($$0.ag() != bag.a) {
         cd.info("Villager {} was struck by lightning {}.", this, $$1);
         bsg $$2 = bbr.bd.a((cgx)$$0);
         $$2.b(this.df(), this.dh(), this.dl(), this.dq(), this.ds());
         $$2.a($$0, $$0.d_($$2.da()), bcg.i, null, null);
         $$2.s(this.fA());
         if (this.Y()) {
            $$2.b(this.Z());
            $$2.n(this.ct());
         }

         $$2.fp();
         $$0.a_($$2);
         this.gm();
         this.ah();
      } else {
         super.a($$0, $$1);
      }

   }

   @Override
   protected void b(bqv $$0) {
      btn.a(this, this, $$0);
   }

   @Override
   public boolean l(cax $$0) {
      cat $$1 = $$0.c();
      return (cg.contains($$1) || this.fU().b().d().contains($$1)) && this.t().b($$0);
   }

   public boolean gc() {
      return this.gr() >= 24;
   }

   public boolean gd() {
      return this.gr() < 12;
   }

   private int gr() {
      bao $$0 = this.t();
      return ca.entrySet().stream().mapToInt($$1 -> $$0.a_((cat)$$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean ge() {
      return this.t().a(ImmutableSet.of(caz.nR, caz.sd, caz.sc, caz.tf));
   }

   @Override
   protected void fR() {
      btq $$0 = this.fU();
      Int2ObjectMap<btt.f[]> $$1 = (Int2ObjectMap)btt.a.get($$0.b());
      if ($$1 != null && !$$1.isEmpty()) {
         btt.f[] $$2 = (btt.f[])$$1.get($$0.c());
         if ($$2 != null) {
            cfw $$3 = this.fM();
            this.a($$3, $$2, 2);
         }
      }
   }

   public void a(agg $$0, btp $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.R, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gs() {
      long $$0 = this.s.U();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(agg $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         dwl $$3 = this.cy().c(10.0, 10.0, 10.0);
         List<btp> $$4 = $$0.a(btp.class, $$3);
         List<btp> $$5 = (List)$$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (amu.a(bbr.S, bcg.f, $$0, this.da(), 10, 8, 6, amu.a.a).isPresent()) {
               $$4.forEach(bll::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      if (!this.b(this.s.U())) {
         return false;
      } else {
         return !this.bD.a(bku.F);
      }
   }

   @Override
   public void a(bmp $$0, bbn $$1) {
      if ($$0 == bmp.a) {
         this.ct.a($$1.co(), bkr.d, 20);
         this.ct.a($$1.co(), bkr.c, 25);
      } else if ($$0 == bmp.e) {
         this.ct.a($$1.co(), bkr.e, 2);
      } else if ($$0 == bmp.c) {
         this.ct.a($$1.co(), bkr.b, 25);
      } else if ($$0 == bmp.d) {
         this.ct.a($$1.co(), bkr.a, 25);
      }

   }

   @Override
   public int fJ() {
      return this.cw;
   }

   public void u(int $$0) {
      this.cw = $$0;
   }

   private void gt() {
      this.gk();
      this.cy = 0;
   }

   public bkq gf() {
      return this.ct;
   }

   public void a(qc $$0) {
      this.ct.a(new Dynamic(pu.a, $$0));
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public void b(gt $$0) {
      super.b($$0);
      this.bD.a(bku.G, this.s.U());
      this.bD.b(bku.m);
      this.bD.b(bku.E);
   }

   @Override
   public void fk() {
      super.fk();
      this.bD.a(bku.H, this.s.U());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(bku.G);
      if ($$1.isPresent()) {
         return $$0 - $$1.get() < 24000L;
      } else {
         return false;
      }
   }
}
