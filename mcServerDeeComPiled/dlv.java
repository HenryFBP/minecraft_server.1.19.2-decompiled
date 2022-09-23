import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class dlv extends dly {
   public static final Codec<dlv> a = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dlv::new));
   private final int c;
   private final int d;
   private final int e;
   private final he<cht> f;

   private static P9<Mu<dlv>, hs, dly.c, Float, Integer, Optional<dly.a>, Integer, Integer, Integer, he<cht>> b(Instance<dlv> $$0) {
      P5<Mu<dlv>, hs, dly.c, Float, Integer, Optional<dly.a>> $$1 = a($$0);
      P4<Mu<dlv>, Integer, Integer, Integer, he<cht>> $$2 = $$0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(dlv::a),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(dlv::b),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(dlv::c),
         ho.a(hm.aR).fieldOf("preferred_biomes").forGetter(dlv::d)
      );
      return new P9($$1.t1(), $$1.t2(), $$1.t3(), $$1.t4(), $$1.t5(), $$2.t1(), $$2.t2(), $$2.t3(), $$2.t4());
   }

   public dlv(hs $$0, dly.c $$1, float $$2, int $$3, Optional<dly.a> $$4, int $$5, int $$6, int $$7, he<cht> $$8) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
      this.d = $$6;
      this.e = $$7;
      this.f = $$8;
   }

   public dlv(int $$0, int $$1, int $$2, he<cht> $$3) {
      this(hs.g, dly.c.a, 1.0F, 0, Optional.empty(), $$0, $$1, $$2, $$3);
   }

   public int a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public he<cht> d() {
      return this.f;
   }

   @Override
   protected boolean a(cxk $$0, dbf $$1, long $$2, int $$3, int $$4) {
      List<cge> $$5 = $$0.a(this, $$1);
      return $$5 == null ? false : $$5.contains(new cge($$3, $$4));
   }

   @Override
   public dlz<?> e() {
      return dlz.b;
   }
}
