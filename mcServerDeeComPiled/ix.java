import com.google.common.hash.HashCode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public interface ix {
   ix a = ($$0, $$1, $$2) -> {
      Files.createDirectories($$0.getParent());
      Files.write($$0, $$1, new OpenOption[0]);
   };

   void writeIfNeeded(Path var1, byte[] var2, HashCode var3) throws IOException;
}
