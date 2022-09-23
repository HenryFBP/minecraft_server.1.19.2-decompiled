import javax.annotation.Nullable;

public class cqn extends cjt implements cql {
   public static final cwm<cwv> a = cwe.bi;
   public static final cwf b = cwe.C;
   protected static final dxj c = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final dxj d = cjt.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public cqn(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(a, cwv.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(cvo $$0) {
      return $$0.c(a) != cwv.c;
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      cwv $$4 = $$0.c(a);
      switch($$4) {
         case c:
            return dxg.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gt $$1 = $$0.a();
      cvo $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, cwv.c).a(b, Boolean.valueOf(false));
      } else {
         dpv $$3 = $$0.q().b_($$1);
         cvo $$4 = this.m().a(a, cwv.b).a(b, Boolean.valueOf($$3.a() == dpw.c));
         gy $$5 = $$0.k();
         return $$5 != gy.a && ($$5 == gy.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, cwv.a);
      }
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      cax $$2 = $$1.n();
      cwv $$3 = $$0.c(a);
      if ($$3 == cwv.c || !$$2.a(this.l())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         gy $$5 = $$1.k();
         if ($$3 == cwv.b) {
            return $$5 == gy.b || $$4 && $$5.o().d();
         } else {
            return $$5 == gy.a || !$$4 && $$5.o().d();
         }
      } else {
         return true;
      }
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cgy $$0, gt $$1, cvo $$2, dpv $$3) {
      return $$2.c(a) != cwv.c ? cql.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, dpu $$3) {
      return $$2.c(a) != cwv.c ? cql.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      switch($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(akp.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
