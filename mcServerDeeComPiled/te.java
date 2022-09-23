import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class te {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends ra> void a(tc<T> $$0, T $$1, agg $$2) throws abl {
      a($$0, $$1, $$2.n());
   }

   public static <T extends ra> void a(tc<T> $$0, T $$1, ayz<?> $$2) throws abl {
      if (!$$2.bm()) {
         $$2.c((Runnable)(() -> {
            if ($$1.a().h()) {
               try {
                  $$0.a($$1);
               } catch (Exception var3) {
                  if ($$1.b()) {
                     throw var3;
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var3);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }

         }));
         throw abl.a;
      }
   }
}
