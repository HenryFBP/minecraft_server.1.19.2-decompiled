import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

public class axh {
   private static final Logger a = LogUtils.getLogger();
   private final Runnable b;

   protected axh(Runnable $$0) {
      this.b = $$0;
   }

   public void a(@Nullable Path $$0) {
      if ($$0 != null) {
         this.b.run();
         a((Supplier<String>)(() -> "Dumped flight recorder profiling to " + $$0));

         axo $$1;
         try {
            $$1 = axn.a($$0);
         } catch (Throwable var5) {
            a(() -> "Failed to parse JFR recording", var5);
            return;
         }

         try {
            a($$1::b);
            Path $$4 = $$0.resolveSibling("jfr-report-" + StringUtils.substringBefore($$0.getFileName().toString(), ".jfr") + ".json");
            Files.writeString($$4, $$1.b(), new OpenOption[]{StandardOpenOption.CREATE});
            a((Supplier<String>)(() -> "Dumped recording summary to " + $$4));
         } catch (Throwable var4) {
            a(() -> "Failed to output JFR report", var4);
         }

      }
   }

   private static void a(Supplier<String> $$0) {
      if (LogUtils.isLoggerActive()) {
         a.info((String)$$0.get());
      } else {
         abd.a((String)$$0.get());
      }

   }

   private static void a(Supplier<String> $$0, Throwable $$1) {
      if (LogUtils.isLoggerActive()) {
         a.warn((String)$$0.get(), $$1);
      } else {
         abd.a((String)$$0.get());
         $$1.printStackTrace(abd.a);
      }

   }
}
