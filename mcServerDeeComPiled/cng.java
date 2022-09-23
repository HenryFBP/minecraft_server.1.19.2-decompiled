import java.util.Map;

public class cng extends cjt {
   public static final cwf a = cox.a;
   public static final cwf b = cox.b;
   public static final cwf c = cox.c;
   public static final cwf d = cox.d;
   public static final cwf e = cox.e;
   public static final cwf f = cox.f;
   private static final Map<gy, cwf> g = cox.g;

   public cng(cvn.c $$0) {
      super($$0);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(true))
            .a(b, Boolean.valueOf(true))
            .a(c, Boolean.valueOf(true))
            .a(d, Boolean.valueOf(true))
            .a(e, Boolean.valueOf(true))
            .a(f, Boolean.valueOf(true))
      );
   }

   @Override
   public cvo a(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      return this.m()
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.b()).a(this)))
         .a(a, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$2.a(this) ? $$0.a((cwr)g.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a((cwr)g.get($$1.a(gy.c)), (Boolean)$$0.c(a))
         .a((cwr)g.get($$1.a(gy.d)), (Boolean)$$0.c(c))
         .a((cwr)g.get($$1.a(gy.f)), (Boolean)$$0.c(b))
         .a((cwr)g.get($$1.a(gy.e)), (Boolean)$$0.c(d))
         .a((cwr)g.get($$1.a(gy.b)), (Boolean)$$0.c(e))
         .a((cwr)g.get($$1.a(gy.a)), (Boolean)$$0.c(f));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a((cwr)g.get($$1.b(gy.c)), (Boolean)$$0.c(a))
         .a((cwr)g.get($$1.b(gy.d)), (Boolean)$$0.c(c))
         .a((cwr)g.get($$1.b(gy.f)), (Boolean)$$0.c(b))
         .a((cwr)g.get($$1.b(gy.e)), (Boolean)$$0.c(d))
         .a((cwr)g.get($$1.b(gy.b)), (Boolean)$$0.c(e))
         .a((cwr)g.get($$1.b(gy.a)), (Boolean)$$0.c(f));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(e, f, a, b, c, d);
   }
}
