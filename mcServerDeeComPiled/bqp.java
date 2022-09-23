import java.util.List;
import javax.annotation.Nullable;

public class bqp extends bqn {
   public static final double e = 0.375;

   public bqp(bbr<? extends bqp> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bqp(cgx $$0, gt $$1) {
      super(bbr.W, $$0, $$1);
      this.e((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
   }

   @Override
   protected void q() {
      this.o((double)this.c.u() + 0.5, (double)this.c.v() + 0.375, (double)this.c.w() + 0.5);
      double $$0 = (double)this.ad().k() / 2.0;
      double $$1 = (double)this.ad().l();
      this.a(new dwl(this.df() - $$0, this.dh(), this.dl() - $$0, this.df() + $$0, this.dh() + $$1, this.dl() + $$0));
   }

   @Override
   public void a(gy $$0) {
   }

   @Override
   public int s() {
      return 9;
   }

   @Override
   public int t() {
      return 9;
   }

   @Override
   protected float a(bco $$0, bbo $$1) {
      return 0.0625F;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 1024.0;
   }

   @Override
   public void a(@Nullable bbn $$0) {
      this.a(ajw.ks, 1.0F, 1.0F);
   }

   @Override
   public void b(pj $$0) {
   }

   @Override
   public void a(pj $$0) {
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      if (this.s.y) {
         return baj.a;
      } else {
         boolean $$2 = false;
         double $$3 = 7.0;
         List<bce> $$4 = this.s.a(bce.class, new dwl(this.df() - 7.0, this.dh() - 7.0, this.dl() - 7.0, this.df() + 7.0, this.dh() + 7.0, this.dl() + 7.0));

         for(bce $$5 : $$4) {
            if ($$5.fz() == $$0) {
               $$5.b(this, true);
               $$2 = true;
            }
         }

         if (!$$2) {
            this.ah();
            if ($$0.fB().d) {
               for(bce $$6 : $$4) {
                  if ($$6.fy() && $$6.fz() == this) {
                     $$6.a(true, false);
                  }
               }
            }
         }

         return baj.b;
      }
   }

   @Override
   public boolean r() {
      return this.s.a_(this.c).a(akl.O);
   }

   public static bqp b(cgx $$0, gt $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();

      for(bqp $$6 : $$0.a(bqp.class, new dwl((double)$$2 - 1.0, (double)$$3 - 1.0, (double)$$4 - 1.0, (double)$$2 + 1.0, (double)$$3 + 1.0, (double)$$4 + 1.0))) {
         if ($$6.w().equals($$1)) {
            return $$6;
         }
      }

      bqp $$7 = new bqp($$0, $$1);
      $$0.b($$7);
      return $$7;
   }

   @Override
   public void u() {
      this.a(ajw.kt, 1.0F, 1.0F);
   }

   @Override
   public tc<?> S() {
      return new tg(this, 0, this.w());
   }

   @Override
   public dwq n(float $$0) {
      return this.k($$0).b(0.0, 0.2, 0.0);
   }

   @Override
   public cax dn() {
      return new cax(caz.sG);
   }
}
