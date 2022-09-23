import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class due extends dtn {
   final Map<bbe, dvs> a;

   due(dux[] $$0, Map<bbe, dvs> $$1) {
      super($$0);
      this.a = ImmutableMap.copyOf($$1);
   }

   @Override
   public dtp a() {
      return dtq.m;
   }

   @Override
   public Set<dui<?>> b() {
      return (Set<dui<?>>)this.a.values().stream().flatMap($$0 -> $$0.b().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.a(caz.tN) && !this.a.isEmpty()) {
         amn $$2 = $$1.a();
         int $$3 = $$2.a(this.a.size());
         Entry<bbe, dvs> $$4 = (Entry)Iterables.get(this.a.entrySet(), $$3);
         bbe $$5 = (bbe)$$4.getKey();
         int $$6 = ((dvs)$$4.getValue()).a($$1);
         if (!$$5.a()) {
            $$6 *= 20;
         }

         cce.a($$0, $$5, $$6);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static due.a c() {
      return new due.a();
   }

   public static class a extends dtn.a<due.a> {
      private final Map<bbe, dvs> a = Maps.newLinkedHashMap();

      protected due.a a() {
         return this;
      }

      public due.a a(bbe $$0, dvs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public dto b() {
         return new due(this.g(), this.a);
      }
   }

   public static class b extends dtn.c<due> {
      public void a(JsonObject $$0, due $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         if (!$$1.a.isEmpty()) {
            JsonArray $$3 = new JsonArray();

            for(bbe $$4 : $$1.a.keySet()) {
               JsonObject $$5 = new JsonObject();
               abb $$6 = hm.U.b($$4);
               if ($$6 == null) {
                  throw new IllegalArgumentException("Don't know how to serialize mob effect " + $$4);
               }

               $$5.add("type", new JsonPrimitive($$6.toString()));
               $$5.add("duration", $$2.serialize($$1.a.get($$4)));
               $$3.add($$5);
            }

            $$0.add("effects", $$3);
         }

      }

      public due a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         Map<bbe, dvs> $$3 = Maps.newLinkedHashMap();
         if ($$0.has("effects")) {
            for(JsonElement $$5 : alz.u($$0, "effects")) {
               String $$6 = alz.h($$5.getAsJsonObject(), "type");
               bbe $$7 = (bbe)hm.U.b(new abb($$6)).orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + $$6 + "'"));
               dvs $$8 = alz.a($$5.getAsJsonObject(), "duration", $$1, dvs.class);
               $$3.put($$7, $$8);
            }
         }

         return new due($$2, $$3);
      }
   }
}
