import com.google.common.collect.ImmutableMap;

public class bgl extends bdo<bcl> {
   private static final int a = 60;
   private final int d;
   private final float e;
   private long f;

   public bgl(int $$0, float $$1) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.m, bkv.b, bku.n, bkv.c));
      this.d = $$0;
      this.e = $$1;
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      this.f = $$2 + 60L;
   }

   protected boolean a(agg $$0, bcl $$1) {
      return $$1.s.b_($$1.da()).a(akp.a);
   }

   protected void b(agg $$0, bcl $$1, long $$2) {
      if ($$2 >= this.f) {
         gt $$3 = $$1.da();
         gt.a $$4 = new gt.a();
         dwv $$5 = dwv.a($$1);

         for(gt $$6 : gt.a($$3, this.d, this.d, this.d)) {
            if ($$6.u() != $$3.u() || $$6.w() != $$3.w()) {
               cvo $$7 = $$0.a_($$6);
               cvo $$8 = $$0.a_($$4.a($$6, gy.a));
               if (!$$7.a(cju.C) && $$0.b_($$6).c() && $$7.b($$0, $$6, $$5).b() && $$8.d($$0, $$4, gy.b)) {
                  this.f = $$2 + 60L;
                  bdp.a($$1, $$6.h(), this.e, 1);
                  return;
               }
            }
         }

      }
   }
}
