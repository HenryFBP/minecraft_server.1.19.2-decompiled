import com.google.common.collect.Lists;
import java.util.List;

public class dnf {
   private static final abb[] a = new abb[]{
      new abb("underwater_ruin/warm_1"),
      new abb("underwater_ruin/warm_2"),
      new abb("underwater_ruin/warm_3"),
      new abb("underwater_ruin/warm_4"),
      new abb("underwater_ruin/warm_5"),
      new abb("underwater_ruin/warm_6"),
      new abb("underwater_ruin/warm_7"),
      new abb("underwater_ruin/warm_8")
   };
   private static final abb[] b = new abb[]{
      new abb("underwater_ruin/brick_1"),
      new abb("underwater_ruin/brick_2"),
      new abb("underwater_ruin/brick_3"),
      new abb("underwater_ruin/brick_4"),
      new abb("underwater_ruin/brick_5"),
      new abb("underwater_ruin/brick_6"),
      new abb("underwater_ruin/brick_7"),
      new abb("underwater_ruin/brick_8")
   };
   private static final abb[] c = new abb[]{
      new abb("underwater_ruin/cracked_1"),
      new abb("underwater_ruin/cracked_2"),
      new abb("underwater_ruin/cracked_3"),
      new abb("underwater_ruin/cracked_4"),
      new abb("underwater_ruin/cracked_5"),
      new abb("underwater_ruin/cracked_6"),
      new abb("underwater_ruin/cracked_7"),
      new abb("underwater_ruin/cracked_8")
   };
   private static final abb[] d = new abb[]{
      new abb("underwater_ruin/mossy_1"),
      new abb("underwater_ruin/mossy_2"),
      new abb("underwater_ruin/mossy_3"),
      new abb("underwater_ruin/mossy_4"),
      new abb("underwater_ruin/mossy_5"),
      new abb("underwater_ruin/mossy_6"),
      new abb("underwater_ruin/mossy_7"),
      new abb("underwater_ruin/mossy_8")
   };
   private static final abb[] e = new abb[]{
      new abb("underwater_ruin/big_brick_1"),
      new abb("underwater_ruin/big_brick_2"),
      new abb("underwater_ruin/big_brick_3"),
      new abb("underwater_ruin/big_brick_8")
   };
   private static final abb[] f = new abb[]{
      new abb("underwater_ruin/big_mossy_1"),
      new abb("underwater_ruin/big_mossy_2"),
      new abb("underwater_ruin/big_mossy_3"),
      new abb("underwater_ruin/big_mossy_8")
   };
   private static final abb[] g = new abb[]{
      new abb("underwater_ruin/big_cracked_1"),
      new abb("underwater_ruin/big_cracked_2"),
      new abb("underwater_ruin/big_cracked_3"),
      new abb("underwater_ruin/big_cracked_8")
   };
   private static final abb[] h = new abb[]{
      new abb("underwater_ruin/big_warm_4"),
      new abb("underwater_ruin/big_warm_5"),
      new abb("underwater_ruin/big_warm_6"),
      new abb("underwater_ruin/big_warm_7")
   };

   private static abb a(amn $$0) {
      return ad.a(a, $$0);
   }

   private static abb b(amn $$0) {
      return ad.a(h, $$0);
   }

