import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cwi extends cwm<gy> {
   protected cwi(String $$0, Collection<gy> $$1) {
      super($$0, gy.class, $$1);
   }

   public static cwi a(String $$0) {
      return a($$0, (Predicate<gy>)($$0x -> true));
   }

   public static cwi a(String $$0, Predicate<gy> $$1) {
      return a($$0, (Collection<gy>)Arrays.stream(gy.values()).filter($$1).collect(Collectors.toList()));
   }

   public static cwi a(String $$0, gy... $$1) {
      return a($$0, Lists.newArrayList($$1));
   }

   public static cwi a(String $$0, Collection<gy> $$1) {
      return new cwi($$0, $$1);
   }
}
