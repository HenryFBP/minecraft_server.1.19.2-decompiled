import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.bridge.game.PackType;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;
import org.slf4j.Logger;

public class v implements ae {
   private static final Logger b = LogUtils.getLogger();
   public static final ae a = new v();
   private final String c;
   private final String d;
   private final boolean e;
   private final drk f;
   private final int g;
   private final int h;
   private final int i;
   private final Date j;
   private final String k;

   private v() {
      this.c = UUID.randomUUID().toString().replaceAll("-", "");
      this.d = "1.19.2";
      this.e = true;
      this.f = new drk(3120, "main");
      this.g = ab.c();
      this.h = 9;
      this.i = 10;
      this.j = new Date();
      this.k = "1.19.2";
   }

   private v(JsonObject $$0) {
      this.c = alz.h($$0, "id");
      this.d = alz.h($$0, "name");
      this.k = alz.h($$0, "release_target");
      this.e = alz.j($$0, "stable");
      this.f = new drk(alz.n($$0, "world_version"), alz.a($$0, "series_id", drk.a));
      this.g = alz.n($$0, "protocol_version");
      JsonObject $$1 = alz.t($$0, "pack_version");
      this.h = alz.n($$1, "resource");
      this.i = alz.n($$1, "data");
      this.j = Date.from(ZonedDateTime.parse(alz.h($$0, "build_time")).toInstant());
   }

   public static ae a() {
      try {
         InputStream $$0 = v.class.getResourceAsStream("/version.json");

         ae var9;
         label63: {
            v var2;
            try {
               if ($$0 == null) {
                  b.warn("Missing version information!");
                  var9 = a;
                  break label63;
               }

               InputStreamReader $$1 = new InputStreamReader($$0);

               try {
                  var2 = new v(alz.a($$1));
               } catch (Throwable var6) {
                  try {
                     $$1.close();
                  } catch (Throwable var5) {
                     var6.addSuppressed(var5);
                  }

                  throw var6;
               }

               $$1.close();
            } catch (Throwable var7) {
               if ($$0 != null) {
                  try {
                     $$0.close();
                  } catch (Throwable var4) {
                     var7.addSuppressed(var4);
                  }
               }

               throw var7;
            }

            if ($$0 != null) {
               $$0.close();
            }

            return var2;
         }

         if ($$0 != null) {
            $$0.close();
         }

         return var9;
      } catch (JsonParseException | IOException var8) {
         throw new IllegalStateException("Game version information is corrupt", var8);
      }
   }

   public String getId() {
      return this.c;
   }

   public String getName() {
      return this.d;
   }

   public String getReleaseTarget() {
      return this.k;
   }

   @Override
   public drk b() {
      return this.f;
   }

   public int getProtocolVersion() {
      return this.g;
   }

   public int getPackVersion(PackType $$0) {
      return $$0 == PackType.DATA ? this.i : this.h;
   }

   public Date getBuildTime() {
      return this.j;
   }

   public boolean isStable() {
      return this.e;
   }
}
