public class wu implements tc<tf> {
   private final long a;
   private final long b;

   public wu(long $$0, long $$1, boolean $$2) {
      this.a = $$0;
      long $$3 = $$1;
      if (!$$2) {
         $$3 = -$$1;
         if ($$3 == 0L) {
            $$3 = -1L;
         }
      }

      this.b = $$3;
   }

   public wu(qx $$0) {
      this.a = $$0.readLong();
      this.b = $$0.readLong();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeLong(this.a);
      $$0.writeLong(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public long b() {
      return this.a;
   }

   public long c() {
      return this.b;
   }
}
