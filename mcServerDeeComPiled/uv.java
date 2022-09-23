public class uv implements tc<tf> {
   private final int a;
   private final cfw b;
   private final int c;
   private final int d;
   private final boolean e;
   private final boolean f;

   public uv(int $$0, cfw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public uv(qx $$0) {
      this.a = $$0.k();
      this.b = cfw.b($$0);
      this.c = $$0.k();
      this.d = $$0.k();
      this.e = $$0.readBoolean();
      this.f = $$0.readBoolean();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      this.b.a($$0);
      $$0.d(this.c);
      $$0.d(this.d);
      $$0.writeBoolean(this.e);
      $$0.writeBoolean(this.f);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   public cfw c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public boolean g() {
      return this.f;
   }
}
