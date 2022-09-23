import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class ayx<E extends ayv> {
   private final int a;
   private final ImmutableList<E> b;

   ayx(List<? extends E> $$0) {
      this.b = ImmutableList.copyOf($$0);
      this.a = ayw.a($$0);
   }

   public static <E extends ayv> ayx<E> c() {
      return new ayx<>(ImmutableList.of());
   }

   @SafeVarargs
   public static <E extends ayv> ayx<E> a(E... $$0) {
      return new ayx<>(ImmutableList.copyOf($$0));
   }

   public static <E extends ayv> ayx<E> a(List<E> $$0) {
      return new ayx<>($$0);
   }

   public boolean d() {
      return this.b.isEmpty();
   }

   public Optional<E> b(amn $$0) {
      if (this.a == 0) {
         return Optional.empty();
      } else {
         int $$1 = $$0.a(this.a);
         return ayw.a(this.b, $$1);
      }
   }

   public List<E> e() {
      return this.b;
   }

   public static <E extends ayv> Codec<ayx<E>> c(Codec<E> $$0) {
      return $$0.listOf().xmap(ayx::a, ayx::e);
   }
}
