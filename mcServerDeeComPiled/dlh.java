import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dlh(List<dlh.a> c, dly d) {
   public static final Codec<dlh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dlh.a.a.listOf().fieldOf("structures").forGetter(dlh::a), dly.b.fieldOf("placement").forGetter(dlh::b)).apply($$0, dlh::new)
   );
   public static final Codec<hc<dlh>> b = aav.a(hm.aO, a);

   public dlh(hc<dlb> $$0, dly $$1) {
      this(List.of(new dlh.a($$0, 1)), $$1);
   }

   public static dlh.a a(hc<dlb> $$0, int $$1) {
      return new dlh.a($$0, $$1);
   }

   public static dlh.a a(hc<dlb> $$0) {
      return new dlh.a($$0, 1);
   }

   public List<dlh.a> a() {
      return this.c;
   }

   public dly b() {
      return this.d;
   }

   public static record a(hc<dlb> b, int c) {
      public static final Codec<dlh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlb.b.fieldOf("structure").forGetter(dlh.a::a), alq.c.fieldOf("weight").forGetter(dlh.a::b)).apply($$0, dlh.a::new)
      );

      public hc<dlb> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
