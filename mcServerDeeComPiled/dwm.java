public class dwm extends dwo {
   private final gy b;
   private final gt c;
   private final boolean d;
   private final boolean e;

   public static dwm a(dwq $$0, gy $$1, gt $$2) {
      return new dwm(true, $$0, $$1, $$2, false);
   }

   public dwm(dwq $$0, gy $$1, gt $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private dwm(boolean $$0, dwq $$1, gy $$2, gt $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public dwm a(gy $$0) {
      return new dwm(this.d, this.a, $$0, this.c, this.e);
   }

   public dwm a(gt $$0) {
      return new dwm(this.d, this.a, this.b, $$0, this.e);
   }

   public gt a() {
      return this.c;
   }

   public gy b() {
      return this.b;
   }

   @Override
   public dwo.a c() {
      return this.d ? dwo.a.a : dwo.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
