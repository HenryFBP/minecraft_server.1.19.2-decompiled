import java.util.List;
import javax.annotation.Nullable;

public class cck extends bys {
   public cck(cat.a $$0) {
      super($$0);
   }

   @Override
   public cax Q_() {
      return ccu.a(super.Q_(), ccv.D);
   }

   @Override
   public void a(bzj $$0, hi<cax> $$1) {
      if (this.a($$0)) {
         for(ccs $$2 : hm.Z) {
            if (!$$2.a().isEmpty()) {
               $$1.add(ccu.a(new cax(this), $$2));
            }
         }
      }

   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      ccu.a($$0, $$2, 0.125F);
   }

   @Override
   public String j(cax $$0) {
      return ccu.d($$0).b(this.a() + ".effect.");
   }
}
