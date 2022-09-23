import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cq implements bp {
   public static final int b = 100;
   private final cj.d c;
   @Nullable
   private final cgu d;
   private final Map<akd<?>, cj.d> e;
   private final Object2BooleanMap<abb> f;
   private final Map<abb, cq.c> g;
   private final bo h;

   private static cq.c b(JsonElement $$0) {
      if ($$0.isJsonPrimitive()) {
         boolean $$1 = $$0.getAsBoolean();
         return new cq.b($$1);
      } else {
         Object2BooleanMap<String> $$2 = new Object2BooleanOpenHashMap();
         JsonObject $$3 = alz.m($$0, "criterion data");
         $$3.entrySet().forEach($$1 -> {
            boolean $$2x = alz.c((JsonElement)$$1.getValue(), "criterion test");
            $$2.put((String)$$1.getKey(), $$2x);
         });
         return new cq.a($$2);
      }
   }

   cq(cj.d $$0, @Nullable cgu $$1, Map<akd<?>, cj.d> $$2, Object2BooleanMap<abb> $$3, Map<abb, cq.c> $$4, bo $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
   }

   @Override
   public boolean a(bbn $$0, agg $$1, @Nullable dwq $$2) {
      if (!($$0 instanceof agh)) {
         return false;
      } else {
         agh $$3 = (agh)$$0;
         if (!this.c.d($$3.ci)) {
            return false;
         } else if (this.d != null && this.d != $$3.d.b()) {
            return false;
         } else {
            akh $$4 = $$3.D();

            for(Entry<akd<?>, cj.d> $$5 : this.e.entrySet()) {
               int $$6 = $$4.a((akd<?>)$$5.getKey());
               if (!((cj.d)$$5.getValue()).d($$6)) {
                  return false;
               }
            }

            ajz $$7 = $$3.E();
            ObjectIterator var13 = this.f.object2BooleanEntrySet().iterator();

            while(var13.hasNext()) {
               it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<abb> $$8 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var13.next();
               if ($$7.b((abb)$$8.getKey()) != $$8.getBooleanValue()) {
                  return false;
               }
            }

            if (!this.g.isEmpty()) {
               abj $$9 = $$3.M();
               abm $$10 = $$3.cD().az();

               for(Entry<abb, cq.c> $$11 : this.g.entrySet()) {
                  af $$12 = $$10.a((abb)$$11.getKey());
                  if ($$12 == null || !((cq.c)$$11.getValue()).test($$9.b($$12))) {
                     return false;
                  }
               }
            }

            if (this.h != bo.a) {
               dwq $$13 = $$3.bj();
               dwq $$14 = $$3.e(1.0F);
               dwq $$15 = $$13.b($$14.c * 100.0, $$14.d * 100.0, $$14.e * 100.0);
               dwn $$16 = buv.a($$3.s, $$3, $$13, $$15, new dwl($$13, $$15).g(1.0), $$0x -> !$$0x.B_(), 0.0F);
               if ($$16 == null || $$16.c() != dwo.a.c) {
                  return false;
               }

               bbn $$17 = $$16.a();
               if (!this.h.a($$3, $$17) || !$$3.B($$17)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public static cq a(JsonObject $$0) {
      cj.d $$1 = cj.d.a($$0.get("level"));
      String $$2 = alz.a($$0, "gamemode", "");
      cgu $$3 = cgu.a($$2, null);
      Map<akd<?>, cj.d> $$4 = Maps.newHashMap();
      JsonArray $$5 = alz.a($$0, "stats", null);
      if ($$5 != null) {
         for(JsonElement $$6 : $$5) {
            JsonObject $$7 = alz.m($$6, "stats entry");
            abb $$8 = new abb(alz.h($$7, "type"));
            akf<?> $$9 = hm.an.a($$8);
            if ($$9 == null) {
               throw new JsonParseException("Invalid stat type: " + $$8);
            }

            abb $$10 = new abb(alz.h($$7, "stat"));
            akd<?> $$11 = a($$9, $$10);
            cj.d $$12 = cj.d.a($$7.get("value"));
            $$4.put($$11, $$12);
         }
      }

      Object2BooleanMap<abb> $$13 = new Object2BooleanOpenHashMap();
      JsonObject $$14 = alz.a($$0, "recipes", new JsonObject());

      for(Entry<String, JsonElement> $$15 : $$14.entrySet()) {
         abb $$16 = new abb((String)$$15.getKey());
         boolean $$17 = alz.c((JsonElement)$$15.getValue(), "recipe present");
         $$13.put($$16, $$17);
      }

      Map<abb, cq.c> $$18 = Maps.newHashMap();
      JsonObject $$19 = alz.a($$0, "advancements", new JsonObject());

      for(Entry<String, JsonElement> $$20 : $$19.entrySet()) {
         abb $$21 = new abb((String)$$20.getKey());
         cq.c $$22 = b((JsonElement)$$20.getValue());
         $$18.put($$21, $$22);
      }

      bo $$23 = bo.a($$0.get("looking_at"));
      return new cq($$1, $$3, $$4, $$13, $$18, $$23);
   }

   private static <T> akd<T> a(akf<T> $$0, abb $$1) {
      hm<T> $$2 = $$0.a();
      T $$3 = $$2.a($$1);
      if ($$3 == null) {
         throw new JsonParseException("Unknown object " + $$1 + " for stat type " + hm.an.b($$0));
      } else {
         return $$0.b($$3);
      }
   }

   private static <T> abb a(akd<T> $$0) {
      return $$0.a().a().b($$0.b());
   }

   @Override
   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.add("level", this.c.d());
      if (this.d != null) {
         $$0.addProperty("gamemode", this.d.b());
      }

      if (!this.e.isEmpty()) {
         JsonArray $$1 = new JsonArray();
         this.e.forEach(($$1, $$2) -> {
            JsonObject $$3x = new JsonObject();
            $$3x.addProperty("type", hm.an.b($$1.a()).toString());
            $$3x.addProperty("stat", a($$1).toString());
            $$3x.add("value", $$2.d());
            $$1.add($$3x);
         });
         $$0.add("stats", $$1);
      }

      if (!this.f.isEmpty()) {
         JsonObject $$2 = new JsonObject();
         this.f.forEach(($$1, $$2) -> $$2.addProperty($$1.toString(), $$2));
         $$0.add("recipes", $$2);
      }

      if (!this.g.isEmpty()) {
         JsonObject $$3 = new JsonObject();
         this.g.forEach(($$1, $$2) -> $$3.add($$1.toString(), $$2.a()));
         $$0.add("advancements", $$3);
      }

      $$0.add("looking_at", this.h.a());
      return $$0;
   }

   @Override
   public bp.a c() {
      return bp.b.d;
   }

   static class a implements cq.c {
      private final Object2BooleanMap<String> a;

      public a(Object2BooleanMap<String> $$0) {
         this.a = $$0;
      }

      @Override
      public JsonElement a() {
         JsonObject $$0 = new JsonObject();
         this.a.forEach($$0::addProperty);
         return $$0;
      }

      public boolean a(ah $$0) {
         ObjectIterator var2 = this.a.object2BooleanEntrySet().iterator();

         while(var2.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry<String> $$1 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var2.next();
            al $$2 = $$0.c((String)$$1.getKey());
            if ($$2 == null || $$2.a() != $$1.getBooleanValue()) {
               return false;
            }
         }

         return true;
      }
   }

   static class b implements cq.c {
      private final boolean a;

      public b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public JsonElement a() {
         return new JsonPrimitive(this.a);
      }

      public boolean a(ah $$0) {
         return $$0.a() == this.a;
      }
   }

   interface c extends Predicate<ah> {
      JsonElement a();
   }

   public static class d {
      private cj.d a = cj.d.e;
      @Nullable
      private cgu b;
      private final Map<akd<?>, cj.d> c = Maps.newHashMap();
      private final Object2BooleanMap<abb> d = new Object2BooleanOpenHashMap();
      private final Map<abb, cq.c> e = Maps.newHashMap();
      private bo f = bo.a;

      public static cq.d a() {
         return new cq.d();
      }

      public cq.d a(cj.d $$0) {
         this.a = $$0;
         return this;
      }

      public cq.d a(akd<?> $$0, cj.d $$1) {
         this.c.put($$0, $$1);
         return this;
      }

      public cq.d a(abb $$0, boolean $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cq.d a(cgu $$0) {
         this.b = $$0;
         return this;
      }

      public cq.d a(bo $$0) {
         this.f = $$0;
         return this;
      }

      public cq.d b(abb $$0, boolean $$1) {
         this.e.put($$0, new cq.b($$1));
         return this;
      }

      public cq.d a(abb $$0, Map<String, Boolean> $$1) {
         this.e.put($$0, new cq.a(new Object2BooleanOpenHashMap($$1)));
         return this;
      }

      public cq b() {
         return new cq(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }
}
