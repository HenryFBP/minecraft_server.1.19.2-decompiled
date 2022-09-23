public class bdq implements bfc {
   private final gt a;
   private final dwq b;

   public bdq(gt $$0) {
      this.a = $$0.h();
      this.b = dwq.a($$0);
   }

   @Override
   public dwq a() {
      return this.b;
   }

   @Override
   public gt b() {
      return this.a;
   }

   @Override
   public boolean a(bcc $$0) {
      return true;
   }

   public String toString() {
      return "BlockPosTracker{blockPos=" + this.a + ", centerPosition=" + this.b + "}";
   }
}
