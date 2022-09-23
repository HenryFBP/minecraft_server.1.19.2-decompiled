import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class dru implements drv, drw {
   private static final Logger e = LogUtils.getLogger();
   protected static final String a = "Player";
   protected static final String b = "WorldGenSettings";
   private chb f;
   private final dbm g;
   private final Lifecycle h;
   private int i;
   private int j;
   private int k;
   private float l;
   private long m;
   private long n;
   @Nullable
   private final DataFixer o;
   private final int p;
   private boolean q;
   @Nullable
   private pj r;
   private final int s;
   private int t;
   private boolean u;
   private int v;
   private boolean w;
   private int x;
   private boolean y;
   private boolean z;
   private cxe.c A;
   private pj B;
   @Nullable
   private pj C;
   private int D;
   private int E;
   @Nullable
   private UUID F;
   private final Set<String> G;
   private boolean H;
   private final dwi<MinecraftServer> I;

   private dru(
      @Nullable DataFixer $$0,
      int $$1,
      @Nullable pj $$2,
      boolean $$3,
      int $$4,
      int $$5,
      int $$6,
      float $$7,
      long $$8,
      long $$9,
      int $$10,
      int $$11,
      int $$12,
      boolean $$13,
      int $$14,
      boolean $$15,
      boolean $$16,
      boolean $$17,
      cxe.c $$18,
      int $$19,
      int $$20,
      @Nullable UUID $$21,
      Set<String> $$22,
      dwi<MinecraftServer> $$23,
      @Nullable pj $$24,
      pj $$25,
      chb $$26,
      dbm $$27,
      Lifecycle $$28
   ) {
      if (!$$27.d().e(cyv.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.o = $$0;
         this.H = $$3;
         this.i = $$4;
         this.j = $$5;
         this.k = $$6;
         this.l = $$7;
         this.m = $$8;
         this.n = $$9;
         this.s = $$10;
         this.t = $$11;
         this.v = $$12;
         this.u = $$13;
         this.x = $$14;
         this.w = $$15;
         this.y = $$16;
         this.z = $$17;
         this.A = $$18;
         this.D = $$19;
         this.E = $$20;
         this.F = $$21;
         this.G = $$22;
         this.r = $$2;
         this.p = $$1;
         this.I = $$23;
         this.C = $$24;
         this.B = $$25;
         this.f = $$26;
         this.g = $$27;
         this.h = $$28;
      }
   }

   public dru(chb $$0, dbm $$1, Lifecycle $$2) {
      this(
         null,
         ab.b().getWorldVersion(),
         null,
         false,
         0,
         0,
         0,
         0.0F,
         0L,
         0L,
         19133,
         0,
         0,
         false,
         0,
         false,
         false,
         false,
         cxe.e,
         0,
         0,
         null,
         Sets.newLinkedHashSet(),
         new dwi<>(dwh.a),
         null,
         new pj(),
         $$0.h(),
         $$1,
         $$2
      );
   }

   public static dru a(Dynamic<qc> $$0, DataFixer $$1, int $$2, @Nullable pj $$3, chb $$4, drs $$5, dbm $$6, Lifecycle $$7) {
      long $$8 = $$0.get("Time").asLong(0L);
      pj $$9 = (pj)$$0.get("DragonFight")
         .result()
         .map(Dynamic::getValue)
         .orElseGet(() -> (qc)$$0.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap().getValue());
      return new dru(
         $$1,
         $$2,
         $$3,
         $$0.get("WasModded").asBoolean(false),
         $$0.get("SpawnX").asInt(0),
         $$0.get("SpawnY").asInt(0),
         $$0.get("SpawnZ").asInt(0),
         $$0.get("SpawnAngle").asFloat(0.0F),
         $$8,
         $$0.get("DayTime").asLong($$8),
         $$5.a(),
         $$0.get("clearWeatherTime").asInt(0),
         $$0.get("rainTime").asInt(0),
         $$0.get("raining").asBoolean(false),
         $$0.get("thunderTime").asInt(0),
         $$0.get("thundering").asBoolean(false),
         $$0.get("initialized").asBoolean(true),
         $$0.get("DifficultyLocked").asBoolean(false),
         cxe.c.a($$0, cxe.e),
         $$0.get("WanderingTraderSpawnDelay").asInt(0),
         $$0.get("WanderingTraderSpawnChance").asInt(0),
         (UUID)$$0.get("WanderingTraderId").read(hr.a).result().orElse(null),
         (Set<String>)$$0.get("ServerBrands")
            .asStream()
            .flatMap($$0x -> $$0x.asString().result().stream())
            .collect(Collectors.toCollection(Sets::newLinkedHashSet)),
         new dwi<>(dwh.a, $$0.get("ScheduledEvents").asStream()),
         (pj)$$0.get("CustomBossEvents").orElseEmptyMap().getValue(),
         $$9,
         $$4,
         $$6,
         $$7
      );
   }

   @Override
   public pj a(hn $$0, @Nullable pj $$1) {
      this.J();
      if ($$1 == null) {
         $$1 = this.r;
      }

      pj $$2 = new pj();
      this.a($$0, $$2, $$1);
      return $$2;
   }

   private void a(hn $$0, pj $$1, @Nullable pj $$2) {
      pp $$3 = new pp();
      this.G.stream().map(qa::a).forEach($$3::add);
      $$1.a("ServerBrands", (qc)$$3);
      $$1.a("WasModded", this.H);
      pj $$4 = new pj();
      $$4.a("Name", ab.b().getName());
      $$4.a("Id", ab.b().b().c());
      $$4.a("Snapshot", !ab.b().isStable());
      $$4.a("Series", ab.b().b().b());
      $$1.a("Version", (qc)$$4);
      $$1.a("DataVersion", ab.b().getWorldVersion());
      DynamicOps<qc> $$5 = aay.a(pu.a, $$0);
      dbm.a.encodeStart($$5, this.g).resultOrPartial(ad.a("WorldGenSettings: ", e::error)).ifPresent($$1x -> $$1.a("WorldGenSettings", $$1x));
      $$1.a("GameType", this.f.b().a());
      $$1.a("SpawnX", this.i);
      $$1.a("SpawnY", this.j);
      $$1.a("SpawnZ", this.k);
      $$1.a("SpawnAngle", this.l);
      $$1.a("Time", this.m);
      $$1.a("DayTime", this.n);
      $$1.a("LastPlayed", ad.d());
      $$1.a("LevelName", this.f.a());
      $$1.a("version", 19133);
      $$1.a("clearWeatherTime", this.t);
      $$1.a("rainTime", this.v);
      $$1.a("raining", this.u);
      $$1.a("thunderTime", this.x);
      $$1.a("thundering", this.w);
      $$1.a("hardcore", this.f.c());
      $$1.a("allowCommands", this.f.e());
      $$1.a("initialized", this.y);
      this.A.a($$1);
      $$1.a("Difficulty", (byte)this.f.d().a());
      $$1.a("DifficultyLocked", this.z);
      $$1.a("GameRules", (qc)this.f.f().a());
      $$1.a("DragonFight", (qc)this.B);
      if ($$2 != null) {
         $$1.a("Player", (qc)$$2);
      }

      cgl.b.encodeStart(pu.a, this.f.g()).result().ifPresent($$1x -> $$1.a("DataPacks", $$1x));
      if (this.C != null) {
         $$1.a("CustomBossEvents", (qc)this.C);
      }

      $$1.a("ScheduledEvents", (qc)this.I.b());
      $$1.a("WanderingTraderSpawnDelay", this.D);
      $$1.a("WanderingTraderSpawnChance", this.E);
      if (this.F != null) {
         $$1.a("WanderingTraderId", this.F);
      }

   }

   @Override
   public int a() {
      return this.i;
   }

   @Override
   public int b() {
      return this.j;
   }

   @Override
   public int c() {
      return this.k;
   }

   @Override
   public float d() {
      return this.l;
   }

   @Override
   public long e() {
      return this.m;
   }

   @Override
   public long f() {
      return this.n;
   }

   private void J() {
      if (!this.q && this.r != null) {
         if (this.p < ab.b().getWorldVersion()) {
            if (this.o == null) {
               throw (NullPointerException)ad.c(new NullPointerException("Fixer Upper not set inside LevelData, and the player tag is not upgraded."));
            }

            this.r = pv.a(this.o, ani.b, this.r, this.p);
         }

         this.q = true;
      }
   }

   @Override
   public pj y() {
      this.J();
      return this.r;
   }

   @Override
   public void b(int $$0) {
      this.i = $$0;
   }

   @Override
   public void c(int $$0) {
      this.j = $$0;
   }

   @Override
   public void d(int $$0) {
      this.k = $$0;
   }

   @Override
   public void a(float $$0) {
      this.l = $$0;
   }

   @Override
   public void a(long $$0) {
      this.m = $$0;
   }

   @Override
   public void b(long $$0) {
      this.n = $$0;
   }

   @Override
   public void a(gt $$0, float $$1) {
      this.i = $$0.u();
      this.j = $$0.v();
      this.k = $$0.w();
      this.l = $$1;
   }

   @Override
   public String g() {
      return this.f.a();
   }

   @Override
   public int z() {
      return this.s;
   }

   @Override
   public int h() {
      return this.t;
   }

   @Override
   public void a(int $$0) {
      this.t = $$0;
   }

   @Override
   public boolean i() {
      return this.w;
   }

   @Override
   public void a(boolean $$0) {
      this.w = $$0;
   }

   @Override
   public int j() {
      return this.x;
   }

   @Override
   public void e(int $$0) {
      this.x = $$0;
   }

   @Override
   public boolean k() {
      return this.u;
   }

   @Override
   public void b(boolean $$0) {
      this.u = $$0;
   }

   @Override
   public int l() {
      return this.v;
   }

   @Override
   public void f(int $$0) {
      this.v = $$0;
   }

   @Override
   public cgu m() {
      return this.f.b();
   }

   @Override
   public void a(cgu $$0) {
      this.f = this.f.a($$0);
   }

   @Override
   public boolean n() {
      return this.f.c();
   }

   @Override
   public boolean o() {
      return this.f.e();
   }

   @Override
   public boolean p() {
      return this.y;
   }

   @Override
   public void c(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public cgt q() {
      return this.f.f();
   }

   @Override
   public cxe.c r() {
      return this.A;
   }

   @Override
   public void a(cxe.c $$0) {
      this.A = $$0;
   }

   @Override
   public bag s() {
      return this.f.d();
   }

   @Override
   public void a(bag $$0) {
      this.f = this.f.a($$0);
   }

   @Override
   public boolean t() {
      return this.z;
   }

   @Override
   public void d(boolean $$0) {
      this.z = $$0;
   }

   @Override
   public dwi<MinecraftServer> u() {
      return this.I;
   }

   @Override
   public void a(r $$0, cgz $$1) {
      drv.super.a($$0, $$1);
      drw.super.a($$0);
   }

   @Override
   public dbm A() {
      return this.g;
   }

   @Override
   public Lifecycle B() {
      return this.h;
   }

   @Override
   public pj C() {
      return this.B;
   }

   @Override
   public void a(pj $$0) {
      this.B = $$0;
   }

   @Override
   public cgl D() {
      return this.f.g();
   }

   @Override
   public void a(cgl $$0) {
      this.f = this.f.a($$0);
   }

   @Nullable
   @Override
   public pj E() {
      return this.C;
   }

   @Override
   public void b(@Nullable pj $$0) {
      this.C = $$0;
   }

   @Override
   public int v() {
      return this.D;
   }

   @Override
   public void g(int $$0) {
      this.D = $$0;
   }

   @Override
   public int w() {
      return this.E;
   }

   @Override
   public void h(int $$0) {
      this.E = $$0;
   }

   @Nullable
   @Override
   public UUID x() {
      return this.F;
   }

   @Override
   public void a(UUID $$0) {
      this.F = $$0;
   }

   @Override
   public void a(String $$0, boolean $$1) {
      this.G.add($$0);
      this.H |= $$1;
   }

   @Override
   public boolean F() {
      return this.H;
   }

   @Override
   public Set<String> G() {
      return ImmutableSet.copyOf(this.G);
   }

   @Override
   public drv H() {
      return this;
   }

   @Override
   public chb I() {
      return this.f.h();
   }
}
