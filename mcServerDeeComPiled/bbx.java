public enum bbx implements amk {
   a(0, "options.mainHand.left"),
   b(1, "options.mainHand.right");

   private final int c;
   private final String d;

   private bbx(int $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public bbx d() {
      return this == a ? b : a;
   }

   @Override
   public int a() {
      return this.c;
   }

   @Override
   public String b() {
      return this.d;
   }
}
