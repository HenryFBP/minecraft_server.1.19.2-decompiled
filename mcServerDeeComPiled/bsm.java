import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bsm extends bne implements bri, bso {
   private static final aaj<Boolean> ca = aam.a(bsm.class, aal.i);
   private static final float cb = 0.2F;
   private static final int cc = 40;
   private static final float cd = 0.3F;
   private static final int ce = 1;
   private static final float cf = 0.6F;
   private static final int cg = 6;
   private static final float ch = 0.5F;
   private static final int ci = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends blz<? extends bly<? super bsm>>> bX = ImmutableList.of(blz.c, blz.d, blz.n, blz.m);
   protected static final ImmutableList<? extends bku<?>> bY = ImmutableList.of(
      bku.r, bku.g, bku.h, bku.k, bku.l, bku.n, bku.m, bku.E, bku.t, bku.o, bku.p, bku.ao, new bku[]{bku.z, bku.aq, bku.ar, bku.an, bku.J, bku.au, bku.av}
   );

   public bsm(bbr<? extends bsm> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public boolean a(buc $$0) {
      return !this.fy();
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.a, 40.0).a(bdd.d, 0.3F).a(bdd.c, 0.6F).a(bdd.g, 1.0).a(bdd.f, 6.0);
   }

   @Override
   public boolean z(bbn $$0) {
      if (!($$0 instanceof bcc)) {
         return false;
      } else {
         this.cj = 10;
         this.s.a(this, (byte)4);
         this.a(ajw.iQ, 1.0F, this.eD());
         bsn.a(this, (bcc)$$0);
         return bso.a(this, (bcc)$$0);
      }
   }

   @Override
   protected void e(bcc $$0) {
      if (this.t()) {
         bso.b(this, $$0);
      }

   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.s.y) {
         return false;
      } else {
         if ($$2 && $$0.m() instanceof bcc) {
            bsn.b(this, (bcc)$$0.m());
         }

         return $$2;
      }
   }

   @Override
   protected bcx.b<bsm> dz() {
      return bcx.a(bY, bX);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bsn.a(this.dz().a($$0));
   }

   @Override
   public bcx<bsm> dy() {
      return super.dy();
   }

   @Override
   protected void T() {
      this.s.ac().a("hoglinBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      bsn.a(this);
      if (this.fK()) {
         ++this.ck;
         if (this.ck > 300) {
            this.b(ajw.iR);
            this.c((agg)this.s);
         }
      } else {
         this.ck = 0;
      }

   }

   @Override
   public void w_() {
      if (this.cj > 0) {
         --this.cj;
      }

      super.w_();
   }

   @Override
   protected void n() {
      if (this.y_()) {
         this.bN = 3;
         this.a(bdd.f).a(0.5);
      } else {
         this.bN = 5;
         this.a(bdd.f).a(6.0);
      }

   }

   public static boolean c(bbr<bsm> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return !$$1.a_($$3.c()).a(cju.jw);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$0.r_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fr();
   }

   @Override
   public float a(gt $$0, cha $$1) {
      if (bsn.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.c()).a(cju.nh) ? 10.0F : 0.0F;
      }
   }

   @Override
   public double bt() {
      return (double)this.cX() - (this.y_() ? 0.2 : 0.15);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      baj $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fp();
      }

      return $$2;
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.a(ajw.iQ, 1.0F, this.eD());
      } else {
         super.a($$0);
      }

   }

   @Override
   public int fJ() {
      return this.cj;
   }

   @Override
   public boolean dM() {
      return true;
   }

   @Override
   public int dO() {
      return this.bN;
   }

   private void c(agg $$0) {
      bsi $$1 = this.a(bbr.bi, true);
      if ($$1 != null) {
         $$1.b(new bbg(bbi.i, 200, 0));
      }

   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(caz.cR);
   }

   public boolean t() {
      return !this.y_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ca, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.fR()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.w($$0.q("CannotBeHunted"));
   }

   public void v(boolean $$0) {
      this.ai().b(ca, $$0);
   }

   private boolean fR() {
      return this.ai().a(ca);
   }

   public boolean fK() {
      return !this.s.q_().b() && !this.fR() && !this.fA();
   }

   private void w(boolean $$0) {
      this.cl = $$0;
   }

   public boolean fL() {
      return this.t() && !this.cl;
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      bsm $$2 = bbr.O.a((cgx)$$0);
      if ($$2 != null) {
         $$2.fp();
      }

      return $$2;
   }

   @Override
   public boolean fM() {
      return !bsn.c(this) && super.fM();
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected ajv r() {
      return this.s.y ? null : (ajv)bsn.b(this).orElse(null);
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.iT;
   }

   @Override
   protected ajv x_() {
      return ajw.iS;
   }

   @Override
   protected ajv aG() {
      return ajw.jy;
   }

   @Override
   protected ajv aH() {
      return ajw.jx;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.iV, 0.15F, 1.0F);
   }

   protected void b(ajv $$0) {
      this.a($$0, this.eC(), this.eD());
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }
}
