public enum cwg implements amw {
   a("single", 0),
   b("left", 2),
   c("right", 1);

   public static final cwg[] d = values();
   private final String e;
   private final int f;

   private cwg(String $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public String c() {
      return this.e;
   }

   public cwg a() {
      return d[this.f];
   }
}
