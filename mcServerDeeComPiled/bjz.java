import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bjz<T extends bce> extends bip {
   private final T a;
   private final cax b;
   private final Predicate<? super T> c;
   @Nullable
   private final ajv d;

   public bjz(T $$0, cax $$1, @Nullable ajv $$2, Predicate<? super T> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = $$3;
   }

   @Override
   public boolean a() {
      return this.c.test(this.a);
   }

   @Override
   public boolean b() {
      return this.a.eT();
   }

   @Override
   public void c() {
      this.a.a(bbs.a, this.b.o());
      this.a.c(bai.a);
   }

   @Override
   public void d() {
      this.a.a(bbs.a, cax.b);
      if (this.d != null) {
         this.a.a(this.d, 1.0F, this.a.dQ().i() * 0.2F + 0.9F);
      }

   }
}
