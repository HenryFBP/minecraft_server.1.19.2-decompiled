import javax.annotation.Nullable;

public class bxy implements bac, bxx {
   private final hi<cax> b = hi.a(1, cax.b);
   @Nullable
   private cdp<?> c;

   @Override
   public int b() {
      return 1;
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.b) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cax a(int $$0) {
      return this.b.get(0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      return bad.a(this.b, 0);
   }

   @Override
   public cax b(int $$0) {
      return bad.a(this.b, 0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.b.set(0, $$1);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(buc $$0) {
      return true;
   }

   @Override
   public void a() {
      this.b.clear();
   }

   @Override
   public void a(@Nullable cdp<?> $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public cdp<?> d() {
      return this.c;
   }
}
