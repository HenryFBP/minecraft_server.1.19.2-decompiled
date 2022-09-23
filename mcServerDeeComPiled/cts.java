public abstract class cts {
   private static final int a = 5;
   private int b;

   protected abstract void a(cgx var1, gt var2, cvo var3);

   protected abstract void b(cgx var1, gt var2, cvo var3);

   protected abstract void a(cgx var1, gt var2, cvo var3, int var4, int var5);

   protected abstract boolean a(buc var1);

   public void a(buc $$0, cgx $$1, gt $$2, cvo $$3) {
      int $$4 = this.b++;
      if ($$4 == 0) {
         this.a($$1, $$2, $$3);
         $$1.a($$0, czv.k, $$2);
         d($$1, $$2, $$3);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   public void b(buc $$0, cgx $$1, gt $$2, cvo $$3) {
      int $$4 = this.b--;
      if (this.b == 0) {
         this.b($$1, $$2, $$3);
         $$1.a($$0, czv.j, $$2);
      }

      this.a($$1, $$2, $$3, $$4, this.b);
   }

   private int a(cgx $$0, gt $$1) {
      int $$2 = $$1.u();
      int $$3 = $$1.v();
      int $$4 = $$1.w();
      float $$5 = 5.0F;
      dwl $$6 = new dwl(
         (double)((float)$$2 - 5.0F),
         (double)((float)$$3 - 5.0F),
         (double)((float)$$4 - 5.0F),
         (double)((float)($$2 + 1) + 5.0F),
         (double)((float)($$3 + 1) + 5.0F),
         (double)((float)($$4 + 1) + 5.0F)
      );
      return $$0.a(czj.a(buc.class), $$6, this::a).size();
   }

   public void c(cgx $$0, gt $$1, cvo $$2) {
      int $$3 = this.a($$0, $$1);
      int $$4 = this.b;
      if ($$4 != $$3) {
         boolean $$5 = $$3 != 0;
         boolean $$6 = $$4 != 0;
         if ($$5 && !$$6) {
            this.a($$0, $$1, $$2);
            $$0.a(null, czv.k, $$1);
         } else if (!$$5) {
            this.b($$0, $$1, $$2);
            $$0.a(null, czv.j, $$1);
         }

         this.b = $$3;
      }

      this.a($$0, $$1, $$2, $$4, $$3);
      if ($$3 > 0) {
         d($$0, $$1, $$2);
      }

   }

   public int a() {
      return this.b;
   }

   private static void d(cgx $$0, gt $$1, cvo $$2) {
      $$0.a($$1, $$2.b(), 5);
   }
}
