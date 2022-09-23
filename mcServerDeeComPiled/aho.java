import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aho implements ahl {
   @Nullable
   public static Path a;
   private static final Logger g = LogUtils.getLogger();
   public static Class<?> b;
   private static final Map<ahm, Path> h = ad.a((Supplier<Map<ahm, Path>>)(() -> {
      synchronized(aho.class) {
         Builder<ahm, Path> $$0 = ImmutableMap.builder();

         for(ahm $$1 : ahm.values()) {
            String $$2 = "/" + $$1.a() + "/.mcassetsroot";
            URL $$3 = aho.class.getResource($$2);
            if ($$3 == null) {
               g.error("File {} does not exist in classpath", $$2);
            } else {
               try {
                  URI $$4 = $$3.toURI();
                  String $$5 = $$4.getScheme();
                  if (!"jar".equals($$5) && !"file".equals($$5)) {
                     g.warn("Assets URL '{}' uses unexpected schema", $$4);
                  }

                  Path $$6 = a($$4);
                  $$0.put($$1, $$6.getParent());
               } catch (Exception var12) {
                  g.error("Couldn't resolve path to vanilla assets", var12);
               }
            }
         }

         return $$0.build();
      }
   }));
   public final ahq e;
   public final Set<String> f;

   private static Path a(URI $$0) throws IOException {
      try {
         return Paths.get($$0);
      } catch (FileSystemNotFoundException var3) {
      } catch (Throwable var4) {
         g.warn("Unable to get path for: {}", $$0, var4);
      }

      try {
         FileSystems.newFileSystem($$0, Collections.emptyMap());
      } catch (FileSystemAlreadyExistsException var2) {
      }

      return Paths.get($$0);
   }

   public aho(ahq $$0, String... $$1) {
      this.e = $$0;
      this.f = ImmutableSet.copyOf($$1);
   }

   @Override
   public InputStream b(String $$0) throws IOException {
      if (!$$0.contains("/") && !$$0.contains("\\")) {
         if (a != null) {
            Path $$1 = a.resolve($$0);
            if (Files.exists($$1, new LinkOption[0])) {
               return Files.newInputStream($$1);
            }
         }

         return this.a($$0);
      } else {
         throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
      }
   }

   @Override
   public InputStream a(ahm $$0, abb $$1) throws IOException {
      InputStream $$2 = this.c($$0, $$1);
      if ($$2 != null) {
         return $$2;
      } else {
         throw new FileNotFoundException($$1.a());
      }
   }

   @Override
   public Collection<abb> a(ahm $$0, String $$1, String $$2, Predicate<abb> $$3) {
      Set<abb> $$4 = Sets.newHashSet();
      if (a != null) {
         try {
            a($$4, $$1, a.resolve($$0.a()), $$2, $$3);
         } catch (IOException var12) {
         }

         if ($$0 == ahm.a) {
            Enumeration<URL> $$5 = null;

            try {
               $$5 = b.getClassLoader().getResources($$0.a() + "/");
            } catch (IOException var11) {
            }

            while($$5 != null && $$5.hasMoreElements()) {
               try {
                  URI $$6 = ((URL)$$5.nextElement()).toURI();
                  if ("file".equals($$6.getScheme())) {
                     a($$4, $$1, Paths.get($$6), $$2, $$3);
                  }
               } catch (IOException | URISyntaxException var10) {
               }
            }
         }
      }

      try {
         Path $$7 = (Path)h.get($$0);
         if ($$7 != null) {
            a($$4, $$1, $$7, $$2, $$3);
         } else {
            g.error("Can't access assets root for type: {}", $$0);
         }
      } catch (NoSuchFileException | FileNotFoundException var8) {
      } catch (IOException var9) {
         g.error("Couldn't get a list of all vanilla resources", var9);
      }

      return $$4;
   }

   private static void a(Collection<abb> $$0, String $$1, Path $$2, String $$3, Predicate<abb> $$4) throws IOException {
      Path $$5 = $$2.resolve($$1);
      Stream<Path> $$6 = Files.walk($$5.resolve($$3));

      try {
         $$6.filter($$0x -> !$$0x.endsWith(".mcmeta") && Files.isRegularFile($$0x, new LinkOption[0])).mapMulti(($$2x, $$3x) -> {
            String $$4x = $$5.relativize($$2x).toString().replaceAll("\\\\", "/");
            abb $$5x = abb.a($$1, $$4x);
            if ($$5x == null) {
               ad.a(String.format(Locale.ROOT, "Invalid path in datapack: %s:%s, ignoring", $$1, $$4x));
            } else {
               $$3x.accept($$5x);
            }

         }).filter($$4).forEach($$0::add);
      } catch (Throwable var10) {
         if ($$6 != null) {
            try {
               $$6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if ($$6 != null) {
         $$6.close();
      }

   }

   @Nullable
   protected InputStream c(ahm $$0, abb $$1) {
      String $$2 = d($$0, $$1);
      if (a != null) {
         Path $$3 = a.resolve($$0.a() + "/" + $$1.b() + "/" + $$1.a());
         if (Files.exists($$3, new LinkOption[0])) {
            try {
               return Files.newInputStream($$3);
            } catch (IOException var7) {
            }
         }
      }

      try {
         URL $$4 = aho.class.getResource($$2);
         return a($$2, $$4) ? $$4.openStream() : null;
      } catch (IOException var6) {
         return aho.class.getResourceAsStream($$2);
      }
   }

   private static String d(ahm $$0, abb $$1) {
      return "/" + $$0.a() + "/" + $$1.b() + "/" + $$1.a();
   }

   private static boolean a(String $$0, @Nullable URL $$1) throws IOException {
      return $$1 != null && ($$1.getProtocol().equals("jar") || ahk.a(new File($$1.getFile()), $$0));
   }

   @Nullable
   protected InputStream a(String $$0) {
      return aho.class.getResourceAsStream("/" + $$0);
   }

   @Override
   public boolean b(ahm $$0, abb $$1) {
      String $$2 = d($$0, $$1);
      if (a != null) {
         Path $$3 = a.resolve($$0.a() + "/" + $$1.b() + "/" + $$1.a());
         if (Files.exists($$3, new LinkOption[0])) {
            return true;
         }
      }

      try {
         URL $$4 = aho.class.getResource($$2);
         return a($$2, $$4);
      } catch (IOException var5) {
         return false;
      }
   }

   @Override
   public Set<String> a(ahm $$0) {
      return this.f;
   }

   @Nullable
   @Override
   public <T> T a(ahp<T> $$0) throws IOException {
      try {
         InputStream $$1 = this.b("pack.mcmeta");

         Object var4;
         label59: {
            try {
               if ($$1 != null) {
                  T $$2 = ahi.a($$0, $$1);
                  if ($$2 != null) {
                     var4 = $$2;
                     break label59;
                  }
               }
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

            return (T)($$0 == ahq.a ? this.e : null);
         }

         if ($$1 != null) {
            $$1.close();
         }

         return (T)var4;
      } catch (FileNotFoundException | RuntimeException var7) {
         return (T)($$0 == ahq.a ? this.e : null);
      }
   }

   @Override
   public String a() {
      return "Default";
   }

   @Override
   public void close() {
   }

   public aip b() {
      return $$0 -> Optional.of(new aik(this.a(), () -> this.a(ahm.a, $$0)));
   }
}
