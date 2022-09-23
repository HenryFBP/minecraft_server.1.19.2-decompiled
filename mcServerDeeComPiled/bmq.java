import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmq implements cgk {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;
   private bmq.a c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public bmq() {
      this.c = bmq.a.c;
   }

   @Override
   public int a(agg $$0, boolean $$1, boolean $$2) {
      if (!$$0.M() && $$1) {
         float $$3 = $$0.f(0.0F);
         if ((double)$$3 == 0.5) {
            this.c = $$0.w.a(10) == 0 ? bmq.a.b : bmq.a.c;
         }

         if (this.c == bmq.a.c) {
            return 0;
         } else {
            if (!this.b) {
               if (!this.a($$0)) {
                  return 0;
               }

               this.b = true;
            }

            if (this.e > 0) {
               --this.e;
               return 0;
            } else {
               this.e = 2;
               if (this.d > 0) {
                  this.b($$0);
                  --this.d;
               } else {
                  this.c = bmq.a.c;
               }

               return 1;
            }
         }
      } else {
         this.c = bmq.a.c;
         this.b = false;
         return 0;
      }
   }

   private boolean a(agg $$0) {
      for(buc $$1 : $$0.w()) {
         if (!$$1.B_()) {
            gt $$2 = $$1.da();
            if ($$0.b($$2) && !$$0.w($$2).a(akk.ab)) {
               for(int $$3 = 0; $$3 < 10; ++$$3) {
                  float $$4 = $$0.w.i() * (float) (Math.PI * 2);
                  this.f = $$2.u() + ami.d(ami.b($$4) * 32.0F);
                  this.g = $$2.v();
                  this.h = $$2.w() + ami.d(ami.a($$4) * 32.0F);
                  if (this.a($$0, new gt(this.f, this.g, this.h)) != null) {
                     this.e = 0;
                     this.d = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   private void b(agg $$0) {
      dwq $$1 = this.a($$0, new gt(this.f, this.g, this.h));
      if ($$1 != null) {
         bsj $$2;
         try {
            $$2 = new bsj($$0);
            $$2.a($$0, $$0.d_($$2.da()), bcg.h, null, null);
         } catch (Exception var5) {
            a.warn("Failed to create zombie for village siege at {}", $$1, var5);
            return;
         }

         $$2.b($$1.c, $$1.d, $$1.e, $$0.w.i() * 360.0F, 0.0F);
         $$0.a_($$2);
      }
   }

   @Nullable
   private dwq a(agg $$0, gt $$1) {
      for(int $$2 = 0; $$2 < 10; ++$$2) {
         int $$3 = $$1.u() + $$0.w.a(16) - 8;
         int $$4 = $$1.w() + $$0.w.a(16) - 8;
         int $$5 = $$0.a(dar.a.b, $$3, $$4);
         gt $$6 = new gt($$3, $$5, $$4);
         if ($$0.b($$6) && brq.b(bbr.bj, $$0, bcg.h, $$6, $$0.w)) {
            return dwq.c($$6);
         }
      }

      return null;
   }

   static enum a {
      a,
      b,
      c;
   }
}
