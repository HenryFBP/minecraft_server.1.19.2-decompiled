import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class akc extends akh {
   private static final Logger b = LogUtils.getLogger();
   private final MinecraftServer c;
   private final File d;
   private final Set<akd<?>> e = Sets.newHashSet();

   public akc(MinecraftServer $$0, File $$1) {
      this.c = $$0;
      this.d = $$1;
      if ($$1.isFile()) {
         try {
            this.a($$0.ay(), FileUtils.readFileToString($$1));
         } catch (IOException var4) {
            b.error("Couldn't read statistics file {}", $$1, var4);
         } catch (JsonParseException var5) {
            b.error("Couldn't parse statistics file {}", $$1, var5);
         }
      }

   }

   public void a() {
      try {
         FileUtils.writeStringToFile(this.d, this.b());
      } catch (IOException var2) {
         b.error("Couldn't save stats", var2);
      }

   }

   @Override
   public void a(buc $$0, akd<?> $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.e.add($$1);
   }

   private Set<akd<?>> d() {
      Set<akd<?>> $$0 = Sets.newHashSet(this.e);
      this.e.clear();
      return $$0;
   }

   public void a(DataFixer $$0, String $$1) {
      try {
         JsonReader $$2 = new JsonReader(new StringReader($$1));

         label51: {
            try {
               $$2.setLenient(false);
               JsonElement $$3 = Streams.parse($$2);
               if (!$$3.isJsonNull()) {
                  pj $$4 = a($$3.getAsJsonObject());
                  if (!$$4.b("DataVersion", 99)) {
                     $$4.a("DataVersion", 1343);
                  }

                  $$4 = pv.a($$0, ani.g, $$4, $$4.h("DataVersion"));
                  if (!$$4.b("stats", 10)) {
                     break label51;
                  }

                  pj $$5 = $$4.p("stats");
                  Iterator var7 = $$5.d().iterator();

                  while(true) {
                     if (!var7.hasNext()) {
                        break label51;
                     }

                     String $$6 = (String)var7.next();
                     if ($$5.b($$6, 10)) {
                        ad.a(
                           hm.an.b(new abb($$6)),
                           $$2 -> {
                              pj $$3x = $$5.p($$6);
   
                              for(String $$4x : $$3x.d()) {
                                 if ($$3x.b($$4x, 99)) {
                                    ad.a(
                                       this.a($$2, $$4x),
                                       $$2x -> this.a.put($$2x, $$3x.h($$4x)),
                                       () -> b.warn("Invalid statistic in {}: Don't know what {} is", this.d, $$4x)
                                    );
                                 } else {
                                    b.warn("Invalid statistic value in {}: Don't know what {} is for key {}", new Object[]{this.d, $$3x.c($$4x), $$4x});
                                 }
                              }
   
                           },
                           () -> b.warn("Invalid statistic type in {}: Don't know what {} is", this.d, $$6)
                        );
                     }
                  }
               }

               b.error("Unable to parse Stat data from {}", this.d);
            } catch (Throwable var10) {
               try {
                  $$2.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            $$2.close();
            return;
         }

         $$2.close();
      } catch (IOException | JsonParseException var11) {
         b.error("Unable to parse Stat data from {}", this.d, var11);
      }

   }

   private <T> Optional<akd<T>> a(akf<T> $$0, String $$1) {
      return Optional.ofNullable(abb.a($$1)).flatMap($$0.a()::b).map($$0::b);
   }

   private static pj a(JsonObject $$0) {
      pj $$1 = new pj();

      for(Entry<String, JsonElement> $$2 : $$0.entrySet()) {
         JsonElement $$3 = (JsonElement)$$2.getValue();
         if ($$3.isJsonObject()) {
            $$1.a((String)$$2.getKey(), (qc)a($$3.getAsJsonObject()));
         } else if ($$3.isJsonPrimitive()) {
            JsonPrimitive $$4 = $$3.getAsJsonPrimitive();
            if ($$4.isNumber()) {
               $$1.a((String)$$2.getKey(), $$4.getAsInt());
            }
         }
      }

      return $$1;
   }

   protected String b() {
      Map<akf<?>, JsonObject> $$0 = Maps.newHashMap();
      ObjectIterator $$3 = this.a.object2IntEntrySet().iterator();

      while($$3.hasNext()) {
         it.unimi.dsi.fastutil.objects.Object2IntMap.Entry<akd<?>> $$1 = (it.unimi.dsi.fastutil.objects.Object2IntMap.Entry)$$3.next();
         akd<?> $$2 = (akd)$$1.getKey();
         ((JsonObject)$$0.computeIfAbsent($$2.a(), $$0x -> new JsonObject())).addProperty(b($$2).toString(), $$1.getIntValue());
      }

      JsonObject $$3 = new JsonObject();

      for(Entry<akf<?>, JsonObject> $$4 : $$0.entrySet()) {
         $$3.add(hm.an.b((akf<?>)$$4.getKey()).toString(), (JsonElement)$$4.getValue());
      }

      JsonObject $$5 = new JsonObject();
      $$5.add("stats", $$3);
      $$5.addProperty("DataVersion", ab.b().getWorldVersion());
      return $$5.toString();
   }

   private static <T> abb b(akd<T> $$0) {
      return $$0.a().a().b($$0.b());
   }

   public void c() {
      this.e.addAll(this.a.keySet());
   }

   public void a(agh $$0) {
      Object2IntMap<akd<?>> $$1 = new Object2IntOpenHashMap();

      for(akd<?> $$2 : this.d()) {
         $$1.put($$2, this.a($$2));
      }

      $$0.b.a(new tk($$1));
   }
}
