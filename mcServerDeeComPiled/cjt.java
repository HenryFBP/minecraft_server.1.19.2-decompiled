import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjt extends cvn implements cgw {
   private static final Logger a = LogUtils.getLogger();
   private final hc.c<cjt> b = hm.V.e(this);
   public static final hg<cvo> o = new hg<>();
   private static final LoadingCache<dxj, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<dxj, Boolean>() {
      public Boolean a(dxj $$0) {
         return !dxg.c(dxg.b(), $$0, dwu.g);
      }
   });
   public static final int p = 1;
   public static final int q = 2;
   public static final int r = 4;
   public static final int s = 8;
   public static final int t = 16;
   public static final int u = 32;
   public static final int v = 64;
   public static final int w = 128;
   public static final int x = 4;
   public static final int y = 3;
   public static final int z = 11;
   public static final float A = -1.0F;
   public static final float B = 0.0F;
   public static final int C = 512;
   protected final cvp<cjt, cvo> D;
   private cvo d;
   @Nullable
   private String e;
   @Nullable
   private cat f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cjt.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cjt.a> $$0 = new Object2ByteLinkedOpenHashMap<cjt.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   public static int i(@Nullable cvo $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = o.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static cvo a(int $$0) {
      cvo $$1 = o.a($$0);
      return $$1 == null ? cju.a.m() : $$1;
   }

   public static cjt a(@Nullable cat $$0) {
      return $$0 instanceof byx ? ((byx)$$0).e() : cju.a;
   }

   public static cvo a(cvo $$0, cvo $$1, cgy $$2, gt $$3) {
      dxj $$4 = dxg.b($$0.k($$2, $$3), $$1.k($$2, $$3), dwu.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.b()) {
         return $$1;
      } else {
         for(bbn $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = dxg.a(gy.a.b, $$6.cy().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.b($$6.df(), $$6.dh() + 1.0 + $$7, $$6.dl());
         }

         return $$1;
      }
   }

   public static dxj a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return dxg.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static cvo b(cvo $$0, cgy $$1, gt $$2) {
      cvo $$3 = $$0;
      gt.a $$4 = new gt.a();

      for(gy $$5 : aE) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(cvo $$0, cvo $$1, cgy $$2, gt $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(cvo $$0, cvo $$1, cgy $$2, gt $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.h()) {
            if (!$$2.k_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }

   }

   public cjt(cvn.c $$0) {
      super($$0);
      cvp.a<cjt, cvo> $$1 = new cvp.a<>(this);
      this.a($$1);
      this.D = $$1.a(cjt::m, cvo::new);
      this.k(this.D.b());
      if (ab.aL) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }

   }

   public static boolean j(cvo $$0) {
      return $$0.b() instanceof cnt || $$0.a(cju.gU) || $$0.a(cju.do) || $$0.a(cju.dp) || $$0.a(cju.eh) || $$0.a(cju.de) || $$0.a(akl.aI);
   }

   public boolean e_(cvo $$0) {
      return this.aI;
   }

   public static boolean a(cvo $$0, cgd $$1, gt $$2, gy $$3, gt $$4) {
      cvo $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.m()) {
         cjt.a $$6 = new cjt.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cjt.a> $$7 = (Object2ByteLinkedOpenHashMap)h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            dxj $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.b()) {
               return true;
            } else {
               dxj $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = dxg.c($$9, $$10, dwu.e);
               if ($$7.size() == 2048) {
                  $$7.removeLastByte();
               }

               $$7.putAndMoveToFirst($$6, (byte)($$11 ? 1 : 0));
               return $$11;
            }
         }
      } else {
         return true;
      }
   }

   public static boolean c(cgd $$0, gt $$1) {
      return $$0.a_($$1).a($$0, $$1, gy.b, crm.c);
   }

   public static boolean a(cha $$0, gt $$1, gy $$2) {
      cvo $$3 = $$0.a_($$1);
      return $$2 == gy.a && $$3.a(akl.aQ) ? false : $$3.a($$0, $$1, $$2, crm.b);
   }

   public static boolean a(dxj $$0, gy $$1) {
      dxj $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(dxj $$0) {
      return c.getUnchecked($$0);
   }

   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return !a($$0.j($$1, $$2)) && $$0.p().c();
   }

   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
   }

   public void a(cgy $$0, gt $$1, cvo $$2) {
   }

   public static List<cax> a(cvo $$0, agg $$1, gt $$2, @Nullable cti $$3) {
      dsd.a $$4 = new dsd.a($$1).a($$1.w).a(dul.f, dwq.a($$2)).a(dul.i, cax.b).b(dul.h, $$3);
      return $$0.a($$4);
   }

   public static List<cax> a(cvo $$0, agg $$1, gt $$2, @Nullable cti $$3, @Nullable bbn $$4, cax $$5) {
      dsd.a $$6 = new dsd.a($$1).a($$1.w).a(dul.f, dwq.a($$2)).a(dul.i, $$5).b(dul.a, $$4).b(dul.h, $$3);
      return $$0.a($$6);
   }

   public static void b(cvo $$0, dsd.a $$1) {
      agg $$2 = $$1.a();
      gt $$3 = new gt($$1.a(dul.f));
      $$0.a($$1).forEach($$2x -> a((cgx)$$2, $$3, $$2x));
      $$0.a($$2, $$3, cax.b, true);
   }

   public static void c(cvo $$0, cgx $$1, gt $$2) {
      if ($$1 instanceof agg) {
         a($$0, (agg)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((agg)$$1, $$2, cax.b, true);
      }

   }

   public static void a(cvo $$0, cgy $$1, gt $$2, @Nullable cti $$3) {
      if ($$1 instanceof agg) {
         a($$0, (agg)$$1, $$2, $$3).forEach($$2x -> a((cgx)((agg)$$1), $$2, $$2x));
         $$0.a((agg)$$1, $$2, cax.b, true);
      }

   }

   public static void a(cvo $$0, cgx $$1, gt $$2, @Nullable cti $$3, bbn $$4, cax $$5) {
      if ($$1 instanceof agg) {
         a($$0, (agg)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((agg)$$1, $$2, $$5, true);
      }

   }

   public static void a(cgx $$0, gt $$1, cax $$2) {
      float $$3 = bbr.T.l() / 2.0F;
      double $$4 = (double)((float)$$1.u() + 0.5F) + ami.a($$0.w, -0.25, 0.25);
      double $$5 = (double)((float)$$1.v() + 0.5F) + ami.a($$0.w, -0.25, 0.25) - (double)$$3;
      double $$6 = (double)((float)$$1.w() + 0.5F) + ami.a($$0.w, -0.25, 0.25);
      a($$0, () -> new bqv($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cgx $$0, gt $$1, gy $$2, cax $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      float $$7 = bbr.T.k() / 2.0F;
      float $$8 = bbr.T.l() / 2.0F;
      double $$9 = (double)((float)$$1.u() + 0.5F) + ($$4 == 0 ? ami.a($$0.w, -0.25, 0.25) : (double)((float)$$4 * (0.5F + $$7)));
      double $$10 = (double)((float)$$1.v() + 0.5F) + ($$5 == 0 ? ami.a($$0.w, -0.25, 0.25) : (double)((float)$$5 * (0.5F + $$8))) - (double)$$8;
      double $$11 = (double)((float)$$1.w() + 0.5F) + ($$6 == 0 ? ami.a($$0.w, -0.25, 0.25) : (double)((float)$$6 * (0.5F + $$7)));
      double $$12 = $$4 == 0 ? ami.a($$0.w, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ami.a($$0.w, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ami.a($$0.w, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new bqv($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cgx $$0, Supplier<bqv> $$1, cax $$2) {
      if (!$$0.y && !$$2.b() && $$0.W().b(cgt.g)) {
         bqv $$3 = (bqv)$$1.get();
         $$3.o();
         $$0.b($$3);
      }
   }

   protected void a(agg $$0, gt $$1, int $$2) {
      if ($$0.W().b(cgt.g)) {
         bbt.a($$0, dwq.a($$1), $$2);
      }

   }

   public float e() {
      return this.aH;
   }

   public void a(cgx $$0, gt $$1, cgp $$2) {
   }

   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
   }

   @Nullable
   public cvo a(ccx $$0) {
      return this.m();
   }

   public void a(cgx $$0, buc $$1, gt $$2, cvo $$3, @Nullable cti $$4, cax $$5) {
      $$1.b(akg.a.b(this));
      $$1.u(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
   }

   public boolean Y_() {
      return !this.aF.b() && !this.aF.a();
   }

   public sb f() {
      return rq.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ad.a("block", hm.V.b(this));
      }

      return this.e;
   }

   public void a(cgx $$0, cvo $$1, gt $$2, bbn $$3, float $$4) {
      $$3.a($$4, 1.0F, baw.k);
   }

   public void a(cgd $$0, bbn $$1) {
      $$1.f($$1.dd().d(1.0, 0.0, 1.0));
   }

   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax(this);
   }

   public void a(bzj $$0, hi<cax> $$1) {
      $$1.add(new cax(this));
   }

   public float h() {
      return this.aK;
   }

   public float i() {
      return this.aL;
   }

   public float j() {
      return this.aM;
   }

   protected void a(cgx $$0, buc $$1, gt $$2, cvo $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(akl.aN)) {
         bst.a($$3, false);
      }

      $$0.a(czv.f, $$1, czv.a.a($$3, $$2));
   }

   public void a(cvo $$0, cgx $$1, gt $$2, cht.c $$3) {
   }

   public boolean a(cgp $$0) {
      return true;
   }

   protected void a(cvp.a<cjt, cvo> $$0) {
   }

   public cvp<cjt, cvo> k() {
      return this.D;
   }

   protected final void k(cvo $$0) {
      this.d = $$0;
   }

   public final cvo m() {
      return this.d;
   }

   public final cvo l(cvo $$0) {
      cvo $$1 = this.m();

      for(cwr<?> $$2 : $$0.b().k().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> cvo a(cvo $$0, cvo $$1, cwr<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public cqw m(cvo $$0) {
      return this.aJ;
   }

   @Override
   public cat l() {
      if (this.f == null) {
         this.f = cat.a(this);
      }

      return this.f;
   }

   public boolean n() {
      return this.aN;
   }

   public String toString() {
      return "Block{" + hm.V.b(this) + "}";
   }

   public void a(cax $$0, @Nullable cgd $$1, List<rq> $$2, ccl $$3) {
   }

   @Override
   protected cjt o() {
      return this;
   }

   protected ImmutableMap<cvo, dxj> a(Function<cvo, dxj> $$0) {
      return (ImmutableMap<cvo, dxj>)this.D.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public hc.c<cjt> p() {
      return this.b;
   }

   protected void a(agg $$0, gt $$1, cax $$2, azo $$3) {
      if (cet.a(cev.v, $$2) == 0) {
         int $$4 = $$3.a($$0.w);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }

   }

   public static final class a {
      private final cvo a;
      private final cvo b;
      private final gy c;

      public a(cvo $$0, cvo $$1, gy $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if (!($$0 instanceof cjt.a)) {
            return false;
         } else {
            cjt.a $$1 = (cjt.a)$$0;
            return this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
