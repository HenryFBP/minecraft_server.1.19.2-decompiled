import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.lang.reflect.Type;
import org.apache.commons.lang3.StringUtils;

public class aog extends arx {
   public static final Gson a = new GsonBuilder().registerTypeAdapter(rq.class, new JsonDeserializer<rq>() {
      public sb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonPrimitive()) {
            return rq.b($$0.getAsString());
         } else if ($$0.isJsonArray()) {
            JsonArray $$3 = $$0.getAsJsonArray();
            sb $$4 = null;

            for(JsonElement $$5 : $$3) {
               sb $$6 = this.a($$5, $$5.getClass(), $$2);
               if ($$4 == null) {
                  $$4 = $$6;
               } else {
                  $$4.b($$6);
               }
            }

            return $$4;
         } else {
            throw new JsonParseException("Don't know how to turn " + $$0 + " into a Component");
         }
      }
   }).create();

   public aog(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntitySignTextStrictJsonFix", asr.l, "Sign");
   }

   private Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      String $$2 = $$0.get($$1).asString("");
      rq $$3 = null;
      if (!"null".equals($$2) && !StringUtils.isEmpty($$2)) {
         if ($$2.charAt(0) == '"' && $$2.charAt($$2.length() - 1) == '"' || $$2.charAt(0) == '{' && $$2.charAt($$2.length() - 1) == '}') {
            try {
               $$3 = alz.a(a, $$2, rq.class, true);
               if ($$3 == null) {
                  $$3 = rp.a;
               }
            } catch (Exception var8) {
            }

            if ($$3 == null) {
               try {
                  $$3 = rq.a.a($$2);
               } catch (Exception var7) {
               }
            }

            if ($$3 == null) {
               try {
                  $$3 = rq.a.b($$2);
               } catch (Exception var6) {
               }
            }

            if ($$3 == null) {
               $$3 = rq.b($$2);
            }
         } else {
            $$3 = rq.b($$2);
         }
      } else {
         $$3 = rp.a;
      }

      return $$0.set($$1, $$0.createString(rq.a.a($$3)));
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         $$0x = this.a($$0x, "Text1");
         $$0x = this.a($$0x, "Text2");
         $$0x = this.a($$0x, "Text3");
         return this.a($$0x, "Text4");
      });
   }
}
