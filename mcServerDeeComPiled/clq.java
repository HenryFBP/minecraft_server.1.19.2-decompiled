import java.util.function.BiPredicate;
import java.util.function.Function;

public class clq {
   public static <S extends cti> clq.c<S> a(
      ctk<S> $$0, Function<cvo, clq.a> $$1, Function<cvo, gy> $$2, cwi $$3, cvo $$4, cgy $$5, gt $$6, BiPredicate<cgy, gt> $$7
   ) {
      S $$8 = $$0.a($$5, $$6);
      if ($$8 == null) {
         return clq.b::b;
      } else if ($$7.test($$5, $$6)) {
         return clq.b::b;
      } else {
         clq.a $$9 = (clq.a)$$1.apply($$4);
         boolean $$10 = $$9 == clq.a.a;
         boolean $$11 = $$9 == clq.a.b;
         if ($$10) {
            return new clq.c.b<>($$8);
         } else {
            gt $$12 = $$6.a((gy)$$2.apply($$4));
            cvo $$13 = $$5.a_($$12);
            if ($$13.a($$4.b())) {
               clq.a $$14 = (clq.a)$$1.apply($$13);
               if ($$14 != clq.a.a && $$9 != $$14 && $$13.c($$3) == $$4.c($$3)) {
                  if ($$7.test($$5, $$12)) {
                     return clq.b::b;
                  }

                  S $$15 = $$0.a($$5, $$12);
                  if ($$15 != null) {
                     S $$16 = $$11 ? $$8 : $$15;
                     S $$17 = $$11 ? $$15 : $$8;
                     return new clq.c.a<>($$16, $$17);
                  }
               }
            }

            return new clq.c.b<>($$8);
         }
      }
   }

   public static enum a {
      a,
      b,
      c;
   }

   public interface b<S, T> {
      T a(S var1, S var2);

      T a(S var1);

      T b();
   }

   public interface c<S> {
      <T> T apply(clq.b<? super S, T> var1);

      public static final class a<S> implements clq.c<S> {
         private final S a;
         private final S b;

         public a(S $$0, S $$1) {
            this.a = $$0;
            this.b = $$1;
         }

         @Override
         public <T> T apply(clq.b<? super S, T> $$0) {
            return $$0.a(this.a, this.b);
         }
      }

      public static final class b<S> implements clq.c<S> {
         private final S a;

         public b(S $$0) {
            this.a = $$0;
         }

         @Override
         public <T> T apply(clq.b<? super S, T> $$0) {
            return $$0.a(this.a);
         }
      }
   }
}
