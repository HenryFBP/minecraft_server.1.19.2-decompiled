import java.util.Optional;
import java.util.function.Function;

public class dcp extends dbn {
   private final hn a;
   private final dav b;
   private final dbf c;
   private final dbi.o d;

   public dcp(dau $$0, hn $$1, cgz $$2, dav $$3, dbf $$4, dbi.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<cvo> a(Function<gt, hc<cht>> $$0, cxj $$1, gt $$2, boolean $$3) {
      return this.c.d().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public hn c() {
      return this.a;
   }

   public dbf d() {
      return this.c;
   }
}
