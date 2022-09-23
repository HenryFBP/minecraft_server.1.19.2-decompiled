import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bez extends bdo<bce> {
   private static final int a = 40;
   private int d;
   @Nullable
   private dql e;
   @Nullable
   private gt f;
   private float g;

   public bez() {
      this(150, 250);
   }

   public bez(int $$0, int $$1) {
      super(ImmutableMap.of(bku.E, bkv.c, bku.t, bkv.b, bku.m, bkv.a), $$0, $$1);
   }

   protected boolean a(agg $$0, bce $$1) {
      if (this.d > 0) {
         --this.d;
         return false;
      } else {
         bcx<?> $$2 = $$1.dy();
         bkx $$3 = (bkx)$$2.c(bku.m).get();
         boolean $$4 = this.a($$1, $$3);
         if (!$$4 && this.a($$1, $$3, $$0.U())) {
            this.f = $$3.a().b();
            return true;
         } else {
            $$2.b(bku.m);
            if ($$4) {
               $$2.b(bku.E);
            }

            return false;
         }
      }
   }

   protected boolean a(agg $$0, bce $$1, long $$2) {
      if (this.e != null && this.f != null) {
         Optional<bkx> $$3 = $$1.dy().c(bku.m);
         blc $$4 = $$1.D();
         return !$$4.l() && $$3.isPresent() && !this.a($$1, (bkx)$$3.get());
      } else {
         return false;
      }
   }

   protected void b(agg $$0, bce $$1, long $$2) {
      if ($$1.dy().a(bku.m) && !this.a($$1, (bkx)$$1.dy().c(bku.m).get()) && $$1.D().s()) {
         this.d = $$0.r_().a(40);
      }

      $$1.D().n();
      $$1.dy().b(bku.m);
      $$1.dy().b(bku.t);
      this.e = null;
   }

   protected void c(agg $$0, bce $$1, long $$2) {
      $$1.dy().a(bku.t, this.e);
      $$1.D().a(this.e, (double)this.g);
   }

   protected void d(agg $$0, bce $$1, long $$2) {
      dql $$3 = $$1.D().j();
      bcx<?> $$4 = $$1.dy();
      if (this.e != $$3) {
         this.e = $$3;
         $$4.a(bku.t, $$3);
      }

      if ($$3 != null && this.f != null) {
         bkx $$5 = (bkx)$$4.c(bku.m).get();
         if ($$5.a().b().j(this.f) > 4.0 && this.a($$1, $$5, $$0.U())) {
            this.f = $$5.a().b();
            this.c($$0, $$1, $$2);
         }

      }
   }

   private boolean a(bce $$0, bkx $$1, long $$2) {
      gt $$3 = $$1.a().b();
      this.e = $$0.D().a($$3, 0);
      this.g = $$1.b();
      bcx<?> $$4 = $$0.dy();
      if (this.a($$0, $$1)) {
         $$4.b(bku.E);
      } else {
         boolean $$5 = this.e != null && this.e.j();
         if ($$5) {
            $$4.b(bku.E);
         } else if (!$$4.a(bku.E)) {
            $$4.a(bku.E, $$2);
         }

         if (this.e != null) {
            return true;
         }

         dwq $$6 = bmj.a((bcl)$$0, 10, 7, dwq.c($$3), (float) (Math.PI / 2));
         if ($$6 != null) {
            this.e = $$0.D().a($$6.c, $$6.d, $$6.e, 0);
            return this.e != null;
         }
      }

      return false;
   }

   private boolean a(bce $$0, bkx $$1) {
      return $$1.a().b().k($$0.da()) <= $$1.c();
   }
}
