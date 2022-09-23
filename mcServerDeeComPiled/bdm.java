import com.google.common.collect.ImmutableMap;

public class bdm<E extends bce> extends bdo<E> {
   private final int a;
   private final float d;

   public bdm(int $$0, float $$1) {
      super(ImmutableMap.of(bku.m, bkv.b, bku.n, bkv.c, bku.o, bkv.a, bku.h, bkv.a));
      this.a = $$0;
      this.d = $$1;
   }

   protected boolean a(agg $$0, E $$1) {
      return this.a($$1) && this.b($$1);
   }

   protected void a(agg $$0, E $$1, long $$2) {
      $$1.dy().a(bku.n, new bdy(this.c($$1), true));
      $$1.A().a(-this.d, 0.0F);
      $$1.o(ami.c($$1.dq(), $$1.aZ, 0.0F));
   }

   private boolean a(E $$0) {
      return ((bkw)$$0.dy().c(bku.h).get()).a(this.c($$0));
   }

   private boolean b(E $$0) {
      return this.c($$0).a($$0, (double)this.a);
   }

   private bcc c(E $$0) {
      return (bcc)$$0.dy().c(bku.o).get();
   }
}
