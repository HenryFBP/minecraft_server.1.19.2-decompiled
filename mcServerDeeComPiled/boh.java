import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boh extends bcw implements bcj {
   private static final aaj<Boolean> cb = aam.a(boh.class, aal.i);
   private static final aaj<Integer> cc = aam.a(boh.class, aal.b);
   private static final aaj<Integer> cd = aam.a(boh.class, aal.b);
   public static final Predicate<bcc> ca = $$0 -> {
      bbr<?> $$1 = $$0.ad();
      return $$1 == bbr.aA || $$1 == bbr.ax || $$1 == bbr.G;
   };
   private static final float ce = 8.0F;
   private static final float cf = 20.0F;
   private float cg;
   private float ch;
   private boolean ci;
   private boolean cj;
   private float ck;
   private float cl;
   private static final azu cm = anc.a(20, 39);
   @Nullable
   private UUID cn;

   public boh(bbr<? extends boh> $$0, cgx $$1) {
      super($$0, $$1);
      this.w(false);
      this.a(dqh.f, -1.0F);
      this.a(dqh.g, -1.0F);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bij(this));
      this.bS.a(1, new boh.b(1.5));
      this.bS.a(2, new bjt(this));
      this.bS.a(3, new boh.a(this, bpd.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new biv(this, 0.4F));
      this.bS.a(5, new biz(this, 1.0, true));
      this.bS.a(6, new bin(this, 1.0, 10.0F, 2.0F, false));
      this.bS.a(7, new bib(this, 1.0));
      this.bS.a(8, new bkb(this, 1.0));
      this.bS.a(9, new bhx(this, 8.0F));
      this.bS.a(10, new bix(this, buc.class, 8.0F));
      this.bS.a(10, new bjk(this));
      this.bT.a(1, new bkl(this));
      this.bT.a(2, new bkm(this));
      this.bT.a(3, new bkg(this).a());
      this.bT.a(4, new bkh(this, buc.class, 10, true, false, this::a_));
      this.bT.a(5, new bkk(this, bne.class, false, ca));
      this.bT.a(6, new bkk(this, bof.class, false, bof.bY));
      this.bT.a(7, new bkh(this, bqz.class, false));
      this.bT.a(8, new bkn<>(this, true));
   }

   public static bdc.a fR() {
      return bce.w().a(bdd.d, 0.3F).a(bdd.a, 8.0).a(bdd.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cb, false);
      this.Y.a(cc, bzq.o.a());
      this.Y.a(cd, 0);
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.xs, 0.15F, 1.0F);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.fU().a());
      this.c($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(bzq.a($$0.h("CollarColor")));
      }

      this.a(this.s, $$0);
   }

   @Override
   protected ajv r() {
      if (this.I_()) {
         return ajw.xn;
      } else if (this.R.a(3) == 0) {
         return this.q() && this.ef() < 10.0F ? ajw.xt : ajw.xq;
      } else {
         return ajw.xl;
      }
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.xp;
   }

   @Override
   protected ajv x_() {
      return ajw.xm;
   }

   @Override
   protected float eC() {
      return 0.4F;
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y && this.ci && !this.cj && !this.fG() && this.y) {
         this.cj = true;
         this.ck = 0.0F;
         this.cl = 0.0F;
         this.s.a(this, (byte)8);
      }

      if (!this.s.y) {
         this.a((agg)this.s, true);
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.bo()) {
         this.ch = this.cg;
         if (this.fV()) {
            this.cg += (1.0F - this.cg) * 0.4F;
         } else {
            this.cg += (0.0F - this.cg) * 0.4F;
         }

         if (this.aT()) {
            this.ci = true;
            if (this.cj && !this.s.y) {
               this.s.a(this, (byte)56);
               this.fW();
            }
         } else if ((this.ci || this.cj) && this.cj) {
            if (this.ck == 0.0F) {
               this.a(ajw.xr, this.eC(), (this.R.i() - this.R.i()) * 0.2F + 1.0F);
               this.a(czv.u);
            }

            this.cl = this.ck;
            this.ck += 0.05F;
            if (this.cl >= 2.0F) {
               this.ci = false;
               this.cj = false;
               this.cl = 0.0F;
               this.ck = 0.0F;
            }

            if (this.ck > 0.4F) {
               float $$0 = (float)this.dh();
               int $$1 = (int)(ami.a((this.ck - 0.4F) * (float) Math.PI) * 7.0F);
               dwq $$2 = this.dd();

               for(int $$3 = 0; $$3 < $$1; ++$$3) {
                  float $$4 = (this.R.i() * 2.0F - 1.0F) * this.cW() * 0.5F;
                  float $$5 = (this.R.i() * 2.0F - 1.0F) * this.cW() * 0.5F;
                  this.s.a(io.af, this.df() + (double)$$4, (double)($$0 + 0.8F), this.dl() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }

      }
   }

   private void fW() {
      this.cj = false;
      this.ck = 0.0F;
      this.cl = 0.0F;
   }

   @Override
   public void a(baw $$0) {
      this.ci = false;
      this.cj = false;
      this.cl = 0.0F;
      this.ck = 0.0F;
      super.a($$0);
   }

   public boolean fS() {
      return this.ci;
   }

   public float y(float $$0) {
      return Math.min(0.5F + ami.i($$0, this.cl, this.ck) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ami.i($$0, this.cl, this.ck) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ami.a($$2 * (float) Math.PI) * ami.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float z(float $$0) {
      return ami.i($$0, this.ch, this.cg) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int U() {
      return this.fJ() ? 20 : super.U();
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bbn $$2 = $$0.m();
         if (!this.s.y) {
            this.y(false);
         }

         if ($$2 != null && !($$2 instanceof buc) && !($$2 instanceof bui)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = $$0.a(baw.c(this), (float)((int)this.b(bdd.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void w(boolean $$0) {
      super.w($$0);
      if ($$0) {
         this.a(bdd.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bdd.a).a(8.0);
      }

      this.a(bdd.f).a(4.0);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      cat $$3 = $$2.c();
      if (this.s.y) {
         boolean $$4 = this.k($$0) || this.q() || $$2.a(caz.pI) && !this.q() && !this.I_();
         return $$4 ? baj.b : baj.d;
      } else {
         if (this.q()) {
            if (this.n($$2) && this.ef() < this.et()) {
               if (!$$0.fB().d) {
                  $$2.g(1);
               }

               this.b((float)$$3.w().a());
               return baj.a;
            }

            if (!($$3 instanceof bzr)) {
               baj $$6 = super.b($$0, $$1);
               if ((!$$6.a() || this.y_()) && this.k($$0)) {
                  this.y(!this.fL());
                  this.bn = false;
                  this.bR.n();
                  this.h(null);
                  return baj.a;
               }

               return $$6;
            }

            bzq $$5 = ((bzr)$$3).d();
            if ($$5 != this.fU()) {
               this.a($$5);
               if (!$$0.fB().d) {
                  $$2.g(1);
               }

               return baj.a;
            }
         } else if ($$2.a(caz.pI) && !this.I_()) {
            if (!$$0.fB().d) {
               $$2.g(1);
            }

            if (this.R.a(3) == 0) {
               this.e($$0);
               this.bR.n();
               this.h(null);
               this.y(true);
               this.s.a(this, (byte)7);
            } else {
               this.s.a(this, (byte)6);
            }

            return baj.a;
         }

         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 8) {
         this.cj = true;
         this.ck = 0.0F;
         this.cl = 0.0F;
      } else if ($$0 == 56) {
         this.fW();
      } else {
         super.a($$0);
      }

   }

   public float fT() {
      if (this.I_()) {
         return 1.5393804F;
      } else {
         return this.q() ? (0.55F - (this.et() - this.ef()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean n(cax $$0) {
      cat $$1 = $$0.c();
      return $$1.v() && $$1.w().c();
   }

   @Override
   public int fo() {
      return 8;
   }

   @Override
   public int a() {
      return this.Y.a(cd);
   }

   @Override
   public void a(int $$0) {
      this.Y.b(cd, $$0);
   }

   @Override
   public void c() {
      this.a(cm.a(this.R));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cn;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cn = $$0;
   }

   public bzq fU() {
      return bzq.a(this.Y.a(cc));
   }

   public void a(bzq $$0) {
      this.Y.b(cc, $$0.a());
   }

   public boh b(agg $$0, bbk $$1) {
      boh $$2 = bbr.bh.a((cgx)$$0);
      UUID $$3 = this.d();
      if ($$3 != null) {
         $$2.b($$3);
         $$2.w(true);
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.Y.b(cb, $$0);
   }

   @Override
   public boolean a(bne $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof boh)) {
         return false;
      } else {
         boh $$1 = (boh)$$0;
         if (!$$1.q()) {
            return false;
         } else if ($$1.fJ()) {
            return false;
         } else {
            return this.fP() && $$1.fP();
         }
      }
   }

   public boolean fV() {
      return this.Y.a(cb);
   }

   @Override
   public boolean a(bcc $$0, bcc $$1) {
      if ($$0 instanceof brc || $$0 instanceof brk) {
         return false;
      } else if ($$0 instanceof boh $$2) {
         return !$$2.q() || $$2.fK() != $$1;
      } else if ($$0 instanceof buc && $$1 instanceof buc && !((buc)$$1).a((buc)$$0)) {
         return false;
      } else if ($$0 instanceof bpa && ((bpa)$$0).fS()) {
         return false;
      } else {
         return !($$0 instanceof bcw) || !((bcw)$$0).q();
      }
   }

   @Override
   public boolean a(buc $$0) {
      return !this.I_() && super.a($$0);
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.6F * this.cA()), (double)(this.cW() * 0.4F));
   }

   public static boolean c(bbr<boh> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bL) && a($$1, $$3);
   }

   class a<T extends bcc> extends bhw<T> {
      private final boh j;

      public a(boh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         if (super.a() && this.b instanceof bpd) {
            return !this.j.q() && this.a((bpd)this.b);
         } else {
            return false;
         }
      }

      private boolean a(bpd $$0) {
         return $$0.gp() >= boh.this.R.a(5);
      }

      @Override
      public void c() {
         boh.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         boh.this.h(null);
         super.e();
      }
   }

   class b extends bji {
      public b(double $$0) {
         super(boh.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dp() || this.b.bH();
      }
   }
}
