import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class rc extends qv {
   private static final Logger i = LogUtils.getLogger();
   private static final rq j = rq.c("disconnect.exceeded_packet_rate");
   private final int k;

   public rc(int $$0) {
      super(td.a);
      this.k = $$0;
   }

   @Override
   protected void b() {
      super.b();
      float $$0 = this.n();
      if ($$0 > (float)this.k) {
         i.warn("Player exceeded rate-limit (sent {} packets per second)", $$0);
         this.a(new uf(j), rb.a((Runnable)(() -> this.a(j))));
         this.l();
      }

   }
}
