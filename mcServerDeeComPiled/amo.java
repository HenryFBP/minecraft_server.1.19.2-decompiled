import java.security.SignatureException;

@FunctionalInterface
public interface amo {
   void update(amo.a var1) throws SignatureException;

   @FunctionalInterface
   public interface a {
      void update(byte[] var1) throws SignatureException;
   }
}
