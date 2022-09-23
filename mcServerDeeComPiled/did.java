import com.mojang.serialization.Codec;

public class did extends dhw {
   public static final Codec<did> b = cvo.b.fieldOf("state").xmap(cvn.a::b, cjt::m).xmap(did::new, $$0 -> $$0.c).codec();
   private final cjt c;

   public did(cjt $$0) {
      this.c = $$0;
   }

   @Override
   protected dhx<?> a() {
      return dhx.f;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      gy.a $$2 = gy.a.a($$0);
      return this.c.m().a(cpv.g, $$2);
   }
}
