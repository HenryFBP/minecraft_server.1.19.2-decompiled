import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class alc {
   public static Map<aba<? extends hm<?>>, alc.a> a(hn $$0) {
      return (Map<aba<? extends hm<?>>, alc.a>)$$0.d()
         .map($$0x -> Pair.of($$0x.a(), a($$0x.b())))
         .filter($$0x -> !((alc.a)$$0x.getSecond()).a())
         .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
   }

   private static <T> alc.a a(hm<T> $$0) {
      Map<abb, IntList> $$1 = new HashMap();
      $$0.h().forEach($$2 -> {
         he<T> $$3 = (he)$$2.getSecond();
         IntList $$4 = new IntArrayList($$3.b());

         for(hc<T> $$5 : $$3) {
            if ($$5.f() != hc.b.a) {
               throw new IllegalStateException("Can't serialize unregistered value " + $$5);
            }

            $$4.add($$0.a($$5.a()));
         }

         $$1.put(((akz)$$2.getFirst()).b(), $$4);
      });
      return new alc.a($$1);
   }

   public static <T> void a(aba<? extends hm<T>> $$0, hm<T> $$1, alc.a $$2, alc.b<T> $$3) {
      $$2.a.forEach(($$3x, $$4) -> {
         akz<T> $$5 = akz.a($$0, $$3x);
         List<hc<T>> $$6 = $$4.intStream().mapToObj($$1::c).flatMap(Optional::stream).toList();
         $$3.accept($$5, $$6);
      });
   }

   public static final class a {
      final Map<abb, IntList> a;

      a(Map<abb, IntList> $$0) {
         this.a = $$0;
      }

      public void a(qx $$0) {
         $$0.a(this.a, qx::a, qx::a);
      }

      public static alc.a b(qx $$0) {
         return new alc.a($$0.a(qx::r, qx::a));
      }

      public boolean a() {
         return this.a.isEmpty();
      }
   }

   @FunctionalInterface
   public interface b<T> {
      void accept(akz<T> var1, List<hc<T>> var2);
   }
}
