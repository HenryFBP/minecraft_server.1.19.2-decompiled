import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface cyb<T> {
   T a(int var1, int var2, int var3);

   void a(Consumer<T> var1);

   void b(qx var1);

   int c();

   boolean a(Predicate<T> var1);

   void a(cya.b<T> var1);

   cya<T> e();

   cyb.a<T> a(hf<T> var1, cya.d var2);

   public static record a<T>(List<T> a, Optional<LongStream> b) {
   }

   public interface b<T, C extends cyb<T>> {
      DataResult<C> read(hf<T> var1, cya.d var2, cyb.a<T> var3);
   }
}
