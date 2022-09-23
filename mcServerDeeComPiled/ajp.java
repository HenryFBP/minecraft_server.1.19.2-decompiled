import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ajp extends ajo {
   private static final Logger d = LogUtils.getLogger();
   private static final String e = "SMP";
   private static final String f = "MINECRAFT";
   private static final long g = 30000L;
   private static final long h = 5000L;
   private long i;
   private final int j;
   private final int k;
   private final int l;
   private final String m;
   private final String n;
   private DatagramSocket o;
   private final byte[] p = new byte[1460];
   private String q;
   private String r;
   private final Map<SocketAddress, ajp.a> s;
   private final ajk t;
   private long u;
   private final abp v;

   private ajp(abp $$0, int $$1) {
      super("Query Listener");
      this.v = $$0;
      this.j = $$1;
      this.r = $$0.b();
      this.k = $$0.d();
      this.m = $$0.p();
      this.l = $$0.H();
      this.n = $$0.r();
      this.u = 0L;
      this.q = "0.0.0.0";
      if (!this.r.isEmpty() && !this.q.equals(this.r)) {
         this.q = this.r;
      } else {
         this.r = "0.0.0.0";

         try {
            InetAddress $$2 = InetAddress.getLocalHost();
            this.q = $$2.getHostAddress();
         } catch (UnknownHostException var4) {
            d.warn("Unable to determine local host IP, please set server-ip in server.properties", var4);
         }
      }

      this.t = new ajk(1460);
      this.s = Maps.newHashMap();
   }

   @Nullable
   public static ajp a(abp $$0) {
      int $$1 = $$0.a().q;
      if (0 < $$1 && 65535 >= $$1) {
         ajp $$2 = new ajp($$0, $$1);
         return !$$2.a() ? null : $$2;
      } else {
         d.warn("Invalid query port {} found in server.properties (queries disabled)", $$1);
         return null;
      }
   }

   private void a(byte[] $$0, DatagramPacket $$1) throws IOException {
      this.o.send(new DatagramPacket($$0, $$0.length, $$1.getSocketAddress()));
   }

   private boolean a(DatagramPacket $$0) throws IOException {
      byte[] $$1 = $$0.getData();
      int $$2 = $$0.getLength();
      SocketAddress $$3 = $$0.getSocketAddress();
      d.debug("Packet len {} [{}]", $$2, $$3);
      if (3 <= $$2 && -2 == $$1[0] && -3 == $$1[1]) {
         d.debug("Packet '{}' [{}]", ajl.a($$1[2]), $$3);
         switch($$1[2]) {
            case 0:
               if (!this.c($$0)) {
                  d.debug("Invalid challenge [{}]", $$3);
                  return false;
               } else if (15 == $$2) {
                  this.a(this.b($$0), $$0);
                  d.debug("Rules [{}]", $$3);
               } else {
                  ajk $$4 = new ajk(1460);
                  $$4.a(0);
                  $$4.a(this.a($$0.getSocketAddress()));
                  $$4.a(this.m);
                  $$4.a("SMP");
                  $$4.a(this.n);
                  $$4.a(Integer.toString(this.v.G()));
                  $$4.a(Integer.toString(this.l));
                  $$4.a((short)this.k);
                  $$4.a(this.q);
                  this.a($$4.a(), $$0);
                  d.debug("Status [{}]", $$3);
               }
            default:
               return true;
            case 9:
               this.d($$0);
               d.debug("Challenge [{}]", $$3);
               return true;
         }
      } else {
         d.debug("Invalid packet [{}]", $$3);
         return false;
      }
   }

   private byte[] b(DatagramPacket $$0) throws IOException {
      long $$1 = ad.b();
      if ($$1 < this.u + 5000L) {
         byte[] $$2 = this.t.a();
         byte[] $$3 = this.a($$0.getSocketAddress());
         $$2[1] = $$3[0];
         $$2[2] = $$3[1];
         $$2[3] = $$3[2];
         $$2[4] = $$3[3];
         return $$2;
      } else {
         this.u = $$1;
         this.t.b();
         this.t.a(0);
         this.t.a(this.a($$0.getSocketAddress()));
         this.t.a("splitnum");
         this.t.a(128);
         this.t.a(0);
         this.t.a("hostname");
         this.t.a(this.m);
         this.t.a("gametype");
         this.t.a("SMP");
         this.t.a("game_id");
         this.t.a("MINECRAFT");
         this.t.a("version");
         this.t.a(this.v.F());
         this.t.a("plugins");
         this.t.a(this.v.t());
         this.t.a("map");
         this.t.a(this.n);
         this.t.a("numplayers");
         this.t.a(this.v.G() + "");
         this.t.a("maxplayers");
         this.t.a(this.l + "");
         this.t.a("hostport");
         this.t.a(this.k + "");
         this.t.a("hostip");
         this.t.a(this.q);
         this.t.a(0);
         this.t.a(1);
         this.t.a("player_");
         this.t.a(0);
         String[] $$4 = this.v.I();

         for(String $$5 : $$4) {
            this.t.a($$5);
         }

         this.t.a(0);
         return this.t.a();
      }
   }

   private byte[] a(SocketAddress $$0) {
      return ((ajp.a)this.s.get($$0)).c();
   }

   private Boolean c(DatagramPacket $$0) {
      SocketAddress $$1 = $$0.getSocketAddress();
      if (!this.s.containsKey($$1)) {
         return false;
      } else {
         byte[] $$2 = $$0.getData();
         return ((ajp.a)this.s.get($$1)).a() == ajl.c($$2, 7, $$0.getLength());
      }
   }

   private void d(DatagramPacket $$0) throws IOException {
      ajp.a $$1 = new ajp.a($$0);
      this.s.put($$0.getSocketAddress(), $$1);
      this.a($$1.b(), $$0);
   }

   private void d() {
      if (this.a) {
         long $$0 = ad.b();
         if ($$0 >= this.i + 30000L) {
            this.i = $$0;
            this.s.values().removeIf($$1 -> $$1.a($$0));
         }
      }
   }

   public void run() {
      d.info("Query running on {}:{}", this.r, this.j);
      this.i = ad.b();
      DatagramPacket $$0 = new DatagramPacket(this.p, this.p.length);

      try {
         while(this.a) {
            try {
               this.o.receive($$0);
               this.d();
               this.a($$0);
            } catch (SocketTimeoutException var8) {
               this.d();
            } catch (PortUnreachableException var9) {
            } catch (IOException var10) {
               this.a(var10);
            }
         }
      } finally {
         d.debug("closeSocket: {}:{}", this.r, this.j);
         this.o.close();
      }

   }

   @Override
   public boolean a() {
      if (this.a) {
         return true;
      } else {
         return !this.e() ? false : super.a();
      }
   }

   private void a(Exception $$0) {
      if (this.a) {
         d.warn("Unexpected exception", $$0);
         if (!this.e()) {
            d.error("Failed to recover from exception, shutting down!");
            this.a = false;
         }

      }
   }

   private boolean e() {
      try {
         this.o = new DatagramSocket(this.j, InetAddress.getByName(this.r));
         this.o.setSoTimeout(500);
         return true;
      } catch (Exception var2) {
         d.warn("Unable to initialise query system on {}:{}", new Object[]{this.r, this.j, var2});
         return false;
      }
   }

   static class a {
      private final long a = new Date().getTime();
      private final int b;
      private final byte[] c;
      private final byte[] d;
      private final String e;

      public a(DatagramPacket $$0) {
         byte[] $$1 = $$0.getData();
         this.c = new byte[4];
         this.c[0] = $$1[3];
         this.c[1] = $$1[4];
         this.c[2] = $$1[5];
         this.c[3] = $$1[6];
         this.e = new String(this.c, StandardCharsets.UTF_8);
         this.b = amn.a().a(16777216);
         this.d = String.format(Locale.ROOT, "\t%s%d\u0000", this.e, this.b).getBytes(StandardCharsets.UTF_8);
      }

      public Boolean a(long $$0) {
         return this.a < $$0;
      }

      public int a() {
         return this.b;
      }

      public byte[] b() {
         return this.d;
      }

      public byte[] c() {
         return this.c;
      }

      public String d() {
         return this.e;
      }
   }
}
