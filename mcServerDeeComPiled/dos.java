import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public interface dos<P extends doq> {
   dos<dnw> a = a("block_ignore", dnw.a);
   dos<dny> b = a("block_rot", dny.a);
   dos<doa> c = a("gravity", doa.a);
   dos<dob> d = a("jigsaw_replacement", dob.a);
   dos<dom> e = a("rule", dom.a);
   dos<doe> f = a("nop", doe.a);
   dos<dnv> g = a("block_age", dnv.a);
   dos<dnu> h = a("blackstone_replace", dnu.a);
   dos<doc> i = a("lava_submerged_block", doc.a);
   dos<doj> j = a("protected_blocks", doj.b);
   Codec<doq> k = hm.bG.p().dispatch("processor_type", doq::a, dos::codec);
   Codec<dor> l = k.listOf().xmap(dor::new, dor::a);
   Codec<dor> m = Codec.either(l.fieldOf("processors").codec(), l).xmap($$0 -> (dor)$$0.map($$0x -> $$0x, $$0x -> $$0x), Either::left);
   Codec<hc<dor>> n = aav.a(hm.aP, m);

   Codec<P> codec();

   static <P extends doq> dos<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.bG, $$0, () -> $$1);
   }
}
