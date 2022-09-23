import com.google.common.collect.Lists;
import java.util.List;

public class dsr extends dso {
   dsr(dsv[] $$0, dux[] $$1) {
      super($$0, $$1);
   }

   @Override
   public dsw a() {
      return dst.h;
   }

   @Override
   protected dsn a(dsn[] $$0) {
      switch($$0.length) {
         case 0:
            return b;
         case 1:
            return $$0[0];
         case 2:
            dsn $$1 = $$0[0];
            dsn $$2 = $$0[1];
            return ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         default:
            return ($$1x, $$2x) -> {
               for(dsn $$3 : $$0) {
                  $$3.expand($$1x, $$2x);
               }

               return true;
            };
      }
   }

   public static dsr.a a(dsv.a<?>... $$0) {
      return new dsr.a($$0);
   }

   public static class a extends dsv.a<dsr.a> {
      private final List<dsv> a = Lists.newArrayList();

      public a(dsv.a<?>... $$0) {
         for(dsv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }

      }

      protected dsr.a a() {
         return this;
      }

      @Override
      public dsr.a b(dsv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public dsv b() {
         return new dsr((dsv[])this.a.toArray(new dsv[0]), this.f());
      }
   }
}
