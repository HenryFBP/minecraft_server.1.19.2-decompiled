import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ddy implements dfx {
   public static final Codec<ddy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               abb.a.listOf().fieldOf("fossil_structures").forGetter($$0x -> $$0x.b),
               abb.a.listOf().fieldOf("overlay_structures").forGetter($$0x -> $$0x.c),
               dos.n.fieldOf("fossil_processors").forGetter($$0x -> $$0x.d),
               dos.n.fieldOf("overlay_processors").forGetter($$0x -> $$0x.e),
               Codec.intRange(0, 7).fieldOf("max_empty_corners_allowed").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ddy::new)
   );
   public final List<abb> b;
   public final List<abb> c;
   public final hc<dor> d;
   public final hc<dor> e;
   public final int f;

   public ddy(List<abb> $$0, List<abb> $$1, hc<dor> $$2, hc<dor> $$3, int $$4) {
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Fossil structure lists need at least one entry");
      } else if ($$0.size() != $$1.size()) {
         throw new IllegalArgumentException("Fossil structure lists must be equal lengths");
      } else {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
      }
   }
}
