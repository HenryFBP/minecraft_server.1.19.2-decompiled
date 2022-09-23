import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

public class cry extends cjt {
   public static final cwi a = cnf.aD;
   public static final cwf b = cwe.w;
   public static final cwf c = cwe.a;
   protected static final int d = 1;
   protected static final int e = 42;
   private static final int k = 10;
   protected static final int f = 3;
   protected static final dxj g = cjt.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final dxj h = cjt.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final dxj i = cjt.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final dxj j = cjt.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public cry(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      switch((gy)$$0.c(a)) {
         case f:
         default:
            return j;
         case e:
            return i;
         case d:
            return h;
         case c:
            return g;
      }
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gy $$3 = $$0.c(a);
      gt $$4 = $$2.a($$3.g());
      cvo $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cju.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = this.m().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
      cha $$2 = $$0.q();
      gt $$3 = $$0.a();
      gy[] $$4 = $$0.f();

      for(gy $$5 : $$4) {
         if ($$5.o().d()) {
            gy $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      this.a($$0, $$1, $$2, false, false, -1, null);
   }

   public void a(cgx $$0, gt $$1, cvo $$2, boolean $$3, boolean $$4, int $$5, @Nullable cvo $$6) {
      gy $$7 = $$2.c(a);
      boolean $$8 = $$2.c(c);
      boolean $$9 = $$2.c(b);
      boolean $$10 = !$$3;
      boolean $$11 = false;
      int $$12 = 0;
      cvo[] $$13 = new cvo[42];

      for(int $$14 = 1; $$14 < 42; ++$$14) {
         gt $$15 = $$1.a($$7, $$14);
         cvo $$16 = $$0.a_($$15);
         if ($$16.a(cju.eO)) {
            if ($$16.c(a) == $$7.g()) {
               $$12 = $$14;
            }
            break;
         }

         if (!$$16.a(cju.eP) && $$14 != $$5) {
            $$13[$$14] = null;
            $$10 = false;
         } else {
            if ($$14 == $$5) {
               $$16 = (cvo)MoreObjects.firstNonNull($$6, $$16);
            }

            boolean $$17 = !$$16.c(crx.c);
            boolean $$18 = $$16.c(crx.a);
            $$11 |= $$17 && $$18;
            $$13[$$14] = $$16;
            if ($$14 == $$5) {
               $$0.a($$1, this, 10);
               $$10 &= $$17;
            }
         }
      }

      $$10 &= $$12 > 1;
      $$11 &= $$10;
      cvo $$19 = this.m().a(c, Boolean.valueOf($$10)).a(b, Boolean.valueOf($$11));
      if ($$12 > 0) {
         gt $$20 = $$1.a($$7, $$12);
         gy $$21 = $$7.g();
         $$0.a($$20, $$19.a(a, $$21), 3);
         this.a($$0, $$20, $$21);
         this.a($$0, $$20, $$10, $$11, $$8, $$9);
      }

      this.a($$0, $$1, $$10, $$11, $$8, $$9);
      if (!$$3) {
         $$0.a($$1, $$19.a(a, $$7), 3);
         if ($$4) {
            this.a($$0, $$1, $$7);
         }
      }

      if ($$8 != $$10) {
         for(int $$22 = 1; $$22 < $$12; ++$$22) {
            gt $$23 = $$1.a($$7, $$22);
            cvo $$24 = $$13[$$22];
            if ($$24 != null) {
               $$0.a($$23, $$24.a(c, Boolean.valueOf($$10)), 3);
               if (!$$0.a_($$23).h()) {
               }
            }
         }
      }

   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.a($$1, $$2, $$0, false, true, -1, null);
   }

   private void a(cgx $$0, gt $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, ajw.uV, ajx.e, 0.4F, 0.6F);
         $$0.a(null, czv.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, ajw.uU, ajx.e, 0.4F, 0.5F);
         $$0.a(null, czv.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, ajw.uT, ajx.e, 0.4F, 0.7F);
         $$0.a(null, czv.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, ajw.uW, ajx.e, 0.4F, 1.2F / ($$0.w.i() * 0.2F + 0.9F));
         $$0.a(null, czv.g, $$1);
      }

   }

   private void a(cgx $$0, gt $$1, gy $$2) {
      $$0.a($$1, this);
      $$0.a($$1.a($$2.g()), this);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(c);
         boolean $$6 = $$0.c(b);
         if ($$5 || $$6) {
            this.a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a(((gy)$$0.c(a)).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      if (!$$0.c(b)) {
         return 0;
      } else {
         return $$0.c(a) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c);
   }
}
