import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Consumer;

public class dnc extends dlb {
   public static final Codec<dnc> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), djj.c.fieldOf("height").forGetter($$0x -> $$0x.e)).apply($$0, dnc::new)
   );
   public final djj e;

   public dnc(dlb.c $$0, djj $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      dbo $$1 = $$0.f();
      int $$2 = $$0.h().d() + $$1.a(16);
      int $$3 = $$0.h().e() + $$1.a(16);
      int $$4 = $$0.b().f();
      dbn $$5 = new dbn($$0.b(), $$0.i());
      int $$6 = this.e.a($$1, $$5);
      chj $$7 = $$0.b().a($$2, $$3, $$0.i(), $$0.d());
      gt.a $$8 = new gt.a($$2, $$6, $$3);

      while($$6 > $$4) {
         cvo $$9 = $$7.a($$6);
         cvo $$10 = $$7.a(--$$6);
         if ($$9.h() && ($$10.a(cju.dg) || $$10.d(cgm.a, $$8.q($$6), gy.b))) {
            break;
         }
      }

      if ($$6 <= $$4) {
         return Optional.empty();
      } else {
         gt $$11 = new gt($$2, $$6, $$3);
         return Optional.of(new dlb.b($$11, (Consumer<dlt>)($$3x -> dnb.a($$0.e(), $$3x, $$1, $$11))));
      }
   }

   @Override
   public dlk<?> e() {
      return dlk.i;
   }
}
