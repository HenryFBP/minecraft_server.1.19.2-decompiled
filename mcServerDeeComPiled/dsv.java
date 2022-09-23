import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class dsv implements dsn {
   protected final dux[] d;
   private final Predicate<dsd> c;

   protected dsv(dux[] $$0) {
      this.d = $$0;
      this.c = duz.a($$0);
   }

   public void a(dsl $$0) {
      for(int $$1 = 0; $$1 < this.d.length; ++$$1) {
         this.d[$$1].a($$0.b(".condition[" + $$1 + "]"));
      }

   }

   protected final boolean a(dsd $$0) {
      return this.c.test($$0);
   }

   public abstract dsw a();

   public abstract static class a<T extends dsv.a<T>> implements duq<T> {
      private final List<dux> a = Lists.newArrayList();

      protected abstract T ad_();

      public T a(dux.a $$0) {
         this.a.add($$0.build());
         return this.ad_();
      }

      public final T e() {
         return this.ad_();
      }

      protected dux[] f() {
         return (dux[])this.a.toArray(new dux[0]);
      }

      public dsm.a a(dsv.a<?> $$0) {
         return new dsm.a(this, $$0);
      }

      public dsr.a b(dsv.a<?> $$0) {
         return new dsr.a(this, $$0);
      }

      public dsz.a c(dsv.a<?> $$0) {
         return new dsz.a(this, $$0);
      }

      public abstract dsv b();
   }

   public abstract static class b<T extends dsv> implements dsj<T> {
      public final void b(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if (!ArrayUtils.isEmpty($$1.d)) {
            $$0.add("conditions", $$2.serialize($$1.d));
         }

         this.a($$0, $$1, $$2);
      }

      public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
         dux[] $$2 = alz.a($$0, "conditions", new dux[0], $$1, dux[].class);
         return this.b($$0, $$1, $$2);
      }

      public abstract void a(JsonObject var1, T var2, JsonSerializationContext var3);

      public abstract T b(JsonObject var1, JsonDeserializationContext var2, dux[] var3);
   }
}
