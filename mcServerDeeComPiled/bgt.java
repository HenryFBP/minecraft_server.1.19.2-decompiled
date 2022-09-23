import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bgt extends bdo<bcl> {
   private static final int a = 10;
   private static final int d = 7;
   private final float e;
   private final int f;
   private final int g;

   public bgt(float $$0) {
      this($$0, 10, 7);
   }

   public bgt(float $$0, int $$1, int $$2) {
      super(ImmutableMap.of(bku.m, bkv.b));
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      gt $$3 = $$1.da();
      if ($$0.b($$3)) {
         this.a($$1);
      } else {
         hq $$4 = hq.a($$3);
         hq $$5 = bdp.a($$0, $$4, 2);
         if ($$5 != $$4) {
            this.a($$1, $$5);
         } else {
            this.a($$1);
         }
      }

   }

   private void a(bcl $$0, hq $$1) {
      Optional<dwq> $$2 = Optional.ofNullable(bmj.a($$0, this.f, this.g, dwq.c($$1.q()), (float) (Math.PI / 2)));
      $$0.dy().a(bku.m, $$2.map($$0x -> new bkx($$0x, this.e, 0)));
   }

   private void a(bcl $$0) {
      Optional<dwq> $$1 = Optional.ofNullable(bmm.a($$0, this.f, this.g));
      $$0.dy().a(bku.m, $$1.map($$0x -> new bkx($$0x, this.e, 0)));
   }
}
