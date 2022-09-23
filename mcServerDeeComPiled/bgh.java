import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bgh extends bdo<bcl> {
   private final bku<hb> a;
   private final int d;
   private final int e;
   private final float f;
   private long g;

   public bgh(bku<hb> $$0, float $$1, int $$2, int $$3) {
      super(ImmutableMap.of(bku.m, bkv.c, $$0, bkv.a));
      this.a = $$0;
      this.f = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   protected boolean a(agg $$0, bcl $$1) {
      Optional<hb> $$2 = $$1.dy().c(this.a);
      return $$2.isPresent() && $$0.ab() == ((hb)$$2.get()).a() && ((hb)$$2.get()).b().a($$1.cY(), (double)this.e);
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      if ($$2 > this.g) {
         bcx<?> $$3 = $$1.dy();
         Optional<hb> $$4 = $$3.c(this.a);
         $$4.ifPresent($$1x -> $$3.a(bku.m, new bkx($$1x.b(), this.f, this.d)));
         this.g = $$2 + 80L;
      }

   }
}
