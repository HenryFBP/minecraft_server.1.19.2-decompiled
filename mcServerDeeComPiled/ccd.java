import java.util.Map;
import javax.annotation.Nullable;

public class ccd extends byx {
   protected final cjt c;

   public ccd(cjt $$0, cjt $$1, cat.a $$2) {
      super($$0, $$2);
      this.c = $$1;
   }

   @Nullable
   @Override
   protected cvo c(ccx $$0) {
      cvo $$1 = this.c.a($$0);
      cvo $$2 = null;
      cha $$3 = $$0.q();
      gt $$4 = $$0.a();

      for(gy $$5 : $$0.f()) {
         if ($$5 != gy.b) {
            cvo $$6 = $$5 == gy.a ? this.e().a($$0) : $$1;
            if ($$6 != null && $$6.a($$3, $$4)) {
               $$2 = $$6;
               break;
            }
         }
      }

      return $$2 != null && $$3.a($$2, $$4, dwv.a()) ? $$2 : null;
   }

   @Override
   public void a(Map<cjt, cat> $$0, cat $$1) {
      super.a($$0, $$1);
      $$0.put(this.c, $$1);
   }
}
