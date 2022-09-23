import com.mojang.serialization.Codec;

public class dim extends din {
   public static final Codec<dim> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dim::new, $$0 -> $$0.b).codec();
   private final float b;

   @Override
   protected dio<?> a() {
      return dio.b;
   }

   public dim(float $$0) {
      this.b = $$0;
   }

   @Override
   public void a(din.a $$0) {
      amn $$1 = $$0.b();
      $$0.d().forEach($$2 -> {
         if ($$1.i() < this.b) {
            gt $$3 = $$2.f();
            if ($$0.a($$3)) {
               a($$3, csc.c, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gt $$4 = $$2.g();
            if ($$0.a($$4)) {
               a($$4, csc.e, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gt $$5 = $$2.d();
            if ($$0.a($$5)) {
               a($$5, csc.d, $$0);
            }
         }

         if ($$1.i() < this.b) {
            gt $$6 = $$2.e();
            if ($$0.a($$6)) {
               a($$6, csc.b, $$0);
            }
         }

      });
   }

   private static void a(gt $$0, cwf $$1, din.a $$2) {
      $$2.a($$0, $$1);
      int $$3 = 4;

      for(gt var4 = $$0.c(); $$2.a(var4) && $$3 > 0; --$$3) {
         $$2.a(var4, $$1);
         var4 = var4.c();
      }

   }
}
