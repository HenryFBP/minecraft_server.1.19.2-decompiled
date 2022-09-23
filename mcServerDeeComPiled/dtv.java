import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class dtv extends dtn {
   final abb a;
   final long b;
   final ctk<?> c;

   dtv(dux[] $$0, abb $$1, long $$2, ctk<?> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   public dtp a() {
      return dtq.r;
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.b()) {
         return $$0;
      } else {
         pj $$2 = byx.a($$0);
         if ($$2 == null) {
            $$2 = new pj();
         }

         $$2.a("LootTable", this.a.toString());
         if (this.b != 0L) {
            $$2.a("LootTableSeed", this.b);
         }

         byx.a($$0, this.c, $$2);
         return $$0;
      }
   }

   @Override
   public void a(dsl $$0) {
      if ($$0.a(this.a)) {
         $$0.a("Table " + this.a + " is recursively called");
      } else {
         super.a($$0);
         dsg $$1 = $$0.c(this.a);
         if ($$1 == null) {
            $$0.a("Unknown loot table called " + this.a);
         } else {
            $$1.a($$0.a("->{" + this.a + "}", this.a));
         }

      }
   }

   public static dtn.a<?> a(ctk<?> $$0, abb $$1) {
      return a($$2 -> new dtv($$2, $$1, 0L, $$0));
   }

   public static dtn.a<?> a(ctk<?> $$0, abb $$1, long $$2) {
      return a($$3 -> new dtv($$3, $$1, $$2, $$0));
   }

   public static class a extends dtn.c<dtv> {
      public void a(JsonObject $$0, dtv $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.a.toString());
         $$0.addProperty("type", hm.ab.b($$1.c).toString());
         if ($$1.b != 0L) {
            $$0.addProperty("seed", $$1.b);
         }

      }

      public dtv a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         abb $$3 = new abb(alz.h($$0, "name"));
         long $$4 = alz.a($$0, "seed", 0L);
         abb $$5 = new abb(alz.h($$0, "type"));
         ctk<?> $$6 = (ctk)hm.ab.b($$5).orElseThrow(() -> new JsonSyntaxException("Unknown block entity type id '" + $$5 + "'"));
         return new dtv($$2, $$3, $$4, $$6);
      }
   }
}
