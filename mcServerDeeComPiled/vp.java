import javax.annotation.Nullable;

public class vp implements tc<tf> {
   public static final int a = 40;
   private final String b;
   private final String c;
   private final boolean d;
   @Nullable
   private final rq e;

   public vp(String $$0, String $$1, boolean $$2, @Nullable rq $$3) {
      if ($$1.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + $$1.length() + ")");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
      }
   }

   public vp(qx $$0) {
      this.b = $$0.q();
      this.c = $$0.e(40);
      this.d = $$0.readBoolean();
      this.e = $$0.c(qx::j);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.writeBoolean(this.d);
      $$0.a(this.e, qx::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public boolean d() {
      return this.d;
   }

   @Nullable
   public rq e() {
      return this.e;
   }
}
