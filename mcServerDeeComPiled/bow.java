import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bow extends bne {
   public static final bbo bX = bbo.b(0.9F, 1.3F).a(0.7F);
   private static final int ce = 2;
   private static final int cf = 1;
   protected static final ImmutableList<blz<? extends bly<? super bow>>> bY = ImmutableList.of(blz.c, blz.d, blz.b, blz.n, blz.f, blz.q);
   protected static final ImmutableList<bku<?>> ca = ImmutableList.of(
      bku.n, bku.h, bku.m, bku.E, bku.t, bku.at, bku.r, bku.Q, bku.R, bku.N, bku.J, bku.O, new bku[]{bku.P, bku.T, bku.U, bku.X}
   );
   public static final int cb = 10;
   public static final double cc = 0.02;
   public static final double cd = 0.1F;
   private static final aaj<Boolean> cg = aam.a(bow.class, aal.i);
   private static final aaj<Boolean> ch = aam.a(bow.class, aal.i);
   private static final aaj<Boolean> ci = aam.a(bow.class, aal.i);
   private boolean cj;
   private int ck;

   public bow(bbr<? extends bow> $$0, cgx $$1) {
      super($$0, $$1);
      this.D().a(true);
      this.a(dqh.f, -1.0F);
      this.a(dqh.g, -1.0F);
   }

   public cax q() {
      amn $$0 = amn.a((long)this.co().hashCode());
      akz<caq> $$1 = this.fU() ? akr.b : akr.a;
      he<caq> $$2 = hm.bQ.b($$1);
      return car.a(caz.tV, (hc<caq>)$$2.a($$0).get());
   }

   @Override
   protected bcx.b<bow> dz() {
      return bcx.a(ca, bY);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return box.a(this.dz().a($$0));
   }

   public static bdc.a t() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 0.2F).a(bdd.f, 2.0);
   }

   @Override
   protected void n() {
      if (this.y_()) {
         this.a(bdd.f).a(1.0);
         this.fT();
      } else {
         this.a(bdd.f).a(2.0);
         this.fS();
      }

   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected ajv r() {
      return this.fU() ? ajw.ie : ajw.hU;
   }

   @Override
   protected ajv c(baw $$0) {
      return this.fU() ? ajw.ih : ajw.hX;
   }

   @Override
   protected ajv x_() {
      return this.fU() ? ajw.if : ajw.hV;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.in, 0.15F, 1.0F);
   }

   protected ajv fJ() {
      return this.fU() ? ajw.ij : ajw.hZ;
   }

   public bow b(agg $$0, bbk $$1) {
      bow $$2 = bbr.M.a((cgx)$$0);
      if ($$2 != null) {
         box.a($$2, $$0.r_());
         boolean $$3 = $$1 instanceof bow && ((bow)$$1).fU();
         $$2.v($$3 || $$0.r_().j() < 0.02);
      }

      return $$2;
   }

   @Override
   public bcx<bow> dy() {
      return super.dy();
   }

   @Override
   protected void T() {
      this.s.ac().a("goatBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.s.ac().a("goatActivityUpdate");
      box.a(this);
      this.s.ac().c();
      super.T();
   }

   @Override
   public int V() {
      return 15;
   }

   @Override
   public void l(float $$0) {
      int $$1 = this.V();
      float $$2 = ami.c(this.aX, $$0);
      float $$3 = ami.a($$2, (float)(-$$1), (float)$$1);
      super.l(this.aX + $$3);
   }

   @Override
   public ajv e(cax $$0) {
      return this.fU() ? ajw.ig : ajw.hW;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.oH) && !this.y_()) {
         $$0.a(this.fJ(), 1.0F, 1.0F);
         cax $$3 = cay.a($$2, $$0, caz.oN.Q_());
         $$0.a($$1, $$3);
         return baj.a(this.s.y);
      } else {
         baj $$4 = super.b($$0, $$1);
         if ($$4.a() && this.n($$2)) {
            this.s.a(null, this, this.e($$2), ajx.g, 1.0F, ami.b(this.s.w, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      box.a(this, $$5);
      this.v($$5.j() < 0.02);
      this.n();
      if (!this.y_() && (double)$$5.i() < 0.1F) {
         aaj<Boolean> $$6 = $$5.h() ? ch : ci;
         this.Y.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public bbo a(bco $$0) {
      return $$0 == bco.g ? bX.a(this.dJ()) : super.a($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.fU());
      $$0.a("HasLeftHorn", this.fK());
      $$0.a("HasRightHorn", this.fL());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("IsScreamingGoat"));
      this.Y.b(ch, $$0.q("HasLeftHorn"));
      this.Y.b(ci, $$0.q("HasRightHorn"));
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 58) {
         this.cj = true;
      } else if ($$0 == 59) {
         this.cj = false;
      } else {
         super.a($$0);
      }

   }

   @Override
   public void w_() {
      if (this.cj) {
         ++this.ck;
      } else {
         this.ck -= 2;
      }

      this.ck = ami.a(this.ck, 0, 20);
      super.w_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cg, false);
      this.Y.a(ch, true);
      this.Y.a(ci, true);
   }

   public boolean fK() {
      return this.Y.a(ch);
   }

   public boolean fL() {
      return this.Y.a(ci);
   }

   public boolean fR() {
      boolean $$0 = this.fK();
      boolean $$1 = this.fL();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aaj<Boolean> $$2;
         if (!$$0) {
            $$2 = ci;
         } else if (!$$1) {
            $$2 = ch;
         } else {
            $$2 = this.R.h() ? ch : ci;
         }

         this.Y.b($$2, false);
         dwq $$5 = this.cY();
         cax $$6 = this.q();
         double $$7 = (double)ami.b(this.R, -0.2F, 0.2F);
         double $$8 = (double)ami.b(this.R, 0.3F, 0.7F);
         double $$9 = (double)ami.b(this.R, -0.2F, 0.2F);
         bqv $$10 = new bqv(this.s, $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.s.b($$10);
         return true;
      }
   }

   public void fS() {
      this.Y.b(ch, true);
      this.Y.b(ci, true);
   }

   public void fT() {
      this.Y.b(ch, false);
      this.Y.b(ci, false);
   }

   public boolean fU() {
      return this.Y.a(cg);
   }

   public void v(boolean $$0) {
      this.Y.b(cg, $$0);
   }

   public float fV() {
      return (float)this.ck / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bbr<? extends bne> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bF) && a($$1, $$3);
   }
}
