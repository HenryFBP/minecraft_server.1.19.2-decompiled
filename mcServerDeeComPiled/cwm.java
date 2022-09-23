import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cwm<T extends Enum<T> & amw> extends cwr<T> {
   private final ImmutableSet<T> a;
   private final Map<String, T> b = Maps.newHashMap();

   protected cwm(String $$0, Class<T> $$1, Collection<T> $$2) {
      super($$0, $$1);
      this.a = ImmutableSet.copyOf($$2);

      for(T $$3 : $$2) {
         String $$4 = $$3.c();
         if (this.b.containsKey($$4)) {
            throw new IllegalArgumentException("Multiple values have the same name '" + $$4 + "'");
         }

         this.b.put($$4, $$3);
      }

   }

   @Override
   public Collection<T> a() {
      return this.a;
   }

   @Override
   public Optional<T> b(String $$0) {
      return Optional.ofNullable((Enum)this.b.get($$0));
   }

   public String a(T $$0) {
      return $$0.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 instanceof cwm $$1 && super.equals($$0)) {
         return this.a.equals($$1.a) && this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int b() {
      int $$0 = super.b();
      $$0 = 31 * $$0 + this.a.hashCode();
      return 31 * $$0 + this.b.hashCode();
   }

   public static <T extends Enum<T> & amw> cwm<T> a(String $$0, Class<T> $$1) {
      return a($$0, $$1, (Predicate<T>)($$0x -> true));
   }

   public static <T extends Enum<T> & amw> cwm<T> a(String $$0, Class<T> $$1, Predicate<T> $$2) {
      return a($$0, $$1, (Collection<T>)Arrays.stream((Enum[])$$1.getEnumConstants()).filter($$2).collect(Collectors.toList()));
   }

   public static <T extends Enum<T> & amw> cwm<T> a(String $$0, Class<T> $$1, T... $$2) {
      return a($$0, $$1, Lists.newArrayList($$2));
   }

   public static <T extends Enum<T> & amw> cwm<T> a(String $$0, Class<T> $$1, Collection<T> $$2) {
      return new cwm<>($$0, $$1, $$2);
   }
}
