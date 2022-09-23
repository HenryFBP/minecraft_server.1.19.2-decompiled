import com.google.common.base.Predicates;

public class cly extends cjt {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.h;
   protected static final dxj c = cjt.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final dxj d = cjt.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final dxj e = dxg.a(c, d);
   private static cvt f;

   public cly(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$0.c(b) ? e : c;
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().g()).a(b, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   public static cvt b() {
      if (f == null) {
         f = cvu.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', cvs.a(cvy.a))
            .a('^', cvs.a(cvy.a(cju.eF).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(gy.d))))
            .a('>', cvs.a(cvy.a(cju.eF).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(gy.e))))
            .a('v', cvs.a(cvy.a(cju.eF).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(gy.c))))
            .a('<', cvs.a(cvy.a(cju.eF).a(b, Predicates.equalTo(true)).a(a, Predicates.equalTo(gy.f))))
            .b();
      }

      return f;
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
