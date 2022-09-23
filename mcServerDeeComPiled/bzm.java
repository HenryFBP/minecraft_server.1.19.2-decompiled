import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class bzm extends cci implements cco {
   private final akz<cjt> a;
   protected final float b;
   private final float c;
   private final Multimap<bcy, bdb> d;

   protected bzm(float $$0, float $$1, cch $$2, akz<cjt> $$3, cat.a $$4) {
      super($$2, $$4);
      this.a = $$3;
      this.b = $$2.b();
      this.c = $$0 + $$2.c();
      Builder<bcy, bdb> $$5 = ImmutableMultimap.builder();
      $$5.put(bdd.f, new bdb(l, "Tool modifier", (double)this.c, bdb.a.a));
      $$5.put(bdd.h, new bdb(m, "Tool modifier", (double)$$1, bdb.a.a));
      this.d = $$5.build();
   }

   @Override
   public float a(cax $$0, cvo $$1) {
      return $$1.a(this.a) ? this.b : 1.0F;
   }

   @Override
   public boolean a(cax $$0, bcc $$1, bcc $$2) {
      $$0.a(2, $$2, $$0x -> $$0x.d(bbs.a));
      return true;
   }

   @Override
   public boolean a(cax $$0, cgx $$1, cvo $$2, gt $$3, bcc $$4) {
      if (!$$1.y && $$2.h($$1, $$3) != 0.0F) {
         $$0.a(1, $$4, $$0x -> $$0x.d(bbs.a));
      }

      return true;
   }

   @Override
   public Multimap<bcy, bdb> a(bbs $$0) {
      return $$0 == bbs.a ? this.d : super.a($$0);
   }

   public float d() {
      return this.c;
   }

   @Override
   public boolean a_(cvo $$0) {
      int $$1 = this.j().d();
      if ($$1 < 3 && $$0.a(akl.bt)) {
         return false;
      } else if ($$1 < 2 && $$0.a(akl.bu)) {
         return false;
      } else {
         return $$1 < 1 && $$0.a(akl.bv) ? false : $$0.a(this.a);
      }
   }
}
