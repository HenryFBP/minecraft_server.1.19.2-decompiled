import javax.annotation.Nullable;

public class cud extends cti implements baa, bam {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 0;
   public static final int d = 1;
   private final bac e = new bac() {
      @Override
      public int b() {
         return 1;
      }

      @Override
      public boolean c() {
         return cud.this.g.b();
      }

      @Override
      public cax a(int $$0) {
         return $$0 == 0 ? cud.this.g : cax.b;
      }

      @Override
      public cax a(int $$0, int $$1) {
         if ($$0 == 0) {
            cax $$2 = cud.this.g.a($$1);
            if (cud.this.g.b()) {
               cud.this.j();
            }

            return $$2;
         } else {
            return cax.b;
         }
      }

      @Override
      public cax b(int $$0) {
         if ($$0 == 0) {
            cax $$1 = cud.this.g;
            cud.this.g = cax.b;
            cud.this.j();
            return $$1;
         } else {
            return cax.b;
         }
      }

      @Override
      public void a(int $$0, cax $$1) {
      }

      @Override
      public int O_() {
         return 1;
      }

      @Override
      public void e() {
         cud.this.e();
      }

      @Override
      public boolean a(buc $$0) {
         if (cud.this.n.c_(cud.this.o) != cud.this) {
            return false;
         } else {
            return $$0.h((double)cud.this.o.u() + 0.5, (double)cud.this.o.v() + 0.5, (double)cud.this.o.w() + 0.5) > 64.0 ? false : cud.this.f();
         }
      }

      @Override
      public boolean b(int $$0, cax $$1) {
         return false;
      }

      @Override
      public void a() {
      }
   };
   private final bww f = new bww() {
      @Override
      public int a(int $$0) {
         return $$0 == 0 ? cud.this.h : 0;
      }

      @Override
      public void a(int $$0, int $$1) {
         if ($$0 == 0) {
            cud.this.a($$1);
         }

      }

      @Override
      public int a() {
         return 1;
      }
   };
   cax g = cax.b;
   int h;
   private int i;

   public cud(gt $$0, cvo $$1) {
      super(ctk.C, $$0, $$1);
   }

   public cax c() {
      return this.g;
   }

   public boolean f() {
      return this.g.a(caz.rX) || this.g.a(caz.rY);
   }

   public void a(cax $$0) {
      this.a($$0, null);
   }

   void j() {
      this.h = 0;
      this.i = 0;
      cnu.a(this.k(), this.p(), this.q(), false);
   }

   public void a(cax $$0, @Nullable buc $$1) {
      this.g = this.b($$0, $$1);
      this.h = 0;
      this.i = ccr.k(this.g);
      this.e();
   }

   void a(int $$0) {
      int $$1 = ami.a($$0, 0, this.i - 1);
      if ($$1 != this.h) {
         this.h = $$1;
         this.e();
         cnu.a(this.k(), this.p(), this.q());
      }

   }

   public int g() {
      return this.h;
   }

   public int i() {
      float $$0 = this.i > 1 ? (float)this.g() / ((float)this.i - 1.0F) : 1.0F;
      return ami.d($$0 * 14.0F) + (this.f() ? 1 : 0);
   }

   private cax b(cax $$0, @Nullable buc $$1) {
      if (this.n instanceof agg && $$0.a(caz.rY)) {
         ccr.a($$0, this.a($$1), $$1);
      }

      return $$0;
   }

   private dr a(@Nullable buc $$0) {
      String $$1;
      rq $$2;
      if ($$0 == null) {
         $$1 = "Lectern";
         $$2 = rq.b("Lectern");
      } else {
         $$1 = $$0.X().getString();
         $$2 = $$0.C_();
      }

      dwq $$5 = dwq.a(this.o);
      return new dr(dq.a, $$5, dwp.a, (agg)this.n, 2, $$1, $$2, this.n.n(), $$0);
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Book", 10)) {
         this.g = this.b(cax.a($$0.p("Book")), null);
      } else {
         this.g = cax.b;
      }

      this.i = ccr.k(this.g);
      this.h = ami.a($$0.h("Page"), 0, this.i - 1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.c().b()) {
         $$0.a("Book", (qc)this.c().b(new pj()));
         $$0.a("Page", this.h);
      }

   }

   @Override
   public void a() {
      this.a(cax.b);
   }

   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      return new bxn($$0, this.e, this.f);
   }

   @Override
   public rq C_() {
      return rq.c("container.lectern");
   }
}
