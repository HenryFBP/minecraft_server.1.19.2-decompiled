import java.util.function.Supplier;

public class cmo extends cka implements cjv {
   protected static final dxj a = cjt.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double b = 0.4;
   private final Supplier<hc<ddg<dec, ?>>> c;

   protected cmo(cvn.c $$0, Supplier<hc<ddg<dec, ?>>> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return a;
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(akl.aC) || $$0.a(cju.es) || $$0.a(cju.dh) || super.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      cjt $$4 = ((dec)((ddg)((hc)this.c.get()).a()).c()).b.b();
      cvo $$5 = $$0.a_($$1.c());
      return $$5.a($$4);
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      ((ddg)((hc)this.c.get()).a()).a($$0, $$0.k().g(), $$1, $$2);
   }
}
