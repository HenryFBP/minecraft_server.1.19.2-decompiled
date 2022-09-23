import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class cvo extends cvn.a {
   public static final Codec<cvo> b = a(hm.V.p(), cjt::m).stable();

   public cvo(cjt $$0, ImmutableMap<cwr<?>, Comparable<?>> $$1, MapCodec<cvo> $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected cvo s() {
      return this;
   }
}
