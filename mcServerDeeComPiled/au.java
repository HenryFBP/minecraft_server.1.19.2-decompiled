import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Set;
import javax.annotation.Nullable;

public class au {
   public static final au a = new au(null, null, cz.a, cl.a);
   @Nullable
   private final akz<cjt> b;
   @Nullable
   private final Set<cjt> c;
   private final cz d;
   private final cl e;

   public au(@Nullable akz<cjt> $$0, @Nullable Set<cjt> $$1, cz $$2, cl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public boolean a(agg $$0, gt $$1) {
      if (this == a) {
         return true;
      } else if (!$$0.o($$1)) {
         return false;
      } else {
         cvo $$2 = $$0.a_($$1);
         if (this.b != null && !$$2.a(this.b)) {
            return false;
         } else if (this.c != null && !this.c.contains($$2.b())) {
            return false;
         } else if (!this.d.a($$2)) {
            return false;
         } else {
            if (this.e != cl.a) {
               cti $$3 = $$0.c_($$1);
               if ($$3 == null || !this.e.a($$3.m())) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public static au a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = alz.m($$0, "block");
         cl $$2 = cl.a($$1.get("nbt"));
         Set<cjt> $$3 = null;
         JsonArray $$4 = alz.a($$1, "blocks", null);
         if ($$4 != null) {
            Builder<cjt> $$5 = ImmutableSet.builder();

            for(JsonElement $$6 : $$4) {
               abb $$7 = new abb(alz.a($$6, "block"));
               $$5.add((cjt)hm.V.b($$7).orElseThrow(() -> new JsonSyntaxException("Unknown block id '" + $$7 + "'")));
            }

            $$3 = $$5.build();
         }

         akz<cjt> $$8 = null;
         if ($$1.has("tag")) {
            abb $$9 = new abb(alz.h($$1, "tag"));
            $$8 = akz.a(hm.h, $$9);
         }

         cz $$10 = cz.a($$1.get("state"));
         return new au($$8, $$3, $$10, $$2);
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

            for(cjt $$2 : this.c) {
               $$1.add(hm.V.b($$2).toString());
            }

            $$0.add("blocks", $$1);
         }

         if (this.b != null) {
            $$0.addProperty("tag", this.b.b().toString());
         }

         $$0.add("nbt", this.e.a());
         $$0.add("state", this.d.a());
         return $$0;
      }
   }

   public static class a {
      @Nullable
      private Set<cjt> a;
      @Nullable
      private akz<cjt> b;
      private cz c = cz.a;
      private cl d = cl.a;

      private a() {
      }

      public static au.a a() {
         return new au.a();
      }

      public au.a a(cjt... $$0) {
         this.a = ImmutableSet.copyOf($$0);
         return this;
      }

      public au.a a(Iterable<cjt> $$0) {
         this.a = ImmutableSet.copyOf($$0);
         return this;
      }

      public au.a a(akz<cjt> $$0) {
         this.b = $$0;
         return this;
      }

      public au.a a(pj $$0) {
         this.d = new cl($$0);
         return this;
      }

      public au.a a(cz $$0) {
         this.c = $$0;
         return this;
      }

      public au b() {
         return new au(this.b, this.a, this.c, this.d);
      }
   }
}
