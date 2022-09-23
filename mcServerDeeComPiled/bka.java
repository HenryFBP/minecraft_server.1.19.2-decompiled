import javax.annotation.Nullable;

public class bka extends bkb {
   public bka(bcl $$0, double $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   protected dwq h() {
      dwq $$0 = this.b.e(0.0F);
      int $$1 = 8;
      dwq $$2 = bml.a(this.b, 8, 7, $$0.c, $$0.e, (float) (Math.PI / 2), 3, 1);
      return $$2 != null ? $$2 : bmh.a(this.b, 8, 4, -2, $$0.c, $$0.e, (float) (Math.PI / 2));
   }
}
