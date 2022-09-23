public class bla extends blc {
   public bla(bce $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected dqn a(int $$0) {
      this.o = new dqi();
      this.o.a(true);
      return new dqn(this.o, $$0);
   }

   @Override
   protected boolean a() {
      return this.q() && this.o() || !this.a.bI();
   }

   @Override
   protected dwq b() {
      return this.a.cY();
   }

   @Override
   public dql a(bbn $$0, int $$1) {
      return this.a($$0.da(), $$1);
   }

   @Override
   public void c() {
      ++this.e;
      if (this.m) {
         this.i();
      }

      if (!this.l()) {
         if (this.a()) {
            this.k();
         } else if (this.c != null && !this.c.c()) {
            dwq $$0 = this.c.a(this.a);
            if (this.a.de() == ami.b($$0.c) && this.a.dg() == ami.b($$0.d) && this.a.dk() == ami.b($$0.e)) {
               this.c.a();
            }
         }

         xl.a(this.b, this.a, this.c, this.l);
         if (!this.l()) {
            dwq $$1 = this.c.a(this.a);
            this.a.A().a($$1.c, $$1.d, $$1.e, this.d);
         }
      }
   }

   public void b(boolean $$0) {
      this.o.b($$0);
   }

   public boolean d() {
      return this.o.d();
   }

   public void c(boolean $$0) {
      this.o.a($$0);
   }

   public boolean e() {
      return this.o.d();
   }

   @Override
   public boolean a(gt $$0) {
      return this.b.a_($$0).a(this.b, $$0, this.a);
   }
}
