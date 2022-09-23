import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cam extends bzm {
   protected static final Map<cjt, Pair<Predicate<ccz>, Consumer<ccz>>> a = Maps.newHashMap(
      ImmutableMap.of(
         cju.i,
         Pair.of(cam::b, b(cju.cn.m())),
         cju.jq,
         Pair.of(cam::b, b(cju.cn.m())),
         cju.j,
         Pair.of(cam::b, b(cju.cn.m())),
         cju.k,
         Pair.of(cam::b, b(cju.j.m())),
         cju.qp,
         Pair.of((Predicate)$$0 -> true, a(cju.j.m(), caz.dc))
      )
   );

   protected cam(cch $$0, int $$1, float $$2, cat.a $$3) {
      super((float)$$1, $$2, $$0, akl.bq, $$3);
   }

   @Override
   public baj a(ccz $$0) {
      cgx $$1 = $$0.q();
      gt $$2 = $$0.a();
      Pair<Predicate<ccz>, Consumer<ccz>> $$3 = (Pair)a.get($$1.a_($$2).b());
      if ($$3 == null) {
         return baj.d;
      } else {
         Predicate<ccz> $$4 = (Predicate)$$3.getFirst();
         Consumer<ccz> $$5 = (Consumer)$$3.getSecond();
         if ($$4.test($$0)) {
            buc $$6 = $$0.o();
            $$1.a($$6, $$2, ajw.iN, ajx.e, 1.0F, 1.0F);
            if (!$$1.y) {
               $$5.accept($$0);
               if ($$6 != null) {
                  $$0.n().a(1, $$6, $$1x -> $$1x.d($$0.p()));
               }
            }

            return baj.a($$1.y);
         } else {
            return baj.d;
         }
      }
   }

   public static Consumer<ccz> b(cvo $$0) {
      return $$1 -> {
         $$1.q().a($$1.a(), $$0, 11);
         $$1.q().a(czv.c, $$1.a(), czv.a.a($$1.o(), $$0));
      };
   }

   public static Consumer<ccz> a(cvo $$0, cgw $$1) {
      return $$2 -> {
         $$2.q().a($$2.a(), $$0, 11);
         $$2.q().a(czv.c, $$2.a(), czv.a.a($$2.o(), $$0));
         cjt.a($$2.q(), $$2.a(), $$2.k(), new cax($$1));
      };
   }

   public static boolean b(ccz $$0) {
      return $$0.k() != gy.a && $$0.q().a_($$0.a().b()).h();
   }
}
