import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class btg extends brq implements dab.b {
   private static final Logger bZ = LogUtils.getLogger();
   private static final int ca = 16;
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final aaj<Integer> ci = aam.a(btg.class, aal.b);
   private static final int cj = 200;
   private static final int ck = 260;
   private static final int cl = 20;
   private static final int cm = 120;
   private static final int cn = 20;
   private static final int co = 35;
   private static final int cp = 10;
   private static final int cq = 20;
   private static final int cr = 100;
   private static final int cs = 20;
   private static final int ct = 30;
   private static final float cu = 4.5F;
   private static final float cv = 0.7F;
   private static final int cw = 30;
   private int cx;
   private int cy;
   private int cz;
   private int cA;
   public bbl b = new bbl();
   public bbl c = new bbl();
   public bbl d = new bbl();
   public bbl e = new bbl();
   public bbl bX = new bbl();
   public bbl bY = new bbl();
   private final czs<dab> cB;
   private btf cC = new btf(this::a, Collections.emptyList());

   public btg(bbr<? extends brq> $$0, cgx $$1) {
      super($$0, $$1);
      this.cB = new czs<>(new dab(new czt(this, this.cA()), 16, this, null, 0.0F, 0));
      this.bN = 5;
      this.D().a(true);
      this.a(dqh.m, 0.0F);
      this.a(dqh.s, 8.0F);
      this.a(dqh.f, 8.0F);
      this.a(dqh.i, 8.0F);
      this.a(dqh.o, 0.0F);
      this.a(dqh.n, 0.0F);
   }

   @Override
   public tc<?> S() {
      return new tg((bcc)this, this.c(bco.m) ? 1 : 0);
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      if ($$0.n() == 1) {
         this.b(bco.m);
      }

   }

   @Override
   public boolean a(cha $$0) {
      return super.a($$0) && $$0.a(this, this.ad().m().a(this.cY()));
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(baw $$0) {
      return this.fM() && !$$0.i() ? true : super.b($$0);
   }

   private boolean fM() {
      return this.c(bco.n) || this.c(bco.m);
   }

   @Override
   protected boolean l(bbn $$0) {
      return false;
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   protected float aF() {
      return this.J + 0.55F;
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 500.0).a(bdd.d, 0.3F).a(bdd.c, 1.0).a(bdd.g, 1.5).a(bdd.f, 30.0);
   }

   @Override
   public boolean aP() {
      return true;
   }

   @Override
   protected float eC() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected ajv r() {
      return !this.c(bco.k) && !this.fM() ? this.fJ().b() : null;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.wB;
   }

   @Override
   protected ajv x_() {
      return ajw.wx;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.wL, 10.0F, 1.0F);
   }

   @Override
   public boolean z(bbn $$0) {
      this.s.a(this, (byte)4);
      this.a(ajw.ww, 10.0F, this.eD());
      bhk.a(this, 40);
      return super.z($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ci, 0);
   }

   public int q() {
      return this.Y.a(ci);
   }

   private void fP() {
      this.Y.b(ci, this.fS());
   }

   @Override
   public void k() {
      cgx var2 = this.s;
      if (var2 instanceof agg $$0) {
         this.cB.a().a($$0);
         if (this.fr() || this.P()) {
            bth.a((bcc)this);
         }
      }

      super.k();
      if (this.s.k_()) {
         if (this.S % this.fQ() == 0) {
            this.cz = 10;
            if (!this.aM()) {
               this.s.a(this.df(), this.dh(), this.dl(), ajw.wA, this.cR(), 5.0F, this.eD(), false);
            }
         }

         this.cy = this.cx;
         if (this.cx > 0) {
            --this.cx;
         }

         this.cA = this.cz;
         if (this.cz > 0) {
            --this.cz;
         }

         switch(this.ak()) {
            case m:
               this.a(this.d);
               break;
            case n:
               this.a(this.e);
         }
      }

   }

   @Override
   protected void T() {
      agg $$0 = (agg)this.s;
      $$0.ac().a("wardenBrain");
      this.dy().a($$0, this);
      this.s.ac().c();
      super.T();
      if ((this.S + this.ae()) % 120 == 0) {
         a($$0, this.cY(), this, 20);
      }

      if (this.S % 20 == 0) {
         this.cC.a($$0, this::a);
         this.fP();
      }

      bth.a(this);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bX.a(this.S);
      } else if ($$0 == 61) {
         this.cx = 10;
      } else if ($$0 == 62) {
         this.bY.a(this.S);
      } else {
         super.a($$0);
      }

   }

   private int fQ() {
      float $$0 = (float)this.q() / (float)bte.c.a();
      return 40 - ami.d(ami.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float y(float $$0) {
      return ami.i($$0, (float)this.cy, (float)this.cx) / 10.0F;
   }

   public float z(float $$0) {
      return ami.i($$0, (float)this.cA, (float)this.cz) / 10.0F;
   }

   private void a(bbl $$0) {
      if ((float)$$0.b() < 4500.0F) {
         amn $$1 = this.dQ();
         cvo $$2 = this.bc();
         if ($$2.i() != cpp.a) {
            for(int $$3 = 0; $$3 < 30; ++$$3) {
               double $$4 = this.df() + (double)ami.b($$1, -0.7F, 0.7F);
               double $$5 = this.dh();
               double $$6 = this.dl() + (double)ami.b($$1, -0.7F, 0.7F);
               this.s.a(new ig(io.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }

   }

   @Override
   public void a(aaj<?> $$0) {
      if (ad.equals($$0)) {
         switch(this.ak()) {
            case m:
               this.d.a(this.S);
               break;
            case n:
               this.e.a(this.S);
               break;
            case k:
               this.b.a(this.S);
               break;
            case l:
               this.c.a(this.S);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean cE() {
      return this.fM();
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bth.a(this, $$0);
   }

   @Override
   public bcx<btg> dy() {
      return super.dy();
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public void a(BiConsumer<czs<?>, agg> $$0) {
      cgx var3 = this.s;
      if (var3 instanceof agg $$1) {
         $$0.accept(this.cB, $$1);
      }

   }

   @Override
   public akz<czv> a() {
      return akq.b;
   }

   @Override
   public boolean t() {
      return true;
   }

   @Contract("null->false")
   public boolean a(@Nullable bbn $$0) {
      if ($$0 instanceof bcc $$1
         && this.s == $$0.s
         && bbq.e.test($$0)
         && !this.p($$0)
         && $$1.ad() != bbr.d
         && $$1.ad() != bbr.bc
         && !$$1.ci()
         && !$$1.eg()
         && this.s.p_().a($$1.cy())) {
         return true;
      }

      return false;
   }

   public static void a(agg $$0, dwq $$1, @Nullable bbn $$2, int $$3) {
      bbg $$4 = new bbg(bbi.G, 260, 0, false, false);
      bbh.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      btf.a(this::a).encodeStart(pu.a, this.cC).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("anger", $$1));
      dab.a(this).encodeStart(pu.a, this.cB.a()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         btf.a(this::a).parse(new Dynamic(pu.a, $$0.c("anger"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cC = $$0x);
         this.fP();
      }

      if ($$0.b("listener", 10)) {
         dab.a(this).parse(new Dynamic(pu.a, $$0.p("listener"))).resultOrPartial(bZ::error).ifPresent($$0x -> this.cB.a($$0x, this.s));
      }

   }

   private void fR() {
      if (!this.c(bco.k)) {
         this.a(this.fJ().c(), 10.0F, this.eD());
      }

   }

   public bte fJ() {
      return bte.a(this.fS());
   }

   private int fS() {
      return this.cC.b(this.G());
   }

   public void b(bbn $$0) {
      this.cC.a($$0);
   }

   public void c(@Nullable bbn $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bbn $$0, int $$1, boolean $$2) {
      if (!this.fA() && this.a($$0)) {
         bth.a((bcc)this);
         boolean $$3 = !(this.dy().c(bku.o).orElse(null) instanceof buc);
         int $$4 = this.cC.a($$0, $$1);
         if ($$0 instanceof buc && $$3 && bte.a($$4).d()) {
            this.dy().b(bku.o);
         }

         if ($$2) {
            this.fR();
         }
      }

   }

   public Optional<bcc> fK() {
      return this.fJ().d() ? this.cC.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bcc G() {
      return (bcc)this.dy().c(bku.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.dy().a(bku.aC, anf.a, 1200L);
      if ($$2 == bcg.k) {
         this.b(bco.m);
         this.dy().a(bku.aA, anf.a, (long)bth.a);
         this.a(ajw.wt, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.s.y && !this.fA() && !this.fM()) {
         bbn $$3 = $$0.m();
         this.a($$3, bte.c.a() + 20, false);
         if (this.bD.c(bku.o).isEmpty() && $$3 instanceof bcc $$4 && (!($$0 instanceof bay) || this.a($$4, 5.0))) {
            this.k($$4);
         }
      }

      return $$2;
   }

   public void k(bcc $$0) {
      this.dy().b(bku.aw);
      bgb.a(this, $$0);
      bhk.a(this, 200);
   }

   @Override
   public bbo a(bco $$0) {
      bbo $$1 = super.a($$0);
      return this.fM() ? bbo.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bl() {
      return !this.fM() && super.bl();
   }

   @Override
   protected void A(bbn $$0) {
      if (!this.fA() && !this.dy().a(bku.aF)) {
         this.dy().a(bku.aF, anf.a, 20L);
         this.c($$0);
         bth.a(this, $$0.da());
      }

      super.A($$0);
   }

   @Override
   public boolean a(agg $$0, czx $$1, gt $$2, czv $$3, czv.a $$4) {
      if (!this.fA() && !this.eg() && !this.dy().a(bku.aG) && !this.fM() && $$0.p_().a($$2) && !this.dt() && this.s == $$0) {
         bbn var7 = $$4.a();
         if (var7 instanceof bcc $$5 && !this.a($$5)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(agg $$0, czx $$1, gt $$2, czv $$3, @Nullable bbn $$4, @Nullable bbn $$5, float $$6) {
      if (!this.eg()) {
         this.bD.a(bku.aG, anf.a, 40L);
         $$0.a(this, (byte)61);
         this.a(ajw.wM, 5.0F, this.eD());
         gt $$7 = $$2;
         if ($$5 != null) {
            if (this.a($$5, 30.0)) {
               if (this.dy().a(bku.ay)) {
                  if (this.a($$5)) {
                     $$7 = $$5.da();
                  }

                  this.c($$5);
               } else {
                  this.a($$5, 10, true);
               }
            }

            this.dy().a(bku.ay, anf.a, 100L);
         } else {
            this.c($$4);
         }

         if (!this.fJ().d()) {
            Optional<bcc> $$8 = this.cC.a();
            if ($$5 != null || $$8.isEmpty() || $$8.get() == $$4) {
               bth.a(this, $$7);
            }
         }

      }
   }

   @VisibleForTesting
   public btf fL() {
      return this.cC;
   }

   @Override
   protected blc a(cgx $$0) {
      return new blb(this, $$0) {
         @Override
         protected dqn a(int $$0) {
            this.o = new dqq();
            this.o.a(true);
            return new dqn(this.o, $$0) {
               @Override
               protected float a(dqj $$0, dqj $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }
}
