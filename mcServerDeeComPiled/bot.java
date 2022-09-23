import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bot extends bnb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bY;
   protected static final ImmutableList<blz<? extends bly<? super bot>>> e = ImmutableList.of(blz.c, blz.d, blz.f, blz.r);
   protected static final ImmutableList<bku<?>> bX = ImmutableList.of(bku.n, bku.h, bku.m, bku.E, bku.t, bku.J, bku.O, bku.P, bku.N, bku.r, bku.X);

   public bot(bbr<? extends bnb> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhu(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new bht(this, 10);
   }

   @Override
   protected blc a(cgx $$0) {
      return new ble(this, $$0);
   }

   @Override
   protected bcx.b<bot> dz() {
      return bcx.a(bX, e);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bou.a(this.dz().a($$0));
   }

   @Override
   public bcx<bot> dy() {
      return super.dy();
   }

   @Override
   protected ajv fK() {
      return ajw.uF;
   }

   @Override
   protected void T() {
      this.s.ac().a("tadpoleBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.s.ac().a("tadpoleActivityUpdate");
      bou.a(this);
      this.s.ac().c();
      super.T();
   }

   public static bdc.a fL() {
      return bce.w().a(bdd.d, 1.0).a(bdd.a, 6.0);
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y) {
         this.c(this.bY + 1);
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Age", this.bY);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected ajv r() {
      return null;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.uH;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.uE;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (this.n($$2)) {
         this.a($$0, $$2);
         return baj.a(this.s.y);
      } else {
         return (baj)bng.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void v(boolean $$0) {
   }

   @Override
   public void m(cax $$0) {
      bng.a(this, $$0);
      pj $$1 = $$0.v();
      $$1.a("Age", this.fM());
   }

   @Override
   public void c(pj $$0) {
      bng.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }

   }

   @Override
   public cax b() {
      return new cax(caz.oT);
   }

   @Override
   public ajv t() {
      return ajw.cl;
   }

   private boolean n(cax $$0) {
      return boq.bX.a($$0);
   }

   private void a(buc $$0, cax $$1) {
      this.b($$0, $$1);
      this.b(bbk.c(this.fO()));
      this.s.a(io.J, this.d(1.0), this.di() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(buc $$0, cax $$1) {
      if (!$$0.fB().d) {
         $$1.g(1);
      }

   }

   private int fM() {
      return this.bY;
   }

   private void b(int $$0) {
      this.c(this.bY + $$0 * 20);
   }

   private void c(int $$0) {
      this.bY = $$0;
      if (this.bY >= b) {
         this.fN();
      }

   }

   private void fN() {
      cgx $$1 = this.s;
      if ($$1 instanceof agg $$0) {
         boq $$1 = bbr.H.a(this.s);
         $$1.b(this.df(), this.dh(), this.dl(), this.dq(), this.ds());
         $$1.a($$0, this.s.d_($$1.da()), bcg.i, null, null);
         $$1.s(this.fA());
         if (this.Y()) {
            $$1.b(this.Z());
            $$1.n(this.ct());
         }

         $$1.fp();
         this.a(ajw.uG, 0.15F, 1.0F);
         $$0.a_($$1);
         this.ah();
      }

   }

   private int fO() {
      return Math.max(0, b - this.bY);
   }

   @Override
   public boolean dM() {
      return false;
   }
}
