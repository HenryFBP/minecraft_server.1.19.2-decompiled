public class za implements tc<xm> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private final gt d;
   private final String e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final ctp.a i;

   public za(gt $$0, String $$1, ctp.a $$2, boolean $$3, boolean $$4, boolean $$5) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$2;
   }

   public za(qx $$0) {
      this.d = $$0.f();
      this.e = $$0.q();
      this.i = $$0.a(ctp.a.class);
      int $$1 = $$0.readByte();
      this.f = ($$1 & 1) != 0;
      this.g = ($$1 & 2) != 0;
      this.h = ($$1 & 4) != 0;
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.a((Enum<?>)this.i);
      int $$1 = 0;
      if (this.f) {
         $$1 |= 1;
      }

      if (this.g) {
         $$1 |= 2;
      }

      if (this.h) {
         $$1 |= 4;
      }

      $$0.writeByte($$1);
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public gt b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public ctp.a g() {
      return this.i;
   }
}
