import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Predicate;

public class dun implements dux {
   final dux[] a;
   private final Predicate<dsd> b;

   dun(dux[] $$0) {
      this.a = $$0;
      this.b = duz.b($$0);
   }

   @Override
   public duy a() {
      return duz.b;
   }

   public final boolean a(dsd $$0) {
      return this.b.test($$0);
   }

   @Override
   public void a(dsl $$0) {
      dux.super.a($$0);

      for(int $$1 = 0; $$1 < this.a.length; ++$$1) {
         this.a[$$1].a($$0.b(".term[" + $$1 + "]"));
      }

   }

   public static dun.a a(dux.a... $$0) {
      return new dun.a($$0);
   }

   public static class a implements dux.a {
      private final List<dux> a = Lists.newArrayList();

      public a(dux.a... $$0) {
         for(dux.a $$1 : $$0) {
            this.a.add($$1.build());
         }

      }

      @Override
      public dun.a or(dux.a $$0) {
         this.a.add($$0.build());
         return this;
      }

      @Override
      public dux build() {
         return new dun((dux[])this.a.toArray(new dux[0]));
      }
   }

   public static class b implements dsj<dun> {
      public void a(JsonObject $$0, dun $$1, JsonSerializationContext $$2) {
         $$0.add("terms", $$2.serialize($$1.a));
      }

      public dun b(JsonObject $$0, JsonDeserializationContext $$1) {
         dux[] $$2 = alz.a($$0, "terms", $$1, dux[].class);
         return new dun($$2);
      }
   }
}
