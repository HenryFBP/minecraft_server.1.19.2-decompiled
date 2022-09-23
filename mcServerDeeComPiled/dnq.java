import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dnq extends dlb {
   public static final Codec<dnq> d = a(dnq::new);

   public dnq(dlb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dlb.b> a(dlb.a $$0) {
      cpw $$1 = cpw.a($$0.f());
      gt $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dlb.b($$2, (Consumer<dlt>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(dlt $$0, dlb.a $$1, gt $$2, cpw $$3) {
      List<dnp.i> $$4 = Lists.newLinkedList();
      dnp.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, dlq $$6) {
      gt.a $$7 = new gt.a();
      int $$8 = $$0.u_();
      dkt $$9 = $$6.b();
      int $$10 = $$9.h();

      for(int $$11 = $$4.g(); $$11 <= $$4.j(); ++$$11) {
         for(int $$12 = $$4.i(); $$12 <= $$4.l(); ++$$12) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.x($$7) && $$9.b($$7) && $$6.a($$7)) {
               for(int $$13 = $$10 - 1; $$13 > $$8; --$$13) {
                  $$7.q($$13);
                  if (!$$0.x($$7) && !$$0.a_($$7).d().a()) {
                     break;
                  }

                  $$0.a($$7, cju.m.m(), 2);
               }
            }
         }
      }

   }

   @Override
   public dlk<?> e() {
      return dlk.p;
   }
}
