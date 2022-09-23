public interface bbz {
   boolean a();

   void a(dwq var1);

   float b();

   default boolean a(bce $$0, bby $$1, dwq $$2) {
      if (!$$0.bo()) {
         return false;
      } else {
         bbn $$3 = $$0.cG();
         if ($$0.bJ() && $$3 instanceof buc) {
            $$0.o($$3.dq());
            $$0.w = $$0.dq();
            $$0.p($$3.ds() * 0.5F);
            $$0.a($$0.dq(), $$0.ds());
            $$0.aX = $$0.dq();
            $$0.aZ = $$0.dq();
            $$0.P = 1.0F;
            $$0.bb = $$0.eK() * 0.1F;
            if ($$1.a && $$1.b++ > $$1.c) {
               $$1.a = false;
            }

            if ($$0.cP()) {
               float $$4 = this.b();
               if ($$1.a) {
                  $$4 += $$4 * 1.15F * ami.a((float)$$1.b / (float)$$1.c * (float) Math.PI);
               }

               $$0.r($$4);
               this.a(new dwq(0.0, 0.0, 1.0));
               $$0.br = 0;
            } else {
               $$0.a($$0, false);
               $$0.f(dwq.b);
            }

            $$0.ax();
            return true;
         } else {
            $$0.P = 0.5F;
            $$0.bb = 0.02F;
            this.a($$2);
            return false;
         }
      }
   }
}
