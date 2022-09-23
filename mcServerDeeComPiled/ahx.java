public enum ahx {
   a("old"),
   b("new"),
   c("compatible");

   private final rq d;
   private final rq e;

   private ahx(String $$0) {
      this.d = rq.c("pack.incompatible." + $$0).a(p.h);
      this.e = rq.c("pack.incompatible.confirm." + $$0);
   }

   public boolean a() {
      return this == c;
   }

   public static ahx a(int $$0, ahm $$1) {
      int $$2 = $$1.a(ab.b());
      if ($$0 < $$2) {
         return a;
      } else {
         return $$0 > $$2 ? b : c;
      }
   }

   public static ahx a(ahq $$0, ahm $$1) {
      return a($$0.b(), $$1);
   }

   public rq b() {
      return this.d;
   }

   public rq c() {
      return this.e;
   }
}
