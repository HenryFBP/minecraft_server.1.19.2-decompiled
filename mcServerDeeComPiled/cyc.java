import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyc extends cxj {
   @Nullable
   private volatile dpm l;
   private volatile cxn m = cxn.c;
   private final List<pj> n = Lists.newArrayList();
   private final List<gt> o = Lists.newArrayList();
   private final Map<dan.a, cxi> p = new Object2ObjectArrayMap();
   @Nullable
   private daf q;
   private final dxy<cjt> r;
   private final dxy<dpu> s;

   public cyc(cge $$0, cyf $$1, cgz $$2, hm<cht> $$3, @Nullable dbs $$4) {
      this($$0, $$1, null, new dxy<>(), new dxy<>(), $$2, $$3, $$4);
   }

   public cyc(cge $$0, cyf $$1, @Nullable cxu[] $$2, dxy<cjt> $$3, dxy<dpu> $$4, cgz $$5, hm<cht> $$6, @Nullable dbs $$7) {
      super($$0, $$1, $$5, $$6, 0L, $$2, $$7);
      this.r = $$3;
      this.s = $$4;
   }

   @Override
   public dyd<cjt> o() {
      return this.r;
   }

   @Override
   public dyd<dpu> p() {
      return this.s;
   }

   @Override
   public cxj.a q() {
      return new cxj.a(this.r, this.s);
   }

   @Override
   public cvo a_(gt $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return cju.lM.m();
      } else {
         cxu $$2 = this.b(this.e($$1));
         return $$2.c() ? cju.a.m() : $$2.a($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public dpv b_(gt $$0) {
      int $$1 = $$0.v();
      if (this.d($$1)) {
         return dpw.a.h();
      } else {
         cxu $$2 = this.b(this.e($$1));
         return $$2.c() ? dpw.a.h() : $$2.b($$0.u() & 15, $$1 & 15, $$0.w() & 15);
      }
   }

   @Override
   public Stream<gt> n() {
      return this.o.stream();
   }

   public ShortList[] B() {
      ShortList[] $$0 = new ShortList[this.ai()];

      for(gt $$1 : this.o) {
         cxj.a($$0, this.e($$1.v())).add(k($$1));
      }

      return $$0;
   }

   public void b(short $$0, int $$1) {
      this.j(a($$0, this.g($$1), this.c));
   }

   public void j(gt $$0) {
      this.o.add($$0.h());
   }

   @Nullable
   @Override
   public cvo a(gt $$0, cvo $$1, boolean $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      if ($$4 >= this.u_() && $$4 < this.ah()) {
         int $$6 = this.e($$4);
         if (this.k[$$6].c() && $$1.a(cju.a)) {
            return $$1;
         } else {
            if ($$1.g() > 0) {
               this.o.add(new gt(($$3 & 15) + this.f().d(), $$4, ($$5 & 15) + this.f().e()));
            }

            cxu $$7 = this.b($$6);
            cvo $$8 = $$7.a($$3 & 15, $$4 & 15, $$5 & 15, $$1);
            if (this.m.b(cxn.k) && $$1 != $$8 && ($$1.b(this, $$0) != $$8.b(this, $$0) || $$1.g() != $$8.g() || $$1.f() || $$8.f())) {
               this.l.a($$0);
            }

            EnumSet<dar.a> $$9 = this.j().h();
            EnumSet<dar.a> $$10 = null;

            for(dar.a $$11 : $$9) {
               dar $$12 = (dar)this.g.get($$11);
               if ($$12 == null) {
                  if ($$10 == null) {
                     $$10 = EnumSet.noneOf(dar.a.class);
                  }

                  $$10.add($$11);
               }
            }

            if ($$10 != null) {
               dar.a(this, $$10);
            }

            for(dar.a $$13 : $$9) {
               ((dar)this.g.get($$13)).a($$3 & 15, $$4, $$5 & 15, $$1);
            }

            return $$8;
         }
      } else {
         return cju.lM.m();
      }
   }

   @Override
   public void a(cti $$0) {
      this.i.put($$0.p(), $$0);
   }

   @Nullable
   @Override
   public cti c_(gt $$0) {
      return (cti)this.i.get($$0);
   }

   public Map<gt, cti> C() {
      return this.i;
   }

   public void b(pj $$0) {
      this.n.add($$0);
   }

   @Override
   public void a(bbn $$0) {
      if (!$$0.bI()) {
         pj $$1 = new pj();
         $$0.e($$1);
         this.b($$1);
      }
   }

   @Override
   public void a(dlb $$0, dlj $$1) {
      daf $$2 = this.x();
      if ($$2 != null && $$1.b()) {
         dkt $$3 = $$1.a();
         cgz $$4 = this.z();
         if ($$3.h() < $$4.u_() || $$3.k() >= $$4.ah()) {
            return;
         }
      }

      super.a($$0, $$1);
   }

   public List<pj> D() {
      return this.n;
   }

   @Override
   public cxn j() {
      return this.m;
   }

   public void a(cxn $$0) {
      this.m = $$0;
      if (this.q != null && $$0.b(this.q.a())) {
         this.a(null);
      }

      this.a(true);
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2) {
      if (!this.j().b(cxn.f) && (this.q == null || !this.q.a().b(cxn.f))) {
         throw new IllegalStateException("Asking for biomes before we have biomes");
      } else {
         return super.getNoiseBiome($$0, $$1, $$2);
      }
   }

   public static short k(gt $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      int $$4 = $$1 & 15;
      int $$5 = $$2 & 15;
      int $$6 = $$3 & 15;
      return (short)($$4 | $$5 << 4 | $$6 << 8);
   }

   public static gt a(short $$0, int $$1, cge $$2) {
      int $$3 = hq.a($$2.e, $$0 & 15);
      int $$4 = hq.a($$1, $$0 >>> 4 & 15);
      int $$5 = hq.a($$2.f, $$0 >>> 8 & 15);
      return new gt($$3, $$4, $$5);
   }

   @Override
   public void e(gt $$0) {
      if (!this.v($$0)) {
         cxj.a(this.a, this.e($$0.v())).add(k($$0));
      }

   }

   @Override
   public void a(short $$0, int $$1) {
      cxj.a(this.a, $$1).add($$0);
   }

   public Map<gt, pj> E() {
      return Collections.unmodifiableMap(this.h);
   }

   @Nullable
   @Override
   public pj g(gt $$0) {
      cti $$1 = this.c_($$0);
      return $$1 != null ? $$1.m() : (pj)this.h.get($$0);
   }

   @Override
   public void d(gt $$0) {
      this.i.remove($$0);
      this.h.remove($$0);
   }

   @Nullable
   public cxi a(dan.a $$0) {
      return (cxi)this.p.get($$0);
   }

   public cxi b(dan.a $$0) {
      return (cxi)this.p.computeIfAbsent($$0, $$0x -> new cxi(this.v_(), this.u_()));
   }

   public void a(dan.a $$0, cxi $$1) {
      this.p.put($$0, $$1);
   }

   public void a(dpm $$0) {
      this.l = $$0;
   }

   public void a(@Nullable daf $$0) {
      this.q = $$0;
   }

   @Nullable
   @Override
   public daf x() {
      return this.q;
   }

   private static <T> dxv<T> a(dxy<T> $$0) {
      return new dxv<>($$0.b());
   }

   public dxv<cjt> F() {
      return a(this.r);
   }

   public dxv<dpu> G() {
      return a(this.s);
   }

   @Override
   public cgz z() {
      return (cgz)(this.y() ? daf.b : this);
   }
}
