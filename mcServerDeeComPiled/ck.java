import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ck {
   public static final ck a = new ck(Collections.emptyMap());
   private final Map<bbe, ck.a> b;

   public ck(Map<bbe, ck.a> $$0) {
      this.b = $$0;
   }

   public static ck a() {
      return new ck(Maps.newLinkedHashMap());
   }

   public ck a(bbe $$0) {
      this.b.put($$0, new ck.a());
      return this;
   }

   public ck a(bbe $$0, ck.a $$1) {
      this.b.put($$0, $$1);
      return this;
   }

   public boolean a(bbn $$0) {
      if (this == a) {
         return true;
      } else {
         return $$0 instanceof bcc ? this.a(((bcc)$$0).ed()) : false;
      }
   }

   public boolean a(bcc $$0) {
      return this == a ? true : this.a($$0.ed());
   }

   public boolean a(Map<bbe, bbg> $$0) {
      if (this == a) {
         return true;
      } else {
         for(Entry<bbe, ck.a> $$1 : this.b.entrySet()) {
            bbg $$2 = (bbg)$$0.get($$1.getKey());
            if (!((ck.a)$$1.getValue()).a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   public static ck a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "effects");
         Map<bbe, ck.a> $$2 = Maps.newLinkedHashMap();

         for(Entry<String, JsonElement> $$3 : $$1.entrySet()) {
            abb $$4 = new abb((String)$$3.getKey());
            bbe $$5 = (bbe)hm.U.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown effect '" + $$4 + "'"));
            ck.a $$6 = ck.a.a(alz.m((JsonElement)$$3.getValue(), (String)$$3.getKey()));
            $$2.put($$5, $$6);
         }

         return new ck($$2);
      } else {
         return a;
      }
   }

   public JsonElement b() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();

         for(Entry<bbe, ck.a> $$1 : this.b.entrySet()) {
            $$0.add(hm.U.b((bbe)$$1.getKey()).toString(), ((ck.a)$$1.getValue()).a());
         }

         return $$0;
      }
   }

   public static class a {
      private final cj.d a;
      private final cj.d b;
      @Nullable
      private final Boolean c;
      @Nullable
      private final Boolean d;

      public a(cj.d $$0, cj.d $$1, @Nullable Boolean $$2, @Nullable Boolean $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public a() {
         this(cj.d.e, cj.d.e, null, null);
      }

      public boolean a(@Nullable bbg $$0) {
         if ($$0 == null) {
            return false;
         } else if (!this.a.d($$0.d())) {
            return false;
         } else if (!this.b.d($$0.c())) {
            return false;
         } else if (this.c != null && this.c != $$0.e()) {
            return false;
         } else {
            return this.d == null || this.d == $$0.f();
         }
      }

      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         $$0.add("amplifier", this.a.d());
         $$0.add("duration", this.b.d());
         $$0.addProperty("ambient", this.c);
         $$0.addProperty("visible", this.d);
         return $$0;
      }

      public static ck.a a(JsonObject $$0) {
         cj.d $$1 = cj.d.a($$0.get("amplifier"));
         cj.d $$2 = cj.d.a($$0.get("duration"));
         Boolean $$3 = $$0.has("ambient") ? alz.j($$0, "ambient") : null;
         Boolean $$4 = $$0.has("visible") ? alz.j($$0, "visible") : null;
         return new ck.a($$1, $$2, $$3, $$4);
      }
   }
}
