import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicLike;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cgt {
   public static final int a = 3;
   static final Logger L = LogUtils.getLogger();
   private static final Map<cgt.e<?>, cgt.f<?>> M = Maps.newTreeMap(Comparator.comparing($$0 -> $$0.a));
   public static final cgt.e<cgt.a> b = a("doFireTick", cgt.b.e, cgt.a.a(true));
   public static final cgt.e<cgt.a> c = a("mobGriefing", cgt.b.b, cgt.a.a(true));
   public static final cgt.e<cgt.a> d = a("keepInventory", cgt.b.a, cgt.a.a(false));
   public static final cgt.e<cgt.a> e = a("doMobSpawning", cgt.b.c, cgt.a.a(true));
   public static final cgt.e<cgt.a> f = a("doMobLoot", cgt.b.d, cgt.a.a(true));
   public static final cgt.e<cgt.a> g = a("doTileDrops", cgt.b.d, cgt.a.a(true));
   public static final cgt.e<cgt.a> h = a("doEntityDrops", cgt.b.d, cgt.a.a(true));
   public static final cgt.e<cgt.a> i = a("commandBlockOutput", cgt.b.f, cgt.a.a(true));
   public static final cgt.e<cgt.a> j = a("naturalRegeneration", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.a> k = a("doDaylightCycle", cgt.b.e, cgt.a.a(true));
   public static final cgt.e<cgt.a> l = a("logAdminCommands", cgt.b.f, cgt.a.a(true));
   public static final cgt.e<cgt.a> m = a("showDeathMessages", cgt.b.f, cgt.a.a(true));
   public static final cgt.e<cgt.d> n = a("randomTickSpeed", cgt.b.e, cgt.d.a(3));
   public static final cgt.e<cgt.a> o = a("sendCommandFeedback", cgt.b.f, cgt.a.a(true));
   public static final cgt.e<cgt.a> p = a("reducedDebugInfo", cgt.b.g, cgt.a.a(false, ($$0, $$1) -> {
      byte $$2 = (byte)($$1.a() ? 22 : 23);

      for(agh $$3 : $$0.ac().t()) {
         $$3.b.a(new ug($$3, $$2));
      }

   }));
   public static final cgt.e<cgt.a> q = a("spectatorsGenerateChunks", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.d> r = a("spawnRadius", cgt.b.a, cgt.d.a(10));
   public static final cgt.e<cgt.a> s = a("disableElytraMovementCheck", cgt.b.a, cgt.a.a(false));
   public static final cgt.e<cgt.d> t = a("maxEntityCramming", cgt.b.b, cgt.d.a(24));
   public static final cgt.e<cgt.a> u = a("doWeatherCycle", cgt.b.e, cgt.a.a(true));
   public static final cgt.e<cgt.a> v = a("doLimitedCrafting", cgt.b.a, cgt.a.a(false));
   public static final cgt.e<cgt.d> w = a("maxCommandChainLength", cgt.b.g, cgt.d.a(65536));
   public static final cgt.e<cgt.a> x = a("announceAdvancements", cgt.b.f, cgt.a.a(true));
   public static final cgt.e<cgt.a> y = a("disableRaids", cgt.b.b, cgt.a.a(false));
   public static final cgt.e<cgt.a> z = a("doInsomnia", cgt.b.c, cgt.a.a(true));
   public static final cgt.e<cgt.a> A = a("doImmediateRespawn", cgt.b.a, cgt.a.a(false, ($$0, $$1) -> {
      for(agh $$2 : $$0.ac().t()) {
         $$2.b.a(new uj(uj.l, $$1.a() ? 1.0F : 0.0F));
      }

   }));
   public static final cgt.e<cgt.a> B = a("drowningDamage", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.a> C = a("fallDamage", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.a> D = a("fireDamage", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.a> E = a("freezeDamage", cgt.b.a, cgt.a.a(true));
   public static final cgt.e<cgt.a> F = a("doPatrolSpawning", cgt.b.c, cgt.a.a(true));
   public static final cgt.e<cgt.a> G = a("doTraderSpawning", cgt.b.c, cgt.a.a(true));
   public static final cgt.e<cgt.a> H = a("doWardenSpawning", cgt.b.c, cgt.a.a(true));
   public static final cgt.e<cgt.a> I = a("forgiveDeadPlayers", cgt.b.b, cgt.a.a(true));
   public static final cgt.e<cgt.a> J = a("universalAnger", cgt.b.b, cgt.a.a(false));
   public static final cgt.e<cgt.d> K = a("playersSleepingPercentage", cgt.b.a, cgt.d.a(100));
   private final Map<cgt.e<?>, cgt.g<?>> N;

   private static <T extends cgt.g<T>> cgt.e<T> a(String $$0, cgt.b $$1, cgt.f<T> $$2) {
      cgt.e<T> $$3 = new cgt.e<>($$0, $$1);
      cgt.f<?> $$4 = (cgt.f)M.put($$3, $$2);
      if ($$4 != null) {
         throw new IllegalStateException("Duplicate game rule registration for " + $$0);
      } else {
         return $$3;
      }
   }

   public cgt(DynamicLike<?> $$0) {
      this();
      this.a($$0);
   }

   public cgt() {
      this.N = (Map)M.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cgt.f)$$0.getValue()).a()));
   }

   private cgt(Map<cgt.e<?>, cgt.g<?>> $$0) {
      this.N = $$0;
   }

   public <T extends cgt.g<T>> T a(cgt.e<T> $$0) {
      return (T)this.N.get($$0);
   }

   public pj a() {
      pj $$0 = new pj();
      this.N.forEach(($$1, $$2) -> $$0.a($$1.a, $$2.b()));
      return $$0;
   }

   private void a(DynamicLike<?> $$0) {
      this.N.forEach(($$1, $$2) -> $$0.get($$1.a).asString().result().ifPresent($$2::a));
   }

   public cgt b() {
      return new cgt(
         (Map<cgt.e<?>, cgt.g<?>>)this.N.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0 -> ((cgt.g)$$0.getValue()).f()))
      );
   }

   public static void a(cgt.c $$0) {
      M.forEach(($$1, $$2) -> a($$0, $$1, $$2));
   }

   private static <T extends cgt.g<T>> void a(cgt.c $$0, cgt.e<?> $$1, cgt.f<?> $$2) {
      $$0.a($$1, $$2);
      $$2.a($$0, $$1);
   }

   public void a(cgt $$0, @Nullable MinecraftServer $$1) {
      $$0.N.keySet().forEach($$2 -> this.a($$2, $$0, $$1));
   }

   private <T extends cgt.g<T>> void a(cgt.e<T> $$0, cgt $$1, @Nullable MinecraftServer $$2) {
      T $$3 = $$1.a($$0);
      this.<T>a($$0).a($$3, $$2);
   }

   public boolean b(cgt.e<cgt.a> $$0) {
      return this.a($$0).a();
   }

   public int c(cgt.e<cgt.d> $$0) {
      return this.a($$0).a();
   }

   public static class a extends cgt.g<cgt.a> {
      private boolean b;

      static cgt.f<cgt.a> a(boolean $$0, BiConsumer<MinecraftServer, cgt.a> $$1) {
         return new cgt.f<>(BoolArgumentType::bool, $$1x -> new cgt.a($$1x, $$0), $$1, cgt.c::b);
      }

      static cgt.f<cgt.a> a(boolean $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public a(cgt.f<cgt.a> $$0, boolean $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dr> $$0, String $$1) {
         this.b = BoolArgumentType.getBool($$0, $$1);
      }

      public boolean a() {
         return this.b;
      }

      public void a(boolean $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Boolean.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = Boolean.parseBoolean($$0);
      }

      @Override
      public int c() {
         return this.b ? 1 : 0;
      }

      protected cgt.a d() {
         return this;
      }

      protected cgt.a e() {
         return new cgt.a(this.a, this.b);
      }

      public void a(cgt.a $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static enum b {
      a("gamerule.category.player"),
      b("gamerule.category.mobs"),
      c("gamerule.category.spawning"),
      d("gamerule.category.drops"),
      e("gamerule.category.updates"),
      f("gamerule.category.chat"),
      g("gamerule.category.misc");

      private final String h;

      private b(String $$0) {
         this.h = $$0;
      }

      public String a() {
         return this.h;
      }
   }

   public interface c {
      default <T extends cgt.g<T>> void a(cgt.e<T> $$0, cgt.f<T> $$1) {
      }

      default void b(cgt.e<cgt.a> $$0, cgt.f<cgt.a> $$1) {
      }

      default void c(cgt.e<cgt.d> $$0, cgt.f<cgt.d> $$1) {
      }
   }

   public static class d extends cgt.g<cgt.d> {
      private int b;

      private static cgt.f<cgt.d> a(int $$0, BiConsumer<MinecraftServer, cgt.d> $$1) {
         return new cgt.f<>(IntegerArgumentType::integer, $$1x -> new cgt.d($$1x, $$0), $$1, cgt.c::c);
      }

      static cgt.f<cgt.d> a(int $$0) {
         return a($$0, ($$0x, $$1) -> {
         });
      }

      public d(cgt.f<cgt.d> $$0, int $$1) {
         super($$0);
         this.b = $$1;
      }

      @Override
      protected void a(CommandContext<dr> $$0, String $$1) {
         this.b = IntegerArgumentType.getInteger($$0, $$1);
      }

      public int a() {
         return this.b;
      }

      public void a(int $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0;
         this.a($$1);
      }

      @Override
      public String b() {
         return Integer.toString(this.b);
      }

      @Override
      protected void a(String $$0) {
         this.b = c($$0);
      }

      public boolean b(String $$0) {
         try {
            this.b = Integer.parseInt($$0);
            return true;
         } catch (NumberFormatException var3) {
            return false;
         }
      }

      private static int c(String $$0) {
         if (!$$0.isEmpty()) {
            try {
               return Integer.parseInt($$0);
            } catch (NumberFormatException var2) {
               cgt.L.warn("Failed to parse integer {}", $$0);
            }
         }

         return 0;
      }

      @Override
      public int c() {
         return this.b;
      }

      protected cgt.d d() {
         return this;
      }

      protected cgt.d e() {
         return new cgt.d(this.a, this.b);
      }

      public void a(cgt.d $$0, @Nullable MinecraftServer $$1) {
         this.b = $$0.b;
         this.a($$1);
      }
   }

   public static final class e<T extends cgt.g<T>> {
      final String a;
      private final cgt.b b;

      public e(String $$0, cgt.b $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public String toString() {
         return this.a;
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return $$0 instanceof cgt.e && ((cgt.e)$$0).a.equals(this.a);
         }
      }

      public int hashCode() {
         return this.a.hashCode();
      }

      public String a() {
         return this.a;
      }

      public String b() {
         return "gamerule." + this.a;
      }

      public cgt.b c() {
         return this.b;
      }
   }

   public static class f<T extends cgt.g<T>> {
      private final Supplier<ArgumentType<?>> a;
      private final Function<cgt.f<T>, T> b;
      final BiConsumer<MinecraftServer, T> c;
      private final cgt.h<T> d;

      f(Supplier<ArgumentType<?>> $$0, Function<cgt.f<T>, T> $$1, BiConsumer<MinecraftServer, T> $$2, cgt.h<T> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public RequiredArgumentBuilder<dr, ?> a(String $$0) {
         return ds.a($$0, (ArgumentType<T>)this.a.get());
      }

      public T a() {
         return (T)this.b.apply(this);
      }

      public void a(cgt.c $$0, cgt.e<T> $$1) {
         this.d.call($$0, $$1, this);
      }
   }

   public abstract static class g<T extends cgt.g<T>> {
      protected final cgt.f<T> a;

      public g(cgt.f<T> $$0) {
         this.a = $$0;
      }

      protected abstract void a(CommandContext<dr> var1, String var2);

      public void b(CommandContext<dr> $$0, String $$1) {
         this.a($$0, $$1);
         this.a(((dr)$$0.getSource()).m());
      }

      protected void a(@Nullable MinecraftServer $$0) {
         if ($$0 != null) {
            this.a.c.accept($$0, this.g());
         }

      }

      protected abstract void a(String var1);

      public abstract String b();

      public String toString() {
         return this.b();
      }

      public abstract int c();

      protected abstract T g();

      protected abstract T f();

      public abstract void a(T var1, @Nullable MinecraftServer var2);
   }

   interface h<T extends cgt.g<T>> {
      void call(cgt.c var1, cgt.e<T> var2, cgt.f<T> var3);
   }
}
