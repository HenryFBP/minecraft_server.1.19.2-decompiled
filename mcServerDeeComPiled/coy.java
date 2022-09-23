import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class coy extends cqm {
   protected coy(cvn.c $$0) {
      super(cqm.b.c, $$0);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cti $$5 = $$0.c_($$1);
      if ($$5 instanceof cul $$6) {
         GameProfile $$7 = null;
         if ($$4.t()) {
            pj $$8 = $$4.u();
            if ($$8.b("SkullOwner", 10)) {
               $$7 = pv.a($$8.p("SkullOwner"));
            } else if ($$8.b("SkullOwner", 8) && !StringUtils.isBlank($$8.l("SkullOwner"))) {
               $$7 = new GameProfile(null, $$8.l("SkullOwner"));
            }
         }

         $$6.a($$7);
      }

   }
}
