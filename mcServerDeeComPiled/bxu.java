import javax.annotation.Nullable;

public class bxu extends bao {
   @Nullable
   private ctx b;

   public bxu() {
      super(27);
   }

   public void a(ctx $$0) {
      this.b = $$0;
   }

   public boolean b(ctx $$0) {
      return this.b == $$0;
   }

   @Override
   public void a(pp $$0) {
      for(int $$1 = 0; $$1 < this.b(); ++$$1) {
         this.a($$1, cax.b);
      }

      for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
         pj $$3 = $$0.a($$2);
         int $$4 = $$3.f("Slot") & 255;
         if ($$4 >= 0 && $$4 < this.b()) {
            this.a($$4, cax.a($$3));
         }
      }

   }

   @Override
   public pp g() {
      pp $$0 = new pp();

      for(int $$1 = 0; $$1 < this.b(); ++$$1) {
         cax $$2 = this.a($$1);
         if (!$$2.b()) {
            pj $$3 = new pj();
            $$3.a("Slot", (byte)$$1);
            $$2.b($$3);
            $$0.add($$3);
         }
      }

      return $$0;
   }

   @Override
   public boolean a(buc $$0) {
      return this.b != null && !this.b.c($$0) ? false : super.a($$0);
   }

   @Override
   public void d_(buc $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }

      super.d_($$0);
   }

   @Override
   public void c_(buc $$0) {
      if (this.b != null) {
         this.b.b($$0);
      }

      super.c_($$0);
      this.b = null;
   }
}
