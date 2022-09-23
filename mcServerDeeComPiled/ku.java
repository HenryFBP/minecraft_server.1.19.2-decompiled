import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface ku {
   abb a = new abb("recipes/root");

   ku a(String var1, an var2);

   ku a(@Nullable String var1);

   cat a();

   void a(Consumer<kt> var1, abb var2);

   default void a(Consumer<kt> $$0) {
      this.a($$0, a(this.a()));
   }

   default void a(Consumer<kt> $$0, String $$1) {
      abb $$2 = a(this.a());
      abb $$3 = new abb($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, $$3);
      }
   }

   static abb a(cgw $$0) {
      return hm.Y.b($$0.l());
   }
}
