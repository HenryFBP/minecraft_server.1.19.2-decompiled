import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

public class boi extends bcl implements btn {
   private static final Logger e = LogUtils.getLogger();
   private static final int bX = 16;
   private static final hs bY = new hs(1, 1, 1);
   private static final int bZ = 5;
   private static final float ca = 55.0F;
   private static final float cb = 15.0F;
   private static final float cc = 0.5F;
   private static final cdm cd = cdm.a(caz.mY);
   private static final int ce = 6000;
   private static final int cf = 3;
   private static final aaj<Boolean> cg = aam.a(boi.class, aal.i);
   private static final aaj<Boolean> ch = aam.a(boi.class, aal.i);
   protected static final ImmutableList<blz<? extends bly<? super boi>>> b = ImmutableList.of(blz.c, blz.d, blz.f, blz.b);
   protected static final ImmutableList<bku<?>> c = ImmutableList.of(
      bku.t, bku.n, bku.h, bku.m, bku.E, bku.x, bku.K, bku.aK, bku.aL, bku.aM, bku.aN, bku.X, new bku[0]
   );
   public static final ImmutableList<Float> d = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final czs<dab> ci;
   private final dab.b cj;
   private final czs<boi.b> ck;
   private final bao cl = new bao(1);
   @Nullable
   private gt cm;
   private long cn;
   private float co;
   private float cp;
   private float cq;
   private float cr;
   private float cs;

   public boi(bbr<? extends boi> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhp(this, 20, true);
      this.r(this.fq());
      czy $$2 = new czt(this, this.cA());
      this.cj = new boi.a();
      this.ci = new czs<>(new dab($$2, 16, this.cj, null, 0.0F, 0));
      this.ck = new czs<>(new boi.b($$2, czv.E.b()));
   }

   @Override
   protected bcx.b<boi> dz() {
      return bcx.a(c, b);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return boj.a(this.dz().a($$0));
   }

