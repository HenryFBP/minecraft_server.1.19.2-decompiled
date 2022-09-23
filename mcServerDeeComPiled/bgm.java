import com.google.common.collect.ImmutableMap;

public class bgm extends bdo<bcl> {
   private final int a;
   private final float d;
   private long e;

   public bgm(int $$0, float $$1) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.m, bkv.b, bku.n, bkv.c));
      this.a = $$0;
      this.d = $$1;
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      this.e = $$2 + 40L;
   }

   protected boolean a(agg $$0, bcl $$1) {
      return !$$1.s.b_($$1.da()).a(akp.a);
   }

   protected void b(agg $$0, bcl $$1, long $$2) {
      if ($$2 >= this.e) {
         dwv $$3 = dwv.a($$1);
         gt $$4 = $$1.da();
         gt.a $$5 = new gt.a();

         for(gt $$6 : gt.a($$4, this.a, this.a, this.a)) {
            if (($$6.u() != $$4.u() || $$6.w() != $$4.w()) && $$0.a_($$6).b($$0, $$6, $$3).b() && !$$0.a_($$5.a($$6, gy.a)).b($$0, $$6, $$3).b()) {
               for(gy $$7 : gy.c.a) {
                  $$5.a($$6, $$7);
                  if ($$0.a_($$5).h() && $$0.a_($$5.c(gy.a)).a(cju.C)) {
                     this.e = $$2 + 40L;
                     bdp.a($$1, $$6, this.d, 0);
                     return;
                  }
               }
            }
         }

      }
   }
}
