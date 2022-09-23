public class ps {
   public static final ps a = new ps(0L) {
      @Override
      public void a(long $$0) {
      }
   };
   private final long b;
   private long c;

   public ps(long $$0) {
      this.b = $$0;
   }

   public void a(long $$0) {
      this.c += $$0 / 8L;
      if (this.c > this.b) {
         throw new RuntimeException("Tried to read NBT tag that was too big; tried to allocate: " + this.c + "bytes where max allowed: " + this.b);
      }
   }
}
