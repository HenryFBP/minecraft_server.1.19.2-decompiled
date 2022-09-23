import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public interface aio {
   aio a = new aio() {
      @Override
      public <T> Optional<T> a(ahp<T> $$0) {
         return Optional.empty();
      }
   };

   static aio a(InputStream $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader(new InputStreamReader($$0, StandardCharsets.UTF_8));

      aio var3;
      try {
         final JsonObject $$2 = alz.a($$1);
         var3 = new aio() {
            @Override
            public <T> Optional<T> a(ahp<T> $$0) {
               String $$1 = $$0.a();
               return $$2.has($$1) ? Optional.of($$0.a(alz.t($$2, $$1))) : Optional.empty();
            }
         };
      } catch (Throwable var5) {
         try {
            $$1.close();
         } catch (Throwable var4) {
            var5.addSuppressed(var4);
         }

         throw var5;
      }

      $$1.close();
      return var3;
   }

   <T> Optional<T> a(ahp<T> var1);
}
