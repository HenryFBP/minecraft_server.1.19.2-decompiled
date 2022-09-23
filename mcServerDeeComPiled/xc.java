import javax.annotation.Nullable;

public class xc implements tc<tf> {
   private final int a;
   @Nullable
   private final pj b;

   public xc(int $$0, @Nullable pj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public xc(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.n();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   @Nullable
   public pj c() {
      return this.b;
   }

   @Override
   public boolean a() {
      return true;
   }
}
