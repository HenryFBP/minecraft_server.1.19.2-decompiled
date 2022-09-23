import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import java.util.Map.Entry;
import org.slf4j.Logger;

public abstract class aiq extends air<Map<abb, JsonElement>> {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".json";
   private static final int c = ".json".length();
   private final Gson d;
   private final String e;

   public aiq(Gson $$0, String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   protected Map<abb, JsonElement> a(aim $$0, awz $$1) {
      Map<abb, JsonElement> $$2 = Maps.newHashMap();
      int $$3 = this.e.length() + 1;

      for(Entry<abb, aik> $$4 : $$0.b(this.e, $$0x -> $$0x.a().endsWith(".json")).entrySet()) {
         abb $$5 = (abb)$$4.getKey();
         String $$6 = $$5.a();
         abb $$7 = new abb($$5.b(), $$6.substring($$3, $$6.length() - c));

         try {
            Reader $$8 = ((aik)$$4.getValue()).c();

            try {
               JsonElement $$9 = alz.a(this.d, $$8, JsonElement.class);
               if ($$9 != null) {
                  JsonElement $$10 = (JsonElement)$$2.put($$7, $$9);
                  if ($$10 != null) {
                     throw new IllegalStateException("Duplicate data file ignored with ID " + $$7);
                  }
               } else {
                  a.error("Couldn't load data file {} from {} as it's null or empty", $$7, $$5);
               }
            } catch (Throwable var14) {
               if ($$8 != null) {
                  try {
                     $$8.close();
                  } catch (Throwable var13) {
                     var14.addSuppressed(var13);
                  }
               }

               throw var14;
            }

            if ($$8 != null) {
               $$8.close();
            }
         } catch (IllegalArgumentException | IOException | JsonParseException var15) {
            a.error("Couldn't parse data file {} from {}", new Object[]{$$7, $$5, var15});
         }
      }

      return $$2;
   }
}
