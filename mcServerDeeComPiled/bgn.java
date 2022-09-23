import com.google.common.collect.ImmutableMap;

public class bgn extends bdo<bcl> {
   private final int a;
   private final float d;
   private long e;

   public bgn(int $$0, float $$1) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.m, bkv.b, bku.n, bkv.c));
      this.a = $$0;
      this.d = $$1;
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      this.e = $$2 + 20L + 2L;
   }

   protected boolean a(agg $$0, bcl $$1) {
      return !$$1.s.b_($$1.da()).a(akp.a);
   }

   protected void b(agg $$0, bcl $$1, long $$2) {
      if ($$2 >= this.e) {
         gt $$3 = null;
         gt $$4 = null;
         gt $$5 = $$1.da();

         for(gt $$7 : gt.a($$5, this.a, this.a, this.a)) {
            if ($$7.u() != $$5.u() || $$7.w() != $$5.w()) {
               cvo $$8 = $$1.s.a_($$7.b());
               cvo $$9 = $$1.s.a_($$7);
               if ($$9.a(cju.C)) {
                  if ($$8.h()) {
                     $$3 = $$7.h();
                     break;
                  }

                  if ($$4 == null && !$$7.a($$1.cY(), 1.5)) {
                     $$4 = $$7.h();
                  }
               }
            }
         }

         if ($$3 == null) {
            $$3 = $$4;
         }

         if ($$3 != null) {
            this.e = $$2 + 40L;
            bdp.a($$1, $$3, this.d, 0);
         }

      }
   }
}
