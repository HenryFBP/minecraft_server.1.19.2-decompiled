import javax.annotation.Nullable;

public class vt implements tc<tf> {
   @Nullable
   private final abb a;

   public vt(@Nullable abb $$0) {
      this.a = $$0;
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public vt(qx $$0) {
      this.a = $$0.c(qx::r);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, qx::a);
   }

   @Nullable
   public abb b() {
      return this.a;
   }
}
