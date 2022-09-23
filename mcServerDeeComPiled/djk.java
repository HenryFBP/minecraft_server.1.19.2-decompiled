import com.mojang.serialization.Codec;

public interface djk<P extends djj> {
   djk<dji> a = a("constant", dji.b);
   djk<djm> b = a("uniform", djm.a);
   djk<djh> c = a("biased_to_bottom", djh.a);
   djk<djn> d = a("very_biased_to_bottom", djn.a);
   djk<djl> e = a("trapezoid", djl.a);
   djk<djo> f = a("weighted_list", djo.a);

   Codec<P> codec();

   private static <P extends djj> djk<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.aG, $$0, () -> $$1);
   }
}
