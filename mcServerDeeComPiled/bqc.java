public class bqc extends bps {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final bmf f = bmf.a().a(150.0);
   private final bmf g;
   private int h;

   public bqc(bpp $$0) {
      super($$0);
      this.g = bmf.a().a(20.0).a($$1 -> Math.abs($$1.dh() - $$0.dh()) <= 10.0);
   }

   @Override
   public void c() {
      ++this.h;
      bcc $$0 = this.a.s.a(this.g, this.a, this.a.df(), this.a.dh(), this.a.dl());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.fG().a(bqf.h);
         } else {
            dwq $$1 = new dwq($$0.df() - this.a.df(), 0.0, $$0.dl() - this.a.dl()).d();
            dwq $$2 = new dwq((double)ami.a(this.a.dq() * (float) (Math.PI / 180.0)), 0.0, (double)(-ami.b(this.a.dq() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.df() - this.a.e.df();
               double $$6 = $$0.dl() - this.a.e.dl();
               double $$7 = ami.a(ami.f(180.0 - ami.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dq()), -100.0, 100.0);
               this.a.ca *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.ca += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.o(this.a.dq() + this.a.ca);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.s.a(f, this.a, this.a.df(), this.a.dh(), this.a.dl());
         this.a.fG().a(bqf.e);
         if ($$0 != null) {
            this.a.fG().a(bqf.i);
            this.a.fG().b(bqf.i).a(new dwq($$0.df(), $$0.dh(), $$0.dl()));
         }
      }

   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public bqf<bqc> i() {
      return bqf.g;
   }
}
