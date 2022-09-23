import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Comparator;
import javax.annotation.Nullable;

public record dya<T>(T d, gt e, long f, dye g, long h) {
   public static final Comparator<dya<?>> a = ($$0, $$1) -> {
      int $$2 = Long.compare($$0.f, $$1.f);
      if ($$2 != 0) {
         return $$2;
      } else {
         $$2 = $$0.g.compareTo($$1.g);
         return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
      }
   };
   public static final Comparator<dya<?>> b = ($$0, $$1) -> {
      int $$2 = $$0.g.compareTo($$1.g);
      return $$2 != 0 ? $$2 : Long.compare($$0.h, $$1.h);
   };
   public static final Strategy<dya<?>> c = new Strategy<dya<?>>() {
      public int a(dya<?> $$0) {
         return 31 * $$0.b().hashCode() + $$0.a().hashCode();
      }

      public boolean a(@Nullable dya<?> $$0, @Nullable dya<?> $$1) {
         if ($$0 == $$1) {
            return true;
         } else if ($$0 != null && $$1 != null) {
            return $$0.a() == $$1.a() && $$0.b().equals($$1.b());
         } else {
            return false;
         }
      }
   };

   public dya(T $$0, gt $$1, long $$2, long $$3) {
      this($$0, $$1, $$2, dye.d, $$3);
   }

   public dya(T $$0, gt $$1, long $$2, dye $$3, long $$4) {
      $$1 = $$1.h();
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public static <T> dya<T> a(T $$0, gt $$1) {
      return new dya<>($$0, $$1, 0L, dye.d, 0L);
   }

   public T a() {
      return this.d;
   }

   public gt b() {
      return this.e;
   }

   public long c() {
      return this.f;
   }

   public dye d() {
      return this.g;
   }

   public long e() {
      return this.h;
   }
}
