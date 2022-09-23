import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public class bdk extends bdo<btp> {
   public bdk() {
      super(ImmutableMap.of(bku.d, bkv.a));
   }

   protected boolean a(agg $$0, btp $$1) {
      gt $$2 = ((hb)$$1.dy().c(bku.d).get()).b();
      return $$2.a($$1.cY(), 2.0) || $$1.fV();
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      hb $$3 = (hb)$$1.dy().c(bku.d).get();
      $$1.dy().b(bku.d);
      $$1.dy().a(bku.c, $$3);
      $$0.a($$1, (byte)14);
      if ($$1.fU().b() == bts.b) {
         MinecraftServer $$4 = $$0.n();
         Optional.ofNullable($$4.a($$3.a()))
            .flatMap($$1x -> $$1x.x().c($$3.b()))
            .flatMap($$0x -> hm.ap.r().filter($$1x -> $$1x.b().test($$0x)).findFirst())
            .ifPresent($$2x -> {
               $$1.a($$1.fU().a($$2x));
               $$1.c($$0);
            });
      }
   }
}
