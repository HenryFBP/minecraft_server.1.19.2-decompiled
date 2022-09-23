import com.google.common.collect.ImmutableMap;

public class bew extends bdo<bce> {
   private final int a;

   public bew(int $$0) {
      super(ImmutableMap.of(bku.n, bkv.c, bku.o, bkv.a, bku.p, bkv.b));
      this.a = $$0;
   }

   protected boolean a(agg $$0, bce $$1) {
      bcc $$2 = this.b($$1);
      return !this.a($$1) && bdp.b($$1, $$2) && $$1.j($$2);
   }

   private boolean a(bce $$0) {
      return $$0.b($$1 -> {
         cat $$2 = $$1.c();
         return $$2 instanceof cbm && $$0.a((cbm)$$2);
      });
   }

   protected void a(agg $$0, bce $$1, long $$2) {
      bcc $$3 = this.b($$1);
      bdp.a($$1, $$3);
      $$1.a(bai.a);
      $$1.z($$3);
      $$1.dy().a(bku.p, true, (long)this.a);
   }

   private bcc b(bce $$0) {
      return (bcc)$$0.dy().c(bku.o).get();
   }
}
