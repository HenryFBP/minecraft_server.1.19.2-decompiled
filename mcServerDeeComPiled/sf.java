import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.Instant;

public record sf(ri b, Instant c, long d, rw e) {
   public static final byte a = 70;

   public sf(qx $$0) {
      this(ri.a($$0), $$0.t(), $$0.readLong(), new rw($$0));
   }

   public void a(qx $$0) {
      ri.a($$0, this.b);
      $$0.a(this.c);
      $$0.writeLong(this.d);
      this.e.a($$0);
   }

   public HashCode a() {
      HashingOutputStream $$0 = new HashingOutputStream(Hashing.sha256(), OutputStream.nullOutputStream());

      try {
         DataOutputStream $$1 = new DataOutputStream($$0);
         $$1.writeLong(this.d);
         $$1.writeLong(this.c.getEpochSecond());
         OutputStreamWriter $$2 = new OutputStreamWriter($$1, StandardCharsets.UTF_8);
         $$2.write(this.b.b());
         $$2.flush();
         $$1.write(70);
         if (this.b.a()) {
            $$2.write(rq.a.b(this.b.c()));
            $$2.flush();
         }

         this.e.a($$1);
      } catch (IOException var4) {
      }

      return $$0.hash();
   }

   public sf a(ri $$0) {
      return new sf($$0, this.c, this.d, this.e);
   }
}
