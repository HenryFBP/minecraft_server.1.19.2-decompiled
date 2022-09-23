public class zm implements tc<zn> {
   private static final int a = 255;
   private final int b;
   private final String c;
   private final int d;
   private final qw e;

   public zm(String $$0, int $$1, qw $$2) {
      this.b = ab.b().getProtocolVersion();
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public zm(qx $$0) {
      this.b = $$0.k();
      this.c = $$0.e(255);
      this.d = $$0.readUnsignedShort();
      this.e = qw.a($$0.k());
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.b);
      $$0.a(this.c);
      $$0.writeShort(this.d);
      $$0.d(this.e.a());
   }

   public void a(zn $$0) {
      $$0.a(this);
   }

   public qw b() {
      return this.e;
   }

   public int c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
