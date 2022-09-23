import com.google.common.collect.Lists;
import java.util.List;

public class dmq {
   private static final int a = 8;
   static final dmq.b b = new dmq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dou $$0, int $$1, dmq.a $$2, gt $$3, List<dlf> $$4, amn $$5) {
         if ($$1 > 8) {
            return false;
         } else {
            cpw $$6 = $$2.e().d();
            dmq.a $$7 = dmq.a($$4, dmq.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 8, -1), "second_roof", $$6, false));
               dmq.a($$0, dmq.d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 0, -1), "second_floor_2", $$6, false));
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 4, -1), "third_floor_2", $$6, false));
               $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 8, -1), "third_roof", $$6, true));
               dmq.a($$0, dmq.d, $$1 + 1, $$7, null, $$4, $$5);
            }

            return true;
         }
      }
   };
   static final List<ane<cpw, gt>> c = Lists.newArrayList(
      new ane[]{
         new ane<>(cpw.a, new gt(1, -1, 0)), new ane<>(cpw.b, new gt(6, -1, 1)), new ane<>(cpw.d, new gt(0, -1, 5)), new ane<>(cpw.c, new gt(5, -1, 6))
      }
   );
   static final dmq.b d = new dmq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dou $$0, int $$1, dmq.a $$2, gt $$3, List<dlf> $$4, amn $$5) {
         cpw $$6 = $$2.e().d();
         dmq.a $$7 = dmq.a($$4, dmq.a($$0, $$2, new gt(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
         $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(0, 7, 0), "tower_piece", $$6, true));
         dmq.a $$8 = $$5.a(3) == 0 ? $$7 : null;
         int $$9 = 1 + $$5.a(3);

         for(int $$10 = 0; $$10 < $$9; ++$$10) {
            $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(0, 4, 0), "tower_piece", $$6, true));
            if ($$10 < $$9 - 1 && $$5.h()) {
               $$8 = $$7;
            }
         }

         if ($$8 != null) {
            for(ane<cpw, gt> $$11 : dmq.c) {
               if ($$5.h()) {
                  dmq.a $$12 = dmq.a($$4, dmq.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                  dmq.a($$0, dmq.e, $$1 + 1, $$12, null, $$4, $$5);
               }
            }

            $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 4, -1), "tower_top", $$6, true));
         } else {
            if ($$1 != 7) {
               return dmq.a($$0, dmq.g, $$1 + 1, $$7, null, $$4, $$5);
            }

            $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-1, 4, -1), "tower_top", $$6, true));
         }

         return true;
      }
   };
   static final dmq.b e = new dmq.b() {
      public boolean a;

      @Override
      public void a() {
         this.a = false;
      }

      @Override
      public boolean a(dou $$0, int $$1, dmq.a $$2, gt $$3, List<dlf> $$4, amn $$5) {
         cpw $$6 = $$2.e().d();
         int $$7 = $$5.a(4) + 1;
         dmq.a $$8 = dmq.a($$4, dmq.a($$0, $$2, new gt(0, 0, -4), "bridge_piece", $$6, true));
         $$8.a(-1);
         int $$9 = 0;

         for(int $$10 = 0; $$10 < $$7; ++$$10) {
            if ($$5.h()) {
               $$8 = dmq.a($$4, dmq.a($$0, $$8, new gt(0, $$9, -4), "bridge_piece", $$6, true));
               $$9 = 0;
            } else {
               if ($$5.h()) {
                  $$8 = dmq.a($$4, dmq.a($$0, $$8, new gt(0, $$9, -4), "bridge_steep_stairs", $$6, true));
               } else {
                  $$8 = dmq.a($$4, dmq.a($$0, $$8, new gt(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
               }

               $$9 = 4;
            }
         }

         if (!this.a && $$5.a(10 - $$1) == 0) {
            dmq.a($$4, dmq.a($$0, $$8, new gt(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
            this.a = true;
         } else if (!dmq.a($$0, dmq.b, $$1 + 1, $$8, new gt(-3, $$9 + 1, -11), $$4, $$5)) {
            return false;
         }

         $$8 = dmq.a($$4, dmq.a($$0, $$8, new gt(4, $$9, 0), "bridge_end", $$6.a(cpw.c), true));
         $$8.a(-1);
         return true;
      }
   };
   static final List<ane<cpw, gt>> f = Lists.newArrayList(
      new ane[]{
         new ane<>(cpw.a, new gt(4, -1, 0)), new ane<>(cpw.b, new gt(12, -1, 4)), new ane<>(cpw.d, new gt(0, -1, 8)), new ane<>(cpw.c, new gt(8, -1, 12))
      }
   );
   static final dmq.b g = new dmq.b() {
      @Override
      public void a() {
      }

      @Override
      public boolean a(dou $$0, int $$1, dmq.a $$2, gt $$3, List<dlf> $$4, amn $$5) {
         cpw $$6 = $$2.e().d();
         dmq.a $$7 = dmq.a($$4, dmq.a($$0, $$2, new gt(-3, 4, -3), "fat_tower_base", $$6, true));
         $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(0, 4, 0), "fat_tower_middle", $$6, true));

         for(int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; ++$$8) {
            $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(0, 8, 0), "fat_tower_middle", $$6, true));

            for(ane<cpw, gt> $$9 : dmq.f) {
               if ($$5.h()) {
                  dmq.a $$10 = dmq.a($$4, dmq.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                  dmq.a($$0, dmq.e, $$1 + 1, $$10, null, $$4, $$5);
               }
            }
         }

         $$7 = dmq.a($$4, dmq.a($$0, $$7, new gt(-2, 8, -2), "fat_tower_top", $$6, true));
         return true;
      }
   };

   static dmq.a a(dou $$0, dmq.a $$1, gt $$2, String $$3, cpw $$4, boolean $$5) {
      dmq.a $$6 = new dmq.a($$0, $$3, $$1.d(), $$4, $$5);
      gt $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), gt.b);
      $$6.a($$7.u(), $$7.v(), $$7.w());
      return $$6;
   }

   public static void a(dou $$0, gt $$1, cpw $$2, List<dlf> $$3, amn $$4) {
      g.a();
      b.a();
      e.a();
      d.a();
      dmq.a $$5 = a($$3, new dmq.a($$0, "base_floor", $$1, $$2, true));
      $$5 = a($$3, a($$0, $$5, new gt(-1, 0, -1), "second_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gt(-1, 4, -1), "third_floor_1", $$2, false));
      $$5 = a($$3, a($$0, $$5, new gt(-1, 8, -1), "third_roof", $$2, true));
      a($$0, d, 1, $$5, null, $$3, $$4);
   }

   static dmq.a a(List<dlf> $$0, dmq.a $$1) {
      $$0.add($$1);
      return $$1;
   }

   static boolean a(dou $$0, dmq.b $$1, int $$2, dmq.a $$3, gt $$4, List<dlf> $$5, amn $$6) {
      if ($$2 > 8) {
         return false;
      } else {
         List<dlf> $$7 = Lists.newArrayList();
         if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();

            for(dlf $$10 : $$7) {
               $$10.a($$9);
               dlf $$11 = dlf.a($$5, $$10.f());
               if ($$11 != null && $$11.g() != $$3.g()) {
                  $$8 = true;
                  break;
               }
            }

            if (!$$8) {
               $$5.addAll($$7);
               return true;
            }
         }

         return false;
      }
   }

   public static class a extends dll {
      public a(dou $$0, String $$1, gt $$2, cpw $$3, boolean $$4) {
         super(dls.Y, 0, $$0, a($$1), $$1, a($$4, $$3), $$2);
      }

      public a(dou $$0, pj $$1) {
         super(dls.Y, $$1, $$0, $$1x -> a($$1.q("OW"), cpw.valueOf($$1.l("Rot"))));
      }

      private static dop a(boolean $$0, cpw $$1) {
         dnw $$2 = $$0 ? dnw.b : dnw.d;
         return new dop().a(true).a($$2).a($$1);
      }

      @Override
      protected abb b() {
         return a(this.a);
      }

      private static abb a(String $$0) {
         return new abb("end_city/" + $$0);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("OW", this.c.i().get(0) == dnw.b);
      }

      @Override
      protected void a(String $$0, gt $$1, chm $$2, amn $$3, dkt $$4) {
         if ($$0.startsWith("Chest")) {
            gt $$5 = $$1.c();
            if ($$4.b($$5)) {
               cuf.a($$2, $$3, $$5, dry.c);
            }
         } else if ($$4.b($$1) && cgx.k($$1)) {
            if ($$0.startsWith("Sentry")) {
               brw $$6 = bbr.aB.a((cgx)$$2.D());
               $$6.e((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5);
               $$2.b($$6);
            } else if ($$0.startsWith("Elytra")) {
               bqo $$7 = new bqo($$2.D(), $$1, this.c.d().a(gy.d));
               $$7.a(new cax(caz.mv), false);
               $$2.b($$7);
            }
         }

      }
   }

   interface b {
      void a();

      boolean a(dou var1, int var2, dmq.a var3, gt var4, List<dlf> var5, amn var6);
   }
}
