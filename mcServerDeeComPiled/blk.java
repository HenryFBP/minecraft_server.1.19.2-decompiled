import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class blk extends bls {
   public static final float a = 10.0F;

   @Override
   protected boolean a(bcc $$0, bcc $$1) {
      return !$$0.dy().a(bku.S) && bly.c($$0, $$1) && boq.k($$1) && !this.e($$0, $$1) ? $$1.a($$0, 10.0) : false;
   }

   private boolean e(bcc $$0, bcc $$1) {
      List<UUID> $$2 = (List)$$0.dy().c(bku.Y).orElseGet(ArrayList::new);
      return $$2.contains($$1.co());
   }

   @Override
   protected bku<bcc> b() {
      return bku.B;
   }
}
