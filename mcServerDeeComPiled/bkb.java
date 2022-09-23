import javax.annotation.Nullable;

public class bkb extends bjl {
   public static final float i = 0.001F;
   protected final float j;

   public bkb(bcl $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public bkb(bcl $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected dwq h() {
      if (this.b.aU()) {
         dwq $$0 = bmm.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.dQ().i() >= this.j ? bmm.a(this.b, 10, 7) : super.h();
      }
   }
}
