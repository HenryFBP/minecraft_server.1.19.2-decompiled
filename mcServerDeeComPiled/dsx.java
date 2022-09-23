import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;

public abstract class dsx extends dsv {
   public static final int c = 1;
   public static final int e = 0;
   protected final int f;
   protected final int g;
   protected final dto[] h;
   final BiFunction<cax, dsd, cax> i;
   private final dsu j = new dsx.c() {
      @Override
      public void a(Consumer<cax> $$0, dsd $$1) {
         dsx.this.a(dto.a(dsx.this.i, $$0, $$1), $$1);
      }
   };

   protected dsx(int $$0, int $$1, dux[] $$2, dto[] $$3) {
      super($$2);
      this.f = $$0;
      this.g = $$1;
      this.h = $$3;
      this.i = dtq.a($$3);
   }

   @Override
   public void a(dsl $$0) {
      super.a($$0);

      for(int $$1 = 0; $$1 < this.h.length; ++$$1) {
         this.h[$$1].a($$0.b(".functions[" + $$1 + "]"));
      }

   }

   protected abstract void a(Consumer<cax> var1, dsd var2);

   @Override
   public boolean expand(dsd $$0, Consumer<dsu> $$1) {
      if (this.a($$0)) {
         $$1.accept(this.j);
         return true;
      } else {
         return false;
      }
   }

   public static dsx.a<?> a(dsx.d $$0) {
      return new dsx.b($$0);
   }

   public abstract static class a<T extends dsx.a<T>> extends dsv.a<T> implements dtl<T> {
      protected int a = 1;
      protected int b = 0;
      private final List<dto> c = Lists.newArrayList();

      public T a(dto.a $$0) {
         this.c.add($$0.b());
         return this.ad_();
      }

      protected dto[] a() {
         return (dto[])this.c.toArray(new dto[0]);
      }

      public T a(int $$0) {
         this.a = $$0;
         return this.ad_();
      }

      public T b(int $$0) {
         this.b = $$0;
         return this.ad_();
      }
   }

   static class b extends dsx.a<dsx.b> {
      private final dsx.d c;

      public b(dsx.d $$0) {
         this.c = $$0;
      }

      protected dsx.b g() {
         return this;
      }

      @Override
      public dsv b() {
         return this.c.build(this.a, this.b, this.f(), this.a());
      }
   }

   protected abstract class c implements dsu {
      @Override
      public int a(float $$0) {
         return Math.max(ami.d((float)dsx.this.f + (float)dsx.this.g * $$0), 0);
      }
   }

   @FunctionalInterface
   protected interface d {
      dsx build(int var1, int var2, dux[] var3, dto[] var4);
   }

   public abstract static class e<T extends dsx> extends dsv.b<T> {
      public void a(JsonObject $$0, T $$1, JsonSerializationContext $$2) {
         if ($$1.f != 1) {
            $$0.addProperty("weight", $$1.f);
         }

         if ($$1.g != 0) {
            $$0.addProperty("quality", $$1.g);
         }

         if (!ArrayUtils.isEmpty($$1.h)) {
            $$0.add("functions", $$2.serialize($$1.h));
         }

      }

      public final T a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         int $$3 = alz.a($$0, "weight", 1);
         int $$4 = alz.a($$0, "quality", 0);
         dto[] $$5 = alz.a($$0, "functions", new dto[0], $$1, dto[].class);
         return this.b($$0, $$1, $$3, $$4, $$2, $$5);
      }

      protected abstract T b(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, dux[] var5, dto[] var6);
   }
}
