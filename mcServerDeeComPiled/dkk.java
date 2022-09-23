import com.mojang.serialization.Codec;

public interface dkk<P extends dkj> {
   dkk<djv> a = a("block_predicate_filter", djv.a);
   dkk<dkm> b = a("rarity_filter", dkm.a);
   dkk<dko> c = a("surface_relative_threshold_filter", dko.a);
   dkk<dkp> d = a("surface_water_depth_filter", dkp.a);
   dkk<dju> e = a("biome", dju.a);
   dkk<djz> f = a("count", djz.a);
   dkk<dke> g = a("noise_based_count", dke.a);
   dkk<dkf> h = a("noise_threshold_count", dkf.a);
   dkk<djy> i = a("count_on_every_layer", djy.a);
   dkk<dka> j = a("environment_scan", dka.a);
   dkk<dkc> k = a("heightmap", dkc.a);
   dkk<dkb> l = a("height_range", dkb.a);
   dkk<dkd> m = a("in_square", dkd.a);
   dkk<dkl> n = a("random_offset", dkl.a);
   dkk<djw> o = a("carving_mask", djw.a);

   Codec<P> codec();

   private static <P extends dkj> dkk<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bh, $$0, () -> $$1);
   }
}
