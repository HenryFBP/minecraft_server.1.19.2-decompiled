import com.mojang.serialization.Codec;

public class dkm extends dki {
   public static final Codec<dkm> a = alq.c.fieldOf("chance").xmap(dkm::new, $$0 -> $$0.c).codec();
   private final int c;

   private dkm(int $$0) {
      this.c = $$0;
   }

   public static dkm a(int $$0) {
      return new dkm($$0);
   }

   @Override
   protected boolean a(dkh $$0, amn $$1, gt $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dkk<?> b() {
      return dkk.b;
   }
}
