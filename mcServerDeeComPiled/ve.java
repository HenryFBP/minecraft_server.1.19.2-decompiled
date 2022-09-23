public record ve(sh a, rz b, byte[] c) implements tc<tf> {
   public ve(sd $$0) {
      this($$0.i(), $$0.j(), $$0.k().a().asBytes());
   }

   public ve(qx $$0) {
      this(new sh($$0), new rz($$0), $$0.b());
   }

   @Override
   public void a(qx $$0) {
      this.a.a($$0);
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public sh b() {
      return this.a;
   }

   public rz c() {
      return this.b;
   }

   public byte[] d() {
      return this.c;
   }
}
