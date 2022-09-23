import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class iy {
   private static final Logger a = LogUtils.getLogger();
   private final Collection<Path> b;
   private final Path c;
   private final List<iz> d = Lists.newArrayList();
   private final List<iz> e = Lists.newArrayList();
   private final ae f;
   private final boolean g;

   public iy(Path $$0, Collection<Path> $$1, ae $$2, boolean $$3) {
      this.c = $$0;
      this.b = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public Collection<Path> a() {
      return this.b;
   }

   public Path b() {
      return this.c;
   }

   public Path a(iy.b $$0) {
      return this.b().resolve($$0.d);
   }

   public void c() throws IOException {
      ja $$0 = new ja(this.c, this.d, this.f);
      Stopwatch $$1 = Stopwatch.createStarted();
      Stopwatch $$2 = Stopwatch.createUnstarted();

      for(iz $$3 : this.e) {
         if (!this.g && !$$0.a($$3)) {
            a.debug("Generator {} already run for version {}", $$3.a(), this.f.getName());
         } else {
            a.info("Starting provider: {}", $$3.a());
            $$2.start();
            $$3.a($$0.b($$3));
            $$2.stop();
            a.info("{} finished after {} ms", $$3.a(), $$2.elapsed(TimeUnit.MILLISECONDS));
            $$2.reset();
         }
      }

      a.info("All providers took: {} ms", $$1.elapsed(TimeUnit.MILLISECONDS));
      $$0.a();
   }

   public void a(boolean $$0, iz $$1) {
      if ($$0) {
         this.e.add($$1);
      }

      this.d.add($$1);
   }

   public iy.a a(iy.b $$0, String $$1) {
      return new iy.a(this, $$0, $$1);
   }

   static {
      abd.a();
   }

   public static class a {
      private final Path a;
      private final String b;

      a(iy $$0, iy.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(abb $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(abb $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }
   }

   public static enum b {
      a("data"),
      b("assets"),
      c("reports");

      final String d;

      private b(String $$0) {
         this.d = $$0;
      }
   }
}
