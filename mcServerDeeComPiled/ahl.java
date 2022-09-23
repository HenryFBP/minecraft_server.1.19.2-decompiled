import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface ahl extends AutoCloseable {
   String c = ".mcmeta";
   String d = "pack.mcmeta";

   @Nullable
   InputStream b(String var1) throws IOException;

   InputStream a(ahm var1, abb var2) throws IOException;

   Collection<abb> a(ahm var1, String var2, String var3, Predicate<abb> var4);

   boolean b(ahm var1, abb var2);

   Set<String> a(ahm var1);

   @Nullable
   <T> T a(ahp<T> var1) throws IOException;

   String a();

   void close();
}
