import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ccf extends cci implements cco {
   private final float a;
   private final Multimap<bcy, bdb> b;

   public ccf(cch $$0, int $$1, float $$2, cat.a $$3) {
      super($$0, $$3);
      this.a = (float)$$1 + $$0.c();
      Builder<bcy, bdb> $$4 = ImmutableMultimap.builder();
      $$4.put(bdd.f, new bdb(l, "Weapon modifier", (double)this.a, bdb.a.a));
      $$4.put(bdd.h, new bdb(m, "Weapon modifier", (double)$$2, bdb.a.a));
      this.b = $$4.build();
   }

   public float i() {
      return this.a;
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      return !$$3.f();
   }

   @Override
   public float a(cax $$0, cvo $$1) {
      if ($$1.a(cju.bf)) {
         return 15.0F;
      } else {
         dpz $$2 = $$1.d();
         return $$2 != dpz.e && $$2 != dpz.g && !$$1.a(akl.K) && $$2 != dpz.Q ? 1.0F : 1.5F;
      }
   }

   @Override
   public boolean a(cax $$0, bcc $$1, bcc $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bbs.a));
      return true;
   }

   @Override
   public boolean a(cax $$0, cgx $$1, cvo $$2, gt $$3, bcc $$4) {
      if ($$2.h($$1, $$3) != 0.0F) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bbs.a));
      }

      return true;
   }

   @Override
   public boolean a_(cvo $$0) {
      return $$0.a(cju.bf);
   }

   @Override
   public Multimap<bcy, bdb> a(bbs $$0) {
      return $$0 == bbs.a ? this.b : super.a($$0);
   }
}
