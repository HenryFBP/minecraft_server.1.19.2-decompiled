public enum gr {
   a {
      @Override
      public int a(int $$0, int $$1, int $$2, gy.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, gy.a $$3) {
         return $$3.a($$0, $$1, $$2);
      }

      @Override
      public gy.a a(gy.a $$0) {
         return $$0;
      }

      @Override
      public gr a() {
         return this;
      }
   },
   b {
      @Override
      public int a(int $$0, int $$1, int $$2, gy.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, gy.a $$3) {
         return $$3.a($$2, $$0, $$1);
      }

      @Override
      public gy.a a(gy.a $$0) {
         return d[Math.floorMod($$0.ordinal() + 1, 3)];
      }

      @Override
      public gr a() {
         return c;
      }
   },
   c {
      @Override
      public int a(int $$0, int $$1, int $$2, gy.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public double a(double $$0, double $$1, double $$2, gy.a $$3) {
         return $$3.a($$1, $$2, $$0);
      }

      @Override
      public gy.a a(gy.a $$0) {
         return d[Math.floorMod($$0.ordinal() - 1, 3)];
      }

      @Override
      public gr a() {
         return b;
      }
   };

   public static final gy.a[] d = gy.a.values();
   public static final gr[] e = values();

   public abstract int a(int var1, int var2, int var3, gy.a var4);

   public abstract double a(double var1, double var3, double var5, gy.a var7);

   public abstract gy.a a(gy.a var1);

   public abstract gr a();

   public static gr a(gy.a $$0, gy.a $$1) {
      return e[Math.floorMod($$1.ordinal() - $$0.ordinal(), 3)];
   }
}
