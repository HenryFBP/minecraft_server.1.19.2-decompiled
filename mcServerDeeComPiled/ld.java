import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ld implements iz {
   private static final Logger c = LogUtils.getLogger();
   private final iy d;

   public ld(iy $$0) {
      this.d = $$0;
   }

   @Override
   public void a(ix $$0) throws IOException {
      Path $$1 = this.d.b();

      for(Path $$2 : this.d.a()) {
         Files.walk($$2).filter($$0x -> $$0x.toString().endsWith(".nbt")).forEach($$3 -> a($$0, $$3, this.a($$2, $$3), $$1));
      }

   }

   @Override
   public String a() {
      return "NBT to SNBT";
   }

   private String a(Path $$0, Path $$1) {
      String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
      return $$2.substring(0, $$2.length() - ".nbt".length());
   }

   @Nullable
   public static Path a(ix $$0, Path $$1, String $$2, Path $$3) {
      try {
         InputStream $$4 = Files.newInputStream($$1);

         Path var6;
         try {
            Path $$5 = $$3.resolve($$2 + ".snbt");
            a($$0, $$5, pv.d(pt.a($$4)));
            c.info("Converted {} from NBT to SNBT", $$2);
            var6 = $$5;
         } catch (Throwable var8) {
            if ($$4 != null) {
               try {
                  $$4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if ($$4 != null) {
            $$4.close();
         }

         return var6;
      } catch (IOException var9) {
         c.error("Couldn't convert {} from NBT to SNBT at {}", new Object[]{$$2, $$1, var9});
         return null;
      }
   }

   public static void a(ix $$0, Path $$1, String $$2) throws IOException {
      ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
      HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
      $$4.write($$2.getBytes(StandardCharsets.UTF_8));
      $$4.write(10);
      $$0.writeIfNeeded($$1, $$3.toByteArray(), $$4.hash());
   }
}
