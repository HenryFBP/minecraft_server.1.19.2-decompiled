import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;

public class t implements UncaughtExceptionHandler {
   private final Logger a;

   public t(Logger $$0) {
      this.a = $$0;
   }

   public void uncaughtException(Thread $$0, Throwable $$1) {
      this.a.error("Caught previously unhandled exception :", $$1);
   }
}
