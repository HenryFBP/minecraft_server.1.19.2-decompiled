import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bp {
   bp a = new bp() {
      @Override
      public boolean a(bbn $$0, agg $$1, @Nullable dwq $$2) {
         return true;
      }

      @Override
      public JsonObject a() {
         return new JsonObject();
      }

      @Override
      public bp.a c() {
         return bp.b.a;
      }
   };

   static bp a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "type_specific");
         String $$2 = alz.a($$1, "type", null);
         if ($$2 == null) {
            return a;
         } else {
            bp.a $$3 = (bp.a)bp.b.h.get($$2);
            if ($$3 == null) {
               throw new JsonSyntaxException("Unknown sub-predicate type: " + $$2);
            } else {
               return $$3.deserialize($$1);
            }
         }
      } else {
         return a;
      }
   }

   boolean a(bbn var1, agg var2, @Nullable dwq var3);

   JsonObject a();

   default JsonElement b() {
      if (this.c() == bp.b.a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = this.a();
         String $$1 = (String)bp.b.h.inverse().get(this.c());
         $$0.addProperty("type", $$1);
         return $$0;
      }
   }

   bp.a c();

   static bp a(bni $$0) {
      return bp.b.f.a($$0);
   }

   static bp a(bnp $$0) {
      return bp.b.g.a($$0);
   }

   public interface a {
      bp deserialize(JsonObject var1);
   }

   public static final class b {
      public static final bp.a a = $$0 -> bp.a;
      public static final bp.a b = cf::a;
      public static final bp.a c = bt::a;
      public static final bp.a d = cq::a;
      public static final bp.a e = cx::a;
      public static final br<bni> f = br.a(hm.bK, $$0 -> $$0 instanceof bnh $$1 ? Optional.of($$1.fS()) : Optional.empty());
      public static final br<bnp> g = br.a(hm.bM, $$0 -> $$0 instanceof boq $$1 ? Optional.of($$1.fJ()) : Optional.empty());
      public static final BiMap<String, bp.a> h = ImmutableBiMap.of(
         "any", a, "lightning", b, "fishing_hook", c, "player", d, "slime", e, "cat", f.a(), "frog", g.a()
      );
   }
}
