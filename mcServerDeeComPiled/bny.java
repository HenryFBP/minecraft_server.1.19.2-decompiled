import javax.annotation.Nullable;

public class bny extends bne {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.0;
   public static final double cb = 2.2;
   public static final double cc = 1.4;
   private static final aaj<Integer> cm = aam.a(bny.class, aal.b);
   public static final int cd = 0;
   public static final int ce = 1;
   public static final int cf = 2;
   public static final int cg = 3;
   public static final int ch = 4;
   public static final int ci = 5;
   public static final int cj = 99;
   private static final abb cn = new abb("killer_bunny");
   public static final int ck = 8;
   public static final int cl = 8;
   private static final int co = 40;
   private int cp;
   private int cq;
   private boolean cr;
   private int cs;
   int ct;

   public bny(bbr<? extends bny> $$0, cgx $$1) {
      super($$0, $$1);
      this.bQ = new bny.d(this);
      this.bP = new bny.e(this);
      this.i(0.0);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bij(this));
      this.bS.a(1, new bie(this, this.s));
      this.bS.a(1, new bny.f(this, 2.2));
      this.bS.a(2, new bib(this, 0.8));
      this.bS.a(3, new bjw(this, 1.0, cdm.a(caz.sc, caz.sh, cju.bE), false));
      this.bS.a(4, new bny.b(this, buc.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new bny.b(this, boh.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new bny.b(this, brq.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new bny.g(this));
      this.bS.a(6, new bkb(this, 0.6));
      this.bS.a(11, new bix(this, buc.class, 10.0F));
   }

   @Override
   protected float eF() {
      if (!this.z && (!this.bP.b() || !(this.bP.e() > this.dh() + 0.5))) {
         dql $$0 = this.bR.j();
         if ($$0 != null && !$$0.c()) {
            dwq $$1 = $$0.a(this);
            if ($$1.d > this.dh() + 0.5) {
               return 0.5F;
            }
         }

         return this.bP.c() <= 0.6 ? 0.2F : 0.3F;
      } else {
         return 0.5F;
      }
   }

   @Override
   protected void eH() {
      super.eH();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dd().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new dwq(0.0, 0.0, 1.0));
         }
      }

