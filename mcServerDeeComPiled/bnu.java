import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnu extends bob implements bnn {
   private static final aaj<Integer> ce = aam.a(bnu.class, aal.b);
   private static final Predicate<bce> cf = new Predicate<bce>() {
      public boolean a(@Nullable bce $$0) {
         return $$0 != null && bnu.cj.containsKey($$0.ad());
      }
   };
   private static final cat cg = caz.qb;
   private static final Set<cat> ch = Sets.newHashSet(new cat[]{caz.nR, caz.qh, caz.qg, caz.tf});
   private static final int ci = 5;
   static final Map<bbr<?>, ajv> cj = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bbr.i, ajw.ot);
      $$0.put(bbr.m, ajw.oP);
      $$0.put(bbr.q, ajw.ou);
      $$0.put(bbr.u, ajw.ov);
      $$0.put(bbr.v, ajw.ow);
      $$0.put(bbr.x, ajw.ox);
      $$0.put(bbr.z, ajw.oy);
      $$0.put(bbr.A, ajw.oz);
      $$0.put(bbr.I, ajw.oA);
      $$0.put(bbr.N, ajw.oB);
      $$0.put(bbr.O, ajw.oC);
      $$0.put(bbr.Q, ajw.oD);
      $$0.put(bbr.R, ajw.oE);
      $$0.put(bbr.aa, ajw.oF);
      $$0.put(bbr.ap, ajw.oG);
      $$0.put(bbr.ar, ajw.oH);
      $$0.put(bbr.as, ajw.oI);
      $$0.put(bbr.at, ajw.oJ);
      $$0.put(bbr.ay, ajw.oK);
      $$0.put(bbr.aB, ajw.oL);
      $$0.put(bbr.aD, ajw.oM);
      $$0.put(bbr.aE, ajw.oN);
      $$0.put(bbr.aG, ajw.oO);
      $$0.put(bbr.aL, ajw.oP);
      $$0.put(bbr.aN, ajw.oQ);
      $$0.put(bbr.aY, ajw.oR);
      $$0.put(bbr.ba, ajw.oS);
      $$0.put(bbr.bc, ajw.oT);
      $$0.put(bbr.bd, ajw.oU);
      $$0.put(bbr.be, ajw.oV);
      $$0.put(bbr.bf, ajw.oW);
      $$0.put(bbr.bi, ajw.oX);
      $$0.put(bbr.bj, ajw.oY);
      $$0.put(bbr.bl, ajw.oZ);
   });
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   private float ck = 1.0F;
   private float cl = 1.0F;
   private boolean cm;
   @Nullable
   private gt cn;

   public bnu(bbr<? extends bnu> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bhp(this, 10, false);
      this.a(dqh.n, -1.0F);
      this.a(dqh.o, -1.0F);
      this.a(dqh.z, -1.0F);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.t($$0.r_().a(5));
      if ($$3 == null) {
         $$3 = new bbk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean y_() {
      return false;
   }

   @Override
   protected void u() {
      this.bS.a(0, new bji(this, 1.25));
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bix(this, buc.class, 8.0F));
      this.bS.a(2, new bjt(this));
      this.bS.a(2, new bin(this, 1.0, 5.0F, 1.0F, true));
      this.bS.a(2, new bnu.a(this, 1.0));
      this.bS.a(3, new biu(this));
      this.bS.a(3, new bim(this, 1.0, 3.0F, 7.0F));
   }

   public static bdc.a fR() {
      return bce.w().a(bdd.a, 6.0).a(bdd.e, 0.4F).a(bdd.d, 0.2F);
   }

   @Override
   protected blc a(cgx $$0) {
      bla $$1 = new bla(this, $$0);
      $$1.b(false);
      $$1.a(true);
      $$1.c(true);
      return $$1;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.6F;
   }

   @Override
   public void w_() {
      if (this.cn == null || !this.cn.a(this.cY(), 3.46) || !this.s.a_(this.cn).a(cju.dc)) {
         this.cm = false;
         this.cn = null;
      }

      if (this.s.w.a(400) == 0) {
         a(this.s, this);
      }

      super.w_();
      this.fV();
   }

   @Override
   public void a(gt $$0, boolean $$1) {
      this.cn = $$0;
      this.cm = $$1;
   }

   public boolean fS() {
      return this.cm;
   }

   private void fV() {
      this.cd = this.ca;
      this.cc = this.cb;
      this.cb += (float)(!this.y && !this.bI() ? 4 : -1) * 0.3F;
      this.cb = ami.a(this.cb, 0.0F, 1.0F);
      if (!this.y && this.ck < 1.0F) {
         this.ck = 1.0F;
      }

      this.ck *= 0.9F;
      dwq $$0 = this.dd();
      if (!this.y && $$0.d < 0.0) {
         this.f($$0.d(1.0, 0.6, 1.0));
      }

      this.ca += this.ck * 2.0F;
   }

   public static boolean a(cgx $$0, bbn $$1) {
      if ($$1.bo() && !$$1.aM() && $$0.w.a(2) == 0) {
         List<bce> $$2 = $$0.a(bce.class, $$1.cy().g(20.0), cf);
         if (!$$2.isEmpty()) {
            bce $$3 = (bce)$$2.get($$0.w.a($$2.size()));
            if (!$$3.aM()) {
               ajv $$4 = b($$3.ad());
               $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), $$4, $$1.cR(), 0.7F, a($$0.w));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!this.q() && ch.contains($$2.c())) {
         if (!$$0.fB().d) {
            $$2.g(1);
         }

         if (!this.aM()) {
            this.s.a(null, this.df(), this.dh(), this.dl(), ajw.oq, this.cR(), 1.0F, 1.0F + (this.R.i() - this.R.i()) * 0.2F);
         }

         if (!this.s.y) {
            if (this.R.a(10) == 0) {
               this.e($$0);
               this.s.a(this, (byte)7);
            } else {
               this.s.a(this, (byte)6);
            }
         }

         return baj.a(this.s.y);
      } else if ($$2.a(cg)) {
         if (!$$0.fB().d) {
            $$2.g(1);
         }

         this.b(new bbg(bbi.s, 900));
         if ($$0.f() || !this.ci()) {
            this.a(baw.a($$0), Float.MAX_VALUE);
         }

         return baj.a(this.s.y);
      } else if (!this.fX() && this.q() && this.k($$0)) {
         if (!this.s.y) {
            this.y(!this.fL());
         }

         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean n(cax $$0) {
      return false;
   }

   public static boolean c(bbr<bnu> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bH) && a($$1, $$3);
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
   }

   @Override
   public boolean a(bne $$0) {
      return false;
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      return null;
   }

   @Override
   public boolean z(bbn $$0) {
      return $$0.a(baw.c(this), 3.0F);
   }

   @Nullable
   @Override
   public ajv r() {
      return a(this.s, this.s.w);
   }

   public static ajv a(cgx $$0, amn $$1) {
      if ($$0.ag() != bag.a && $$1.a(1000) == 0) {
         List<bbr<?>> $$2 = Lists.newArrayList(cj.keySet());
         return b((bbr<?>)$$2.get($$1.a($$2.size())));
      } else {
         return ajw.oo;
      }
   }

   private static ajv b(bbr<?> $$0) {
      return (ajv)cj.getOrDefault($$0, ajw.oo);
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.os;
   }

   @Override
   protected ajv x_() {
      return ajw.op;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.pa, 0.15F, 1.0F);
   }

   @Override
   protected boolean aL() {
      return this.K > this.cl;
   }

   @Override
   protected void aK() {
      this.a(ajw.or, 0.15F, 1.0F);
      this.cl = this.K + this.cb / 2.0F;
   }

   @Override
   public float eD() {
      return a(this.R);
   }

   public static float a(amn $$0) {
      return ($$0.i() - $$0.i()) * 0.2F + 1.0F;
   }

   @Override
   public ajx cR() {
      return ajx.g;
   }

   @Override
   public boolean bl() {
      return true;
   }

   @Override
   protected void A(bbn $$0) {
      if (!($$0 instanceof buc)) {
         super.A($$0);
      }
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.s.y) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   public int fT() {
      return ami.a(this.Y.a(ce), 0, 4);
   }

   public void t(int $$0) {
      this.Y.b(ce, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ce, 0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Variant", this.fT());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.t($$0.h("Variant"));
   }

   @Override
   public boolean fX() {
      return !this.y;
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.5F * this.cA()), (double)(this.cW() * 0.4F));
   }

   static class a extends bka {
      public a(bcl $$0, double $$1) {
         super($$0, $$1);
      }

      @Nullable
      @Override
      protected dwq h() {
         dwq $$0 = null;
         if (this.b.aR()) {
            $$0 = bmm.a(this.b, 15, 15);
         }

         if (this.b.dQ().i() >= this.j) {
            $$0 = this.k();
         }

         return $$0 == null ? super.h() : $$0;
      }

      @Nullable
      private dwq k() {
         gt $$0 = this.b.da();
         gt.a $$1 = new gt.a();
         gt.a $$2 = new gt.a();

         for(gt $$4 : gt.b(
            ami.b(this.b.df() - 3.0),
            ami.b(this.b.dh() - 6.0),
            ami.b(this.b.dl() - 3.0),
            ami.b(this.b.df() + 3.0),
            ami.b(this.b.dh() + 6.0),
            ami.b(this.b.dl() + 3.0)
         )) {
            if (!$$0.equals($$4)) {
               cvo $$5 = this.b.s.a_($$2.a($$4, gy.a));
               boolean $$6 = $$5.b() instanceof cnt || $$5.a(akl.s);
               if ($$6 && this.b.s.x($$4) && this.b.s.x($$1.a($$4, gy.b))) {
                  return dwq.c($$4);
               }
            }
         }

         return null;
      }
   }
}
