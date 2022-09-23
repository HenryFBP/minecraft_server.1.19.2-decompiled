public interface cgz {
   int v_();

   int u_();

   default int ah() {
      return this.u_() + this.v_();
   }

   default int ai() {
      return this.ak() - this.aj();
   }

   default int aj() {
      return hq.a(this.u_());
   }

   default int ak() {
      return hq.a(this.ah() - 1) + 1;
   }

   default boolean v(gt $$0) {
      return this.d($$0.v());
   }

   default boolean d(int $$0) {
      return $$0 < this.u_() || $$0 >= this.ah();
   }

   default int e(int $$0) {
      return this.f(hq.a($$0));
   }

   default int f(int $$0) {
      return $$0 - this.aj();
   }

   default int g(int $$0) {
      return $$0 + this.aj();
   }

   static cgz e(final int $$0, final int $$1) {
      return new cgz() {
         @Override
         public int v_() {
            return $$1;
         }

         @Override
         public int u_() {
            return $$0;
         }
      };
   }
}
