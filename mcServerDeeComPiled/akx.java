import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class akx {
   private static final Codec<akx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(alq.h.fieldOf("id").forGetter(akx::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, akx::new)
   );
   public static final Codec<akx> a = Codec.either(alq.h, b)
      .xmap($$0 -> (akx)$$0.map($$0x -> new akx($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final abb c;
   private final boolean d;
   private final boolean e;

   private akx(abb $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private akx(alq.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private alq.d a() {
      return new alq.d(this.c, this.d);
   }

   public static akx a(abb $$0) {
      return new akx($$0, false, true);
   }

   public static akx b(abb $$0) {
      return new akx($$0, false, false);
   }

   public static akx c(abb $$0) {
      return new akx($$0, true, true);
   }

   public static akx d(abb $$0) {
      return new akx($$0, true, false);
   }

   public <T> boolean a(akx.a<T> $$0, Consumer<T> $$1) {
      if (this.d) {
         Collection<T> $$2 = $$0.b(this.c);
         if ($$2 == null) {
            return !this.e;
         }

         $$2.forEach($$1);
      } else {
         T $$3 = $$0.a(this.c);
         if ($$3 == null) {
            return !this.e;
         }

         $$1.accept($$3);
      }

      return true;
   }

   public void a(Consumer<abb> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }

   }

   public void b(Consumer<abb> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }

   }

   public boolean a(Predicate<abb> $$0, Predicate<abb> $$1) {
      return !this.e || (this.d ? $$1 : $$0).test(this.c);
   }

   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      if (this.d) {
         $$0.append('#');
      }

      $$0.append(this.c);
      if (!this.e) {
         $$0.append('?');
      }

      return $$0.toString();
   }

   public interface a<T> {
      @Nullable
      T a(abb var1);

      @Nullable
      Collection<T> b(abb var1);
   }
}
