import it.unimi.dsi.fastutil.bytes.ByteArrays;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import javax.annotation.Nullable;

public record rz(byte[] b) {
   public static final rz a = new rz(ByteArrays.EMPTY_ARRAY);

   public rz(qx $$0) {
      this($$0.b());
   }

   public void a(qx $$0) {
      $$0.a(this.b);
   }

   public boolean a(amp $$0, sh $$1, sf $$2) {
      if (!this.a()) {
         byte[] $$3 = $$2.a().asBytes();
         return $$0.validate($$2x -> $$1.a($$2x, $$3), this.b);
      } else {
         return false;
      }
   }

   public boolean a(amp $$0, sh $$1, byte[] $$2) {
      return !this.a() ? $$0.validate($$2x -> $$1.a($$2x, $$2), this.b) : false;
   }

   public boolean a() {
      return this.b.length == 0;
   }

   @Nullable
   public ByteBuffer b() {
      return !this.a() ? ByteBuffer.wrap(this.b) : null;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof rz $$1 && Arrays.equals(this.b, $$1.b)) {
            return true;
         }

         return false;
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.b);
   }

   public String toString() {
      return !this.a() ? Base64.getEncoder().encodeToString(this.b) : "empty";
   }

   public byte[] c() {
      return this.b;
   }
}
