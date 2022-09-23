import com.google.common.collect.ImmutableMap;

public class bhd<E extends btg> extends bdo<E> {
   public bhd(int $$0) {
      super(ImmutableMap.of(bku.o, bkv.b, bku.m, bkv.b), $$0);
   }

   protected boolean a(agg $$0, E $$1, long $$2) {
      return $$1.du() == null;
   }

   protected boolean a(agg $$0, E $$1) {
      return $$1.aw() || $$1.aR() || $$1.bf();
   }

   protected void b(agg $$0, E $$1, long $$2) {
      if ($$1.aw()) {
         $$1.b(bco.n);
         $$1.a(ajw.wy, 5.0F, 1.0F);
      } else {
         $$1.a(ajw.wt, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }

   }

   protected void c(agg $$0, E $$1, long $$2) {
      if ($$1.du() == null) {
         $$1.a(bbn.c.b);
      }

   }
}
