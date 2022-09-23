import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class byu extends ccd {
   private static final String b = "block.minecraft.banner.";

   public byu(cjt $$0, cjt $$1, cat.a $$2) {
      super($$0, $$1, $$2);
      Validate.isInstanceOf(cik.class, $$0);
      Validate.isInstanceOf(cik.class, $$1);
   }

   public static void a(cax $$0, List<rq> $$1) {
      pj $$2 = byx.a($$0);
      if ($$2 != null && $$2.e("Patterns")) {
         pp $$3 = $$2.c("Patterns", 10);

         for(int $$4 = 0; $$4 < $$3.size() && $$4 < 6; ++$$4) {
            pj $$5 = $$3.a($$4);
            bzq $$6 = bzq.a($$5.h("Color"));
            hc<csz> $$7 = csz.a($$5.l("Pattern"));
            if ($$7 != null) {
               $$7.e().map($$0x -> $$0x.a().e()).ifPresent($$2x -> $$1.add(rq.c("block.minecraft.banner." + $$2x + "." + $$6.b()).a(p.h)));
            }
         }

      }
   }

   public bzq b() {
      return ((cik)this.e()).b();
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      a($$0, $$2);
   }
}
