import com.google.common.collect.ImmutableMap;

public class bgf<E extends bce> extends bdo<E> {
   public bgf() {
      super(ImmutableMap.of(bku.Z, bkv.a));
   }

   protected void a(agg $$0, E $$1, long $$2) {
      bdp.a($$1, bku.Z).ifPresent($$2x -> {
         if ($$2x.eg() && ($$2x.ad() != bbr.bn || $$0.W().b(cgt.I))) {
            $$1.dy().b(bku.Z);
         }

      });
   }
}
