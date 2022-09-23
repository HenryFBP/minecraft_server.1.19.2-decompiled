import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class bxm extends bwm {
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 2;
   private static final int k = 3;
   private static final int s = 30;
   private static final int t = 30;
   private static final int u = 39;
   protected final bxy o = new bxy();
   protected final bac p = new bao(2) {
      @Override
      public void e() {
         super.e();
         bxm.this.a(this);
      }
   };
   protected final bwx q;
   protected final buc r;

   protected abstract boolean a(buc var1, boolean var2);

   protected abstract void a(buc var1, cax var2);

   protected abstract boolean a(cvo var1);

   public bxm(@Nullable bxq<?> $$0, int $$1, bub $$2, bwx $$3) {
      super($$0, $$1);
      this.q = $$3;
      this.r = $$2.l;
      this.a(new byd(this.p, 0, 27, 47));
      this.a(new byd(this.p, 1, 76, 47));
      this.a(new byd(this.o, 2, 134, 47) {
         @Override
         public boolean a(cax $$0) {
            return false;
         }

         @Override
         public boolean a(buc $$0) {
            return bxm.this.a($$0, this.f());
         }

         @Override
         public void a(buc $$0, cax $$1) {
            bxm.this.a($$0, $$1);
         }
      });

      for(int $$4 = 0; $$4 < 3; ++$$4) {
         for(int $$5 = 0; $$5 < 9; ++$$5) {
            this.a(new byd($$2, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for(int $$6 = 0; $$6 < 9; ++$$6) {
         this.a(new byd($$2, $$6, 8 + $$6 * 18, 142));
      }

   }

   @Override
   public abstract void l();

   @Override
   public void a(bac $$0) {
      super.a($$0);
      if ($$0 == this.p) {
         this.l();
      }

   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.q.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.p)));
   }

   @Override
   public boolean a(buc $$0) {
      return this.q.a(($$1, $$2) -> !this.a($$1.a_($$2)) ? false : $$0.h((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5) <= 64.0, true);
   }

   protected boolean c(cax $$0) {
      return false;
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 39) {
               int $$5 = this.c($$2) ? 1 : 0;
               if (!this.a($$4, $$5, 2, false)) {
                  return cax.b;
               }
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         } else {
            $$3.d();
         }

         if ($$4.K() == $$2.K()) {
            return cax.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
