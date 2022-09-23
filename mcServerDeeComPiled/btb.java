import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btb<E extends bss> extends bdo<E> {
   private final int a;
   private final int d;

   public btb(int $$0, int $$1) {
      super(ImmutableMap.of(bku.ab, bkv.a, bku.K, bkv.a, bku.ac, bkv.c, bku.ad, bkv.c));
      this.a = $$0;
      this.d = $$1;
   }

   protected boolean a(agg $$0, E $$1) {
      return $$1.eA().b();
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bcx<bss> $$3 = $$1.dy();
      Optional<Integer> $$4 = $$3.c(bku.ac);
      if (!$$4.isPresent()) {
         $$3.a(bku.ac, 0);
      } else {
         int $$5 = $$4.get();
         if ($$5 > this.a) {
            $$3.b(bku.ab);
            $$3.b(bku.ac);
            $$3.a(bku.ad, true, (long)this.d);
         } else {
            $$3.a(bku.ac, $$5 + 1);
         }
      }

   }
}