   @Override
   public bcx<boi> dy() {
      return super.dy();
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 20.0).a(bdd.e, 0.1F).a(bdd.d, 0.1F).a(bdd.f, 2.0).a(bdd.b, 48.0);
   }

   @Override
   protected blc a(cgx $$0) {
      bla $$1 = new bla(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cg, false);
      this.Y.a(ch, true);
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() || this.cP()) {
         if (this.aR()) {
            this.a(0.02F, $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a(0.8F));
         } else if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a(0.5));
         } else {
            this.a(this.eK(), $$0);
            this.a(bci.a, this.dd());
            this.f(this.dd().a(0.91F));
         }
      }

      this.a(this, false);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      bbn $$3 = $$0.m();
      if ($$3 instanceof buc $$2) {
         Optional<UUID> $$3 = this.dy().c(bku.aK);
         if ($$3.isPresent() && $$2.co().equals($$3.get())) {
            return false;
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
   }

   @Override
   protected ajv r() {
      return this.b(bbs.a) ? ajw.a : ajw.b;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.d;
   }

   @Override
   protected ajv x_() {
      return ajw.c;
   }

   @Override
   protected float eC() {
      return 0.4F;
   }

   @Override
   protected void T() {
      this.s.ac().a("allayBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.s.ac().a("allayActivityUpdate");
      boj.a(this);
      this.s.ac().c();
      super.T();
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y && this.bo() && this.S % 10 == 0) {
         this.b(1.0F);
      }

      if (this.fJ() && this.fM() && this.S % 20 == 0) {
         this.v(false);
         this.cm = null;
      }

      this.fN();
   }

   @Override
   public void k() {
      super.k();
      if (this.s.y) {
         this.cp = this.co;
         if (this.q()) {
            this.co = ami.a(this.co + 1.0F, 0.0F, 5.0F);
         } else {
            this.co = ami.a(this.co - 1.0F, 0.0F, 5.0F);
         }

         if (this.fJ()) {
            ++this.cq;
            this.cs = this.cr;
            if (this.fK()) {
               ++this.cr;
            } else {
               --this.cr;
            }

            this.cr = ami.a(this.cr, 0.0F, 15.0F);
         } else {
            this.cq = 0.0F;
            this.cr = 0.0F;
            this.cs = 0.0F;
         }
      } else {
         this.ci.a().a(this.s);
      }

   }

   @Override
   public boolean fq() {
      return !this.fL() && this.q();
   }

   public boolean q() {
      return !this.b(bai.a).b();
   }

   @Override
   public boolean g(cax $$0) {
      return false;
   }

   private boolean fL() {
      return this.dy().a(bku.aN, bkv.a);
   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      cax $$3 = this.b(bai.a);
      if (this.fJ() && this.m($$2) && this.fQ()) {
         this.fO();
         this.s.a(this, (byte)18);
         this.s.a($$0, this, ajw.E, ajx.g, 2.0F, 1.0F);
         this.a($$0, $$2);
         return baj.a;
      } else if ($$3.b() && !$$2.b()) {
         cax $$4 = $$2.o();
         $$4.e(1);
         this.a(bai.a, $$4);
         this.a($$0, $$2);
         this.s.a($$0, this, ajw.e, ajx.g, 2.0F, 1.0F);
         this.dy().a(bku.aK, $$0.co());
         return baj.a;
      } else if (!$$3.b() && $$1 == bai.a && $$2.b()) {
         this.a(bbs.a, cax.b);
         this.s.a($$0, this, ajw.f, ajx.g, 2.0F, 1.0F);
         this.a(bai.a);

         for(cax $$5 : this.t().f()) {
            bdp.a(this, $$5, this.cY());
         }

         this.dy().b(bku.aK);
         $$0.j($$3);
         return baj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void b(gt $$0, boolean $$1) {
      if ($$1) {
         if (!this.fJ()) {
            this.cm = $$0;
            this.v(true);
         }
      } else if ($$0.equals(this.cm) || this.cm == null) {
         this.cm = null;
         this.v(false);
      }

   }

   @Override
   public bao t() {
      return this.cl;
   }

   @Override
   protected hs O() {
      return bY;
   }

   @Override
   public boolean l(cax $$0) {
      cax $$1 = this.b(bai.a);
      return !$$1.b() && $$1.b($$0) && this.cl.b($$0) && this.s.W().b(cgt.c);
   }

   @Override
   protected void b(bqv $$0) {
      btn.a(this, this, $$0);
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public boolean aL() {
      return !this.aw();
   }

   @Override
   public void a(BiConsumer<czs<?>, agg> $$0) {
      cgx var3 = this.s;
      if (var3 instanceof agg $$1) {
         $$0.accept(this.ci, $$1);
         $$0.accept(this.ck, $$1);
      }

   }

   public boolean fJ() {
      return this.Y.a(cg);
   }

   public void v(boolean $$0) {
      if (!this.s.y) {
         this.Y.b(cg, $$0);
      }
   }

   private boolean fM() {
      return this.cm == null || !this.cm.a(this.cY(), (double)czv.E.b()) || !this.s.a_(this.cm).a(cju.dc);
   }

   public float y(float $$0) {
      return ami.i($$0, this.cp, this.co) / 5.0F;
   }

   public boolean fK() {
      float $$0 = this.cq % 55.0F;
      return $$0 < 15.0F;
   }

   public float z(float $$0) {
      return ami.i($$0, this.cs, this.cr) / 15.0F;
   }

   @Override
   protected void ei() {
      super.ei();
      this.cl.f().forEach(this::b);
      cax $$0 = this.c(bbs.a);
      if (!$$0.b() && !cet.e($$0)) {
         this.b($$0);
         this.a(bbs.a, cax.b);
      }

   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Inventory", (qc)this.cl.g());
      dab.a(this.cj).encodeStart(pu.a, this.ci.a()).resultOrPartial(e::error).ifPresent($$1 -> $$0.a("listener", $$1));
      $$0.a("DuplicationCooldown", this.cn);
      $$0.a("CanDuplicate", this.fQ());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.cl.a($$0.c("Inventory", 10));
      if ($$0.b("listener", 10)) {
         dab.a(this.cj).parse(new Dynamic(pu.a, $$0.p("listener"))).resultOrPartial(e::error).ifPresent($$0x -> this.ci.a($$0x, this.s));
      }

      this.cn = (long)$$0.h("DuplicationCooldown");
      this.Y.b(ch, $$0.q("CanDuplicate"));
   }

   @Override
   protected boolean fH() {
      return false;
   }

   @Override
   public Iterable<gt> fF() {
      dwl $$0 = this.cy();
      int $$1 = ami.b($$0.a - 0.5);
      int $$2 = ami.b($$0.d + 0.5);
      int $$3 = ami.b($$0.c - 0.5);
      int $$4 = ami.b($$0.f + 0.5);
      int $$5 = ami.b($$0.b - 0.5);
      int $$6 = ami.b($$0.e + 0.5);
      return gt.b($$1, $$5, $$3, $$2, $$6, $$4);
   }

   private void fN() {
      if (this.cn > 0L) {
         --this.cn;
      }

      if (!this.s.k_() && this.cn == 0L && !this.fQ()) {
         this.Y.b(ch, true);
      }

   }

   private boolean m(cax $$0) {
      return cd.a($$0);
   }

   private void fO() {
      boi $$0 = bbr.b.a(this.s);
      if ($$0 != null) {
         $$0.d(this.cY());
         $$0.fp();
         $$0.fP();
         this.fP();
         this.s.b($$0);
      }

   }

   private void fP() {
      this.cn = 6000L;
      this.Y.b(ch, false);
   }

   private boolean fQ() {
      return this.Y.a(ch);
   }

   private void a(buc $$0, cax $$1) {
      if (!$$0.fB().d) {
         $$1.g(1);
      }

   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)this.cA() * 0.6, (double)this.cW() * 0.1);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 18) {
         for(int $$1 = 0; $$1 < 3; ++$$1) {
            this.fR();
         }
      } else {
         super.a($$0);
      }

   }

   private void fR() {
      double $$0 = this.R.k() * 0.02;
      double $$1 = this.R.k() * 0.02;
      double $$2 = this.R.k() * 0.02;
      this.s.a(io.L, this.d(1.0), this.di() + 0.5, this.g(1.0), $$0, $$1, $$2);
   }

   class a implements dab.b {
      @Override
      public boolean a(agg $$0, czx $$1, gt $$2, czv $$3, czv.a $$4) {
         if (boi.this.W() == $$0 && !boi.this.dt() && !boi.this.fA()) {
            Optional<hb> $$5 = boi.this.dy().c(bku.aL);
            if ($$5.isEmpty()) {
               return true;
            } else {
               hb $$6 = (hb)$$5.get();
               return $$6.a().equals($$0.ab()) && $$6.b().equals($$2);
            }
         } else {
            return false;
         }
      }

      @Override
      public void a(agg $$0, czx $$1, gt $$2, czv $$3, @Nullable bbn $$4, @Nullable bbn $$5, float $$6) {
         if ($$3 == czv.H) {
            boj.a(boi.this, new gt($$2));
         }

      }

      @Override
      public akz<czv> a() {
         return akq.e;
      }
   }

   class b implements czx {
      private final czy b;
      private final int c;

      public b(czy $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public czy a() {
         return this.b;
      }

      @Override
      public int b() {
         return this.c;
      }

      @Override
      public boolean a(agg $$0, czv.b $$1) {
         if ($$1.a() == czv.E) {
            boi.this.b(new gt($$1.b()), true);
            return true;
         } else if ($$1.a() == czv.F) {
            boi.this.b(new gt($$1.b()), false);
            return true;
         } else {
            return false;
         }
      }
   }
}
