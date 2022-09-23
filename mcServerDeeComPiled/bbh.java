import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class bbh {
   public static String a(bbg $$0, float $$1) {
      if ($$0.i()) {
         return "**:**";
      } else {
         int $$2 = ami.d((float)$$0.c() * $$1);
         return amx.a($$2);
      }
   }

   public static boolean a(bcc $$0) {
      return $$0.a(bbi.c) || $$0.a(bbi.C);
   }

   public static int b(bcc $$0) {
      int $$1 = 0;
      int $$2 = 0;
      if ($$0.a(bbi.c)) {
         $$1 = $$0.b(bbi.c).d();
      }

      if ($$0.a(bbi.C)) {
         $$2 = $$0.b(bbi.C).d();
      }

      return Math.max($$1, $$2);
   }

   public static boolean c(bcc $$0) {
      return $$0.a(bbi.m) || $$0.a(bbi.C);
   }

   public static List<agh> a(agg $$0, @Nullable bbn $$1, dwq $$2, double $$3, bbg $$4, int $$5) {
      bbe $$6 = $$4.b();
      List<agh> $$7 = $$0.a(
         (Predicate<? super agh>)($$6x -> $$6x.d.d()
               && ($$1 == null || !$$1.p($$6x))
               && $$2.a((hj)$$6x.cY(), $$3)
               && (!$$6x.a($$6) || $$6x.b($$6).d() < $$4.d() || $$6x.b($$6).c() < $$5))
      );
      $$7.forEach($$2x -> $$2x.b(new bbg($$4), $$1));
      return $$7;
   }
}
