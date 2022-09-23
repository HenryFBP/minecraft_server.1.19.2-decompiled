import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afh extends MinecraftServer implements abp {
   static final Logger n = LogUtils.getLogger();
   private static final int o = 5000;
   private static final int p = 2;
   private final List<abf> q = Collections.synchronizedList(Lists.newArrayList());
   @Nullable
   private ajp r;
   private final ajm s;
   @Nullable
   private ajr t;
   private final afj u;
   @Nullable
   private afn v;
   @Nullable
   private final ahf w;

   public afh(Thread $$0, drq.c $$1, ahy $$2, abu $$3, afj $$4, DataFixer $$5, abr $$6, agq $$7) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, $$7);
      this.u = $$4;
      this.s = new ajm(this);
      this.w = ahf.a($$4.a().R);
   }

   @Override
   public boolean e() throws IOException {
      Thread $$0 = new Thread("Server console handler") {
         public void run() {
            BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

            String $$1;
            try {
               while(!afh.this.ab() && afh.this.u() && ($$1 = $$0.readLine()) != null) {
                  afh.this.a($$1, afh.this.aD());
               }
            } catch (IOException var4) {
               afh.n.error("Exception handling console input", var4);
            }

         }
      };
      $$0.setDaemon(true);
      $$0.setUncaughtExceptionHandler(new t(n));
      $$0.start();
      n.info("Starting minecraft server version {}", ab.b().getName());
      if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
         n.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
      }

      n.info("Loading properties");
      afi $$1 = this.u.a();
      if (this.N()) {
         this.a_("127.0.0.1");
      } else {
         this.d($$1.a);
         this.e($$1.b);
         this.a_($$1.c);
      }

      this.f($$1.f);
      this.g($$1.g);
      this.d($$1.h);
      super.c($$1.U.get());
      this.h($$1.j);
      this.m.a($$1.l);
      n.info("Default game type: {}", $$1.l);
      InetAddress $$2 = null;
      if (!this.h_().isEmpty()) {
         $$2 = InetAddress.getByName(this.h_());
      }

      if (this.L() < 0) {
         this.a($$1.n);
      }

      this.O();
      n.info("Starting Minecraft server on {}:{}", this.h_().isEmpty() ? "*" : this.h_(), this.L());

      try {
         this.ad().a($$2, this.L());
      } catch (IOException var10) {
         n.warn("**** FAILED TO BIND TO PORT!");
         n.warn("The exception was: {}", var10.toString());
         n.warn("Perhaps a server is already running on that port?");
         return false;
      }

      if (!this.T()) {
         n.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
         n.warn("The server will make no attempt to authenticate usernames. Beware.");
         n.warn(
            "While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose."
         );
         n.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
      }

      if (this.bj()) {
         this.ap().c();
      }

      if (!aiy.e(this)) {
         return false;
      } else {
         this.a(new afg(this, this.aX(), this.i));
         long $$4 = ad.c();
         cul.a(this.l, this);
         aiv.a(this.T());
         n.info("Preparing level \"{}\"", this.r());
         this.f_();
         long $$5 = ad.c() - $$4;
         String $$6 = String.format(Locale.ROOT, "%.3fs", (double)$$5 / 1.0E9);
         n.info("Done ({})! For help, type \"help\"", $$6);
         if ($$1.o != null) {
            this.aK().a(cgt.x).a($$1.o, this);
         }

         if ($$1.p) {
            n.info("Starting GS4 status listener");
            this.r = ajp.a(this);
         }

         if ($$1.r) {
            n.info("Starting remote control listener");
            this.t = ajr.a(this);
         }

         if (this.bk() > 0L) {
            Thread $$7 = new Thread(new afk(this));
            $$7.setUncaughtExceptionHandler(new u(n));
            $$7.setName("Server Watchdog");
            $$7.setDaemon(true);
            $$7.start();
         }

         caz.a.a(bzj.g, hi.a());
         if ($$1.N) {
            awp.a(this);
            n.info("JMX monitoring enabled");
         }

         return true;
      }
   }

   @Override
   public boolean V() {
      return this.a().d && super.V();
   }

   @Override
   public boolean P() {
      return this.u.a().w && super.P();
   }

   @Override
   public boolean W() {
      return this.u.a().e && super.W();
   }

   @Override
   public afi a() {
      return this.u.a();
   }

   @Override
   public void q() {
      this.a(this.a().k, true);
   }

   @Override
   public boolean g() {
      return this.a().u;
   }

   @Override
   public ac a(ac $$0) {
      $$0.a("Is Modded", (Supplier<String>)(() -> this.J().b()));
      $$0.a("Type", (Supplier<String>)(() -> "Dedicated Server (map_server.txt)"));
      return $$0;
   }

   @Override
   public void a(Path $$0) throws IOException {
      afi $$1 = this.a();
      Writer $$2 = Files.newBufferedWriter($$0);

      try {
         $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.M));
         $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.l));
         $$2.write(String.format(Locale.ROOT, "spawn-monsters=%s%n", $$1.w));
         $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.Q));
         $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.L));
         $$2.write(String.format(Locale.ROOT, "spawn-npcs=%s%n", $$1.e));
         $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.F));
         $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.G));
         $$2.write(String.format(Locale.ROOT, "spawn-animals=%s%n", $$1.d));
         $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.a(this.aX()).b()));
         $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.x));
         $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.E));
      } catch (Throwable var7) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if ($$2 != null) {
         $$2.close();
      }

   }

   @Override
   public void f() {
      if (this.w != null) {
         this.w.close();
      }

      if (this.v != null) {
         this.v.b();
      }

      if (this.t != null) {
         this.t.b();
      }

      if (this.r != null) {
         this.r.b();
      }

   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b($$0);
      this.bg();
   }

   @Override
   public boolean A() {
      return this.a().v;
   }

   public void a(String $$0, dr $$1) {
      this.q.add(new abf($$0, $$1));
   }

   public void bg() {
      while(!this.q.isEmpty()) {
         abf $$0 = (abf)this.q.remove(0);
         this.aC().a($$0.b, $$0.a);
      }

   }

   @Override
   public boolean k() {
      return true;
   }

   @Override
   public int l() {
      return this.a().E;
   }

   @Override
   public boolean m() {
      return this.a().x;
   }

   @Override
   public boolean aa() {
      return this.a().T;
   }

   public afg bh() {
      return (afg)super.ac();
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   public String b() {
      return this.h_();
   }

   @Override
   public int d() {
      return this.L();
   }

   @Override
   public String p() {
      return this.Z();
   }

   @Override
   public void bi() {
      if (this.v == null) {
         this.v = afn.a(this);
      }

   }

   @Override
   public boolean af() {
      return this.v != null;
   }

   @Override
   public boolean n() {
      return this.a().y;
   }

   @Override
   public int ah() {
      return this.a().z;
   }

   @Override
   public boolean a(agg $$0, gt $$1, buc $$2) {
      if ($$0.ab() != cgx.e) {
         return false;
      } else if (this.bh().k().c()) {
         return false;
      } else if (this.bh().e($$2.fy())) {
         return false;
      } else if (this.ah() <= 0) {
         return false;
      } else {
         gt $$3 = $$0.Q();
         int $$4 = ami.a($$1.u() - $$3.u());
         int $$5 = ami.a($$1.w() - $$3.w());
         int $$6 = Math.max($$4, $$5);
         return $$6 <= this.ah();
      }
   }

   @Override
   public boolean ai() {
      return this.a().O;
   }

   @Override
   public boolean aj() {
      return this.a().P;
   }

   @Override
   public int h() {
      return this.a().A;
   }

   @Override
   public int i() {
      return this.a().B;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.u.a($$1 -> $$1.U.a(this.aX(), $$0));
   }

   @Override
   public boolean j() {
      return this.a().J;
   }

   @Override
   public boolean G_() {
      return this.a().K;
   }

   @Override
   public int as() {
      return this.a().L;
   }

   @Override
   public int av() {
      return this.a().I;
   }

   @Override
   public boolean aw() {
      return this.a().W && this.a().a;
   }

   protected boolean bj() {
      boolean $$0 = false;

      for(int $$1 = 0; !$$0 && $$1 <= 2; ++$$1) {
         if ($$1 > 0) {
            n.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
            this.bt();
         }

         $$0 = aiy.a((MinecraftServer)this);
      }

      boolean $$2 = false;

      for(int var7 = 0; !$$2 && var7 <= 2; ++var7) {
         if (var7 > 0) {
            n.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
            this.bt();
         }

         $$2 = aiy.b(this);
      }

      boolean $$3 = false;

      for(int var8 = 0; !$$3 && var8 <= 2; ++var8) {
         if (var8 > 0) {
            n.warn("Encountered a problem while converting the op list, retrying in a few seconds");
            this.bt();
         }

         $$3 = aiy.c(this);
      }

      boolean $$4 = false;

      for(int var9 = 0; !$$4 && var9 <= 2; ++var9) {
         if (var9 > 0) {
            n.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
            this.bt();
         }

         $$4 = aiy.d(this);
      }

      boolean $$5 = false;

      for(int var10 = 0; !$$5 && var10 <= 2; ++var10) {
         if (var10 > 0) {
            n.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
            this.bt();
         }

         $$5 = aiy.a(this);
      }

      return $$0 || $$2 || $$3 || $$4 || $$5;
   }

   private void bt() {
      try {
         Thread.sleep(5000L);
      } catch (InterruptedException var2) {
      }
   }

   public long bk() {
      return this.a().C;
   }

   @Override
   public int be() {
      return this.a().D;
   }

   @Override
   public String t() {
      return "";
   }

   @Override
   public String a(String $$0) {
      this.s.e();
      this.h(() -> this.aC().a(this.s.g(), $$0));
      return this.s.f();
   }

   public void i(boolean $$0) {
      this.u.a($$1 -> $$1.V.a(this.aX(), $$0));
   }

   @Override
   public void s() {
      super.s();
      ad.i();
      cul.c();
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }

   @Override
   public int b(int $$0) {
      return this.a().Q * $$0 / 100;
   }

   @Override
   public String r() {
      return this.h.a();
   }

   @Override
   public boolean aU() {
      return this.u.a().M;
   }

   @Override
   public ahe a(agh $$0) {
      return this.w != null ? this.w.a($$0.fy()) : ahe.a;
   }

   @Nullable
   @Override
   public cgu aY() {
      return this.u.a().i ? this.m.m() : null;
   }

   @Override
   public Optional<MinecraftServer.b> R() {
      return this.u.a().S;
   }
}
