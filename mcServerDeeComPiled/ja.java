import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class ja {
   static final Logger a = LogUtils.getLogger();
   private static final String b = "// ";
   private final Path c;
   private final Path d;
   private final String e;
   private final Map<iz, ja.b> f;
   private final Map<iz, ja.a> g = new HashMap();
   private final Set<Path> h = new HashSet();
   private final int i;

   private Path c(iz $$0) {
      return this.d.resolve(Hashing.sha1().hashString($$0.a(), StandardCharsets.UTF_8).toString());
   }

   public ja(Path $$0, List<iz> $$1, ae $$2) throws IOException {
      this.e = $$2.getName();
      this.c = $$0;
      this.d = $$0.resolve(".cache");
      Files.createDirectories(this.d);
      Map<iz, ja.b> $$3 = new HashMap();
      int $$4 = 0;

      for(iz $$5 : $$1) {
         Path $$6 = this.c($$5);
         this.h.add($$6);
         ja.b $$7 = a($$0, $$6);
         $$3.put($$5, $$7);
         $$4 += $$7.a();
      }

      this.f = $$3;
      this.i = $$4;
   }

   private static ja.b a(Path $$0, Path $$1) {
      if (Files.isReadable($$1)) {
         try {
            return ja.b.a($$0, $$1);
         } catch (Exception var3) {
            a.warn("Failed to parse cache {}, discarding", $$1, var3);
         }
      }

      return new ja.b("unknown");
   }

   public boolean a(iz $$0) {
      ja.b $$1 = (ja.b)this.f.get($$0);
      return $$1 == null || !$$1.a.equals(this.e);
   }

   public ix b(iz $$0) {
      return (ix)this.g.computeIfAbsent($$0, $$0x -> {
         ja.b $$1 = (ja.b)this.f.get($$0x);
         if ($$1 == null) {
            throw new IllegalStateException("Provider not registered: " + $$0x.a());
         } else {
            ja.a $$2 = new ja.a(this.e, $$1);
            this.f.put($$0x, $$2.c);
            return $$2;
         }
      });
   }

   public void a() throws IOException {
      MutableInt $$0 = new MutableInt();
      this.g.forEach(($$1x, $$2x) -> {
         Path $$3x = this.c($$1x);
         $$2x.c.a(this.c, $$3x, DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()) + "\t" + $$1x.a());
         $$0.add($$2x.d);
      });
      Set<Path> $$1 = new HashSet();
      this.f.values().forEach($$1x -> $$1.addAll($$1x.c().keySet()));
      $$1.add(this.c.resolve("version.json"));
      MutableInt $$2 = new MutableInt();
      MutableInt $$3 = new MutableInt();
      Stream<Path> $$4 = Files.walk(this.c);

      try {
         $$4.forEach($$3x -> {
            if (!Files.isDirectory($$3x, new LinkOption[0])) {
               if (!this.h.contains($$3x)) {
                  $$2.increment();
                  if (!$$1.contains($$3x)) {
                     try {
                        Files.delete($$3x);
                     } catch (IOException var6) {
                        a.warn("Failed to delete file {}", $$3x, var6);
                     }

                     $$3.increment();
                  }
               }
            }
         });
      } catch (Throwable var9) {
         if ($$4 != null) {
            try {
               $$4.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if ($$4 != null) {
         $$4.close();
      }

      a.info("Caching: total files: {}, old count: {}, new count: {}, removed stale: {}, written: {}", new Object[]{$$2, this.i, $$1.size(), $$3, $$0});
   }

   static class a implements ix {
      private final ja.b b;
      final ja.b c;
      int d;

      a(String $$0, ja.b $$1) {
         this.b = $$1;
         this.c = new ja.b($$0);
      }

      private boolean a(Path $$0, HashCode $$1) {
         return !Objects.equals(this.b.a($$0), $$1) || !Files.exists($$0, new LinkOption[0]);
      }

      @Override
      public void writeIfNeeded(Path $$0, byte[] $$1, HashCode $$2) throws IOException {
         if (this.a($$0, $$2)) {
            ++this.d;
            Files.createDirectories($$0.getParent());
            Files.write($$0, $$1, new OpenOption[0]);
         }

         this.c.a($$0, $$2);
      }
   }

   static record b(String a, Map<Path, HashCode> b) {
      final String a;

      b(String $$0) {
         this($$0, new HashMap());
      }

      @Nullable
      public HashCode a(Path $$0) {
         return (HashCode)this.b.get($$0);
      }

      public void a(Path $$0, HashCode $$1) {
         this.b.put($$0, $$1);
      }

      public int a() {
         return this.b.size();
      }

      public static ja.b a(Path $$0, Path $$1) throws IOException {
         BufferedReader $$2 = Files.newBufferedReader($$1, StandardCharsets.UTF_8);

         ja.b var7;
         try {
            String $$3 = $$2.readLine();
            if (!$$3.startsWith("// ")) {
               throw new IllegalStateException("Missing cache file header");
            }

            String[] $$4 = $$3.substring("// ".length()).split("\t", 2);
            String $$5 = $$4[0];
            Map<Path, HashCode> $$6 = new HashMap();
            $$2.lines().forEach($$2x -> {
               int $$3x = $$2x.indexOf(32);
               $$6.put($$0.resolve($$2x.substring($$3x + 1)), HashCode.fromString($$2x.substring(0, $$3x)));
            });
            var7 = new ja.b($$5, Map.copyOf($$6));
         } catch (Throwable var9) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var8) {
                  var9.addSuppressed(var8);
               }
            }

            throw var9;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var7;
      }

      public void a(Path $$0, Path $$1, String $$2) {
         try {
            BufferedWriter $$3 = Files.newBufferedWriter($$1, StandardCharsets.UTF_8);

            try {
               $$3.write("// ");
               $$3.write(this.a);
               $$3.write(9);
               $$3.write($$2);
               $$3.newLine();

               for(Entry<Path, HashCode> $$4 : this.b.entrySet()) {
                  $$3.write(((HashCode)$$4.getValue()).toString());
                  $$3.write(32);
                  $$3.write($$0.relativize((Path)$$4.getKey()).toString());
                  $$3.newLine();
               }
            } catch (Throwable var8) {
               if ($$3 != null) {
                  try {
                     $$3.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }
               }

               throw var8;
            }

            if ($$3 != null) {
               $$3.close();
            }
         } catch (IOException var9) {
            ja.a.warn("Unable write cachefile {}: {}", $$1, var9);
         }

      }

      public String b() {
         return this.a;
      }

      public Map<Path, HashCode> c() {
         return this.b;
      }
   }
}
