import com.mojang.serialization.Codec;

public interface dmj<P extends dmi> {
   dmj<dmh> a = a("single_pool_element", dmh.b);
   dmj<dmg> b = a("list_pool_element", dmg.a);
   dmj<dmc> c = a("feature_pool_element", dmc.a);
   dmj<dmb> d = a("empty_pool_element", dmb.a);
   dmj<dmf> e = a("legacy_single_pool_element", dmf.a);

   Codec<P> codec();

   static <P extends dmi> dmj<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bH, $$0, () -> $$1);
   }
}
