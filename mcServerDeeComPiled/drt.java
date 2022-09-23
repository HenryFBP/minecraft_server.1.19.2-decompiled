import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.File;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drt {
   private static final Logger b = LogUtils.getLogger();
   private final File c;
   protected final DataFixer a;

   public drt(drq.c $$0, DataFixer $$1) {
      this.a = $$1;
      this.c = $$0.a(dro.c).toFile();
      this.c.mkdirs();
   }

   public void a(buc $$0) {
      try {
         pj $$1 = $$0.f(new pj());
         File $$2 = File.createTempFile($$0.cp() + "-", ".dat", this.c);
         pt.a($$1, $$2);
         File $$3 = new File(this.c, $$0.cp() + ".dat");
         File $$4 = new File(this.c, $$0.cp() + ".dat_old");
         ad.a($$3, $$2, $$4);
      } catch (Exception var6) {
         b.warn("Failed to save player data for {}", $$0.X().getString());
      }

   }

   @Nullable
   public pj b(buc $$0) {
      pj $$1 = null;

      try {
         File $$2 = new File(this.c, $$0.cp() + ".dat");
         if ($$2.exists() && $$2.isFile()) {
            $$1 = pt.a($$2);
         }
      } catch (Exception var4) {
         b.warn("Failed to load player data for {}", $$0.X().getString());
      }

      if ($$1 != null) {
         int $$4 = $$1.b("DataVersion", 3) ? $$1.h("DataVersion") : -1;
         $$0.g(pv.a(this.a, ani.b, $$1, $$4));
      }

      return $$1;
   }

   public String[] a() {
      String[] $$0 = this.c.list();
      if ($$0 == null) {
         $$0 = new String[0];
      }

      for(int $$1 = 0; $$1 < $$0.length; ++$$1) {
         if ($$0[$$1].endsWith(".dat")) {
            $$0[$$1] = $$0[$$1].substring(0, $$0[$$1].length() - 4);
         }
      }

      return $$0;
   }
}
