import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cxj implements cgd, chv.a, cye {
   private static final Logger l = LogUtils.getLogger();
   private static final LongSet m = new LongOpenHashSet();
   protected final ShortList[] a;
   protected volatile boolean b;
   private volatile boolean n;
   protected final cge c;
   private long o;
   @Nullable
   @Deprecated
   private chu p;
   @Nullable
   protected dav d;
   protected final cyf e;
   @Nullable
   protected dbs f;
   protected final Map<dar.a, dar> g = Maps.newEnumMap(dar.a.class);
   private final Map<dlb, dlj> q = Maps.newHashMap();
   private final Map<dlb, LongSet> r = Maps.newHashMap();
   protected final Map<gt, pj> h = Maps.newHashMap();
   protected final Map<gt, cti> i = Maps.newHashMap();
   protected final cgz j;
   protected final cxu[] k;

   public cxj(cge $$0, cyf $$1, cgz $$2, hm<cht> $$3, long $$4, @Nullable cxu[] $$5, @Nullable dbs $$6) {
      this.c = $$0;
      this.e = $$1;
      this.j = $$2;
      this.k = new cxu[$$2.ai()];
      this.o = $$4;
      this.a = new ShortList[$$2.ai()];
      this.f = $$6;
      if ($$5 != null) {
         if (this.k.length == $$5.length) {
            System.arraycopy($$5, 0, this.k, 0, this.k.length);
         } else {
            l.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.k.length);
         }
      }

      a($$2, $$3, this.k);
   }

   private static void a(cgz $$0, hm<cht> $$1, cxu[] $$2) {
      for(int $$3 = 0; $$3 < $$2.length; ++$$3) {
         if ($$2[$$3] == null) {
            $$2[$$3] = new cxu($$0.g($$3), $$1);
         }
      }

   }

   public czw a(int $$0) {
      return czw.a;
   }

   @Nullable
   public abstract cvo a(gt var1, cvo var2, boolean var3);

   public abstract void a(cti var1);

   public abstract void a(bbn var1);

   @Nullable
   public cxu a() {
      cxu[] $$0 = this.d();

      for(int $$1 = $$0.length - 1; $$1 >= 0; --$$1) {
         cxu $$2 = $$0[$$1];
         if (!$$2.c()) {
            return $$2;
         }
      }

      return null;
   }

   public int b() {
      cxu $$0 = this.a();
      return $$0 == null ? this.u_() : $$0.g();
   }

   public Set<gt> c() {
      Set<gt> $$0 = Sets.newHashSet(this.h.keySet());
      $$0.addAll(this.i.keySet());
      return $$0;
   }

   public cxu[] d() {
      return this.k;
   }

   public cxu b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dar.a, dar>> e() {
      return Collections.unmodifiableSet(this.g.entrySet());
   }

   public void a(dar.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dar a(dar.a $$0) {
      return (dar)this.g.computeIfAbsent($$0, $$0x -> new dar(this, $$0x));
   }

   public boolean b(dar.a $$0) {
      return this.g.get($$0) != null;
   }

   public int a(dar.a $$0, int $$1, int $$2) {
      dar $$3 = (dar)this.g.get($$0);
      if ($$3 == null) {
         if (ab.aL && this instanceof cxt) {
            l.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dar.a(this, EnumSet.of($$0));
         $$3 = (dar)this.g.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cge f() {
      return this.c;
   }

   @Nullable
   @Override
   public dlj a(dlb $$0) {
      return (dlj)this.q.get($$0);
   }

   @Override
   public void a(dlb $$0, dlj $$1) {
      this.q.put($$0, $$1);
      this.b = true;
   }

   public Map<dlb, dlj> g() {
      return Collections.unmodifiableMap(this.q);
   }

   public void a(Map<dlb, dlj> $$0) {
      this.q.clear();
      this.q.putAll($$0);
      this.b = true;
   }

   @Override
   public LongSet b(dlb $$0) {
      return (LongSet)this.r.getOrDefault($$0, m);
   }

   @Override
   public void a(dlb $$0, long $$1) {
      ((LongSet)this.r.computeIfAbsent($$0, $$0x -> new LongOpenHashSet())).add($$1);
      this.b = true;
   }

   @Override
   public Map<dlb, LongSet> h() {
      return Collections.unmodifiableMap(this.r);
   }

   @Override
   public void b(Map<dlb, LongSet> $$0) {
      this.r.clear();
      this.r.putAll($$0);
      this.b = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.u_()) {
         $$0 = this.u_();
      }

      if ($$1 >= this.ah()) {
         $$1 = this.ah() - 1;
      }

      for(int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.e($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean i() {
      return this.b;
   }

   public abstract cxn j();

   public abstract void d(gt var1);

   public void e(gt $$0) {
      l.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] m() {
      return this.a;
   }

   public void a(short $$0, int $$1) {
      a(this.m(), $$1).add($$0);
   }

   public void a(pj $$0) {
      this.h.put(cti.c($$0), $$0);
   }

   @Nullable
   public pj f(gt $$0) {
      return (pj)this.h.get($$0);
   }

   @Nullable
   public abstract pj g(gt var1);

   public abstract Stream<gt> n();

   public abstract dyd<cjt> o();

   public abstract dyd<dpu> p();

   public abstract cxj.a q();

   public cyf r() {
      return this.e;
   }

   public boolean s() {
      return this.f != null;
   }

   @Nullable
   public dbs t() {
      return this.f;
   }

   public void a(dbs $$0) {
      this.f = $$0;
   }

   public long u() {
      return this.o;
   }

   public void a(long $$0) {
      this.o += $$0;
   }

   public void b(long $$0) {
      this.o = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean v() {
      return this.n;
   }

   public void b(boolean $$0) {
      this.n = $$0;
      this.a(true);
   }

   @Override
   public int u_() {
      return this.j.u_();
   }

   @Override
   public int v_() {
      return this.j.v_();
   }

   public dav a(Function<cxj, dav> $$0) {
      if (this.d == null) {
         this.d = (dav)$$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public chu a(Supplier<chu> $$0) {
      if (this.p == null) {
         this.p = (chu)$$0.get();
      }

      return this.p;
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = hl.a(this.u_());
         int $$4 = $$3 + hl.a(this.v_()) - 1;
         int $$5 = ami.a($$1, $$3, $$4);
         int $$6 = this.e(hl.c($$5));
         return this.k[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         q $$8 = q.a(var8, "Getting biome");
         r $$9 = $$8.a("Biome being got");
         $$9.a("Location", (s<String>)(() -> r.a(this, $$0, $$1, $$2)));
         throw new z($$8);
      }
   }

   public void a(chw $$0, cic.f $$1) {
      cge $$2 = this.f();
      int $$3 = hl.a($$2.d());
      int $$4 = hl.a($$2.e());
      cgz $$5 = this.z();

      for(int $$6 = $$5.aj(); $$6 < $$5.ak(); ++$$6) {
         cxu $$7 = this.b(this.f($$6));
         $$7.a($$0, $$1, $$3, $$4);
      }

   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public daf x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cgz z() {
      return this;
   }

   public static record a(dyb<cjt> a, dyb<dpu> b) {
   }
}
