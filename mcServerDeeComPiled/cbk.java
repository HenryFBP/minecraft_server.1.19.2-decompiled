import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.StringUtils;

public class cbk extends ccd {
   public static final String b = "SkullOwner";

   public cbk(cjt $$0, cjt $$1, cat.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public rq m(cax $$0) {
      if ($$0.a(caz.sk) && $$0.t()) {
         String $$1 = null;
         pj $$2 = $$0.u();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            pj $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return rq.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if ($$0.b("SkullOwner", 8) && !StringUtils.isBlank($$0.l("SkullOwner"))) {
         GameProfile $$1 = new GameProfile(null, $$0.l("SkullOwner"));
         cul.a($$1, $$1x -> $$0.a("SkullOwner", (qc)pv.a(new pj(), $$1x)));
      }

   }
}
