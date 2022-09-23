public class sm extends Exception {
   private final rq a;

   public sm(rq $$0) {
      super($$0.getString());
      this.a = $$0;
   }

   public sm(rq $$0, Throwable $$1) {
      super($$0.getString(), $$1);
      this.a = $$0;
   }

   public rq a() {
      return this.a;
   }
}
