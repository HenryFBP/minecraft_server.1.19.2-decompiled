import javax.annotation.Nullable;

public class yw implements tc<xm> {
   private final yw.a a;
   @Nullable
   private final abb b;

   public yw(yw.a $$0, @Nullable abb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static yw a(af $$0) {
      return new yw(yw.a.a, $$0.h());
   }

   public static yw b() {
      return new yw(yw.a.b, null);
   }

   public yw(qx $$0) {
      this.a = $$0.a(yw.a.class);
      if (this.a == yw.a.a) {
         this.b = $$0.r();
      } else {
         this.b = null;
      }

   }

   @Override
   public void a(qx $$0) {
      $$0.a((Enum<?>)this.a);
      if (this.a == yw.a.a) {
         $$0.a(this.b);
      }

   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public yw.a c() {
      return this.a;
   }

   @Nullable
   public abb d() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
