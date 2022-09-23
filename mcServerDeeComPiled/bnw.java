import java.util.UUID;
import javax.annotation.Nullable;

public class bnw extends bne implements bcj {
   private static final aaj<Boolean> bX = aam.a(bnw.class, aal.i);
   private static final float bY = 6.0F;
   private float ca;
   private float cb;
   private int cc;
   private static final azu cd = anc.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public bnw(bbr<? extends bnw> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public bbk a(agg $$0, bbk $$1) {
      return bbr.au.a((cgx)$$0);
   }

   @Override
   public boolean n(cax $$0) {
      return false;
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bnw.c());
      this.bS.a(1, new bnw.d());
      this.bS.a(4, new bio(this, 1.25));
      this.bS.a(5, new bjl(this, 1.0));
      this.bS.a(6, new bix(this, buc.class, 6.0F));
      this.bS.a(7, new bjk(this));
      this.bT.a(1, new bnw.b());
      this.bT.a(2, new bnw.a());
      this.bT.a(3, new bkh(this, buc.class, 10, true, false, this::a_));
      this.bT.a(4, new bkh(this, bno.class, 10, true, true, null));
      this.bT.a(5, new bkn<>(this, false));
   }

   public static bdc.a q() {
      return bce.w().a(bdd.a, 30.0).a(bdd.b, 20.0).a(bdd.d, 0.25).a(bdd.f, 6.0);
   }

   public static boolean c(bbr<bnw> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      hc<cht> $$5 = $$1.w($$3);
      if (!$$5.a(akk.aj)) {
         return b($$0, $$1, $$2, $$3, $$4);
      } else {
         return a($$1, $$3) && $$1.a_($$3.c()).a(akl.bI);
      }
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(this.s, $$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.R));
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   protected ajv r() {
      return this.y_() ? ajw.qd : ajw.qc;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.qf;
   }

   @Override
   protected ajv x_() {
      return ajw.qe;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.qg, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cc <= 0) {
         this.a(ajw.qh, 1.0F, this.eD());
         this.cc = 40;
      }

   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, false);
   }

   @Override
   public void k() {
      super.k();
      if (this.s.y) {
         if (this.cb != this.ca) {
            this.z_();
         }

         this.ca = this.cb;
         if (this.fJ()) {
            this.cb = ami.a(this.cb + 1.0F, 0.0F, 6.0F);
         } else {
            this.cb = ami.a(this.cb - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cc > 0) {
         --this.cc;
      }

      if (!this.s.y) {
         this.a((agg)this.s, true);
      }

   }

   @Override
   public bbo a(bco $$0) {
      if (this.cb > 0.0F) {
         float $$1 = this.cb / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
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

   public boolean fJ() {
      return this.Y.a(bX);
   }

   public void v(boolean $$0) {
      this.Y.b(bX, $$0);
   }

   public float y(float $$0) {
      return ami.i($$0, this.ca, this.cb) / 6.0F;
   }

   @Override
   protected float eJ() {
      return 0.98F;
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$3 == null) {
         $$3 = new bbk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bkh<buc> {
      public a() {
         super(bnw.this, buc.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bnw.this.y_()) {
            return false;
         } else {
            if (super.a()) {
               for(bnw $$1 : bnw.this.s.a(bnw.class, bnw.this.cy().c(8.0, 4.0, 8.0))) {
                  if ($$1.y_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends bkg {
      public b() {
         super(bnw.this);
      }

      @Override
      public void c() {
         super.c();
         if (bnw.this.y_()) {
            this.h();
            this.d();
         }

      }

      @Override
      protected void a(bce $$0, bcc $$1) {
         if ($$0 instanceof bnw && !$$0.y_()) {
            super.a($$0, $$1);
         }

      }
   }

   class c extends biz {
      public c() {
         super(bnw.this, 1.25, true);
      }

      @Override
      protected void a(bcc $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.z($$0);
            bnw.this.v(false);
         } else if ($$1 <= $$2 * 2.0) {
            if (this.i()) {
               bnw.this.v(false);
               this.h();
            }

            if (this.k() <= 10) {
               bnw.this.v(true);
               bnw.this.t();
            }
         } else {
            this.h();
            bnw.this.v(false);
         }

      }

      @Override
      public void d() {
         bnw.this.v(false);
         super.d();
      }

      @Override
      protected double a(bcc $$0) {
         return (double)(4.0F + $$0.cW());
      }
   }

   class d extends bji {
      public d() {
         super(bnw.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.dR() != null && this.b.y_() || this.b.bH();
      }
   }
}
