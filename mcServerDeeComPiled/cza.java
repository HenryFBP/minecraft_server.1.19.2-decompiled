import java.util.List;
import java.util.stream.Stream;

public class cza<T> {
   private final cge a;
   private final List<T> b;

   public cza(cge $$0, List<T> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public cge a() {
      return this.a;
   }

   public Stream<T> b() {
      return this.b.stream();
   }

   public boolean c() {
      return this.b.isEmpty();
   }
}
