import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ot implements pc {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(oj $$0) {
      if ($$0.r()) {
         a.error("{} failed! {}", $$0.c(), ad.d($$0.n()));
      } else {
         a.warn("(optional) {} failed. {}", $$0.c(), ad.d($$0.n()));
      }

   }

   @Override
   public void b(oj $$0) {
   }
}
