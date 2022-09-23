import com.mojang.serialization.Codec;
import java.util.List;

class dbu extends dby {
   public static final Codec<dbu> a = a(dbu::new);

   public dbu(List<dbw> $$0) {
      super($$0);
   }

   public boolean a(chp $$0, gt $$1) {
      for(dbw $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dbx<?> a() {
      return dbx.j;
   }
}
