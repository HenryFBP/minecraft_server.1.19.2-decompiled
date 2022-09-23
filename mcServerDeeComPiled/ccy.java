public class ccy extends ccx {
   private final gy b;

   public ccy(cgx $$0, gt $$1, gy $$2, cax $$3, gy $$4) {
      super($$0, null, bai.a, $$3, new dwm(dwq.c($$1), $$4, $$1, false));
      this.b = $$2;
   }

   @Override
   public gt a() {
      return this.j().a();
   }

   @Override
   public boolean b() {
      return this.q().a_(this.j().a()).a(this);
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public gy d() {
      return gy.a;
   }

   @Override
   public gy[] f() {
      switch(this.b) {
         case a:
         default:
            return new gy[]{gy.a, gy.c, gy.f, gy.d, gy.e, gy.b};
         case b:
            return new gy[]{gy.a, gy.b, gy.c, gy.f, gy.d, gy.e};
         case c:
            return new gy[]{gy.a, gy.c, gy.f, gy.e, gy.b, gy.d};
         case d:
            return new gy[]{gy.a, gy.d, gy.f, gy.e, gy.b, gy.c};
         case e:
            return new gy[]{gy.a, gy.e, gy.d, gy.b, gy.c, gy.f};
         case f:
            return new gy[]{gy.a, gy.f, gy.d, gy.b, gy.c, gy.e};
      }
   }

   @Override
   public gy g() {
      return this.b.o() == gy.a.b ? gy.c : this.b;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public float i() {
      return (float)(this.b.e() * 90);
   }
}
