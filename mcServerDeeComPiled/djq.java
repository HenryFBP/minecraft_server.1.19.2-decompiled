import java.util.List;
import javax.annotation.Nullable;

public record djq(List<dav.c> a) implements dav.c {
   @Nullable
   @Override
   public cvo calculate(dak.b $$0) {
      for(dav.c $$1 : this.a) {
         cvo $$2 = $$1.calculate($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return null;
   }
}
