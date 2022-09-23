import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class le implements iz {
   @Nullable
   private static final Path c = null;
   private static final Logger d = LogUtils.getLogger();
   private final iy e;
   private final List<le.a> f = Lists.newArrayList();

   public le(iy $$0) {
      this.e = $$0;
   }

   public le a(le.a $$0) {
      this.f.add($$0);
      return this;
   }

   private pj a(String $$0, pj $$1) {
      pj $$2 = $$1;

      for(le.a $$3 : this.f) {
         $$2 = $$3.apply($$0, $$2);
      }

      return $$2;
   }

   @Override
   public void a(ix $$0) throws IOException {
      Path $$1 = this.e.b();
      List<CompletableFuture<le.c>> $$2 = Lists.newArrayList();

      for(Path $$3 : this.e.a()) {
         Files.walk($$3)
            .filter($$0x -> $$0x.toString().endsWith(".snbt"))
            .forEach($$2x -> $$2.add(CompletableFuture.supplyAsync(() -> this.a($$2x, this.a($$3, $$2x)), ad.g())));
      }

      boolean $$4 = false;

      for(CompletableFuture<le.c> $$5 : $$2) {
         try {
            this.a($$0, (le.c)$$5.get(), $$1);
         } catch (Exception var8) {
            d.error("Failed to process structure", var8);
            $$4 = true;
         }
      }

      if ($$4) {
         throw new IllegalStateException("Failed to convert all structures, aborting");
      }
   }

   @Override
   public String a() {
      return "SNBT -> NBT";
   }

   private String a(Path $$0, Path $$1) {
      String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
      return $$2.substring(0, $$2.length() - ".snbt".length());
   }

   private le.c a(Path $$0, String $$1) {
      try {
         BufferedReader $$2 = Files.newBufferedReader($$0);

         le.c var11;
         try {
            String $$3 = IOUtils.toString($$2);
            pj $$4 = this.a($$1, pv.a($$3));
            ByteArrayOutputStream $$5 = new ByteArrayOutputStream();
            HashingOutputStream $$6 = new HashingOutputStream(Hashing.sha1(), $$5);
            pt.a($$4, $$6);
            byte[] $$7 = $$5.toByteArray();
            HashCode $$8 = $$6.hash();
            String $$9;
            if (c != null) {
               $$9 = pv.d($$4);
            } else {
               $$9 = null;
            }

            var11 = new le.c($$1, $$7, $$9, $$8);
         } catch (Throwable var13) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var11;
      } catch (Throwable var14) {
         throw new le.b($$0, var14);
      }
   }

   private void a(ix $$0, le.c $$1, Path $$2) {
      if ($$1.c != null) {
         Path $$3 = c.resolve($$1.a + ".snbt");

         try {
            ld.a(ix.a, $$3, $$1.c);
         } catch (IOException var7) {
            d.error("Couldn't write structure SNBT {} at {}", new Object[]{$$1.a, $$3, var7});
         }
      }

      Path $$5 = $$2.resolve($$1.a + ".nbt");

      try {
         $$0.writeIfNeeded($$5, $$1.b, $$1.d);
      } catch (IOException var6) {
         d.error("Couldn't write structure {} at {}", new Object[]{$$1.a, $$5, var6});
      }

   }

   @FunctionalInterface
   public interface a {
      pj apply(String var1, pj var2);
   }

   static class b extends RuntimeException {
      public b(Path $$0, Throwable $$1) {
         super($$0.toAbsolutePath().toString(), $$1);
      }
   }

   static record c(String a, byte[] b, @Nullable String c, HashCode d) {
      final String a;
      final byte[] b;
      @Nullable
      final String c;
      final HashCode d;
   }
}
