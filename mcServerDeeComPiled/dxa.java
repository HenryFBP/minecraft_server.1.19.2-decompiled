import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxa implements dwv {
   protected static final dwv a = new dxa(false, -Double.MAX_VALUE, cax.b, $$0 -> false, null) {
      @Override
      public boolean a(dxj $$0, gt $$1, boolean $$2) {
         return $$2;
      }
   };
   private final boolean b;
   private final double c;
   private final cax d;
   private final Predicate<dpv> e;
   @Nullable
   private final bbn f;

   protected dxa(boolean $$0, double $$1, cax $$2, Predicate<dpv> $$3, @Nullable bbn $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   @Deprecated
   protected dxa(bbn $$0) {
      this($$0.bP(), $$0.dh(), $$0 instanceof bcc ? ((bcc)$$0).ez() : cax.b, $$0 instanceof bcc ? ((bcc)$$0)::a : $$0x -> false, $$0);
   }

   @Override
   public boolean a(cat $$0) {
      return this.d.a($$0);
   }

   @Override
   public boolean a(dpv $$0, dpv $$1) {
      return this.e.test($$1) && !$$0.a().a($$1.a());
   }

   @Override
   public boolean b() {
      return this.b;
   }

   @Override
   public boolean a(dxj $$0, gt $$1, boolean $$2) {
      return this.c > (double)$$1.v() + $$0.c(gy.a.b) - 1.0E-5F;
   }

   @Nullable
   public bbn c() {
      return this.f;
   }
}
