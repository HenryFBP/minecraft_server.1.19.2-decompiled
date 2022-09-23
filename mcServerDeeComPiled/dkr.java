import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dkr {
   public static final Codec<dkr> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(aba.a(hm.Q), cyv.a).fieldOf("dimensions").forGetter($$0x -> $$0x.c)).apply($$0, dkr::new)
      )
      .flatXmap(dkr::a, dkr::a);
   public static final Codec<hc<dkr>> b = aav.a(hm.aU, a);
   private final Map<aba<cyv>, cyv> c;

   public dkr(Map<aba<cyv>, cyv> $$0) {
      this.c = $$0;
   }

   private hm<cyv> c() {
      ht<cyv> $$0 = new hh<>(hm.Q, Lifecycle.experimental(), null);
      cyv.a(this.c.keySet().stream()).forEach($$1 -> {
         cyv $$2 = (cyv)this.c.get($$1);
         if ($$2 != null) {
            $$0.a($$1, $$2, Lifecycle.stable());
         }

      });
      return $$0.k();
   }

   public dbm a(long $$0, boolean $$1, boolean $$2) {
      return new dbm($$0, $$1, $$2, this.c());
   }

   public dbm a(dbm $$0) {
      return this.a($$0.a(), $$0.b(), $$0.c());
   }

   public Optional<cyv> a() {
      return Optional.ofNullable((cyv)this.c.get(cyv.b));
   }

   public cyv b() {
      return (cyv)this.a().orElseThrow(() -> new IllegalStateException("Can't find overworld in this preset"));
   }

   private static DataResult<dkr> a(dkr $$0) {
      return $$0.a().isEmpty() ? DataResult.error("Missing overworld dimension") : DataResult.success($$0, Lifecycle.stable());
   }
}
