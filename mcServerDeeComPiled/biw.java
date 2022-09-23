import java.util.EnumSet;
import java.util.List;

public class biw extends bip {
   public final bpd a;
   private double b;
   private static final int c = 8;
   private int d;

   public biw(bpd $$0, double $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bip.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.fy() && !this.a.gw()) {
         List<bbn> $$0 = this.a.s.a(this.a, this.a.cy().c(9.0, 4.0, 9.0), $$0x -> {
            bbr<?> $$1x = $$0x.ad();
            return $$1x == bbr.Y || $$1x == bbr.aV;
         });
         bpd $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for(bbn $$3 : $$0) {
            bpd $$4 = (bpd)$$3;
            if ($$4.gw() && !$$4.gv()) {
               double $$5 = this.a.f($$4);
               if (!($$5 > $$2)) {
                  $$2 = $$5;
                  $$1 = $$4;
               }
            }
         }

         if ($$1 == null) {
            for(bbn $$6 : $$0) {
               bpd $$7 = (bpd)$$6;
               if ($$7.fy() && !$$7.gv()) {
                  double $$8 = this.a.f($$7);
                  if (!($$8 > $$2)) {
                     $$2 = $$8;
                     $$1 = $$7;
                  }
               }
            }
         }

         if ($$1 == null) {
            return false;
         } else if ($$2 < 4.0) {
            return false;
         } else if (!$$1.fy() && !this.a($$1, 1)) {
            return false;
         } else {
            this.a.a($$1);
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean b() {
      if (this.a.gw() && this.a.gx().bo() && this.a(this.a, 0)) {
         double $$0 = this.a.f(this.a.gx());
         if ($$0 > 676.0) {
            if (this.b <= 3.0) {
               this.b *= 1.2;
               this.d = b(40);
               return true;
            }

            if (this.d == 0) {
               return false;
            }
         }

         if (this.d > 0) {
            --this.d;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.a.gu();
      this.b = 2.1;
   }

   @Override
   public void e() {
      if (this.a.gw()) {
         if (!(this.a.fz() instanceof bqp)) {
            bpd $$0 = this.a.gx();
            double $$1 = (double)this.a.e($$0);
            float $$2 = 2.0F;
            dwq $$3 = new dwq($$0.df() - this.a.df(), $$0.dh() - this.a.dh(), $$0.dl() - this.a.dl()).d().a(Math.max($$1 - 2.0, 0.0));
            this.a.D().a(this.a.df() + $$3.c, this.a.dh() + $$3.d, this.a.dl() + $$3.e, this.b);
         }
      }
   }

   private boolean a(bpd $$0, int $$1) {
      if ($$1 > 8) {
         return false;
      } else if ($$0.gw()) {
         return $$0.gx().fy() ? true : this.a($$0.gx(), ++$$1);
      } else {
         return false;
      }
   }
}
