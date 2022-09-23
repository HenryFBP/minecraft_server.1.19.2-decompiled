import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.mojang.logging.LogUtils;
import java.util.Set;
import org.slf4j.Logger;

public class dtz extends dtn {
   private static final Logger a = LogUtils.getLogger();
   final dvs b;
   final boolean c;

   dtz(dux[] $$0, dvs $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public dtp a() {
      return dtq.i;
   }

   @Override
   public Set<dui<?>> b() {
      return this.b.b();
   }

   @Override
   public cax a(cax $$0, dsd $$1) {
      if ($$0.h()) {
         int $$2 = $$0.k();
         float $$3 = this.c ? 1.0F - (float)$$0.j() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ami.a(this.b.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ami.d($$4 * (float)$$2));
      } else {
         a.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static dtn.a<?> a(dvs $$0) {
      return a($$1 -> new dtz($$1, $$0, false));
   }

   public static dtn.a<?> a(dvs $$0, boolean $$1) {
      return a($$2 -> new dtz($$2, $$0, $$1));
   }

   public static class a extends dtn.c<dtz> {
      public void a(JsonObject $$0, dtz $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.add("damage", $$2.serialize($$1.b));
         $$0.addProperty("add", $$1.c);
      }

      public dtz a(JsonObject $$0, JsonDeserializationContext $$1, dux[] $$2) {
         dvs $$3 = alz.a($$0, "damage", $$1, dvs.class);
         boolean $$4 = alz.a($$0, "add", false);
         return new dtz($$2, $$3, $$4);
      }
   }
}
