import java.util.List;
import javax.annotation.Nullable;

public class cag extends cat {
   public cag(cat.a $$0) {
      super($$0);
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      pj $$4 = $$0.b("Explosion");
      if ($$4 != null) {
         a($$4, $$2);
      }

   }

   public static void a(pj $$0, List<rq> $$1) {
      caf.a $$2 = caf.a.a($$0.f("Type"));
      $$1.add(rq.c("item.minecraft.firework_star.shape." + $$2.b()).a(p.h));
      int[] $$3 = $$0.n("Colors");
      if ($$3.length > 0) {
         $$1.add(a(rq.h().a(p.h), $$3));
      }

      int[] $$4 = $$0.n("FadeColors");
      if ($$4.length > 0) {
         $$1.add(a(rq.c("item.minecraft.firework_star.fade_to").f(" ").a(p.h), $$4));
      }

      if ($$0.q("Trail")) {
         $$1.add(rq.c("item.minecraft.firework_star.trail").a(p.h));
      }

      if ($$0.q("Flicker")) {
         $$1.add(rq.c("item.minecraft.firework_star.flicker").a(p.h));
      }

   }

   private static rq a(sb $$0, int[] $$1) {
      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1[$$2]));
      }

      return $$0;
   }

   private static rq a(int $$0) {
      bzq $$1 = bzq.b($$0);
      return $$1 == null ? rq.c("item.minecraft.firework_star.custom_color") : rq.c("item.minecraft.firework_star." + $$1.b());
   }
}
