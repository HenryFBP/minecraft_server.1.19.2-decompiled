import javax.annotation.Nullable;

public class brb extends bsb {
   public brb(bbr<? extends brb> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public static bdc.a n() {
      return bsb.q().a(bdd.a, 12.0);
   }

   @Override
   public boolean z(bbn $$0) {
      if (super.z($$0)) {
         if ($$0 instanceof bcc) {
            int $$1 = 0;
            if (this.s.ag() == bag.c) {
               $$1 = 7;
            } else if (this.s.ag() == bag.d) {
               $$1 = 15;
            }

            if ($$1 > 0) {
               ((bcc)$$0).b(new bbg(bbi.s, $$1 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      return $$3;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.45F;
   }
}
