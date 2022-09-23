import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cii extends chx {
   public static final Codec<cii> b = RecordCodecBuilder.create($$0 -> $$0.group(aay.b(hm.aR).forGetter($$0x -> null)).apply($$0, $$0.stable(cii::new)));
   private final hc<cht> c;
   private final hc<cht> d;
   private final hc<cht> e;
   private final hc<cht> f;
   private final hc<cht> g;

   public cii(hm<cht> $$0) {
      this($$0.c(cia.ag), $$0.c(cia.ah), $$0.c(cia.ai), $$0.c(cia.aj), $$0.c(cia.ak));
   }

   private cii(hc<cht> $$0, hc<cht> $$1, hc<cht> $$2, hc<cht> $$3, hc<cht> $$4) {
      super(ImmutableList.of($$0, $$1, $$2, $$3, $$4));
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   @Override
   protected Codec<? extends chx> a() {
      return b;
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2, cic.f $$3) {
      int $$4 = hl.c($$0);
      int $$5 = hl.c($$1);
      int $$6 = hl.c($$2);
      int $$7 = hq.a($$4);
      int $$8 = hq.a($$6);
      if ((long)$$7 * (long)$$7 + (long)$$8 * (long)$$8 <= 4096L) {
         return this.c;
      } else {
         int $$9 = (hq.a($$4) * 2 + 1) * 8;
         int $$10 = (hq.a($$6) * 2 + 1) * 8;
         double $$11 = $$3.e().a(new dak.e($$9, $$5, $$10));
         if ($$11 > 0.25) {
            return this.d;
         } else if ($$11 >= -0.0625) {
            return this.e;
         } else {
            return $$11 < -0.21875 ? this.f : this.g;
         }
      }
   }
}
