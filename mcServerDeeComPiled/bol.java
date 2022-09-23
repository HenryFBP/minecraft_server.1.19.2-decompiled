import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bol extends bne implements bca, bng {
   private static final Logger ce = LogUtils.getLogger();
   public static final int bX = 200;
   protected static final ImmutableList<? extends blz<? extends bly<? super bol>>> bY = ImmutableList.of(blz.c, blz.n, blz.f, blz.o, blz.p);
   protected static final ImmutableList<? extends bku<?>> ca = ImmutableList.of(
      bku.r, bku.g, bku.h, bku.k, bku.l, bku.n, bku.m, bku.E, bku.t, bku.o, bku.p, bku.J, new bku[]{bku.y, bku.M, bku.B, bku.N, bku.O, bku.P, bku.S, bku.X}
   );
   private static final aaj<Integer> cf = aam.a(bol.class, aal.b);
   private static final aaj<Boolean> cg = aam.a(bol.class, aal.i);
   private static final aaj<Boolean> ch = aam.a(bol.class, aal.i);
   public static final double cb = 20.0;
   public static final int cc = 1200;
   private static final int ci = 6000;
   public static final String cd = "Variant";
   private static final int cj = 1800;
   private static final int ck = 2400;
   private final Map<String, k> cl = Maps.newHashMap();
   private static final int cm = 100;

   public bol(bbr<? extends bol> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.j, 0.0F);
      this.bP = new bol.c(this);
      this.bO = new bol.b(this, 20);
      this.P = 1.0F;
   }

   @Override
   public Map<String, k> a() {
      return this.cl;
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cf, 0);
      this.Y.a(cg, false);
      this.Y.a(ch, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Variant", this.fK().a());
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(bol.d.f[$$0.h("Variant")]);
      this.v($$0.q("FromBucket"));
   }

   @Override
   public void K() {
      if (!this.fL()) {
         super.K();
      }
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      boolean $$5 = false;
      if ($$2 == bcg.l) {
         return $$3;
      } else {
         amn $$6 = $$0.r_();
         if ($$3 instanceof bol.a) {
            if (((bol.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bol.a(bol.d.a($$6), bol.d.a($$6));
         }

         this.a(((bol.a)$$3).a($$6));
         if ($$5) {
            this.b_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void an() {
      int $$0 = this.ca();
      super.an();
      if (!this.fA()) {
         this.t($$0);
      }

   }

   protected void t(int $$0) {
      if (this.bo() && !this.aT()) {
         this.i($$0 - 1);
         if (this.ca() == -20) {
            this.i(0);
            this.a(baw.t, 2.0F);
         }
      } else {
         this.i(this.bZ());
      }

   }

   public void fJ() {
      int $$0 = this.ca() + 1800;
      this.i(Math.min($$0, this.bZ()));
   }

   @Override
   public int bZ() {
      return 6000;
   }

   public bol.d fK() {
      return bol.d.f[this.Y.a(cf)];
   }

   private void a(bol.d $$0) {
      this.Y.b(cf, $$0.a());
   }

   private static boolean a(amn $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cha $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean dB() {
      return true;
   }

   @Override
   public boolean cr() {
      return false;
   }

   @Override
   public bch ey() {
      return bch.e;
   }

   public void w(boolean $$0) {
      this.Y.b(cg, $$0);
   }

   public boolean fL() {
      return this.Y.a(cg);
   }

   @Override
   public boolean q() {
      return this.Y.a(ch);
   }

   @Override
   public void v(boolean $$0) {
      this.Y.b(ch, $$0);
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      bol $$2 = bbr.f.a((cgx)$$0);
      if ($$2 != null) {
         bol.d $$3;
         if (a(this.R)) {
            $$3 = bol.d.b(this.R);
         } else {
            $$3 = this.R.h() ? this.fK() : ((bol)$$1).fK();
         }

         $$2.a($$3);
         $$2.fp();
      }

      return $$2;
   }

   @Override
   public double i(bcc $$0) {
      return 1.5 + (double)$$0.cW() * 2.0;
   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(aks.av);
   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   @Override
   protected void T() {
      this.s.ac().a("axolotlBrain");
      this.dy().a((agg)this.s, this);
      this.s.ac().c();
      this.s.ac().a("axolotlActivityUpdate");
      bom.a(this);
      this.s.ac().c();
      if (!this.fA()) {
         Optional<Integer> $$0 = this.dy().c(bku.M);
         this.w($$0.isPresent() && $$0.get() > 0);
      }

   }

   public static bdc.a fR() {
      return bce.w().a(bdd.a, 14.0).a(bdd.d, 1.0).a(bdd.f, 2.0);
   }

   @Override
   protected blc a(cgx $$0) {
      return new bkz(this, $$0);
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = $$0.a(baw.c(this), (float)((int)this.b(bdd.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(ajw.au, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      float $$2 = this.ef();
      if (!this.s.y
         && !this.fA()
         && this.s.w.a(3) == 0
         && ((float)this.s.w.a(3) < $$1 || $$2 / this.et() < 0.5F)
         && $$1 < $$2
         && this.aR()
         && ($$0.m() != null || $$0.l() != null)
         && !this.fL()) {
         this.bD.a(bku.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int U() {
      return 1;
   }

   @Override
   public int V() {
      return 1;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      return (baj)bng.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cax $$0) {
      bng.a(this, $$0);
      pj $$1 = $$0.v();
      $$1.a("Variant", this.fK().a());
      $$1.a("Age", this.j());
      bcx<?> $$2 = this.dy();
      if ($$2.a(bku.S)) {
         $$1.a("HuntingCooldown", $$2.d(bku.S));
      }

   }

   @Override
   public void c(pj $$0) {
      bng.a(this, $$0);
      int $$1 = $$0.h("Variant");
      if ($$1 >= 0 && $$1 < bol.d.f.length) {
         this.a(bol.d.f[$$1]);
      } else {
         ce.error("Invalid variant: {}", $$1);
      }

      if ($$0.e("Age")) {
         this.b_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dy().a(bku.S, true, $$0.i("HuntingCooldown"));
      }

   }

   @Override
   public cax b() {
      return new cax(caz.oS);
   }

   @Override
   public ajv t() {
      return ajw.ch;
   }

   @Override
   public boolean dY() {
      return !this.fL() && super.dY();
   }

   public static void a(bol $$0, bcc $$1) {
      cgx $$2 = $$0.s;
      if ($$1.eg()) {
         baw $$3 = $$1.eh();
         if ($$3 != null) {
            bbn $$4 = $$3.m();
            if ($$4 != null && $$4.ad() == bbr.bn) {
               buc $$5 = (buc)$$4;
               List<buc> $$6 = $$2.a(buc.class, $$0.cy().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.e($$5);
               }
            }
         }
      }

   }

   public void e(buc $$0) {
      bbg $$1 = $$0.b(bbi.j);
      int $$2 = $$1 != null ? $$1.c() : 0;
      if ($$2 < 2400) {
         $$2 = Math.min(2400, 100 + $$2);
         $$0.b(new bbg(bbi.j, $$2, 0), this);
      }

      $$0.d(bbi.d);
   }

   @Override
   public boolean P() {
      return super.P() || this.q();
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.aw;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.av;
   }

   @Nullable
   @Override
   protected ajv r() {
      return this.aR() ? ajw.ay : ajw.ax;
   }

   @Override
   protected ajv aH() {
      return ajw.az;
   }

   @Override
   protected ajv aG() {
      return ajw.aA;
   }

   @Override
   protected bcx.b<bol> dz() {
      return bcx.a(ca, bY);
   }

   @Override
   protected bcx<?> a(Dynamic<?> $$0) {
      return bom.a(this.dz().a($$0));
   }

   @Override
   public bcx<bol> dy() {
      return super.dy();
   }

   @Override
   protected void R() {
      super.R();
      xl.a(this);
   }

   @Override
   public void g(dwq $$0) {
      if (this.eP() && this.aR()) {
         this.a(this.eK(), $$0);
         this.a(bci.a, this.dd());
         this.f(this.dd().a(0.9));
      } else {
         super.g($$0);
      }

   }

   @Override
   protected void a(buc $$0, bai $$1, cax $$2) {
      if ($$2.a(caz.oR)) {
         $$0.a($$1, new cax(caz.oI));
      } else {
         super.a($$0, $$1, $$2);
      }

   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.Y();
   }

   public static boolean a(bbr<? extends bcc> $$0, chm $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bE);
   }

   public static class a extends bbk.a {
      public final bol.d[] a;

      public a(bol.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bol.d a(amn $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bht {
      public b(bol $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bol.this.fL()) {
            super.a();
         }

      }
   }

   static class c extends bhu {
      private final bol l;

      public c(bol $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.fL()) {
            super.a();
         }

      }
   }

   public static enum d {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      public static final bol.d[] f = (bol.d[])Arrays.stream(values()).sorted(Comparator.comparingInt(bol.d::a)).toArray($$0 -> new bol.d[$$0]);
      private final int g;
      private final String h;
      private final boolean i;

      private d(int $$0, String $$1, boolean $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public int a() {
         return this.g;
      }

      public String b() {
         return this.h;
      }

      public static bol.d a(amn $$0) {
         return a($$0, true);
      }

      public static bol.d b(amn $$0) {
         return a($$0, false);
      }

      private static bol.d a(amn $$0, boolean $$1) {
         bol.d[] $$2 = (bol.d[])Arrays.stream(f).filter($$1x -> $$1x.i == $$1).toArray($$0x -> new bol.d[$$0x]);
         return ad.a((bol.d[])$$2, $$0);
      }
   }
}
