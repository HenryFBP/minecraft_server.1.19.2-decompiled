import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.commons.lang3.ArrayUtils;

public abstract class dtn implements dto {
   protected final dux[] g;
   private final Predicate<dsd> a;

   protected dtn(dux[] $$0) {
      this.g = $$0;
      this.a = duz.a($$0);
   }

   public final cax b(cax $$0, dsd $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cax a(cax var1, dsd var2);

   @Override
   public void a(dsl $$0) {
      dto.super.a($$0);

      for(int $$1 = 0; $$1 < this.g.length; ++$$1) {
         this.g[$$1].a($$0.b(".conditions[" + $$1 + "]"));
      }

   }

   protected static dtn.a<?> a(Function<dux[], dto> $$0) {
      return new dtn.b($$0);
   }

   public abstract static class a<T extends dtn.a<T>> implements dto.a, duq<T> {
      private final List<dux> a = Lists.newArrayList();

      public T a(dux.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected dux[] g() {
         return (dux[])this.a.toArray(new dux[0]);
      }
   }

   static final class b extends dtn.a<dtn.b> {
      private final Function<dux[], dto> a;

      public b(Function<dux[], dto> $$0) {
         this.a = $$0;
      }

      protected dtn.b a() {
         return this;
      }

      @Override
      public dto b() {
         return (dto)this.a.apply(this.g());
      }
   }

   public abstract static class c<T extends dtn> implements dsj<T> {
      public void a(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if (!ArrayUtils.isEmpty($$1.g)) {
            $$0.add("conditions", $$2.serialize($$1.g));
         }

      }

      public final T b(JsonObject $$0, JsonDeserializationContext $$1) {
         dux[] $$2 = alz.a($$0, "conditions", new dux[0], $$1, dux[].class);
         return this.b($$0, $$1, $$2);
      }

      public abstract T b(JsonObject var1, JsonDeserializationContext var2, dux[] var3);
   }
}
