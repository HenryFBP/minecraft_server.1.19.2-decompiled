import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class dxy<T> implements dyb<T>, dyd<T> {
   private final List<dxz<T>> a = Lists.newArrayList();
   private final Set<dxz<?>> b = new ObjectOpenCustomHashSet(dxz.a);

   @Override
   public void a(dya<T> $$0) {
      dxz<T> $$1 = new dxz<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(dxz<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }

   }

   @Override
   public boolean a(gt $$0, T $$1) {
      return this.b.contains(dxz.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public qc b(long $$0, Function<T, String> $$1) {
      pp $$2 = new pp();

      for(dxz<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<dxz<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> dxy<T> a(pp $$0, Function<String, Optional<T>> $$1, cge $$2) {
      dxy<T> $$3 = new dxy<>();
      dxz.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
