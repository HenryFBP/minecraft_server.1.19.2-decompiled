public class bby {
   private static final int d = 140;
   private static final int e = 700;
   private final aam f;
   private final aaj<Integer> g;
   private final aaj<Boolean> h;
   public boolean a;
   public int b;
   public int c;

   public bby(aam $$0, aaj<Integer> $$1, aaj<Boolean> $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public void a() {
      this.a = true;
      this.b = 0;
      this.c = this.f.a(this.g);
   }

   public boolean a(amn $$0) {
      if (this.a) {
         return false;
      } else {
         this.a = true;
         this.b = 0;
         this.c = $$0.a(841) + 140;
         this.f.b(this.g, this.c);
         return true;
      }
   }

   public void a(pj $$0) {
      $$0.a("Saddle", this.b());
   }

   public void b(pj $$0) {
      this.a($$0.q("Saddle"));
   }

   public void a(boolean $$0) {
      this.f.b(this.h, $$0);
   }

   public boolean b() {
      return this.f.a(this.h);
   }
}
