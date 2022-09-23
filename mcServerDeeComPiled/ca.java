import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ca {
   public static final ca a = new ca();
   @Nullable
   private final akz<cat> b;
   @Nullable
   private final Set<cat> c;
   private final cj.d d;
   private final cj.d e;
   private final bj[] f;
   private final bj[] g;
   @Nullable
   private final ccs h;
   private final cl i;

   public ca() {
      this.b = null;
      this.c = null;
      this.h = null;
      this.d = cj.d.e;
      this.e = cj.d.e;
      this.f = bj.b;
      this.g = bj.b;
      this.i = cl.a;
   }

   public ca(@Nullable akz<cat> $$0, @Nullable Set<cat> $$1, cj.d $$2, cj.d $$3, bj[] $$4, bj[] $$5, @Nullable ccs $$6, cl $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public boolean a(cax $$0) {
      if (this == a) {
         return true;
      } else if (this.b != null && !$$0.a(this.b)) {
         return false;
      } else if (this.c != null && !this.c.contains($$0.c())) {
         return false;
      } else if (!this.d.d($$0.K())) {
         return false;
      } else if (!this.e.c() && !$$0.h()) {
         return false;
      } else if (!this.e.d($$0.k() - $$0.j())) {
         return false;
      } else if (!this.i.a($$0)) {
         return false;
      } else {
         if (this.f.length > 0) {
            Map<cer, Integer> $$1 = cet.a($$0.w());

            for(bj $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (this.g.length > 0) {
            Map<cer, Integer> $$3 = cet.a(bzy.d($$0));

            for(bj $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         ccs $$5 = ccu.d($$0);
         return this.h == null || this.h == $$5;
      }
   }

   public static ca a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "item");
         cj.d $$2 = cj.d.a($$1.get("count"));
         cj.d $$3 = cj.d.a($$1.get("durability"));
         if ($$1.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            cl $$4 = cl.a($$1.get("nbt"));
            Set<cat> $$5 = null;
            JsonArray $$6 = alz.a($$1, "items", null);
            if ($$6 != null) {
               Builder<cat> $$7 = ImmutableSet.builder();

               for(JsonElement $$8 : $$6) {
                  abb $$9 = new abb(alz.a($$8, "item"));
                  $$7.add((cat)hm.Y.b($$9).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + $$9 + "'")));
               }

               $$5 = $$7.build();
            }

            akz<cat> $$10 = null;
            if ($$1.has("tag")) {
               abb $$11 = new abb(alz.h($$1, "tag"));
               $$10 = akz.a(hm.k, $$11);
            }

            ccs $$12 = null;
            if ($$1.has("potion")) {
               abb $$13 = new abb(alz.h($$1, "potion"));
               $$12 = (ccs)hm.Z.b($$13).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$13 + "'"));
            }

            bj[] $$14 = bj.b($$1.get("enchantments"));
            bj[] $$15 = bj.b($$1.get("stored_enchantments"));
            return new ca($$10, $$5, $$2, $$3, $$14, $$15, $$12, $$4);
         }
      } else {
         return a;
      }
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            JsonArray $$1 = new JsonArray();

            for(cat $$2 : this.c) {
               $$1.add(hm.Y.b($$2).toString());
            }

            $$0.add("items", $$1);
         }

         if (this.b != null) {
            $$0.addProperty("tag", this.b.b().toString());
         }

         $$0.add("count", this.d.d());
         $$0.add("durability", this.e.d());
         $$0.add("nbt", this.i.a());
         if (this.f.length > 0) {
            JsonArray $$3 = new JsonArray();

            for(bj $$4 : this.f) {
               $$3.add($$4.a());
            }

            $$0.add("enchantments", $$3);
         }

         if (this.g.length > 0) {
            JsonArray $$5 = new JsonArray();

            for(bj $$6 : this.g) {
               $$5.add($$6.a());
            }

            $$0.add("stored_enchantments", $$5);
         }

         if (this.h != null) {
            $$0.addProperty("potion", hm.Z.b(this.h).toString());
         }

         return $$0;
      }
   }

   public static ca[] b(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonArray $$1 = alz.n($$0, "items");
         ca[] $$2 = new ca[$$1.size()];

         for(int $$3 = 0; $$3 < $$2.length; ++$$3) {
            $$2[$$3] = a($$1.get($$3));
         }

         return $$2;
      } else {
         return new ca[0];
      }
   }

   public static class a {
      private final List<bj> a = Lists.newArrayList();
      private final List<bj> b = Lists.newArrayList();
      @Nullable
      private Set<cat> c;
      @Nullable
      private akz<cat> d;
      private cj.d e;
      private cj.d f;
      @Nullable
      private ccs g;
      private cl h;

      private a() {
         this.e = cj.d.e;
         this.f = cj.d.e;
         this.h = cl.a;
      }

      public static ca.a a() {
         return new ca.a();
      }

      public ca.a a(cgw... $$0) {
         this.c = (Set)Stream.of($$0).map(cgw::l).collect(ImmutableSet.toImmutableSet());
         return this;
      }

      public ca.a a(akz<cat> $$0) {
         this.d = $$0;
         return this;
      }

      public ca.a a(cj.d $$0) {
         this.e = $$0;
         return this;
      }

      public ca.a b(cj.d $$0) {
         this.f = $$0;
         return this;
      }

      public ca.a a(ccs $$0) {
         this.g = $$0;
         return this;
      }

      public ca.a a(pj $$0) {
         this.h = new cl($$0);
         return this;
      }

      public ca.a a(bj $$0) {
         this.a.add($$0);
         return this;
      }

      public ca.a b(bj $$0) {
         this.b.add($$0);
         return this;
      }

      public ca b() {
         return new ca(this.d, this.c, this.e, this.f, (bj[])this.a.toArray(bj.b), (bj[])this.b.toArray(bj.b), this.g, this.h);
      }
   }
}
