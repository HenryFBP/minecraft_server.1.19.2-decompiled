import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bgq extends bdo<btp> {
   private static final int a = 80;
   private long d;
   private long e;
   private int f;
   private Optional<gt> g = Optional.empty();

   public bgq() {
      super(ImmutableMap.of(bku.n, bkv.b, bku.m, bkv.b));
   }

   protected boolean a(agg $$0, btp $$1) {
      if ($$1.S % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.S)) {
         if ($$1.t().a_(caz.pH) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(agg $$0, btp $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<gt> b(agg $$0, btp $$1) {
      gt.a $$2 = new gt.a();
      Optional<gt> $$3 = Optional.empty();
      int $$4 = 0;

      for(int $$5 = -1; $$5 <= 1; ++$$5) {
         for(int $$6 = -1; $$6 <= 1; ++$$6) {
            for(int $$7 = -1; $$7 <= 1; ++$$7) {
               $$2.a($$1.da(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  ++$$4;
                  if ($$0.w.a($$4) == 0) {
                     $$3 = Optional.of($$2.h());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(gt $$0, agg $$1) {
      cvo $$2 = $$1.a_($$0);
      cjt $$3 = $$2.b();
      return $$3 instanceof clf && !((clf)$$3).h($$2);
   }

   protected void b(agg $$0, btp $$1, long $$2) {
      this.a($$1);
      $$1.a(bbs.a, new cax(caz.pH));
      this.d = $$2;
      this.f = 0;
   }

   private void a(btp $$0) {
      this.g.ifPresent($$1 -> {
         bdq $$2 = new bdq($$1);
         $$0.dy().a(bku.n, $$2);
         $$0.dy().a(bku.m, new bkx($$2, 0.5F, 1));
      });
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      $$1.a(bbs.a, cax.b);
      this.e = (long)$$1.S;
   }

   protected void d(agg $$0, btp $$1, long $$2) {
      gt $$3 = (gt)this.g.get();
      if ($$2 >= this.d && $$3.a($$1.cY(), 1.0)) {
         cax $$4 = cax.b;
         bao $$5 = $$1.t();
         int $$6 = $$5.b();

         for(int $$7 = 0; $$7 < $$6; ++$$7) {
            cax $$8 = $$5.a($$7);
            if ($$8.a(caz.pH)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && byz.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         ++this.f;
      }
   }
}
