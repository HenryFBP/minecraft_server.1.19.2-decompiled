import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class chx implements chw {
   public static final Codec<chx> a = hm.bB.p().dispatchStable(chx::a, Function.identity());
   private final Set<hc<cht>> b;

   protected chx(Stream<hc<cht>> $$0) {
      this($$0.distinct().toList());
   }

   protected chx(List<hc<cht>> $$0) {
      this.b = new ObjectLinkedOpenHashSet($$0);
   }

   protected abstract Codec<? extends chx> a();

   public Set<hc<cht>> b() {
      return this.b;
   }

   public Set<hc<cht>> a(int $$0, int $$1, int $$2, int $$3, cic.f $$4) {
      int $$5 = hl.a($$0 - $$3);
      int $$6 = hl.a($$1 - $$3);
      int $$7 = hl.a($$2 - $$3);
      int $$8 = hl.a($$0 + $$3);
      int $$9 = hl.a($$1 + $$3);
      int $$10 = hl.a($$2 + $$3);
      int $$11 = $$8 - $$5 + 1;
      int $$12 = $$9 - $$6 + 1;
      int $$13 = $$10 - $$7 + 1;
      Set<hc<cht>> $$14 = Sets.newHashSet();

      for(int $$15 = 0; $$15 < $$13; ++$$15) {
         for(int $$16 = 0; $$16 < $$11; ++$$16) {
            for(int $$17 = 0; $$17 < $$12; ++$$17) {
               int $$18 = $$5 + $$16;
               int $$19 = $$6 + $$17;
               int $$20 = $$7 + $$15;
               $$14.add(this.getNoiseBiome($$18, $$19, $$20, $$4));
            }
         }
      }

      return $$14;
   }

   @Nullable
   public Pair<gt, hc<cht>> a(int $$0, int $$1, int $$2, int $$3, Predicate<hc<cht>> $$4, amn $$5, cic.f $$6) {
      return this.a($$0, $$1, $$2, $$3, 1, $$4, $$5, false, $$6);
   }

   @Nullable
   public Pair<gt, hc<cht>> a(gt $$0, int $$1, int $$2, int $$3, Predicate<hc<cht>> $$4, cic.f $$5, cha $$6) {
      Set<hc<cht>> $$7 = (Set)this.b().stream().filter($$4).collect(Collectors.toUnmodifiableSet());
      if ($$7.isEmpty()) {
         return null;
      } else {
         int $$8 = Math.floorDiv($$1, $$2);
         int[] $$9 = ami.a($$0.v(), $$6.u_() + 1, $$6.ah(), $$3).toArray();

         for(gt.a $$10 : gt.a(gt.b, $$8, gy.f, gy.d)) {
            int $$11 = $$0.u() + $$10.u() * $$2;
            int $$12 = $$0.w() + $$10.w() * $$2;
            int $$13 = hl.a($$11);
            int $$14 = hl.a($$12);

            for(int $$15 : $$9) {
               int $$16 = hl.a($$15);
               hc<cht> $$17 = this.getNoiseBiome($$13, $$16, $$14, $$5);
               if ($$7.contains($$17)) {
                  return Pair.of(new gt($$11, $$15, $$12), $$17);
               }
            }
         }

         return null;
      }
   }

   @Nullable
   public Pair<gt, hc<cht>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hc<cht>> $$5, amn $$6, boolean $$7, cic.f $$8) {
      int $$9 = hl.a($$0);
      int $$10 = hl.a($$2);
      int $$11 = hl.a($$3);
      int $$12 = hl.a($$1);
      Pair<gt, hc<cht>> $$13 = null;
      int $$14 = 0;
      int $$15 = $$7 ? 0 : $$11;

      for(int $$16 = $$15; $$16 <= $$11; $$16 += $$4) {
         for(int $$17 = ab.am ? 0 : -$$16; $$17 <= $$16; $$17 += $$4) {
            boolean $$18 = Math.abs($$17) == $$16;

            for(int $$19 = -$$16; $$19 <= $$16; $$19 += $$4) {
               if ($$7) {
                  boolean $$20 = Math.abs($$19) == $$16;
                  if (!$$20 && !$$18) {
                     continue;
                  }
               }

               int $$21 = $$9 + $$19;
               int $$22 = $$10 + $$17;
               hc<cht> $$23 = this.getNoiseBiome($$21, $$12, $$22, $$8);
               if ($$5.test($$23)) {
                  if ($$13 == null || $$6.a($$14 + 1) == 0) {
                     gt $$24 = new gt(hl.c($$21), $$1, hl.c($$22));
                     if ($$7) {
                        return Pair.of($$24, $$23);
                     }

                     $$13 = Pair.of($$24, $$23);
                  }

                  ++$$14;
               }
            }
         }
      }

      return $$13;
   }

   @Override
   public abstract hc<cht> getNoiseBiome(int var1, int var2, int var3, cic.f var4);

   public void a(List<String> $$0, gt $$1, cic.f $$2) {
   }
}
