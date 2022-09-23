import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class dtk extends dtn {
   final dsd.c a;

   public dtk(dux[] $$0, dsd.c $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dtp a() {
      return dtq.u;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(this.a.a());
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.a(caz.sk)) {
         bbn $$2 = $$1.c(this.a.a());
         if ($$2 instanceof buc) {
            GameProfile $$3 = ((buc)$$2).fy();
            $$0.v().a("SkullOwner", (qc)pv.a(new pj(), $$3));
         }
      }

      return $$0;
   }

   public static dtn.a<?> a(dsd.c $$0) {
      return a($$1 -> new dtk($$1, $$0));
   }

   public static class a extends dtn.c<dtk> {
      public void a(JsonObject $$0, dtk $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("entity", $$2.serialize($$1.a));
      }

      public dtk a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dsd.c $$3 = alz.a($$0, "entity", $$1, dsd.c.class);
         return new dtk($$2, $$3);
      }
   }
}
