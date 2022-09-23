import javax.annotation.Nullable;

public abstract class cji extends cjt {
   protected static final dxj a = cjt.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final dxj b = cjt.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final dwl c = new dwl(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   protected cji(cvn.c $$0) {
      super($$0);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean Y_() {
      return true;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.c();
      return c($$1, $$3) || a($$1, $$3, gy.b);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }

      }
   }

   protected void a(@Nullable bbn $$0, cgx $$1, gt $$2, cvo $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         cvo $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         this.b((cgy)$$1, $$2);
         $$1.a($$0, czv.e, $$2);
      } else if ($$7 && !$$6) {
         this.a((cgy)$$1, $$2);
         $$1.a($$0, czv.a, $$2);
      }

      if ($$7) {
         $$1.a(new gt($$2), this, this.b());
      }

   }

   protected abstract void a(cgy var1, gt var2);

   protected abstract void b(cgy var1, gt var2);

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cgx $$0, gt $$1) {
      $$0.a($$1, this);
      $$0.a($$1.c(), this);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return this.g($$0);
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$3 == gy.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   protected abstract int b(cgx var1, gt var2);

   protected abstract int g(cvo var1);

   protected abstract cvo a(cvo var1, int var2);
}
