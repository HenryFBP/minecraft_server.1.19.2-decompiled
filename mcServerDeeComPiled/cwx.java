public enum cwx implements amw {
   a("save"),
   b("load"),
   c("corner"),
   d("data");

   private final String e;
   private final rq f;

   private cwx(String $$0) {
      this.e = $$0;
      this.f = rq.c("structure_block.mode_info." + $$0);
   }

   @Override
   public String c() {
      return this.e;
   }

   public rq a() {
      return this.f;
   }
}
