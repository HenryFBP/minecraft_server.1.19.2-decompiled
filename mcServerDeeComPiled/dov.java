import com.mojang.serialization.Codec;

public class dov extends don {
   public static final Codec<dov> a = akz.a(hm.h).fieldOf("tag").xmap(dov::new, $$0 -> $$0.b).codec();
   private final akz<cjt> b;

   public dov(akz<cjt> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(cvo $$0, amn $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected doo<?> a() {
      return doo.d;
   }
}
