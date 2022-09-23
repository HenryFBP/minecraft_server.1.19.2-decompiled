import com.mojang.datafixers.util.Either;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Optional;
import javax.crypto.SecretKey;

public class zy implements tc<zv> {
   private final byte[] a;
   private final Either<byte[], ali.b> b;

   public zy(SecretKey $$0, PublicKey $$1, byte[] $$2) throws alj {
      this.a = ali.a($$1, $$0.getEncoded());
      this.b = Either.left(ali.a($$1, $$2));
   }

   public zy(SecretKey $$0, PublicKey $$1, long $$2, byte[] $$3) throws alj {
      this.a = ali.a($$1, $$0.getEncoded());
      this.b = Either.right(new ali.b($$2, $$3));
   }

   public zy(qx $$0) {
      this.a = $$0.b();
      this.b = $$0.b(qx::b, ali.b::new);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a);
      $$0.a(this.b, qx::a, ali.b::a);
   }

   public void a(zv $$0) {
      $$0.a(this);
   }

   public SecretKey a(PrivateKey $$0) throws alj {
      return ali.a($$0, this.a);
   }

   public boolean a(byte[] $$0, buf $$1) {
      return this.b.map($$0x -> false, $$2 -> $$1.a().validate($$2x -> {
            $$2x.update($$0);
            $$2x.update($$2.b());
         }, $$2.d()));
   }

   public boolean a(byte[] $$0, PrivateKey $$1) {
      Optional<byte[]> $$2 = this.b.left();

      try {
         return $$2.isPresent() && Arrays.equals($$0, ali.b($$1, (byte[])$$2.get()));
      } catch (alj var5) {
         return false;
      }
   }
}
