import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class ahn extends FileNotFoundException {
   public ahn(File $$0, String $$1) {
      super(String.format(Locale.ROOT, "'%s' in ResourcePack '%s'", $$1, $$0));
   }
}
