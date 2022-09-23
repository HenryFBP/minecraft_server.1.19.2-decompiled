import com.google.common.collect.Lists;
import java.util.List;

public class dsz extends dso {
   dsz(dsv[] $$0, dux[] $$1) {
      super($$0, $$1);
   }

   @Override
   public dsw a() {
      return dst.g;
   }

   @Override
   protected dsn a(dsn[] $$0) {
      switch($$0.length) {
         case 0:
            return b;
         case 1:
            return $$0[0];
         case 2:
            return $$0[0].and($$0[1]);
         default:
            return ($$1, $$2) -> {
               for(dsn $$3 : $$0) {
                  if (!$$3.expand($$1, $$2)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }

   public static dsz.a a(dsv.a<?>... $$0) {
      return new dsz.a($$0);
   }

   public static class a extends dsv.a<dsz.a> {
      private final List<dsv> a = Lists.newArrayList();

      public a(dsv.a<?>... $$0) {
         for(dsv.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }

      }

      protected dsz.a a() {
         return this;
      }

      @Override
      public dsz.a c(dsv.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public dsv b() {
         return new dsz((dsv[])this.a.toArray(new dsv[0]), this.f());
      }
   }
}
