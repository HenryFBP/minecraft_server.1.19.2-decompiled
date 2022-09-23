import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;

public class gi<A extends ArgumentType<?>> implements gf<A, gi<A>.a> {
   private final gi<A>.a a;

   private gi(Function<dl, A> $$0) {
      this.a = new gi.a($$0);
   }

   public static <T extends ArgumentType<?>> gi<T> a(Supplier<T> $$0) {
      return new gi<>($$1 -> (ArgumentType)$$0.get());
   }

   public static <T extends ArgumentType<?>> gi<T> a(Function<dl, T> $$0) {
      return new gi<>($$0);
   }

   public void a(gi<A>.a $$0, qx $$1) {
   }

   public void a(gi<A>.a $$0, JsonObject $$1) {
   }

   public gi<A>.a a(qx $$0) {
      return this.a;
   }

   public gi<A>.a b(A $$0) {
      return this.a;
   }

   public final class a implements gf.a<A> {
      private final Function<dl, A> b;

      public a(Function<dl, A> $$1) {
         this.b = $$1;
      }

      @Override
      public A b(dl $$0) {
         return (A)this.b.apply($$0);
      }

      @Override
      public gf<A, ?> a() {
         return gi.this;
      }
   }
}
