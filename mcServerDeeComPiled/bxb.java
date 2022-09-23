import java.util.Optional;
import java.util.function.BiConsumer;

public class bxb extends bxv<bxa> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final bxa r = new bxa(this, 3, 3);
   private final bxy s = new bxy();
   private final bwx t;
   private final buc u;

   public bxb(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public bxb(int $$0, bub $$1, bwx $$2) {
      super(bxq.l, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new bxz($$1.l, this.r, this.s, 0, 124, 35));

      for(int $$3 = 0; $$3 < 3; ++$$3) {
         for(int $$4 = 0; $$4 < 3; ++$$4) {
            this.a(new byd(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for(int $$5 = 0; $$5 < 3; ++$$5) {
         for(int $$6 = 0; $$6 < 9; ++$$6) {
            this.a(new byd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for(int $$7 = 0; $$7 < 9; ++$$7) {
         this.a(new byd($$1, $$7, 8 + $$7 * 18, 142));
      }

   }

   protected static void a(bwm $$0, cgx $$1, buc $$2, bxa $$3, bxy $$4) {
      if (!$$1.y) {
         agh $$5 = (agh)$$2;
         cax $$6 = cax.b;
         Optional<cdh> $$7 = $$1.n().aE().a(cds.a, $$3, $$1);
         if ($$7.isPresent()) {
            cdh $$8 = (cdh)$$7.get();
            if ($$4.a($$1, $$5, $$8)) {
               $$6 = $$8.a($$3);
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.b.a(new tz($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bac $$0) {
      this.t.a((BiConsumer<cgx, gt>)(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s)));
   }

   @Override
   public void a(bug $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cdp<? super bxa> $$0) {
      return $$0.a(this.r, this.u.s);
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.t.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.r)));
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.t, $$0, cju.cl);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 0) {
            this.t.a((BiConsumer<cgx, gt>)(($$2x, $$3x) -> $$4.c().b($$4, $$2x, $$0)));
            if (!this.a($$4, 10, 46, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cax.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cax.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
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
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return $$1.d != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.g();
   }

   @Override
   public int o() {
      return this.r.f();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public bxw t() {
      return bxw.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
