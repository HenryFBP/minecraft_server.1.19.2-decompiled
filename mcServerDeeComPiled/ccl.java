public interface ccl {
   boolean a();

   public static enum a implements ccl {
      a(false),
      b(true);

      private final boolean c;

      private a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public boolean a() {
         return this.c;
      }
   }
}
