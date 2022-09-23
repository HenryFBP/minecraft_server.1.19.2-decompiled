import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface aim extends aip {
   Set<String> a();

   List<aik> a(abb var1);

   Map<abb, aik> b(String var1, Predicate<abb> var2);

   Map<abb, List<aik>> c(String var1, Predicate<abb> var2);

   Stream<ahl> b();

   public static enum a implements aim {
      a;

      @Override
      public Set<String> a() {
         return Set.of();
      }

      @Override
      public Optional<aik> getResource(abb $$0) {
         return Optional.empty();
      }

      @Override
      public List<aik> a(abb $$0) {
         return List.of();
      }

      @Override
      public Map<abb, aik> b(String $$0, Predicate<abb> $$1) {
         return Map.of();
      }

      @Override
      public Map<abb, List<aik>> c(String $$0, Predicate<abb> $$1) {
         return Map.of();
      }

      @Override
      public Stream<ahl> b() {
         return Stream.of();
      }
   }
}
