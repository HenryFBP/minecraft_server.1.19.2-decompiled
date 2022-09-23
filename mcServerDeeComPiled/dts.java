import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class dts extends dtn {
   final List<dts.b> a;

   dts(dux[] $$0, List<dts.b> $$1) {
      super($$0);
      this.a = ImmutableList.copyOf($$1);
   }

   @Override
   public dtp a() {
      return dtq.j;
   }

   @Override
   public Set<dui<?>> b() {
      return (Set<dui<?>>)this.a.stream().flatMap($$0 -> $$0.d.b().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      amn $$2 = $$1.a();

      for(dts.b $$3 : this.a) {
         UUID $$4 = $$3.e;
         if ($$4 == null) {
            $$4 = UUID.randomUUID();
         }

         bbs $$5 = ad.a((bbs[])$$3.f, $$2);
         $$0.a($$3.b, new bdb($$4, $$3.a, (double)$$3.d.b($$1), $$3.c), $$5);
      }

      return $$0;
   }

   public static dts.c a(String $$0, bcy $$1, bdb.a $$2, dvs $$3) {
      return new dts.c($$0, $$1, $$2, $$3);
   }

   public static dts.a c() {
      return new dts.a();
   }

   public static class a extends dtn.a<dts.a> {
      private final List<dts.b> a = Lists.newArrayList();

      protected dts.a a() {
         return this;
      }

      public dts.a a(dts.c $$0) {
         this.a.add($$0.a());
         return this;
      }

      @Override
      public dto b() {
         return new dts(this.g(), this.a);
      }
   }

   static class b {
      final String a;
      final bcy b;
      final bdb.a c;
      final dvs d;
      @Nullable
      final UUID e;
      final bbs[] f;

      b(String $$0, bcy $$1, bdb.a $$2, dvs $$3, bbs[] $$4, @Nullable UUID $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$5;
         this.f = $$4;
      }

      public JsonObject a(JsonSerializationContext $$0) {
         JsonObject $$1 = new JsonObject();
         $$1.addProperty("name", this.a);
         $$1.addProperty("attribute", hm.ak.b(this.b).toString());
         $$1.addProperty("operation", a(this.c));
         $$1.add("amount", $$0.serialize(this.d));
         if (this.e != null) {
            $$1.addProperty("id", this.e.toString());
         }

         if (this.f.length == 1) {
            $$1.addProperty("slot", this.f[0].d());
         } else {
            JsonArray $$2 = new JsonArray();

            for(bbs $$3 : this.f) {
               $$2.add(new JsonPrimitive($$3.d()));
            }

            $$1.add("slot", $$2);
         }

         return $$1;
      }

      public static dts.b a(JsonObject $$0, JsonDeserializationContext $$1) {
         String $$2 = alz.h($$0, "name");
         abb $$3 = new abb(alz.h($$0, "attribute"));
         bcy $$4 = hm.ak.a($$3);
         if ($$4 == null) {
            throw new JsonSyntaxException("Unknown attribute: " + $$3);
         } else {
            bdb.a $$5 = a(alz.h($$0, "operation"));
            dvs $$6 = alz.a($$0, "amount", $$1, dvs.class);
            UUID $$7 = null;
            bbs[] $$8;
            if (alz.a($$0, "slot")) {
               $$8 = new bbs[]{bbs.a(alz.h($$0, "slot"))};
            } else {
               if (!alz.d($$0, "slot")) {
                  throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
               }

               JsonArray $$9 = alz.u($$0, "slot");
               $$8 = new bbs[$$9.size()];
               int $$11 = 0;

               for(JsonElement $$12 : $$9) {
                  $$8[$$11++] = bbs.a(alz.a($$12, "slot"));
               }

               if ($$8.length == 0) {
                  throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
               }
            }

            if ($$0.has("id")) {
               String $$14 = alz.h($$0, "id");

               try {
                  $$7 = UUID.fromString($$14);
               } catch (IllegalArgumentException var13) {
                  throw new JsonSyntaxException("Invalid attribute modifier id '" + $$14 + "' (must be UUID format, with dashes)");
               }
            }

            return new dts.b($$2, $$4, $$5, $$6, $$8, $$7);
         }
      }

      private static String a(bdb.a $$0) {
         switch($$0) {
            case a:
               return "addition";
            case b:
               return "multiply_base";
            case c:
               return "multiply_total";
            default:
               throw new IllegalArgumentException("Unknown operation " + $$0);
         }
      }

      private static bdb.a a(String $$0) {
         switch($$0) {
            case "addition":
               return bdb.a.a;
            case "multiply_base":
               return bdb.a.b;
            case "multiply_total":
               return bdb.a.c;
            default:
               throw new JsonSyntaxException("Unknown attribute modifier operation " + $$0);
         }
      }
   }

   public static class c {
      private final String a;
      private final bcy b;
      private final bdb.a c;
      private final dvs d;
      @Nullable
      private UUID e;
      private final Set<bbs> f = EnumSet.noneOf(bbs.class);

      public c(String $$0, bcy $$1, bdb.a $$2, dvs $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public dts.c a(bbs $$0) {
         this.f.add($$0);
         return this;
      }

      public dts.c a(UUID $$0) {
         this.e = $$0;
         return this;
      }

      public dts.b a() {
         return new dts.b(this.a, this.b, this.c, this.d, (bbs[])this.f.toArray(new bbs[0]), this.e);
      }
   }

   public static class d extends dtn.c<dts> {
      public void a(JsonObject $$0, dts $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         JsonArray $$3 = new JsonArray();

         for(dts.b $$4 : $$1.a) {
            $$3.add($$4.a($$2));
         }

         $$0.add("modifiers", $$3);
      }

      public dts a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         JsonArray $$3 = alz.u($$0, "modifiers");
         List<dts.b> $$4 = Lists.newArrayListWithExpectedSize($$3.size());

         for(JsonElement $$5 : $$3) {
            $$4.add(dts.b.a(alz.m($$5, "modifier"), $$1));
         }

         if ($$4.isEmpty()) {
            throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
         } else {
            return new dts($$2, $$4);
         }
      }
   }
}
