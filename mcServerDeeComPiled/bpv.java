import javax.annotation.Nullable;

public class bpv extends bpr {
   private static final bmf b = bmf.a().d();
   @Nullable
   private dql c;
   @Nullable
   private dwq d;
   private boolean e;

   public bpv(bpp $$0) {
      super($$0);
   }

   @Override
   public bqf<bpv> i() {
      return bqf.a;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.df(), this.a.dh(), this.a.dl());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.z || this.a.A) {
         this.j();
      }

   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Nullable
   @Override
   public dwq g() {
      return this.d;
   }

   private void j() {
      if (this.c != null && this.c.c()) {
         gt $$0 = this.a.s.a(dar.a.f, new gt(dds.e));
         int $$1 = this.a.fH() == null ? 0 : this.a.fH().c();
         if (this.a.dQ().a($$1 + 3) == 0) {
            this.a.fG().a(bqf.c);
            return;
         }

         double $$2 = 64.0;
         buc $$3 = this.a.s.a(b, this.a, (double)$$0.u(), (double)$$0.v(), (double)$$0.w());
         if ($$3 != null) {
            $$2 = $$0.b($$3.cY()) / 512.0;
         }

         if ($$3 != null && (this.a.dQ().a(ami.a((int)$$2) + 2) == 0 || this.a.dQ().a($$1 + 2) == 0)) {
            this.a($$3);
            return;
         }
      }

      if (this.c == null || this.c.c()) {
         int $$4 = this.a.q();
         int $$5 = $$4;
         if (this.a.dQ().a(8) == 0) {
            this.e = !this.e;
            $$5 = $$4 + 6;
         }

         if (this.e) {
            ++$$5;
         } else {
            --$$5;
         }

         if (this.a.fH() != null && this.a.fH().c() >= 0) {
            $$5 %= 12;
            if ($$5 < 0) {
               $$5 += 12;
            }
         } else {
            $$5 -= 12;
            $$5 &= 7;
            $$5 += 12;
         }

         this.c = this.a.a($$4, $$5, null);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
   }

   private void a(buc $$0) {
      this.a.fG().a(bqf.b);
      this.a.fG().b(bqf.b).a($$0);
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

   @Override
   public void a(bpo $$0, gt $$1, baw $$2, @Nullable buc $$3) {
      if ($$3 != null && this.a.c($$3)) {
         this.a($$3);
      }

   }
}
