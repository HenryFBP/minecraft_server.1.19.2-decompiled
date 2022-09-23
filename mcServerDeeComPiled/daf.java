import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import javax.annotation.Nullable;

public final class daf {
   private static final BitSet c = new BitSet(0);
   private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
   private static final Codec<cxn> e = hm.ae
      .p()
      .comapFlatMap($$0 -> $$0 == cxn.c ? DataResult.error("target_status cannot be empty") : DataResult.success($$0), Function.identity());
   public static final Codec<daf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               e.fieldOf("target_status").forGetter(daf::a),
               d.optionalFieldOf("missing_bedrock").forGetter($$0x -> $$0x.h.isEmpty() ? Optional.empty() : Optional.of($$0x.h))
            )
            .apply($$0, daf::new)
   );
   private static final Set<aba<cht>> f = Set.of(cia.Z, cia.Y);
   public static final cgz b = new cgz() {
      @Override
      public int v_() {
         return 64;
      }

      @Override
      public int u_() {
         return -64;
      }
   };
   private final cxn g;
   private final BitSet h;

   private daf(cxn $$0, Optional<BitSet> $$1) {
      this.g = $$0;
      this.h = (BitSet)$$1.orElse(c);
   }

   @Nullable
   public static daf a(pj $$0) {
      cxn $$1 = cxn.a($$0.l("target_status"));
      return $$1 == cxn.c ? null : new daf($$1, Optional.of(BitSet.valueOf($$0.o("missing_bedrock"))));
   }

   public static void a(cyc $$0) {
      int $$1 = 4;
      gt.b(0, 0, 0, 15, 4, 15).forEach($$1x -> {
         if ($$0.a_($$1x).a(cju.B)) {
            $$0.a($$1x, cju.qr.m(), false);
         }

      });
   }

   public void b(cyc $$0) {
      cgz $$1 = $$0.z();
      int $$2 = $$1.u_();
      int $$3 = $$1.ah() - 1;

      for(int $$4 = 0; $$4 < 16; ++$$4) {
         for(int $$5 = 0; $$5 < 16; ++$$5) {
            if (this.a($$4, $$5)) {
               gt.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1x -> $$0.a($$1x, cju.a.m(), false));
            }
         }
      }

   }

   public cxn a() {
      return this.g;
   }

   public boolean b() {
      return !this.h.isEmpty();
   }

   public boolean a(int $$0, int $$1) {
      return this.h.get(($$1 & 15) * 16 + ($$0 & 15));
   }

   public static chw a(chw $$0, cxj $$1) {
      if (!$$1.y()) {
         return $$0;
      } else {
         Predicate<aba<cht>> $$2 = f::contains;
         return ($$3, $$4, $$5, $$6) -> {
            hc<cht> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            return $$7.a($$2) ? $$7 : $$1.getNoiseBiome($$3, 0, $$5);
         };
      }
   }
}
