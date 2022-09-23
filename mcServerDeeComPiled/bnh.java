import javax.annotation.Nullable;

public class bnh extends bcw {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.33;
   private static final cdm cd = cdm.a(caz.pi, caz.pj);
   private static final aaj<bni> ce = aam.a(bnh.class, aal.u);
   private static final aaj<Boolean> cf = aam.a(bnh.class, aal.i);
   private static final aaj<Boolean> cg = aam.a(bnh.class, aal.i);
   private static final aaj<Integer> ch = aam.a(bnh.class, aal.b);
   private bnh.a<buc> ci;
   @Nullable
   private bjw cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;

   public bnh(bbr<? extends bnh> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public abb fR() {
      return this.fS().a();
   }

   @Override
   protected void u() {
      this.cj = new bnh.c(this, 0.6, cd, true);
      this.bS.a(1, new bij(this));
      this.bS.a(1, new bjt(this));
      this.bS.a(2, new bnh.b(this));
      this.bS.a(3, this.cj);
      this.bS.a(5, new bic(this, 1.1, 8));
      this.bS.a(6, new bin(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new bid(this, 0.8));
      this.bS.a(8, new biv(this, 0.3F));
      this.bS.a(9, new bjf(this));
      this.bS.a(10, new bib(this, 0.8));
      this.bS.a(11, new bkb(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new bix(this, buc.class, 10.0F));
      this.bT.a(1, new bkk(this, bny.class, false, null));
      this.bT.a(1, new bkk(this, bof.class, false, bof.bY));
   }

   public bni fS() {
      return this.Y.a(ce);
   }

   public void a(bni $$0) {
      this.Y.b(ce, $$0);
   }

   public void z(boolean $$0) {
      this.Y.b(cf, $$0);
   }

   public boolean fT() {
      return this.Y.a(cf);
   }

   public void A(boolean $$0) {
      this.Y.b(cg, $$0);
   }

   public boolean fU() {
      return this.Y.a(cg);
   }

   public bzq fV() {
      return bzq.a(this.Y.a(ch));
   }

   public void a(bzq $$0) {
      this.Y.b(ch, $$0.a());
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ce, bni.b);
      this.Y.a(cf, false);
      this.Y.a(cg, false);
      this.Y.a(ch, bzq.o.a());
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("variant", hm.bK.b(this.fS()).toString());
      $$0.a("CollarColor", (byte)this.fV().a());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      bni $$1 = (bni)hm.bK.a(abb.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(bzq.a($$0.h("CollarColor")));
      }

   }

   @Override
   public void T() {
      if (this.A().b()) {
         double $$0 = this.A().c();
         if ($$0 == 0.6) {
            this.b(bco.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bco.a);
            this.g(true);
         } else {
            this.b(bco.a);
            this.g(false);
         }
      } else {
         this.b(bco.a);
         this.g(false);
      }

   }

   @Nullable
   @Override
   protected ajv r() {
      if (this.q()) {
         if (this.fP()) {
            return ajw.cK;
         } else {
            return this.R.a(4) == 0 ? ajw.cL : ajw.cD;
         }
      } else {
         return ajw.cE;
      }
   }

   @Override
   public int J() {
      return 120;
   }

   public void fW() {
      this.a(ajw.cH, this.eC(), this.eD());
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.cJ;
   }

   @Override
   protected ajv x_() {
      return ajw.cF;
   }

   public static bdc.a fX() {
      return bce.w().a(bdd.a, 10.0).a(bdd.d, 0.3F).a(bdd.f, 3.0);
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      return false;
   }

   @Override
   protected void a(buc $$0, bai $$1, cax $$2) {
      if (this.n($$2)) {
         this.a(ajw.cG, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float fY() {
      return (float)this.b(bdd.f);
   }

   @Override
   public boolean z(bbn $$0) {
      return $$0.a(baw.c(this), this.fY());
   }

   @Override
   public void k() {
      super.k();
      if (this.cj != null && this.cj.i() && !this.q() && this.S % 100 == 0) {
         this.a(ajw.cI, 1.0F, 1.0F);
      }

      this.fZ();
   }

   private void fZ() {
      if ((this.fT() || this.fU()) && this.S % 5 == 0) {
         this.a(ajw.cK, 0.6F + 0.4F * (this.R.i() - this.R.i()), 1.0F);
      }

      this.ga();
      this.gb();
   }

   private void ga() {
      this.cl = this.ck;
      this.cn = this.cm;
      if (this.fT()) {
         this.ck = Math.min(1.0F, this.ck + 0.15F);
         this.cm = Math.min(1.0F, this.cm + 0.08F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.22F);
         this.cm = Math.max(0.0F, this.cm - 0.13F);
      }

   }

   private void gb() {
      this.cp = this.co;
      if (this.fU()) {
         this.co = Math.min(1.0F, this.co + 0.1F);
      } else {
         this.co = Math.max(0.0F, this.co - 0.13F);
      }

   }

   public float y(float $$0) {
      return ami.i($$0, this.cl, this.ck);
   }

   public float z(float $$0) {
      return ami.i($$0, this.cn, this.cm);
   }

   public float A(float $$0) {
      return ami.i($$0, this.cp, this.co);
   }

   public bnh b(agg $$0, bbk $$1) {
      bnh $$2 = bbr.l.a((cgx)$$0);
      if ($$1 instanceof bnh) {
         if (this.R.h()) {
            $$2.a(this.fS());
         } else {
            $$2.a(((bnh)$$1).fS());
         }

         if (this.q()) {
            $$2.b(this.d());
            $$2.w(true);
            if (this.R.h()) {
               $$2.a(this.fV());
            } else {
               $$2.a(((bnh)$$1).fV());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bne $$0) {
      if (!this.q()) {
         return false;
      } else if (!($$0 instanceof bnh)) {
         return false;
      } else {
         bnh $$1 = (bnh)$$0;
         return $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.al() > 0.9F;
      akz<bni> $$6 = $$5 ? akm.b : akm.a;
      hm.bK.c($$6).flatMap($$1x -> $$1x.a($$0.r_())).ifPresent($$0x -> this.a((bni)$$0x.a()));
      agg $$7 = $$0.D();
      if ($$7.a().a(this.da(), akv.g).b()) {
         this.a(bni.k);
         this.fp();
      }

      return $$3;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      cat $$3 = $$2.c();
      if (this.s.y) {
         if (this.q() && this.k($$0)) {
            return baj.a;
         } else {
            return !this.n($$2) || !(this.ef() < this.et()) && this.q() ? baj.d : baj.a;
         }
      } else {
         if (this.q()) {
            if (this.k($$0)) {
               if (!($$3 instanceof bzr)) {
                  if ($$3.v() && this.n($$2) && this.ef() < this.et()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.w().a());
                     return baj.b;
                  }

                  baj $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.y_()) {
                     this.y(!this.fL());
                  }

                  return $$5;
               }

               bzq $$4 = ((bzr)$$3).d();
               if ($$4 != this.fV()) {
                  this.a($$4);
                  if (!$$0.fB().d) {
                     $$2.g(1);
                  }

                  this.fp();
                  return baj.b;
               }
            }
         } else if (this.n($$2)) {
            this.a($$0, $$1, $$2);
            if (this.R.a(3) == 0) {
               this.e($$0);
               this.y(true);
               this.s.a(this, (byte)7);
            } else {
               this.s.a(this, (byte)6);
            }

            this.fp();
            return baj.b;
         }

         baj $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fp();
         }

         return $$6;
      }
   }

   @Override
   public boolean n(cax $$0) {
      return cd.a($$0);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.S > 2400;
   }

   @Override
   protected void t() {
      if (this.ci == null) {
         this.ci = new bnh.a<>(this, buc.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ci);
      if (!this.q()) {
         this.bS.a(4, this.ci);
      }

   }

   @Override
   public boolean bM() {
      return this.bQ() || super.bM();
   }

   static class a<T extends bcc> extends bhw<T> {
      private final bnh i;

      public a(bnh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bbq.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.q() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }
   }

   static class b extends bip {
      private final bnh a;
      @Nullable
      private buc b;
      @Nullable
      private gt c;
      private int d;

      public b(bnh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.fL()) {
            return false;
         } else {
            bcc $$0 = this.a.fK();
            if ($$0 instanceof buc) {
               this.b = (buc)$$0;
               if (!$$0.fj()) {
                  return false;
               }

               if (this.a.f((bbn)this.b) > 100.0) {
                  return false;
               }

               gt $$1 = this.b.da();
               cvo $$2 = this.a.s.a_($$1);
               if ($$2.a(akl.N)) {
                  this.c = (gt)$$2.d(cjm.aD).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new gt($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for(bnh $$1 : this.a.s.a(bnh.class, new dwl(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.fT() || $$1.fU())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.q() && !this.a.fL() && this.b != null && this.b.fj() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.D().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }

      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.s.f(1.0F);
         if (this.b.fE() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.s.r_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.D().n();
      }

      private void i() {
         amn $$0 = this.a.dQ();
         gt.a $$1 = new gt.a();
         $$1.g(this.a.da());
         this.a.a((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.da());
         dsg $$2 = this.a.s.n().aH().a(dry.am);
         dsd.a $$3 = new dsd.a((agg)this.a.s).a(dul.f, this.a.cY()).a(dul.a, this.a).a($$0);

         for(cax $$5 : $$2.a($$3.a(duk.g))) {
            this.a
               .s
               .b(
                  new bqv(
                     this.a.s,
                     (double)$$1.u() - (double)ami.a(this.a.aX * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)ami.b(this.a.aX * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }

      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.D().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((bbn)this.b) < 2.5) {
               ++this.d;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }

      }
   }

   static class c extends bjw {
      @Nullable
      private buc c;
      private final bnh d;

      public c(bnh $$0, double $$1, cdm $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.dQ().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dQ().a(this.a(500)) == 0) {
            this.c = null;
         }

      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.q();
      }
   }
}
