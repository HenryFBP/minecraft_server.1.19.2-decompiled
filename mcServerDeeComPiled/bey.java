import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bey extends bdo<bcc> {
   private final float a;

   public bey(float $$0) {
      super(ImmutableMap.of(bku.m, bkv.b));
      this.a = $$0;
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      Optional<dwq> $$3 = Optional.ofNullable(this.b($$0, $$1));
      if ($$3.isPresent()) {
         $$1.dy().a(bku.m, $$3.map($$0x -> new bkx($$0x, this.a, 0)));
      }

   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      return !$$0.g($$1.da());
   }

   @Nullable
   private dwq b(agg $$0, bcc $$1) {
      amn $$2 = $$1.dQ();
      gt $$3 = $$1.da();

      for(int $$4 = 0; $$4 < 10; ++$$4) {
         gt $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
         if (a($$0, $$1, $$5)) {
            return dwq.c($$5);
         }
      }

      return null;
   }

   public static boolean a(agg $$0, bcc $$1, gt $$2) {
      return $$0.g($$2) && (double)$$0.a(dar.a.e, $$2).v() <= $$1.dh();
   }
}
