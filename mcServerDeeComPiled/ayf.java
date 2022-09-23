import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ayf {
   public static final ayf a = new ayf();
   private final WeakHashMap<ayh, Void> b = new WeakHashMap();

   private ayf() {
   }

   public void a(ayh $$0) {
      this.b.put($$0, null);
   }

   public List<aye> a() {
      Map<String, List<aye>> $$0 = (Map)this.b.keySet().stream().flatMap($$0x -> $$0x.bl().stream()).collect(Collectors.groupingBy(aye::d));
      return a($$0);
   }

   private static List<aye> a(Map<String, List<aye>> $$0) {
      return (List<aye>)$$0.entrySet().stream().map($$0x -> {
         String $$1 = (String)$$0x.getKey();
         List<aye> $$2 = (List)$$0x.getValue();
         return (aye)($$2.size() > 1 ? new ayf.a($$1, $$2) : (aye)$$2.get(0));
      }).collect(Collectors.toList());
   }

   static class a extends aye {
      private final List<aye> b;

      a(String $$0, List<aye> $$1) {
         super($$0, ((aye)$$1.get(0)).e(), () -> c($$1), () -> b($$1), a($$1));
         this.b = $$1;
      }

      private static aye.c a(List<aye> $$0) {
         return $$1 -> $$0.stream().anyMatch($$1x -> $$1x.a != null ? $$1x.a.test($$1) : false);
      }

      private static void b(List<aye> $$0) {
         for(aye $$1 : $$0) {
            $$1.a();
         }

      }

      private static double c(List<aye> $$0) {
         double $$1 = 0.0;

         for(aye $$2 : $$0) {
            $$1 += $$2.c().getAsDouble();
         }

         return $$1 / (double)$$0.size();
      }

      @Override
      public boolean equals(@Nullable Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
         } else if (!super.equals($$0)) {
            return false;
         } else {
            ayf.a $$1 = (ayf.a)$$0;
            return this.b.equals($$1.b);
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(new Object[]{super.hashCode(), this.b});
      }
   }
}
