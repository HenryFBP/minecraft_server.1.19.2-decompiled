import java.util.function.Function;

public class dyf<T> implements dxw<T> {
   private final Function<gt, dyd<T>> a;

   public dyf(Function<gt, dyd<T>> $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a(gt $$0, T $$1) {
      return ((dyd)this.a.apply($$0)).a($$0, $$1);
   }

   @Override
   public void a(dya<T> $$0) {
      ((dyd)this.a.apply($$0.b())).a($$0);
   }

   @Override
   public boolean b(gt $$0, T $$1) {
      return false;
   }

   @Override
   public int a() {
      return 0;
   }
}
