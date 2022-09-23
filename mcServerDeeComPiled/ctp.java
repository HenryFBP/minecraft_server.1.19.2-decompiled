public class ctp extends cti {
   private boolean a;
   private boolean b;
   private boolean c;
   private final cfy d = new cfy() {
      @Override
      public void a(String $$0) {
         super.a($$0);
         ctp.this.e();
      }

      @Override
      public agg e() {
         return (agg)ctp.this.n;
      }

      @Override
      public void f() {
         cvo $$0 = ctp.this.n.a_(ctp.this.o);
         this.e().a(ctp.this.o, $$0, $$0, 3);
      }

      @Override
      public dwq g() {
         return dwq.a(ctp.this.o);
      }

      @Override
      public dr i() {
         return new dr(this, dwq.a(ctp.this.o), dwp.a, this.e(), 2, this.m().getString(), this.m(), this.e().n(), null);
      }
   };

   public ctp(gt $$0, cvo $$1) {
      super(ctk.v, $$0, $$1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.d.a($$0);
      $$0.a("powered", this.d());
      $$0.a("conditionMet", this.i());
      $$0.a("auto", this.f());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.d.b($$0);
      this.a = $$0.q("powered");
      this.c = $$0.q("conditionMet");
      this.b($$0.q("auto"));
   }

   @Override
   public boolean u() {
      return true;
   }

   public cfy c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.a = $$0;
   }

   public boolean d() {
      return this.a;
   }

   public boolean f() {
      return this.b;
   }

   public void b(boolean $$0) {
      boolean $$1 = this.b;
      this.b = $$0;
      if (!$$1 && $$0 && !this.a && this.n != null && this.t() != ctp.a.a) {
         this.x();
      }

   }

   public void g() {
      ctp.a $$0 = this.t();
      if ($$0 == ctp.a.b && (this.a || this.b) && this.n != null) {
         this.x();
      }

   }

   private void x() {
      cjt $$0 = this.q().b();
      if ($$0 instanceof ckv) {
         this.j();
         this.n.a(this.o, $$0, 1);
      }

   }

   public boolean i() {
      return this.c;
   }

   public boolean j() {
      this.c = true;
      if (this.w()) {
         gt $$0 = this.o.a(((gy)this.n.a_(this.o).c(ckv.a)).g());
         if (this.n.a_($$0).b() instanceof ckv) {
            cti $$1 = this.n.c_($$0);
            this.c = $$1 instanceof ctp && ((ctp)$$1).c().j() > 0;
         } else {
            this.c = false;
         }
      }

      return this.c;
   }

   public ctp.a t() {
      cvo $$0 = this.q();
      if ($$0.a(cju.eU)) {
         return ctp.a.c;
      } else if ($$0.a(cju.js)) {
         return ctp.a.b;
      } else {
         return $$0.a(cju.jt) ? ctp.a.a : ctp.a.c;
      }
   }

   public boolean w() {
      cvo $$0 = this.n.a_(this.p());
      return $$0.b() instanceof ckv ? $$0.c(ckv.b) : false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
