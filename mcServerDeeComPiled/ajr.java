import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajr extends ajo {
   private static final Logger d = LogUtils.getLogger();
   private final ServerSocket e;
   private final String f;
   private final List<ajq> g = Lists.newArrayList();
   private final abp h;

   private ajr(abp $$0, ServerSocket $$1, String $$2) {
      super("RCON Listener");
      this.h = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   private void d() {
      this.g.removeIf($$0 -> !$$0.c());
   }

   public void run() {
      try {
         while(this.a) {
            try {
               Socket $$0 = this.e.accept();
               ajq $$1 = new ajq(this.h, this.f, $$0);
               $$1.a();
               this.g.add($$1);
               this.d();
            } catch (SocketTimeoutException var7) {
               this.d();
            } catch (IOException var8) {
               if (this.a) {
                  d.info("IO exception: ", var8);
               }
            }
         }
      } finally {
         this.a(this.e);
      }

   }

   @Nullable
   public static ajr a(abp $$0) {
      afi $$1 = $$0.a();
      String $$2 = $$0.b();
      if ($$2.isEmpty()) {
         $$2 = "0.0.0.0";
      }

      int $$3 = $$1.s;
      if (0 < $$3 && 65535 >= $$3) {
         String $$4 = $$1.t;
         if ($$4.isEmpty()) {
            d.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket $$5 = new ServerSocket($$3, 0, InetAddress.getByName($$2));
               $$5.setSoTimeout(500);
               ajr $$6 = new ajr($$0, $$5, $$4);
               if (!$$6.a()) {
                  return null;
               } else {
                  d.info("RCON running on {}:{}", $$2, $$3);
                  return $$6;
               }
            } catch (IOException var7) {
               d.warn("Unable to initialise RCON on {}:{}", new Object[]{$$2, $$3, var7});
               return null;
            }
         }
      } else {
         d.warn("Invalid rcon port {} found in server.properties, rcon disabled!", $$3);
         return null;
      }
   }

   @Override
   public void b() {
      this.a = false;
      this.a(this.e);
      super.b();

      for(ajq $$0 : this.g) {
         if ($$0.c()) {
            $$0.b();
         }
      }

      this.g.clear();
   }

   private void a(ServerSocket $$0) {
      d.debug("closeSocket: {}", $$0);

      try {
         $$0.close();
      } catch (IOException var3) {
         d.warn("Failed to close socket", var3);
      }

   }
}
