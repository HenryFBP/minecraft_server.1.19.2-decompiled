import com.mojang.serialization.Codec;

public interface azp<P extends azo> {
   azp<azl> a = a("constant", azl.b);
   azp<azu> b = a("uniform", azu.a);
   azp<azg> c = a("biased_to_bottom", azg.a);
   azp<azh> d = a("clamped", azh.a);
   azp<azv> e = a("weighted_list", azv.a);
   azp<azj> f = a("clamped_normal", azj.a);

   Codec<P> codec();

   static <P extends azo> azp<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.aE, $$0, () -> $$1);
   }
}
