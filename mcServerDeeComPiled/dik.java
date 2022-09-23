import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dik extends din {
   public static final Codec<dik> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dik::new, $$0 -> $$0.d).codec();
   private static final gy b = gy.d;
   private static final gy[] c = (gy[])gy.c.a.a().filter($$0 -> $$0 != b.g()).toArray($$0 -> new gy[$$0]);
   private final float d;

   public dik(float $$0) {
      this.d = $$0;
   }

   @Override
   protected dio<?> a() {
      return dio.d;
   }

   @Override
   public void a(din.a $$0) {
      amn $$1 = $$0.b();
      if (!($$1.i() >= this.d)) {
         List<gt> $$2 = $$0.d();
         List<gt> $$3 = $$0.c();
         int $$4 = !$$2.isEmpty()
            ? Math.max(((gt)$$2.get(0)).v() - 1, ((gt)$$3.get(0)).v() + 1)
            : Math.min(((gt)$$3.get(0)).v() + 1 + $$1.a(3), ((gt)$$3.get($$3.size() - 1)).v());
         List<gt> $$5 = (List)$$3.stream().filter($$1x -> $$1x.v() == $$4).flatMap($$0x -> Stream.of(c).map($$0x::a)).collect(Collectors.toList());
         if (!$$5.isEmpty()) {
            Collections.shuffle($$5);
            Optional<gt> $$6 = $$5.stream().filter($$1x -> $$0.a($$1x) && $$0.a($$1x.a(b))).findFirst();
            if (!$$6.isEmpty()) {
               $$0.a((gt)$$6.get(), cju.nP.m().a(cjn.a, b));
               $$0.a().a((gt)$$6.get(), ctk.G).ifPresent($$1x -> {
                  int $$2x = 2 + $$1.a(2);

                  for(int $$3x = 0; $$3x < $$2x; ++$$3x) {
                     pj $$4x = new pj();
                     $$4x.a("id", hm.X.b(bbr.h).toString());
                     $$1x.a($$4x, $$1.a(599), false);
                  }

               });
            }
         }
      }
   }
}
