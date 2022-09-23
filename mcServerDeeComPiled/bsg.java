import java.util.List;
import java.util.UUID;

public class bsg extends bvk implements bru {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bdb e = new bdb(b, "Drinking speed penalty", -0.25, bdb.a.a);
   private static final aaj<Boolean> bX = aam.a(bsg.class, aal.i);
   private int bY;
   private bkj<bvk> bZ;
   private bki<buc> ca;

   public bsg(bbr<? extends bsg> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bZ = new bkj<>(this, bvk.class, true, $$0 -> $$0 != null && this.fY() && $$0.ad() != bbr.bd);
      this.ca = new bki<>(this, buc.class, 10, true, false, null);
      this.bS.a(1, new bij(this));
      this.bS.a(2, new bjn(this, 1.0, 60, 10.0F));
      this.bS.a(2, new bkb(this, 1.0));
      this.bS.a(3, new bix(this, buc.class, 8.0F));
      this.bS.a(3, new bjk(this));
      this.bT.a(1, new bkg(this, bvk.class));
      this.bT.a(2, this.bZ);
      this.bT.a(3, this.ca);
   }

   @Override
   protected void a_() {
      super.a_();
      this.ai().a(bX, false);
   }

   @Override
   protected ajv r() {
      return ajw.wV;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.wZ;
   }

   @Override
   protected ajv x_() {
      return ajw.wX;
   }

   public void x(boolean $$0) {
      this.ai().b(bX, $$0);
   }

   public boolean n() {
      return this.ai().a(bX);
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.a, 26.0).a(bdd.d, 0.25);
   }

   @Override
   public void w_() {
      if (!this.s.y && this.bo()) {
         this.bZ.k();
         if (this.bZ.i() <= 0) {
            this.ca.a(true);
         } else {
            this.ca.a(false);
         }

         if (this.n()) {
            if (this.bY-- <= 0) {
               this.x(false);
               cax $$0 = this.ez();
               this.a(bbs.a, cax.b);
               if ($$0.a(caz.qs)) {
                  List<bbg> $$1 = ccu.a($$0);
                  if ($$1 != null) {
                     for(bbg $$2 : $$1) {
                        this.b(new bbg($$2));
                     }
                  }
               }

               this.a(bdd.d).d(e);
            }
         } else {
            ccs $$3 = null;
            if (this.R.i() < 0.15F && this.a(akp.a) && !this.a(bbi.m)) {
               $$3 = ccv.x;
            } else if (this.R.i() < 0.15F && (this.bH() || this.eh() != null && this.eh().u()) && !this.a(bbi.l)) {
               $$3 = ccv.m;
            } else if (this.R.i() < 0.05F && this.ef() < this.et()) {
               $$3 = ccv.z;
            } else if (this.R.i() < 0.5F && this.G() != null && !this.a(bbi.a) && this.G().f(this) > 121.0) {
               $$3 = ccv.o;
            }

            if ($$3 != null) {
               this.a(bbs.a, ccu.a(new cax(caz.qs), $$3));
               this.bY = this.ez().q();
               this.x(true);
               if (!this.aM()) {
                  this.s.a(null, this.df(), this.dh(), this.dl(), ajw.wY, this.cR(), 1.0F, 0.8F + this.R.i() * 0.4F);
               }

               bcz $$4 = this.a(bdd.d);
               $$4.d(e);
               $$4.b(e);
            }
         }

         if (this.R.i() < 7.5E-4F) {
            this.s.a(this, (byte)15);
         }
      }

      super.w_();
   }

   @Override
   public ajv L_() {
      return ajw.wW;
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 15) {
         for(int $$1 = 0; $$1 < this.R.a(35) + 10; ++$$1) {
            this.s.a(io.ag, this.df() + this.R.k() * 0.13F, this.cy().e + 0.5 + this.R.k() * 0.13F, this.dl() + this.R.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.a($$0);
      }

   }

   @Override
   protected float e(baw $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.m() == this) {
         $$1 = 0.0F;
      }

      if ($$0.z()) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bcc $$0, float $$1) {
      if (!this.n()) {
         dwq $$2 = $$0.dd();
         double $$3 = $$0.df() + $$2.c - this.df();
         double $$4 = $$0.dj() - 1.1F - this.dh();
         double $$5 = $$0.dl() + $$2.e - this.dl();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ccs $$7 = ccv.B;
         if ($$0 instanceof bvk) {
            if ($$0.ef() <= 4.0F) {
               $$7 = ccv.z;
            } else {
               $$7 = ccv.G;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.a(bbi.b)) {
            $$7 = ccv.r;
         } else if ($$0.ef() >= 8.0F && !$$0.a(bbi.s)) {
            $$7 = ccv.D;
         } else if ($$6 <= 3.0 && !$$0.a(bbi.r) && this.R.i() < 0.25F) {
            $$7 = ccv.M;
         }

         bvf $$8 = new bvf(this.s, this);
         $$8.a(ccu.a(new cax(caz.ti), $$7));
         $$8.p($$8.ds() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aM()) {
            this.s.a(null, this.df(), this.dh(), this.dl(), ajw.xa, this.cR(), 1.0F, 0.8F + this.R.i() * 0.4F);
         }

         this.s.b($$8);
      }
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 1.62F;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean fK() {
      return false;
   }
}
