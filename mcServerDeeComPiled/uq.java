public class uq implements tc<tf> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final int h;
   private final boolean i;
   private final im j;

   public <T extends im> uq(T $$0, boolean $$1, double $$2, double $$3, double $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
      this.j = $$0;
      this.i = $$1;
      this.a = $$2;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
      this.e = $$6;
      this.f = $$7;
      this.g = $$8;
      this.h = $$9;
   }

   public uq(qx $$0) {
      in<?> $$1 = $$0.a(hm.aa);
      this.i = $$0.readBoolean();
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readInt();
      this.j = this.a($$0, $$1);
   }

   private <T extends im> T a(qx $$0, in<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(hm.aa, this.j.b());
      $$0.writeBoolean(this.i);
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeFloat(this.f);
      $$0.writeFloat(this.g);
      $$0.writeInt(this.h);
      this.j.a($$0);
   }

   public boolean b() {
      return this.i;
   }

   public double c() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public float i() {
      return this.g;
   }

   public int j() {
      return this.h;
   }

   public im k() {
      return this.j;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }
}
