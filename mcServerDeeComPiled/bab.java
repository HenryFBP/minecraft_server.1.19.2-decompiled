public class bab implements bac {
   private final bac b;
   private final bac c;

   public bab(bac $$0, bac $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public int b() {
      return this.b.b() + this.c.b();
   }

   @Override
   public boolean c() {
      return this.b.c() && this.c.c();
   }

   public boolean a(bac $$0) {
      return this.b == $$0 || this.c == $$0;
   }

   @Override
   public cax a(int $$0) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b()) : this.b.a($$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      return $$0 >= this.b.b() ? this.c.a($$0 - this.b.b(), $$1) : this.b.a($$0, $$1);
   }

   @Override
   public cax b(int $$0) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b()) : this.b.b($$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      if ($$0 >= this.b.b()) {
         this.c.a($$0 - this.b.b(), $$1);
      } else {
         this.b.a($$0, $$1);
      }

   }

   @Override
   public int O_() {
      return this.b.O_();
   }

   @Override
   public void e() {
      this.b.e();
      this.c.e();
   }

   @Override
   public boolean a(buc $$0) {
      return this.b.a($$0) && this.c.a($$0);
   }

   @Override
   public void d_(buc $$0) {
      this.b.d_($$0);
      this.c.d_($$0);
   }

   @Override
   public void c_(buc $$0) {
      this.b.c_($$0);
      this.c.c_($$0);
   }

   @Override
   public boolean b(int $$0, cax $$1) {
      return $$0 >= this.b.b() ? this.c.b($$0 - this.b.b(), $$1) : this.b.b($$0, $$1);
   }

   @Override
   public void a() {
      this.b.a();
      this.c.a();
   }
}
