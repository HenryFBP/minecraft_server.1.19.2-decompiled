import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.slf4j.Logger;

public class dmk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = Integer.MIN_VALUE;
   public static final Codec<dmk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               abb.a.fieldOf("name").forGetter(dmk::b),
               abb.a.fieldOf("fallback").forGetter(dmk::a),
               Codec.mapPair(dmi.e.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight"))
                  .codec()
                  .listOf()
                  .fieldOf("elements")
                  .forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dmk::new)
   );
   public static final Codec<hc<dmk>> b = aav.a(hm.aQ, a);
   private final abb e;
   private final List<Pair<dmi, Integer>> f;
   private final ObjectArrayList<dmi> g;
   private final abb h;
   private int i = Integer.MIN_VALUE;

   public dmk(abb $$0, abb $$1, List<Pair<dmi, Integer>> $$2) {
      this.e = $$0;
      this.f = $$2;
      this.g = new ObjectArrayList();

      for(Pair<dmi, Integer> $$3 : $$2) {
         dmi $$4 = (dmi)$$3.getFirst();

         for(int $$5 = 0; $$5 < $$3.getSecond(); ++$$5) {
            this.g.add($$4);
         }
      }

      this.h = $$1;
   }

   public dmk(abb $$0, abb $$1, List<Pair<Function<dmk.a, ? extends dmi>, Integer>> $$2, dmk.a $$3) {
      this.e = $$0;
      this.f = Lists.newArrayList();
      this.g = new ObjectArrayList();

      for(Pair<Function<dmk.a, ? extends dmi>, Integer> $$4 : $$2) {
         dmi $$5 = (dmi)((Function)$$4.getFirst()).apply($$3);
         this.f.add(Pair.of($$5, (Integer)$$4.getSecond()));

         for(int $$6 = 0; $$6 < $$4.getSecond(); ++$$6) {
            this.g.add($$5);
         }
      }

      this.h = $$1;
   }

   public int a(dou $$0) {
      if (this.i == Integer.MIN_VALUE) {
         this.i = this.g.stream().filter($$0x -> $$0x != dmb.b).mapToInt($$1 -> $$1.a($$0, gt.b, cpw.a).d()).max().orElse(0);
      }

      return this.i;
   }

   public abb a() {
      return this.h;
   }

   public dmi a(amn $$0) {
      return (dmi)this.g.get($$0.a(this.g.size()));
   }

   public List<dmi> b(amn $$0) {
      return ad.a(this.g, $$0);
   }

   public abb b() {
      return this.e;
   }

   public int c() {
      return this.g.size();
   }

   public static enum a implements amw {
      a("terrain_matching", ImmutableList.of(new doa(dar.a.a, -1))),
      b("rigid", ImmutableList.of());

      public static final amw.a<dmk.a> c = amw.a(dmk.a::values);
      private final String d;
      private final ImmutableList<doq> e;

      private a(String $$0, ImmutableList<doq> $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public String a() {
         return this.d;
      }

      public static dmk.a a(String $$0) {
         return (dmk.a)c.a($$0);
      }

      public ImmutableList<doq> b() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
