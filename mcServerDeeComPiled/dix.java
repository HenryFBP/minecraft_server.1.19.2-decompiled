import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class dix extends diy {
   public static final Codec<dix> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dix::new));

   public dix(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected diz<?> a() {
      return diz.a;
   }

   @Override
   public List<dhi.a> a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, int $$3, gt $$4, dgt $$5) {
      a($$0, $$1, $$2, $$4.c(), $$5);

      for(int $$6 = 0; $$6 < $$3; ++$$6) {
         this.b($$0, $$1, $$2, $$4.b($$6), $$5);
      }

      return ImmutableList.of(new dhi.a($$4.b($$3), 0, false));
   }
}
