import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bgg extends bdo<bcl> {
   private static final int a = 180;
   private static final int d = 8;
   private static final int e = 6;
   private final bku<hb> f;
   private long g;
   private final int h;
   private final float i;

   public bgg(bku<hb> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bku.m, bkv.c, $$0, bkv.a));
      this.f = $$0;
      this.i = $$1;
      this.h = $$2;
   }

   protected boolean a(agg $$0, bcl $$1) {
      Optional<hb> $$2 = $$1.dy().c(this.f);
      return $$2.isPresent() && $$0.ab() == ((hb)$$2.get()).a() && ((hb)$$2.get()).b().a($$1.cY(), (double)this.h);
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      if ($$2 > this.g) {
         Optional<dwq> $$3 = Optional.ofNullable(bmm.a($$1, 8, 6));
         $$1.dy().a(bku.m, $$3.map($$0x -> new bkx($$0x, this.i, 1)));
         this.g = $$2 + 180L;
      }

   }
}
