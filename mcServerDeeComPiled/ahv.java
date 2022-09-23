import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ahv implements aia {
   private static final FileFilter a = $$0 -> {
      boolean $$1 = $$0.isFile() && $$0.getName().endsWith(".zip");
      boolean $$2 = $$0.isDirectory() && new File($$0, "pack.mcmeta").isFile();
      return $$1 || $$2;
   };
   private final File b;
   private final ahz c;

   public ahv(File $$0, ahz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<ahw> $$0, ahw.a $$1) {
      if (!this.b.isDirectory()) {
         this.b.mkdirs();
      }

      File[] $$2 = this.b.listFiles(a);
      if ($$2 != null) {
         for(File $$3 : $$2) {
            String $$4 = "file/" + $$3.getName();
            ahw $$5 = ahw.a($$4, false, this.a($$3), $$1, ahw.b.a, this.c);
            if ($$5 != null) {
               $$0.accept($$5);
            }
         }

      }
   }

   private Supplier<ahl> a(File $$0) {
      return $$0.isDirectory() ? () -> new ahk($$0) : () -> new ahj($$0);
   }
}
