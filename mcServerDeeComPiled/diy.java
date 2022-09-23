import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public abstract class diy {
   public static final Codec<diy> c = hm.bx.p().dispatch(diy::a, diz::a);
   private static final int a = 32;
   private static final int b = 24;
   public static final int d = 80;
   protected final int e;
   protected final int f;
   protected final int g;

   protected static <P extends diy> P3<Mu<P>, Integer, Integer, Integer> a(Instance<P> $$0) {
      return $$0.group(
         Codec.intRange(0, 32).fieldOf("base_height").forGetter($$0x -> $$0x.e),
         Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter($$0x -> $$0x.f),
         Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter($$0x -> $$0x.g)
      );
   }

   public diy(int $$0, int $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract diz<?> a();

   public abstract List<dhi.a> a(chd var1, BiConsumer<gt, cvo> var2, amn var3, int var4, gt var5, dgt var6);

   public int a(amn $$0) {
      return this.e + $$0.a(this.f + 1) + $$0.a(this.g + 1);
   }

   private static boolean c(chd $$0, gt $$1) {
      return $$0.a($$1, $$0x -> ddt.b($$0x) && !$$0x.a(cju.i) && !$$0x.a(cju.es));
   }

   protected static void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, dgt $$4) {
      if ($$4.k || !c($$0, $$3)) {
         $$1.accept($$3, $$4.c.a($$2, $$3));
      }

   }

   protected boolean b(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, dgt $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4, Function.identity());
   }

   protected boolean a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, dgt $$4, Function<cvo, cvo> $$5) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, (cvo)$$5.apply($$4.b.a($$2, $$3)));
         return true;
      } else {
         return false;
      }
   }

   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt.a $$3, dgt $$4) {
      if (this.b($$0, $$3)) {
         this.b($$0, $$1, $$2, $$3, $$4);
      }

   }

   protected boolean a(chd $$0, gt $$1) {
      return dff.d($$0, $$1);
   }

   public boolean b(chd $$0, gt $$1) {
      return this.a($$0, $$1) || $$0.a($$1, $$0x -> $$0x.a(akl.s));
   }
}
