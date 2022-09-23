import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqd extends bpr {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 5;
   private int d;
   @Nullable
   private dql e;
   @Nullable
   private dwq f;
   @Nullable
   private bcc g;
   private boolean h;

   public bqd(bpp $$0) {
      super($$0);
   }

   @Override
   public void c() {
      if (this.g == null) {
         b.warn("Skipping player strafe phase because no player was found");
         this.a.fG().a(bqf.a);
      } else {
         if (this.e != null && this.e.c()) {
            double $$0 = this.g.df();
            double $$1 = this.g.dl();
            double $$2 = $$0 - this.a.df();
            double $$3 = $$1 - this.a.dl();
            double $$4 = Math.sqrt($$2 * $$2 + $$3 * $$3);
            double $$5 = Math.min(0.4F + $$4 / 80.0 - 1.0, 10.0);
            this.f = new dwq($$0, this.g.dh() + $$5, $$1);
         }

         double $$6 = this.f == null ? 0.0 : this.f.c(this.a.df(), this.a.dh(), this.a.dl());
         if ($$6 < 100.0 || $$6 > 22500.0) {
            this.j();
         }

         double $$7 = 64.0;
         if (this.g.f(this.a) < 4096.0) {
            if (this.a.B(this.g)) {
               ++this.d;
               dwq $$8 = new dwq(this.g.df() - this.a.df(), 0.0, this.g.dl() - this.a.dl()).d();
               dwq $$9 = new dwq((double)ami.a(this.a.dq() * (float) (Math.PI / 180.0)), 0.0, (double)(-ami.b(this.a.dq() * (float) (Math.PI / 180.0)))).d();
               float $$10 = (float)$$9.b($$8);
               float $$11 = (float)(Math.acos((double)$$10) * 180.0F / (float)Math.PI);
               $$11 += 0.5F;
               if (this.d >= 5 && $$11 >= 0.0F && $$11 < 10.0F) {
                  double $$12 = 1.0;
                  dwq $$13 = this.a.e(1.0F);
                  double $$14 = this.a.e.df() - $$13.c * 1.0;
                  double $$15 = this.a.e.e(0.5) + 0.5;
                  double $$16 = this.a.e.dl() - $$13.e * 1.0;
                  double $$17 = this.g.df() - $$14;
                  double $$18 = this.g.e(0.5) - $$15;
                  double $$19 = this.g.dl() - $$16;
                  if (!this.a.aM()) {
                     this.a.s.a(null, 1017, this.a.da(), 0);
                  }

                  bul $$20 = new bul(this.a.s, this.a, $$17, $$18, $$19);
                  $$20.b($$14, $$15, $$16, 0.0F, 0.0F);
                  this.a.s.b($$20);
                  this.d = 0;
                  if (this.e != null) {
                     while(!this.e.c()) {
                        this.e.a();
                     }
                  }

                  this.a.fG().a(bqf.a);
               }
            } else if (this.d > 0) {
               --this.d;
            }
         } else if (this.d > 0) {
            --this.d;
         }

      }
   }

   private void j() {
      if (this.e == null || this.e.c()) {
         int $$0 = this.a.q();
         int $$1 = $$0;
         if (this.a.dQ().a(8) == 0) {
            this.h = !this.h;
            $$1 = $$0 + 6;
         }

         if (this.h) {
            ++$$1;
         } else {
            --$$1;
         }

         if (this.a.fH() != null && this.a.fH().c() > 0) {
            $$1 %= 12;
            if ($$1 < 0) {
               $$1 += 12;
            }
         } else {
            $$1 -= 12;
            $$1 &= 7;
            $$1 += 12;
         }

         this.e = this.a.a($$0, $$1, null);
         if (this.e != null) {
            this.e.a();
         }
      }

      this.k();
   }

   private void k() {
      if (this.e != null && !this.e.c()) {
         hs $$0 = this.e.g();
         this.e.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dQ().i() * 20.0F);
         } while($$3 < (double)$$0.v());

         this.f = new dwq($$1, $$3, $$2);
      }

   }

   @Override
   public void d() {
      this.d = 0;
      this.f = null;
      this.e = null;
      this.g = null;
   }

   public void a(bcc $$0) {
      this.g = $$0;
      int $$1 = this.a.q();
      int $$2 = this.a.q(this.g.df(), this.g.dh(), this.g.dl());
      int $$3 = this.g.de();
      int $$4 = this.g.dk();
      double $$5 = (double)$$3 - this.a.df();
      double $$6 = (double)$$4 - this.a.dl();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = Math.min(0.4F + $$7 / 80.0 - 1.0, 10.0);
      int $$9 = ami.b(this.g.dh() + $$8);
      dqj $$10 = new dqj($$3, $$9, $$4);
      this.e = this.a.a($$1, $$2, $$10);
      if (this.e != null) {
         this.e.a();
         this.k();
      }

   }

   @Nullable
   @Override
   public dwq g() {
      return this.f;
   }

   @Override
   public bqf<bqd> i() {
      return bqf.b;
   }
}
