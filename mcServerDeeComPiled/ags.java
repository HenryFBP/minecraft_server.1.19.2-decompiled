import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class ags implements agp {
   private final agp a;
   private final azc<Runnable> b;

   private ags(agp $$0, Executor $$1) {
      this.a = $$0;
      this.b = azc.a($$1, "progressListener");
   }

   public static ags a(agp $$0, Executor $$1) {
      ags $$2 = new ags($$0, $$1);
      $$2.a();
      return $$2;
   }

   @Override
   public void a(cge $$0) {
      this.b.a((Runnable)() -> this.a.a($$0));
   }

   @Override
   public void a(cge $$0, @Nullable cxn $$1) {
      this.b.a((Runnable)() -> this.a.a($$0, $$1));
   }

   @Override
   public void a() {
      this.b.a(this.a::a);
   }

   @Override
   public void b() {
      this.b.a(this.a::b);
   }
}
