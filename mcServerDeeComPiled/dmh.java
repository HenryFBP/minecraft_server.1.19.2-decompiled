import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dmh extends dmi {
   private static final Codec<Either<abb, dot>> a = Codec.of(dmh::a, abb.a.map(Either::left));
   public static final Codec<dmh> b = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dmh::new));
   protected final Either<abb, dot> c;
   protected final hc<dor> d;

   private static <T> DataResult<T> a(Either<abb, dot> $$0, DynamicOps<T> $$1, T $$2) {
      Optional<abb> $$3 = $$0.left();
      return !$$3.isPresent() ? DataResult.error("Can not serialize a runtime pool element") : abb.a.encode((abb)$$3.get(), $$1, $$2);
   }

   protected static <E extends dmh> RecordCodecBuilder<E, hc<dor>> b() {
      return dos.n.fieldOf("processors").forGetter($$0 -> $$0.d);
   }

   protected static <E extends dmh> RecordCodecBuilder<E, Either<abb, dot>> c() {
      return a.fieldOf("location").forGetter($$0 -> $$0.c);
   }

   protected dmh(Either<abb, dot> $$0, hc<dor> $$1, dmk.a $$2) {
      super($$2);
      this.c = $$0;
      this.d = $$1;
   }

   public dmh(dot $$0) {
      this(Either.right($$0), mn.a, dmk.a.b);
   }

   @Override
   public hs a(dou $$0, cpw $$1) {
      dot $$2 = this.a($$0);
      return $$2.a($$1);
   }

   private dot a(dou $$0) {
      return (dot)this.c.map($$0::a, Function.identity());
   }

   public List<dot.c> a(dou $$0, gt $$1, cpw $$2, boolean $$3) {
      dot $$4 = this.a($$0);
      List<dot.c> $$5 = $$4.a($$1, new dop().a($$2), cju.nL, $$3);
      List<dot.c> $$6 = Lists.newArrayList();

      for(dot.c $$7 : $$5) {
         if ($$7.c != null) {
            cwx $$8 = cwx.valueOf($$7.c.l("mode"));
            if ($$8 == cwx.d) {
               $$6.add($$7);
            }
         }
      }

      return $$6;
   }

   @Override
   public List<dot.c> a(dou $$0, gt $$1, cpw $$2, amn $$3) {
      dot $$4 = this.a($$0);
      ObjectArrayList<dot.c> $$5 = $$4.a($$1, new dop().a($$2), cju.nM, true);
      ad.b($$5, $$3);
      return $$5;
   }

   @Override
   public dkt a(dou $$0, gt $$1, cpw $$2) {
      dot $$3 = this.a($$0);
      return $$3.b(new dop().a($$2), $$1);
   }

   @Override
   public boolean a(dou $$0, chp $$1, cho $$2, cxk $$3, gt $$4, gt $$5, cpw $$6, dkt $$7, amn $$8, boolean $$9) {
      dot $$10 = this.a($$0);
      dop $$11 = this.a($$6, $$7, $$9);
      if (!$$10.a($$1, $$4, $$5, $$11, $$8, 18)) {
         return false;
      } else {
         for(dot.c $$13 : dot.a($$1, $$4, $$5, $$11, this.a($$0, $$4, $$6, false))) {
            this.a($$1, $$13, $$4, $$6, $$8, $$7);
         }

         return true;
      }
   }

   protected dop a(cpw $$0, dkt $$1, boolean $$2) {
      dop $$3 = new dop();
      $$3.a($$1);
      $$3.a($$0);
      $$3.c(true);
      $$3.a(false);
      $$3.a(dnw.b);
      $$3.d(true);
      if (!$$2) {
         $$3.a(dob.b);
      }

      this.d.a().a().forEach($$3::a);
      this.e().b().forEach($$3::a);
      return $$3;
   }

   @Override
   public dmj<?> a() {
      return dmj.a;
   }

   public String toString() {
      return "Single[" + this.c + "]";
   }
}
