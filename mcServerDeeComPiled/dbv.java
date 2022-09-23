import com.mojang.serialization.Codec;
import java.util.List;

class dbv extends dby {
   public static final Codec<dbv> a = a(dbv::new);

   public dbv(List<dbw> $$0) {
      super($$0);
   }

   public boolean a(chp $$0, gt $$1) {
      for(dbw $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public dbx<?> a() {
      return dbx.i;
   }
}
