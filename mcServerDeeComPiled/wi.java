import java.util.List;
import javax.annotation.Nullable;

public class wi implements tc<tf> {
   private final int a;
   @Nullable
   private final List<aam.a<?>> b;

   public wi(int $$0, aam $$1, boolean $$2) {
      this.a = $$0;
      if ($$2) {
         this.b = $$1.c();
         $$1.e();
      } else {
         this.b = $$1.b();
      }

   }

   public wi(qx $$0) {
      this.a = $$0.k();
      this.b = aam.a($$0);
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      aam.a(this.b, $$0);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   @Nullable
   public List<aam.a<?>> b() {
      return this.b;
   }

   public int c() {
      return this.a;
   }
}
