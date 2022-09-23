public class dqp extends dqj {
   private float m = Float.MAX_VALUE;
   private dqj n;
   private boolean o;

   public dqp(dqj $$0) {
      super($$0.a, $$0.b, $$0.c);
   }

   public dqp(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   public void a(float $$0, dqj $$1) {
      if ($$0 < this.m) {
         this.m = $$0;
         this.n = $$1;
      }

   }

   public dqj d() {
      return this.n;
   }

   public void e() {
      this.o = true;
   }

   public boolean f() {
      return this.o;
   }

   public static dqp c(qx $$0) {
      dqp $$1 = new dqp($$0.readInt(), $$0.readInt(), $$0.readInt());
      $$1.j = $$0.readFloat();
      $$1.k = $$0.readFloat();
      $$1.i = $$0.readBoolean();
      $$1.l = dqh.values()[$$0.readInt()];
      $$1.g = $$0.readFloat();
      return $$1;
   }
}
