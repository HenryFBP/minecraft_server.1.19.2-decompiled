import javax.annotation.Nullable;

public class bqb extends bps {
   private static final int b = 200;
   private static final int c = 4;
   private static final int d = 10;
   private int e;
   private int f;
   @Nullable
   private bbm g;

   public bqb(bpp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      ++this.e;
      if (this.e % 2 == 0 && this.e < 10) {
         dwq $$0 = this.a.x(1.0F).d();
         $$0.b((float) (-Math.PI / 4));
         double $$1 = this.a.e.df();
         double $$2 = this.a.e.e(0.5);
         double $$3 = this.a.e.dl();

         for(int $$4 = 0; $$4 < 8; ++$$4) {
            double $$5 = $$1 + this.a.dQ().k() / 2.0;
            double $$6 = $$2 + this.a.dQ().k() / 2.0;
            double $$7 = $$3 + this.a.dQ().k() / 2.0;

            for(int $$8 = 0; $$8 < 6; ++$$8) {
               this.a.s.a(io.i, $$5, $$6, $$7, -$$0.c * 0.08F * (double)$$8, -$$0.d * 0.6F, -$$0.e * 0.08F * (double)$$8);
            }

            $$0.b((float) (Math.PI / 16));
         }
      }

   }

   @Override
   public void c() {
      ++this.e;
      if (this.e >= 200) {
         if (this.f >= 4) {
            this.a.fG().a(bqf.e);
         } else {
            this.a.fG().a(bqf.g);
         }
      } else if (this.e == 10) {
         dwq $$0 = new dwq(this.a.e.df() - this.a.df(), 0.0, this.a.e.dl() - this.a.dl()).d();
         float $$1 = 5.0F;
         double $$2 = this.a.e.df() + $$0.c * 5.0 / 2.0;
         double $$3 = this.a.e.dl() + $$0.e * 5.0 / 2.0;
         double $$4 = this.a.e.e(0.5);
         double $$5 = $$4;
         gt.a $$6 = new gt.a($$2, $$4, $$3);

         while(this.a.s.x($$6)) {
            --$$5;
            if ($$5 < 0.0) {
               $$5 = $$4;
               break;
            }

            $$6.c($$2, $$5, $$3);
         }

         $$5 = (double)(ami.b($$5) + 1);
         this.g = new bbm(this.a.s, $$2, $$5, $$3);
         this.g.a(this.a);
         this.g.a(5.0F);
         this.g.b(200);
         this.g.a(io.i);
         this.g.a(new bbg(bbi.g));
         this.a.s.b(this.g);
      }

   }

   @Override
   public void d() {
      this.e = 0;
      ++this.f;
   }

   @Override
   public void e() {
      if (this.g != null) {
         this.g.ah();
         this.g = null;
      }

   }

   @Override
   public bqf<bqb> i() {
      return bqf.f;
   }

   public void j() {
      this.f = 0;
   }
}
