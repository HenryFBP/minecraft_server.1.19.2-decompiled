import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bfz extends bdo<bcc> {
   public static final int a = 100;
   private long d;

   public bfz() {
      super(ImmutableMap.of(bku.b, bkv.a, bku.H, bkv.c));
   }

   @Override
   protected boolean a(agg $$0, bcc $$1) {
      if ($$1.bI()) {
         return false;
      } else {
         bcx<?> $$2 = $$1.dy();
         hb $$3 = (hb)$$2.c(bku.b).get();
         if ($$0.ab() != $$3.a()) {
            return false;
         } else {
            Optional<Long> $$4 = $$2.c(bku.H);
            if ($$4.isPresent()) {
               long $$5 = $$0.U() - $$4.get();
               if ($$5 > 0L && $$5 < 100L) {
                  return false;
               }
            }

            cvo $$6 = $$0.a_($$3.b());
            return $$3.b().a($$1.cY(), 2.0) && $$6.a(akl.N) && !$$6.c(cjm.b);
         }
      }
   }

   @Override
   protected boolean b(agg $$0, bcc $$1, long $$2) {
      Optional<hb> $$3 = $$1.dy().c(bku.b);
      if (!$$3.isPresent()) {
         return false;
      } else {
         gt $$4 = ((hb)$$3.get()).b();
         return $$1.dy().c(bvn.e) && $$1.dh() > (double)$$4.v() + 0.4 && $$4.a($$1.cY(), 1.14);
      }
   }

   @Override
   protected void a(agg $$0, bcc $$1, long $$2) {
      if ($$2 > this.d) {
         ben.a($$0, $$1, null, null);
         $$1.b(((hb)$$1.dy().c(bku.b).get()).b());
      }

   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   @Override
   protected void c(agg $$0, bcc $$1, long $$2) {
      if ($$1.fj()) {
         $$1.fk();
         this.d = $$2 + 40L;
      }

   }
}
