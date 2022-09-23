public record wg(boolean a) implements tc<tf> {
   public wg(qx $$0) {
      this($$0.readBoolean());
   }

   @Override
   public void a(qx $$0) {
      $$0.writeBoolean(this.a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.a;
   }
}
