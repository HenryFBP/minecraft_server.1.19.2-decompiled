import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dmi {
   public static final Codec<dmi> e = hm.bH.p().dispatch("element_type", dmi::a, dmj::codec);
   @Nullable
   private volatile dmk.a a;

   protected static <E extends dmi> RecordCodecBuilder<E, dmk.a> d() {
      return dmk.a.c.fieldOf("projection").forGetter(dmi::e);
   }

   protected dmi(dmk.a $$0) {
      this.a = $$0;
   }

   public abstract hs a(dou var1, cpw var2);

   public abstract List<dot.c> a(dou var1, gt var2, cpw var3, amn var4);

   public abstract dkt a(dou var1, gt var2, cpw var3);

   public abstract boolean a(dou var1, chp var2, cho var3, cxk var4, gt var5, gt var6, cpw var7, dkt var8, amn var9, boolean var10);

   public abstract dmj<?> a();

   public void a(cgy $$0, dot.c $$1, gt $$2, cpw $$3, amn $$4, dkt $$5) {
   }

   public dmi a(dmk.a $$0) {
      this.a = $$0;
      return this;
   }

   public dmk.a e() {
      dmk.a $$0 = this.a;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dmk.a, dmb> g() {
      return $$0 -> dmb.b;
   }

   public static Function<dmk.a, dmf> a(String $$0) {
      return $$1 -> new dmf(Either.left(new abb($$0)), mn.a, $$1);
   }

   public static Function<dmk.a, dmf> a(String $$0, hc<dor> $$1) {
      return $$2 -> new dmf(Either.left(new abb($$0)), $$1, $$2);
   }

   public static Function<dmk.a, dmh> b(String $$0) {
      return $$1 -> new dmh(Either.left(new abb($$0)), mn.a, $$1);
   }

   public static Function<dmk.a, dmh> b(String $$0, hc<dor> $$1) {
      return $$2 -> new dmh(Either.left(new abb($$0)), $$1, $$2);
   }

   public static Function<dmk.a, dmc> a(hc<dkg> $$0) {
      return $$1 -> new dmc($$0, $$1);
   }

   public static Function<dmk.a, dmg> a(List<Function<dmk.a, ? extends dmi>> $$0) {
      return $$1 -> new dmg((List<dmi>)$$0.stream().map($$1x -> (dmi)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
