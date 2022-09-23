import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;

public class dtc extends dtn {
   static final Map<abb, dtc.c> a = Maps.newHashMap();
   final cer b;
   final dtc.b c;

   dtc(dux[] $$0, cer $$1, dtc.b $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dtp a() {
      return dtq.q;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.i);
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      cax $$2 = $$1.c(dul.i);
      if ($$2 != null) {
         int $$3 = cet.a(this.b, $$2);
         int $$4 = this.c.a($$1.a(), $$0.K(), $$3);
         $$0.e($$4);
      }

      return $$0;
   }

   public static dtn.a<?> a(cer $$0, float $$1, int $$2) {
      return a($$3 -> new dtc($$3, $$0, new dtc.a($$2, $$1)));
   }

   public static dtn.a<?> a(cer $$0) {
      return a($$1 -> new dtc($$1, $$0, new dtc.d()));
   }

   public static dtn.a<?> b(cer $$0) {
      return a($$1 -> new dtc($$1, $$0, new dtc.f(1)));
   }

   public static dtn.a<?> a(cer $$0, int $$1) {
      return a($$2 -> new dtc($$2, $$0, new dtc.f($$1)));
   }

   static {
      a.put(dtc.a.a, dtc.a::a);
      a.put(dtc.d.a, dtc.d::a);
      a.put(dtc.f.a, dtc.f::a);
   }

   static final class a implements dtc.b {
      public static final abb a = new abb("binomial_with_bonus_count");
      private final int b;
      private final float c;

      public a(int $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      @Override
      public int a(amn $$0, int $$1, int $$2) {
         for(int $$3 = 0; $$3 < $$2 + this.b; ++$$3) {
            if ($$0.i() < this.c) {
               ++$$1;
            }
         }

         return $$1;
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
         $$0.addProperty("extra", this.b);
         $$0.addProperty("probability", this.c);
      }

      public static dtc.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = alz.n($$0, "extra");
         float $$3 = alz.l($$0, "probability");
         return new dtc.a($$2, $$3);
      }

      @Override
      public abb a() {
         return a;
      }
   }

   interface b {
      int a(amn var1, int var2, int var3);

      void a(JsonObject var1, JsonSerializationContext var2);

      abb a();
   }

   interface c {
      dtc.b deserialize(JsonObject var1, JsonDeserializationContext var2);
   }

   static final class d implements dtc.b {
      public static final abb a = new abb("ore_drops");

      @Override
      public int a(amn $$0, int $$1, int $$2) {
         if ($$2 > 0) {
            int $$3 = $$0.a($$2 + 2) - 1;
            if ($$3 < 0) {
               $$3 = 0;
            }

            return $$1 * ($$3 + 1);
         } else {
            return $$1;
         }
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
      }

      public static dtc.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         return new dtc.d();
      }

      @Override
      public abb a() {
         return a;
      }
   }

   public static class e extends dtn.c<dtc> {
      public void a(JsonObject $$0, dtc $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("enchantment", hm.W.b($$1.b).toString());
         $$0.addProperty("formula", $$1.c.a().toString());
         JsonObject $$3 = new JsonObject();
         $$1.c.a($$3, $$2);
         if ($$3.size() > 0) {
            $$0.add("parameters", $$3);
         }

      }

      public dtc a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         abb $$3 = new abb(alz.h($$0, "enchantment"));
         cer $$4 = (cer)hm.W.b($$3).orElseThrow(() -> new JsonParseException("Invalid enchantment id: " + $$3));
         abb $$5 = new abb(alz.h($$0, "formula"));
         dtc.c $$6 = (dtc.c)dtc.a.get($$5);
         if ($$6 == null) {
            throw new JsonParseException("Invalid formula id: " + $$5);
         } else {
            dtc.b $$7;
            if ($$0.has("parameters")) {
               $$7 = $$6.deserialize(alz.t($$0, "parameters"), $$1);
            } else {
               $$7 = $$6.deserialize(new JsonObject(), $$1);
            }

            return new dtc($$2, $$4, $$7);
         }
      }
   }

   static final class f implements dtc.b {
      public static final abb a = new abb("uniform_bonus_count");
      private final int b;

      public f(int $$0) {
         this.b = $$0;
      }

      @Override
      public int a(amn $$0, int $$1, int $$2) {
         return $$1 + $$0.a(this.b * $$2 + 1);
      }

      @Override
      public void a(JsonObject $$0, JsonSerializationContext $$1) {
         $$0.addProperty("bonusMultiplier", this.b);
      }

      public static dtc.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         int $$2 = alz.n($$0, "bonusMultiplier");
         return new dtc.f($$2);
      }

      @Override
      public abb a() {
         return a;
      }
   }
}
