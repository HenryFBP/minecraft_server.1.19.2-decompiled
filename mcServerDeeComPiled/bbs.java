public enum bbs {
   a(bbs.a.a, 0, 0, "mainhand"),
   b(bbs.a.a, 1, 5, "offhand"),
   c(bbs.a.b, 0, 1, "feet"),
   d(bbs.a.b, 1, 2, "legs"),
   e(bbs.a.b, 2, 3, "chest"),
   f(bbs.a.b, 3, 4, "head");

   private final bbs.a g;
   private final int h;
   private final int i;
   private final String j;

   private bbs(bbs.a $$0, int $$1, int $$2, String $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
   }

   public bbs.a a() {
      return this.g;
   }

   public int b() {
      return this.h;
   }

   public int a(int $$0) {
      return $$0 + this.h;
   }

   public int c() {
      return this.i;
   }

   public String d() {
      return this.j;
   }

   public static bbs a(String $$0) {
      for(bbs $$1 : values()) {
         if ($$1.d().equals($$0)) {
            return $$1;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + $$0 + "'");
   }

   public static bbs a(bbs.a $$0, int $$1) {
      for(bbs $$2 : values()) {
         if ($$2.a() == $$0 && $$2.b() == $$1) {
            return $$2;
         }
      }

      throw new IllegalArgumentException("Invalid slot '" + $$0 + "': " + $$1);
   }

   public static enum a {
      a,
      b;
   }
}
