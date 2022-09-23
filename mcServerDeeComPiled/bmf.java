import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmf {
   public static final bmf a = a();
   private static final double b = 2.0;
   private final boolean c;
   private double d = -1.0;
   private boolean e = true;
   private boolean f = true;
   @Nullable
   private Predicate<bcc> g;

   private bmf(boolean $$0) {
      this.c = $$0;
   }

   public static bmf a() {
      return new bmf(true);
   }

   public static bmf b() {
      return new bmf(false);
   }

   public bmf c() {
      bmf $$0 = this.c ? a() : b();
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      return $$0;
   }

   public bmf a(double $$0) {
      this.d = $$0;
      return this;
   }

   public bmf d() {
      this.e = false;
      return this;
   }

   public bmf e() {
      this.f = false;
      return this;
   }

   public bmf a(@Nullable Predicate<bcc> $$0) {
      this.g = $$0;
      return this;
   }

   public boolean a(@Nullable bcc $$0, bcc $$1) {
      if ($$0 == $$1) {
         return false;
      } else if (!$$1.dZ()) {
         return false;
      } else if (this.g != null && !this.g.test($$1)) {
         return false;
      } else {
         if ($$0 == null) {
            if (this.c && (!$$1.dY() || $$1.s.ag() == bag.a)) {
               return false;
            }
         } else {
            if (this.c && (!$$0.c($$1) || !$$0.a($$1.ad()) || $$0.p($$1))) {
               return false;
            }

            if (this.d > 0.0) {
               double $$2 = this.f ? $$1.y($$0) : 1.0;
               double $$3 = Math.max(this.d * $$2, 2.0);
               double $$4 = $$0.h($$1.df(), $$1.dh(), $$1.dl());
               if ($$4 > $$3 * $$3) {
                  return false;
               }
            }

            if (this.e && $$0 instanceof bce $$5 && !$$5.E().a($$1)) {
               return false;
            }
         }

         return true;
      }
   }
}
