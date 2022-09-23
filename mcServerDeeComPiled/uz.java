import javax.annotation.Nullable;

public class uz implements tc<tf> {
   private final int a;
   private final bxq<?> b;
   private final rq c;

   public uz(int $$0, bxq<?> $$1, rq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public uz(qx $$0) {
      this.a = $$0.k();
      this.b = $$0.a(hm.ah);
      this.c = $$0.j();
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.a);
      $$0.a(hm.ah, this.b);
      $$0.a(this.c);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.a;
   }

   @Nullable
   public bxq<?> c() {
      return this.b;
   }

   public rq d() {
      return this.c;
   }
}
