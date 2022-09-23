import javax.annotation.Nullable;

public class bqe extends bpr {
   private boolean b;
   @Nullable
   private dql c;
   @Nullable
   private dwq d;

   public bqe(bpp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (!this.b && this.c != null) {
         gt $$0 = this.a.s.a(dar.a.f, dds.e);
         if (!$$0.a(this.a.cY(), 10.0)) {
            this.a.fG().a(bqf.a);
         }
      } else {
         this.b = false;
         this.j();
      }

   }

   @Override
   public void d() {
      this.b = true;
      this.c = null;
      this.d = null;
   }

   private void j() {
      int $$0 = this.a.q();
      dwq $$1 = this.a.x(1.0F);
      int $$2 = this.a.q(-$$1.c * 40.0, 105.0, -$$1.e * 40.0);
      if (this.a.fH() != null && this.a.fH().c() > 0) {
         $$2 %= 12;
         if ($$2 < 0) {
            $$2 += 12;
         }
      } else {
         $$2 -= 12;
         $$2 &= 7;
         $$2 += 12;
      }

      this.c = this.a.a($$0, $$2, null);
      this.k();
   }

   private void k() {
      if (this.c != null) {
         this.c.a();
         if (!this.c.c()) {
            hs $$0 = this.c.g();
            this.c.a();

            double $$1;
            do {
               $$1 = (double)((float)$$0.v() + this.a.dQ().i() * 20.0F);
            } while($$1 < (double)$$0.v());

            this.d = new dwq((double)$$0.u(), $$1, (double)$$0.w());
         }
      }

   }

   @Nullable
   @Override
   public dwq g() {
      return this.d;
   }

   @Override
   public bqf<bqe> i() {
      return bqf.e;
   }
}
