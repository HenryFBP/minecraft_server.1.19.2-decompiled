import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cyj implements AutoCloseable {
   public static final int d = 1493;
   private final cyl a;
   protected final DataFixer e;
   @Nullable
   private volatile dkw b;

   public cyj(Path $$0, DataFixer $$1, boolean $$2) {
      this.e = $$1;
      this.a = new cyl($$0, $$2, "chunk");
   }

   public boolean a(cge $$0, int $$1) {
      return this.a.a($$0, $$1);
   }

   public pj a(aba<cgx> $$0, Supplier<drm> $$1, pj $$2, Optional<aba<Codec<? extends cxk>>> $$3) {
      int $$4 = a($$2);
      if ($$4 < 1493) {
         $$2 = pv.a(this.e, ani.c, $$2, $$4, 1493);
         if ($$2.p("Level").q("hasLegacyStructureData")) {
            dkw $$5 = this.a($$0, $$1);
            $$2 = $$5.a($$2);
         }
      }

      a($$2, $$0, $$3);
      $$2 = pv.a(this.e, ani.c, $$2, Math.max(1493, $$4));
      if ($$4 < ab.b().getWorldVersion()) {
         $$2.a("DataVersion", ab.b().getWorldVersion());
      }

      $$2.r("__context");
      return $$2;
   }

   private dkw a(aba<cgx> $$0, Supplier<drm> $$1) {
      dkw $$2 = this.b;
      if ($$2 == null) {
         synchronized(this) {
            $$2 = this.b;
            if ($$2 == null) {
               this.b = $$2 = dkw.a($$0, (drm)$$1.get());
            }
         }
      }

      return $$2;
   }

   public static void a(pj $$0, aba<cgx> $$1, Optional<aba<Codec<? extends cxk>>> $$2) {
      pj $$3 = new pj();
      $$3.a("dimension", $$1.a().toString());
      $$2.ifPresent($$1x -> $$3.a("generator", $$1x.a().toString()));
      $$0.a("__context", (qc)$$3);
   }

   public static int a(pj $$0) {
      return $$0.b("DataVersion", 99) ? $$0.h("DataVersion") : -1;
   }

   public CompletableFuture<Optional<pj>> f(cge $$0) {
      return this.a.a($$0);
   }

   public void a(cge $$0, pj $$1) {
      this.a.a($$0, $$1);
      if (this.b != null) {
         this.b.a($$0.a());
      }

   }

   public void n() {
      this.a.a(true).join();
   }

   public void close() throws IOException {
      this.a.close();
   }

   public cyh o() {
      return this.a;
   }
}
