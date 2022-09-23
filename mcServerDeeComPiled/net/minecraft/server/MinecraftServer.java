package net.minecraft.server;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends azd<abs> implements dq, AutoCloseable {
   private static final Logger n = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float o = 0.8F;
   private static final int p = 100;
   public static final int c = 50;
   private static final int q = 2000;
   private static final int r = 15000;
   private static final long s = 5000000000L;
   private static final int t = 12;
   public static final int d = 11;
   private static final int u = 441;
   private static final int v = 6000;
   private static final int w = 3;
   public static final int e = 29999984;
   public static final chb f = new chb("Demo World", cgu.a, false, bag.c, false, new cgt(), cgl.a);
   private static final long x = 50L;
   public static final GameProfile g = new GameProfile(ad.c, "Anonymous Player");
   protected final drq.c h;
   protected final drt i;
   private final List<Runnable> y = Lists.newArrayList();
   private ayl z = ayk.a;
   private awz A = this.z.f();
   private Consumer<awy> B = $$0x -> this.aR();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final agy G;
   private final agq H;
   private final aae I = new aae();
   private final amn J = amn.a();
   private final DataFixer K;
   private String L;
   private int M = -1;
   private final hn.a N;
   private final Map<aba<cgx>, agg> O = Maps.newLinkedHashMap();
   private aiz P;
   private volatile boolean Q = true;
   private boolean R;
   private int S;
   protected final Proxy j;
   private boolean T;
   private boolean U;
   private boolean V;
   private boolean W;
   @Nullable
   private String X;
   private int Y;
   public final long[] k = new long[100];
   @Nullable
   private KeyPair Z;
   @Nullable
   private GameProfile aa;
   private boolean ab;
   private volatile boolean ac;
   private long ad;
   protected final abr l;
   private long ae;
   private final Thread af;
   private long ag = ad.b();
   private long ah;
   private boolean ai;
   private final ahy aj;
   private final abq ak = new abq(this);
   @Nullable
   private drj al;
   private final abw am = new abw();
   private final abo an;
   private final alw ao = new alw();
   private boolean ap;
   private float aq;
   private final Executor ar;
   @Nullable
   private String as;
   private MinecraftServer.a at;
   private final dou au;
   protected final drw m;
   private volatile boolean av;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference();
      Thread $$2 = new Thread(() -> ((MinecraftServer)$$1.get()).v(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> n.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, drq.c $$1, ahy $$2, abu $$3, Proxy $$4, DataFixer $$5, abr $$6, agq $$7) {
      super("Server");
      this.N = $$3.c();
      this.m = $$3.d();
      if (!this.m.A().d().e(cyv.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.j = $$4;
         this.aj = $$2;
         this.at = new MinecraftServer.a($$3.a(), $$3.b());
         this.l = $$6;
         if ($$6.d() != null) {
            $$6.d().a(this);
         }

         this.G = new agy(this);
         this.H = $$7;
         this.h = $$1;
         this.i = $$1.b();
         this.K = $$5;
         this.an = new abo(this, this.at.b.a());
         this.au = new dou($$3.a(), $$1, $$5);
         this.af = $$0;
         this.ar = ad.g();
      }
   }

   private void a(drm $$0) {
      $$0.a(this.aF()::a, this.aF()::b, "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void f_() {
      if (!axf.e.c()) {
      }

      boolean $$0 = false;
      axi $$1 = axf.e.e();
      this.m.a(this.getServerModName(), this.J().a());
      agp $$2 = this.H.create(11);
      this.a($$2);
      this.q();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            axf.e.b();
         } catch (Throwable var5) {
            n.warn("Failed to stop JFR profiling", var5);
         }
      }

   }

   protected void q() {
   }

   protected void a(agp $$0) {
      drv $$1 = this.m.H();
      dbm $$2 = this.m.A();
      boolean $$3 = $$2.g();
      long $$4 = $$2.a();
      long $$5 = chv.a($$4);
      List<cgk> $$6 = ImmutableList.of(new dbd(), new dbc(), new btl(), new bmq(), new btw($$1));
      hm<cyv> $$7 = $$2.d();
      cyv $$8 = $$7.a(cyv.b);
      agg $$9 = new agg(this, this.ar, this.h, $$1, cgx.e, $$8, $$0, $$3, $$5, $$6, true);
      this.O.put(cgx.e, $$9);
      drm $$10 = $$9.t();
      this.a($$10);
      this.al = new drj($$10);
      cxe $$11 = $$9.p_();
      if (!$$1.p()) {
         try {
            a($$9, $$1, $$2.c(), $$3);
            $$1.c(true);
            if ($$3) {
               this.a(this.m);
            }
         } catch (Throwable var22) {
            q $$13 = q.a(var22, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var21) {
            }

            throw new z($$13);
         }

         $$1.c(true);
      }

      this.ac().a($$9);
      if (this.m.E() != null) {
         this.aL().a(this.m.E());
      }

      for(Entry<aba<cyv>, cyv> $$14 : $$7.f()) {
         aba<cyv> $$15 = (aba)$$14.getKey();
         if ($$15 != cyv.b) {
            aba<cgx> $$16 = aba.a(hm.P, $$15.a());
            drl $$17 = new drl(this.m, $$1);
            agg $$18 = new agg(this, this.ar, this.h, $$17, $$16, (cyv)$$14.getValue(), $$0, $$3, $$5, ImmutableList.of(), false);
            $$11.a(new cxc.a($$18.p_()));
            this.O.put($$16, $$18);
         }
      }

      $$11.a($$1.r());
   }

   private static void a(agg $$0, drv $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(gt.b.b(80), 0.0F);
      } else {
         age $$4 = $$0.k();
         cge $$5 = new cge($$4.h().c().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.u_()) {
            gt $$7 = $$5.l();
            $$6 = $$0.a(dar.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;
         int $$12 = 5;

         for(int $$13 = 0; $$13 < ami.h(11); ++$$13) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               gt $$14 = agb.a($$0, new cge($$5.e + $$8, $$5.f + $$9));
               if ($$14 != null) {
                  $$1.a($$14, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$15 = $$10;
               $$10 = -$$11;
               $$11 = $$15;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            ddg<?, ?> $$16 = (ddg)nf.m.a();
            $$16.a($$0, $$4.g(), $$0.w, new gt($$1.a(), $$1.b(), $$1.c()));
         }

      }
   }

   private void a(drw $$0) {
      $$0.a(bag.a);
      $$0.d(true);
      drv $$1 = $$0.H();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(cgu.d);
   }

   private void b(agp $$0) {
      agg $$1 = this.C();
      n.info("Preparing start region for dimension {}", $$1.ab().a());
      gt $$2 = $$1.Q();
      $$0.a(new cge($$2));
      age $$3 = $$1.k();
      $$3.a().a(500);
      this.ag = ad.b();
      $$3.a(agl.a, new cge($$2), 11, anf.a);

      while($$3.b() != 441) {
         this.ag = ad.b() + 10L;
         this.w();
      }

      this.ag = ad.b() + 10L;
      this.w();

      for(agg $$4 : this.O.values()) {
         cgs $$5 = $$4.t().a(cgs::b, "chunks");
         if ($$5 != null) {
            LongIterator $$6 = $$5.a().iterator();

            while($$6.hasNext()) {
               long $$7 = $$6.nextLong();
               cge $$8 = new cge($$7);
               $$4.k().a($$8, true);
            }
         }
      }

      this.ag = ad.b() + 10L;
      this.w();
      $$0.b();
      $$3.a().a(5);
      this.bi();
   }

   public cgu g_() {
      return this.m.m();
   }

   public boolean g() {
      return this.m.n();
   }

   public abstract int h();

   public abstract int i();

   public abstract boolean j();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for(agg $$4 : this.E()) {
         if (!$$0) {
            n.info("Saving chunks for level '{}'/{}", $$4, $$4.ab().a());
         }

         $$4.a(null, $$1, $$4.b && !$$2);
         $$3 = true;
      }

      agg $$5 = this.C();
      drv $$6 = this.m.H();
      $$6.a($$5.p_().t());
      this.m.b(this.aL().c());
      this.h.a(this.aX(), this.m, this.ac().r());
      if ($$1) {
         for(agg $$7 : this.E()) {
            n.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.k().a.m());
         }

         n.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.av = true;
         this.ac().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.av = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.s();
   }

   public void s() {
      if (this.z.e()) {
         this.aT();
      }

      n.info("Stopping server");
      if (this.ad() != null) {
         this.ad().b();
      }

      this.av = true;
      if (this.P != null) {
         n.info("Saving players");
         this.P.h();
         this.P.s();
      }

      n.info("Saving worlds");

      for(agg $$0 : this.E()) {
         if ($$0 != null) {
            $$0.b = false;
         }
      }

      while(this.O.values().stream().anyMatch($$0 -> $$0.k().a.e())) {
         this.ag = ad.b() + 1L;

         for(agg $$1 : this.E()) {
            $$1.k().n();
            $$1.k().a(() -> true, false);
         }

         this.w();
      }

      this.a(false, true, false);

      for(agg $$2 : this.E()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               n.error("Exception closing the level", var5);
            }
         }
      }

      this.av = false;
      this.at.close();

      try {
         this.h.close();
      } catch (IOException var4) {
         n.error("Failed to unlock level {}", this.h.a(), var4);
      }

   }

   public String h_() {
      return this.L;
   }

   public void a_(String $$0) {
      this.L = $$0;
   }

   public boolean u() {
      return this.Q;
   }

   public void a(boolean $$0) {
      this.Q = false;
      if ($$0) {
         try {
            this.af.join();
         } catch (InterruptedException var3) {
            n.error("Error while shutting down", var3);
         }
      }

   }

   protected void v() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ag = ad.b();
         this.I.a(rq.b(this.X));
         this.I.a(new aae.c(ab.b().getName(), ab.b().getProtocolVersion()));
         this.I.a(this.aa());
         this.I.b(this.aw());
         this.a(this.I);

         while(this.Q) {
            long $$0 = ad.b() - this.ag;
            if ($$0 > 2000L && this.ag - this.ad >= 15000L) {
               long $$1 = $$0 / 50L;
               n.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$0, $$1);
               this.ag += $$1 * 50L;
               this.ad = this.ag;
            }

            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ad.c(), this.S);
            }

            this.ag += 50L;
            this.bj();
            this.A.a("tick");
            this.a(this::bg);
            this.A.b("nextTickWait");
            this.ai = true;
            this.ah = Math.max(ad.b() + 50L, this.ag);
            this.w();
            this.A.c();
            this.bk();
            this.ac = true;
            axf.e.a(this.aq);
         }
      } catch (Throwable var44) {
         n.error("Encountered an unexpected exception", var44);
         q $$4 = a(var44);
         this.b($$4.g());
         File $$5 = new File(new File(this.z(), "crash-reports"), "crash-" + ad.e() + "-server.txt");
         if ($$4.a($$5)) {
            n.error("This crash report has been saved to: {}", $$5.getAbsolutePath());
         } else {
            n.error("We were unable to save this crash report to disk.");
         }

         this.a($$4);
      } finally {
         try {
            this.R = true;
            this.s();
         } catch (Throwable var42) {
            n.error("Exception stopping the server", var42);
         } finally {
            if (this.l.d() != null) {
               this.l.d().a();
            }

            this.f();
         }

      }

   }

   private static q a(Throwable $$0) {
      z $$1 = null;

      for(Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof z $$3) {
            $$1 = $$3;
         }
      }

      q $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new q("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bg() {
      return this.bs() || ad.b() < (this.ai ? this.ah : this.ag);
   }

   protected void w() {
      this.bq();
      this.c(() -> !this.bg());
   }

   protected abs a(Runnable $$0) {
      return new abs(this.S, $$0);
   }

   protected boolean a(abs $$0) {
      return $$0.a() + 3 < this.S || this.bg();
   }

   @Override
   public boolean x() {
      boolean $$0 = this.bh();
      this.ai = $$0;
      return $$0;
   }

   private boolean bh() {
      if (super.x()) {
         return true;
      } else {
         if (this.bg()) {
            for(agg $$0 : this.E()) {
               if ($$0.k().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(abs $$0) {
      this.aP().d("runTask");
      super.d($$0);
   }

   private void a(aae $$0) {
      Optional<File> $$1 = Optional.of(this.c("server-icon.png")).filter(File::isFile);
      if (!$$1.isPresent()) {
         $$1 = this.h.e().map(Path::toFile).filter(File::isFile);
      }

      $$1.ifPresent($$1x -> {
         try {
            BufferedImage $$2 = ImageIO.read($$1x);
            Validate.validState($$2.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
            Validate.validState($$2.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
            ImageIO.write($$2, "PNG", $$3);
            byte[] $$4 = Base64.getEncoder().encode($$3.toByteArray());
            $$0.a("data:image/png;base64," + new String($$4, StandardCharsets.UTF_8));
         } catch (Exception var5) {
            n.error("Couldn't load server icon", var5);
         }

      });
   }

   public Optional<Path> y() {
      return this.h.e();
   }

   public File z() {
      return new File(".");
   }

   public void a(q $$0) {
   }

   public void f() {
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ad.c();
      ++this.S;
      this.b($$0);
      if ($$1 - this.ae >= 5000000000L) {
         this.ae = $$1;
         this.I.a(new aae.a(this.H(), this.G()));
         if (!this.aj()) {
            GameProfile[] $$2 = new GameProfile[Math.min(this.G(), 12)];
            int $$3 = ami.a(this.J, 0, this.G() - $$2.length);

            for(int $$4 = 0; $$4 < $$2.length; ++$$4) {
               agh $$5 = (agh)this.P.t().get($$3 + $$4);
               if ($$5.V()) {
                  $$2[$$4] = $$5.fy();
               } else {
                  $$2[$$4] = g;
               }
            }

            Collections.shuffle(Arrays.asList($$2));
            this.I.b().a($$2);
         }
      }

      if (this.S % 6000 == 0) {
         n.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         n.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$6 = this.k[this.S % 100] = ad.c() - $$1;
      this.aq = this.aq * 0.8F + (float)$$6 / 1000000.0F * 0.19999999F;
      long $$7 = ad.c();
      this.ao.a($$7 - $$1);
      this.A.c();
   }

   public void b(BooleanSupplier $$0) {
      this.A.a("commandFunctions");
      this.aA().c();
      this.A.b("levels");

      for(agg $$1 : this.E()) {
         this.A.a((Supplier<String>)(() -> $$1 + " " + $$1.ab().a()));
         if (this.S % 20 == 0) {
            this.A.a("timeSync");
            this.P.a(new wu($$1.U(), $$1.V(), $$1.W().b(cgt.k)), $$1.ab());
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            q $$3 = q.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new z($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.ad().c();
      this.A.b("players");
      this.P.d();
      if (ab.aL) {
         op.a.b();
      }

      this.A.b("server gui refresh");

      for(int $$4 = 0; $$4 < this.y.size(); ++$$4) {
         ((Runnable)this.y.get($$4)).run();
      }

      this.A.c();
   }

   public boolean A() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.as = $$0;
   }

   public boolean B() {
      return !this.af.isAlive();
   }

   public File c(String $$0) {
      return new File(this.z(), $$0);
   }

   public final agg C() {
      return (agg)this.O.get(cgx.e);
   }

   @Nullable
   public agg a(aba<cgx> $$0) {
      return (agg)this.O.get($$0);
   }

   public Set<aba<cgx>> D() {
      return this.O.keySet();
   }

   public Iterable<agg> E() {
      return this.O.values();
   }

   public String F() {
      return ab.b().getName();
   }

   public int G() {
      return this.P.m();
   }

   public int H() {
      return this.P.n();
   }

   public String[] I() {
      return this.P.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ac b(ac $$0) {
      $$0.a("Server Running", (Supplier<String>)(() -> Boolean.toString(this.Q)));
      if (this.P != null) {
         $$0.a("Player Count", (Supplier<String>)(() -> this.P.m() + " / " + this.P.n() + "; " + this.P.t()));
      }

      $$0.a("Data Packs", (Supplier<String>)(() -> {
         StringBuilder $$0x = new StringBuilder();

         for(ahw $$1 : this.aj.e()) {
            if ($$0x.length() > 0) {
               $$0x.append(", ");
            }

            $$0x.append($$1.e());
            if (!$$1.c().a()) {
               $$0x.append(" (incompatible)");
            }
         }

         return $$0x.toString();
      }));
      $$0.a("World Generation", (Supplier<String>)(() -> this.m.B().toString()));
      if (this.as != null) {
         $$0.a("Server Id", (Supplier<String>)(() -> this.as));
      }

      return this.a($$0);
   }

   public abstract ac a(ac var1);

   public amh J() {
      return amh.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(rq $$0) {
      n.info($$0.getString());
   }

   public KeyPair K() {
      return this.Z;
   }

   public int L() {
      return this.M;
   }

   public void a(int $$0) {
      this.M = $$0;
   }

   @Nullable
   public GameProfile M() {
      return this.aa;
   }

   public void b(@Nullable GameProfile $$0) {
      this.aa = $$0;
   }

   public boolean N() {
      return this.aa != null;
   }

   protected void O() {
      n.info("Generating keypair");

      try {
         this.Z = ali.b();
      } catch (alj var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bag $$0, boolean $$1) {
      if ($$1 || !this.m.t()) {
         this.m.a(this.m.n() ? bag.d : $$0);
         this.bi();
         this.ac().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bi() {
      for(agg $$0 : this.E()) {
         $$0.b(this.P(), this.V());
      }

   }

   public void b(boolean $$0) {
      this.m.d($$0);
      this.ac().t().forEach(this::c);
   }

   private void c(agh $$0) {
      drn $$1 = $$0.x().n_();
      $$0.b.a(new tr($$1.s(), $$1.t()));
   }

   public boolean P() {
      return this.m.s() != bag.a;
   }

   public boolean Q() {
      return this.ab;
   }

   public void c(boolean $$0) {
      this.ab = $$0;
   }

   public Optional<MinecraftServer.b> R() {
      return Optional.empty();
   }

   public boolean S() {
      return this.R().filter(MinecraftServer.b::c).isPresent();
   }

   public abstract boolean k();

   public abstract int l();

   public boolean T() {
      return this.T;
   }

   public void d(boolean $$0) {
      this.T = $$0;
   }

   public boolean U() {
      return this.U;
   }

   public void e(boolean $$0) {
      this.U = $$0;
   }

   public boolean V() {
      return true;
   }

   public boolean W() {
      return true;
   }

   public abstract boolean m();

   public boolean X() {
      return this.V;
   }

   public void f(boolean $$0) {
      this.V = $$0;
   }

   public boolean Y() {
      return this.W;
   }

   public void g(boolean $$0) {
      this.W = $$0;
   }

   public abstract boolean n();

   public String Z() {
      return this.X;
   }

   public void d(String $$0) {
      this.X = $$0;
   }

   public boolean aa() {
      return false;
   }

   public boolean ab() {
      return this.R;
   }

   public aiz ac() {
      return this.P;
   }

   public void a(aiz $$0) {
      this.P = $$0;
   }

   public abstract boolean o();

   public void a(cgu $$0) {
      this.m.a($$0);
   }

   @Nullable
   public agy ad() {
      return this.G;
   }

   public boolean ae() {
      return this.ac;
   }

   public boolean af() {
      return false;
   }

   public boolean a(@Nullable cgu $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ag() {
      return this.S;
   }

   public int ah() {
      return 16;
   }

   public boolean a(agg $$0, gt $$1, buc $$2) {
      return false;
   }

   public boolean ai() {
      return true;
   }

   public boolean aj() {
      return false;
   }

   public Proxy ak() {
      return this.j;
   }

   public int al() {
      return this.Y;
   }

   public void c(int $$0) {
      this.Y = $$0;
   }

   public MinecraftSessionService am() {
      return this.l.a();
   }

   public amp an() {
      return this.l.b();
   }

   public GameProfileRepository ao() {
      return this.l.c();
   }

   public aiv ap() {
      return this.l.d();
   }

   public aae aq() {
      return this.I;
   }

   public void ar() {
      this.ae = 0L;
   }

   public int as() {
      return 29999984;
   }

   @Override
   public boolean at() {
      return super.at() && !this.ab();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ab()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread au() {
      return this.af;
   }

   public int av() {
      return 256;
   }

   public boolean aw() {
      return false;
   }

   public long ax() {
      return this.ag;
   }

   public DataFixer ay() {
      return this.K;
   }

   public int a(@Nullable agg $$0) {
      return $$0 != null ? $$0.W().c(cgt.r) : 10;
   }

   public abm az() {
      return this.at.b.g();
   }

   public abo aA() {
      return this.an;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      hn.a $$1 = this.aX();
      CompletableFuture<Void> $$2 = CompletableFuture.supplyAsync(
            () -> (ImmutableList)$$0.stream().map(this.aj::a).filter(Objects::nonNull).map(ahw::d).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$1x -> {
            aid $$2x = new aif(ahm.b, $$1x);
            return abk.a($$2x, $$1, this.k() ? ds.a.b : ds.a.c, this.i(), this.ar, this).whenComplete(($$1xx, $$2xx) -> {
               if ($$2xx != null) {
                  $$2x.close();
               }
   
            }).thenApply($$1xx -> new MinecraftServer.a($$2x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.at.close();
            this.at = $$1x;
            this.aj.a($$0);
            this.m.a(a(this.aj));
            this.at.b.a(this.aX());
            this.ac().h();
            this.ac().u();
            this.an.a(this.at.b.a());
            this.au.a(this.at.a);
         }, this);
      if (this.bm()) {
         this.c($$2::isDone);
      }

      return $$2;
   }

   public static cgl a(ahy $$0, cgl $$1, boolean $$2) {
      $$0.a();
      if ($$2) {
         $$0.a(Collections.singleton("vanilla"));
         return cgl.a;
      } else {
         Set<String> $$3 = Sets.newLinkedHashSet();

         for(String $$4 : $$1.a()) {
            if ($$0.b($$4)) {
               $$3.add($$4);
            } else {
               n.warn("Missing data pack {}", $$4);
            }
         }

         for(ahw $$5 : $$0.c()) {
            String $$6 = $$5.e();
            if (!$$1.b().contains($$6) && !$$3.contains($$6)) {
               n.info("Found new data pack {}, loading it automatically", $$6);
               $$3.add($$6);
            }
         }

         if ($$3.isEmpty()) {
            n.info("No datapacks selected, forcing vanilla");
            $$3.add("vanilla");
         }

         $$0.a($$3);
         return a($$0);
      }
   }

   private static cgl a(ahy $$0) {
      Collection<String> $$1 = $$0.d();
      List<String> $$2 = ImmutableList.copyOf($$1);
      List<String> $$3 = (List)$$0.b().stream().filter($$1x -> !$$1.contains($$1x)).collect(ImmutableList.toImmutableList());
      return new cgl($$2, $$3);
   }

   public void a(dr $$0) {
      if (this.aM()) {
         aiz $$1 = $$0.m().ac();
         ajh $$2 = $$1.i();

         for(agh $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fy())) {
               $$4.b.b(rq.c("multiplayer.disconnect.not_whitelisted"));
            }
         }

      }
   }

   public ahy aB() {
      return this.aj;
   }

   public ds aC() {
      return this.at.b.f();
   }

   public dr aD() {
      agg $$0 = this.C();
      return new dr(this, $$0 == null ? dwq.b : dwq.b($$0.Q()), dwp.a, $$0, 4, "Server", rq.b("Server"), this, null);
   }

   @Override
   public boolean i_() {
      return true;
   }

   @Override
   public boolean j_() {
      return true;
   }

   @Override
   public abstract boolean G_();

   public cdq aE() {
      return this.at.b.e();
   }

   public abq aF() {
      return this.ak;
   }

   public drj aG() {
      if (this.al == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.al;
      }
   }

   public dsh aH() {
      return this.at.b.c();
   }

   public dsi aI() {
      return this.at.b.b();
   }

   public dsc aJ() {
      return this.at.b.d();
   }

   public cgt aK() {
      return this.C().W();
   }

   public abw aL() {
      return this.am;
   }

   public boolean aM() {
      return this.ap;
   }

   public void h(boolean $$0) {
      this.ap = $$0;
   }

   public float aN() {
      return this.aq;
   }

   public int c(GameProfile $$0) {
      if (this.ac().e($$0)) {
         ajb $$1 = this.ac().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.N()) {
            return this.ac().v() ? 4 : 0;
         } else {
            return this.h();
         }
      } else {
         return 0;
      }
   }

   public alw aO() {
      return this.ao;
   }

   public awz aP() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for(Entry<aba<cgx>, agg> $$2 : this.O.entrySet()) {
            abb $$3 = ((aba)$$2.getKey()).a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            ((agg)$$2.getValue()).a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         n.warn("Failed to save debug report", var7);
      }

   }

   private void c(Path $$0) throws IOException {
      Writer $$1 = Files.newBufferedWriter($$0);

      try {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bn()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aN()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.k)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ad.g()));
      } catch (Throwable var6) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if ($$1 != null) {
         $$1.close();
      }

   }

   private void d(Path $$0) throws IOException {
      Writer $$1 = Files.newBufferedWriter($$0);

      try {
         final List<String> $$2 = Lists.newArrayList();
         final cgt $$3 = this.aK();
         cgt.a(new cgt.c() {
            @Override
            public <T extends cgt.g<T>> void a(cgt.e<T> $$0, cgt.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.<T>a($$0)));
            }
         });

         for(String $$4 : $$2) {
            $$1.write($$4);
         }
      } catch (Throwable var8) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$1 != null) {
         $$1.close();
      }

   }

   private void e(Path $$0) throws IOException {
      Writer $$1 = Files.newBufferedWriter($$0);

      try {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for(String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      } catch (Throwable var8) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if ($$1 != null) {
         $$1.close();
      }

   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));
      Writer $$3 = Files.newBufferedWriter($$0);

      try {
         for(ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      } catch (Throwable var10) {
         if ($$3 != null) {
            try {
               $$3.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if ($$3 != null) {
         $$3.close();
      }

   }

   private void g(Path $$0) throws IOException {
      Writer $$1 = Files.newBufferedWriter($$0);

      label49: {
         try {
            label50: {
               List<amj.a> $$2;
               try {
                  $$2 = Lists.newArrayList(amj.a());
               } catch (Throwable var7) {
                  n.warn("Failed to list native modules", var7);
                  break label50;
               }

               $$2.sort(Comparator.comparing($$0x -> $$0x.a));
               Iterator $$3 = $$2.iterator();

               while(true) {
                  if (!$$3.hasNext()) {
                     break label49;
                  }

                  amj.a $$5 = (amj.a)$$3.next();
                  $$1.write($$5.toString());
                  $$1.write(10);
               }
            }
         } catch (Throwable var8) {
            if ($$1 != null) {
               try {
                  $$1.close();
               } catch (Throwable var6) {
                  var8.addSuppressed(var6);
               }
            }

            throw var8;
         }

         if ($$1 != null) {
            $$1.close();
         }

         return;
      }

      if ($$1 != null) {
         $$1.close();
      }

   }

   private void bj() {
      if (this.D) {
         this.z = ayj.a(new ayn(ad.a, this.k()), ad.a, ad.h(), new ayp("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = axc.a(this.z.f(), axc.a("Server"));
      this.z.c();
      this.A.a();
   }

   private void bk() {
      this.A.b();
      this.z.d();
   }

   public boolean aQ() {
      return this.z.e();
   }

   public void a(Consumer<awy> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aR();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aR() {
      this.z = ayk.a;
   }

   public void aS() {
      this.z.a();
   }

   public void aT() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(dro $$0) {
      return this.h.a($$0);
   }

   public boolean aU() {
      return true;
   }

   public dou aV() {
      return this.au;
   }

   public drw aW() {
      return this.m;
   }

   public hn.a aX() {
      return this.N;
   }

   public ahe a(agh $$0) {
      return ahe.a;
   }

   public agi b(agh $$0) {
      return (agi)(this.Q() ? new afy($$0) : new agi($$0));
   }

   @Nullable
   public cgu aY() {
      return null;
   }

   public aim aZ() {
      return this.at.a;
   }

   public boolean ba() {
      return this.av;
   }

   public boolean bb() {
      return this.F || this.E != null;
   }

   public void bc() {
      this.F = true;
   }

   public awy bd() {
      if (this.E == null) {
         return awu.a;
      } else {
         awy $$0 = this.E.a(ad.c(), this.S);
         this.E = null;
         return $$0;
      }
   }

   public int be() {
      return 1000000;
   }

   public void a(rq $$0, rm.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         n.info("[{}] {}", $$2, $$3);
      } else {
         n.info("{}", $$3);
      }

   }

   public rh bf() {
      return rh.a;
   }

   static record a(aid a, abk b) implements AutoCloseable {
      final aid a;
      final abk b;

      public void close() {
         this.a.close();
      }
   }

   public static record b(String a, String b, boolean c, @Nullable rq d) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      awy a(final long $$0, final int $$1) {
         return new awy() {
            @Override
            public List<axb> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
