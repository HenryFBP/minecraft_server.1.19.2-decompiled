import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dmr extends dlb {
   public static final Codec<dmr> d = a(dmr::new);

   public dmr(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      cpw $$1 = cpw.a($$0.f());
      gt $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dlb.b($$2, (Consumer<dlt>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dlt $$0, gt $$1, cpw $$2, dlb.a $$3) {
      List<dlf> $$4 = Lists.newArrayList();
      dmq.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dlk<?> e() {
      return dlk.c;
   }
}
