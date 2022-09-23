import javax.annotation.Nullable;

public class bpw extends bpr {
   @Nullable
   private dwq b;

   public bpw(bpp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = this.a.cY();
      }

   }

   @Override
   public boolean a() {
      return true;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Nullable
   @Override
   public dwq g() {
      return this.b;
   }

   @Override
   public bqf<bpw> i() {
      return bqf.k;
   }
}
