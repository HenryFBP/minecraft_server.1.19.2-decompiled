public class wo implements tc<tf> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final rq e;
   private final dxr.a f;
   private final int g;

   public wo(dxl $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public wo(qx $$0) {
      this.d = $$0.q();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = rp.a;
         this.f = dxr.a.a;
      } else {
         this.e = $$0.j();
         this.f = $$0.a(dxr.a.class);
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.d);
      $$0.writeByte(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a((Enum<?>)this.f);
      }

   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.d;
   }

   public rq c() {
      return this.e;
   }

   public int d() {
      return this.g;
   }

   public dxr.a e() {
      return this.f;
   }
}
