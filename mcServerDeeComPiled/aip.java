import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

@FunctionalInterface
public interface aip {
   Optional<aik> getResource(abb var1);

   default aik getResourceOrThrow(abb $$0) throws FileNotFoundException {
      return (aik)this.getResource($$0).orElseThrow(() -> new FileNotFoundException($$0.toString()));
   }

   default InputStream open(abb $$0) throws IOException {
      return this.getResourceOrThrow($$0).b();
   }

   default BufferedReader openAsReader(abb $$0) throws IOException {
      return this.getResourceOrThrow($$0).c();
   }
}
