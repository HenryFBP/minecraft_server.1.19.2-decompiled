import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

public class dsb {
   @Nullable
   final dvs a;
   @Nullable
   final dvs b;
   private final dsb.b c;
   private final dsb.a d;

   public Set<dui<?>> a() {
      Builder<dui<?>> $$0 = ImmutableSet.builder();
      if (this.a != null) {
         $$0.addAll(this.a.b());
      }

      if (this.b != null) {
         $$0.addAll(this.b.b());
      }

      return $$0.build();
   }

   dsb(@Nullable dvs $$0, @Nullable dvs $$1) {
      this.a = $$0;
      this.b = $$1;
      if ($$0 == null) {
         if ($$1 == null) {
            this.c = ($$0x, $$1x) -> $$1x;
            this.d = ($$0x, $$1x) -> true;
         } else {
            this.c = ($$1x, $$2) -> Math.min($$1.a($$1x), $$2);
            this.d = ($$1x, $$2) -> $$2 <= $$1.a($$1x);
         }
      } else if ($$1 == null) {
         this.c = ($$1x, $$2) -> Math.max($$0.a($$1x), $$2);
         this.d = ($$1x, $$2) -> $$2 >= $$0.a($$1x);
      } else {
         this.c = ($$2, $$3) -> ami.a($$3, $$0.a($$2), $$1.a($$2));
         this.d = ($$2, $$3) -> $$3 >= $$0.a($$2) && $$3 <= $$1.a($$2);
      }

   }

   public static dsb a(int $$0) {
      dvq $$1 = dvq.a((float)$$0);
      return new dsb($$1, $$1);
   }

   public static dsb a(int $$0, int $$1) {
      return new dsb(dvq.a((float)$$0), dvq.a((float)$$1));
   }

   public static dsb b(int $$0) {
      return new dsb(dvq.a((float)$$0), null);
   }

   public static dsb c(int $$0) {
      return new dsb(null, dvq.a((float)$$0));
   }

   public int a(dsd $$0, int $$1) {
      return this.c.apply($$0, $$1);
   }

   public boolean b(dsd $$0, int $$1) {
      return this.d.test($$0, $$1);
   }

   @FunctionalInterface
   interface a {
      boolean test(dsd var1, int var2);
   }

   @FunctionalInterface
   interface b {
      int apply(dsd var1, int var2);
   }

   public static class c implements JsonDeserializer<dsb>, JsonSerializer<dsb> {
      public dsb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) {
         if ($$0.isJsonPrimitive()) {
            return dsb.a($$0.getAsInt());
         } else {
            JsonObject $$3 = alz.m($$0, "value");
            dvs $$4 = $$3.has("min") ? alz.a($$3, "min", $$2, dvs.class) : null;
            dvs $$5 = $$3.has("max") ? alz.a($$3, "max", $$2, dvs.class) : null;
            return new dsb($$4, $$5);
         }
      }

      public JsonElement a(dsb $$0, Type $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();
         if (Objects.equals($$0.b, $$0.a)) {
            return $$2.serialize($$0.a);
         } else {
            if ($$0.b != null) {
               $$3.add("max", $$2.serialize($$0.b));
            }

            if ($$0.a != null) {
               $$3.add("min", $$2.serialize($$0.a));
            }

            return $$3;
         }
      }
   }
}
