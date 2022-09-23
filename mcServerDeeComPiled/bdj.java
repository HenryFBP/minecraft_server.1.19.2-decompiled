import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bdj extends bdo<bcl> {
   private static final int a = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;

   public bdj(float $$0) {
      super(ImmutableMap.of(bku.X, bkv.c, bku.x, bkv.a), 100, 120);
      this.g = $$0;
   }

   protected boolean a(agg $$0, bcl $$1, long $$2) {
      return true;
   }

   protected void b(agg $$0, bcl $$1, long $$2) {
      $$1.dy().a(bku.X, true);
      $$1.dy().b(bku.m);
   }

   protected void c(agg $$0, bcl $$1, long $$2) {
      bcx<?> $$3 = $$1.dy();
      $$3.b(bku.X);
   }

   protected void d(agg $$0, bcl $$1, long $$2) {
      if ($$1.D().l()) {
         dwq $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dy().a(bku.m, new bkx($$3, this.g, 0));
         }
      }

   }

   @Nullable
   private dwq a(bcl $$0, agg $$1) {
      if ($$0.bH()) {
         Optional<dwq> $$2 = this.a($$1, $$0).map(dwq::c);
         if ($$2.isPresent()) {
            return (dwq)$$2.get();
         }
      }

      return bmm.a($$0, 5, 4);
   }

   private Optional<gt> a(cgd $$0, bbn $$1) {
      gt $$2 = $$1.da();
      return !$$0.a_($$2).k($$0, $$2).b() ? Optional.empty() : gt.a($$2, 5, 1, $$1x -> $$0.b_($$1x).a(akp.a));
   }
}
