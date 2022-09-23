import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgl implements dfx {
   public static final Codec<dgl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(dgf.a.a).fieldOf("targets").forGetter($$0x -> $$0x.b)).apply($$0, dgl::new)
   );
   public final List<dgf.a> b;

   public dgl(cvo $$0, cvo $$1) {
      this(ImmutableList.of(dgf.a(new dnz($$0), $$1)));
   }

   public dgl(List<dgf.a> $$0) {
      this.b = $$0;
   }
}
