import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public interface cgj extends cgo, cha, chc {
   @Override
   default <T extends cti> Optional<T> a(gt $$0, ctk<T> $$1) {
      return cha.super.a($$0, $$1);
   }

   @Override
   default List<dxj> b(@Nullable bbn $$0, dwl $$1) {
      return cgo.super.b($$0, $$1);
   }

   @Override
   default boolean a(@Nullable bbn $$0, dxj $$1) {
      return cgo.super.a($$0, $$1);
   }

   @Override
   default gt a(dar.a $$0, gt $$1) {
      return cha.super.a($$0, $$1);
   }

   hn s();
}
