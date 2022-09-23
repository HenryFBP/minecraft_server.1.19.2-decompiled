import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import javax.annotation.Nullable;

public class byd {
   private final int a;
   public final bac d;
   public int e;
   public final int f;
   public final int g;

   public byd(bac $$0, int $$1, int $$2, int $$3) {
      this.d = $$0;
      this.a = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   public void a(cax $$0, cax $$1) {
      int $$2 = $$1.K() - $$0.K();
      if ($$2 > 0) {
         this.a($$1, $$2);
      }

   }

   protected void a(cax $$0, int $$1) {
   }

   protected void b(int $$0) {
   }

   protected void b_(cax $$0) {
   }

   public void a(buc $$0, cax $$1) {
      this.d();
   }

   public boolean a(cax $$0) {
      return true;
   }

   public cax e() {
      return this.d.a(this.a);
   }

   public boolean f() {
      return !this.e().b();
   }

   public void d(cax $$0) {
      this.d.a(this.a, $$0);
      this.d();
   }

   public void e(cax $$0) {
      this.d.a(this.a, $$0);
      this.d();
   }

   public void d() {
      this.d.e();
   }

   public int a() {
      return this.d.O_();
   }

   public int a_(cax $$0) {
      return Math.min(this.a(), $$0.f());
   }

   @Nullable
   public Pair<abb, abb> c() {
      return null;
   }

   public cax a(int $$0) {
      return this.d.a(this.a, $$0);
   }

   public boolean a(buc $$0) {
      return true;
   }

   public boolean b() {
      return true;
   }

   public Optional<cax> a(int $$0, int $$1, buc $$2) {
      if (!this.a($$2)) {
         return Optional.empty();
      } else if (!this.b($$2) && $$1 < this.e().K()) {
         return Optional.empty();
      } else {
         $$0 = Math.min($$0, $$1);
         cax $$3 = this.a($$0);
         if ($$3.b()) {
            return Optional.empty();
         } else {
            if (this.e().b()) {
               this.d(cax.b);
            }

            return Optional.of($$3);
         }
      }
   }

   public cax b(int $$0, int $$1, buc $$2) {
      Optional<cax> $$3 = this.a($$0, $$1, $$2);
      $$3.ifPresent($$1x -> this.a($$2, $$1x));
      return (cax)$$3.orElse(cax.b);
   }

   public cax f(cax $$0) {
      return this.b($$0, $$0.K());
   }

   public cax b(cax $$0, int $$1) {
      if (!$$0.b() && this.a($$0)) {
         cax $$2 = this.e();
         int $$3 = Math.min(Math.min($$1, $$0.K()), this.a_($$0) - $$2.K());
         if ($$2.b()) {
            this.d($$0.a($$3));
         } else if (cax.e($$2, $$0)) {
            $$0.g($$3);
            $$2.f($$3);
            this.d($$2);
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   public boolean b(buc $$0) {
      return this.a($$0) && this.a(this.e());
   }

   public int g() {
      return this.a;
   }
}
