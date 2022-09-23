public class zk {
   private static final double a = 4096.0;
   private dwq b;

   public zk() {
      this.b = dwq.b;
   }

   private static long a(double $$0) {
      return ami.c($$0 * 4096.0);
   }

   private static double a(long $$0) {
      return (double)$$0 / 4096.0;
   }

   public dwq a(long $$0, long $$1, long $$2) {
      if ($$0 == 0L && $$1 == 0L && $$2 == 0L) {
         return this.b;
      } else {
         double $$3 = $$0 == 0L ? this.b.c : a(a(this.b.c) + $$0);
         double $$4 = $$1 == 0L ? this.b.d : a(a(this.b.d) + $$1);
         double $$5 = $$2 == 0L ? this.b.e : a(a(this.b.e) + $$2);
         return new dwq($$3, $$4, $$5);
      }
   }

   public long a(dwq $$0) {
      return a($$0.c - this.b.c);
   }

   public long b(dwq $$0) {
      return a($$0.d - this.b.d);
   }

   public long c(dwq $$0) {
      return a($$0.e - this.b.e);
   }

   public dwq d(dwq $$0) {
      return $$0.d(this.b);
   }

   public void e(dwq $$0) {
      this.b = $$0;
   }
}
