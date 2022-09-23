import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class bkw {
   private static final bkw a = new bkw();
   private final List<bcc> b;
   private final Predicate<bcc> c;

   private bkw() {
      this.b = List.of();
      this.c = $$0 -> false;
   }

   public bkw(bcc $$0, List<bcc> $$1) {
      this.b = $$1;
      Object2BooleanOpenHashMap<bcc> $$2 = new Object2BooleanOpenHashMap($$1.size());
      Predicate<bcc> $$3 = $$1x -> bly.b($$0, $$1x);
      this.c = $$2x -> $$2.computeIfAbsent($$2x, $$3);
   }

   public static bkw a() {
      return a;
   }

   public Optional<bcc> a(Predicate<bcc> $$0) {
      for(bcc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return Optional.of($$1);
         }
      }

      return Optional.empty();
   }

   public Iterable<bcc> b(Predicate<bcc> $$0) {
      return Iterables.filter(this.b, $$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public Stream<bcc> c(Predicate<bcc> $$0) {
      return this.b.stream().filter($$1 -> $$0.test($$1) && this.c.test($$1));
   }

   public boolean a(bcc $$0) {
      return this.b.contains($$0) && this.c.test($$0);
   }

   public boolean d(Predicate<bcc> $$0) {
      for(bcc $$1 : this.b) {
         if ($$0.test($$1) && this.c.test($$1)) {
            return true;
         }
      }

      return false;
   }
}
