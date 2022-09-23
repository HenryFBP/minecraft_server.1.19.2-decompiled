public class dmo extends dkz {
   public static final int h = 21;
   public static final int i = 21;
   private final boolean[] j = new boolean[4];

   public dmo(amn $$0, int $$1, int $$2) {
      super(dls.L, $$1, 64, $$2, 21, 15, 21, a($$0));
   }

   public dmo(pj $$0) {
      super(dls.L, $$0);
      this.j[0] = $$0.q("hasPlacedChest0");
      this.j[1] = $$0.q("hasPlacedChest1");
      this.j[2] = $$0.q("hasPlacedChest2");
      this.j[3] = $$0.q("hasPlacedChest3");
   }

   @Override
   protected void a(dlr $$0, pj $$1) {
      super.a($$0, $$1);
      $$1.a("hasPlacedChest0", this.j[0]);
      $$1.a("hasPlacedChest1", this.j[1]);
      $$1.a("hasPlacedChest2", this.j[2]);
      $$1.a("hasPlacedChest3", this.j[3]);
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
      if (this.a($$0, -$$3.a(3))) {
         this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, cju.aI.m(), cju.aI.m(), false);

         for(int $$7 = 1; $$7 <= 9; ++$$7) {
            this.a($$0, $$4, $$7, $$7, $$7, this.a - 1 - $$7, $$7, this.c - 1 - $$7, cju.aI.m(), cju.aI.m(), false);
            this.a($$0, $$4, $$7 + 1, $$7, $$7 + 1, this.a - 2 - $$7, $$7, this.c - 2 - $$7, cju.a.m(), cju.a.m(), false);
         }

         for(int $$8 = 0; $$8 < this.a; ++$$8) {
            for(int $$9 = 0; $$9 < this.c; ++$$9) {
               int $$10 = -5;
               this.b($$0, cju.aI.m(), $$8, -5, $$9, $$4);
            }
         }

         cvo $$11 = cju.eK.m().a(crd.a, gy.c);
         cvo $$12 = cju.eK.m().a(crd.a, gy.d);
         cvo $$13 = cju.eK.m().a(crd.a, gy.f);
         cvo $$14 = cju.eK.m().a(crd.a, gy.e);
         this.a($$0, $$4, 0, 0, 0, 4, 9, 4, cju.aI.m(), cju.a.m(), false);
         this.a($$0, $$4, 1, 10, 1, 3, 10, 3, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$11, 2, 10, 0, $$4);
         this.a($$0, $$12, 2, 10, 4, $$4);
         this.a($$0, $$13, 0, 10, 2, $$4);
         this.a($$0, $$14, 4, 10, 2, $$4);
         this.a($$0, $$4, this.a - 5, 0, 0, this.a - 1, 9, 4, cju.aI.m(), cju.a.m(), false);
         this.a($$0, $$4, this.a - 4, 10, 1, this.a - 2, 10, 3, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$11, this.a - 3, 10, 0, $$4);
         this.a($$0, $$12, this.a - 3, 10, 4, $$4);
         this.a($$0, $$13, this.a - 5, 10, 2, $$4);
         this.a($$0, $$14, this.a - 1, 10, 2, $$4);
         this.a($$0, $$4, 8, 0, 0, 12, 4, 4, cju.aI.m(), cju.a.m(), false);
         this.a($$0, $$4, 9, 1, 0, 11, 3, 4, cju.a.m(), cju.a.m(), false);
         this.a($$0, cju.aK.m(), 9, 1, 1, $$4);
         this.a($$0, cju.aK.m(), 9, 2, 1, $$4);
         this.a($$0, cju.aK.m(), 9, 3, 1, $$4);
         this.a($$0, cju.aK.m(), 10, 3, 1, $$4);
         this.a($$0, cju.aK.m(), 11, 3, 1, $$4);
         this.a($$0, cju.aK.m(), 11, 2, 1, $$4);
         this.a($$0, cju.aK.m(), 11, 1, 1, $$4);
         this.a($$0, $$4, 4, 1, 1, 8, 3, 3, cju.aI.m(), cju.a.m(), false);
         this.a($$0, $$4, 4, 1, 2, 8, 2, 2, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$4, 12, 1, 1, 16, 3, 3, cju.aI.m(), cju.a.m(), false);
         this.a($$0, $$4, 12, 1, 2, 16, 2, 2, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$4, 5, 4, 5, this.a - 6, 4, this.c - 6, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, 9, 4, 9, 11, 4, 11, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$4, 8, 1, 8, 8, 3, 8, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 12, 1, 8, 12, 3, 8, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 8, 1, 12, 8, 3, 12, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 12, 1, 12, 12, 3, 12, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 1, 1, 5, 4, 4, 11, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, this.a - 5, 1, 5, this.a - 2, 4, 11, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, 6, 7, 9, 6, 7, 11, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, this.a - 7, 7, 9, this.a - 7, 7, 11, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, 5, 5, 9, 5, 7, 11, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, this.a - 6, 5, 9, this.a - 6, 7, 11, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, cju.a.m(), 5, 5, 10, $$4);
         this.a($$0, cju.a.m(), 5, 6, 10, $$4);
         this.a($$0, cju.a.m(), 6, 6, 10, $$4);
         this.a($$0, cju.a.m(), this.a - 6, 5, 10, $$4);
         this.a($$0, cju.a.m(), this.a - 6, 6, 10, $$4);
         this.a($$0, cju.a.m(), this.a - 7, 6, 10, $$4);
         this.a($$0, $$4, 2, 4, 4, 2, 6, 4, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$4, this.a - 3, 4, 4, this.a - 3, 6, 4, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$11, 2, 4, 5, $$4);
         this.a($$0, $$11, 2, 3, 4, $$4);
         this.a($$0, $$11, this.a - 3, 4, 5, $$4);
         this.a($$0, $$11, this.a - 3, 3, 4, $$4);
         this.a($$0, $$4, 1, 1, 3, 2, 2, 3, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, this.a - 3, 1, 3, this.a - 2, 2, 3, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, cju.aI.m(), 1, 1, 2, $$4);
         this.a($$0, cju.aI.m(), this.a - 2, 1, 2, $$4);
         this.a($$0, cju.iA.m(), 1, 2, 2, $$4);
         this.a($$0, cju.iA.m(), this.a - 2, 2, 2, $$4);
         this.a($$0, $$14, 2, 1, 2, $$4);
         this.a($$0, $$13, this.a - 3, 1, 2, $$4);
         this.a($$0, $$4, 4, 3, 5, 4, 3, 17, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, this.a - 5, 3, 5, this.a - 5, 3, 17, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, 3, 1, 5, 4, 2, 16, cju.a.m(), cju.a.m(), false);
         this.a($$0, $$4, this.a - 6, 1, 5, this.a - 5, 2, 16, cju.a.m(), cju.a.m(), false);

         for(int $$15 = 5; $$15 <= 17; $$15 += 2) {
            this.a($$0, cju.aK.m(), 4, 1, $$15, $$4);
            this.a($$0, cju.aJ.m(), 4, 2, $$15, $$4);
            this.a($$0, cju.aK.m(), this.a - 5, 1, $$15, $$4);
            this.a($$0, cju.aJ.m(), this.a - 5, 2, $$15, $$4);
         }

         this.a($$0, cju.gl.m(), 10, 0, 7, $$4);
         this.a($$0, cju.gl.m(), 10, 0, 8, $$4);
         this.a($$0, cju.gl.m(), 9, 0, 9, $$4);
         this.a($$0, cju.gl.m(), 11, 0, 9, $$4);
         this.a($$0, cju.gl.m(), 8, 0, 10, $$4);
         this.a($$0, cju.gl.m(), 12, 0, 10, $$4);
         this.a($$0, cju.gl.m(), 7, 0, 10, $$4);
         this.a($$0, cju.gl.m(), 13, 0, 10, $$4);
         this.a($$0, cju.gl.m(), 9, 0, 11, $$4);
         this.a($$0, cju.gl.m(), 11, 0, 11, $$4);
         this.a($$0, cju.gl.m(), 10, 0, 12, $$4);
         this.a($$0, cju.gl.m(), 10, 0, 13, $$4);
         this.a($$0, cju.gv.m(), 10, 0, 10, $$4);

         for(int $$16 = 0; $$16 <= this.a - 1; $$16 += this.a - 1) {
            this.a($$0, cju.aK.m(), $$16, 2, 1, $$4);
            this.a($$0, cju.gl.m(), $$16, 2, 2, $$4);
            this.a($$0, cju.aK.m(), $$16, 2, 3, $$4);
            this.a($$0, cju.aK.m(), $$16, 3, 1, $$4);
            this.a($$0, cju.gl.m(), $$16, 3, 2, $$4);
            this.a($$0, cju.aK.m(), $$16, 3, 3, $$4);
            this.a($$0, cju.gl.m(), $$16, 4, 1, $$4);
            this.a($$0, cju.aJ.m(), $$16, 4, 2, $$4);
            this.a($$0, cju.gl.m(), $$16, 4, 3, $$4);
            this.a($$0, cju.aK.m(), $$16, 5, 1, $$4);
            this.a($$0, cju.gl.m(), $$16, 5, 2, $$4);
            this.a($$0, cju.aK.m(), $$16, 5, 3, $$4);
            this.a($$0, cju.gl.m(), $$16, 6, 1, $$4);
            this.a($$0, cju.aJ.m(), $$16, 6, 2, $$4);
            this.a($$0, cju.gl.m(), $$16, 6, 3, $$4);
            this.a($$0, cju.gl.m(), $$16, 7, 1, $$4);
            this.a($$0, cju.gl.m(), $$16, 7, 2, $$4);
            this.a($$0, cju.gl.m(), $$16, 7, 3, $$4);
            this.a($$0, cju.aK.m(), $$16, 8, 1, $$4);
            this.a($$0, cju.aK.m(), $$16, 8, 2, $$4);
            this.a($$0, cju.aK.m(), $$16, 8, 3, $$4);
         }

         for(int $$17 = 2; $$17 <= this.a - 3; $$17 += this.a - 3 - 2) {
            this.a($$0, cju.aK.m(), $$17 - 1, 2, 0, $$4);
            this.a($$0, cju.gl.m(), $$17, 2, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 + 1, 2, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 - 1, 3, 0, $$4);
            this.a($$0, cju.gl.m(), $$17, 3, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 + 1, 3, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 - 1, 4, 0, $$4);
            this.a($$0, cju.aJ.m(), $$17, 4, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 + 1, 4, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 - 1, 5, 0, $$4);
            this.a($$0, cju.gl.m(), $$17, 5, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 + 1, 5, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 - 1, 6, 0, $$4);
            this.a($$0, cju.aJ.m(), $$17, 6, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 + 1, 6, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 - 1, 7, 0, $$4);
            this.a($$0, cju.gl.m(), $$17, 7, 0, $$4);
            this.a($$0, cju.gl.m(), $$17 + 1, 7, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 - 1, 8, 0, $$4);
            this.a($$0, cju.aK.m(), $$17, 8, 0, $$4);
            this.a($$0, cju.aK.m(), $$17 + 1, 8, 0, $$4);
         }

         this.a($$0, $$4, 8, 4, 0, 12, 6, 0, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, cju.a.m(), 8, 6, 0, $$4);
         this.a($$0, cju.a.m(), 12, 6, 0, $$4);
         this.a($$0, cju.gl.m(), 9, 5, 0, $$4);
         this.a($$0, cju.aJ.m(), 10, 5, 0, $$4);
         this.a($$0, cju.gl.m(), 11, 5, 0, $$4);
         this.a($$0, $$4, 8, -14, 8, 12, -11, 12, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 8, -10, 8, 12, -10, 12, cju.aJ.m(), cju.aJ.m(), false);
         this.a($$0, $$4, 8, -9, 8, 12, -9, 12, cju.aK.m(), cju.aK.m(), false);
         this.a($$0, $$4, 8, -8, 8, 12, -1, 12, cju.aI.m(), cju.aI.m(), false);
         this.a($$0, $$4, 9, -11, 9, 11, -1, 11, cju.a.m(), cju.a.m(), false);
         this.a($$0, cju.cI.m(), 10, -11, 10, $$4);
         this.a($$0, $$4, 9, -13, 9, 11, -13, 11, cju.bW.m(), cju.a.m(), false);
         this.a($$0, cju.a.m(), 8, -11, 10, $$4);
         this.a($$0, cju.a.m(), 8, -10, 10, $$4);
         this.a($$0, cju.aJ.m(), 7, -10, 10, $$4);
         this.a($$0, cju.aK.m(), 7, -11, 10, $$4);
         this.a($$0, cju.a.m(), 12, -11, 10, $$4);
         this.a($$0, cju.a.m(), 12, -10, 10, $$4);
         this.a($$0, cju.aJ.m(), 13, -10, 10, $$4);
         this.a($$0, cju.aK.m(), 13, -11, 10, $$4);
         this.a($$0, cju.a.m(), 10, -11, 8, $$4);
         this.a($$0, cju.a.m(), 10, -10, 8, $$4);
         this.a($$0, cju.aJ.m(), 10, -10, 7, $$4);
         this.a($$0, cju.aK.m(), 10, -11, 7, $$4);
         this.a($$0, cju.a.m(), 10, -11, 12, $$4);
         this.a($$0, cju.a.m(), 10, -10, 12, $$4);
         this.a($$0, cju.aJ.m(), 10, -10, 13, $$4);
         this.a($$0, cju.aK.m(), 10, -11, 13, $$4);

         for(gy $$18 : gy.c.a) {
            if (!this.j[$$18.e()]) {
               int $$19 = $$18.j() * 2;
               int $$20 = $$18.l() * 2;
               this.j[$$18.e()] = this.a($$0, $$4, $$3, 10 + $$19, -11, 10 + $$20, dry.z);
            }
         }

      }
   }
}
