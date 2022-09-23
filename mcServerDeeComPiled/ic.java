import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ic extends ia {
   private static final Logger c = LogUtils.getLogger();

   @Override
   protected cax a(gu $$0, cax $$1) {
      this.a(false);
      cat $$2 = $$1.c();
      if ($$2 instanceof byx) {
         gy $$3 = $$0.e().c(clo.a);
         gt $$4 = $$0.d().a($$3);
         gy $$5 = $$0.g().x($$4.c()) ? $$3 : gy.b;

         try {
            this.a(((byx)$$2).a((ccx)(new ccy($$0.g(), $$4, $$3, $$1, $$5))).a());
         } catch (Exception var8) {
            c.error("Error trying to place shulker box at {}", $$4, var8);
         }
      }

      return $$1;
   }
}
