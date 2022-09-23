import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class gx<T> extends hh<T> {
   private final abb bR;
   private hc<T> bS;

   public gx(String $$0, aba<? extends hm<T>> $$1, Lifecycle $$2, @Nullable Function<T, hc.c<T>> $$3) {
      super($$1, $$2, $$3);
      this.bR = new abb($$0);
   }

   @Override
   public hc<T> a(int $$0, aba<T> $$1, T $$2, Lifecycle $$3) {
      hc<T> $$4 = super.a($$0, $$1, $$2, $$3);
      if (this.bR.equals($$1.a())) {
         this.bS = $$4;
      }

      return $$4;
   }

   @Override
   public int a(@Nullable T $$0) {
      int $$1 = super.a($$0);
      return $$1 == -1 ? super.a(this.bS.a()) : $$1;
   }

   @Nonnull
   @Override
   public abb b(T $$0) {
      abb $$1 = super.b($$0);
      return $$1 == null ? this.bR : $$1;
   }

   @Nonnull
   @Override
   public T a(@Nullable abb $$0) {
      T $$1 = super.a($$0);
      return (T)($$1 == null ? this.bS.a() : $$1);
   }

   @Override
   public Optional<T> b(@Nullable abb $$0) {
      return Optional.ofNullable(super.a($$0));
   }

   @Nonnull
   @Override
   public T a(int $$0) {
      T $$1 = super.a($$0);
      return (T)($$1 == null ? this.bS.a() : $$1);
   }

   @Override
   public Optional<hc<T>> a(amn $$0) {
      return super.a($$0).or(() -> Optional.of(this.bS));
   }

   public abb a() {
      return this.bR;
   }
}
