import java.security.SignatureException;
import java.util.UUID;
import javax.annotation.Nullable;

public record sh(@Nullable rz a, UUID b) {
   public sh(qx $$0) {
      this($$0.c(rz::new), $$0.m());
   }

   public void a(qx $$0) {
      $$0.a(this.a, ($$0x, $$1) -> $$1.a($$0x));
      $$0.a(this.b);
   }

   public void a(amo.a $$0, byte[] $$1) throws SignatureException {
      if (this.a != null) {
         $$0.update(this.a.c());
      }

      $$0.update(hr.b(this.b));
      $$0.update($$1);
   }
}
