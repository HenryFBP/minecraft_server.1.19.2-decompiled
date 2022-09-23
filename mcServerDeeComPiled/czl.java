import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public interface czl<T extends czc> {
   @Nullable
   T a(int var1);

   @Nullable
   T a(UUID var1);

   Iterable<T> a();

   <U extends T> void a(czj<T, U> var1, Consumer<U> var2);

   void a(dwl var1, Consumer<T> var2);

   <U extends T> void a(czj<T, U> var1, dwl var2, Consumer<U> var3);
}
