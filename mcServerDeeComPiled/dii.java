import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;

public class dii extends din {
   public static final Codec<dii> a = dhw.a.fieldOf("provider").xmap(dii::new, $$0 -> $$0.b).codec();
   private final dhw b;

   public dii(dhw $$0) {
      this.b = $$0;
   }

   @Override
   protected dio<?> a() {
      return dio.e;
   }

   @Override
   public void a(din.a $$0) {
      List<gt> $$1 = Lists.newArrayList();
      List<gt> $$2 = $$0.e();
      List<gt> $$3 = $$0.c();
      if ($$2.isEmpty()) {
         $$1.addAll($$3);
      } else if (!$$3.isEmpty() && ((gt)$$2.get(0)).v() == ((gt)$$3.get(0)).v()) {
         $$1.addAll($$3);
         $$1.addAll($$2);
      } else {
         $$1.addAll($$2);
      }

      if (!$$1.isEmpty()) {
         int $$4 = ((gt)$$1.get(0)).v();
         $$1.stream().filter($$1x -> $$1x.v() == $$4).forEach($$1x -> {
            this.a($$0, $$1x.f().d());
            this.a($$0, $$1x.g(2).d());
            this.a($$0, $$1x.f().e(2));
            this.a($$0, $$1x.g(2).e(2));

            for(int $$2x = 0; $$2x < 5; ++$$2x) {
               int $$3x = $$0.b().a(64);
               int $$4x = $$3x % 8;
               int $$5 = $$3x / 8;
               if ($$4x == 0 || $$4x == 7 || $$5 == 0 || $$5 == 7) {
                  this.a($$0, $$1x.b(-3 + $$4x, 0, -3 + $$5));
               }
            }

         });
      }
   }

   private void a(din.a $$0, gt $$1) {
      for(int $$2 = -2; $$2 <= 2; ++$$2) {
         for(int $$3 = -2; $$3 <= 2; ++$$3) {
            if (Math.abs($$2) != 2 || Math.abs($$3) != 2) {
               this.b($$0, $$1.b($$2, 0, $$3));
            }
         }
      }

   }

   private void b(din.a $$0, gt $$1) {
      for(int $$2 = 2; $$2 >= -3; --$$2) {
         gt $$3 = $$1.b($$2);
         if (ddt.a($$0.a(), $$3)) {
            $$0.a($$3, this.b.a($$0.b(), $$1));
            break;
         }

         if (!$$0.a($$3) && $$2 < 0) {
            break;
         }
      }

   }
}
