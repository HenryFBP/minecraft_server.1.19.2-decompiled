import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.slf4j.Logger;

public class djf {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<djf> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aay.b(hm.aR).forGetter($$0x -> $$0x.c),
                  ho.a(hm.aO).optionalFieldOf("structure_overrides").forGetter($$0x -> $$0x.d),
                  djc.a.listOf().fieldOf("layers").forGetter(djf::e),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter($$0x -> $$0x.j),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter($$0x -> $$0x.i),
                  cht.c.optionalFieldOf("biome").orElseGet(Optional::empty).forGetter($$0x -> Optional.of($$0x.f))
               )
               .apply($$0, djf::new)
      )
      .comapFlatMap(djf::a, Function.identity())
      .stable();
   private final hm<cht> c;
   private final Optional<he<dlh>> d;
   private final List<djc> e = Lists.newArrayList();
   private hc<cht> f;
   private final List<cvo> g;
   private boolean h;
   private boolean i;
   private boolean j;

   private static DataResult<djf> a(djf $$0) {
      int $$1 = $$0.e.stream().mapToInt(djc::a).sum();
      return $$1 > cyu.c ? DataResult.error("Sum of layer heights is > " + cyu.c, $$0) : DataResult.success($$0);
   }

   private djf(hm<cht> $$0, Optional<he<dlh>> $$1, List<djc> $$2, boolean $$3, boolean $$4, Optional<hc<cht>> $$5) {
      this($$1, $$0);
      if ($$3) {
         this.b();
      }

      if ($$4) {
         this.a();
      }

      this.e.addAll($$2);
      this.g();
      if ($$5.isEmpty()) {
         b.error("Unknown biome, defaulting to plains");
         this.f = $$0.c(cia.b);
      } else {
         this.f = (hc)$$5.get();
      }

   }

   public djf(Optional<he<dlh>> $$0, hm<cht> $$1) {
      this.c = $$1;
      this.d = $$0;
      this.f = $$1.c(cia.b);
      this.g = Lists.newArrayList();
   }

   public djf a(List<djc> $$0, Optional<he<dlh>> $$1) {
      djf $$2 = new djf($$1, this.c);

      for(djc $$3 : $$0) {
         $$2.e.add(new djc($$3.a(), $$3.b().b()));
         $$2.g();
      }

      $$2.b(this.f);
      if (this.i) {
         $$2.a();
      }

      if (this.j) {
         $$2.b();
      }

      return $$2;
   }

   public void a() {
      this.i = true;
   }

   public void b() {
      this.j = true;
   }

   public chu a(hc<cht> $$0) {
      if (!$$0.equals(this.f)) {
         return $$0.a().e();
      } else {
         chu $$1 = this.d().a().e();
         chu.a $$2 = new chu.a();
         if (this.j) {
            $$2.a(dan.b.b, nq.g);
            $$2.a(dan.b.b, nq.h);
         }

         boolean $$3 = (!this.h || $$0.a(cia.a)) && this.i;
         if ($$3) {
            List<he<dkg>> $$4 = $$1.b();

            for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
               if ($$5 != dan.b.d.ordinal() && $$5 != dan.b.e.ordinal()) {
                  for(hc<dkg> $$7 : (he)$$4.get($$5)) {
                     $$2.a($$5, $$7);
                  }
               }
            }
         }

         List<cvo> $$8 = this.f();

         for(int $$9 = 0; $$9 < $$8.size(); ++$$9) {
            cvo $$10 = (cvo)$$8.get($$9);
            if (!dar.a.e.e().test($$10)) {
               $$8.set($$9, null);
               $$2.a(dan.b.k, nt.a(ddt.ac, new dgb($$9, $$10)));
            }
         }

         return $$2.a();
      }
   }

   public Optional<he<dlh>> c() {
      return this.d;
   }

   public hc<cht> d() {
      return this.f;
   }

   public void b(hc<cht> $$0) {
      this.f = $$0;
   }

   public List<djc> e() {
      return this.e;
   }

   public List<cvo> f() {
      return this.g;
   }

   public void g() {
      this.g.clear();

      for(djc $$0 : this.e) {
         for(int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            this.g.add($$0.b());
         }
      }

      this.h = this.g.stream().allMatch($$0x -> $$0x.a(cju.a));
   }

   public static djf a(hm<cht> $$0, hm<dlh> $$1) {
      he<dlh> $$2 = he.a($$1.h(dku.r), $$1.h(dku.a));
      djf $$3 = new djf(Optional.of($$2), $$0);
      $$3.f = $$0.c(cia.b);
      $$3.e().add(new djc(1, cju.B));
      $$3.e().add(new djc(2, cju.j));
      $$3.e().add(new djc(1, cju.i));
      $$3.g();
      return $$3;
   }
}
