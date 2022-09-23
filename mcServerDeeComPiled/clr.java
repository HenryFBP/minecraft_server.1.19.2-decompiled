import javax.annotation.Nullable;

public class clr extends cka {
   public static final cwm<cwk> a = cwe.ae;

   public clr(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, cwk.b));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      cwk $$6 = $$0.c(a);
      if ($$1.o() != gy.a.b || $$6 == cwk.b != ($$1 == gy.b) || $$2.a(this) && $$2.c(a) != $$6) {
         return $$6 == cwk.b && $$1 == gy.a && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cju.a.m();
      }
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      gt $$1 = $$0.a();
      cgx $$2 = $$0.q();
      return $$1.v() < $$2.ah() - 1 && $$2.a_($$1.b()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      gt $$5 = $$1.b();
      $$0.a($$5, a($$0, $$5, this.m().a(a, cwk.a)), 3);
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      if ($$0.c(a) != cwk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         cvo $$3 = $$1.a_($$2.c());
         return $$3.a(this) && $$3.c(a) == cwk.b;
      }
   }

   public static void a(cgy $$0, cvo $$1, gt $$2, int $$3) {
      gt $$4 = $$2.b();
      $$0.a($$2, a($$0, $$2, $$1.a(a, cwk.b)), $$3);
      $$0.a($$4, a($$0, $$4, $$1.a(a, cwk.a)), $$3);
   }

   public static cvo a(cha $$0, gt $$1, cvo $$2) {
      return $$2.b(cwe.C) ? $$2.a(cwe.C, Boolean.valueOf($$0.C($$1))) : $$2;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.ez());
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cgx $$0, buc $$1, gt $$2, cvo $$3, @Nullable cti $$4, cax $$5) {
      super.a($$0, $$1, $$2, cju.a.m(), $$4, $$5);
   }

   protected static void b(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      cwk $$4 = $$2.c(a);
      if ($$4 == cwk.a) {
         gt $$5 = $$1.c();
         cvo $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(a) == cwk.b) {
            cvo $$7 = $$6.b(cwe.C) && $$6.c(cwe.C) ? cju.C.m() : cju.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cjt.i($$6));
         }
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   @Override
   public long a(cvo $$0, gt $$1) {
      return ami.c($$1.u(), $$1.c($$0.c(a) == cwk.b ? 0 : 1).v(), $$1.w());
   }
}
