import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface axf {
   axf e = (axf)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? axe.a() : new axf.a());

   boolean a(axd var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(int var1, int var2, SocketAddress var3, int var4);

   void b(int var1, int var2, SocketAddress var3, int var4);

   @Nullable
   axi e();

   @Nullable
   axi a(cge var1, aba<cgx> var2, String var3);

   public static class a implements axf {
      private static final Logger b = LogUtils.getLogger();
      static final axi a = () -> {
      };

      @Override
      public boolean a(axd $$0) {
         b.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
         return false;
      }

      @Override
      public Path b() {
         throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public boolean d() {
         return false;
      }

      @Override
      public void a(int $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(int $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public axi e() {
         return a;
      }

      @Nullable
      @Override
      public axi a(cge $$0, aba<cgx> $$1, String $$2) {
         return null;
      }
   }
}
