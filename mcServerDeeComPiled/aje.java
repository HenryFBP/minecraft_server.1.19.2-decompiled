import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class aje<K, V extends ajd<K>> {
   private static final Logger a = LogUtils.getLogger();
   private static final Gson b = new GsonBuilder().setPrettyPrinting().create();
   private final File c;
   private final Map<String, V> d = Maps.newHashMap();

   public aje(File $$0) {
      this.c = $$0;
   }

   public File b() {
      return this.c;
   }

   public void a(V $$0) {
      this.d.put(this.a($$0.g()), $$0);

      try {
         this.e();
      } catch (IOException var3) {
         a.warn("Could not save the list after adding a user.", var3);
      }

   }

   @Nullable
   public V b(K $$0) {
      this.g();
      return (V)this.d.get(this.a($$0));
   }

   public void c(K $$0) {
      this.d.remove(this.a($$0));

      try {
         this.e();
      } catch (IOException var3) {
         a.warn("Could not save the list after removing a user.", var3);
      }

   }

   public void b(ajd<K> $$0) {
      this.c($$0.g());
   }

   public String[] a() {
      return (String[])this.d.keySet().toArray(new String[0]);
   }

   public boolean c() {
      return this.d.size() < 1;
   }

   protected String a(K $$0) {
      return $$0.toString();
   }

   protected boolean d(K $$0) {
      return this.d.containsKey(this.a($$0));
   }

   private void g() {
      List<K> $$0 = Lists.newArrayList();

      for(V $$1 : this.d.values()) {
         if ($$1.f()) {
            $$0.add($$1.g());
         }
      }

      for(K $$2 : $$0) {
         this.d.remove(this.a($$2));
      }

   }

   protected abstract ajd<K> a(JsonObject var1);

   public Collection<V> d() {
      return this.d.values();
   }

   public void e() throws IOException {
      JsonArray $$0 = new JsonArray();
      this.d.values().stream().map($$0x -> ad.a(new JsonObject(), $$0x::a)).forEach($$0::add);
      BufferedWriter $$1 = Files.newWriter(this.c, StandardCharsets.UTF_8);

      try {
         b.toJson($$0, $$1);
      } catch (Throwable var6) {
         if ($$1 != null) {
            try {
               $$1.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if ($$1 != null) {
         $$1.close();
      }

   }

   public void f() throws IOException {
      if (this.c.exists()) {
         BufferedReader $$0 = Files.newReader(this.c, StandardCharsets.UTF_8);

         try {
            JsonArray $$1 = (JsonArray)b.fromJson($$0, JsonArray.class);
            this.d.clear();

            for(JsonElement $$2 : $$1) {
               JsonObject $$3 = alz.m($$2, "entry");
               ajd<K> $$4 = this.a($$3);
               if ($$4.g() != null) {
                  this.d.put(this.a($$4.g()), $$4);
               }
            }
         } catch (Throwable var8) {
            if ($$0 != null) {
               try {
                  $$0.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if ($$0 != null) {
            $$0.close();
         }

      }
   }
}
