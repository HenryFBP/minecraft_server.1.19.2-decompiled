import com.mojang.serialization.Codec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dej extends ddt<dga> {
   public dej(Codec<dga> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ddv<dga> $$0) {
      chp $$1 = $$0.b();
      gt $$2 = $$0.e();
      dga $$3 = $$0.f();
      amn $$4 = $$0.d();
      if (!ddp.a($$1, $$2)) {
         return false;
      } else {
         Optional<dah> $$5 = dah.a($$1, $$2, $$3.b, ddp::c, ddp::a);
         if ($$5.isPresent() && $$5.get() instanceof dah.b $$6) {
            if ($$6.g() < 4) {
               return false;
            } else {
               int $$7 = (int)((float)$$6.g() * $$3.e);
               int $$8 = ami.a($$7, $$3.c.a(), $$3.c.b());
               int $$9 = ami.b($$4, $$3.c.a(), $$8);
               dej.a $$10 = a($$2.h($$6.e() - 1), false, $$4, $$9, $$3.f, $$3.d);
               dej.a $$11 = a($$2.h($$6.f() + 1), true, $$4, $$9, $$3.g, $$3.d);
               dej.b $$12;
               if ($$10.a($$3) && $$11.a($$3)) {
                  $$12 = new dej.b($$2.v(), $$4, $$3.h);
               } else {
                  $$12 = dej.b.a();
               }

               boolean $$14 = $$10.a($$1, $$12);
               boolean $$15 = $$11.a($$1, $$12);
               if ($$14) {
                  $$10.a($$1, $$4, $$12);
               }

               if ($$15) {
                  $$11.a($$1, $$4, $$12);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private static dej.a a(gt $$0, boolean $$1, amn $$2, int $$3, azm $$4, azm $$5) {
      return new dej.a($$0, $$1, $$3, (double)$$4.a($$2), (double)$$5.a($$2));
   }

   private void a(chp $$0, gt $$1, dah.b $$2, dej.b $$3) {
      $$0.a($$3.a($$1.h($$2.e() - 1)), cju.ck.m(), 2);
      $$0.a($$3.a($$1.h($$2.f() + 1)), cju.bT.m(), 2);

      for(gt.a $$4 = $$1.h($$2.f() + 2).i(); $$4.v() < $$2.e() - 1; $$4.c(gy.b)) {
         gt $$5 = $$3.a($$4);
         if (ddp.a($$0, $$5) || $$0.a_($$5).a(cju.qd)) {
            $$0.a($$5, cju.fP.m(), 2);
         }
      }

   }

   static final class a {
      private gt a;
      private final boolean b;
      private int c;
      private final double d;
      private final double e;

      a(gt $$0, boolean $$1, int $$2, double $$3, double $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      private int a() {
         return this.a(0.0F);
      }

      private int b() {
         return this.b ? this.a.v() : this.a.v() - this.a();
      }

      private int c() {
         return !this.b ? this.a.v() : this.a.v() + this.a();
      }

      boolean a(chp $$0, dej.b $$1) {
         while(this.c > 1) {
            gt.a $$2 = this.a.i();
            int $$3 = Math.min(10, this.a());

            for(int $$4 = 0; $$4 < $$3; ++$$4) {
               if ($$0.a_($$2).a(cju.D)) {
                  return false;
               }

               if (ddp.a($$0, $$1.a($$2), this.c)) {
                  this.a = $$2;
                  return true;
               }

               $$2.c(this.b ? gy.a : gy.b);
            }

            this.c /= 2;
         }

         return false;
      }

      private int a(float $$0) {
         return (int)ddp.a((double)$$0, (double)this.c, this.e, this.d);
      }

      void a(chp $$0, amn $$1, dej.b $$2) {
         for(int $$3 = -this.c; $$3 <= this.c; ++$$3) {
            for(int $$4 = -this.c; $$4 <= this.c; ++$$4) {
               float $$5 = ami.c((float)($$3 * $$3 + $$4 * $$4));
               if (!($$5 > (float)this.c)) {
                  int $$6 = this.a($$5);
                  if ($$6 > 0) {
                     if ((double)$$1.i() < 0.2) {
                        $$6 = (int)((float)$$6 * ami.b($$1, 0.8F, 1.0F));
                     }

                     gt.a $$7 = this.a.b($$3, 0, $$4).i();
                     boolean $$8 = false;
                     int $$9 = this.b ? $$0.a(dar.a.a, $$7.u(), $$7.w()) : Integer.MAX_VALUE;

                     for(int $$10 = 0; $$10 < $$6 && $$7.v() < $$9; ++$$10) {
                        gt $$11 = $$2.a($$7);
                        if (ddp.b($$0, $$11)) {
                           $$8 = true;
                           cjt $$12 = cju.qd;
                           $$0.a($$11, $$12.m(), 2);
                        } else if ($$8 && $$0.a_($$11).a(akl.aV)) {
                           break;
                        }

                        $$7.c(this.b ? gy.b : gy.a);
                     }
                  }
               }
            }
         }

      }

      boolean a(dga $$0) {
         return this.c >= $$0.i && this.d >= (double)$$0.j;
      }
   }

   static final class b {
      private final int a;
      @Nullable
      private final dwq b;

      b(int $$0, amn $$1, azm $$2) {
         this.a = $$0;
         float $$3 = $$2.a($$1);
         float $$4 = ami.b($$1, 0.0F, (float) Math.PI);
         this.b = new dwq((double)(ami.b($$4) * $$3), 0.0, (double)(ami.a($$4) * $$3));
      }

      private b() {
         this.a = 0;
         this.b = null;
      }

      static dej.b a() {
         return new dej.b();
      }

      gt a(gt $$0) {
         if (this.b == null) {
            return $$0;
         } else {
            int $$1 = this.a - $$0.v();
            dwq $$2 = this.b.a((double)$$1);
            return $$0.a($$2.c, 0.0, $$2.e);
         }
      }
   }
}
