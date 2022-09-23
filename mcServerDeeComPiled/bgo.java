import com.google.common.collect.ImmutableMap;

public class bgo extends bdo<boq> {
   private final cjt a;
   private final bku<?> d;

   public bgo(cjt $$0, bku<?> $$1) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.m, bkv.a, bku.W, bkv.a));
      this.a = $$0;
      this.d = $$1;
   }

   protected boolean a(agg $$0, boq $$1) {
      return !$$1.aR() && $$1.aw();
   }

   protected void a(agg $$0, boq $$1, long $$2) {
      gt $$3 = $$1.da().c();

      for(gy $$4 : gy.c.a) {
         gt $$5 = $$3.a($$4);
         if ($$0.a_($$5).k($$0, $$5).a(gy.b).b() && $$0.b_($$5).b(dpw.c)) {
            gt $$6 = $$5.b();
            if ($$0.a_($$6).h()) {
               $$0.a($$6, this.a.m(), 3);
               $$0.a(null, $$1, ajw.gZ, ajx.e, 1.0F, 1.0F);
               $$1.dy().b(this.d);
               return;
            }
         }
      }

   }
}
