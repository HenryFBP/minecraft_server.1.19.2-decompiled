import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class boa extends bne implements bcs {
   private static final int bX = 40;
   private static final aaj<Byte> bY = aam.a(boa.class, aal.a);
   private static final Map<bzq, cgw> ca = ad.a(Maps.newEnumMap(bzq.class), $$0 -> {
      $$0.put(bzq.a, cju.bn);
      $$0.put(bzq.b, cju.bo);
      $$0.put(bzq.c, cju.bp);
      $$0.put(bzq.d, cju.bq);
      $$0.put(bzq.e, cju.br);
      $$0.put(bzq.f, cju.bs);
      $$0.put(bzq.g, cju.bt);
      $$0.put(bzq.h, cju.bu);
      $$0.put(bzq.i, cju.bv);
      $$0.put(bzq.j, cju.bw);
      $$0.put(bzq.k, cju.bx);
      $$0.put(bzq.l, cju.by);
      $$0.put(bzq.m, cju.bz);
      $$0.put(bzq.n, cju.bA);
      $$0.put(bzq.o, cju.bB);
      $$0.put(bzq.p, cju.bC);
   });
   private static final Map<bzq, float[]> cb = Maps.newEnumMap((Map)Arrays.stream(bzq.values()).collect(Collectors.toMap($$0 -> $$0, boa::c)));
   private int cc;
   private bih cd;

   private static float[] c(bzq $$0) {
      if ($$0 == bzq.a) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] $$1 = $$0.d();
         float $$2 = 0.75F;
         return new float[]{$$1[0] * 0.75F, $$1[1] * 0.75F, $$1[2] * 0.75F};
      }
   }

   public static float[] a(bzq $$0) {
      return (float[])cb.get($$0);
   }

   public boa(bbr<? extends boa> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.cd = new bih(this);
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bji(this, 1.25));
      this.bS.a(2, new bib(this, 1.0));
      this.bS.a(3, new bjw(this, 1.1, cdm.a(caz.nS), false));
      this.bS.a(4, new bio(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new bkb(this, 1.0));
      this.bS.a(7, new bix(this, buc.class, 6.0F));
      this.bS.a(8, new bjk(this));
   }

   @Override
   protected void T() {
      this.cc = this.cd.h();
      super.T();
   }

   @Override
   public void w_() {
      if (this.s.y) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.w_();
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 8.0).a(bdd.d, 0.23F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bY, (byte)0);
   }

   @Override
   public abb N() {
      if (this.fJ()) {
         return this.ad().j();
      } else {
         switch(this.t()) {
            case a:
            default:
               return dry.S;
            case b:
               return dry.T;
            case c:
               return dry.U;
            case d:
               return dry.V;
            case e:
               return dry.W;
            case f:
               return dry.X;
            case g:
               return dry.Y;
            case h:
               return dry.Z;
            case i:
               return dry.aa;
            case j:
               return dry.ab;
            case k:
               return dry.ac;
            case l:
               return dry.ad;
            case m:
               return dry.ae;
            case n:
               return dry.af;
            case o:
               return dry.ag;
            case p:
               return dry.ah;
         }
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 10) {
         this.cc = 40;
      } else {
         super.a($$0);
      }

   }

   public float y(float $$0) {
      if (this.cc <= 0) {
         return 0.0F;
      } else if (this.cc >= 4 && this.cc <= 36) {
         return 1.0F;
      } else {
         return this.cc < 4 ? ((float)this.cc - $$0) / 4.0F : -((float)(this.cc - 40) - $$0) / 4.0F;
      }
   }

   public float z(float $$0) {
      if (this.cc > 4 && this.cc <= 36) {
         float $$1 = ((float)(this.cc - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * ami.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.ds() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.qd)) {
         if (!this.s.y && this.a()) {
            this.a(ajx.h);
            this.a(czv.O, $$0);
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            return baj.a;
         } else {
            return baj.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ajx $$0) {
      this.s.a(null, this, ajw.sh, $$0, 1.0F, 1.0F);
      this.v(true);
      int $$1 = 1 + this.R.a(3);

      for(int $$2 = 0; $$2 < $$1; ++$$2) {
         bqv $$3 = this.a((cgw)ca.get(this.t()), 1);
         if ($$3 != null) {
            $$3.f($$3.dd().b((double)((this.R.i() - this.R.i()) * 0.1F), (double)(this.R.i() * 0.05F), (double)((this.R.i() - this.R.i()) * 0.1F)));
         }
      }

   }

   @Override
   public boolean a() {
      return this.bo() && !this.fJ() && !this.y_();
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Sheared", this.fJ());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.v($$0.q("Sheared"));
      this.b(bzq.a($$0.f("Color")));
   }

   @Override
   protected ajv r() {
      return ajw.se;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.sg;
   }

   @Override
   protected ajv x_() {
      return ajw.sf;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.si, 0.15F, 1.0F);
   }

   public bzq t() {
      return bzq.a(this.Y.a(bY) & 15);
   }

   public void b(bzq $$0) {
      byte $$1 = this.Y.a(bY);
      this.Y.b(bY, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean fJ() {
      return (this.Y.a(bY) & 16) != 0;
   }

   public void v(boolean $$0) {
      byte $$1 = this.Y.a(bY);
      if ($$0) {
         this.Y.b(bY, (byte)($$1 | 16));
      } else {
         this.Y.b(bY, (byte)($$1 & -17));
      }

   }

   public static bzq a(amn $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return bzq.p;
      } else if ($$1 < 10) {
         return bzq.h;
      } else if ($$1 < 15) {
         return bzq.i;
      } else if ($$1 < 18) {
         return bzq.m;
      } else {
         return $$0.a(500) == 0 ? bzq.g : bzq.a;
      }
   }

   public boa b(agg $$0, bbk $$1) {
      boa $$2 = (boa)$$1;
      boa $$3 = bbr.aA.a((cgx)$$0);
      $$3.b(this.a(this, $$2));
      return $$3;
   }

   @Override
   public void I() {
      super.I();
      this.v(false);
      if (this.y_()) {
         this.a_(60);
      }

   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.b(a($$0.r_()));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private bzq a(bne $$0, bne $$1) {
      bzq $$2 = ((boa)$$0).t();
      bzq $$3 = ((boa)$$1).t();
      bxa $$4 = a($$2, $$3);
      return (bzq)this.s
         .q()
         .a(cds.a, $$4, this.s)
         .map($$1x -> $$1x.a($$4))
         .map(cax::c)
         .filter(bzr.class::isInstance)
         .map(bzr.class::cast)
         .map(bzr::d)
         .orElseGet(() -> this.s.w.h() ? $$2 : $$3);
   }

   private static bxa a(bzq $$0, bzq $$1) {
      bxa $$2 = new bxa(new bwm(null, -1) {
         @Override
         public cax a(buc $$0, int $$1) {
            return cax.b;
         }

         @Override
         public boolean a(buc $$0) {
            return false;
         }
      }, 2, 1);
      $$2.a(0, new cax(bzr.a($$0)));
      $$2.a(1, new cax(bzr.a($$1)));
      return $$2;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 0.95F * $$1.b;
   }
}
