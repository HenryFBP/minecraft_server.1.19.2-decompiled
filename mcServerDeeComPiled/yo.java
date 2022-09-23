public class yo implements tc<xm> {
   private final gt a;
   private final gy b;
   private final yo.a c;
   private final int d;

   public yo(yo.a $$0, gt $$1, gy $$2, int $$3) {
      this.c = $$0;
      this.a = $$1.h();
      this.b = $$2;
      this.d = $$3;
   }

   public yo(yo.a $$0, gt $$1, gy $$2) {
      this($$0, $$1, $$2, 0);
   }

   public yo(qx $$0) {
      this.c = $$0.a(yo.a.class);
      this.a = $$0.f();
      this.b = gy.a($$0.readUnsignedByte());
      this.d = $$0.k();
   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.c);
      $$0.a(this.a);
      $$0.writeByte(this.b.d());
      $$0.d(this.d);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.a;
   }

   public gy c() {
      return this.b;
   }

   public yo.a d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
