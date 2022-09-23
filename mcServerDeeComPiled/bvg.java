import javax.annotation.Nullable;

public class bvg extends bui {
   private static final aaj<Byte> ao = aam.a(bvg.class, aal.a);
   private static final aaj<Boolean> ap = aam.a(bvg.class, aal.i);
   private cax aq = new cax(caz.tI);
   private boolean ar;
   public int f;

   public bvg(bbr<? extends bvg> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvg(cgx $$0, bcc $$1, cax $$2) {
      super(bbr.aU, $$1, $$0);
      this.aq = $$2.o();
      this.Y.b(ao, (byte)cet.f($$2));
      this.Y.b(ap, $$2.A());
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ao, (byte)0);
      this.Y.a(ap, false);
   }

   @Override
   public void k() {
      if (this.c > 4) {
         this.ar = true;
      }

      bbn $$0 = this.x();
      int $$1 = this.Y.a(ao);
      if ($$1 > 0 && (this.ar || this.u()) && $$0 != null) {
         if (!this.C()) {
            if (!this.s.y && this.d == bui.a.b) {
               this.a(this.l(), 0.1F);
            }

            this.ah();
         } else {
            this.p(true);
            dwq $$2 = $$0.bj().d(this.cY());
            this.o(this.df(), this.dh() + $$2.d * 0.015 * (double)$$1, this.dl());
            if (this.s.y) {
               this.N = this.dh();
            }

            double $$3 = 0.05 * (double)$$1;
            this.f(this.dd().a(0.95).e($$2.d().a($$3)));
            if (this.f == 0) {
               this.a(ajw.uN, 10.0F, 1.0F);
            }

            ++this.f;
         }
      }

      super.k();
   }

   private boolean C() {
      bbn $$0 = this.x();
      if ($$0 == null || !$$0.bo()) {
         return false;
      } else {
         return !($$0 instanceof agh) || !$$0.B_();
      }
   }

   @Override
   protected cax l() {
      return this.aq.o();
   }

   @Override
   public boolean w() {
      return this.Y.a(ap);
   }

   @Nullable
   @Override
   protected dwn a(dwq $$0, dwq $$1) {
      return this.ar ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(dwn $$0) {
      bbn $$1 = $$0.a();
      float $$2 = 8.0F;
      if ($$1 instanceof bcc $$3) {
         $$2 += cet.a(this.aq, $$3.ey());
      }

      bbn $$4 = this.x();
      baw $$5 = baw.a(this, (bbn)($$4 == null ? this : $$4));
      this.ar = true;
      ajv $$6 = ajw.uL;
      if ($$1.a($$5, $$2)) {
         if ($$1.ad() == bbr.y) {
            return;
         }

         if ($$1 instanceof bcc $$7) {
            if ($$4 instanceof bcc) {
               cet.a($$7, $$4);
               cet.b((bcc)$$4, $$7);
            }

            this.a($$7);
         }
      }

      this.f(this.dd().d(-0.01, -0.1, -0.01));
      float $$8 = 1.0F;
      if (this.s instanceof agg && this.s.X() && this.A()) {
         gt $$9 = $$1.da();
         if (this.s.g($$9)) {
            bcb $$10 = bbr.X.a(this.s);
            $$10.d(dwq.c($$9));
            $$10.b($$4 instanceof agh ? (agh)$$4 : null);
            this.s.b($$10);
            $$6 = ajw.uS;
            $$8 = 5.0F;
         }
      }

      this.a($$6, $$8, 1.0F);
   }

   public boolean A() {
      return cet.h(this.aq);
   }

   @Override
   protected boolean a(buc $$0) {
      return super.a($$0) || this.u() && this.d($$0) && $$0.fA().e(this.l());
   }

   @Override
   protected ajv i() {
      return ajw.uM;
   }

   @Override
   public void b_(buc $$0) {
      if (this.d($$0) || this.x() == null) {
         super.b_($$0);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Trident", 10)) {
         this.aq = cax.a($$0.p("Trident"));
      }

      this.ar = $$0.q("DealtDamage");
      this.Y.b(ao, (byte)cet.f(this.aq));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Trident", (qc)this.aq.b(new pj()));
      $$0.a("DealtDamage", this.ar);
   }

   @Override
   public void h() {
      int $$0 = this.Y.a(ao);
      if (this.d != bui.a.b || $$0 <= 0) {
         super.h();
      }

   }

   @Override
   protected float t() {
      return 0.99F;
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return true;
   }
}
