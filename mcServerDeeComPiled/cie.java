import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cie extends chx implements chv.a {
   public static final Codec<cie> b = cht.c.fieldOf("biome").xmap(cie::new, $$0 -> $$0.c).stable().codec();
   private final hc<cht> c;

   public cie(hc<cht> $$0) {
      super(ImmutableList.of($$0));
      this.c = $$0;
   }

   @Override
   protected Codec<? extends chx> a() {
      return b;
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2, cic.f $$3) {
      return this.c;
   }

   @Override
   public hc<cht> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gt, hc<cht>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hc<cht>> $$5, amn $$6, boolean $$7, cic.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gt($$0, $$1, $$2), this.c) : Pair.of(new gt($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gt, hc<cht>> a(gt $$0, int $$1, int $$2, int $$3, Predicate<hc<cht>> $$4, cic.f $$5, cha $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<hc<cht>> a(int $$0, int $$1, int $$2, int $$3, cic.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
