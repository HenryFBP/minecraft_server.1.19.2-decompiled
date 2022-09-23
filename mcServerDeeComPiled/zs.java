import java.security.PublicKey;

public class zs implements tc<zp> {
   private final String a;
   private final byte[] b;
   private final byte[] c;

   public zs(String $$0, byte[] $$1, byte[] $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public zs(qx $$0) {
      this.a = $$0.e(20);
      this.b = $$0.b();
      this.c = $$0.b();
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(zp $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.a;
   }

   public PublicKey c() throws alj {
      return ali.a(this.b);
   }

   public byte[] d() {
      return this.c;
   }
}
