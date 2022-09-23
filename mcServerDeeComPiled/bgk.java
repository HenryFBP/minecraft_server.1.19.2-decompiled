import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class bgk extends bdo<btp> {
   private static final int a = 5;
   private static final float d = 0.5F;
   private Set<cat> e = ImmutableSet.of();

   public bgk() {
      super(ImmutableMap.of(bku.q, bkv.a, bku.h, bkv.a));
   }

   protected boolean a(agg $$0, btp $$1) {
      return bdp.a($$1.dy(), bku.q, bbr.aZ);
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      btp $$3 = (btp)$$1.dy().c(bku.q).get();
      bdp.a($$1, $$3, 0.5F);
      this.e = a($$1, $$3);
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      btp $$3 = (btp)$$1.dy().c(bku.q).get();
      if (!($$1.f($$3) > 5.0)) {
         bdp.a($$1, $$3, 0.5F);
         $$1.a($$0, $$3, $$2);
         if ($$1.gc() && ($$1.fU().b() == bts.g || $$3.gd())) {
            a($$1, btp.ca.keySet(), $$3);
         }

         if ($$3.fU().b() == bts.g && $$1.t().a_(caz.nS) > caz.nS.m() / 2) {
            a($$1, ImmutableSet.of(caz.nS), $$3);
         }

         if (!this.e.isEmpty() && $$1.t().a(this.e)) {
            a($$1, this.e, $$3);
         }

      }
   }

   protected void d(agg $$0, btp $$1, long $$2) {
      $$1.dy().b(bku.q);
   }

   private static Set<cat> a(btp $$0, btp $$1) {
      ImmutableSet<cat> $$2 = $$1.fU().b().d();
      ImmutableSet<cat> $$3 = $$0.fU().b().d();
      return (Set<cat>)$$2.stream().filter($$1x -> !$$3.contains($$1x)).collect(Collectors.toSet());
   }

   private static void a(btp $$0, Set<cat> $$1, bcc $$2) {
      bao $$3 = $$0.t();
      cax $$4 = cax.b;
      int $$5 = 0;

      while($$5 < $$3.b()) {
         cax $$6;
         cat $$7;
         int $$8;
         label28: {
            $$6 = $$3.a($$5);
            if (!$$6.b()) {
               $$7 = $$6.c();
               if ($$1.contains($$7)) {
                  if ($$6.K() > $$6.f() / 2) {
                     $$8 = $$6.K() / 2;
                     break label28;
                  }

                  if ($$6.K() > 24) {
                     $$8 = $$6.K() - 24;
                     break label28;
                  }
               }
            }

            ++$$5;
            continue;
         }

         $$6.g($$8);
         $$4 = new cax($$7, $$8);
         break;
      }

      if (!$$4.b()) {
         bdp.a($$0, $$4, $$2.cY());
      }

   }
}
