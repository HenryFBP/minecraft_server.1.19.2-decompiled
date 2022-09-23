import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bsv extends bsr {
   private static final int bY = 50;
   private static final float bZ = 0.35F;
   private static final int ca = 7;
   protected static final ImmutableList<blz<? extends bly<? super bsv>>> e = ImmutableList.of(blz.c, blz.d, blz.b, blz.f, blz.l);
   protected static final ImmutableList<bku<?>> bX = ImmutableList.of(
      bku.n, bku.v, bku.g, bku.h, bku.k, bku.l, bku.am, bku.al, bku.x, bku.y, bku.m, bku.E, new bku[]{bku.o, bku.p, bku.q, bku.t, bku.Z, bku.L, bku.b}
   );

   public bsv(bbr<? extends bsv> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bdc.a t() {
      return brq.fO().a(bdd.a, 50.0).a(bdd.d, 0.35F).a(bdd.f, 7.0);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      bsw.a(this);
      this.a($$0.r_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      this.a(bbs.a, new cax(caz.nu));
   }

   @Override
   protected bcx.b<bsv> dz() {
      return bcx.a(bX, e);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bsw.a(this, this.dz().a($$0));
   }

   @Override
   public bcx<bsv> dy() {
      return super.dy();
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public boolean l(cax $$0) {
      return $$0.a(caz.nu) ? super.l($$0) : false;
   }

   @Override
   protected void T() {
      this.s.ac().a("piglinBruteBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      bsw.b(this);
      bsw.c(this);
      super.T();
   }

   @Override
   public bsu fL() {
      return this.fC() && this.fM() ? bsu.a : bsu.f;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.s.y) {
         return false;
      } else {
         if ($$2 && $$0.m() instanceof bcc) {
            bsw.a(this, (bcc)$$0.m());
         }

         return $$2;
      }
   }

   @Override
   protected ajv r() {
      return ajw.pw;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.pz;
   }

   @Override
   protected ajv x_() {
      return ajw.py;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.pA, 0.15F, 1.0F);
   }

   protected void fQ() {
      this.a(ajw.px, 1.0F, this.eD());
   }

   @Override
   protected void fP() {
      this.a(ajw.pB, 1.0F, this.eD());
   }
}
