public class dbh implements dag {
   private static final int d = 48;
   private static final long e = 281474976710655L;
   private static final long f = 25214903917L;
   private static final long g = 11L;
   private long h;
   private final dat i = new dat(this);

   public dbh(long $$0) {
      this.b($$0);
   }

   @Override
   public amn d() {
      return new dbh(this.g());
   }

   @Override
   public dbe e() {
      return new das.a(this.g());
   }

   @Override
   public void b(long $$0) {
      this.h = ($$0 ^ 25214903917L) & 281474976710655L;
      this.i.a();
   }

   @Override
   public int c(int $$0) {
      long $$1 = this.h * 25214903917L + 11L & 281474976710655L;
      this.h = $$1;
      return (int)($$1 >> 48 - $$0);
   }

   @Override
   public double k() {
      return this.i.b();
   }
}
