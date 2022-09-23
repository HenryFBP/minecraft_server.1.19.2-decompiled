import javax.annotation.Nullable;

public class bpu extends bpr {
   @Nullable
   private dwq b;
   private int c;

   public bpu(bpp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c++ % 10 == 0) {
         float $$0 = (this.a.dQ().i() - 0.5F) * 8.0F;
         float $$1 = (this.a.dQ().i() - 0.5F) * 4.0F;
         float $$2 = (this.a.dQ().i() - 0.5F) * 8.0F;
         this.a.s.a(io.w, this.a.df() + (double)$$0, this.a.dh() + 2.0 + (double)$$1, this.a.dl() + (double)$$2, 0.0, 0.0, 0.0);
      }

   }

   @Override
   public void c() {
      ++this.c;
      if (this.b == null) {
         gt $$0 = this.a.s.a(dar.a.e, dds.e);
         this.b = dwq.c($$0);
      }

      double $$1 = this.b.c(this.a.df(), this.a.dh(), this.a.dl());
      if (!($$1 < 100.0) && !($$1 > 22500.0) && !this.a.z && !this.a.A) {
         this.a.c(1.0F);
      } else {
         this.a.c(0.0F);
      }

   }

   @Override
   public void d() {
      this.b = null;
      this.c = 0;
   }

   @Override
   public float f() {
      return 3.0F;
   }

   @Nullable
   @Override
   public dwq g() {
      return this.b;
   }

   @Override
   public bqf<bpu> i() {
      return bqf.j;
   }
}
