import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class dus implements dux {
   final Map<String, dsb> a;
   final dsd.c b;

   dus(Map<String, dsb> $$0, dsd.c $$1) {
      this.a = ImmutableMap.copyOf($$0);
      this.b = $$1;
   }

   @Override
   public duy a() {
      return duz.g;
   }

   @Override
   public Set<dui<?>> b() {
      return (Set<dui<?>>)Stream.concat(Stream.of(this.b.a()), this.a.values().stream().flatMap($$0 -> $$0.a().stream()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(dsd $$0) {
      bbn $$1 = $$0.c(this.b.a());
      if ($$1 == null) {
         return false;
      } else {
         dxo $$2 = $$1.s.H();

         for(Entry<String, dsb> $$3 : this.a.entrySet()) {
            if (!this.a($$0, $$1, $$2, (String)$$3.getKey(), (dsb)$$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(dsd $$0, bbn $$1, dxo $$2, String $$3, dsb $$4) {
      dxl $$5 = $$2.d($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cq();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static dus.a a(dsd.c $$0) {
      return new dus.a($$0);
   }

   public static class a implements dux.a {
      private final Map<String, dsb> a = Maps.newHashMap();
      private final dsd.c b;

      public a(dsd.c $$0) {
         this.b = $$0;
      }

      public dus.a a(String $$0, dsb $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public dux build() {
         return new dus(this.a, this.b);
      }
   }

   public static class b implements dsj<dus> {
      public void a(JsonObject $$0, dus $$1, JsonSerializationContext $$2) {
         JsonObject $$3 = new JsonObject();

         for(Entry<String, dsb> $$4 : $$1.a.entrySet()) {
            $$3.add((String)$$4.getKey(), $$2.serialize($$4.getValue()));
         }

         $$0.add("scores", $$3);
         $$0.add("entity", $$2.serialize($$1.b));
      }

      public dus b(JsonObject $$0, JsonDeserializationContext $$1) {
         Set<Entry<String, JsonElement>> $$2 = alz.t($$0, "scores").entrySet();
         Map<String, dsb> $$3 = Maps.newLinkedHashMap();

         for(Entry<String, JsonElement> $$4 : $$2) {
            $$3.put((String)$$4.getKey(), (dsb)alz.a((JsonElement)$$4.getValue(), "score", $$1, dsb.class));
         }

         return new dus($$3, alz.a($$0, "entity", $$1, dsd.c.class));
      }
   }
}
