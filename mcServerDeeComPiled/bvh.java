public class bvh extends buj {
   private static final aaj<Boolean> e = aam.a(bvh.class, aal.i);

   public bvh(bbr<? extends bvh> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvh(cgx $$0, bcc $$1, double $$2, double $$3, double $$4) {
      super(bbr.bg, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float j() {
      return this.l() ? 0.73F : super.j();
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   public float a(cgp $$0, cgd $$1, gt $$2, cvo $$3, dpv $$4, float $$5) {
      return this.l() && bqj.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      if (!this.s.y) {
         bbn $$1 = $$0.a();
         bbn $$2 = this.x();
         boolean $$4;
         if ($$2 instanceof bcc $$3) {
            $$4 = $$1.a(baw.a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bo()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(baw.o, 5.0F);
         }

         if ($$4 && $$1 instanceof bcc) {
            int $$6 = 0;
            if (this.s.ag() == bag.c) {
               $$6 = 10;
            } else if (this.s.ag() == bag.d) {
               $$6 = 40;
            }

            if ($$6 > 0) {
               ((bcc)$$1).b(new bbg(bbi.t, 20 * $$6, 1), this.y());
            }
         }

      }
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if (!this.s.y) {
         cgp.a $$1 = this.s.W().b(cgt.c) ? cgp.a.c : cgp.a.a;
         this.s.a(this, this.df(), this.dh(), this.dl(), 1.0F, false, $$1);
         this.ah();
      }

   }

   @Override
   public boolean bk() {
      return false;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      return false;
   }

   @Override
   protected void a_() {
      this.Y.a(e, false);
   }

   @Override
   public boolean l() {
      return this.Y.a(e);
   }

   public void a(boolean $$0) {
      this.Y.b(e, $$0);
   }

   @Override
   protected boolean M_() {
      return false;
   }
}
