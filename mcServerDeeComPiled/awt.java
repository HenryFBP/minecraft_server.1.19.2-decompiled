import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class awt {
   private final LongSupplier a;
   private final IntSupplier b;
   private awx c = aww.a;

   public awt(LongSupplier $$0, IntSupplier $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public boolean a() {
      return this.c != aww.a;
   }

   public void b() {
      this.c = aww.a;
   }

   public void c() {
      this.c = new aws(this.a, this.b, true);
   }

   public awz d() {
      return this.c;
   }

   public awy e() {
      return this.c.d();
   }
}
