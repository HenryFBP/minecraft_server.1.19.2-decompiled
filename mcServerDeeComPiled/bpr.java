import javax.annotation.Nullable;

public abstract class bpr implements bpz {
   protected final bpp a;

   public bpr(bpp $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return false;
   }

   @Override
   public void b() {
   }

   @Override
   public void c() {
   }

   @Override
   public void a(bpo $$0, gt $$1, baw $$2, @Nullable buc $$3) {
   }

   @Override
   public void d() {
   }

   @Override
   public void e() {
   }

   @Override
   public float f() {
      return 0.6F;
   }

   @Nullable
   @Override
   public dwq g() {
      return null;
   }

   @Override
   public float a(baw $$0, float $$1) {
      return $$1;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dd().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return 0.7F / $$1 / $$0;
   }
}
