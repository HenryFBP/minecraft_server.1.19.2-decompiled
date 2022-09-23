import com.mojang.serialization.Codec;

public class dip extends din {
   public static final Codec<dip> a = Codec.unit(() -> dip.b);
   public static final dip b = new dip();

   @Override
   protected dio<?> a() {
      return dio.a;
   }

   @Override
   public void a(din.a $$0) {
      amn $$1 = $$0.b();
      $$0.c().forEach($$2 -> {
         if ($$1.a(3) > 0) {
            gt $$3 = $$2.f();
            if ($$0.a($$3)) {
               $$0.a($$3, csc.c);
            }
         }

         if ($$1.a(3) > 0) {
            gt $$4 = $$2.g();
            if ($$0.a($$4)) {
               $$0.a($$4, csc.e);
            }
         }

         if ($$1.a(3) > 0) {
            gt $$5 = $$2.d();
            if ($$0.a($$5)) {
               $$0.a($$5, csc.d);
            }
         }

         if ($$1.a(3) > 0) {
            gt $$6 = $$2.e();
            if ($$0.a($$6)) {
               $$0.a($$6, csc.b);
            }
         }

      });
   }
}
