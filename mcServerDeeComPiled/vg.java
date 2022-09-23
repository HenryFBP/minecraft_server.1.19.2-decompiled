public class vg implements tc<tf> {
   private final int a;
   private final int b;

   public vg(bav $$0) {
      this($$0.j(), $$0.f());
   }

   public vg(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public vg(qx $$0) {
      this.b = $$0.k();
      this.a = $$0.readInt();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.b);
      $$0.writeInt(this.a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }
}
