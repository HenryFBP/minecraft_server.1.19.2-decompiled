import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzk extends cbm implements cco {
   private static final String b = "Charged";
   private static final String e = "ChargedProjectiles";
   private static final int f = 25;
   public static final int a = 8;
   private boolean g = false;
   private boolean h = false;
   private static final float i = 0.2F;
   private static final float j = 0.5F;
   private static final float r = 3.15F;
   private static final float s = 1.6F;

   public bzk(cat.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cax> e() {
      return d;
   }

   @Override
   public Predicate<cax> b() {
      return c;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if (d($$3)) {
         a($$0, $$1, $$2, $$3, o($$3), 1.0F);
         a($$3, false);
         return bak.b($$3);
      } else if (!$$1.h($$3).b()) {
         if (!d($$3)) {
            this.g = false;
            this.h = false;
            $$1.c($$2);
         }

         return bak.b($$3);
      } else {
         return bak.d($$3);
      }
   }

   private static float o(cax $$0) {
      return a($$0, caz.sq) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cax $$0, cgx $$1, bcc $$2, int $$3) {
      int $$4 = this.b($$0) - $$3;
      float $$5 = a($$4, $$0);
      if ($$5 >= 1.0F && !d($$0) && a($$2, $$0)) {
         a($$0, true);
         ajx $$6 = $$2 instanceof buc ? ajx.h : ajx.f;
         $$1.a(null, $$2.df(), $$2.dh(), $$2.dl(), ajw.dR, $$6, 1.0F, 1.0F / ($$1.r_().i() * 0.5F + 1.0F) + 0.2F);
      }

   }

   private static boolean a(bcc $$0, cax $$1) {
      int $$2 = cet.a(cev.I, $$1);
      int $$3 = $$2 == 0 ? 1 : 3;
      boolean $$4 = $$0 instanceof buc && ((buc)$$0).fB().d;
      cax $$5 = $$0.h($$1);
      cax $$6 = $$5.o();

      for(int $$7 = 0; $$7 < $$3; ++$$7) {
         if ($$7 > 0) {
            $$5 = $$6.o();
         }

         if ($$5.b() && $$4) {
            $$5 = new cax(caz.mR);
            $$6 = $$5.o();
         }

         if (!a($$0, $$1, $$5, $$7 > 0, $$4)) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(bcc $$0, cax $$1, cax $$2, boolean $$3, boolean $$4) {
      if ($$2.b()) {
         return false;
      } else {
         boolean $$5 = $$4 && $$2.c() instanceof bys;
         cax $$6;
         if (!$$5 && !$$4 && !$$3) {
            $$6 = $$2.a(1);
            if ($$2.b() && $$0 instanceof buc) {
               ((buc)$$0).fA().g($$2);
            }
         } else {
            $$6 = $$2.o();
         }

         b($$1, $$6);
         return true;
      }
   }

   public static boolean d(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null && $$1.q("Charged");
   }

   public static void a(cax $$0, boolean $$1) {
      pj $$2 = $$0.v();
      $$2.a("Charged", $$1);
   }

   private static void b(cax $$0, cax $$1) {
      pj $$2 = $$0.v();
      pp $$3;
      if ($$2.b("ChargedProjectiles", 9)) {
         $$3 = $$2.c("ChargedProjectiles", 10);
      } else {
         $$3 = new pp();
      }

      pj $$5 = new pj();
      $$1.b($$5);
      $$3.add($$5);
      $$2.a("ChargedProjectiles", (qc)$$3);
   }

   private static List<cax> p(cax $$0) {
      List<cax> $$1 = Lists.newArrayList();
      pj $$2 = $$0.u();
      if ($$2 != null && $$2.b("ChargedProjectiles", 9)) {
         pp $$3 = $$2.c("ChargedProjectiles", 10);
         if ($$3 != null) {
            for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
               pj $$5 = $$3.a($$4);
               $$1.add(cax.a($$5));
            }
         }
      }

      return $$1;
   }

   private static void q(cax $$0) {
      pj $$1 = $$0.u();
      if ($$1 != null) {
         pp $$2 = $$1.c("ChargedProjectiles", 9);
         $$2.clear();
         $$1.a("ChargedProjectiles", (qc)$$2);
      }

   }

   public static boolean a(cax $$0, cat $$1) {
      return p($$0).stream().anyMatch($$1x -> $$1x.a($$1));
   }

   private static void a(cgx $$0, bcc $$1, bai $$2, cax $$3, cax $$4, float $$5, boolean $$6, float $$7, float $$8, float $$9) {
      if (!$$0.y) {
         boolean $$10 = $$4.a(caz.sq);
         buu $$11;
         if ($$10) {
            $$11 = new bup($$0, $$4, $$1, $$1.df(), $$1.dj() - 0.15F, $$1.dl(), true);
         } else {
            $$11 = a($$0, $$1, $$3, $$4);
            if ($$6 || $$9 != 0.0F) {
               ((bui)$$11).d = bui.a.c;
            }
         }

         if ($$1 instanceof brd $$13) {
            $$13.a($$13.G(), $$3, $$11, $$9);
         } else {
            dwq $$14 = $$1.h(1.0F);
            g $$15 = new g(new k($$14), $$9, true);
            dwq $$16 = $$1.e(1.0F);
            k $$17 = new k($$16);
            $$17.a($$15);
            $$11.c((double)$$17.a(), (double)$$17.b(), (double)$$17.c(), $$7, $$8);
         }

         $$3.a($$10 ? 3 : 1, $$1, $$1x -> $$1x.d($$2));
         $$0.b($$11);
         $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), ajw.dX, ajx.h, 1.0F, $$5);
      }
   }

   private static bui a(cgx $$0, bcc $$1, cax $$2, cax $$3) {
      bys $$4 = (bys)($$3.c() instanceof bys ? $$3.c() : caz.mR);
      bui $$5 = $$4.a($$0, $$3, $$1);
      if ($$1 instanceof buc) {
         $$5.a(true);
      }

      $$5.b(ajw.dQ);
      $$5.q(true);
      int $$6 = cet.a(cev.K, $$2);
      if ($$6 > 0) {
         $$5.b((byte)$$6);
      }

      return $$5;
   }

   public static void a(cgx $$0, bcc $$1, bai $$2, cax $$3, float $$4, float $$5) {
      List<cax> $$6 = p($$3);
      float[] $$7 = a($$1.dQ());

      for(int $$8 = 0; $$8 < $$6.size(); ++$$8) {
         cax $$9 = (cax)$$6.get($$8);
         boolean $$10 = $$1 instanceof buc && ((buc)$$1).fB().d;
         if (!$$9.b()) {
            if ($$8 == 0) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 0.0F);
            } else if ($$8 == 1) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, -10.0F);
            } else if ($$8 == 2) {
               a($$0, $$1, $$2, $$3, $$9, $$7[$$8], $$10, $$4, $$5, 10.0F);
            }
         }
      }

      a($$0, $$1, $$3);
   }

   private static float[] a(amn $$0) {
      boolean $$1 = $$0.h();
      return new float[]{1.0F, a($$1, $$0), a(!$$1, $$0)};
   }

   private static float a(boolean $$0, amn $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   private static void a(cgx $$0, bcc $$1, cax $$2) {
      if ($$1 instanceof agh $$3) {
         if (!$$0.y) {
            aj.F.a($$3, $$2);
         }

         $$3.b(akg.c.b($$2.c()));
      }

      q($$2);
   }

   @Override
   public void a(cgx $$0, bcc $$1, cax $$2, int $$3) {
      if (!$$0.y) {
         int $$4 = cet.a(cev.J, $$2);
         ajv $$5 = this.a($$4);
         ajv $$6 = $$4 == 0 ? ajw.dS : null;
         float $$7 = (float)($$2.q() - $$3) / (float)k($$2);
         if ($$7 < 0.2F) {
            this.g = false;
            this.h = false;
         }

         if ($$7 >= 0.2F && !this.g) {
            this.g = true;
            $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), $$5, ajx.h, 0.5F, 1.0F);
         }

         if ($$7 >= 0.5F && $$6 != null && !this.h) {
            this.h = true;
            $$0.a(null, $$1.df(), $$1.dh(), $$1.dl(), $$6, ajx.h, 0.5F, 1.0F);
         }
      }

   }

   @Override
   public int b(cax $$0) {
      return k($$0) + 3;
   }

   public static int k(cax $$0) {
      int $$1 = cet.a(cev.J, $$0);
      return $$1 == 0 ? 25 : 25 - 5 * $$1;
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.g;
   }

   private ajv a(int $$0) {
      switch($$0) {
         case 1:
            return ajw.dU;
         case 2:
            return ajw.dV;
         case 3:
            return ajw.dW;
         default:
            return ajw.dT;
      }
   }

   private static float a(int $$0, cax $$1) {
      float $$2 = (float)$$0 / (float)k($$1);
      if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return $$2;
   }

   @Override
   public void a(cax $$0, @Nullable cgx $$1, List<rq> $$2, ccl $$3) {
      List<cax> $$4 = p($$0);
      if (d($$0) && !$$4.isEmpty()) {
         cax $$5 = (cax)$$4.get(0);
         $$2.add(rq.c("item.minecraft.crossbow.projectile").f(" ").b($$5.I()));
         if ($$3.a() && $$5.a(caz.sq)) {
            List<rq> $$6 = Lists.newArrayList();
            caz.sq.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for(int $$7 = 0; $$7 < $$6.size(); ++$$7) {
                  $$6.set($$7, rq.b("  ").b((rq)$$6.get($$7)).a(p.h));
               }

               $$2.addAll($$6);
            }
         }

      }
   }

   @Override
   public boolean l(cax $$0) {
      return $$0.a(this);
   }

   @Override
   public int d() {
      return 8;
   }
}
