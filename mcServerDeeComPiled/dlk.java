import com.mojang.serialization.Codec;

public interface dlk<S extends dlb> {
   dlk<dmn> a = a("buried_treasure", dmn.d);
   dlk<dmp> b = a("desert_pyramid", dmp.d);
   dlk<dmr> c = a("end_city", dmr.d);
   dlk<dna> d = a("fortress", dna.e);
   dlk<dmt> e = a("igloo", dmt.d);
   dlk<dmu> f = a("jigsaw", dmu.e);
   dlk<dmw> g = a("jungle_temple", dmw.d);
   dlk<dmy> h = a("mineshaft", dmy.d);
   dlk<dnc> i = a("nether_fossil", dnc.d);
   dlk<dne> j = a("ocean_monument", dne.d);
   dlk<dng> k = a("ocean_ruin", dng.d);
   dlk<dni> l = a("ruined_portal", dni.d);
   dlk<dnk> m = a("shipwreck", dnk.d);
   dlk<dnm> n = a("stronghold", dnm.d);
   dlk<dno> o = a("swamp_hut", dno.d);
   dlk<dnq> p = a("woodland_mansion", dnq.d);

   Codec<S> codec();

   private static <S extends dlb> dlk<S> a(String $$0, Codec<S> $$1) {
      return hm.a(hm.bf, $$0, () -> $$1);
   }
}
