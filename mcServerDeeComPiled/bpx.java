import javax.annotation.Nullable;

public class bpx extends bpr {
   private static final bmf b = bmf.a().d();
   @Nullable
   private dql c;
   @Nullable
   private dwq d;

   public bpx(bpp $$0) {
      super($$0);
   }

   @Override
   public bqf<bpx> i() {
      return bqf.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.df(), this.a.dh(), this.a.dl());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.z || this.a.A) {
         this.j();
      }

   }

   @Nullable
   @Override
   public dwq g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.q();
         gt $$1 = this.a.s.a(dar.a.f, dds.e);
         buc $$2 = this.a.s.a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            dwq $$3 = new dwq($$2.df(), 0.0, $$2.dl()).d();
            $$4 = this.a.q(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.q(40.0, (double)$$1.v(), 0.0);
         }

         dqj $$6 = new dqj($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.fG().a(bqf.d);
      }

   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         hs $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dQ().i() * 20.0F);
         } while($$3 < (double)$$0.v());

         this.d = new dwq($$1, $$3, $$2);
      }

   }
}
