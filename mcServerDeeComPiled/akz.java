import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;

public record akz<T>(aba<? extends hm<T>> a, abb b) {
   private static final Interner<akz<?>> c = Interners.newWeakInterner();

   @Deprecated
   public akz(aba<? extends hm<T>> $$0, abb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static <T> Codec<akz<T>> a(aba<? extends hm<T>> $$0) {
      return abb.a.xmap($$1 -> a($$0, $$1), akz::b);
   }

   public static <T> Codec<akz<T>> b(aba<? extends hm<T>> $$0) {
      return Codec.STRING
         .comapFlatMap($$1 -> $$1.startsWith("#") ? abb.b($$1.substring(1)).map($$1x -> a($$0, $$1x)) : DataResult.error("Not a tag id"), $$0x -> "#" + $$0x.b);
   }

   public static <T> akz<T> a(aba<? extends hm<T>> $$0, abb $$1) {
      return (akz<T>)c.intern(new akz<T>($$0, $$1));
   }

   public boolean c(aba<? extends hm<?>> $$0) {
      return this.a == $$0;
   }

   public <E> Optional<akz<E>> d(aba<? extends hm<E>> $$0) {
      return this.c($$0) ? Optional.of(this) : Optional.empty();
   }

   public String toString() {
      return "TagKey[" + this.a.a() + " / " + this.b + "]";
   }
}
