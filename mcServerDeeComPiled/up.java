public class up implements tc<tf> {
   private final int a;
   private final gt b;
   private final int c;
   private final boolean d;

   public up(int $$0, gt $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1.h();
      this.c = $$2;
      this.d = $$3;
   }

   public up(qx $$0) {
      this.a = $$0.readInt();
      this.b = $$0.f();
      this.c = $$0.readInt();
      this.d = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.writeInt(this.a);
      $$0.a(this.b);
      $$0.writeInt(this.c);
      $$0.writeBoolean(this.d);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.d;
   }

   public int c() {
      return this.a;
   }

   public int d() {
      return this.c;
   }

   public gt e() {
      return this.b;
   }
}
