import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.ArrayUtils;

public class dsm extends dso {
   dsm(dsv[] $$0, dux[] $$1) {
      super($$0, $$1);
   }

   @Override
   public dsw a() {
      return dst.f;
   }

   @Override
   protected dsn a(dsn[] $$0) {
      switch($$0.length) {
         case 0:
            return a;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].or($$0[1]);
         default:
            return ($$1, $$2) -> {
               for(dsn $$3 : $$0) {
                  if ($$3.expand($$1, $$2)) {
                     return true;
                  }
               }

               return false;
            };
      }
   }

   @Override
   public void a(dsl $$0) {
      super.a($$0);

      for(int $$1 = 0; $$1 < this.c.length - 1; ++$$1) {
         if (ArrayUtils.isEmpty(this.c[$$1].d)) {
            $$0.a("Unreachable entry!");
         }
      }

   }

   public static dsm.a a(dsv.a<?>... $$0) {
      return new dsm.a($$0);
   }

   public static <E> dsm.a a(Collection<E> $$0, Function<E, dsv.a<?>> $$1) {
      return new dsm.a((dsv.a<?>[])$$0.stream().map($$1::apply).toArray($$0x -> new dsv.a[$$0x]));
   }

   public static class a extends dsv.a<dsm.a> {
      private final List<dsv> a = Lists.newArrayList();

      public a(dsv.a<?>... $$0) {
         for(dsv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }

      }

      protected dsm.a a() {
         return this;
      }

      @Override
      public dsm.a a(dsv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public dsv b() {
         return new dsm((dsv[])this.a.toArray(new dsv[0]), this.f());
      }
   }
}
