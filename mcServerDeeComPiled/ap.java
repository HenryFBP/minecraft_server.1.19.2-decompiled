public enum ap {
   a("task", 0, p.k),
   b("challenge", 26, p.f),
   c("goal", 52, p.k);

   private final String d;
   private final int e;
   private final p f;
   private final rq g;

   private ap(String $$0, int $$1, p $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = rq.c("advancements.toast." + $$0);
   }

   public String a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public static ap a(String $$0) {
      for(ap $$1 : values()) {
         if ($$1.d.equals($$0)) {
            return $$1;
         }
      }

      throw new IllegalArgumentException("Unknown frame type '" + $$0 + "'");
   }

   public p c() {
      return this.f;
   }

   public rq d() {
      return this.g;
   }
}
