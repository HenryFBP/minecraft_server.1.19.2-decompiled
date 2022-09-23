import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnk extends dlb {
   public static final Codec<dnk> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dnk::new)
   );
   public final boolean e;

   public dnk(dlb.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      dar.a $$1 = this.e ? dar.a.a : dar.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dlt $$0, dlb.a $$1) {
      cpw $$2 = cpw.a($$1.f());
      gt $$3 = new gt($$1.h().d(), 90, $$1.h().e());
      dnj.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dlk<?> e() {
      return dlk.m;
   }
}
