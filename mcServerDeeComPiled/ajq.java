import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.slf4j.Logger;

public class ajq extends ajo {
   private static final Logger d = LogUtils.getLogger();
   private static final int e = 3;
   private static final int f = 2;
   private static final int g = 0;
   private static final int h = 2;
   private static final int i = -1;
   private boolean j;
   private final Socket k;
   private final byte[] l = new byte[1460];
   private final String m;
   private final abp n;

   ajq(abp $$0, String $$1, Socket $$2) {
      super("RCON Client " + $$2.getInetAddress());
      this.n = $$0;
      this.k = $$2;

      try {
         this.k.setSoTimeout(0);
      } catch (Exception var5) {
         this.a = false;
      }

      this.m = $$1;
   }

   public void run() {
      while(true) {
         try {
            if (!this.a) {
               return;
            }

            BufferedInputStream $$0 = new BufferedInputStream(this.k.getInputStream());
            int $$1 = $$0.read(this.l, 0, 1460);
            if (10 <= $$1) {
               int $$2 = 0;
               int $$3 = ajl.b(this.l, 0, $$1);
               if ($$3 != $$1 - 4) {
                  return;
               }

               $$2 += 4;
               int $$4 = ajl.b(this.l, $$2, $$1);
               $$2 += 4;
               int $$5 = ajl.a(this.l, $$2);
               $$2 += 4;
               switch($$5) {
                  case 2:
                     if (this.j) {
                        String $$7 = ajl.a(this.l, $$2, $$1);

                        try {
                           this.a($$4, this.n.a($$7));
                        } catch (Exception var15) {
                           this.a($$4, "Error executing: " + $$7 + " (" + var15.getMessage() + ")");
                        }
                        continue;
                     }

                     this.d();
                     continue;
                  case 3:
                     String $$6 = ajl.a(this.l, $$2, $$1);
                     $$2 += $$6.length();
                     if (!$$6.isEmpty() && $$6.equals(this.m)) {
                        this.j = true;
                        this.a($$4, 2, "");
                        continue;
                     }

                     this.j = false;
                     this.d();
                     continue;
                  default:
                     this.a($$4, String.format(Locale.ROOT, "Unknown request %s", Integer.toHexString($$5)));
                     continue;
               }
            }
         } catch (IOException var16) {
            return;
         } catch (Exception var17) {
            d.error("Exception whilst parsing RCON input", var17);
            return;
         } finally {
            this.e();
            d.info("Thread {} shutting down", this.b);
            this.a = false;
         }

         return;
      }
   }

   private void a(int $$0, int $$1, String $$2) throws IOException {
      ByteArrayOutputStream $$3 = new ByteArrayOutputStream(1248);
      DataOutputStream $$4 = new DataOutputStream($$3);
      byte[] $$5 = $$2.getBytes(StandardCharsets.UTF_8);
      $$4.writeInt(Integer.reverseBytes($$5.length + 10));
      $$4.writeInt(Integer.reverseBytes($$0));
      $$4.writeInt(Integer.reverseBytes($$1));
      $$4.write($$5);
      $$4.write(0);
      $$4.write(0);
      this.k.getOutputStream().write($$3.toByteArray());
   }

   private void d() throws IOException {
      this.a(-1, 2, "");
   }

   private void a(int $$0, String $$1) throws IOException {
      int $$2 = $$1.length();

      do {
         int $$3 = 4096 <= $$2 ? 4096 : $$2;
         this.a($$0, 0, $$1.substring(0, $$3));
         $$1 = $$1.substring($$3);
         $$2 = $$1.length();
      } while(0 != $$2);

   }

   @Override
   public void b() {
      this.a = false;
      this.e();
      super.b();
   }

   private void e() {
      try {
         this.k.close();
      } catch (IOException var2) {
         d.warn("Failed to close socket", var2);
      }

   }
}
