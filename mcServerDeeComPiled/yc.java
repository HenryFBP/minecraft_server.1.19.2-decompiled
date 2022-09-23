import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class yc implements tc<xm> {
   public static final int a = 4;
   private static final int b = 128;
   private static final int c = 8192;
   private static final int d = 200;
   private final int e;
   private final List<String> f;
   private final Optional<String> g;

   public yc(int $$0, List<String> $$1, Optional<String> $$2) {
      this.e = $$0;
      this.f = ImmutableList.copyOf($$1);
      this.g = $$2;
   }

   public yc(qx $$0) {
      this.e = $$0.k();
      this.f = $$0.a(qx.a(Lists::newArrayListWithCapacity, 200), $$0x -> $$0x.e(8192));
      this.g = $$0.b((qx.a)($$0x -> $$0x.e(128)));
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.e);
      $$0.a(this.f, ($$0x, $$1) -> $$0x.a($$1, 8192));
      $$0.a(this.g, ($$0x, $$1) -> $$0x.a($$1, 128));
   }

   public void a(xm $$0) {
      $$0.a(this);
   }

   public List<String> b() {
      return this.f;
   }

   public Optional<String> c() {
      return this.g;
   }

   public int d() {
      return this.e;
   }
}
