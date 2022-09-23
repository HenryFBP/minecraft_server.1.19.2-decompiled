import com.google.common.collect.ImmutableMap;
import java.util.function.Function;

public class bft<T> extends bdo<bcl> {
   private final bku<T> a;
   private final float d;
   private final int e;
   private final Function<T, dwq> f;

   public bft(bku<T> $$0, float $$1, int $$2, boolean $$3, Function<T, dwq> $$4) {
      super(ImmutableMap.of(bku.m, $$3 ? bkv.c : bkv.b, $$0, bkv.a));
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$4;
   }

   public static bft<gt> a(bku<gt> $$0, float $$1, int $$2, boolean $$3) {
      return new bft<>($$0, $$1, $$2, $$3, dwq::c);
   }

   public static bft<? extends bbn> b(bku<? extends bbn> $$0, float $$1, int $$2, boolean $$3) {
      return new bft<>($$0, $$1, $$2, $$3, bbn::cY);
   }

   protected boolean a(agg $$0, bcl $$1) {
      return this.b($$1) ? false : $$1.cY().a((hj)this.a($$1), (double)this.e);
   }

   private dwq a(bcl $$0) {
      return (dwq)this.f.apply($$0.dy().c(this.a).get());
   }

   private boolean b(bcl $$0) {
      if (!$$0.dy().a(bku.m)) {
         return false;
      } else {
         bkx $$1 = (bkx)$$0.dy().c(bku.m).get();
         if ($$1.b() != this.d) {
            return false;
         } else {
            dwq $$2 = $$1.a().a().d($$0.cY());
            dwq $$3 = this.a($$0).d($$0.cY());
            return $$2.b($$3) < 0.0;
         }
      }
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      a($$1, this.a($$1), this.d);
   }

   private static void a(bcl $$0, dwq $$1, float $$2) {
      for(int $$3 = 0; $$3 < 10; ++$$3) {
         dwq $$4 = bmm.b($$0, 16, 7, $$1);
         if ($$4 != null) {
            $$0.dy().a(bku.m, new bkx($$4, $$2, 0));
            return;
         }
      }

   }
}
