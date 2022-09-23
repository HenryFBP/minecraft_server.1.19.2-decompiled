import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiConsumer;

public class div extends diy {
   public static final Codec<div> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, div::new));

   public div(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected diz<?> a() {
      return diz.c;
   }

   @Override
   public List<dhi.a> a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, int $$3, gt $$4, dgt $$5) {
      gt $$6 = $$4.c();
      a($$0, $$1, $$2, $$6, $$5);
      a($$0, $$1, $$2, $$6.g(), $$5);
      a($$0, $$1, $$2, $$6.e(), $$5);
      a($$0, $$1, $$2, $$6.e().g(), $$5);
      gt.a $$7 = new gt.a();

      for(int $$8 = 0; $$8 < $$3; ++$$8) {
         this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 0);
         if ($$8 < $$3 - 1) {
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 0);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 1, $$8, 1);
            this.a($$0, $$1, $$2, $$7, $$5, $$4, 0, $$8, 1);
         }
      }

      return ImmutableList.of(new dhi.a($$4.b($$3), 0, true));
   }

   private void a(chd $$0, BiConsumer<gt, cvo> $$1, amn $$2, gt.a $$3, dgt $$4, gt $$5, int $$6, int $$7, int $$8) {
      $$3.a($$5, $$6, $$7, $$8);
      this.a($$0, $$1, $$2, $$3, $$4);
   }
}
