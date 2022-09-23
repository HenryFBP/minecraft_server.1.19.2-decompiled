import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public record dxz<T>(T b, gt c, int d, dye e) {
   private static final String f = "i";
   private static final String g = "x";
   private static final String h = "y";
   private static final String i = "z";
   private static final String j = "t";
   private static final String k = "p";
   public static final Strategy<dxz<?>> a = new Strategy<dxz<?>>() {
      public int a(dxz<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable dxz<?> $$0, @Nullable dxz<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else if ($$0 != null && $$1 != null) {
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
         } else {
            return false;
         }
      }
   };

   public static <T> void a(pp $$0, Function<String, Optional<T>> $$1, cge $$2, Consumer<dxz<T>> $$3) {
      long $$4 = $$2.a();

      for(int $$5 = 0; $$5 < $$0.size(); ++$$5) {
         pj $$6 = $$0.a($$5);
         a($$6, $$1).ifPresent($$2x -> {
            if (cge.a($$2x.b()) == $$4) {
               $$3.accept($$2x);
            }

         });
      }

   }

   public static <T> Optional<dxz<T>> a(pj $$0, Function<String, Optional<T>> $$1) {
      return ((Optional)$$1.apply($$0.l("i"))).map($$1x -> {
         gt $$2 = new gt($$0.h("x"), $$0.h("y"), $$0.h("z"));
         return new dxz<>($$1x, $$2, $$0.h("t"), dye.a($$0.h("p")));
      });
   }

   private static pj a(String $$0, gt $$1, int $$2, dye $$3) {
      pj $$4 = new pj();
      $$4.a("i", $$0);
      $$4.a("x", $$1.u());
      $$4.a("y", $$1.v());
      $$4.a("z", $$1.w());
      $$4.a("t", $$2);
      $$4.a("p", $$3.a());
      return $$4;
   }

   public static <T> pj a(dya<T> $$0, Function<T, String> $$1, long $$2) {
      return a((String)$$1.apply($$0.a()), $$0.b(), (int)($$0.c() - $$2), $$0.d());
   }

   public pj a(Function<T, String> $$0) {
      return a((String)$$0.apply(this.b), this.c, this.d, this.e);
   }

   public dya<T> a(long $$0, long $$1) {
      return new dya<>(this.b, this.c, $$0 + (long)this.d, this.e, $$1);
   }

   public static <T> dxz<T> a(T $$0, gt $$1) {
      return new dxz<>($$0, $$1, 0, dye.d);
   }

   public T a() {
      return this.b;
   }

   public gt b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public dye d() {
      return this.e;
   }
}
