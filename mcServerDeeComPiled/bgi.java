import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bgi extends bdo<btp> {
   private final bku<List<hb>> a;
   private final bku<hb> d;
   private final float e;
   private final int f;
   private final int g;
   private long h;
   @Nullable
   private hb i;

   public bgi(bku<List<hb>> $$0, float $$1, int $$2, int $$3, bku<hb> $$4) {
      super(ImmutableMap.of(bku.m, bkv.c, $$0, bkv.a, $$4, bkv.a));
      this.a = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.d = $$4;
   }

   protected boolean a(agg $$0, btp $$1) {
      Optional<List<hb>> $$2 = $$1.dy().c(this.a);
      Optional<hb> $$3 = $$1.dy().c(this.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         List<hb> $$4 = (List)$$2.get();
         if (!$$4.isEmpty()) {
            this.i = (hb)$$4.get($$0.r_().a($$4.size()));
            return this.i != null && $$0.ab() == this.i.a() && ((hb)$$3.get()).b().a($$1.cY(), (double)this.g);
         }
      }

      return false;
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      if ($$2 > this.h && this.i != null) {
         $$1.dy().a(bku.m, new bkx(this.i.b(), this.e, this.f));
         this.h = $$2 + 100L;
      }

   }
}
