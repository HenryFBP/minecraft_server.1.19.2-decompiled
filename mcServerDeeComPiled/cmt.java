import java.util.function.ToIntFunction;

public class cmt extends cok implements cjv, cql {
   private static final cwf b = cwe.C;
   private final col c = new col(this);

   public cmt(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<cvo> b(int $$0) {
      return $$1 -> cok.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return !$$1.n().a(caz.fd) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return gy.a().anyMatch($$3x -> this.c.a($$2, $$0, $$1, $$3x.g()));
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return $$0.p().c();
   }

   @Override
   public col c() {
      return this.c;
   }
}
