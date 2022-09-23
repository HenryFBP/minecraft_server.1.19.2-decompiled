import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dnl {
   private static final int b = 3;
   private static final int c = 3;
   private static final int d = 50;
   private static final int e = 10;
   private static final boolean f = true;
   public static final int a = 64;
   private static final dnl.f[] g = new dnl.f[]{
      new dnl.f(dnl.n.class, 40, 0),
      new dnl.f(dnl.h.class, 5, 5),
      new dnl.f(dnl.d.class, 20, 0),
      new dnl.f(dnl.i.class, 20, 0),
      new dnl.f(dnl.j.class, 10, 6),
      new dnl.f(dnl.o.class, 5, 5),
      new dnl.f(dnl.l.class, 5, 5),
      new dnl.f(dnl.c.class, 5, 4),
      new dnl.f(dnl.a.class, 5, 4),
      new dnl.f(dnl.e.class, 10, 2) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 4;
         }
      },
      new dnl.f(dnl.g.class, 20, 1) {
         @Override
         public boolean a(int $$0) {
            return super.a($$0) && $$0 > 5;
         }
      }
   };
   private static List<dnl.f> h;
   static Class<? extends dnl.p> i;
   private static int j;
   static final dnl.k k = new dnl.k();

   public static void a() {
      h = Lists.newArrayList();

      for(dnl.f $$0 : g) {
         $$0.c = 0;
         h.add($$0);
      }

      i = null;
   }

   private static boolean b() {
      boolean $$0 = false;
      j = 0;

      for(dnl.f $$1 : h) {
         if ($$1.d > 0 && $$1.c < $$1.d) {
            $$0 = true;
         }

         j += $$1.b;
      }

      return $$0;
   }

   private static dnl.p a(Class<? extends dnl.p> $$0, dlg $$1, amn $$2, int $$3, int $$4, int $$5, @Nullable gy $$6, int $$7) {
      dnl.p $$8 = null;
      if ($$0 == dnl.n.class) {
         $$8 = dnl.n.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.h.class) {
         $$8 = dnl.h.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.d.class) {
         $$8 = dnl.d.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.i.class) {
         $$8 = dnl.i.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.j.class) {
         $$8 = dnl.j.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.o.class) {
         $$8 = dnl.o.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.l.class) {
         $$8 = dnl.l.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.c.class) {
         $$8 = dnl.c.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.a.class) {
         $$8 = dnl.a.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.e.class) {
         $$8 = dnl.e.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else if ($$0 == dnl.g.class) {
         $$8 = dnl.g.a($$1, $$3, $$4, $$5, $$6, $$7);
      }

      return $$8;
   }

   private static dnl.p a(dnl.m $$0, dlg $$1, amn $$2, int $$3, int $$4, int $$5, gy $$6, int $$7) {
      if (!b()) {
         return null;
      } else {
         if (i != null) {
            dnl.p $$8 = a(i, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            i = null;
            if ($$8 != null) {
               return $$8;
            }
         }

         int $$9 = 0;

         while($$9 < 5) {
            ++$$9;
            int $$10 = $$2.a(j);

            for(dnl.f $$11 : h) {
               $$10 -= $$11.b;
               if ($$10 < 0) {
                  if (!$$11.a($$7) || $$11 == $$0.a) {
                     break;
                  }

                  dnl.p $$12 = a($$11.a, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
                  if ($$12 != null) {
                     ++$$11.c;
                     $$0.a = $$11;
                     if (!$$11.a()) {
                        h.remove($$11);
                     }

                     return $$12;
                  }
               }
            }
         }

         dkt $$13 = dnl.b.a($$1, $$2, $$3, $$4, $$5, $$6);
         return $$13 != null && $$13.h() > 1 ? new dnl.b($$7, $$13, $$6) : null;
      }
   }

   static dlf b(dnl.m $$0, dlg $$1, amn $$2, int $$3, int $$4, int $$5, @Nullable gy $$6, int $$7) {
      if ($$7 > 50) {
         return null;
      } else if (Math.abs($$3 - $$0.f().g()) <= 112 && Math.abs($$5 - $$0.f().i()) <= 112) {
         dlf $$8 = a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7 + 1);
         if ($$8 != null) {
            $$1.a($$8);
            $$0.c.add($$8);
         }

         return $$8;
      } else {
         return null;
      }
   }

   public static class a extends dnl.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private boolean d;

      public a(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.t, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public a(pj $$0) {
         super(dls.t, $$0);
         this.d = $$0.q("Chest");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Chest", this.d);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         this.a((dnl.m)$$0, $$1, $$2, 1, 1);
      }

      public static dnl.a a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.a($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dnl.p.a.a, 1, 1, 6);
         this.a($$0, $$4, 3, 1, 2, 3, 1, 4, cju.dP.m(), cju.dP.m(), false);
         this.a($$0, cju.iF.m(), 3, 1, 1, $$4);
         this.a($$0, cju.iF.m(), 3, 1, 5, $$4);
         this.a($$0, cju.iF.m(), 3, 2, 2, $$4);
         this.a($$0, cju.iF.m(), 3, 2, 4, $$4);

         for(int $$7 = 2; $$7 <= 4; ++$$7) {
            this.a($$0, cju.iF.m(), 2, 1, $$7, $$4);
         }

         if (!this.d && $$4.b(this.b(3, 2, 3))) {
            this.d = true;
            this.a($$0, $$4, $$3, 3, 2, 3, dry.y);
         }

      }
   }

   public static class b extends dnl.p {
      private final int a;

      public b(int $$0, dkt $$1, gy $$2) {
         super(dls.u, $$0, $$1);
         this.a($$2);
         this.a = $$2 != gy.c && $$2 != gy.d ? $$1.c() : $$1.e();
      }

      public b(pj $$0) {
         super(dls.u, $$0);
         this.a = $$0.h("Steps");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Steps", this.a);
      }

      public static dkt a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5) {
         int $$6 = 3;
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 4, $$5);
         dlf $$8 = $$0.a($$7);
         if ($$8 == null) {
            return null;
         } else {
            if ($$8.f().h() == $$7.h()) {
               for(int $$9 = 2; $$9 >= 1; --$$9) {
                  $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9, $$5);
                  if (!$$8.f().a($$7)) {
                     return dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, $$9 + 1, $$5);
                  }
               }
            }

            return null;
         }
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         for(int $$7 = 0; $$7 < this.a; ++$$7) {
            this.a($$0, cju.dP.m(), 0, 0, $$7, $$4);
            this.a($$0, cju.dP.m(), 1, 0, $$7, $$4);
            this.a($$0, cju.dP.m(), 2, 0, $$7, $$4);
            this.a($$0, cju.dP.m(), 3, 0, $$7, $$4);
            this.a($$0, cju.dP.m(), 4, 0, $$7, $$4);

            for(int $$8 = 1; $$8 <= 3; ++$$8) {
               this.a($$0, cju.dP.m(), 0, $$8, $$7, $$4);
               this.a($$0, cju.lN.m(), 1, $$8, $$7, $$4);
               this.a($$0, cju.lN.m(), 2, $$8, $$7, $$4);
               this.a($$0, cju.lN.m(), 3, $$8, $$7, $$4);
               this.a($$0, cju.dP.m(), 4, $$8, $$7, $$4);
            }

            this.a($$0, cju.dP.m(), 0, 4, $$7, $$4);
            this.a($$0, cju.dP.m(), 1, 4, $$7, $$4);
            this.a($$0, cju.dP.m(), 2, 4, $$7, $$4);
            this.a($$0, cju.dP.m(), 3, 4, $$7, $$4);
            this.a($$0, cju.dP.m(), 4, 4, $$7, $$4);
         }

      }
   }

   public static class c extends dnl.p {
      protected static final int a = 10;
      protected static final int b = 9;
      protected static final int c = 11;
      private final boolean d;
      private final boolean i;
      private final boolean j;
      private final boolean k;

      public c(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.v, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.h();
         this.i = $$1.h();
         this.j = $$1.h();
         this.k = $$1.a(3) > 0;
      }

      public c(pj $$0) {
         super(dls.v, $$0);
         this.d = $$0.q("leftLow");
         this.i = $$0.q("leftHigh");
         this.j = $$0.q("rightLow");
         this.k = $$0.q("rightHigh");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("leftLow", this.d);
         $$1.a("leftHigh", this.i);
         $$1.a("rightLow", this.j);
         $$1.a("rightHigh", this.k);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         int $$3 = 3;
         int $$4 = 5;
         gy $$5 = this.i();
         if ($$5 == gy.e || $$5 == gy.c) {
            $$3 = 8 - $$3;
            $$4 = 8 - $$4;
         }

         this.a((dnl.m)$$0, $$1, $$2, 5, 1);
         if (this.d) {
            this.b((dnl.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.i) {
            this.b((dnl.m)$$0, $$1, $$2, $$4, 7);
         }

         if (this.j) {
            this.c((dnl.m)$$0, $$1, $$2, $$3, 1);
         }

         if (this.k) {
            this.c((dnl.m)$$0, $$1, $$2, $$4, 7);
         }

      }

      public static dnl.c a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -4, -3, 0, 10, 9, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.c($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 9, 8, 10, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 4, 3, 0);
         if (this.d) {
            this.a($$0, $$4, 0, 3, 1, 0, 5, 3, e, e, false);
         }

         if (this.j) {
            this.a($$0, $$4, 9, 3, 1, 9, 5, 3, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 0, 5, 7, 0, 7, 9, e, e, false);
         }

         if (this.k) {
            this.a($$0, $$4, 9, 5, 7, 9, 7, 9, e, e, false);
         }

         this.a($$0, $$4, 5, 1, 10, 7, 3, 10, e, e, false);
         this.a($$0, $$4, 1, 2, 1, 8, 2, 6, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 1, 5, 4, 4, 9, false, $$3, dnl.k);
         this.a($$0, $$4, 8, 1, 5, 8, 4, 9, false, $$3, dnl.k);
         this.a($$0, $$4, 1, 4, 7, 3, 4, 9, false, $$3, dnl.k);
         this.a($$0, $$4, 1, 3, 5, 3, 3, 6, false, $$3, dnl.k);
         this.a($$0, $$4, 1, 3, 4, 3, 3, 4, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 1, 4, 6, 3, 4, 6, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 5, 1, 7, 7, 1, 8, false, $$3, dnl.k);
         this.a($$0, $$4, 5, 1, 9, 7, 1, 9, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 5, 2, 7, 7, 2, 7, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 4, 5, 7, 4, 5, 9, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 8, 5, 7, 8, 5, 9, cju.iz.m(), cju.iz.m(), false);
         this.a($$0, $$4, 5, 5, 7, 7, 5, 9, cju.iz.m().a(cqn.a, cwv.c), cju.iz.m().a(cqn.a, cwv.c), false);
         this.a($$0, cju.cb.m().a(csh.a, gy.d), 6, 5, 6, $$4);
      }
   }

   public static class d extends dnl.q {
      public d(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.w, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public d(pj $$0) {
         super(dls.w, $$0);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         gy $$3 = this.i();
         if ($$3 != gy.c && $$3 != gy.f) {
            this.c((dnl.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.b((dnl.m)$$0, $$1, $$2, 1, 1);
         }

      }

      public static dnl.d a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.d($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         gy $$7 = this.i();
         if ($$7 != gy.c && $$7 != gy.f) {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         }

      }
   }

   public static class e extends dnl.p {
      protected static final int a = 14;
      protected static final int b = 6;
      protected static final int c = 11;
      protected static final int d = 15;
      private final boolean i;

      public e(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.x, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.i = $$2.d() > 6;
      }

      public e(pj $$0) {
         super(dls.x, $$0);
         this.i = $$0.q("Tall");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Tall", this.i);
      }

      public static dnl.e a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -4, -1, 0, 14, 11, 15, $$5);
         if (!a($$7) || $$0.a($$7) != null) {
            $$7 = dkt.a($$2, $$3, $$4, -4, -1, 0, 14, 6, 15, $$5);
            if (!a($$7) || $$0.a($$7) != null) {
               return null;
            }
         }

         return new dnl.e($$6, $$1, $$7, $$5);
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         int $$7 = 11;
         if (!this.i) {
            $$7 = 6;
         }

         this.a($$0, $$4, 0, 0, 0, 13, $$7 - 1, 14, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, $$3, 0.07F, 2, 1, 1, 11, 4, 13, cju.bf.m(), cju.bf.m(), false, false);
         int $$8 = 1;
         int $$9 = 12;

         for(int $$10 = 1; $$10 <= 13; ++$$10) {
            if (($$10 - 1) % 4 == 0) {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cju.n.m(), cju.n.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cju.n.m(), cju.n.m(), false);
               this.a($$0, cju.cb.m().a(csh.a, gy.f), 2, 3, $$10, $$4);
               this.a($$0, cju.cb.m().a(csh.a, gy.e), 11, 3, $$10, $$4);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cju.n.m(), cju.n.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cju.n.m(), cju.n.m(), false);
               }
            } else {
               this.a($$0, $$4, 1, 1, $$10, 1, 4, $$10, cju.bX.m(), cju.bX.m(), false);
               this.a($$0, $$4, 12, 1, $$10, 12, 4, $$10, cju.bX.m(), cju.bX.m(), false);
               if (this.i) {
                  this.a($$0, $$4, 1, 6, $$10, 1, 9, $$10, cju.bX.m(), cju.bX.m(), false);
                  this.a($$0, $$4, 12, 6, $$10, 12, 9, $$10, cju.bX.m(), cju.bX.m(), false);
               }
            }
         }

         for(int $$11 = 3; $$11 < 12; $$11 += 2) {
            this.a($$0, $$4, 3, 1, $$11, 4, 3, $$11, cju.bX.m(), cju.bX.m(), false);
            this.a($$0, $$4, 6, 1, $$11, 7, 3, $$11, cju.bX.m(), cju.bX.m(), false);
            this.a($$0, $$4, 9, 1, $$11, 10, 3, $$11, cju.bX.m(), cju.bX.m(), false);
         }

         if (this.i) {
            this.a($$0, $$4, 1, 5, 1, 3, 5, 13, cju.n.m(), cju.n.m(), false);
            this.a($$0, $$4, 10, 5, 1, 12, 5, 13, cju.n.m(), cju.n.m(), false);
            this.a($$0, $$4, 4, 5, 1, 9, 5, 2, cju.n.m(), cju.n.m(), false);
            this.a($$0, $$4, 4, 5, 12, 9, 5, 13, cju.n.m(), cju.n.m(), false);
            this.a($$0, cju.n.m(), 9, 5, 11, $$4);
            this.a($$0, cju.n.m(), 8, 5, 11, $$4);
            this.a($$0, cju.n.m(), 9, 5, 10, $$4);
            cvo $$12 = cju.dd.m().a(cmg.d, Boolean.valueOf(true)).a(cmg.b, Boolean.valueOf(true));
            cvo $$13 = cju.dd.m().a(cmg.a, Boolean.valueOf(true)).a(cmg.c, Boolean.valueOf(true));
            this.a($$0, $$4, 3, 6, 3, 3, 6, 11, $$13, $$13, false);
            this.a($$0, $$4, 10, 6, 3, 10, 6, 9, $$13, $$13, false);
            this.a($$0, $$4, 4, 6, 2, 9, 6, 2, $$12, $$12, false);
            this.a($$0, $$4, 4, 6, 12, 7, 6, 12, $$12, $$12, false);
            this.a($$0, cju.dd.m().a(cmg.a, Boolean.valueOf(true)).a(cmg.b, Boolean.valueOf(true)), 3, 6, 2, $$4);
            this.a($$0, cju.dd.m().a(cmg.c, Boolean.valueOf(true)).a(cmg.b, Boolean.valueOf(true)), 3, 6, 12, $$4);
            this.a($$0, cju.dd.m().a(cmg.a, Boolean.valueOf(true)).a(cmg.d, Boolean.valueOf(true)), 10, 6, 2, $$4);

            for(int $$14 = 0; $$14 <= 2; ++$$14) {
               this.a($$0, cju.dd.m().a(cmg.c, Boolean.valueOf(true)).a(cmg.d, Boolean.valueOf(true)), 8 + $$14, 6, 12 - $$14, $$4);
               if ($$14 != 2) {
                  this.a($$0, cju.dd.m().a(cmg.a, Boolean.valueOf(true)).a(cmg.b, Boolean.valueOf(true)), 8 + $$14, 6, 11 - $$14, $$4);
               }
            }

            cvo $$15 = cju.cx.m().a(cnp.a, gy.d);
            this.a($$0, $$15, 10, 1, 13, $$4);
            this.a($$0, $$15, 10, 2, 13, $$4);
            this.a($$0, $$15, 10, 3, 13, $$4);
            this.a($$0, $$15, 10, 4, 13, $$4);
            this.a($$0, $$15, 10, 5, 13, $$4);
            this.a($$0, $$15, 10, 6, 13, $$4);
            this.a($$0, $$15, 10, 7, 13, $$4);
            int $$16 = 7;
            int $$17 = 7;
            cvo $$18 = cju.dd.m().a(cmg.b, Boolean.valueOf(true));
            this.a($$0, $$18, 6, 9, 7, $$4);
            cvo $$19 = cju.dd.m().a(cmg.d, Boolean.valueOf(true));
            this.a($$0, $$19, 7, 9, 7, $$4);
            this.a($$0, $$18, 6, 8, 7, $$4);
            this.a($$0, $$19, 7, 8, 7, $$4);
            cvo $$20 = $$13.a(cmg.d, Boolean.valueOf(true)).a(cmg.b, Boolean.valueOf(true));
            this.a($$0, $$20, 6, 7, 7, $$4);
            this.a($$0, $$20, 7, 7, 7, $$4);
            this.a($$0, $$18, 5, 7, 7, $$4);
            this.a($$0, $$19, 8, 7, 7, $$4);
            this.a($$0, $$18.a(cmg.a, Boolean.valueOf(true)), 6, 7, 6, $$4);
            this.a($$0, $$18.a(cmg.c, Boolean.valueOf(true)), 6, 7, 8, $$4);
            this.a($$0, $$19.a(cmg.a, Boolean.valueOf(true)), 7, 7, 6, $$4);
            this.a($$0, $$19.a(cmg.c, Boolean.valueOf(true)), 7, 7, 8, $$4);
            cvo $$21 = cju.ca.m();
            this.a($$0, $$21, 5, 8, 7, $$4);
            this.a($$0, $$21, 8, 8, 7, $$4);
            this.a($$0, $$21, 6, 8, 6, $$4);
            this.a($$0, $$21, 6, 8, 8, $$4);
            this.a($$0, $$21, 7, 8, 6, $$4);
            this.a($$0, $$21, 7, 8, 8, $$4);
         }

         this.a($$0, $$4, $$3, 3, 3, 5, dry.w);
         if (this.i) {
            this.a($$0, e, 12, 9, 1, $$4);
            this.a($$0, $$4, $$3, 12, 8, 1, dry.w);
         }

      }
   }

   static class f {
      public final Class<? extends dnl.p> a;
      public final int b;
      public int c;
      public final int d;

      public f(Class<? extends dnl.p> $$0, int $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
      }

      public boolean a(int $$0) {
         return this.d == 0 || this.c < this.d;
      }

      public boolean a() {
         return this.d == 0 || this.c < this.d;
      }
   }

   public static class g extends dnl.p {
      protected static final int a = 11;
      protected static final int b = 8;
      protected static final int c = 16;
      private boolean d;

      public g(int $$0, dkt $$1, gy $$2) {
         super(dls.y, $$0, $$1);
         this.a($$2);
      }

      public g(pj $$0) {
         super(dls.y, $$0);
         this.d = $$0.q("Mob");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Mob", this.d);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         if ($$0 != null) {
            ((dnl.m)$$0).b = this;
         }

      }

      public static dnl.g a(dlg $$0, int $$1, int $$2, int $$3, gy $$4, int $$5) {
         dkt $$6 = dkt.a($$1, $$2, $$3, -4, -1, 0, 11, 8, 16, $$4);
         return a($$6) && $$0.a($$6) == null ? new dnl.g($$5, $$6, $$4) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 7, 15, false, $$3, dnl.k);
         this.a($$0, $$3, $$4, dnl.p.a.c, 4, 1, 0);
         int $$7 = 6;
         this.a($$0, $$4, 1, $$7, 1, 1, $$7, 14, false, $$3, dnl.k);
         this.a($$0, $$4, 9, $$7, 1, 9, $$7, 14, false, $$3, dnl.k);
         this.a($$0, $$4, 2, $$7, 1, 8, $$7, 2, false, $$3, dnl.k);
         this.a($$0, $$4, 2, $$7, 14, 8, $$7, 14, false, $$3, dnl.k);
         this.a($$0, $$4, 1, 1, 1, 2, 1, 4, false, $$3, dnl.k);
         this.a($$0, $$4, 8, 1, 1, 9, 1, 4, false, $$3, dnl.k);
         this.a($$0, $$4, 1, 1, 1, 1, 1, 3, cju.D.m(), cju.D.m(), false);
         this.a($$0, $$4, 9, 1, 1, 9, 1, 3, cju.D.m(), cju.D.m(), false);
         this.a($$0, $$4, 3, 1, 8, 7, 1, 12, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 1, 9, 6, 1, 11, cju.D.m(), cju.D.m(), false);
         cvo $$8 = cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true));
         cvo $$9 = cju.ee.m().a(cnk.d, Boolean.valueOf(true)).a(cnk.b, Boolean.valueOf(true));

         for(int $$10 = 3; $$10 < 14; $$10 += 2) {
            this.a($$0, $$4, 0, 3, $$10, 0, 4, $$10, $$8, $$8, false);
            this.a($$0, $$4, 10, 3, $$10, 10, 4, $$10, $$8, $$8, false);
         }

         for(int $$11 = 2; $$11 < 9; $$11 += 2) {
            this.a($$0, $$4, $$11, 3, 15, $$11, 4, 15, $$9, $$9, false);
         }

         cvo $$12 = cju.eq.m().a(crd.a, gy.c);
         this.a($$0, $$4, 4, 1, 5, 6, 1, 7, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 2, 6, 6, 2, 7, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 3, 7, 6, 3, 7, false, $$3, dnl.k);

         for(int $$13 = 4; $$13 <= 6; ++$$13) {
            this.a($$0, $$12, $$13, 1, 4, $$4);
            this.a($$0, $$12, $$13, 2, 5, $$4);
            this.a($$0, $$12, $$13, 3, 6, $$4);
         }

         cvo $$14 = cju.eF.m().a(cly.a, gy.c);
         cvo $$15 = cju.eF.m().a(cly.a, gy.d);
         cvo $$16 = cju.eF.m().a(cly.a, gy.f);
         cvo $$17 = cju.eF.m().a(cly.a, gy.e);
         boolean $$18 = true;
         boolean[] $$19 = new boolean[12];

         for(int $$20 = 0; $$20 < $$19.length; ++$$20) {
            $$19[$$20] = $$3.i() > 0.9F;
            $$18 &= $$19[$$20];
         }

         this.a($$0, $$14.a(cly.b, Boolean.valueOf($$19[0])), 4, 3, 8, $$4);
         this.a($$0, $$14.a(cly.b, Boolean.valueOf($$19[1])), 5, 3, 8, $$4);
         this.a($$0, $$14.a(cly.b, Boolean.valueOf($$19[2])), 6, 3, 8, $$4);
         this.a($$0, $$15.a(cly.b, Boolean.valueOf($$19[3])), 4, 3, 12, $$4);
         this.a($$0, $$15.a(cly.b, Boolean.valueOf($$19[4])), 5, 3, 12, $$4);
         this.a($$0, $$15.a(cly.b, Boolean.valueOf($$19[5])), 6, 3, 12, $$4);
         this.a($$0, $$16.a(cly.b, Boolean.valueOf($$19[6])), 3, 3, 9, $$4);
         this.a($$0, $$16.a(cly.b, Boolean.valueOf($$19[7])), 3, 3, 10, $$4);
         this.a($$0, $$16.a(cly.b, Boolean.valueOf($$19[8])), 3, 3, 11, $$4);
         this.a($$0, $$17.a(cly.b, Boolean.valueOf($$19[9])), 7, 3, 9, $$4);
         this.a($$0, $$17.a(cly.b, Boolean.valueOf($$19[10])), 7, 3, 10, $$4);
         this.a($$0, $$17.a(cly.b, Boolean.valueOf($$19[11])), 7, 3, 11, $$4);
         if ($$18) {
            cvo $$21 = cju.eE.m();
            this.a($$0, $$21, 4, 3, 9, $$4);
            this.a($$0, $$21, 5, 3, 9, $$4);
            this.a($$0, $$21, 6, 3, 9, $$4);
            this.a($$0, $$21, 4, 3, 10, $$4);
            this.a($$0, $$21, 5, 3, 10, $$4);
            this.a($$0, $$21, 6, 3, 10, $$4);
            this.a($$0, $$21, 4, 3, 11, $$4);
            this.a($$0, $$21, 5, 3, 11, $$4);
            this.a($$0, $$21, 6, 3, 11, $$4);
         }

         if (!this.d) {
            gt $$22 = this.b(5, 3, 6);
            if ($$4.b($$22)) {
               this.d = true;
               $$0.a($$22, cju.ce.m(), 2);
               cti $$23 = $$0.c_($$22);
               if ($$23 instanceof cun) {
                  ((cun)$$23).d().a(bbr.aD);
               }
            }
         }

      }
   }

   public static class h extends dnl.p {
      protected static final int a = 9;
      protected static final int b = 5;
      protected static final int c = 11;

      public h(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.z, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public h(pj $$0) {
         super(dls.z, $$0);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         this.a((dnl.m)$$0, $$1, $$2, 1, 1);
      }

      public static dnl.h a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 9, 5, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.h($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 8, 4, 10, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$4, 1, 1, 10, 3, 3, 10, e, e, false);
         this.a($$0, $$4, 4, 1, 1, 4, 3, 1, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 1, 3, 4, 3, 3, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 1, 7, 4, 3, 7, false, $$3, dnl.k);
         this.a($$0, $$4, 4, 1, 9, 4, 3, 9, false, $$3, dnl.k);

         for(int $$7 = 1; $$7 <= 3; ++$$7) {
            this.a($$0, cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true)), 4, $$7, 4, $$4);
            this.a($$0, cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true)).a(cnk.b, Boolean.valueOf(true)), 4, $$7, 5, $$4);
            this.a($$0, cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true)), 4, $$7, 6, $$4);
            this.a($$0, cju.ee.m().a(cnk.d, Boolean.valueOf(true)).a(cnk.b, Boolean.valueOf(true)), 5, $$7, 5, $$4);
            this.a($$0, cju.ee.m().a(cnk.d, Boolean.valueOf(true)).a(cnk.b, Boolean.valueOf(true)), 6, $$7, 5, $$4);
            this.a($$0, cju.ee.m().a(cnk.d, Boolean.valueOf(true)).a(cnk.b, Boolean.valueOf(true)), 7, $$7, 5, $$4);
         }

         this.a($$0, cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true)), 4, 3, 2, $$4);
         this.a($$0, cju.ee.m().a(cnk.a, Boolean.valueOf(true)).a(cnk.c, Boolean.valueOf(true)), 4, 3, 8, $$4);
         cvo $$8 = cju.cJ.m().a(clp.a, gy.e);
         cvo $$9 = cju.cJ.m().a(clp.a, gy.e).a(clp.e, cwk.a);
         this.a($$0, $$8, 4, 1, 2, $$4);
         this.a($$0, $$9, 4, 2, 2, $$4);
         this.a($$0, $$8, 4, 1, 8, $$4);
         this.a($$0, $$9, 4, 2, 8, $$4);
      }
   }

   public static class i extends dnl.q {
      public i(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.A, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public i(pj $$0) {
         super(dls.A, $$0);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         gy $$3 = this.i();
         if ($$3 != gy.c && $$3 != gy.f) {
            this.b((dnl.m)$$0, $$1, $$2, 1, 1);
         } else {
            this.c((dnl.m)$$0, $$1, $$2, 1, 1);
         }

      }

      public static dnl.i a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.i($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 4, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         gy $$7 = this.i();
         if ($$7 != gy.c && $$7 != gy.f) {
            this.a($$0, $$4, 0, 1, 1, 0, 3, 3, e, e, false);
         } else {
            this.a($$0, $$4, 4, 1, 1, 4, 3, 3, e, e, false);
         }

      }
   }

   public static class j extends dnl.p {
      protected static final int a = 11;
      protected static final int b = 7;
      protected static final int c = 11;
      protected final int d;

      public j(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.B, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(5);
      }

      public j(pj $$0) {
         super(dls.B, $$0);
         this.d = $$0.h("Type");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Type", this.d);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         this.a((dnl.m)$$0, $$1, $$2, 4, 1);
         this.b((dnl.m)$$0, $$1, $$2, 1, 4);
         this.c((dnl.m)$$0, $$1, $$2, 1, 4);
      }

      public static dnl.j a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -4, -1, 0, 11, 7, 11, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.j($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 10, 6, 10, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 4, 1, 0);
         this.a($$0, $$4, 4, 1, 10, 6, 3, 10, e, e, false);
         this.a($$0, $$4, 0, 1, 4, 0, 3, 6, e, e, false);
         this.a($$0, $$4, 10, 1, 4, 10, 3, 6, e, e, false);
         switch(this.d) {
            case 0:
               this.a($$0, cju.dP.m(), 5, 1, 5, $$4);
               this.a($$0, cju.dP.m(), 5, 2, 5, $$4);
               this.a($$0, cju.dP.m(), 5, 3, 5, $$4);
               this.a($$0, cju.cb.m().a(csh.a, gy.e), 4, 3, 5, $$4);
               this.a($$0, cju.cb.m().a(csh.a, gy.f), 6, 3, 5, $$4);
               this.a($$0, cju.cb.m().a(csh.a, gy.d), 5, 3, 4, $$4);
               this.a($$0, cju.cb.m().a(csh.a, gy.c), 5, 3, 6, $$4);
               this.a($$0, cju.iz.m(), 4, 1, 4, $$4);
               this.a($$0, cju.iz.m(), 4, 1, 5, $$4);
               this.a($$0, cju.iz.m(), 4, 1, 6, $$4);
               this.a($$0, cju.iz.m(), 6, 1, 4, $$4);
               this.a($$0, cju.iz.m(), 6, 1, 5, $$4);
               this.a($$0, cju.iz.m(), 6, 1, 6, $$4);
               this.a($$0, cju.iz.m(), 5, 1, 4, $$4);
               this.a($$0, cju.iz.m(), 5, 1, 6, $$4);
               break;
            case 1:
               for(int $$7 = 0; $$7 < 5; ++$$7) {
                  this.a($$0, cju.dP.m(), 3, 1, 3 + $$7, $$4);
                  this.a($$0, cju.dP.m(), 7, 1, 3 + $$7, $$4);
                  this.a($$0, cju.dP.m(), 3 + $$7, 1, 3, $$4);
                  this.a($$0, cju.dP.m(), 3 + $$7, 1, 7, $$4);
               }

               this.a($$0, cju.dP.m(), 5, 1, 5, $$4);
               this.a($$0, cju.dP.m(), 5, 2, 5, $$4);
               this.a($$0, cju.dP.m(), 5, 3, 5, $$4);
               this.a($$0, cju.C.m(), 5, 4, 5, $$4);
               break;
            case 2:
               for(int $$8 = 1; $$8 <= 9; ++$$8) {
                  this.a($$0, cju.m.m(), 1, 3, $$8, $$4);
                  this.a($$0, cju.m.m(), 9, 3, $$8, $$4);
               }

               for(int $$9 = 1; $$9 <= 9; ++$$9) {
                  this.a($$0, cju.m.m(), $$9, 3, 1, $$4);
                  this.a($$0, cju.m.m(), $$9, 3, 9, $$4);
               }

               this.a($$0, cju.m.m(), 5, 1, 4, $$4);
               this.a($$0, cju.m.m(), 5, 1, 6, $$4);
               this.a($$0, cju.m.m(), 5, 3, 4, $$4);
               this.a($$0, cju.m.m(), 5, 3, 6, $$4);
               this.a($$0, cju.m.m(), 4, 1, 5, $$4);
               this.a($$0, cju.m.m(), 6, 1, 5, $$4);
               this.a($$0, cju.m.m(), 4, 3, 5, $$4);
               this.a($$0, cju.m.m(), 6, 3, 5, $$4);

               for(int $$10 = 1; $$10 <= 3; ++$$10) {
                  this.a($$0, cju.m.m(), 4, $$10, 4, $$4);
                  this.a($$0, cju.m.m(), 6, $$10, 4, $$4);
                  this.a($$0, cju.m.m(), 4, $$10, 6, $$4);
                  this.a($$0, cju.m.m(), 6, $$10, 6, $$4);
               }

               this.a($$0, cju.ca.m(), 5, 3, 5, $$4);

               for(int $$11 = 2; $$11 <= 8; ++$$11) {
                  this.a($$0, cju.n.m(), 2, 3, $$11, $$4);
                  this.a($$0, cju.n.m(), 3, 3, $$11, $$4);
                  if ($$11 <= 3 || $$11 >= 7) {
                     this.a($$0, cju.n.m(), 4, 3, $$11, $$4);
                     this.a($$0, cju.n.m(), 5, 3, $$11, $$4);
                     this.a($$0, cju.n.m(), 6, 3, $$11, $$4);
                  }

                  this.a($$0, cju.n.m(), 7, 3, $$11, $$4);
                  this.a($$0, cju.n.m(), 8, 3, $$11, $$4);
               }

               cvo $$12 = cju.cx.m().a(cnp.a, gy.e);
               this.a($$0, $$12, 9, 1, 3, $$4);
               this.a($$0, $$12, 9, 2, 3, $$4);
               this.a($$0, $$12, 9, 3, 3, $$4);
               this.a($$0, $$4, $$3, 3, 4, 8, dry.x);
         }

      }
   }

   static class k extends dlf.a {
      @Override
      public void a(amn $$0, int $$1, int $$2, int $$3, boolean $$4) {
         if ($$4) {
            float $$5 = $$0.i();
            if ($$5 < 0.2F) {
               this.a = cju.dR.m();
            } else if ($$5 < 0.5F) {
               this.a = cju.dQ.m();
            } else if ($$5 < 0.55F) {
               this.a = cju.dX.m();
            } else {
               this.a = cju.dP.m();
            }
         } else {
            this.a = cju.lN.m();
         }

      }
   }

   public static class l extends dnl.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 5;
      private final boolean d;

      public l(dls $$0, int $$1, int $$2, int $$3, gy $$4) {
         super($$0, $$1, a($$2, 64, $$3, $$4, 5, 11, 5));
         this.d = true;
         this.a($$4);
         this.h = dnl.p.a.a;
      }

      public l(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.C, $$0, $$2);
         this.d = false;
         this.a($$3);
         this.h = this.b($$1);
      }

      public l(dls $$0, pj $$1) {
         super($$0, $$1);
         this.d = $$1.q("Source");
      }

      public l(pj $$0) {
         this(dls.C, $$0);
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Source", this.d);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         if (this.d) {
            dnl.i = dnl.c.class;
         }

         this.a((dnl.m)$$0, $$1, $$2, 1, 1);
      }

      public static dnl.l a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 5, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.l($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 4, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dnl.p.a.a, 1, 1, 4);
         this.a($$0, cju.dP.m(), 2, 6, 1, $$4);
         this.a($$0, cju.dP.m(), 1, 5, 1, $$4);
         this.a($$0, cju.iz.m(), 1, 6, 1, $$4);
         this.a($$0, cju.dP.m(), 1, 5, 2, $$4);
         this.a($$0, cju.dP.m(), 1, 4, 3, $$4);
         this.a($$0, cju.iz.m(), 1, 5, 3, $$4);
         this.a($$0, cju.dP.m(), 2, 4, 3, $$4);
         this.a($$0, cju.dP.m(), 3, 3, 3, $$4);
         this.a($$0, cju.iz.m(), 3, 4, 3, $$4);
         this.a($$0, cju.dP.m(), 3, 3, 2, $$4);
         this.a($$0, cju.dP.m(), 3, 2, 1, $$4);
         this.a($$0, cju.iz.m(), 3, 3, 1, $$4);
         this.a($$0, cju.dP.m(), 2, 2, 1, $$4);
         this.a($$0, cju.dP.m(), 1, 1, 1, $$4);
         this.a($$0, cju.iz.m(), 1, 2, 1, $$4);
         this.a($$0, cju.dP.m(), 1, 1, 2, $$4);
         this.a($$0, cju.iz.m(), 1, 1, 3, $$4);
      }
   }

   public static class m extends dnl.l {
      public dnl.f a;
      @Nullable
      public dnl.g b;
      public final List<dlf> c = Lists.newArrayList();

      public m(amn $$0, int $$1, int $$2) {
         super(dls.D, 0, $$1, $$2, a($$0));
      }

      public m(pj $$0) {
         super(dls.D, $$0);
      }

      @Override
      public gt h() {
         return this.b != null ? this.b.h() : super.h();
      }
   }

   public static class n extends dnl.p {
      private static final int a = 5;
      private static final int b = 5;
      private static final int c = 7;
      private final boolean d;
      private final boolean i;

      public n(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.E, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
         this.d = $$1.a(2) == 0;
         this.i = $$1.a(2) == 0;
      }

      public n(pj $$0) {
         super(dls.E, $$0);
         this.d = $$0.q("Left");
         this.i = $$0.q("Right");
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         super.a($$0, $$1);
         $$1.a("Left", this.d);
         $$1.a("Right", this.i);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         this.a((dnl.m)$$0, $$1, $$2, 1, 1);
         if (this.d) {
            this.b((dnl.m)$$0, $$1, $$2, 1, 2);
         }

         if (this.i) {
            this.c((dnl.m)$$0, $$1, $$2, 1, 2);
         }

      }

      public static dnl.n a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -1, 0, 5, 5, 7, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.n($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 4, 6, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 1, 0);
         this.a($$0, $$3, $$4, dnl.p.a.a, 1, 1, 6);
         cvo $$7 = cju.cb.m().a(csh.a, gy.f);
         cvo $$8 = cju.cb.m().a(csh.a, gy.e);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 1, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 1, $$8);
         this.a($$0, $$4, $$3, 0.1F, 1, 2, 5, $$7);
         this.a($$0, $$4, $$3, 0.1F, 3, 2, 5, $$8);
         if (this.d) {
            this.a($$0, $$4, 0, 1, 2, 0, 3, 4, e, e, false);
         }

         if (this.i) {
            this.a($$0, $$4, 4, 1, 2, 4, 3, 4, e, e, false);
         }

      }
   }

   public static class o extends dnl.p {
      private static final int a = 5;
      private static final int b = 11;
      private static final int c = 8;

      public o(int $$0, amn $$1, dkt $$2, gy $$3) {
         super(dls.F, $$0, $$2);
         this.a($$3);
         this.h = this.b($$1);
      }

      public o(pj $$0) {
         super(dls.F, $$0);
      }

      @Override
      public void a(dlf $$0, dlg $$1, amn $$2) {
         this.a((dnl.m)$$0, $$1, $$2, 1, 1);
      }

      public static dnl.o a(dlg $$0, amn $$1, int $$2, int $$3, int $$4, gy $$5, int $$6) {
         dkt $$7 = dkt.a($$2, $$3, $$4, -1, -7, 0, 5, 11, 8, $$5);
         return a($$7) && $$0.a($$7) == null ? new dnl.o($$6, $$1, $$7, $$5) : null;
      }

      @Override
      public void a(chp $$0, cho $$1, cxk $$2, amn $$3, dkt $$4, cge $$5, gt $$6) {
         this.a($$0, $$4, 0, 0, 0, 4, 10, 7, true, $$3, dnl.k);
         this.a($$0, $$3, $$4, this.h, 1, 7, 0);
         this.a($$0, $$3, $$4, dnl.p.a.a, 1, 1, 7);
         cvo $$7 = cju.cz.m().a(crd.a, gy.d);

         for(int $$8 = 0; $$8 < 6; ++$$8) {
            this.a($$0, $$7, 1, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 2, 6 - $$8, 1 + $$8, $$4);
            this.a($$0, $$7, 3, 6 - $$8, 1 + $$8, $$4);
            if ($$8 < 5) {
               this.a($$0, cju.dP.m(), 1, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cju.dP.m(), 2, 5 - $$8, 1 + $$8, $$4);
               this.a($$0, cju.dP.m(), 3, 5 - $$8, 1 + $$8, $$4);
            }
         }

      }
   }

   abstract static class p extends dlf {
      protected dnl.p.a h = dnl.p.a.a;

      protected p(dls $$0, int $$1, dkt $$2) {
         super($$0, $$1, $$2);
      }

      public p(dls $$0, pj $$1) {
         super($$0, $$1);
         this.h = dnl.p.a.valueOf($$1.l("EntryDoor"));
      }

      @Override
      protected void a(dlr $$0, pj $$1) {
         $$1.a("EntryDoor", this.h.name());
      }

      protected void a(chp $$0, amn $$1, dkt $$2, dnl.p.a $$3, int $$4, int $$5, int $$6) {
         switch($$3) {
            case a:
               this.a($$0, $$2, $$4, $$5, $$6, $$4 + 3 - 1, $$5 + 3 - 1, $$6, e, e, false);
               break;
            case b:
               this.a($$0, cju.dP.m(), $$4, $$5, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cju.cw.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cju.cw.m().a(clp.e, cwk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               break;
            case c:
               this.a($$0, cju.lN.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cju.lN.m(), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.d, Boolean.valueOf(true)), $$4, $$5, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.d, Boolean.valueOf(true)), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.b, Boolean.valueOf(true)).a(cnk.d, Boolean.valueOf(true)), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.b, Boolean.valueOf(true)).a(cnk.d, Boolean.valueOf(true)), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.b, Boolean.valueOf(true)).a(cnk.d, Boolean.valueOf(true)), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.b, Boolean.valueOf(true)), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cju.ee.m().a(cnk.b, Boolean.valueOf(true)), $$4 + 2, $$5, $$6, $$2);
               break;
            case d:
               this.a($$0, cju.dP.m(), $$4, $$5, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4, $$5 + 1, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 1, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5 + 2, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5 + 1, $$6, $$2);
               this.a($$0, cju.dP.m(), $$4 + 2, $$5, $$6, $$2);
               this.a($$0, cju.cJ.m(), $$4 + 1, $$5, $$6, $$2);
               this.a($$0, cju.cJ.m().a(clp.e, cwk.a), $$4 + 1, $$5 + 1, $$6, $$2);
               this.a($$0, cju.cV.m().a(ckb.aD, gy.c), $$4 + 2, $$5 + 1, $$6 + 1, $$2);
               this.a($$0, cju.cV.m().a(ckb.aD, gy.d), $$4 + 2, $$5 + 1, $$6 - 1, $$2);
         }

      }

      protected dnl.p.a b(amn $$0) {
         int $$1 = $$0.a(5);
         switch($$1) {
            case 0:
            case 1:
            default:
               return dnl.p.a.a;
            case 2:
               return dnl.p.a.b;
            case 3:
               return dnl.p.a.c;
            case 4:
               return dnl.p.a.d;
         }
      }

      @Nullable
      protected dlf a(dnl.m $$0, dlg $$1, amn $$2, int $$3, int $$4) {
         gy $$5 = this.i();
         if ($$5 != null) {
            switch($$5) {
               case c:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.i() - 1, $$5, this.g());
               case d:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$3, this.f.h() + $$4, this.f.l() + 1, $$5, this.g());
               case e:
                  return dnl.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
               case f:
                  return dnl.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$4, this.f.i() + $$3, $$5, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dlf b(dnl.m $$0, dlg $$1, amn $$2, int $$3, int $$4) {
         gy $$5 = this.i();
         if ($$5 != null) {
            switch($$5) {
               case c:
                  return dnl.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, gy.e, this.g());
               case d:
                  return dnl.b($$0, $$1, $$2, this.f.g() - 1, this.f.h() + $$3, this.f.i() + $$4, gy.e, this.g());
               case e:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, gy.c, this.g());
               case f:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.i() - 1, gy.c, this.g());
            }
         }

         return null;
      }

      @Nullable
      protected dlf c(dnl.m $$0, dlg $$1, amn $$2, int $$3, int $$4) {
         gy $$5 = this.i();
         if ($$5 != null) {
            switch($$5) {
               case c:
                  return dnl.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, gy.f, this.g());
               case d:
                  return dnl.b($$0, $$1, $$2, this.f.j() + 1, this.f.h() + $$3, this.f.i() + $$4, gy.f, this.g());
               case e:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, gy.d, this.g());
               case f:
                  return dnl.b($$0, $$1, $$2, this.f.g() + $$4, this.f.h() + $$3, this.f.l() + 1, gy.d, this.g());
            }
         }

         return null;
      }

      protected static boolean a(dkt $$0) {
         return $$0 != null && $$0.h() > 10;
      }

      protected static enum a {
         a,
         b,
         c,
         d;
      }
   }

   public abstract static class q extends dnl.p {
      protected static final int a = 5;
      protected static final int b = 5;
      protected static final int c = 5;

      protected q(dls $$0, int $$1, dkt $$2) {
         super($$0, $$1, $$2);
      }

      public q(dls $$0, pj $$1) {
         super($$0, $$1);
      }
   }
}
