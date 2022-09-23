public class vi implements tc<tf> {
   private final int a;
   private final int b;
   private final rq c;

   public vi(bav $$0, rq $$1) {
      this($$0.h().ae(), $$0.j(), $$1);
   }

   public vi(int $$0, int $$1, rq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public vi(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.readInt();
      this.c = $$0.j();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.writeInt(this.b);
      $$0.a(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   @Override
   public boolean a() {
      return true;
   }

   public int b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }

   public rq d() {
      return this.c;
   }
}
