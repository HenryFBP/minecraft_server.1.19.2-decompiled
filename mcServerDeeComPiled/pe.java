import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public abstract class pe {
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new Gson();
   private static final Pattern d = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   public static final String a = "en_us";
   private static volatile pe e = c();

   private static pe c() {
      Builder<String, String> $$0 = ImmutableMap.builder();
      BiConsumer<String, String> $$1 = $$0::put;
      String $$2 = "/assets/minecraft/lang/en_us.json";

      try {
         InputStream $$3 = pe.class.getResourceAsStream("/assets/minecraft/lang/en_us.json");

         try {
            a($$3, $$1);
         } catch (Throwable var7) {
            if ($$3 != null) {
               try {
                  $$3.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if ($$3 != null) {
            $$3.close();
         }
      } catch (JsonParseException | IOException var8) {
         b.error("Couldn't read strings from {}", "/assets/minecraft/lang/en_us.json", var8);
      }

      final Map<String, String> $$5 = $$0.build();
      return new pe() {
         @Override
         public String a(String $$0) {
            return (String)$$5.getOrDefault($$0, $$0);
         }

         @Override
         public boolean b(String $$0) {
            return $$5.containsKey($$0);
         }

         @Override
         public boolean b() {
            return false;
         }

         @Override
         public alu a(ru $$0) {
            return $$1 -> $$0.a((ru.b)(($$1x, $$2) -> amv.c($$2, $$1x, $$1) ? Optional.empty() : ru.a), sj.a).isPresent();
         }
      };
   }

   public static void a(InputStream $$0, BiConsumer<String, String> $$1) {
      JsonObject $$2 = (JsonObject)c.fromJson(new InputStreamReader($$0, StandardCharsets.UTF_8), JsonObject.class);

      for(Entry<String, JsonElement> $$3 : $$2.entrySet()) {
         String $$4 = d.matcher(alz.a((JsonElement)$$3.getValue(), (String)$$3.getKey())).replaceAll("%$1s");
         $$1.accept((String)$$3.getKey(), $$4);
      }

   }

   public static pe a() {
      return e;
   }

   public static void a(pe $$0) {
      e = $$0;
   }

   public abstract String a(String var1);

   public abstract boolean b(String var1);

   public abstract boolean b();

   public abstract alu a(ru var1);

   public List<alu> a(List<ru> $$0) {
      return (List<alu>)$$0.stream().map(this::a).collect(ImmutableList.toImmutableList());
   }
}
