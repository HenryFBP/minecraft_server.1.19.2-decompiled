import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmx {
   static final Logger b = LogUtils.getLogger();
   private static final int c = 3;
   private static final int d = 3;
   private static final int e = 5;
   private static final int f = 20;
   private static final int g = 50;
   private static final int h = 8;
   public static final int a = 50;

   private static dmx.c a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, @Nullable gy $$5, int $$6, dmy.a $$7) {
      int $$8 = $$1.a(100);
      if ($$8 >= 80) {
         dkt $$9 = dmx.b.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$9 != null) {
            return new dmx.b($$6, $$9, $$5, $$7);
         }
      } else if ($$8 >= 70) {
         dkt $$10 = dmx.e.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$10 != null) {
            return new dmx.e($$6, $$10, $$5, $$7);
         }
      } else {
         dkt $$11 = dmx.a.a($$0, $$1, $$2, $$3, $$4, $$5);
         if ($$11 != null) {
            return new dmx.a($$6, $$1, $$11, $$5, $$7);
         }
      }

      return null;
   }

   static dmx.c a(dlf $$0, dlg $$1, amn $$2, int $$3, int $$4, int $$5, gy $$6, int $$7) {
      if ($$7 > 8) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 80 && Math.abs($$5 - $$0.f().i()) <= 80) {
         dmy.a $$8 = ((dmx.c)$$0).a;
         dmx.c $$9 = a($$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1, $$8);
         if ($$9 != null) {
            $$1.a($$9);
            $$9.a($$0, $$1, $$2);
         }

         return $$9;
      } else {
         return null;
      }
   }

   public static class a extends dmx.c {
      private final boolean b;
      private final boolean c;
      private boolean d;
      private final int h;

      public a(pj $$0) {
         super(dls.a, $$0);
         this.b = $$0.q("hr");
         this.c = $$0.q("sc");
         this.d = $$0.q("hps");
         this.h = $$0.h("Num");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("hr", this.b);
         $$1.a("sc", this.c);
         $$1.a("hps", this.d);
         $$1.a("Num", this.h);
      }

      public a(int $$0, amn $$1, dkt $$2, gy $$3, dmy.a $$4) {
         super(dls.a, $$0, $$4, $$2);
         this.a($$3);
         this.b = $$1.a(3) == 0;
         this.c = !this.b && $$1.a(23) == 0;
         if (this.i().o() == gy.a.c) {
            this.h = $$2.e() / 5;
         } else {
            this.h = $$2.c() / 5;
         }

      }

      @Nullable
      public static dkt a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5) {
         for(int $$6 = $$1.a(3) + 2; $$6 > 0; --$$6) {
            int $$7 = $$6 * 5;

            dkt $$11 = switch($$5) {
               default -> new dkt(0, 0, -($$7 - 1), 2, 2, 0);
               case d -> new dkt(0, 0, 0, 2, 2, $$7 - 1);
               case e -> new dkt(-($$7 - 1), 0, 0, 0, 2, 2);
               case f -> new dkt(0, 0, 0, $$7 - 1, 2, 2);
            };
            $$11.a($$2, $$3, $$4);
            if ($$0.a($$11) == null) {
               return $$11;
            }
         }

         return null;
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         int $$3 = this.g();
         int $$4 = $$2.a(4);
         gy $$5 = this.i();
         if ($$5 != null) {
            switch($$5) {
               case c:
               default:
                  if ($$4 <= 1) {
                     dmx.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), gy.e, $$3);
                  } else {
                     dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), gy.f, $$3);
                  }
                  break;
               case d:
                  if ($$4 <= 1) {
                     dmx.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, $$5, $$3);
                  } else if ($$4 == 2) {
                     dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, gy.e, $$3);
                  } else {
                     dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.l() - 3, gy.f, $$3);
                  }
                  break;
               case e:
                  if ($$4 <= 1) {
                     dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dmx.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.i() - 1, gy.c, $$3);
                  } else {
                     dmx.a($$0, $$1, $$2, this.f.g(), this.f.h() - 1 + $$2.a(3), this.f.l() + 1, gy.d, $$3);
                  }
                  break;
               case f:
                  if ($$4 <= 1) {
                     dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() - 1 + $$2.a(3), this.f.i(), $$5, $$3);
                  } else if ($$4 == 2) {
                     dmx.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.i() - 1, gy.c, $$3);
                  } else {
                     dmx.a($$0, $$1, $$2, this.f.j() - 3, this.f.h() - 1 + $$2.a(3), this.f.l() + 1, gy.d, $$3);
                  }
            }
         }

         if ($$3 < 8) {
            if ($$5 != gy.c && $$5 != gy.d) {
               for(int $$8 = this.f.g() + 3; $$8 + 3 <= this.f.j(); $$8 += 5) {
                  int $$9 = $$2.a(5);
                  if ($$9 == 0) {
                     dmx.a($$0, $$1, $$2, $$8, this.f.h(), this.f.i() - 1, gy.c, $$3 + 1);
                  } else if ($$9 == 1) {
                     dmx.a($$0, $$1, $$2, $$8, this.f.h(), this.f.l() + 1, gy.d, $$3 + 1);
                  }
               }
            } else {
               for(int $$6 = this.f.i() + 3; $$6 + 3 <= this.f.l(); $$6 += 5) {
                  int $$7 = $$2.a(5);
                  if ($$7 == 0) {
                     dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), $$6, gy.e, $$3 + 1);
                  } else if ($$7 == 1) {
                     dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), $$6, gy.f, $$3 + 1);
                  }
               }
            }
         }

      }

      @Override
      protected boolean a(chp $$0, dkt $$1, amn $$2, int $$3, int $$4, int $$5, abb $$6) {
         gt $$7 = this.b($$3, $$4, $$5);
         if ($$1.b($$7) && $$0.a_($$7).h() && !$$0.a_($$7.c()).h()) {
            cvo $$8 = cju.cy.m().a(cpi.d, $$2.h() ? cws.a : cws.b);
            this.a($$0, $$8, $$3, $$4, $$5, $$1);
            bwa $$9 = new bwa($$0.D(), (double)$$7.u() + 0.5, (double)$$7.v() + 0.5, (double)$$7.w() + 0.5);
            $$9.a($$6, $$2.g());
            $$0.b($$9);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         if (!this.a($$0, $$4)) {
            int $$7 = 0;
            int $$8 = 2;
            int $$9 = 0;
            int $$10 = 2;
            int $$11 = this.h * 5 - 1;
            cvo $$12 = this.a.d();
            this.a($$0, $$4, 0, 0, 0, 2, 1, $$11, e, e, false);
            this.a($$0, $$4, $$3, 0.8F, 0, 2, 0, 2, 2, $$11, e, e, false, false);
            if (this.c) {
               this.a($$0, $$4, $$3, 0.6F, 0, 0, 0, 2, 1, $$11, cju.bf.m(), e, false, true);
            }

            for(int $$13 = 0; $$13 < this.h; ++$$13) {
               int $$14 = 2 + $$13 * 5;
               this.a($$0, $$4, 0, 0, $$14, 2, 2, $$3);
               this.a($$0, $$4, $$3, 0.1F, 0, 2, $$14 - 1);
               this.a($$0, $$4, $$3, 0.1F, 2, 2, $$14 - 1);
               this.a($$0, $$4, $$3, 0.1F, 0, 2, $$14 + 1);
               this.a($$0, $$4, $$3, 0.1F, 2, 2, $$14 + 1);
               this.a($$0, $$4, $$3, 0.05F, 0, 2, $$14 - 2);
               this.a($$0, $$4, $$3, 0.05F, 2, 2, $$14 - 2);
               this.a($$0, $$4, $$3, 0.05F, 0, 2, $$14 + 2);
               this.a($$0, $$4, $$3, 0.05F, 2, 2, $$14 + 2);
               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 2, 0, $$14 - 1, dry.u);
               }

               if ($$3.a(100) == 0) {
                  this.a($$0, $$4, $$3, 0, 0, $$14 + 1, dry.u);
               }

               if (this.c && !this.d) {
                  int $$15 = 1;
                  int $$16 = $$14 - 1 + $$3.a(3);
                  gt $$17 = this.b(1, 0, $$16);
                  if ($$4.b($$17) && this.b($$0, 1, 0, $$16, $$4)) {
                     this.d = true;
                     $$0.a($$17, cju.ce.m(), 2);
                     cti $$18 = $$0.c_($$17);
                     if ($$18 instanceof cun) {
                        ((cun)$$18).d().a(bbr.m);
                     }
                  }
               }
            }

            for(int $$19 = 0; $$19 <= 2; ++$$19) {
               for(int $$20 = 0; $$20 <= $$11; ++$$20) {
                  this.a($$0, $$4, $$12, $$19, -1, $$20);
               }
            }

            int $$21 = 2;
            this.a($$0, $$4, 0, -1, 2);
            if (this.h > 1) {
               int $$22 = $$11 - 2;
               this.a($$0, $$4, 0, -1, $$22);
            }

            if (this.b) {
               cvo $$23 = cju.cy.m().a(cpi.d, cws.a);

               for(int $$24 = 0; $$24 <= $$11; ++$$24) {
                  cvo $$25 = this.a($$0, 1, -1, $$24, $$4);
                  if (!$$25.h() && $$25.i($$0, this.b(1, -1, $$24))) {
                     float $$26 = this.b($$0, 1, 0, $$24, $$4) ? 0.7F : 0.9F;
                     this.a($$0, $$4, $$3, $$26, 1, 0, $$24, $$23);
                  }
               }
            }

         }
      }

      private void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4) {
         cvo $$5 = this.a.b();
         cvo $$6 = this.a.d();
         if (this.a($$0, $$2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2, $$3, $$4, $$1);
         }

         if (this.a($$0, $$2 + 2, $$3, $$4, $$1).a($$6.b())) {
            this.c($$0, $$5, $$2 + 2, $$3, $$4, $$1);
         }

      }

      @Override
      protected void b(chp $$0, cvo $$1, int $$2, int $$3, int $$4, dkt $$5) {
         gt.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();

            while(this.a($$0.a_($$6)) && $$6.v() > $$0.u_() + 1) {
               $$6.c(gy.a);
            }

            if (this.a($$0, $$6, $$0.a_($$6))) {
               while($$6.v() < $$7) {
                  $$6.c(gy.b);
                  $$0.a($$6, $$1, 2);
               }

            }
         }
      }

      protected void c(chp $$0, cvo $$1, int $$2, int $$3, int $$4, dkt $$5) {
         gt.a $$6 = this.b($$2, $$3, $$4);
         if ($$5.b($$6)) {
            int $$7 = $$6.v();
            int $$8 = 1;
            boolean $$9 = true;

            for(boolean $$10 = true; $$9 || $$10; ++$$8) {
               if ($$9) {
                  $$6.q($$7 - $$8);
                  cvo $$11 = $$0.a_($$6);
                  boolean $$12 = this.a($$11) && !$$11.a(cju.D);
                  if (!$$12 && this.a($$0, $$6, $$11)) {
                     a($$0, $$1, $$6, $$7 - $$8 + 1, $$7);
                     return;
                  }

                  $$9 = $$8 <= 20 && $$12 && $$6.v() > $$0.u_() + 1;
               }

               if ($$10) {
                  $$6.q($$7 + $$8);
                  cvo $$13 = $$0.a_($$6);
                  boolean $$14 = this.a($$13);
                  if (!$$14 && this.b($$0, $$6, $$13)) {
                     $$0.a($$6.q($$7 + 1), this.a.e(), 2);
                     a($$0, cju.ef.m(), $$6, $$7 + 2, $$7 + $$8);
                     return;
                  }

                  $$10 = $$8 <= 50 && $$14 && $$6.v() < $$0.ah() - 1;
               }
            }

         }
      }

      private static void a(chp $$0, cvo $$1, gt.a $$2, int $$3, int $$4) {
         for(int $$5 = $$3; $$5 < $$4; ++$$5) {
            $$0.a($$2.q($$5), $$1, 2);
         }

      }

      private boolean a(cha $$0, gt $$1, cvo $$2) {
         return $$2.d($$0, $$1, gy.b);
      }

      private boolean b(cha $$0, gt $$1, cvo $$2) {
         return cjt.a($$0, $$1, gy.a) && !($$2.b() instanceof cme);
      }

      private void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5, int $$6, amn $$7) {
         if (this.a($$0, $$1, $$2, $$6, $$5, $$4)) {
            cvo $$8 = this.a.d();
            cvo $$9 = this.a.e();
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5 - 1, $$4, $$9.a(cmg.d, Boolean.valueOf(true)), e, false);
            this.a($$0, $$1, $$6, $$3, $$4, $$6, $$5 - 1, $$4, $$9.a(cmg.b, Boolean.valueOf(true)), e, false);
            if ($$7.a(4) == 0) {
               this.a($$0, $$1, $$2, $$5, $$4, $$2, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$6, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
            } else {
               this.a($$0, $$1, $$2, $$5, $$4, $$6, $$5, $$4, $$8, e, false);
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 - 1, cju.cb.m().a(csh.a, gy.d));
               this.a($$0, $$1, $$7, 0.05F, $$2 + 1, $$5, $$4 + 1, cju.cb.m().a(csh.a, gy.c));
            }

         }
      }

      private void a(chp $$0, dkt $$1, amn $$2, float $$3, int $$4, int $$5, int $$6) {
         if (this.b($$0, $$4, $$5, $$6, $$1) && $$2.i() < $$3 && this.a($$0, $$1, $$4, $$5, $$6, 2)) {
            this.a($$0, cju.bf.m(), $$4, $$5, $$6, $$1);
         }

      }

      private boolean a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5) {
         gt.a $$6 = this.b($$2, $$3, $$4);
         int $$7 = 0;

         for(gy $$8 : gy.values()) {
            $$6.c($$8);
            if ($$1.b($$6) && $$0.a_($$6).d($$0, $$6, $$8.g()) && ++$$7 >= $$5) {
               return true;
            }

            $$6.c($$8.g());
         }

         return false;
      }
   }

   public static class b extends dmx.c {
      private final gy b;
      private final boolean c;

      public b(pj $$0) {
         super(dls.b, $$0);
         this.c = $$0.q("tf");
         this.b = gy.b($$0.h("D"));
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("tf", this.c);
         $$1.a("D", this.b.e());
      }

      public b(int $$0, dkt $$1, @Nullable gy $$2, dmy.a $$3) {
         super(dls.b, $$0, $$3, $$1);
         this.b = $$2;
         this.c = $$1.d() > 3;
      }

      @Nullable
      public static dkt a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5) {
         int $$6;
         if ($$1.a(4) == 0) {
            $$6 = 6;
         } else {
            $$6 = 2;
         }

         dkt $$11 = switch($$5) {
            default -> new dkt(-1, 0, -4, 3, $$6, 0);
            case d -> new dkt(-1, 0, 0, 3, $$6, 4);
            case e -> new dkt(-4, 0, -1, 0, $$6, 3);
            case f -> new dkt(0, 0, -1, 4, $$6, 3);
         };
         $$11.a($$2, $$3, $$4);
         return $$0.a($$11) != null ? null : $$11;
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         int $$3 = this.g();
         switch(this.b) {
            case c:
            default:
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, gy.c, $$3);
               dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, gy.e, $$3);
               dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, gy.f, $$3);
               break;
            case d:
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, gy.d, $$3);
               dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, gy.e, $$3);
               dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, gy.f, $$3);
               break;
            case e:
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, gy.c, $$3);
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, gy.d, $$3);
               dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i() + 1, gy.e, $$3);
               break;
            case f:
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.i() - 1, gy.c, $$3);
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h(), this.f.l() + 1, gy.d, $$3);
               dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i() + 1, gy.f, $$3);
         }

         if (this.c) {
            if ($$2.h()) {
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.i() - 1, gy.c, $$3);
            }

            if ($$2.h()) {
               dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + 3 + 1, this.f.i() + 1, gy.e, $$3);
            }

            if ($$2.h()) {
               dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + 3 + 1, this.f.i() + 1, gy.f, $$3);
            }

            if ($$2.h()) {
               dmx.a($$0, $$1, $$2, this.f.g() + 1, this.f.h() + 3 + 1, this.f.l() + 1, gy.d, $$3);
            }
         }

      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         if (!this.a($$0, $$4)) {
            cvo $$7 = this.a.d();
            if (this.c) {
               this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i(), this.f.j() - 1, this.f.h() + 3 - 1, this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.h(), this.f.i() + 1, this.f.j(), this.f.h() + 3 - 1, this.f.l() - 1, e, e, false);
               this.a($$0, $$4, this.f.g() + 1, this.f.k() - 2, this.f.i(), this.f.j() - 1, this.f.k(), this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.k() - 2, this.f.i() + 1, this.f.j(), this.f.k(), this.f.l() - 1, e, e, false);
               this.a($$0, $$4, this.f.g() + 1, this.f.h() + 3, this.f.i() + 1, this.f.j() - 1, this.f.h() + 3, this.f.l() - 1, e, e, false);
            } else {
               this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i(), this.f.j() - 1, this.f.k(), this.f.l(), e, e, false);
               this.a($$0, $$4, this.f.g(), this.f.h(), this.f.i() + 1, this.f.j(), this.f.k(), this.f.l() - 1, e, e, false);
            }

            this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.i() + 1, this.f.k());
            this.a($$0, $$4, this.f.g() + 1, this.f.h(), this.f.l() - 1, this.f.k());
            this.a($$0, $$4, this.f.j() - 1, this.f.h(), this.f.i() + 1, this.f.k());
            this.a($$0, $$4, this.f.j() - 1, this.f.h(), this.f.l() - 1, this.f.k());
            int $$8 = this.f.h() - 1;

            for(int $$9 = this.f.g(); $$9 <= this.f.j(); ++$$9) {
               for(int $$10 = this.f.i(); $$10 <= this.f.l(); ++$$10) {
                  this.a($$0, $$4, $$7, $$9, $$8, $$10);
               }
            }

         }
      }

      private void a(chp $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5) {
         if (!this.a($$0, $$2, $$5 + 1, $$4, $$1).h()) {
            this.a($$0, $$1, $$2, $$3, $$4, $$2, $$5, $$4, this.a.d(), e, false);
         }

      }
   }

   abstract static class c extends dlf {
      protected dmy.a a;

      public c(dls $$0, int $$1, dmy.a $$2, dkt $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      public c(dls $$0, pj $$1) {
         super($$0, $$1);
         this.a = dmy.a.a($$1.h("MST"));
      }

      @Override
      protected boolean a(cha $$0, int $$1, int $$2, int $$3, dkt $$4) {
         cvo $$5 = this.a($$0, $$1, $$2, $$3, $$4);
         return !$$5.a(this.a.d().b()) && !$$5.a(this.a.b().b()) && !$$5.a(this.a.e().b()) && !$$5.a(cju.ef);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         $$1.a("MST", this.a.ordinal());
      }

      protected boolean a(cgd $$0, dkt $$1, int $$2, int $$3, int $$4, int $$5) {
         for(int $$6 = $$2; $$6 <= $$3; ++$$6) {
            if (this.a($$0, $$6, $$4 + 1, $$5, $$1).h()) {
               return false;
            }
         }

         return true;
      }

      protected boolean a(cgy $$0, dkt $$1) {
         int $$2 = Math.max(this.f.g() - 1, $$1.g());
         int $$3 = Math.max(this.f.h() - 1, $$1.h());
         int $$4 = Math.max(this.f.i() - 1, $$1.i());
         int $$5 = Math.min(this.f.j() + 1, $$1.j());
         int $$6 = Math.min(this.f.k() + 1, $$1.k());
         int $$7 = Math.min(this.f.l() + 1, $$1.l());
         gt.a $$8 = new gt.a(($$2 + $$5) / 2, ($$3 + $$6) / 2, ($$4 + $$7) / 2);
         if ($$0.w($$8).a(akk.W)) {
            return true;
         } else {
            for(int $$9 = $$2; $$9 <= $$5; ++$$9) {
               for(int $$10 = $$4; $$10 <= $$7; ++$$10) {
                  if ($$0.a_($$8.d($$9, $$3, $$10)).d().a()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$9, $$6, $$10)).d().a()) {
                     return true;
                  }
               }
            }

            for(int $$11 = $$2; $$11 <= $$5; ++$$11) {
               for(int $$12 = $$3; $$12 <= $$6; ++$$12) {
                  if ($$0.a_($$8.d($$11, $$12, $$4)).d().a()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$11, $$12, $$7)).d().a()) {
                     return true;
                  }
               }
            }

            for(int $$13 = $$4; $$13 <= $$7; ++$$13) {
               for(int $$14 = $$3; $$14 <= $$6; ++$$14) {
                  if ($$0.a_($$8.d($$2, $$14, $$13)).d().a()) {
                     return true;
                  }

                  if ($$0.a_($$8.d($$5, $$14, $$13)).d().a()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      protected void a(chp $$0, dkt $$1, cvo $$2, int $$3, int $$4, int $$5) {
         if (this.b($$0, $$3, $$4, $$5, $$1)) {
            gt $$6 = this.b($$3, $$4, $$5);
            cvo $$7 = $$0.a_($$6);
            if (!$$7.d($$0, $$6, gy.b)) {
               $$0.a($$6, $$2, 2);
            }

         }
      }
   }

   public static class d extends dmx.c {
      private final List<dkt> b = Lists.newLinkedList();

      public d(int $$0, amn $$1, int $$2, int $$3, dmy.a $$4) {
         super(dls.c, $$0, $$4, new dkt($$2, 50, $$3, $$2 + 7 + $$1.a(6), 54 + $$1.a(6), $$3 + 7 + $$1.a(6)));
         this.a = $$4;
      }

      public d(pj $$0) {
         super(dls.c, $$0);
         dkt.a.listOf().parse(pu.a, $$0.c("Entrances", 11)).resultOrPartial(dmx.b::error).ifPresent(this.b::addAll);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         int $$3 = this.g();
         int $$4 = this.f.d() - 3 - 1;
         if ($$4 <= 0) {
            $$4 = 1;
         }

         int $$5;
         for($$5 = 0; $$5 < this.f.c(); $$5 += 4) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dmx.c $$6 = dmx.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.i() - 1, gy.c, $$3);
            if ($$6 != null) {
               dkt $$7 = $$6.f();
               this.b.add(new dkt($$7.g(), $$7.h(), this.f.i(), $$7.j(), $$7.k(), this.f.i() + 1));
            }
         }

         for($$5 = 0; $$5 < this.f.c(); $$5 += 4) {
            $$5 += $$2.a(this.f.c());
            if ($$5 + 3 > this.f.c()) {
               break;
            }

            dmx.c $$8 = dmx.a($$0, $$1, $$2, this.f.g() + $$5, this.f.h() + $$2.a($$4) + 1, this.f.l() + 1, gy.d, $$3);
            if ($$8 != null) {
               dkt $$9 = $$8.f();
               this.b.add(new dkt($$9.g(), $$9.h(), this.f.l() - 1, $$9.j(), $$9.k(), this.f.l()));
            }
         }

         for($$5 = 0; $$5 < this.f.e(); $$5 += 4) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dmx.c $$10 = dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, gy.e, $$3);
            if ($$10 != null) {
               dkt $$11 = $$10.f();
               this.b.add(new dkt(this.f.g(), $$11.h(), $$11.i(), this.f.g() + 1, $$11.k(), $$11.l()));
            }
         }

         for($$5 = 0; $$5 < this.f.e(); $$5 += 4) {
            $$5 += $$2.a(this.f.e());
            if ($$5 + 3 > this.f.e()) {
               break;
            }

            dlf $$12 = dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$2.a($$4) + 1, this.f.i() + $$5, gy.f, $$3);
            if ($$12 != null) {
               dkt $$13 = $$12.f();
               this.b.add(new dkt(this.f.j() - 1, $$13.h(), $$13.i(), this.f.j(), $$13.k(), $$13.l()));
            }
         }

      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, this.f.g(), this.f.h() + 1, this.f.i(), this.f.j(), Math.min(this.f.h() + 3, this.f.k()), this.f.l(), e, e, false);

            for(dkt $$7 : this.b) {
               this.a($$0, $$4, $$7.g(), $$7.k() - 2, $$7.i(), $$7.j(), $$7.k(), $$7.l(), e, e, false);
            }

            this.a($$0, $$4, this.f.g(), this.f.h() + 4, this.f.i(), this.f.j(), this.f.k(), this.f.l(), e, false);
         }
      }

      @Override
      public void a(int $$0, int $$1, int $$2) {
         super.a($$0, $$1, $$2);

         for(dkt $$3 : this.b) {
            $$3.a($$0, $$1, $$2);
         }

      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         dkt.a.listOf().encodeStart(pu.a, this.b).resultOrPartial(dmx.b::error).ifPresent($$1x -> $$1.a("Entrances", $$1x));
      }
   }

   public static class e extends dmx.c {
      public e(int $$0, dkt $$1, gy $$2, dmy.a $$3) {
         super(dls.d, $$0, $$3, $$1);
         this.a($$2);
      }

      public e(pj $$0) {
         super(dls.d, $$0);
      }

      @Nullable
      public static dkt a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5) {
         dkt $$9 = switch($$5) {
            default -> new dkt(0, -5, -8, 2, 2, 0);
            case d -> new dkt(0, -5, 0, 2, 2, 8);
            case e -> new dkt(-8, -5, 0, 0, 2, 2);
            case f -> new dkt(0, -5, 0, 8, 2, 2);
         };
         $$9.a($$2, $$3, $$4);
         return $$0.a($$9) != null ? null : $$9;
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         int $$3 = this.g();
         gy $$4 = this.i();
         if ($$4 != null) {
            switch($$4) {
               case c:
               default:
                  dmx.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.i() - 1, gy.c, $$3);
                  break;
               case d:
                  dmx.a($$0, $$1, $$2, this.f.g(), this.f.h(), this.f.l() + 1, gy.d, $$3);
                  break;
               case e:
                  dmx.a($$0, $$1, $$2, this.f.g() - 1, this.f.h(), this.f.i(), gy.e, $$3);
                  break;
               case f:
                  dmx.a($$0, $$1, $$2, this.f.j() + 1, this.f.h(), this.f.i(), gy.f, $$3);
            }
         }

      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         if (!this.a($$0, $$4)) {
            this.a($$0, $$4, 0, 5, 0, 2, 7, 1, e, e, false);
            this.a($$0, $$4, 0, 0, 7, 2, 2, 8, e, e, false);

            for(int $$7 = 0; $$7 < 5; ++$$7) {
               this.a($$0, $$4, 0, 5 - $$7 - ($$7 < 4 ? 1 : 0), 2 + $$7, 2, 7 - $$7, 2 + $$7, e, e, false);
            }

         }
      }
   }
}
