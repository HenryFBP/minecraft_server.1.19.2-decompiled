import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class dtw extends dtn {
   final Map<cer, dvs> a;
   final boolean b;

   dtw(dux[] $$0, Map<cer, dvs> $$1, boolean $$2) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
      this.b = $$2;
   }

   @Override
   public dtp a() {
      return dtq.e;
   }

   @Override
   public Set<dui<?>> b() {
      return (Set<dui<?>>)this.a.values().stream().flatMap($$0 -> $$0.b().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      Object2IntMap<cer> $$2 = new Object2IntOpenHashMap();
      this.a.forEach(($$2x, $$3) -> $$2.put($$2x, $$3.a($$1)));
      if ($$0.c() == caz.oY) {
         cax $$3 = new cax(caz.ss);
         $$2.forEach(($$1x, $$2x) -> bzy.a($$3, new ceu($$1x, $$2x)));
         return $$3;
      } else {
         Map<cer, Integer> $$4 = cet.a($$0);
         if (this.b) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         cet.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<cer, Integer> $$0, cer $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }

   }

   public static class a extends dtn.a<dtw.a> {
      private final Map<cer, dvs> a = Maps.newHashMap();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected dtw.a a() {
         return this;
      }

      public dtw.a a(cer $$0, dvs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public dto b() {
         return new dtw(this.g(), this.a, this.b);
      }
   }

   public static class b extends dtn.c<dtw> {
      public void a(JsonObject $$0, dtw $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonObject $$3 = new JsonObject();
         $$1.a.forEach(($$2x, $$3x) -> {
            abb $$4 = hm.W.b($$2x);
            if ($$4 == null) {
               throw new IllegalArgumentException("Don't know how to serialize enchantment " + $$2x);
            } else {
               $$3.add($$4.toString(), $$2.serialize($$3x));
            }
         });
         $$0.add("enchantments", $$3);
         $$0.addProperty("add", $$1.b);
      }

      public dtw a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         Map<cer, dvs> $$3 = Maps.newHashMap();
         if ($$0.has("enchantments")) {
            JsonObject $$4 = alz.t($$0, "enchantments");

            for(Entry<String, JsonElement> $$5 : $$4.entrySet()) {
               String $$6 = (String)$$5.getKey();
               JsonElement $$7 = (JsonElement)$$5.getValue();
               cer $$8 = (cer)hm.W.b(new abb($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$6 + "'"));
               dvs $$9 = (dvs)$$1.deserialize($$7, dvs.class);
               $$3.put($$8, $$9);
            }
         }

         boolean $$10 = alz.a($$0, "add", false);
         return new dtw($$2, $$3, $$10);
      }
   }
}
