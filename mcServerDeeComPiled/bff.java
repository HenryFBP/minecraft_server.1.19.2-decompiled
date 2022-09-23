import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bff extends bdo<bcl> {
   private static final int e = 10;
   private static final int f = 7;
   private final float g;
   protected final int a;
   protected final int d;
   private final boolean h;

   public bff(float $$0) {
      this($$0, true);
   }

   public bff(float $$0, boolean $$1) {
      this($$0, 10, 7, $$1);
   }

   public bff(float $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public bff(float $$0, int $$1, int $$2, boolean $$3) {
      super(ImmutableMap.of(bku.m, bkv.b));
      this.g = $$0;
      this.a = $$1;
      this.d = $$2;
      this.h = $$3;
   }

   protected boolean a(agg $$0, bcl $$1) {
      return this.h || !$$1.aU();
   }

   protected void a(agg $$0, bcl $$1, long $$2) {
      Optional<dwq> $$3 = Optional.ofNullable(this.a($$1));
      $$1.dy().a(bku.m, $$3.map($$0x -> new bkx($$0x, this.g, 0)));
   }

   @Nullable
   protected dwq a(bcl $$0) {
      return bmm.a($$0, this.a, this.d);
   }
}
