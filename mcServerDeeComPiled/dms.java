import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class dms {
   public static final int a = 90;
   static final abb b = new abb("igloo/top");
   private static final abb c = new abb("igloo/middle");
   private static final abb d = new abb("igloo/bottom");
   static final Map<abb, gt> e = ImmutableMap.of(b, new gt(3, 5, 5), c, new gt(1, 3, 1), d, new gt(3, 6, 7));
   static final Map<abb, gt> f = ImmutableMap.of(b, gt.b, c, new gt(2, -3, 4), d, new gt(0, -3, -2));

   public static void a(dou $$0, gt $$1, cpw $$2, dlg $$3, amn $$4) {
      if ($$4.j() < 0.5) {
         int $$5 = $$4.a(8) + 4;
         $$3.a(new dms.a($$0, d, $$1, $$2, $$5 * 3));

         for(int $$6 = 0; $$6 < $$5 - 1; ++$$6) {
            $$3.a(new dms.a($$0, c, $$1, $$2, $$6 * 3));
         }
      }

      $$3.a(new dms.a($$0, b, $$1, $$2, 0));
   }

   public static class a extends dll {
      public a(dou $$0, abb $$1, gt $$2, cpw $$3, int $$4) {
         super(dls.I, 0, $$0, $$1, $$1.toString(), a($$3, $$1), a($$1, $$2, $$4));
      }

      public a(dou $$0, pj $$1) {
         super(dls.I, $$1, $$0, $$1x -> a(cpw.valueOf($$1.l("Rot")), $$1x));
      }

      private static dop a(cpw $$0, abb $$1) {
         return new dop().a($$0).a(coh.a).a((gt)dms.e.get($$1)).a(dnw.b);
      }

      private static gt a(abb $$0, gt $$1, int $$2) {
         return $$1.a((hs)dms.f.get($$0)).c($$2);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
      }

      @Override
      protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cju.a.m(), 3);
            cti $$5 = $$2.c_($$1.c());
            if ($$5 instanceof ctn) {
               ((ctn)$$5).a(dry.C, $$3.g());
            }

         }
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         abb $$7 = new abb(this.a);
         dop $$8 = a(this.c.d(), $$7);
         gt $$9 = (gt)dms.f.get($$7);
         gt $$10 = this.d.a(dot.a($$8, new gt(3 - $$9.u(), 0, -$$9.w())));
         int $$11 = $$0.a(dar.a.a, $$10.u(), $$10.w());
         gt $$12 = this.d;
         this.d = this.d.b(0, $$11 - 90 - 1, 0);
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
         if ($$7.equals(dms.b)) {
            gt $$13 = this.d.a(dot.a($$8, new gt(3, 0, 5)));
            cvo $$14 = $$0.a_($$13.c());
            if (!$$14.h() && !$$14.a(cju.cx)) {
               $$0.a($$13, cju.cY.m(), 3);
            }
         }

         this.d = $$12;
      }
   }
}
