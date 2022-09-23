import com.mojang.serialization.Codec;

public interface dbx<P extends dbw> {
   dbx<dcc> a = a("matching_blocks", dcc.a);
   dbx<dcb> b = a("matching_block_tag", dcb.e);
   dbx<dcd> c = a("matching_fluids", dcd.a);
   dbx<dbz> d = a("has_sturdy_face", dbz.a);
   dbx<dcg> e = a("solid", dcg.a);
   dbx<dcf> f = a("replaceable", dcf.a);
   dbx<dcj> g = a("would_survive", dcj.a);
   dbx<dca> h = a("inside_world_bounds", dca.a);
   dbx<dbv> i = a("any_of", dbv.a);
   dbx<dbu> j = a("all_of", dbu.a);
   dbx<dce> k = a("not", dce.a);
   dbx<dci> l = a("true", dci.e);

   Codec<P> codec();

   private static <P extends dbw> dbx<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.aI, $$0, () -> $$1);
   }
}
