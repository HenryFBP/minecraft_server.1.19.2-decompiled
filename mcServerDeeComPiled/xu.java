public record xu(int a, String b) implements tc<xm> {
   public xu(int $$0, String $$1) {
      $$1 = amx.e($$1);
      this.a = $$0;
      this.b = $$1;
   }

   public xu(qx $$0) {
      this($$0.readInt(), $$0.e(256));
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.a(this.b, 256);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }
}
