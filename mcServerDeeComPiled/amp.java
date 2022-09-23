import com.mojang.authlib.yggdrasil.ServicesKeyInfo;
import com.mojang.logging.LogUtils;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import org.slf4j.Logger;

public interface amp {
   amp a = ($$0, $$1) -> true;
   Logger b = LogUtils.getLogger();

   boolean validate(amo var1, byte[] var2);

   default boolean a(byte[] $$0, byte[] $$1) {
      return this.validate($$1x -> $$1x.update($$0), $$1);
   }

   private static boolean a(amo $$0, byte[] $$1, Signature $$2) throws SignatureException {
      $$0.update($$2::update);
      return $$2.verify($$1);
   }

   static amp a(PublicKey $$0, String $$1) {
      return ($$2, $$3) -> {
         try {
            Signature $$4 = Signature.getInstance($$1);
            $$4.initVerify($$0);
            return a($$2, $$3, $$4);
         } catch (Exception var5) {
            b.error("Failed to verify signature", var5);
            return false;
         }
      };
   }

   static amp a(ServicesKeyInfo $$0) {
      return ($$1, $$2) -> {
         Signature $$3 = $$0.signature();

         try {
            return a($$1, $$2, $$3);
         } catch (SignatureException var5) {
            b.error("Failed to verify Services signature", var5);
            return false;
         }
      };
   }
}
