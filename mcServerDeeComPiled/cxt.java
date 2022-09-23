import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cxt extends cxj {
   static final Logger l = LogUtils.getLogger();
   private static final cur m = new cur() {
      @Override
      public void a() {
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public gt c() {
         return gt.b;
      }

      @Override
      public String d() {
         return "<null>";
      }
   };
   private final Map<gt, cxt.d> n = Maps.newHashMap();
   private boolean o;
   private boolean p = false;
   final cgx q;
   @Nullable
   private Supplier<afs.c> r;
   @Nullable
   private cxt.c s;
   private final Int2ObjectMap<czw> t;
   private final dxv<cjt> u;
   private final dxv<dpu> v;

   public cxt(cgx $$0, cge $$1) {
      this($$0, $$1, cyf.a, new dxv<>(), new dxv<>(), 0L, null, null, null);
   }

   public cxt(cgx $$0, cge $$1, cyf $$2, dxv<cjt> $$3, dxv<dpu> $$4, long $$5, @Nullable cxu[] $$6, @Nullable cxt.c $$7, @Nullable dbs $$8) {
      super($$1, $$2, $$0, $$0.s().d(hm.aR), $$5, $$6, $$8);
      this.q = $$0;
      this.t = new Int2ObjectOpenHashMap();

      for(dar.a $$9 : dar.a.values()) {
         if (cxn.o.h().contains($$9)) {
            this.g.put($$9, new dar(this, $$9));
         }
      }

      this.s = $$7;
      this.u = $$3;
      this.v = $$4;
   }

   public cxt(agg $$0, cyc $$1, @Nullable cxt.c $$2) {
      this($$0, $$1.f(), $$1.r(), $$1.F(), $$1.G(), $$1.u(), $$1.d(), $$2, $$1.t());

      for(cti $$3 : $$1.C().values()) {
         this.a($$3);
      }

      this.h.putAll($$1.E());

      for(int $$4 = 0; $$4 < $$1.m().length; ++$$4) {
         this.a[$$4] = $$1.m()[$$4];
      }

      this.a($$1.g());
      this.b($$1.h());

      for(Entry<dar.a, dar> $$5 : $$1.e()) {
         if (cxn.o.h().contains($$5.getKey())) {
            this.a((dar.a)$$5.getKey(), ((dar)$$5.getValue()).a());
         }
      }

      this.b($$1.v());
      this.b = true;
   }

   @Override
   public dyd<cjt> o() {
      return this.u;
   }

   @Override
   public dyd<dpu> p() {
      return this.v;
   }

   @Override
   public cxj.a q() {
      return new cxj.a(this.u, this.v);
   }

   @Override
   public czw a(int $$0) {
      cgx var3 = this.q;
      return var3 instanceof agg $$1 ? (czw)this.t.computeIfAbsent($$0, $$1x -> new czu($$1)) : super.a($$0);
   }

   @Override
   public cvo a_(gt $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.q.ae()) {
         cvo $$4 = null;
         if ($$2 == 60) {
            $$4 = cju.gU.m();
         }

         if ($$2 == 70) {
            $$4 = dai.a($$1, $$3);
         }

         return $$4 == null ? cju.a.m() : $$4;
      } else {
         try {
            int $$5 = this.e($$2);
            if ($$5 >= 0 && $$5 < this.k.length) {
               cxu $$6 = this.k[$$5];
               if (!$$6.c()) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return cju.a.m();
         } catch (Throwable var8) {
            q $$8 = q.a(var8, "Getting block state");
            r $$9 = $$8.a("Block being got");
            $$9.a("Location", (s<String>)(() -> r.a(this, $$1, $$2, $$3)));
            throw new z($$8);
         }
      }
   }

   @Override
   public dpv b_(gt $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public dpv a(int $$0, int $$1, int $$2) {
      try {
         int $$3 = this.e($$1);
         if ($$3 >= 0 && $$3 < this.k.length) {
            cxu $$4 = this.k[$$3];
            if (!$$4.c()) {
               return $$4.b($$0 & 15, $$1 & 15, $$2 & 15);
            }
         }

         return dpw.a.h();
      } catch (Throwable var7) {
         q $$6 = q.a(var7, "Getting fluid state");
         r $$7 = $$6.a("Block being got");
         $$7.a("Location", (s<String>)(() -> r.a(this, $$0, $$1, $$2)));
         throw new z($$6);
      }
   }

   @Nullable
   @Override
   public cvo a(gt $$0, cvo $$1, boolean $$2) {
      int $$3 = $$0.v();
      cxu $$4 = this.b(this.e($$3));
      boolean $$5 = $$4.c();
      if ($$5 && $$1.h()) {
         return null;
      } else {
         int $$6 = $$0.u() & 15;
         int $$7 = $$3 & 15;
         int $$8 = $$0.w() & 15;
         cvo $$9 = $$4.a($$6, $$7, $$8, $$1);
         if ($$9 == $$1) {
            return null;
         } else {
            cjt $$10 = $$1.b();
            ((dar)this.g.get(dar.a.e)).a($$6, $$3, $$8, $$1);
            ((dar)this.g.get(dar.a.f)).a($$6, $$3, $$8, $$1);
            ((dar)this.g.get(dar.a.d)).a($$6, $$3, $$8, $$1);
            ((dar)this.g.get(dar.a.b)).a($$6, $$3, $$8, $$1);
            boolean $$11 = $$4.c();
            if ($$5 != $$11) {
               this.q.I().o().a($$0, $$11);
            }

            boolean $$12 = $$9.o();
            if (!this.q.y) {
               $$9.b(this.q, $$0, $$1, $$2);
            } else if (!$$9.a($$10) && $$12) {
               this.d($$0);
            }

            if (!$$4.a($$6, $$7, $$8).a($$10)) {
               return null;
            } else {
               if (!this.q.y) {
                  $$1.a(this.q, $$0, $$9, $$2);
               }

               if ($$1.o()) {
                  cti $$13 = this.a($$0, cxt.b.c);
                  if ($$13 == null) {
                     $$13 = ((cmb)$$10).a($$0, $$1);
                     if ($$13 != null) {
                        this.b($$13);
                     }
                  } else {
                     $$13.b($$1);
                     this.c($$13);
                  }
               }

               this.b = true;
               return $$9;
            }
         }
      }
   }

   @Deprecated
   @Override
   public void a(bbn $$0) {
   }

   @Nullable
   private cti j(gt $$0) {
      cvo $$1 = this.a_($$0);
      return !$$1.o() ? null : ((cmb)$$1.b()).a($$0, $$1);
   }

   @Nullable
   @Override
   public cti c_(gt $$0) {
      return this.a($$0, cxt.b.c);
   }

   @Nullable
   public cti a(gt $$0, cxt.b $$1) {
      cti $$2 = (cti)this.i.get($$0);
      if ($$2 == null) {
         pj $$3 = (pj)this.h.remove($$0);
         if ($$3 != null) {
            cti $$4 = this.a($$0, $$3);
            if ($$4 != null) {
               return $$4;
            }
         }
      }

      if ($$2 == null) {
         if ($$1 == cxt.b.a) {
            $$2 = this.j($$0);
            if ($$2 != null) {
               this.b($$2);
            }
         }
      } else if ($$2.r()) {
         this.i.remove($$0);
         return null;
      }

      return $$2;
   }

   public void b(cti $$0) {
      this.a($$0);
      if (this.J()) {
         cgx var3 = this.q;
         if (var3 instanceof agg $$1) {
            this.b($$0, $$1);
         }

         this.c($$0);
      }

   }

   private boolean J() {
      return this.o || this.q.k_();
   }

   boolean k(gt $$0) {
      if (!this.q.p_().a($$0)) {
         return false;
      } else {
         cgx var3 = this.q;
         if (!(var3 instanceof agg)) {
            return true;
         } else {
            agg $$1 = (agg)var3;
            return this.B().a(afs.c.c) && $$1.c(cge.a($$0));
         }
      }
   }

   @Override
   public void a(cti $$0) {
      gt $$1 = $$0.p();
      if (this.a_($$1).o()) {
         $$0.a(this.q);
         $$0.s();
         cti $$2 = (cti)this.i.put($$1.h(), $$0);
         if ($$2 != null && $$2 != $$0) {
            $$2.ab_();
         }

      }
   }

   @Nullable
   @Override
   public pj g(gt $$0) {
      cti $$1 = this.c_($$0);
      if ($$1 != null && !$$1.r()) {
         pj $$2 = $$1.m();
         $$2.a("keepPacked", false);
         return $$2;
      } else {
         pj $$3 = (pj)this.h.get($$0);
         if ($$3 != null) {
            $$3 = $$3.g();
            $$3.a("keepPacked", true);
         }

         return $$3;
      }
   }

   @Override
   public void d(gt $$0) {
      if (this.J()) {
         cti $$1 = (cti)this.i.remove($$0);
         if ($$1 != null) {
            cgx var4 = this.q;
            if (var4 instanceof agg $$2) {
               this.a($$1, $$2);
            }

            $$1.ab_();
         }
      }

      this.l($$0);
   }

   private <T extends cti> void a(T $$0, agg $$1) {
      cjt $$2 = $$0.q().b();
      if ($$2 instanceof cmb) {
         czx $$3 = ((cmb)$$2).a($$1, $$0);
         if ($$3 != null) {
            int $$4 = hq.a($$0.p().v());
            czw $$5 = this.a($$4);
            $$5.b($$3);
            if ($$5.a()) {
               this.t.remove($$4);
            }
         }
      }

   }

   private void l(gt $$0) {
      cxt.d $$1 = (cxt.d)this.n.remove($$0);
      if ($$1 != null) {
         $$1.a(m);
      }

   }

   public void C() {
      if (this.s != null) {
         this.s.run(this);
         this.s = null;
      }

   }

   public boolean A() {
      return false;
   }

   public void a(qx $$0, pj $$1, Consumer<un.b> $$2) {
      this.G();

      for(cxu $$3 : this.k) {
         $$3.a($$0);
      }

      for(dar.a $$4 : dar.a.values()) {
         String $$5 = $$4.a();
         if ($$1.b($$5, 12)) {
            this.a($$4, $$1.o($$5));
         }
      }

      $$2.accept((un.b)($$0x, $$1x, $$2x) -> {
         cti $$3 = this.a($$0x, cxt.b.a);
         if ($$3 != null && $$2x != null && $$3.v() == $$1x) {
            $$3.a($$2x);
         }

      });
   }

   public void c(boolean $$0) {
      this.o = $$0;
   }

   public cgx D() {
      return this.q;
   }

   public Map<gt, cti> E() {
      return this.i;
   }

   @Override
   public Stream<gt> n() {
      return StreamSupport.stream(gt.b(this.c.d(), this.u_(), this.c.e(), this.c.f(), this.ah() - 1, this.c.g()).spliterator(), false)
         .filter($$0 -> this.a_($$0).g() != 0);
   }

   public void F() {
      cge $$0 = this.f();

      for(int $$1 = 0; $$1 < this.a.length; ++$$1) {
         if (this.a[$$1] != null) {
            ShortListIterator $$7 = this.a[$$1].iterator();

            while($$7.hasNext()) {
               Short $$2 = (Short)$$7.next();
               gt $$3 = cyc.a($$2, this.g($$1), $$0);
               cvo $$4 = this.a_($$3);
               dpv $$5 = $$4.p();
               if (!$$5.c()) {
                  $$5.a(this.q, $$3);
               }

               if (!($$4.b() instanceof cnz)) {
                  cvo $$6 = cjt.b($$4, this.q, $$3);
                  this.q.a($$3, $$6, 20);
               }
            }

            this.a[$$1].clear();
         }
      }

      UnmodifiableIterator var9 = ImmutableList.copyOf(this.h.keySet()).iterator();

      while(var9.hasNext()) {
         gt $$7 = (gt)var9.next();
         this.c_($$7);
      }

      this.h.clear();
      this.e.a(this);
   }

   @Nullable
   private cti a(gt $$0, pj $$1) {
      cvo $$2 = this.a_($$0);
      cti $$3;
      if ("DUMMY".equals($$1.l("id"))) {
         if ($$2.o()) {
            $$3 = ((cmb)$$2.b()).a($$0, $$2);
         } else {
            $$3 = null;
            l.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", $$0, $$2);
         }
      } else {
         $$3 = cti.a($$0, $$2, $$1);
      }

      if ($$3 != null) {
         $$3.a(this.q);
         this.b($$3);
      } else {
         l.warn("Tried to load a block entity for block {} but failed at location {}", $$2, $$0);
      }

      return $$3;
   }

   public void c(long $$0) {
      this.u.a($$0);
      this.v.a($$0);
   }

   public void a(agg $$0) {
      $$0.l().a(this.c, this.u);
      $$0.m().a(this.c, this.v);
   }

   public void b(agg $$0) {
      $$0.l().a(this.c);
      $$0.m().a(this.c);
   }

   @Override
   public cxn j() {
      return cxn.o;
   }

   public afs.c B() {
      return this.r == null ? afs.c.b : (afs.c)this.r.get();
   }

   public void b(Supplier<afs.c> $$0) {
      this.r = $$0;
   }

   public void G() {
      this.i.values().forEach(cti::ab_);
      this.i.clear();
      this.n.values().forEach($$0 -> $$0.a(m));
      this.n.clear();
   }

   public void H() {
      this.i.values().forEach($$0 -> {
         cgx $$1 = this.q;
         if ($$1 instanceof agg $$2) {
            this.b($$0, $$2);
         }

         this.c($$0);
      });
   }

   private <T extends cti> void b(T $$0, agg $$1) {
      cjt $$2 = $$0.q().b();
      if ($$2 instanceof cmb) {
         czx $$3 = ((cmb)$$2).a($$1, $$0);
         if ($$3 != null) {
            czw $$4 = this.a(hq.a($$0.p().v()));
            $$4.a($$3);
         }
      }

   }

   private <T extends cti> void c(T $$0) {
      cvo $$1 = $$0.q();
      ctj<T> $$2 = $$1.a(this.q, $$0.v());
      if ($$2 == null) {
         this.l($$0.p());
      } else {
         this.n.compute($$0.p(), ($$2x, $$3) -> {
            cur $$4 = this.a($$0, $$2);
            if ($$3 != null) {
               $$3.a($$4);
               return $$3;
            } else if (this.J()) {
               cxt.d $$5 = new cxt.d($$4);
               this.q.a($$5);
               return $$5;
            } else {
               return null;
            }
         });
      }

   }

   private <T extends cti> cur a(T $$0, ctj<T> $$1) {
      return new cxt.a<>($$0, $$1);
   }

   public boolean I() {
      return this.p;
   }

   public void d(boolean $$0) {
      this.p = $$0;
   }

   class a<T extends cti> implements cur {
      private final T b;
      private final ctj<T> c;
      private boolean d;

      a(T $$0, ctj<T> $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         if (!this.b.r() && this.b.l()) {
            gt $$0 = this.b.p();
            if (cxt.this.k($$0)) {
               try {
                  awz $$1 = cxt.this.q.ac();
                  $$1.a(this::d);
                  cvo $$2 = cxt.this.a_($$0);
                  if (this.b.v().a($$2)) {
                     this.c.tick(cxt.this.q, this.b.p(), $$2, this.b);
                     this.d = false;
                  } else if (!this.d) {
                     this.d = true;
                     cxt.l.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                  }

                  $$1.c();
               } catch (Throwable var5) {
                  q $$4 = q.a(var5, "Ticking block entity");
                  r $$5 = $$4.a("Block entity being ticked");
                  this.b.a($$5);
                  throw new z($$4);
               }
            }
         }

      }

      @Override
      public boolean b() {
         return this.b.r();
      }

      @Override
      public gt c() {
         return this.b.p();
      }

      @Override
      public String d() {
         return ctk.a(this.b.v()).toString();
      }

      public String toString() {
         return "Level ticker for " + this.d() + "@" + this.c();
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   @FunctionalInterface
   public interface c {
      void run(cxt var1);
   }

   class d implements cur {
      private cur b;

      d(cur $$0) {
         this.b = $$0;
      }

      void a(cur $$0) {
         this.b = $$0;
      }

      @Override
      public void a() {
         this.b.a();
      }

      @Override
      public boolean b() {
         return this.b.b();
      }

      @Override
      public gt c() {
         return this.b.c();
      }

      @Override
      public String d() {
         return this.b.d();
      }

      public String toString() {
         return this.b.toString() + " <wrapped>";
      }
   }
}
