import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;

public class ayt<E> extends ayx<ayv.b<E>> {
   public static <E> Codec<ayt<E>> a(Codec<E> $$0) {
      return ayv.b.a($$0).listOf().xmap(ayt::new, ayx::e);
   }

   public static <E> Codec<ayt<E>> b(Codec<E> $$0) {
      return alq.a(ayv.b.a($$0).listOf()).xmap(ayt::new, ayx::e);
   }

   ayt(List<? extends ayv.b<E>> $$0) {
      super($$0);
   }

   public static <E> ayt.a<E> a() {
      return new ayt.a<>();
   }

   public static <E> ayt<E> b() {
      return new ayt<>(List.of());
   }

   public static <E> ayt<E> a(E $$0) {
      return new ayt<>(List.of(ayv.a($$0, 1)));
   }

   public Optional<E> a(amn $$0) {
      return this.b($$0).map(ayv.b::b);
   }

   public static class a<E> {
      private final Builder<ayv.b<E>> a = ImmutableList.builder();

      public ayt.a<E> a(E $$0, int $$1) {
         this.a.add(ayv.a($$0, $$1));
         return this;
      }

      public ayt<E> a() {
         return new ayt<>(this.a.build());
      }
   }
}
