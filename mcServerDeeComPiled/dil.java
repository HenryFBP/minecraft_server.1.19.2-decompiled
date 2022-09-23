import com.mojang.serialization.Codec;
import java.util.List;

public class dil extends din {
   public static final Codec<dil> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dil::new, $$0 -> $$0.b).codec();
   private final float b;

   public dil(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dio<?> a() {
      return dio.c;
   }

   @Override
   public void a(din.a $$0) {
      amn $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<gt> $$2 = $$0.c();
         int $$3 = ((gt)$$2.get(0)).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for(gy $$3x : gy.c.a) {
               if ($$1.i() <= 0.25F) {
                  gy $$4 = $$3x.g();
                  gt $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cju.eJ.m().a(cku.b, Integer.valueOf($$1.a(3))).a(cku.aD, $$3x));
                  }
               }
            }

         });
      }
   }
}
