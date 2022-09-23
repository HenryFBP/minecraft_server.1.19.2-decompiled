import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvs {
   private final cha a;
   private final gt b;
   private final boolean c;
   @Nullable
   private cvo d;
   @Nullable
   private cti e;
   private boolean f;

   public cvs(cha $$0, gt $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.h();
      this.c = $$2;
   }

   public cvo a() {
      if (this.d == null && (this.c || this.a.E(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public cti b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cha c() {
      return this.a;
   }

   public gt d() {
      return this.b;
   }

   public static Predicate<cvs> a(Predicate<cvo> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
