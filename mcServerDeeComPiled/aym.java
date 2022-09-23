import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class aym {
   private final Set<String> a = new ObjectOpenHashSet();

   public Set<aye> a(Supplier<awx> $$0) {
      Set<aye> $$1 = (Set)((awx)$$0.get())
         .e()
         .stream()
         .filter($$0x -> !this.a.contains($$0x.getLeft()))
         .map($$1x -> a($$0, (String)$$1x.getLeft(), (ayd)$$1x.getRight()))
         .collect(Collectors.toSet());

      for(aye $$2 : $$1) {
         this.a.add($$2.d());
      }

      return $$1;
   }

   private static aye a(Supplier<awx> $$0, String $$1, ayd $$2) {
      return aye.a($$1, $$2, () -> {
         aws.a $$2x = ((awx)$$0.get()).c($$1);
         return $$2x == null ? 0.0 : (double)$$2x.b() / (double)anc.b;
      });
   }
}
