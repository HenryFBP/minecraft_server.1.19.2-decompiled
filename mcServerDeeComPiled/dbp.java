public class dbp {
   private long a;
   private long b;

   public dbp(dbg.a $$0) {
      this($$0.a(), $$0.b());
   }

   public dbp(long $$0, long $$1) {
      this.a = $$0;
      this.b = $$1;
      if ((this.a | this.b) == 0L) {
         this.a = -7046029254386353131L;
         this.b = 7640891576956012809L;
      }

   }

   public long a() {
      long $$0 = this.a;
      long $$1 = this.b;
      long $$2 = Long.rotateLeft($$0 + $$1, 17) + $$0;
      $$1 ^= $$0;
      this.a = Long.rotateLeft($$0, 49) ^ $$1 ^ $$1 << 21;
      this.b = Long.rotateLeft($$1, 28);
      return $$2;
   }
}