      if (!this.s.y) {
         this.s.a(this, (byte)1);
      }

   }

   public float y(float $$0) {
      return this.cq == 0 ? 0.0F : ((float)this.cp + $$0) / (float)this.cq;
   }

   public void i(double $$0) {
      this.D().a($$0);
      this.bP.a(this.bP.d(), this.bP.e(), this.bP.f(), $$0);
   }

   @Override
   public void q(boolean $$0) {
      super.q($$0);
      if ($$0) {
         this.a(this.fJ(), this.eC(), ((this.R.i() - this.R.i()) * 0.2F + 1.0F) * 0.8F);
      }

   }

   public void q() {
      this.q(true);
      this.cq = 10;
      this.cp = 0;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cm, 0);
   }

   @Override
   public void T() {
      if (this.cs > 0) {
         --this.cs;
      }

      if (this.ct > 0) {
         this.ct -= this.R.a(3);
         if (this.ct < 0) {
            this.ct = 0;
         }
      }

      if (this.y) {
         if (!this.cr) {
            this.q(false);
            this.fT();
         }

         if (this.fK() == 99 && this.cs == 0) {
            bcc $$0 = this.G();
            if ($$0 != null && this.f((bbn)$$0) < 16.0) {
               this.b($$0.df(), $$0.dl());
               this.bP.a($$0.df(), $$0.dh(), $$0.dl(), this.bP.c());
               this.q();
               this.cr = true;
            }
         }

         bny.d $$1 = (bny.d)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cs == 0) {
               dql $$2 = this.bR.j();
               dwq $$3 = new dwq(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.b($$3.c, $$3.e);
               this.q();
            }
         } else if (!$$1.d()) {
            this.fL();
         }
      }

      this.cr = this.y;
   }

   @Override
   public boolean bd() {
      return false;
   }

   private void b(double $$0, double $$1) {
      this.o((float)(ami.d($$1 - this.dl(), $$0 - this.df()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void fL() {
      ((bny.d)this.bQ).a(true);
   }

   private void fR() {
      ((bny.d)this.bQ).a(false);
   }

   private void fS() {
      if (this.bP.c() < 2.2) {
         this.cs = 10;
      } else {
         this.cs = 1;
      }

   }

   private void fT() {
      this.fS();
      this.fR();
   }

   @Override
   public void w_() {
      super.w_();
      if (this.cp != this.cq) {
         ++this.cp;
      } else if (this.cq != 0) {
         this.cp = 0;
         this.cq = 0;
         this.q(false);
      }

   }

   public static bdc.a t() {
      return bce.w().a(bdd.a, 3.0).a(bdd.d, 0.3F);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.fK());
      $$0.a("MoreCarrotTicks", this.ct);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.t($$0.h("RabbitType"));
      this.ct = $$0.h("MoreCarrotTicks");
   }

   protected ajv fJ() {
      return ajw.qH;
   }

   @Override
   protected ajv r() {
      return ajw.qD;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.qG;
   }

   @Override
   protected ajv x_() {
      return ajw.qF;
   }

   @Override
   public boolean z(bbn $$0) {
      if (this.fK() == 99) {
         this.a(ajw.qE, 1.0F, (this.R.i() - this.R.i()) * 0.2F + 1.0F);
         return $$0.a(baw.c(this), 8.0F);
      } else {
         return $$0.a(baw.c(this), 3.0F);
      }
   }

   @Override
   public ajx cR() {
      return this.fK() == 99 ? ajx.f : ajx.g;
   }

   private static boolean m(cax $$0) {
      return $$0.a(caz.sc) || $$0.a(caz.sh) || $$0.a(cju.bE.l());
   }

   public bny b(agg $$0, bbk $$1) {
      bny $$2 = bbr.ax.a((cgx)$$0);
      int $$3 = this.a($$0);
      if (this.R.a(20) != 0) {
         if ($$1 instanceof bny && this.R.h()) {
            $$3 = ((bny)$$1).fK();
         } else {
            $$3 = this.fK();
         }
      }

      $$2.t($$3);
      return $$2;
   }

   @Override
   public boolean n(cax $$0) {
      return m($$0);
   }

   public int fK() {
      return this.Y.a(cm);
   }

   public void t(int $$0) {
      if ($$0 == 99) {
         this.a(bdd.i).a(8.0);
         this.bS.a(4, new bny.a(this));
         this.bT.a(1, new bkg(this).a());
         this.bT.a(2, new bkh(this, buc.class, true));
         this.bT.a(2, new bkh(this, boh.class, true));
         if (!this.Y()) {
            this.b(rq.c(ad.a("entity", cn)));
         }
      }

      this.Y.b(cm, $$0);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      int $$5 = this.a($$0);
      if ($$3 instanceof bny.c) {
         $$5 = ((bny.c)$$3).a;
      } else {
         $$3 = new bny.c($$5);
      }

      this.t($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private int a(cgy $$0) {
      hc<cht> $$1 = $$0.w(this.da());
      int $$2 = $$0.r_().a(100);
      if ($$1.a().c() == cht.c.c) {
         return $$2 < 80 ? 1 : 3;
      } else if ($$1.a(akk.ag)) {
         return 4;
      } else {
         return $$2 < 50 ? 0 : ($$2 < 90 ? 5 : 2);
      }
   }

   public static boolean c(bbr<bny> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bJ) && a($$1, $$3);
   }

   boolean fU() {
      return this.ct == 0;
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 1) {
         this.be();
         this.cq = 10;
         this.cp = 0;
      } else {
         super.a($$0);
      }

   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.6F * this.cA()), (double)(this.cW() * 0.4F));
   }

   static class a extends biz {
      public a(bny $$0) {
         super($$0, 1.4, true);
      }

      @Override
      protected double a(bcc $$0) {
         return (double)(4.0F + $$0.cW());
      }
   }

   static class b<T extends bcc> extends bhw<T> {
      private final bny i;

      public b(bny $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.fK() != 99 && super.a();
      }
   }

   public static class c extends bbk.a {
      public final int a;

      public c(int $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class d extends bhq {
      private final bny b;
      private boolean c;

      public d(bny $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.q();
            this.a = false;
         }

      }
   }

   static class e extends bhs {
      private final bny l;
      private double m;

      public e(bny $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.y && !this.l.bn && !((bny.d)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.aR()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }

      }
   }

   static class f extends bji {
      private final bny h;

      public f(bny $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class g extends bjc {
      private final bny g;
      private boolean h;
      private boolean i;

      public g(bny $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.s.W().b(cgt.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.fU();
            this.h = true;
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.z().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.U());
         if (this.m()) {
            cgx $$0 = this.g.s;
            gt $$1 = this.e.b();
            cvo $$2 = $$0.a_($$1);
            cjt $$3 = $$2.b();
            if (this.i && $$3 instanceof cki) {
               int $$4 = $$2.c(cki.d);
               if ($$4 == 0) {
                  $$0.a($$1, cju.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cki.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.c(2001, $$1, cjt.i($$2));
               }

               this.g.ct = 40;
            }

            this.i = false;
            this.c = 10;
         }

      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         cvo $$2 = $$0.a_($$1);
         if ($$2.a(cju.cn) && this.h && !this.i) {
            $$2 = $$0.a_($$1.b());
            if ($$2.b() instanceof cki && ((cki)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }
}
