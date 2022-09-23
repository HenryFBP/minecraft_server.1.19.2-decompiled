import com.google.common.base.MoreObjects;
import java.util.Arrays;
import java.util.function.Predicate;
import org.apache.commons.lang3.exception.ExceptionUtils;

class ov implements ok {
   private final oj c;
   private final op d;
   private final gt e;
   int a;
   int b;

   public ov(oj $$0, op $$1, gt $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.a = 0;
      this.b = 0;
   }

   @Override
   public void a(oj $$0) {
      a(this.c, cju.dA);
      ++this.a;
   }

   @Override
   public void b(oj $$0) {
      ++this.b;
      if (!$$0.x()) {
         a($$0, $$0.c() + " passed! (" + $$0.l() + "ms)");
      } else {
         if (this.b >= $$0.z()) {
            a($$0, $$0 + " passed " + this.b + " times of " + this.a + " attempts.");
         } else {
            a(this.c.g(), p.k, "Flaky test " + this.c + " succeeded, attempt: " + this.a + " successes: " + this.b);
            this.a();
         }

      }
   }

   @Override
   public void c(oj $$0) {
      if (!$$0.x()) {
         a($$0, $$0.n());
      } else {
         pa $$1 = this.c.v();
         String $$2 = "Flaky test " + this.c + " failed, attempt: " + this.a + "/" + $$1.i();
         if ($$1.j() > 1) {
            $$2 = $$2 + ", successes: " + this.b + " (" + $$1.j() + " required)";
         }

         a(this.c.g(), p.o, $$2);
         if ($$0.y() - this.a + this.b >= $$0.z()) {
            this.a();
         } else {
            a($$0, new oa(this.a, this.b, $$0));
         }

      }
   }

   public static void a(oj $$0, String $$1) {
      a($$0, cju.dx);
      b($$0, $$1);
   }

   private static void b(oj $$0, String $$1) {
      a($$0.g(), p.k, $$1);
      or.b($$0);
   }

   protected static void a(oj $$0, Throwable $$1) {
      a($$0, $$0.r() ? cju.dG : cju.dt);
      c($$0, ad.d($$1));
      b($$0, $$1);
   }

   protected static void b(oj $$0, Throwable $$1) {
      String $$2 = $$1.getMessage() + ($$1.getCause() == null ? "" : " cause: " + ad.d($$1.getCause()));
      String $$3 = ($$0.r() ? "" : "(optional) ") + $$0.c() + " failed! " + $$2;
      a($$0.g(), $$0.r() ? p.m : p.o, $$3);
      Throwable $$4 = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause($$1), $$1);
      if ($$4 instanceof od $$5) {
         a($$0.g(), $$5.c(), $$5.a());
      }

      or.a($$0);
   }

   private void a() {
      this.c.o();
      oj $$0 = new oj(this.c.v(), this.c.u(), this.c.g());
      $$0.a();
      this.d.a($$0);
      $$0.a(this);
      $$0.a(this.e, 2);
   }

   protected static void a(oj $$0, cjt $$1) {
      agg $$2 = $$0.g();
      gt $$3 = $$0.d();
      gt $$4 = new gt(-1, -1, -1);
      gt $$5 = dot.a($$3.a($$4), coh.a, $$0.u(), $$3);
      $$2.b($$5, cju.eV.m().a($$0.u()));
      gt $$6 = $$5.b(0, 1, 0);
      $$2.b($$6, $$1.m());

      for(int $$7 = -1; $$7 <= 1; ++$$7) {
         for(int $$8 = -1; $$8 <= 1; ++$$8) {
            gt $$9 = $$5.b($$7, -1, $$8);
            $$2.b($$9, cju.bU.m());
         }
      }

   }

   private static void c(oj $$0, String $$1) {
      agg $$2 = $$0.g();
      gt $$3 = $$0.d();
      gt $$4 = new gt(-1, 1, -1);
      gt $$5 = dot.a($$3.a($$4), coh.a, $$0.u(), $$3);
      $$2.b($$5, cju.mL.m().a($$0.u()));
      cvo $$6 = $$2.a_($$5);
      cax $$7 = a($$0.c(), $$0.r(), $$1);
      cnu.a(null, $$2, $$5, $$6, $$7);
   }

   private static cax a(String $$0, boolean $$1, String $$2) {
      cax $$3 = new cax(caz.rX);
      pp $$4 = new pp();
      StringBuffer $$5 = new StringBuffer();
      Arrays.stream($$0.split("\\.")).forEach($$1x -> $$5.append($$1x).append('\n'));
      if (!$$1) {
         $$5.append("(optional)\n");
      }

      $$5.append("-------------------\n");
      $$4.add(qa.a($$5 + $$2));
      $$3.a("pages", $$4);
      return $$3;
   }

   protected static void a(agg $$0, p $$1, String $$2) {
      $$0.a((Predicate<? super agh>)($$0x -> true)).forEach($$2x -> $$2x.a(rq.b($$2).a($$1)));
   }

   private static void a(agg $$0, gt $$1, String $$2) {
      xl.a($$0, $$1, $$2, -2130771968, Integer.MAX_VALUE);
   }
}
