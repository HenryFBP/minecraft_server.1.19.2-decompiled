public class bun extends bbn implements bur {
   private static final aaj<cax> b = aam.a(bun.class, aal.g);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean ao;

   public bun(bbr<? extends bun> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bun(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.D, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(cax $$0) {
      if (!$$0.a(caz.qA) || $$0.t()) {
         this.ai().b(b, ad.a($$0.o(), $$0x -> $$0x.e(1)));
      }

   }

   private cax i() {
      return this.ai().a(b);
   }

   @Override
   public cax h() {
      cax $$0 = this.i();
      return $$0.b() ? new cax(caz.qA) : $$0;
   }

   @Override
   protected void a_() {
      this.ai().a(b, cax.b);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cy().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(gt $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.df();
      double $$5 = $$3 - this.dl();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.df() + $$4 / $$6 * 12.0;
         this.e = this.dl() + $$5 / $$6 * 12.0;
         this.d = this.dh() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.ao = this.R.a(5) > 0;
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.x == 0.0F && this.w == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.o((float)(ami.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.p((float)(ami.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.w = this.dq();
         this.x = this.ds();
      }

   }

   @Override
   public void k() {
      super.k();
      dwq $$0 = this.dd();
      double $$1 = this.df() + $$0.c;
      double $$2 = this.dh() + $$0.d;
      double $$3 = this.dl() + $$0.e;
      double $$4 = $$0.h();
      this.p(buu.d(this.x, (float)(ami.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.o(buu.d(this.w, (float)(ami.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.s.y) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ami.d($$6, $$5);
         double $$9 = ami.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dh() < this.d ? 1 : -1;
         $$0 = new dwq(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aR()) {
         for(int $$13 = 0; $$13 < 4; ++$$13) {
            this.s.a(io.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.s
            .a(io.W, $$1 - $$0.c * 0.25 + this.R.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.R.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.s.y) {
         this.e($$1, $$2, $$3);
         ++this.f;
         if (this.f > 80 && !this.s.y) {
            this.a(ajw.fB, 1.0F, 1.0F);
            this.ah();
            if (this.ao) {
               this.s.b(new bqv(this.s, this.df(), this.dh(), this.dl(), this.h()));
            } else {
               this.s.c(2003, this.da(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }

   }

   @Override
   public void b(pj $$0) {
      cax $$1 = this.i();
      if (!$$1.b()) {
         $$0.a("Item", (qc)$$1.b(new pj()));
      }

   }

   @Override
   public void a(pj $$0) {
      cax $$1 = cax.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Override
   public boolean ch() {
      return false;
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }
}
