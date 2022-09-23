import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drq {
   static final Logger a = LogUtils.getLogger();
   static final DateTimeFormatter b = new DateTimeFormatterBuilder()
      .appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD)
      .appendLiteral('-')
      .appendValue(ChronoField.MONTH_OF_YEAR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.DAY_OF_MONTH, 2)
      .appendLiteral('_')
      .appendValue(ChronoField.HOUR_OF_DAY, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
      .appendLiteral('-')
      .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
      .toFormatter();
   private static final ImmutableList<String> c = ImmutableList.of(
      "RandomSeed", "generatorName", "generatorOptions", "generatorVersion", "legacy_custom_options", "MapFeatures", "BonusChest"
   );
   private static final String d = "Data";
   final Path e;
   private final Path f;
   final DataFixer g;

   public drq(Path $$0, Path $$1, DataFixer $$2) {
      this.g = $$2;

      try {
         Files.createDirectories(Files.exists($$0, new LinkOption[0]) ? $$0.toRealPath() : $$0);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.e = $$0;
      this.f = $$1;
   }

   public static drq a(Path $$0) {
      return new drq($$0, $$0.resolve("../backups"), ank.a());
   }

   private static <T> Pair<dbm, Lifecycle> a(Dynamic<T> $$0, DataFixer $$1, int $$2) {
      Dynamic<T> $$3 = $$0.get("WorldGenSettings").orElseEmptyMap();
      UnmodifiableIterator $$6 = c.iterator();

      while($$6.hasNext()) {
         String $$4 = (String)$$6.next();
         Optional<? extends Dynamic<?>> $$5 = $$0.get($$4).result();
         if ($$5.isPresent()) {
            $$3 = $$3.set($$4, (Dynamic)$$5.get());
         }
      }

      Dynamic<T> $$6 = $$1.update(asr.A, $$3, $$2, ab.b().getWorldVersion());
      DataResult<dbm> $$7 = dbm.a.parse($$6);
      return Pair.of((dbm)$$7.resultOrPartial(ad.a("WorldGenSettings: ", a::error)).orElseGet(() -> {
         hn $$1x = hn.a($$6);
         return dks.a($$1x);
      }), $$7.lifecycle());
   }

   private static cgl a(Dynamic<?> $$0) {
      return (cgl)cgl.b.parse($$0).resultOrPartial(a::error).orElse(cgl.a);
   }

   public String a() {
      return "Anvil";
   }

   public drq.a b() throws drp {
      if (!Files.isDirectory(this.e, new LinkOption[0])) {
         throw new drp(rq.c("selectWorld.load_folder_access"));
      } else {
         try {
            List<drq.b> $$0 = Files.list(this.e)
               .filter($$0 -> Files.isDirectory($$0, new LinkOption[0]))
               .map(drq.b::new)
               .filter($$0 -> Files.isRegularFile($$0.b(), new LinkOption[0]) || Files.isRegularFile($$0.c(), new LinkOption[0]))
               .toList();
            return new drq.a($$0);
         } catch (IOException var2) {
            throw new drp(rq.c("selectWorld.load_folder_access"));
         }
      }
   }

   public CompletableFuture<List<drr>> a(drq.a $$0) {
      List<CompletableFuture<drr>> $$1 = new ArrayList($$0.a.size());

      for(drq.b $$2 : $$0.a) {
         $$1.add(
            CompletableFuture.supplyAsync(
               () -> {
                  boolean $$1;
                  try {
                     $$1 = alo.b($$2.f());
                  } catch (Exception var6) {
                     a.warn("Failed to read {} lock", $$2.f(), var6);
                     return null;
                  }
      
                  try {
                     drr $$4 = this.a($$2, this.a($$2, $$1));
                     return $$4 != null ? $$4 : null;
                  } catch (OutOfMemoryError var4x) {
                     amg.b();
                     System.gc();
                     a.error(LogUtils.FATAL_MARKER, "Ran out of memory trying to read summary of {}", $$2.a());
                     throw var4x;
                  } catch (StackOverflowError var5) {
                     a.error(
                        LogUtils.FATAL_MARKER,
                        "Ran out of stack trying to read summary of {}. Assuming corruption; attempting to restore from from level.dat_old.",
                        $$2.a()
                     );
                     ad.a($$2.b(), $$2.c(), $$2.a(LocalDateTime.now()), true);
                     throw var5;
                  }
               },
               ad.g()
            )
         );
      }

      return ad.d($$1).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).sorted().toList());
   }

   private int e() {
      return 19133;
   }

   @Nullable
   <T> T a(drq.b $$0, BiFunction<Path, DataFixer, T> $$1) {
      if (!Files.exists($$0.f(), new LinkOption[0])) {
         return null;
      } else {
         Path $$2 = $$0.b();
         if (Files.exists($$2, new LinkOption[0])) {
            T $$3 = (T)$$1.apply($$2, this.g);
            if ($$3 != null) {
               return $$3;
            }
         }

         $$2 = $$0.c();
         return (T)(Files.exists($$2, new LinkOption[0]) ? $$1.apply($$2, this.g) : null);
      }
   }

   @Nullable
   private static cgl a(Path $$0, DataFixer $$1) {
      try {
         qc $$2 = b($$0);
         if ($$2 instanceof pj $$3) {
            pj $$4 = $$3.p("Data");
            int $$5 = $$4.b("DataVersion", 99) ? $$4.h("DataVersion") : -1;
            Dynamic<qc> $$6 = $$1.update(ani.a.a(), new Dynamic(pu.a, $$4), $$5, ab.b().getWorldVersion());
            return (cgl)$$6.get("DataPacks").result().map(drq::a).orElse(cgl.a);
         }
      } catch (Exception var7) {
         a.error("Exception reading {}", $$0, var7);
      }

      return null;
   }

   static BiFunction<Path, DataFixer, dru> a(DynamicOps<qc> $$0, cgl $$1, Lifecycle $$2) {
      return ($$3, $$4) -> {
         try {
            pj $$5 = pt.a($$3.toFile());
            pj $$6 = $$5.p("Data");
            pj $$7 = $$6.b("Player", 10) ? $$6.p("Player") : null;
            $$6.r("Player");
            int $$8 = $$6.b("DataVersion", 99) ? $$6.h("DataVersion") : -1;
            Dynamic<qc> $$9 = $$4.update(ani.a.a(), new Dynamic($$0, $$6), $$8, ab.b().getWorldVersion());
            Pair<dbm, Lifecycle> $$10 = a($$9, $$4, $$8);
            drs $$11 = drs.a($$9);
            chb $$12 = chb.a($$9, $$1);
            Lifecycle $$13 = ((Lifecycle)$$10.getSecond()).add($$2);
            return dru.a($$9, $$4, $$8, $$7, $$12, $$11, (dbm)$$10.getFirst(), $$13);
         } catch (Exception var14) {
            a.error("Exception reading {}", $$3, var14);
            return null;
         }
      };
   }

   BiFunction<Path, DataFixer, drr> a(drq.b $$0, boolean $$1) {
      return ($$2, $$3) -> {
         try {
            qc $$4 = b($$2);
            if ($$4 instanceof pj $$5) {
               pj $$6 = $$5.p("Data");
               int $$7 = $$6.b("DataVersion", 99) ? $$6.h("DataVersion") : -1;
               Dynamic<qc> $$8 = $$3.update(ani.a.a(), new Dynamic(pu.a, $$6), $$7, ab.b().getWorldVersion());
               drs $$9 = drs.a($$8);
               int $$10 = $$9.a();
               if ($$10 == 19132 || $$10 == 19133) {
                  boolean $$11 = $$10 != this.e();
                  Path $$12 = $$0.d();
                  cgl $$13 = (cgl)$$8.get("DataPacks").result().map(drq::a).orElse(cgl.a);
                  chb $$14 = chb.a($$8, $$13);
                  return new drr($$14, $$9, $$0.a(), $$11, $$1, $$12);
               }
            } else {
               a.warn("Invalid root tag in {}", $$2);
            }

            return null;
         } catch (Exception var16) {
            a.error("Exception reading {}", $$2, var16);
            return null;
         }
      };
   }

   @Nullable
   private static qc b(Path $$0) throws IOException {
      qo $$1 = new qo(new ql("Data", pj.b, "Player"), new ql("Data", pj.b, "WorldGenSettings"));
      pt.a($$0.toFile(), $$1);
      return $$1.d();
   }

   public boolean a(String $$0) {
      try {
         Path $$1 = this.e.resolve($$0);
         Files.createDirectory($$1);
         Files.deleteIfExists($$1);
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   public boolean b(String $$0) {
      return Files.isDirectory(this.e.resolve($$0), new LinkOption[0]);
   }

   public Path c() {
      return this.e;
   }

   public Path d() {
      return this.f;
   }

   public drq.c c(String $$0) throws IOException {
      return new drq.c($$0);
   }

   public static record a(List<drq.b> a) implements Iterable<drq.b> {
      final List<drq.b> a;

      public boolean a() {
         return this.a.isEmpty();
      }

      public Iterator<drq.b> iterator() {
         return this.a.iterator();
      }

      public List<drq.b> b() {
         return this.a;
      }
   }

   public static record b(Path a) {
      public String a() {
         return this.a.getFileName().toString();
      }

      public Path b() {
         return this.a(dro.e);
      }

      public Path c() {
         return this.a(dro.f);
      }

      public Path a(LocalDateTime $$0) {
         return this.a.resolve(dro.e.a() + "_corrupted_" + $$0.format(drq.b));
      }

      public Path d() {
         return this.a(dro.g);
      }

      public Path e() {
         return this.a(dro.h);
      }

      public Path a(dro $$0) {
         return this.a.resolve($$0.a());
      }

      public Path f() {
         return this.a;
      }
   }

   public class c implements AutoCloseable {
      final alo b;
      final drq.b c;
      private final String d;
      private final Map<dro, Path> e = Maps.newHashMap();

      public c(String $$1) throws IOException {
         this.d = $$1;
         this.c = new drq.b(drq.this.e.resolve($$1));
         this.b = alo.a(this.c.f());
      }

      public String a() {
         return this.d;
      }

      public Path a(dro $$0) {
         return (Path)this.e.computeIfAbsent($$0, this.c::a);
      }

      public Path a(aba<cgx> $$0) {
         return cyu.a($$0, this.c.f());
      }

      private void h() {
         if (!this.b.a()) {
            throw new IllegalStateException("Lock is no longer valid");
         }
      }

      public drt b() {
         this.h();
         return new drt(this, drq.this.g);
      }

      @Nullable
      public drr c() {
         this.h();
         return drq.this.a(this.c, drq.this.a(this.c, false));
      }

      @Nullable
      public drw a(DynamicOps<qc> $$0, cgl $$1, Lifecycle $$2) {
         this.h();
         return drq.this.a(this.c, drq.a($$0, $$1, $$2));
      }

      @Nullable
      public cgl d() {
         this.h();
         return drq.this.a(this.c, drq::a);
      }

      public void a(hn $$0, drw $$1) {
         this.a($$0, $$1, null);
      }

      public void a(hn $$0, drw $$1, @Nullable pj $$2) {
         File $$3 = this.c.f().toFile();
         pj $$4 = $$1.a($$0, $$2);
         pj $$5 = new pj();
         $$5.a("Data", (qc)$$4);

         try {
            File $$6 = File.createTempFile("level", ".dat", $$3);
            pt.a($$5, $$6);
            File $$7 = this.c.c().toFile();
            File $$8 = this.c.b().toFile();
            ad.a($$8, $$6, $$7);
         } catch (Exception var10) {
            drq.a.error("Failed to save level {}", $$3, var10);
         }

      }

      public Optional<Path> e() {
         return !this.b.a() ? Optional.empty() : Optional.of(this.c.d());
      }

      public void f() throws IOException {
         this.h();
         final Path $$0 = this.c.e();
         drq.a.info("Deleting level {}", this.d);

         for(int $$1 = 1; $$1 <= 5; ++$$1) {
            drq.a.info("Attempt {}...", $$1);

            try {
               Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
                  public FileVisitResult a(Path $$0x, BasicFileAttributes $$1) throws IOException {
                     if (!$$0.equals($$0)) {
                        drq.a.debug("Deleting {}", $$0);
                        Files.delete($$0);
                     }

                     return FileVisitResult.CONTINUE;
                  }

                  public FileVisitResult a(Path $$0x, IOException $$1) throws IOException {
                     if ($$1 != null) {
                        throw $$1;
                     } else {
                        if ($$0.equals(c.this.c.f())) {
                           c.this.b.close();
                           Files.deleteIfExists($$0);
                        }

                        Files.delete($$0);
                        return FileVisitResult.CONTINUE;
                     }
                  }
               });
               break;
            } catch (IOException var6) {
               if ($$1 >= 5) {
                  throw var6;
               }

               drq.a.warn("Failed to delete {}", this.c.f(), var6);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var5) {
               }
            }
         }

      }

      public void a(String $$0) throws IOException {
         this.h();
         Path $$1 = this.c.b();
         if (Files.exists($$1, new LinkOption[0])) {
            pj $$2 = pt.a($$1.toFile());
            pj $$3 = $$2.p("Data");
            $$3.a("LevelName", $$0);
            pt.a($$2, $$1.toFile());
         }

      }

      public long g() throws IOException {
         this.h();
         String $$0 = LocalDateTime.now().format(drq.b) + "_" + this.d;
         Path $$1 = drq.this.d();

         try {
            Files.createDirectories(Files.exists($$1, new LinkOption[0]) ? $$1.toRealPath() : $$1);
         } catch (IOException var9) {
            throw new RuntimeException(var9);
         }

         Path $$3 = $$1.resolve(x.a($$1, $$0, ".zip"));
         final ZipOutputStream $$4 = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream($$3)));

         try {
            final Path $$5 = Paths.get(this.d);
            Files.walkFileTree(this.c.f(), new SimpleFileVisitor<Path>() {
               public FileVisitResult a(Path $$0, BasicFileAttributes $$1) throws IOException {
                  if ($$0.endsWith("session.lock")) {
                     return FileVisitResult.CONTINUE;
                  } else {
                     String $$2 = $$5.resolve(c.this.c.f().relativize($$0)).toString().replace('\\', '/');
                     ZipEntry $$3 = new ZipEntry($$2);
                     $$4.putNextEntry($$3);
                     com.google.common.io.Files.asByteSource($$0.toFile()).copyTo($$4);
                     $$4.closeEntry();
                     return FileVisitResult.CONTINUE;
                  }
               }
            });
         } catch (Throwable var8) {
            try {
               $$4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }

            throw var8;
         }

         $$4.close();
         return Files.size($$3);
      }

      public void close() throws IOException {
         this.b.close();
      }
   }
}
