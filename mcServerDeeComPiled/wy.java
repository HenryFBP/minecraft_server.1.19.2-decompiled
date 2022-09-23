import org.apache.commons.lang3.Validate;

public class wy implements tc<tf> {
   public static final float a = 8.0F;
   private final ajv b;
   private final ajx c;
   private final int d;
   private final int e;
   private final int f;
   private final float g;
   private final float h;
   private final long i;

   public wy(ajv $$0, ajx $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      Validate.notNull($$0, "sound", new Object[0]);
      this.b = $$0;
      this.c = $$1;
      this.d = (int)($$2 * 8.0);
      this.e = (int)($$3 * 8.0);
      this.f = (int)($$4 * 8.0);
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public wy(qx $$0) {
      this.b = $$0.a(hm.S);
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
      $$0.a(hm.S, this.b);
      $$0.a((Enum<?>)this.c);
      $$0.writeInt(this.d);
      $$0.writeInt(this.e);
      $$0.writeInt(this.f);
      $$0.writeFloat(this.g);
      $$0.writeFloat(this.h);
      $$0.writeLong(this.i);
   }

   public ajv b() {
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
