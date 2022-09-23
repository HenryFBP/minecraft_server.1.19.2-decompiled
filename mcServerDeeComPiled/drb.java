import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;

public abstract class drb {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract pj a(pj var1);

   public void b() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean c() {
      return this.b;
   }

   public void a(File $$0) {
      if (this.c()) {
         pj $$1 = new pj();
         $$1.a("data", (qc)this.a(new pj()));
         $$1.a("DataVersion", ab.b().getWorldVersion());

         try {
            pt.a($$1, $$0);
         } catch (IOException var4) {
            a.error("Could not save data {}", this, var4);
         }

         this.a(false);
      }
   }
}
