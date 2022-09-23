import com.mojang.serialization.Codec;

class dci implements dbw {
   public static dci a = new dci();
   public static final Codec<dci> e = Codec.unit(() -> a);

   private dci() {
   }

   public boolean a(chp $$0, gt $$1) {
      return true;
   }

   @Override
   public dbx<?> a() {
      return dbx.l;
   }
}
