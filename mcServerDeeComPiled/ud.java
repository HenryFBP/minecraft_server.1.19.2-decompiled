public class ud implements tc<tf> {
   public static final float a = 8.0F;
   private final abb b;
   private final ajx c;
   private final int d;
   private final int e;
   private final int f;
   private final float g;
   private final float h;
   private final long i;

   public ud(abb $$0, ajx $$1, dwq $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = (int)($$2.c * 8.0);
      this.e = (int)($$2.d * 8.0);
      this.f = (int)($$2.e * 8.0);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }

   public ud(qx $$0) {
      this.b = $$0.r();
      this.c = $$0.a(ajx.class);
      this.d = $$0.readInt();
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.i = $$0.readLong();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.b);
      $$0.a((Enum<?>)this.c);
      $$0.writeInt(this.d);
      $$0.writeInt(this.e);
      $$0.writeInt(this.f);
      $$0.writeFloat(this.g);
      $$0.writeFloat(this.h);
      $$0.writeLong(this.i);
   }

   public abb b() {
      return this.b;
   }

   public ajx c() {
      return this.c;
   }

   public double d() {
      return (double)((float)this.d / 8.0F);
   }

   public double e() {
      return (double)((float)this.e / 8.0F);
   }

   public double f() {
      return (double)((float)this.f / 8.0F);
   }

   public float g() {
      return this.g;
   }

   public float h() {
      return this.h;
   }

   public long i() {
      return this.i;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }
}
