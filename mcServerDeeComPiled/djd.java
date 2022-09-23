import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djd(hc<cat> c, djf d) {
   public static final Codec<djd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aaw.a(hm.k).fieldOf("display").forGetter($$0x -> $$0x.c), djf.a.fieldOf("settings").forGetter($$0x -> $$0x.d)).apply($$0, djd::new)
   );
   public static final Codec<hc<djd>> b = aav.a(hm.aV, a);

   public hc<cat> a() {
      return this.c;
   }

   public djf b() {
      return this.d;
   }
}
