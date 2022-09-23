import com.google.common.collect.Maps;
import java.util.Map;

public class bzr extends cat {
   private static final Map<bzq, bzr> a = Maps.newEnumMap(bzq.class);
   private final bzq b;

   public bzr(bzq $$0, cat.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public baj a(cax $$0, buc $$1, bcc $$2, bai $$3) {
      if ($$2 instanceof boa $$4 && $$4.bo() && !$$4.fJ() && $$4.t() != this.b) {
         $$4.s.a($$1, $$4, ajw.fg, ajx.h, 1.0F, 1.0F);
         if (!$$1.s.y) {
            $$4.b(this.b);
            $$0.g(1);
         }

         return baj.a($$1.s.y);
      }

      return baj.d;
   }

   public bzq d() {
      return this.b;
   }

   public static bzr a(bzq $$0) {
      return (bzr)a.get($$0);
   }
}
