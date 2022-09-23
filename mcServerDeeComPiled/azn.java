import com.mojang.serialization.Codec;

public interface azn<P extends azm> {
   azn<azk> a = a("constant", azk.b);
   azn<azt> b = a("uniform", azt.a);
   azn<azi> c = a("clamped_normal", azi.a);
   azn<azs> d = a("trapezoid", azs.a);

   Codec<P> codec();

   static <P extends azm> azn<P> a(String $$0, Codec<P> $$1) {
      return hm.a(hm.aC, $$0, () -> $$1);
   }
}
