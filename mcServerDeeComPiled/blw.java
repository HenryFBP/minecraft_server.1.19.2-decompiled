import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class blw extends bly<btp> {
   private static final int a = 40;

   public blw() {
      super(40);
   }

   protected void a(agg $$0, btp $$1) {
      aba<cgx> $$2 = $$0.ab();
      gt $$3 = $$1.da();
      List<hb> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for(int $$6 = -4; $$6 <= 4; ++$$6) {
         for(int $$7 = -2; $$7 <= 2; ++$$7) {
            for(int $$8 = -4; $$8 <= 4; ++$$8) {
               gt $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.fU().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(hb.a($$2, $$9));
               }
            }
         }
      }

      bcx<?> $$10 = $$1.dy();
      if (!$$4.isEmpty()) {
         $$10.a(bku.f, $$4);
      } else {
         $$10.b(bku.f);
      }

   }

   @Override
   public Set<bku<?>> a() {
      return ImmutableSet.of(bku.f);
   }
}
