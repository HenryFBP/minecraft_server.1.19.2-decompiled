public class drp extends RuntimeException {
   private final rq a;

   public drp(rq $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public rq a() {
      return this.a;
   }
}
