import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dhu {
   public static final Codec<dhu> d = hm.by.p().dispatch(dhu::a, dhv::a);
   protected final azo e;
   protected final dhw f;
   protected final Optional<dhr> g;

   protected static <P extends dhu> P3<Mu<P>, azo, dhw, Optional<dhr>> a(Instance<P> $$0) {
      return $$0.group(
         azo.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dhw.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dhr.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dhu(azo $$0, dhw $$1, Optional<dhr> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dhv<?> a();

   public abstract boolean a(chd var1, BiConsumer<gt, cvo> var2, amn var3, gt var4, gt var5, dgt var6);

   protected boolean a(chd $$0, gt $$1) {
      return dff.d($$0, $$1);
   }

   protected void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt $$3, dgt $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dhr $$5 = (dhr)this.g.get();
            gt $$6 = $$3.b();
            if ($$2.i() < $$5.b() && $$0.a($$6, cvn.a::h)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }

      }
   }

   protected cvo a(chd $$0, gt $$1, cvo $$2) {
      if ($$2.b(cwe.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(akp.a));
         return $$2.a(cwe.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gt a(gt $$0, amn $$1) {
      return $$0.b(this.e.a($$1));
   }
}
