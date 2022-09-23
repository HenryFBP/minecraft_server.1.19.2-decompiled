import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class sl {
   private static final String b = "#";
   public static final Codec<sl> a = Codec.STRING.comapFlatMap($$0 -> {
      sl $$1 = a($$0);
      return $$1 != null ? DataResult.success($$1) : DataResult.error("String is not a valid color name or hex color code");
   }, sl::b);
   private static final Map<p, sl> c = (Map<p, sl>)Stream.of(p.values())
      .filter(p::e)
      .collect(ImmutableMap.toImmutableMap(Function.identity(), $$0 -> new sl($$0.f(), $$0.g())));
   private static final Map<String, sl> d = (Map<String, sl>)c.values().stream().collect(ImmutableMap.toImmutableMap($$0 -> $$0.f, Function.identity()));
   private final int e;
   @Nullable
   private final String f;

   private sl(int $$0, String $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   private sl(int $$0) {
      this.e = $$0;
      this.f = null;
   }

   public int a() {
      return this.e;
   }

   public String b() {
      return this.f != null ? this.f : this.c();
   }

   private String c() {
      return String.format(Locale.ROOT, "#%06X", this.e);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         sl $$1 = (sl)$$0;
         return this.e == $$1.e;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.e, this.f});
   }

   public String toString() {
      return this.f != null ? this.f : this.c();
   }

   @Nullable
   public static sl a(p $$0) {
      return (sl)c.get($$0);
   }

   public static sl a(int $$0) {
      return new sl($$0);
   }

   @Nullable
   public static sl a(String $$0) {
      if ($$0.startsWith("#")) {
         try {
            int $$1 = Integer.parseInt($$0.substring(1), 16);
            return a($$1);
         } catch (NumberFormatException var2) {
            return null;
         }
      } else {
         return (sl)d.get($$0);
      }
   }
}
