public class bxa implements bac, byg {
   private final hi<cax> b;
   private final int c;
   private final int d;
   private final bwm e;

   public bxa(bwm $$0, int $$1, int $$2) {
      this.b = hi.a($$1 * $$2, cax.b);
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public int b() {
      return this.b.size();
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.b) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cax a(int $$0) {
      return $$0 >= this.b() ? cax.b : this.b.get($$0);
   }

   @Override
   public cax b(int $$0) {
      return bad.a(this.b, $$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      cax $$2 = bad.a(this.b, $$0, $$1);
      if (!$$2.b()) {
         this.e.a(this);
      }

      return $$2;
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.b.set($$0, $$1);
      this.e.a(this);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.c;
   }

   @Override
   public void a(bug $$0) {
      for(cax $$1 : this.b) {
         $$0.a($$1);
      }

   }
}