   public static void a(dou $$0, gt $$1, cpw $$2, dlg $$3, amn $$4, dng $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }

   }

   private static void a(dou $$0, amn $$1, cpw $$2, gt $$3, dng $$4, dlg $$5) {
      gt $$6 = new gt($$3.u(), 90, $$3.w());
      gt $$7 = dot.a(new gt(15, 0, 15), coh.a, $$2, gt.b).a($$6);
      dkt $$8 = dkt.a($$6, $$7);
      gt $$9 = new gt(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gt> $$10 = a($$1, $$9);
      int $$11 = ami.a($$1, 4, 8);

      for(int $$12 = 0; $$12 < $$11; ++$$12) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gt $$14 = (gt)$$10.remove($$13);
            cpw $$15 = cpw.a($$1);
            gt $$16 = dot.a(new gt(5, 0, 6), coh.a, $$15, gt.b).a($$14);
            dkt $$17 = dkt.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }

   }

   private static List<gt> a(amn $$0, gt $$1) {
      List<gt> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ami.a($$0, 1, 8), 0, 16 + ami.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ami.a($$0, 1, 8), 0, ami.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ami.a($$0, 1, 8), 0, -16 + ami.a($$0, 4, 8)));
      $$2.add($$1.b(ami.a($$0, 1, 7), 0, 16 + ami.a($$0, 1, 7)));
      $$2.add($$1.b(ami.a($$0, 1, 7), 0, -16 + ami.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ami.a($$0, 1, 7), 0, 16 + ami.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ami.a($$0, 1, 7), 0, ami.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ami.a($$0, 1, 7), 0, -16 + ami.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dou $$0, gt $$1, cpw $$2, dlg $$3, amn $$4, dng $$5, boolean $$6, float $$7) {
      switch($$5.e) {
         case a:
         default:
            abb $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dnf.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            abb[] $$9 = $$6 ? e : b;
            abb[] $$10 = $$6 ? g : c;
            abb[] $$11 = $$6 ? f : d;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dnf.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dnf.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dnf.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }

   }

   public static class a extends dll {
      private final dng.a h;
      private final float i;
      private final boolean j;

      public a(dou $$0, abb $$1, gt $$2, cpw $$3, float $$4, dng.a $$5, boolean $$6) {
         super(dls.H, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      public a(dou $$0, pj $$1) {
         super(dls.H, $$1, $$0, $$1x -> a(cpw.valueOf($$1.l("Rot"))));
         this.i = $$1.j("Integrity");
         this.h = dng.a.valueOf($$1.l("BiomeType"));
         this.j = $$1.q("IsLarge");
      }

      private static dop a(cpw $$0) {
         return new dop().a($$0).a(coh.a).a(dnw.d);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cju.cg.m().a(ckr.d, Boolean.valueOf($$2.b_($$1).a(akp.a))), 2);
            cti $$5 = $$2.c_($$1);
            if ($$5 instanceof ctn) {
               ((ctn)$$5).a(this.j ? dry.F : dry.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            bre $$6 = bbr.u.a((cgx)$$2.D());
            $$6.fp();
            $$6.a($$1, 0.0F, 0.0F);
            $$6.a($$2, $$2.d_($$1), bcg.d, null, null);
            $$2.a_($$6);
            if ($$1.v() > $$2.m_()) {
               $$2.a($$1, cju.a.m(), 2);
            } else {
               $$2.a($$1, cju.C.m(), 2);
            }
         }

      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.c.b().a(new dny(this.i)).a(dnw.d);
         int $$7 = $$0.a(dar.a.c, this.d.u(), this.d.w());
         this.d = new gt(this.d.u(), $$7, this.d.w());
         gt $$8 = dot.a(new gt(this.b.a().u() - 1, 0, this.b.a().w() - 1), coh.a, this.c.d(), gt.b).a(this.d);
         this.d = new gt(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gt $$0, cgd $$1, gt $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for(gt $$7 : gt.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gt.a $$11 = new gt.a($$8, $$10, $$9);
            cvo $$12 = $$1.a_($$11);

            for(dpv $$13 = $$1.b_($$11); ($$12.h() || $$13.a(akp.a) || $$12.a(akl.ah)) && $$10 > $$1.u_() + 1; $$13 = $$1.b_($$11)) {
               $$11.d($$8, --$$10, $$9);
               $$12 = $$1.a_($$11);
            }

            $$4 = Math.min($$4, $$10);
            if ($$10 < $$5 - 2) {
               ++$$6;
            }
         }

         int $$14 = Math.abs($$0.u() - $$2.u());
         if ($$5 - $$4 > 2 && $$6 > $$14 - 2) {
            $$3 = $$4 + 1;
         }

         return $$3;
      }
   }
}
