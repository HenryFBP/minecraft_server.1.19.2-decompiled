import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class beo extends bdo<bce> {
   private static final int a = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private gt h;
   private int i;
   private int j;
   private int k;

   public beo(float $$0) {
      super(ImmutableMap.of(bku.w, bkv.a, bku.m, bkv.b));
      this.g = $$0;
   }

   protected boolean a(agg $$0, bce $$1) {
      return $$1.y_() && this.b($$0, $$1);
   }

   protected void a(agg $$0, bce $$1, long $$2) {
      super.a($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.w.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(agg $$0, bce $$1, long $$2) {
      super.c($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(agg $$0, bce $$1, long $$2) {
      return $$1.y_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(agg $$0, bce $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         --this.i;
      } else if (this.k > 0) {
         --this.k;
      } else {
         if (this.d($$0, $$1)) {
            $$1.C().a();
            --this.j;
            this.k = 5;
         }

      }
   }

   private void a(bce $$0, gt $$1) {
      $$0.dy().a(bku.m, new bkx($$1, this.g, 0));
   }

   private boolean b(agg $$0, bce $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(agg $$0, bce $$1) {
      gt $$2 = $$1.da();
      gt $$3 = $$2.c();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(agg $$0, bce $$1) {
      return this.a($$0, $$1.da());
   }

   private boolean a(agg $$0, gt $$1) {
      return $$0.a_($$1).a(akl.N);
   }

   private Optional<gt> a(bce $$0) {
      return $$0.dy().c(bku.w);
   }

   private boolean e(agg $$0, bce $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(agg $$0, bce $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
