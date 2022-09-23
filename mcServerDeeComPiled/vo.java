import javax.annotation.Nullable;

public class vo implements tc<tf> {
   private final int a;
   private final bbe b;

   public vo(int $$0, bbe $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public vo(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.a(hm.U);
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(hm.U, this.b);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   @Nullable
   public bbn a(cgx $$0) {
      return $$0.a(this.a);
   }

   @Nullable
   public bbe b() {
      return this.b;
   }
}
