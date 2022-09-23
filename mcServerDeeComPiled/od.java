import javax.annotation.Nullable;

public class od extends oc {
   private final gt a;
   private final gt b;
   private final long c;

   public od(String $$0, gt $$1, gt $$2, long $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public String getMessage() {
      String $$0 = this.a.u() + "," + this.a.v() + "," + this.a.w() + " (relative: " + this.b.u() + "," + this.b.v() + "," + this.b.w() + ")";
      return super.getMessage() + " at " + $$0 + " (t=" + this.c + ")";
   }

   @Nullable
   public String a() {
      return super.getMessage();
   }

   @Nullable
   public gt b() {
      return this.b;
   }

   @Nullable
   public gt c() {
      return this.a;
   }
}
