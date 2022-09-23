import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class xi implements tc<tf> {
   private final List<cdp<?>> a;

   public xi(Collection<cdp<?>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public xi(qx $$0) {
      this.a = $$0.a(xi::b);
   }

   @Override
   public void a(qx $$0) {
      $$0.a(this.a, xi::a);
   }

   public void a(tf $$0) {
      $$0.a(this);
   }

   public List<cdp<?>> b() {
      return this.a;
   }

   public static cdp<?> b(qx $$0) {
      abb $$1 = $$0.r();
      abb $$2 = $$0.r();
      return ((cdr)hm.aj.b($$1).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + $$1))).a($$2, $$0);
   }

   public static <T extends cdp<?>> void a(qx $$0, T $$1) {
      $$0.a(hm.aj.b($$1.U_()));
      $$0.a($$1.f());
      $$1.U_().a($$0, $$1);
   }
}
