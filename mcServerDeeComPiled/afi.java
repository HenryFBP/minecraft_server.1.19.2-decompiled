import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class afi extends afl<afi> {
   static final Logger Y = LogUtils.getLogger();
   private static final Pattern Z = Pattern.compile("^[a-fA-F0-9]{40}$");
   public final boolean a = this.a("online-mode", true);
   public final boolean b = this.a("prevent-proxy-connections", false);
   public final String c = this.a("server-ip", "");
   public final boolean d = this.a("spawn-animals", true);
   public final boolean e = this.a("spawn-npcs", true);
   public final boolean f = this.a("pvp", true);
   public final boolean g = this.a("allow-flight", false);
   public final String h = this.a("motd", "A Minecraft Server");
   public final boolean i = this.a("force-gamemode", false);
   public final boolean j = this.a("enforce-whitelist", false);
   public final bag k = this.a("difficulty", a(bag::a, bag::a), bag::c, bag.b);
   public final cgu l = this.a("gamemode", a(cgu::a, cgu::a), cgu::b, cgu.a);
   public final String m = this.a("level-name", "world");
   public final int n = this.a("server-port", 25565);
   @Nullable
   public final Boolean o = this.b("announce-player-achievements");
   public final boolean p = this.a("enable-query", false);
   public final int q = this.a("query.port", 25565);
   public final boolean r = this.a("enable-rcon", false);
   public final int s = this.a("rcon.port", 25575);
   public final String t = this.a("rcon.password", "");
   public final boolean u = this.a("hardcore", false);
   public final boolean v = this.a("allow-nether", true);
   public final boolean w = this.a("spawn-monsters", true);
   public final boolean x = this.a("use-native-transport", true);
   public final boolean y = this.a("enable-command-block", false);
   public final int z = this.a("spawn-protection", 16);
   public final int A = this.a("op-permission-level", 4);
   public final int B = this.a("function-permission-level", 2);
   public final long C = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
   public final int D = this.a("max-chained-neighbor-updates", 1000000);
   public final int E = this.a("rate-limit", 0);
   public final int F = this.a("view-distance", 10);
   public final int G = this.a("simulation-distance", 10);
   public final int H = this.a("max-players", 20);
   public final int I = this.a("network-compression-threshold", 256);
   public final boolean J = this.a("broadcast-rcon-to-ops", true);
   public final boolean K = this.a("broadcast-console-to-ops", true);
   public final int L = this.a("max-world-size", $$0x -> ami.a($$0x, 1, 29999984), 29999984);
   public final boolean M = this.a("sync-chunk-writes", true);
   public final boolean N = this.a("enable-jmx-monitoring", false);
   public final boolean O = this.a("enable-status", true);
   public final boolean P = this.a("hide-online-players", false);
   public final int Q = this.a("entity-broadcast-range-percentage", $$0x -> ami.a($$0x, 10, 1000), 100);
   public final String R = this.a("text-filtering-config", "");
   public Optional<MinecraftServer.b> S;
   public final boolean T = this.a("previews-chat", false);
   public final afl<afi>.a<Integer> U = this.b("player-idle-timeout", 0);
   public final afl<afi>.a<Boolean> V = this.b("white-list", false);
   public final boolean W = this.a("enforce-secure-profile", true);
   private final afi.a aa = new afi.a(
      this.a("level-seed", ""),
      this.a("generator-settings", $$0x -> alz.a(!$$0x.isEmpty() ? $$0x : "{}"), new JsonObject()),
      this.a("generate-structures", true),
      this.a("level-type", $$0x -> $$0x.toLowerCase(Locale.ROOT), dks.a.a().toString())
   );
   @Nullable
   private dbm ab;

   public afi(Properties $$0) {
      super($$0);
      this.S = a(
         this.a("resource-pack", ""),
         this.a("resource-pack-sha1", ""),
         this.a("resource-pack-hash"),
         this.a("require-resource-pack", false),
         this.a("resource-pack-prompt", "")
      );
   }

   public static afi a(Path $$0) {
      return new afi(b($$0));
   }

   protected afi a(hn $$0, Properties $$1) {
      afi $$2 = new afi($$1);
      $$2.a($$0);
      return $$2;
   }

   @Nullable
   private static rq c(String $$0) {
      if (!Strings.isNullOrEmpty($$0)) {
         try {
            return rq.a.a($$0);
         } catch (Exception var2) {
            Y.warn("Failed to parse resource pack prompt '{}'", $$0, var2);
         }
      }

      return null;
   }

   private static Optional<MinecraftServer.b> a(String $$0, String $$1, @Nullable String $$2, boolean $$3, String $$4) {
      if ($$0.isEmpty()) {
         return Optional.empty();
      } else {
         String $$5;
         if (!$$1.isEmpty()) {
            $$5 = $$1;
            if (!Strings.isNullOrEmpty($$2)) {
               Y.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
         } else if (!Strings.isNullOrEmpty($$2)) {
            Y.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            $$5 = $$2;
         } else {
            $$5 = "";
         }

         if ($$5.isEmpty()) {
            Y.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
         } else if (!Z.matcher($$5).matches()) {
            Y.warn("Invalid sha1 for resource-pack-sha1");
         }

         rq $$8 = c($$4);
         return Optional.of(new MinecraftServer.b($$0, $$5, $$3, $$8));
      }
   }

   public dbm a(hn $$0) {
      if (this.ab == null) {
         this.ab = this.aa.a($$0);
      }

      return this.ab;
   }

   public static record a(String a, JsonObject b, boolean c, String d) {
      private static final Map<String, aba<dkr>> e = Map.of("default", dks.a, "largebiomes", dks.c);

      public dbm a(hn $$0) {
         long $$1 = dbm.a(this.a()).orElse(amn.a().g());
         hm<dkr> $$2 = $$0.d(hm.aU);
         hc<dkr> $$3 = (hc)$$2.b(dks.a)
            .or(() -> $$2.g().findAny())
            .orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
         hc<dkr> $$4 = (hc)Optional.ofNullable(abb.a(this.d))
            .map($$0x -> aba.a(hm.aU, $$0x))
            .or(() -> Optional.ofNullable((aba)e.get(this.d)))
            .flatMap($$2::b)
            .orElseGet(() -> {
               afi.Y.warn("Failed to parse level-type {}, defaulting to {}", this.d, $$3.e().map($$0xx -> $$0xx.a().toString()).orElse("[unnamed]"));
               return $$3;
            });
         dbm $$5 = $$4.a().a($$1, this.c, false);
         if ($$4.a(dks.b)) {
            aay<JsonElement> $$6 = aay.a(JsonOps.INSTANCE, $$0);
            Optional<djf> $$7 = djf.a.parse(new Dynamic($$6, this.b())).resultOrPartial(afi.Y::error);
            if ($$7.isPresent()) {
               hm<dlh> $$8 = $$0.d(hm.aO);
               return dbm.a($$0, $$5, new dam($$8, (djf)$$7.get()));
            }
         }

         return $$5;
      }
   }
}
