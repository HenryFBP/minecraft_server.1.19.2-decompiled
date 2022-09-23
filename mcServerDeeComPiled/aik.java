import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aik {
   private final String a;
   private final aik.a<InputStream> b;
   private final aik.a<aio> c;
   @Nullable
   private aio d;

   public aik(String $$0, aik.a<InputStream> $$1, aik.a<aio> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aik(String $$0, aik.a<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = () -> aio.a;
      this.d = aio.a;
   }

   public String a() {
      return this.a;
   }

   public InputStream b() throws IOException {
      return (InputStream)this.b.get();
   }

   public BufferedReader c() throws IOException {
      return new BufferedReader(new InputStreamReader(this.b(), StandardCharsets.UTF_8));
   }

   public aio d() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }

   @FunctionalInterface
   public interface a<T> {
      T get() throws IOException;
   }
}
