import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class bnv extends bne implements bbz, bcr {
   private static final aaj<Boolean> bX = aam.a(bnv.class, aal.i);
   private static final aaj<Integer> bY = aam.a(bnv.class, aal.b);
   private static final cdm ca = cdm.a(caz.sc, caz.sd, caz.te);
   private final bby cb = new bby(this.Y, bY, bX);

   public bnv(bbr<? extends bnv> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bji(this, 1.25));
      this.bS.a(3, new bib(this, 1.0));
      this.bS.a(4, new bjw(this, 1.2, cdm.a(caz.mt), false));
      this.bS.a(4, new bjw(this, 1.2, ca, false));
      this.bS.a(5, new bio(this, 1.1));
      this.bS.a(6, new bkb(this, 1.0));
      this.bS.a(7, new bix(this, buc.class, 6.0F));
      this.bS.a(8, new bjk(this));
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 0.25);
   }

   @Nullable
   @Override
   public bbn cG() {
      bbn $$0 = this.cJ();
      return $$0 != null && this.a($$0) ? $$0 : null;
   }

   private boolean a(bbn $$0) {
      if (this.d() && $$0 instanceof buc $$1) {
         return $$1.ez().a(caz.mt) || $$1.eA().a(caz.mt);
      } else {
         return false;
      }
   }

   @Override
   public void a(aaj<?> $$0) {
      if (bY.equals($$0) && this.s.y) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, false);
      this.Y.a(bY, 0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected ajv r() {
      return ajw.ph;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.pj;
   }

   @Override
   protected ajv x_() {
      return ajw.pi;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.pl, 0.15F, 1.0F);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.d() && !this.bJ() && !$$0.fo()) {
         if (!this.s.y) {
            $$0.k(this);
         }

         return baj.a(this.s.y);
      } else {
         baj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cax $$4 = $$0.b($$1);
            return $$4.a(caz.mn) ? $$4.a($$0, this, $$1) : baj.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean c() {
      return this.bo() && !this.y_();
   }

   @Override
   protected void ei() {
      super.ei();
      if (this.d()) {
         this.a(caz.mn);
      }

   }

   @Override
   public boolean d() {
      return this.cb.b();
   }

   @Override
   public void a(@Nullable ajx $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.s.a(null, this, ajw.pk, $$0, 0.5F, 1.0F);
      }

   }

   @Override
   public dwq b(bcc $$0) {
      gy $$1 = this.cw();
      if ($$1.o() == gy.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = bvy.a($$1);
         gt $$3 = this.da();
         gt.a $$4 = new gt.a();
         UnmodifiableIterator var6 = $$0.fg().iterator();

         while(var6.hasNext()) {
            bco $$5 = (bco)var6.next();
            dwl $$6 = $$0.g($$5);

            for(int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.s.i($$4);
               if (bvy.a($$8)) {
                  dwq $$9 = dwq.a($$4, $$8);
                  if (bvy.a(this.s, $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(agg $$0, bcb $$1) {
      if ($$0.ag() != bag.a) {
         bsl $$2 = bbr.bm.a((cgx)$$0);
         $$2.a(bbs.a, new cax(caz.nr));
         $$2.b(this.df(), this.dh(), this.dl(), this.dq(), this.ds());
         $$2.s(this.fA());
         $$2.a(this.y_());
         if (this.Y()) {
            $$2.b(this.Z());
            $$2.n(this.ct());
         }

         $$2.fp();
         $$0.b($$2);
         this.ah();
      } else {
         super.a($$0, $$1);
      }

   }

   @Override
   public void g(dwq $$0) {
      this.a(this, this.cb, $$0);
   }

   @Override
   public float b() {
      return (float)this.b(bdd.d) * 0.225F;
   }

   @Override
   public void a(dwq $$0) {
      super.g($$0);
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dQ());
   }

   public bnv b(agg $$0, bbk $$1) {
      return bbr.aq.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return ca.a($$0);
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.6F * this.cA()), (double)(this.cW() * 0.4F));
   }
}
