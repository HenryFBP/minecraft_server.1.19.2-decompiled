import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class dou {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = "structures";
   private static final String c = "gameteststructures";
   private static final String d = ".nbt";
   private static final String e = ".snbt";
   private final Map<abb, Optional<dot>> f = Maps.newConcurrentMap();
   private final DataFixer g;
   private aim h;
   private final Path i;
   private final List<dou.b> j;

   public dou(aim $$0, drq.c $$1, DataFixer $$2) {
      this.h = $$0;
      this.g = $$2;
      this.i = $$1.a(dro.i).normalize();
      Builder<dou.b> $$3 = ImmutableList.builder();
      $$3.add(new dou.b(this::h, this::d));
      if (ab.aL) {
         $$3.add(new dou.b(this::g, this::c));
      }

      $$3.add(new dou.b(this::f, this::b));
      this.j = $$3.build();
   }

   public dot a(abb $$0) {
      Optional<dot> $$1 = this.b($$0);
      if ($$1.isPresent()) {
         return (dot)$$1.get();
      } else {
         dot $$2 = new dot();
         this.f.put($$0, Optional.of($$2));
         return $$2;
      }
   }

   public Optional<dot> b(abb $$0) {
      return (Optional<dot>)this.f.computeIfAbsent($$0, this::e);
   }

   public Stream<abb> a() {
      return this.j.stream().flatMap($$0 -> (Stream)$$0.b().get()).distinct();
   }

   private Optional<dot> e(abb $$0) {
      for(dou.b $$1 : this.j) {
         try {
            Optional<dot> $$2 = (Optional)$$1.a().apply($$0);
            if ($$2.isPresent()) {
               return $$2;
            }
         } catch (Exception var5) {
         }
      }

      return Optional.empty();
   }

   public void a(aim $$0) {
      this.h = $$0;
      this.f.clear();
   }

   private Optional<dot> f(abb $$0) {
      abb $$1 = new abb($$0.b(), "structures/" + $$0.a() + ".nbt");
      return this.a((dou.a)(() -> this.h.open($$1)), (Consumer<Throwable>)($$1x -> a.error("Couldn't load structure {}", $$0, $$1x)));
   }

   private Stream<abb> b() {
      return this.h
         .b("structures", $$0 -> true)
         .keySet()
         .stream()
         .map($$0 -> new abb($$0.b(), $$0.a().substring("structures".length() + 1, $$0.a().length() - ".nbt".length())));
   }

   private Optional<dot> g(abb $$0) {
      return this.a($$0, Paths.get("gameteststructures"));
   }

   private Stream<abb> c() {
      return this.a(Paths.get("gameteststructures"), "minecraft", ".snbt");
   }

   private Optional<dot> h(abb $$0) {
      if (!Files.isDirectory(this.i, new LinkOption[0])) {
         return Optional.empty();
      } else {
         Path $$1 = b(this.i, $$0, ".nbt");
         return this.a((dou.a)(() -> new FileInputStream($$1.toFile())), (Consumer<Throwable>)($$1x -> a.error("Couldn't load structure from {}", $$1, $$1x)));
      }
   }

   private Stream<abb> d() {
      if (!Files.isDirectory(this.i, new LinkOption[0])) {
         return Stream.empty();
      } else {
         try {
            return Files.list(this.i).filter($$0 -> Files.isDirectory($$0, new LinkOption[0])).flatMap($$0 -> this.a($$0));
         } catch (IOException var2) {
            return Stream.empty();
         }
      }
   }

   private Stream<abb> a(Path $$0) {
      Path $$1 = $$0.resolve("structures");
      return this.a($$1, $$0.getFileName().toString(), ".nbt");
   }

   private Stream<abb> a(Path $$0, String $$1, String $$2) {
      if (!Files.isDirectory($$0, new LinkOption[0])) {
         return Stream.empty();
      } else {
         int $$3 = $$2.length();
         Function<String, String> $$4 = $$1x -> $$1x.substring(0, $$1x.length() - $$3);

         try {
            return Files.walk($$0).filter($$1x -> $$1x.toString().endsWith($$2)).mapMulti(($$3x, $$4x) -> {
               try {
                  $$4x.accept(new abb($$1, (String)$$4.apply(this.a($$0, $$3x))));
               } catch (aa var7x) {
                  a.error("Invalid location while listing pack contents", var7x);
               }

            });
         } catch (IOException var7) {
            a.error("Failed to list folder contents", var7);
            return Stream.empty();
         }
      }
   }

   private String a(Path $$0, Path $$1) {
      return $$0.relativize($$1).toString().replace(File.separator, "/");
   }

   private Optional<dot> a(abb $$0, Path $$1) {
      if (!Files.isDirectory($$1, new LinkOption[0])) {
         return Optional.empty();
      } else {
         Path $$2 = x.b($$1, $$0.a(), ".snbt");

         try {
            BufferedReader $$3 = Files.newBufferedReader($$2);

            Optional var6;
            try {
               String $$4 = IOUtils.toString($$3);
               var6 = Optional.of(this.a(pv.a($$4)));
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

            return var6;
         } catch (NoSuchFileException var9) {
            return Optional.empty();
         } catch (CommandSyntaxException | IOException var10) {
            a.error("Couldn't load structure from {}", $$2, var10);
            return Optional.empty();
         }
      }
   }

   private Optional<dot> a(dou.a $$0, Consumer<Throwable> $$1) {
      try {
         InputStream $$2 = $$0.open();

         Optional var4;
         try {
            var4 = Optional.of(this.a($$2));
         } catch (Throwable var7) {
            if ($$2 != null) {
               try {
                  $$2.close();
               } catch (Throwable var6) {
                  var7.addSuppressed(var6);
               }
            }

            throw var7;
         }

         if ($$2 != null) {
            $$2.close();
         }

         return var4;
      } catch (FileNotFoundException var8) {
         return Optional.empty();
      } catch (Throwable var9) {
         $$1.accept(var9);
         return Optional.empty();
      }
   }

   private dot a(InputStream $$0) throws IOException {
      pj $$1 = pt.a($$0);
      return this.a($$1);
   }

   public dot a(pj $$0) {
      if (!$$0.b("DataVersion", 99)) {
         $$0.a("DataVersion", 500);
      }

      dot $$1 = new dot();
      $$1.b(pv.a(this.g, ani.f, $$0, $$0.h("DataVersion")));
      return $$1;
   }

   public boolean c(abb $$0) {
      Optional<dot> $$1 = (Optional)this.f.get($$0);
      if (!$$1.isPresent()) {
         return false;
      } else {
         dot $$2 = (dot)$$1.get();
         Path $$3 = b(this.i, $$0, ".nbt");
         Path $$4 = $$3.getParent();
         if ($$4 == null) {
            return false;
         } else {
            try {
               Files.createDirectories(Files.exists($$4, new LinkOption[0]) ? $$4.toRealPath() : $$4);
            } catch (IOException var13) {
               a.error("Failed to create parent directory: {}", $$4);
               return false;
            }

            pj $$6 = $$2.a(new pj());

            try {
               OutputStream $$7 = new FileOutputStream($$3.toFile());

               try {
                  pt.a($$6, $$7);
               } catch (Throwable var11) {
                  try {
                     $$7.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }

                  throw var11;
               }

               $$7.close();
               return true;
            } catch (Throwable var12) {
               return false;
            }
         }
      }
   }

   public Path a(abb $$0, String $$1) {
      return a(this.i, $$0, $$1);
   }

   public static Path a(Path $$0, abb $$1, String $$2) {
      try {
         Path $$3 = $$0.resolve($$1.b());
         Path $$4 = $$3.resolve("structures");
         return x.b($$4, $$1.a(), $$2);
      } catch (InvalidPathException var5) {
         throw new aa("Invalid resource path: " + $$1, var5);
      }
   }

   private static Path b(Path $$0, abb $$1, String $$2) {
      if ($$1.a().contains("//")) {
         throw new aa("Invalid resource path: " + $$1);
      } else {
         Path $$3 = a($$0, $$1, $$2);
         if ($$3.startsWith($$0) && x.a($$3) && x.b($$3)) {
            return $$3;
         } else {
            throw new aa("Invalid resource path: " + $$3);
         }
      }
   }

   public void d(abb $$0) {
      this.f.remove($$0);
   }

   @FunctionalInterface
   interface a {
      InputStream open() throws IOException;
   }

   static record b(Function<abb, Optional<dot>> a, Supplier<Stream<abb>> b) {
   }
}
