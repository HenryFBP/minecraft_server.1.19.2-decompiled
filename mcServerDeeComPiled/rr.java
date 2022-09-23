import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Optional;
import javax.annotation.Nullable;

public interface rr {
   rr a = new rr() {
      public String toString() {
         return "empty";
      }
   };

   default <T> Optional<T> a(ru.b<T> $$0, sj $$1) {
      return Optional.empty();
   }

   default <T> Optional<T> a(ru.a<T> $$0) {
      return Optional.empty();
   }

   default sb a(@Nullable dr $$0, @Nullable bbn $$1, int $$2) throws CommandSyntaxException {
      return sb.a(this);
   }
}
