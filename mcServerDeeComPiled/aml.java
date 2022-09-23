import java.util.function.Supplier;

public class aml {
   public static void a(cgx $$0, gt $$1, im $$2, azo $$3) {
      for(gy $$4 : gy.values()) {
         a($$0, $$1, $$2, $$3, $$4, () -> a($$0.w), 0.55);
      }

   }

   public static void a(cgx $$0, gt $$1, im $$2, azo $$3, gy $$4, Supplier<dwq> $$5, double $$6) {
      int $$7 = $$3.a($$0.w);

      for(int $$8 = 0; $$8 < $$7; ++$$8) {
         a($$0, $$1, $$4, $$2, (dwq)$$5.get(), $$6);
      }

   }

   private static dwq a(amn $$0) {
      return new dwq(ami.a($$0, -0.5, 0.5), ami.a($$0, -0.5, 0.5), ami.a($$0, -0.5, 0.5));
   }

   public static void a(gy.a $$0, cgx $$1, gt $$2, double $$3, im $$4, azu $$5) {
      dwq $$6 = dwq.a($$2);
      boolean $$7 = $$0 == gy.a.a;
      boolean $$8 = $$0 == gy.a.b;
      boolean $$9 = $$0 == gy.a.c;
      int $$10 = $$5.a($$1.w);

      for(int $$11 = 0; $$11 < $$10; ++$$11) {
         double $$12 = $$6.c + ami.a($$1.w, -1.0, 1.0) * ($$7 ? 0.5 : $$3);
         double $$13 = $$6.d + ami.a($$1.w, -1.0, 1.0) * ($$8 ? 0.5 : $$3);
         double $$14 = $$6.e + ami.a($$1.w, -1.0, 1.0) * ($$9 ? 0.5 : $$3);
         double $$15 = $$7 ? ami.a($$1.w, -1.0, 1.0) : 0.0;
         double $$16 = $$8 ? ami.a($$1.w, -1.0, 1.0) : 0.0;
         double $$17 = $$9 ? ami.a($$1.w, -1.0, 1.0) : 0.0;
         $$1.a($$4, $$12, $$13, $$14, $$15, $$16, $$17);
      }

   }

   public static void a(cgx $$0, gt $$1, gy $$2, im $$3, dwq $$4, double $$5) {
      dwq $$6 = dwq.a($$1);
      int $$7 = $$2.j();
      int $$8 = $$2.k();
      int $$9 = $$2.l();
      double $$10 = $$6.c + ($$7 == 0 ? ami.a($$0.w, -0.5, 0.5) : (double)$$7 * $$5);
      double $$11 = $$6.d + ($$8 == 0 ? ami.a($$0.w, -0.5, 0.5) : (double)$$8 * $$5);
      double $$12 = $$6.e + ($$9 == 0 ? ami.a($$0.w, -0.5, 0.5) : (double)$$9 * $$5);
      double $$13 = $$7 == 0 ? $$4.a() : 0.0;
      double $$14 = $$8 == 0 ? $$4.b() : 0.0;
      double $$15 = $$9 == 0 ? $$4.c() : 0.0;
      $$0.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
   }
}
