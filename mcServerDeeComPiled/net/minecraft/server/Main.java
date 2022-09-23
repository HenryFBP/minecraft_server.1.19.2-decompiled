package net.minecraft.server;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.net.Proxy;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public class Main {
   private static final Logger a = LogUtils.getLogger();

   @DontObfuscate
   public static void main(String[] $$0) {
      ab.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("nogui");
      OptionSpec<Void> $$3 = $$1.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
      OptionSpec<Void> $$4 = $$1.accepts("demo");
      OptionSpec<Void> $$5 = $$1.accepts("bonusChest");
      OptionSpec<Void> $$6 = $$1.accepts("forceUpgrade");
      OptionSpec<Void> $$7 = $$1.accepts("eraseCache");
      OptionSpec<Void> $$8 = $$1.accepts("safeMode", "Loads level with vanilla datapack only");
      OptionSpec<Void> $$9 = $$1.accepts("help").forHelp();
      OptionSpec<String> $$10 = $$1.accepts("singleplayer").withRequiredArg();
      OptionSpec<String> $$11 = $$1.accepts("universe").withRequiredArg().defaultsTo(".", new String[0]);
      OptionSpec<String> $$12 = $$1.accepts("world").withRequiredArg();
      OptionSpec<Integer> $$13 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo(-1, new Integer[0]);
      OptionSpec<String> $$14 = $$1.accepts("serverId").withRequiredArg();
      OptionSpec<Void> $$15 = $$1.accepts("jfrProfile");
      OptionSpec<String> $$16 = $$1.nonOptions();

      try {
         OptionSet $$17 = $$1.parse($$0);
         if ($$17.has($$9)) {
            $$1.printHelpOn(System.err);
            return;
         }

         q.h();
         if ($$17.has($$15)) {
            axf.e.a(axd.b);
         }

         abd.a();
         abd.c();
         ad.m();
         Path $$18 = Paths.get("server.properties");
         afj $$19 = new afj($$18);
         $$19.b();
         Path $$20 = Paths.get("eula.txt");
         abh $$21 = new abh($$20);
         if ($$17.has($$3)) {
            a.info("Initialized '{}' and '{}'", $$18.toAbsolutePath(), $$20.toAbsolutePath());
            return;
         }

         if (!$$21.a()) {
            a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
            return;
         }

         File $$22 = new File((String)$$17.valueOf($$11));
         abr $$23 = abr.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$22);
         String $$24 = (String)Optional.ofNullable((String)$$17.valueOf($$12)).orElse($$19.a().m);
         drq $$25 = drq.a($$22.toPath());
         drq.c $$26 = $$25.c($$24);
         drr $$27 = $$26.c();
         if ($$27 != null) {
            if ($$27.d()) {
               a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
               return;
            }

            if (!$$27.q()) {
               a.info("This world was created by an incompatible version.");
               return;
            }
         }

         boolean $$28 = $$17.has($$8);
         if ($$28) {
            a.warn("Safe mode active, only vanilla datapack will be loaded");
         }

         ahy $$29 = new ahy(ahm.b, new aib(), new ahv($$26.a(dro.j).toFile(), ahz.c));

         abu $$33;
         try {
            cgl $$30 = (cgl)Objects.requireNonNullElse($$26.d(), cgl.a);
            abt.b $$31 = new abt.b($$29, $$30, $$28);
            abt.a $$32 = new abt.a($$31, ds.a.b, $$19.a().B);
            $$33 = (abu)ad.b((Function)($$6x -> abu.a($$32, ($$5xx, $$6xx) -> {
                  hn.e $$7x = hn.e();
                  DynamicOps<qc> $$8x = aay.a(pu.a, $$7x, $$5xx);
                  drw $$9x = $$26.a($$8x, $$6xx, $$7x.g());
                  if ($$9x != null) {
                     return Pair.of($$9x, $$7x.f());
                  } else {
                     chb $$13x;
                     dbm $$14x;
                     if ($$17.has($$4)) {
                        $$13x = MinecraftServer.f;
                        $$14x = dks.b($$7x);
                     } else {
                        afi $$15x = $$19.a();
                        $$13x = new chb($$15x.m, $$15x.l, $$15x.u, $$15x.k, false, new cgt(), $$6xx);
                        $$14x = $$17.has($$5) ? $$15x.a($$7x).j() : $$15x.a($$7x);
                     }

                     dru var13x = new dru($$13x, $$14x, Lifecycle.stable());
                     return Pair.of(var13x, $$7x.f());
                  }
               }, ad.g(), $$6x))).get();
         } catch (Exception var35) {
            a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", var35);
            return;
         }

         hn.a $$36 = $$33.c();
         $$19.a().a($$36);
         drw $$37 = $$33.d();
         if ($$17.has($$6)) {
            a($$26, ank.a(), $$17.has($$7), () -> true, $$37.A());
         }

         $$26.a($$36, $$37);
         final afh $$38 = MinecraftServer.a((Function<Thread, afh>)($$12x -> {
            afh $$13x = new afh($$12x, $$26, $$29, $$33, $$19, ank.a(), $$23, agr::new);
            $$13x.b($$17.has($$10) ? new GameProfile(null, (String)$$17.valueOf($$10)) : null);
            $$13x.a($$17.valueOf($$13));
            $$13x.c($$17.has($$4));
            $$13x.b((String)$$17.valueOf($$14));
            boolean $$14x = !$$17.has($$2) && !$$17.valuesOf($$16).contains("nogui");
            if ($$14x && !GraphicsEnvironment.isHeadless()) {
               $$13x.bi();
            }

            return $$13x;
         }));
         Thread $$39 = new Thread("Server Shutdown Thread") {
            public void run() {
               $$38.a(true);
            }
         };
         $$39.setUncaughtExceptionHandler(new t(a));
         Runtime.getRuntime().addShutdownHook($$39);
      } catch (Exception var36) {
         a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", var36);
      }

   }

   private static void a(drq.c $$0, DataFixer $$1, boolean $$2, BooleanSupplier $$3, dbm $$4) {
      a.info("Forcing world upgrade!");
      azx $$5 = new azx($$0, $$1, $$4, $$2);
      rq $$6 = null;

      while(!$$5.b()) {
         rq $$7 = $$5.h();
         if ($$6 != $$7) {
            $$6 = $$7;
            a.info($$5.h().getString());
         }

         int $$8 = $$5.e();
         if ($$8 > 0) {
            int $$9 = $$5.f() + $$5.g();
            a.info("{}% completed ({} / {} chunks)...", new Object[]{ami.d((float)$$9 / (float)$$8 * 100.0F), $$9, $$8});
         }

         if (!$$3.getAsBoolean()) {
            $$5.a();
         } else {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var10) {
            }
         }
      }

   }
}
