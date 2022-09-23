import javax.annotation.Nullable;

public class dqf extends dqq {
   private final boolean l;
   private float m;
   private float n;

   public dqf(boolean $$0) {
      this.l = $$0;
   }

   @Override
   public void a(chk $$0, bce $$1) {
      super.a($$0, $$1);
      $$1.a(dqh.j, 0.0F);
      this.m = $$1.a(dqh.c);
      $$1.a(dqh.c, 6.0F);
      this.n = $$1.a(dqh.k);
      $$1.a(dqh.k, 4.0F);
   }

   @Override
   public void b() {
      this.b.a(dqh.c, this.m);
      this.b.a(dqh.k, this.n);
      super.b();
   }

   @Nullable
   @Override
   public dqj a() {
      return this.c(new gt(ami.b(this.b.cy().a), ami.b(this.b.cy().b + 0.5), ami.b(this.b.cy().c)));
   }

   @Nullable
   @Override
   public dqp a(double $$0, double $$1, double $$2) {
      return this.a(this.a(ami.b($$0), ami.b($$1 + 0.5), ami.b($$2)));
   }

   @Override
   public int a(dqj[] $$0, dqj $$1) {
      int $$2 = super.a($$0, $$1);
      dqh $$3 = this.a(this.b, $$1.a, $$1.b + 1, $$1.c);
      dqh $$4 = this.a(this.b, $$1.a, $$1.b, $$1.c);
      int $$5;
      if (this.b.a($$3) >= 0.0F && $$4 != dqh.y) {
         $$5 = ami.d(Math.max(1.0F, this.b.P));
      } else {
         $$5 = 0;
      }

      double $$7 = this.a(new gt($$1.a, $$1.b, $$1.c));
      dqj $$8 = this.a($$1.a, $$1.b + 1, $$1.c, Math.max(0, $$5 - 1), $$7, gy.b, $$4);
      dqj $$9 = this.a($$1.a, $$1.b - 1, $$1.c, $$5, $$7, gy.a, $$4);
      if (this.b($$8, $$1)) {
         $$0[$$2++] = $$8;
      }

      if (this.b($$9, $$1) && $$4 != dqh.e) {
         $$0[$$2++] = $$9;
      }

      for(int $$10 = 0; $$10 < $$2; ++$$10) {
         dqj $$11 = $$0[$$10];
         if ($$11.l == dqh.j && this.l && $$11.b < this.b.s.m_() - 10) {
            ++$$11.k;
         }
      }

      return $$2;
   }

   private boolean b(@Nullable dqj $$0, dqj $$1) {
      return this.a($$0, $$1) && $$0.l == dqh.j;
   }

   @Override
   protected double a(gt $$0) {
      return this.b.aR() ? (double)$$0.v() + 0.5 : super.a($$0);
   }

   @Override
   protected boolean c() {
      return true;
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3) {
      gt.a $$4 = new gt.a();
      dqh $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == dqh.j) {
         for(gy $$6 : gy.values()) {
            dqh $$7 = b($$0, $$4.d($$1, $$2, $$3).c($$6));
            if ($$7 == dqh.a) {
               return dqh.k;
            }
         }

         return dqh.j;
      } else {
         return a($$0, $$4);
      }
   }
}
