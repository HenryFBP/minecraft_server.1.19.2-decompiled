import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cvn {
   protected static final gy[] aE = new gy[]{gy.e, gy.f, gy.c, gy.d, gy.a, gy.b};
   protected final dpz aF;
   protected final boolean aG;
   protected final float aH;
   protected final boolean aI;
   protected final cqw aJ;
   protected final float aK;
   protected final float aL;
   protected final float aM;
   protected final boolean aN;
   protected final cvn.c aO;
   @Nullable
   protected abb aP;

   public cvn(cvn.c $$0) {
      this.aF = $$0.a;
      this.aG = $$0.c;
      this.aP = $$0.m;
      this.aH = $$0.f;
      this.aI = $$0.i;
      this.aJ = $$0.d;
      this.aK = $$0.j;
      this.aL = $$0.k;
      this.aM = $$0.l;
      this.aN = $$0.v;
      this.aO = $$0;
   }

   @Deprecated
   public void a(cvo $$0, cgy $$1, gt $$2, int $$3, int $$4) {
   }

   @Deprecated
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return !$$0.r($$1, $$2);
         case b:
            return $$1.b_($$2).a(akp.a);
         case c:
            return !$$0.r($$1, $$2);
         default:
            return false;
      }
   }

   @Deprecated
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$0;
   }

   @Deprecated
   public boolean a(cvo $$0, cvo $$1, gy $$2) {
      return false;
   }

   @Deprecated
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      xl.a($$1, $$2);
   }

   @Deprecated
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
   }

   @Deprecated
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if ($$0.o() && !$$0.a($$3.b())) {
         $$1.n($$2);
      }

   }

   @Deprecated
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      return baj.d;
   }

   @Deprecated
   public boolean a(cvo $$0, cgx $$1, gt $$2, int $$3, int $$4) {
      return false;
   }

   @Deprecated
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Deprecated
   public boolean g_(cvo $$0) {
      return false;
   }

   @Deprecated
   public boolean f_(cvo $$0) {
      return false;
   }

   @Deprecated
   public dqb d(cvo $$0) {
      return this.aF.g();
   }

   @Deprecated
   public dpv c_(cvo $$0) {
      return dpw.a.h();
   }

   @Deprecated
   public boolean d_(cvo $$0) {
      return false;
   }

   public float V_() {
      return 0.25F;
   }

   public float Z_() {
      return 0.2F;
   }

   @Deprecated
   public cvo a(cvo $$0, cpw $$1) {
      return $$0;
   }

   @Deprecated
   public cvo a(cvo $$0, coh $$1) {
      return $$0;
   }

   @Deprecated
   public boolean a(cvo $$0, ccx $$1) {
      return this.aF.e() && ($$1.n().b() || !$$1.n().a(this.l()));
   }

   @Deprecated
   public boolean a(cvo $$0, dpu $$1) {
      return this.aF.e() || !this.aF.b();
   }

   @Deprecated
   public List<cax> a(cvo $$0, dsd.a $$1) {
      abb $$2 = this.r();
      if ($$2 == dry.a) {
         return Collections.emptyList();
      } else {
         dsd $$3 = $$1.a(dul.g, $$0).a(duk.l);
         agg $$4 = $$3.c();
         dsg $$5 = $$4.n().aH().a($$2);
         return $$5.a($$3);
      }
   }

   @Deprecated
   public long a(cvo $$0, gt $$1) {
      return ami.a((hs)$$1);
   }

   @Deprecated
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return $$0.j($$1, $$2);
   }

   @Deprecated
   public dxj f(cvo $$0, cgd $$1, gt $$2) {
      return this.c($$0, $$1, $$2, dwv.a());
   }

   @Deprecated
   public dxj a(cvo $$0, cgd $$1, gt $$2) {
      return dxg.a();
   }

   @Deprecated
   public int g(cvo $$0, cgd $$1, gt $$2) {
      if ($$0.i($$1, $$2)) {
         return $$1.L();
      } else {
         return $$0.a($$1, $$2) ? 0 : 1;
      }
   }

   @Nullable
   @Deprecated
   public bam b(cvo $$0, cgx $$1, gt $$2) {
      return null;
   }

   @Deprecated
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return true;
   }

   @Deprecated
   public float b(cvo $$0, cgd $$1, gt $$2) {
      return $$0.r($$1, $$2) ? 0.2F : 1.0F;
   }

   @Deprecated
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return 0;
   }

   @Deprecated
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return dxg.b();
   }

   @Deprecated
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.aG ? $$0.j($$1, $$2) : dxg.a();
   }

   @Deprecated
   public boolean a_(cvo $$0, cgd $$1, gt $$2) {
      return cjt.a($$0.k($$1, $$2));
   }

   @Deprecated
   public boolean h(cvo $$0, cgd $$1, gt $$2) {
      return cjt.a($$0.c($$1, $$2));
   }

   @Deprecated
   public dxj b(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.c($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Deprecated
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
   }

   @Deprecated
   public float a(cvo $$0, buc $$1, cgd $$2, gt $$3) {
      float $$4 = $$0.h($$2, $$3);
      if ($$4 == -1.0F) {
         return 0.0F;
      } else {
         int $$5 = $$1.d($$0) ? 30 : 100;
         return $$1.c($$0) / $$4 / (float)$$5;
      }
   }

   @Deprecated
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
   }

   @Deprecated
   public void a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
   }

   @Deprecated
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return 0;
   }

   @Deprecated
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
   }

   @Deprecated
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return 0;
   }

   public final abb r() {
      if (this.aP == null) {
         abb $$0 = hm.V.b(this.o());
         this.aP = new abb($$0.b(), "blocks/" + $$0.a());
      }

      return this.aP;
   }

   @Deprecated
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
   }

   public abstract cat l();

   protected abstract cjt o();

   public dqa s() {
      return (dqa)this.aO.b.apply(this.o().m());
   }

   public float t() {
      return this.aO.g;
   }

   public abstract static class a extends cvq<cjt, cvo> {
      private final int b;
      private final boolean g;
      private final boolean h;
      private final dpz i;
      private final dqa j;
      private final float k;
      private final boolean l;
      private final boolean m;
      private final cvn.e n;
      private final cvn.e o;
      private final cvn.e p;
      private final cvn.e q;
      private final cvn.e r;
      private final cvn.b s;
      @Nullable
      protected cvn.a.a a;

      protected a(cjt $$0, ImmutableMap<cwr<?>, Comparable<?>> $$1, MapCodec<cvo> $$2) {
         super($$0, $$1, $$2);
         cvn.c $$3 = $$0.aO;
         this.b = $$3.e.applyAsInt(this.s());
         this.g = $$0.g_(this.s());
         this.h = $$3.o;
         this.i = $$3.a;
         this.j = (dqa)$$3.b.apply(this.s());
         this.k = $$3.g;
         this.l = $$3.h;
         this.m = $$3.n;
         this.n = $$3.q;
         this.o = $$3.r;
         this.p = $$3.s;
         this.q = $$3.t;
         this.r = $$3.u;
         this.s = (cvn.b)$$3.w.apply(this.s());
      }

      public void a() {
         if (!this.b().n()) {
            this.a = new cvn.a.a(this.s());
         }

      }

      public cjt b() {
         return this.e;
      }

      public hc<cjt> c() {
         return this.e.p();
      }

      public dpz d() {
         return this.i;
      }

      public boolean a(cgd $$0, gt $$1, bbr<?> $$2) {
         return this.b().aO.p.test(this.s(), $$0, $$1, $$2);
      }

      public boolean a(cgd $$0, gt $$1) {
         return this.a != null ? this.a.g : this.b().c(this.s(), $$0, $$1);
      }

      public int b(cgd $$0, gt $$1) {
         return this.a != null ? this.a.h : this.b().g(this.s(), $$0, $$1);
      }

      public dxj a(cgd $$0, gt $$1, gy $$2) {
         return this.a != null && this.a.i != null ? this.a.i[$$2.ordinal()] : dxg.a(this.c($$0, $$1), $$2);
      }

      public dxj c(cgd $$0, gt $$1) {
         return this.b().b_(this.s(), $$0, $$1);
      }

      public boolean e() {
         return this.a == null || this.a.c;
      }

      public boolean f() {
         return this.g;
      }

      public int g() {
         return this.b;
      }

      public boolean h() {
         return this.h;
      }

      public dqa d(cgd $$0, gt $$1) {
         return this.j;
      }

      public cvo a(cpw $$0) {
         return this.b().a(this.s(), $$0);
      }

      public cvo a(coh $$0) {
         return this.b().a(this.s(), $$0);
      }

      public cpp i() {
         return this.b().b_(this.s());
      }

      public boolean e(cgd $$0, gt $$1) {
         return this.r.test(this.s(), $$0, $$1);
      }

      public float f(cgd $$0, gt $$1) {
         return this.b().b(this.s(), $$0, $$1);
      }

      public boolean g(cgd $$0, gt $$1) {
         return this.n.test(this.s(), $$0, $$1);
      }

      public boolean j() {
         return this.b().f_(this.s());
      }

      public int b(cgd $$0, gt $$1, gy $$2) {
         return this.b().a(this.s(), $$0, $$1, $$2);
      }

      public boolean k() {
         return this.b().d_(this.s());
      }

      public int a(cgx $$0, gt $$1) {
         return this.b().a(this.s(), $$0, $$1);
      }

      public float h(cgd $$0, gt $$1) {
         return this.k;
      }

      public float a(buc $$0, cgd $$1, gt $$2) {
         return this.b().a(this.s(), $$0, $$1, $$2);
      }

      public int c(cgd $$0, gt $$1, gy $$2) {
         return this.b().b(this.s(), $$0, $$1, $$2);
      }

      public dqb l() {
         return this.b().d(this.s());
      }

      public boolean i(cgd $$0, gt $$1) {
         if (this.a != null) {
            return this.a.a;
         } else {
            cvo $$2 = this.s();
            return $$2.m() ? cjt.a($$2.c($$0, $$1)) : false;
         }
      }

      public boolean m() {
         return this.m;
      }

      public boolean a(cvo $$0, gy $$1) {
         return this.b().a(this.s(), $$0, $$1);
      }

      public dxj j(cgd $$0, gt $$1) {
         return this.a($$0, $$1, dwv.a());
      }

      public dxj a(cgd $$0, gt $$1, dwv $$2) {
         return this.b().a(this.s(), $$0, $$1, $$2);
      }

      public dxj k(cgd $$0, gt $$1) {
         return this.a != null ? this.a.b : this.b($$0, $$1, dwv.a());
      }

      public dxj b(cgd $$0, gt $$1, dwv $$2) {
         return this.b().c(this.s(), $$0, $$1, $$2);
      }

      public dxj l(cgd $$0, gt $$1) {
         return this.b().f(this.s(), $$0, $$1);
      }

      public dxj c(cgd $$0, gt $$1, dwv $$2) {
         return this.b().b(this.s(), $$0, $$1, $$2);
      }

      public dxj m(cgd $$0, gt $$1) {
         return this.b().a(this.s(), $$0, $$1);
      }

      public final boolean a(cgd $$0, gt $$1, bbn $$2) {
         return this.a($$0, $$1, $$2, gy.b);
      }

      public final boolean a(cgd $$0, gt $$1, bbn $$2, gy $$3) {
         return cjt.a(this.b($$0, $$1, dwv.a($$2)), $$3);
      }

      public dwq n(cgd $$0, gt $$1) {
         if (this.s == cvn.b.a) {
            return dwq.b;
         } else {
            cjt $$2 = this.b();
            long $$3 = ami.c($$1.u(), 0, $$1.w());
            float $$4 = $$2.V_();
            double $$5 = ami.a(((double)((float)($$3 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            double $$6 = this.s == cvn.b.c ? ((double)((float)($$3 >> 4 & 15L) / 15.0F) - 1.0) * (double)$$2.Z_() : 0.0;
            double $$7 = ami.a(((double)((float)($$3 >> 8 & 15L) / 15.0F) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
            return new dwq($$5, $$6, $$7);
         }
      }

      public boolean a(cgx $$0, gt $$1, int $$2, int $$3) {
         return this.b().a(this.s(), $$0, $$1, $$2, $$3);
      }

      @Deprecated
      public void a(cgx $$0, gt $$1, cjt $$2, gt $$3, boolean $$4) {
         this.b().a(this.s(), $$0, $$1, $$2, $$3, $$4);
      }

      public final void a(cgy $$0, gt $$1, int $$2) {
         this.a($$0, $$1, $$2, 512);
      }

      public final void a(cgy $$0, gt $$1, int $$2, int $$3) {
         this.b();
         gt.a $$4 = new gt.a();

         for(gy $$5 : cvn.aE) {
            $$4.a($$1, $$5);
            $$0.a($$5.g(), this.s(), $$4, $$1, $$2, $$3);
         }

      }

      public final void b(cgy $$0, gt $$1, int $$2) {
         this.b($$0, $$1, $$2, 512);
      }

      public void b(cgy $$0, gt $$1, int $$2, int $$3) {
         this.b().a(this.s(), $$0, $$1, $$2, $$3);
      }

      public void a(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
         this.b().b(this.s(), $$0, $$1, $$2, $$3);
      }

      public void b(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
         this.b().a(this.s(), $$0, $$1, $$2, $$3);
      }

      public void a(agg $$0, gt $$1, amn $$2) {
         this.b().a(this.s(), $$0, $$1, $$2);
      }

      public void b(agg $$0, gt $$1, amn $$2) {
         this.b().b(this.s(), $$0, $$1, $$2);
      }

      public void a(cgx $$0, gt $$1, bbn $$2) {
         this.b().a(this.s(), $$0, $$1, $$2);
      }

      public void a(agg $$0, gt $$1, cax $$2, boolean $$3) {
         this.b().a(this.s(), $$0, $$1, $$2, $$3);
      }

      public List<cax> a(dsd.a $$0) {
         return this.b().a(this.s(), $$0);
      }

      public baj a(cgx $$0, buc $$1, bai $$2, dwm $$3) {
         return this.b().a(this.s(), $$0, $$3.a(), $$1, $$2, $$3);
      }

      public void a(cgx $$0, gt $$1, buc $$2) {
         this.b().a(this.s(), $$0, $$1, $$2);
      }

      public boolean o(cgd $$0, gt $$1) {
         return this.o.test(this.s(), $$0, $$1);
      }

      public boolean p(cgd $$0, gt $$1) {
         return this.p.test(this.s(), $$0, $$1);
      }

      public cvo a(gy $$0, cvo $$1, cgy $$2, gt $$3, gt $$4) {
         return this.b().a(this.s(), $$0, $$1, $$2, $$3, $$4);
      }

      public boolean a(cgd $$0, gt $$1, dqm $$2) {
         return this.b().a(this.s(), $$0, $$1, $$2);
      }

      public boolean a(ccx $$0) {
         return this.b().a(this.s(), $$0);
      }

      public boolean a(dpu $$0) {
         return this.b().a(this.s(), $$0);
      }

      public boolean a(cha $$0, gt $$1) {
         return this.b().a(this.s(), $$0, $$1);
      }

      public boolean q(cgd $$0, gt $$1) {
         return this.q.test(this.s(), $$0, $$1);
      }

      @Nullable
      public bam b(cgx $$0, gt $$1) {
         return this.b().b(this.s(), $$0, $$1);
      }

      public boolean a(akz<cjt> $$0) {
         return this.b().p().a($$0);
      }

      public boolean a(akz<cjt> $$0, Predicate<cvn.a> $$1) {
         return this.a($$0) && $$1.test(this);
      }

      public boolean a(he<cjt> $$0) {
         return $$0.a(this.b().p());
      }

      public Stream<akz<cjt>> n() {
         return this.b().p().c();
      }

      public boolean o() {
         return this.b() instanceof cmb;
      }

      @Nullable
      public <T extends cti> ctj<T> a(cgx $$0, ctk<T> $$1) {
         return this.b() instanceof cmb ? ((cmb)this.b()).a($$0, this.s(), $$1) : null;
      }

      public boolean a(cjt $$0) {
         return this.b() == $$0;
      }

      public dpv p() {
         return this.b().c_(this.s());
      }

      public boolean q() {
         return this.b().e_(this.s());
      }

      public long a(gt $$0) {
         return this.b().a(this.s(), $$0);
      }

      public cqw r() {
         return this.b().m(this.s());
      }

      public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
         this.b().a($$0, $$1, $$2, $$3);
      }

      public boolean d(cgd $$0, gt $$1, gy $$2) {
         return this.a($$0, $$1, $$2, crm.a);
      }

      public boolean a(cgd $$0, gt $$1, gy $$2, crm $$3) {
         return this.a != null ? this.a.a($$2, $$3) : $$3.a(this.s(), $$0, $$1, $$2);
      }

      public boolean r(cgd $$0, gt $$1) {
         return this.a != null ? this.a.d : this.b().a_(this.s(), $$0, $$1);
      }

      protected abstract cvo s();

      public boolean t() {
         return this.l;
      }

      public cvn.b u() {
         return this.s;
      }

      static final class a {
         private static final gy[] e = gy.values();
         private static final int f = crm.values().length;
         protected final boolean a;
         final boolean g;
         final int h;
         @Nullable
         final dxj[] i;
         protected final dxj b;
         protected final boolean c;
         private final boolean[] j;
         protected final boolean d;

         a(cvo $$0) {
            cjt $$1 = $$0.b();
            this.a = $$0.i(cgm.a, gt.b);
            this.g = $$1.c($$0, cgm.a, gt.b);
            this.h = $$1.g($$0, cgm.a, gt.b);
            if (!$$0.m()) {
               this.i = null;
            } else {
               this.i = new dxj[e.length];
               dxj $$2 = $$1.b_($$0, cgm.a, gt.b);

               for(gy $$3 : e) {
                  this.i[$$3.ordinal()] = dxg.a($$2, $$3);
               }
            }

            this.b = $$1.c($$0, cgm.a, gt.b, dwv.a());
            if (!this.b.b() && $$0.u() != cvn.b.a) {
               throw new IllegalStateException(
                  String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", hm.V.b($$1))
               );
            } else {
               this.c = Arrays.stream(gy.a.values()).anyMatch($$0x -> this.b.b($$0x) < 0.0 || this.b.c($$0x) > 1.0);
               this.j = new boolean[e.length * f];

               for(gy $$4 : e) {
                  for(crm $$5 : crm.values()) {
                     this.j[b($$4, $$5)] = $$5.a($$0, cgm.a, gt.b, $$4);
                  }
               }

               this.d = cjt.a($$0.k(cgm.a, gt.b));
            }
         }

         public boolean a(gy $$0, crm $$1) {
            return this.j[b($$0, $$1)];
         }

         private static int b(gy $$0, crm $$1) {
            return $$0.ordinal() * f + $$1.ordinal();
         }
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static class c {
      dpz a;
      Function<cvo, dqa> b;
      boolean c = true;
      cqw d = cqw.e;
      ToIntFunction<cvo> e = $$0x -> 0;
      float f;
      float g;
      boolean h;
      boolean i;
      float j = 0.6F;
      float k = 1.0F;
      float l = 1.0F;
      abb m;
      boolean n = true;
      boolean o;
      cvn.d<bbr<?>> p = ($$0x, $$1x, $$2, $$3) -> $$0x.d($$1x, $$2, gy.b) && $$0x.g() < 14;
      cvn.e q = ($$0x, $$1x, $$2) -> $$0x.d().f() && $$0x.r($$1x, $$2);
      cvn.e r = ($$0x, $$1x, $$2) -> this.a.c() && $$0x.r($$1x, $$2);
      cvn.e s = this.r;
      cvn.e t = ($$0x, $$1x, $$2) -> false;
      cvn.e u = ($$0x, $$1x, $$2) -> false;
      boolean v;
      Function<cvo, cvn.b> w = $$0x -> cvn.b.a;

      private c(dpz $$0, dqa $$1) {
         this($$0, $$1x -> $$1);
      }

      private c(dpz $$0, Function<cvo, dqa> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public static cvn.c a(dpz $$0) {
         return a($$0, $$0.h());
      }

      public static cvn.c a(dpz $$0, bzq $$1) {
         return a($$0, $$1.e());
      }

      public static cvn.c a(dpz $$0, dqa $$1) {
         return new cvn.c($$0, $$1);
      }

      public static cvn.c a(dpz $$0, Function<cvo, dqa> $$1) {
         return new cvn.c($$0, $$1);
      }

      public static cvn.c a(cvn $$0) {
         cvn.c $$1 = new cvn.c($$0.aF, $$0.aO.b);
         $$1.a = $$0.aO.a;
         $$1.g = $$0.aO.g;
         $$1.f = $$0.aO.f;
         $$1.c = $$0.aO.c;
         $$1.i = $$0.aO.i;
         $$1.e = $$0.aO.e;
         $$1.b = $$0.aO.b;
         $$1.d = $$0.aO.d;
         $$1.j = $$0.aO.j;
         $$1.k = $$0.aO.k;
         $$1.v = $$0.aO.v;
         $$1.n = $$0.aO.n;
         $$1.o = $$0.aO.o;
         $$1.h = $$0.aO.h;
         $$1.w = $$0.aO.w;
         return $$1;
      }

      public cvn.c a() {
         this.c = false;
         this.n = false;
         return this;
      }

      public cvn.c b() {
         this.n = false;
         return this;
      }

      public cvn.c a(float $$0) {
         this.j = $$0;
         return this;
      }

      public cvn.c b(float $$0) {
         this.k = $$0;
         return this;
      }

      public cvn.c c(float $$0) {
         this.l = $$0;
         return this;
      }

      public cvn.c a(cqw $$0) {
         this.d = $$0;
         return this;
      }

      public cvn.c a(ToIntFunction<cvo> $$0) {
         this.e = $$0;
         return this;
      }

      public cvn.c a(float $$0, float $$1) {
         return this.e($$0).f($$1);
      }

      public cvn.c c() {
         return this.d(0.0F);
      }

      public cvn.c d(float $$0) {
         this.a($$0, $$0);
         return this;
      }

      public cvn.c d() {
         this.i = true;
         return this;
      }

      public cvn.c e() {
         this.v = true;
         return this;
      }

      public cvn.c f() {
         this.m = dry.a;
         return this;
      }

      public cvn.c a(cjt $$0) {
         this.m = $$0.r();
         return this;
      }

      public cvn.c g() {
         this.o = true;
         return this;
      }

      public cvn.c a(cvn.d<bbr<?>> $$0) {
         this.p = $$0;
         return this;
      }

      public cvn.c a(cvn.e $$0) {
         this.q = $$0;
         return this;
      }

      public cvn.c b(cvn.e $$0) {
         this.r = $$0;
         return this;
      }

      public cvn.c c(cvn.e $$0) {
         this.s = $$0;
         return this;
      }

      public cvn.c d(cvn.e $$0) {
         this.t = $$0;
         return this;
      }

      public cvn.c e(cvn.e $$0) {
         this.u = $$0;
         return this;
      }

      public cvn.c h() {
         this.h = true;
         return this;
      }

      public cvn.c a(dqa $$0) {
         this.b = $$1 -> $$0;
         return this;
      }

      public cvn.c e(float $$0) {
         this.g = $$0;
         return this;
      }

      public cvn.c f(float $$0) {
         this.f = Math.max(0.0F, $$0);
         return this;
      }

      public cvn.c a(cvn.b $$0) {
         return this.a((Function<cvo, cvn.b>)($$1 -> $$0));
      }

      public cvn.c a(Function<cvo, cvn.b> $$0) {
         this.w = $$0;
         return this;
      }
   }

   public interface d<A> {
      boolean test(cvo var1, cgd var2, gt var3, A var4);
   }

   public interface e {
      boolean test(cvo var1, cgd var2, gt var3);
   }
}
