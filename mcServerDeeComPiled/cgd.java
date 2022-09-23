import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cgd extends cgz {
   @Nullable
   cti c_(gt var1);

   default <T extends cti> Optional<T> a(gt $$0, ctk<T> $$1) {
      cti $$2 = this.c_($$0);
      return $$2 != null && $$2.v() == $$1 ? Optional.of($$2) : Optional.empty();
   }

   cvo a_(gt var1);

   dpv b_(gt var1);

   default int h(gt $$0) {
      return this.a_($$0).g();
   }

   default int L() {
      return 15;
   }

   default Stream<cvo> a(dwl $$0) {
      return gt.a($$0).map(this::a_);
   }

   default dwm a(cgf $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         cvo $$2 = this.a_($$1);
         dwq $$3 = $$0x.b().d($$0x.a());
         return $$0x.c().test($$2) ? new dwm($$0x.a(), gy.a($$3.c, $$3.d, $$3.e), new gt($$0x.a()), false) : null;
      }, $$0x -> {
         dwq $$1 = $$0x.b().d($$0x.a());
         return dwm.a($$0x.a(), gy.a($$1.c, $$1.d, $$1.e), new gt($$0x.a()));
      });
   }

   default dwm a(cgg $$0) {
      return a($$0.b(), $$0.a(), $$0, ($$0x, $$1) -> {
         cvo $$2 = this.a_($$1);
         dpv $$3 = this.b_($$1);
         dwq $$4 = $$0x.b();
         dwq $$5 = $$0x.a();
         dxj $$6 = $$0x.a($$2, this, $$1);
         dwm $$7 = this.a($$4, $$5, $$1, $$6, $$2);
         dxj $$8 = $$0x.a($$3, this, $$1);
         dwm $$9 = $$8.a($$4, $$5, $$1);
         double $$10 = $$7 == null ? Double.MAX_VALUE : $$0x.b().g($$7.e());
         double $$11 = $$9 == null ? Double.MAX_VALUE : $$0x.b().g($$9.e());
         return $$10 <= $$11 ? $$7 : $$9;
      }, $$0x -> {
         dwq $$1 = $$0x.b().d($$0x.a());
         return dwm.a($$0x.a(), gy.a($$1.c, $$1.d, $$1.e), new gt($$0x.a()));
      });
   }

   @Nullable
   default dwm a(dwq $$0, dwq $$1, gt $$2, dxj $$3, cvo $$4) {
      dwm $$5 = $$3.a($$0, $$1, $$2);
      if ($$5 != null) {
         dwm $$6 = $$4.m(this, $$2).a($$0, $$1, $$2);
         if ($$6 != null && $$6.e().d($$0).g() < $$5.e().d($$0).g()) {
            return $$5.a($$6.b());
         }
      }

      return $$5;
   }

   default double a(dxj $$0, Supplier<dxj> $$1) {
      if (!$$0.b()) {
         return $$0.c(gy.a.b);
      } else {
         double $$2 = ((dxj)$$1.get()).c(gy.a.b);
         return $$2 >= 1.0 ? $$2 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   default double i(gt $$0) {
      return this.a(this.a_($$0).k(this, $$0), () -> {
         gt $$1 = $$0.c();
         return this.a_($$1).k(this, $$1);
      });
   }

   static <T, C> T a(dwq $$0, dwq $$1, C $$2, BiFunction<C, gt, T> $$3, Function<C, T> $$4) {
      if ($$0.equals($$1)) {
         return (T)$$4.apply($$2);
      } else {
         double $$5 = ami.d(-1.0E-7, $$1.c, $$0.c);
         double $$6 = ami.d(-1.0E-7, $$1.d, $$0.d);
         double $$7 = ami.d(-1.0E-7, $$1.e, $$0.e);
         double $$8 = ami.d(-1.0E-7, $$0.c, $$1.c);
         double $$9 = ami.d(-1.0E-7, $$0.d, $$1.d);
         double $$10 = ami.d(-1.0E-7, $$0.e, $$1.e);
         int $$11 = ami.b($$8);
         int $$12 = ami.b($$9);
         int $$13 = ami.b($$10);
         gt.a $$14 = new gt.a($$11, $$12, $$13);
         T $$15 = (T)$$3.apply($$2, $$14);
         if ($$15 != null) {
            return $$15;
         } else {
            double $$16 = $$5 - $$8;
            double $$17 = $$6 - $$9;
            double $$18 = $$7 - $$10;
            int $$19 = ami.k($$16);
            int $$20 = ami.k($$17);
            int $$21 = ami.k($$18);
            double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
            double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
            double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
            double $$25 = $$22 * ($$19 > 0 ? 1.0 - ami.g($$8) : ami.g($$8));
            double $$26 = $$23 * ($$20 > 0 ? 1.0 - ami.g($$9) : ami.g($$9));
            double $$27 = $$24 * ($$21 > 0 ? 1.0 - ami.g($$10) : ami.g($$10));

            while($$25 <= 1.0 || $$26 <= 1.0 || $$27 <= 1.0) {
               if ($$25 < $$26) {
                  if ($$25 < $$27) {
                     $$11 += $$19;
                     $$25 += $$22;
                  } else {
                     $$13 += $$21;
                     $$27 += $$24;
                  }
               } else if ($$26 < $$27) {
                  $$12 += $$20;
                  $$26 += $$23;
               } else {
                  $$13 += $$21;
                  $$27 += $$24;
               }

               T $$28 = (T)$$3.apply($$2, $$14.d($$11, $$12, $$13));
               if ($$28 != null) {
                  return $$28;
               }
            }

            return (T)$$4.apply($$2);
         }
      }
   }
}
