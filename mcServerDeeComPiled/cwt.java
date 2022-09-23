public enum cwt implements amw {
   a("up"),
   b("side"),
   c("none");

   private final String d;

   private cwt(String $$0) {
      this.d = $$0;
   }

   public String toString() {
      return this.c();
   }

   @Override
   public String c() {
      return this.d;
   }

   public boolean a() {
      return this != c;
   }
}
