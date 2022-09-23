import org.apache.commons.lang3.Validate;

public class wx implements tc<tf> {
   private final ajv a;
   private final ajx b;
   private final int c;
   private final float d;
   private final float e;
   private final long f;

   public wx(ajv $$0, ajx $$1, bbn $$2, float $$3, float $$4, long $$5) {
      Validate.notNull($$0, "sound", new Object[0]);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.ae();
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
   }

   public wx(qx $$0) {
      this.a = $$0.a(hm.S);
      this.b = $$0.a(ajx.class);
      this.c = $$0.k();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
      this.f = $$0.readLong();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(hm.S, this.a);
      $$0.a((Enum<?>)this.b);
      $$0.d(this.c);
      $$0.writeFloat(this.d);
      $$0.writeFloat(this.e);
      $$0.writeLong(this.f);
   }

   public ajv b() {
      return this.a;
   }

   public ajx c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }

   public float f() {
      return this.e;
   }

   public long g() {
      return this.f;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }
}
