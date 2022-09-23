import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class cvh extends clm {
   public static final cwf b = cwe.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final dxj g = cjt.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final dxj h = cjt.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final dxj i = cjt.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final dxj j = cjt.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final dxj k = cjt.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final dxj l = cjt.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public cvh(boolean $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(a, gy.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      if ($$0.c(b)) {
         switch((gy)$$0.c(a)) {
            case a:
               return l;
            case b:
            default:
               return k;
            case c:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      } else {
         return dxg.b();
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bcc $$3, cax $$4) {
      if (!$$0.y) {
         this.a($$0, $$1, $$2);
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y) {
         this.a($$1, $$2, $$0);
      }

   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.y && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }

      }
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new cvl($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gt $$5 = $$1.a($$3, 2);
         cvo $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cju.bD) && $$6.c(a) == $$3) {
            cti $$8 = $$0.c_($$5);
            if ($$8 instanceof cvk $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.U() == $$9.t() || ((agg)$$0).c())) {
               $$7 = 2;
            }
         }

         $$0.a($$1, this, $$7, $$3.d());
      }

   }

   private boolean a(cgx $$0, gt $$1, gy $$2) {
      for(gy $$3 : gy.values()) {
         if ($$3 != $$2 && $$0.a($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.a($$1, gy.a)) {
         return true;
      } else {
         gt $$4 = $$1.b();

         for(gy $$5 : gy.values()) {
            if ($$5 != gy.a && $$0.a($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, int $$3, int $$4) {
      gy $$5 = $$0.c(a);
      if (!$$1.y) {
         boolean $$6 = this.a($$1, $$2, $$5);
         if ($$6 && ($$3 == 1 || $$3 == 2)) {
            $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 2);
            return false;
         }

         if (!$$6 && $$3 == 0) {
            return false;
         }
      }

      if ($$3 == 0) {
         if (!this.a($$1, $$2, $$5, true)) {
            return false;
         }

         $$1.a($$2, $$0.a(b, Boolean.valueOf(true)), 67);
         $$1.a(null, $$2, ajw.pH, ajx.e, 0.5F, $$1.w.i() * 0.25F + 0.6F);
         $$1.a(null, czv.J, $$2);
      } else if ($$3 == 1 || $$3 == 2) {
         cti $$7 = $$1.c_($$2.a($$5));
         if ($$7 instanceof cvk) {
            ((cvk)$$7).j();
         }

         cvo $$8 = cju.bD.m().a(cvg.a, $$5).a(cvg.b, this.m ? cwq.b : cwq.a);
         $$1.a($$2, $$8, 20);
         $$1.a(cvg.a($$2, $$8, this.m().a(a, gy.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$8.b());
         $$8.a($$1, $$2, 2);
         if (this.m) {
            gt $$9 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            cvo $$10 = $$1.a_($$9);
            boolean $$11 = false;
            if ($$10.a(cju.bD)) {
               cti $$12 = $$1.c_($$9);
               if ($$12 instanceof cvk $$13 && $$13.d() == $$5 && $$13.c()) {
                  $$13.j();
                  $$11 = true;
               }
            }

            if (!$$11) {
               if ($$3 != 1 || $$10.h() || !a($$10, $$1, $$9, $$5.g(), false, $$5) || $$10.l() != dqb.a && !$$10.a(cju.bl) && !$$10.a(cju.be)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, ajw.pG, ajx.e, 0.5F, $$1.w.i() * 0.15F + 0.6F);
         $$1.a(null, czv.I, $$2);
      }

      return true;
   }

   public static boolean a(cvo $$0, cgx $$1, gt $$2, gy $$3, boolean $$4, gy $$5) {
      if ($$2.v() < $$1.u_() || $$2.v() > $$1.ah() - 1 || !$$1.p_().a($$2)) {
         return false;
      } else if ($$0.h()) {
         return true;
      } else if ($$0.a(cju.bZ) || $$0.a(cju.nV) || $$0.a(cju.nW) || $$0.a(cju.qW)) {
         return false;
      } else if ($$3 == gy.a && $$2.v() == $$1.u_()) {
         return false;
      } else if ($$3 == gy.b && $$2.v() == $$1.ah() - 1) {
         return false;
      } else {
         if (!$$0.a(cju.bl) && !$$0.a(cju.be)) {
            if ($$0.h($$1, $$2) == -1.0F) {
               return false;
            }

            switch($$0.l()) {
               case c:
                  return false;
               case b:
                  return $$4;
               case e:
                  return $$3 == $$5;
            }
         } else if ($$0.c(b)) {
            return false;
         }

         return !$$0.o();
      }
   }

   private boolean a(cgx $$0, gt $$1, gy $$2, boolean $$3) {
      gt $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cju.bm)) {
         $$0.a($$4, cju.a.m(), 20);
      }

      cvl $$5 = new cvl($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gt, cvo> $$6 = Maps.newHashMap();
         List<gt> $$7 = $$5.c();
         List<cvo> $$8 = Lists.newArrayList();

         for(int $$9 = 0; $$9 < $$7.size(); ++$$9) {
            gt $$10 = (gt)$$7.get($$9);
            cvo $$11 = $$0.a_($$10);
            $$8.add($$11);
            $$6.put($$10, $$11);
         }

         List<gt> $$12 = $$5.d();
         cvo[] $$13 = new cvo[$$7.size() + $$12.size()];
         gy $$14 = $$3 ? $$2 : $$2.g();
         int $$15 = 0;

         for(int $$16 = $$12.size() - 1; $$16 >= 0; --$$16) {
            gt $$17 = (gt)$$12.get($$16);
            cvo $$18 = $$0.a_($$17);
            cti $$19 = $$18.o() ? $$0.c_($$17) : null;
            a($$18, $$0, $$17, $$19);
            $$0.a($$17, cju.a.m(), 18);
            $$0.a(czv.f, $$17, czv.a.a($$18));
            if (!$$18.a(akl.aB)) {
               $$0.a($$17, $$18);
            }

            $$13[$$15++] = $$18;
         }

         for(int $$20 = $$7.size() - 1; $$20 >= 0; --$$20) {
            gt $$21 = (gt)$$7.get($$20);
            cvo $$22 = $$0.a_($$21);
            $$21 = $$21.a($$14);
            $$6.remove($$21);
            cvo $$23 = cju.bD.m().a(a, $$2);
            $$0.a($$21, $$23, 68);
            $$0.a(cvg.a($$21, $$23, (cvo)$$8.get($$20), $$2, $$3, false));
            $$13[$$15++] = $$22;
         }

         if ($$3) {
            cwq $$24 = this.m ? cwq.b : cwq.a;
            cvo $$25 = cju.bm.m().a(cvi.a, $$2).a(cvi.b, $$24);
            cvo $$26 = cju.bD.m().a(cvg.a, $$2).a(cvg.b, this.m ? cwq.b : cwq.a);
            $$6.remove($$4);
            $$0.a($$4, $$26, 68);
            $$0.a(cvg.a($$4, $$26, $$25, $$2, true, true));
         }

         cvo $$27 = cju.a.m();

         for(gt $$28 : $$6.keySet()) {
            $$0.a($$28, $$27, 82);
         }

         for(Entry<gt, cvo> $$29 : $$6.entrySet()) {
            gt $$30 = (gt)$$29.getKey();
            cvo $$31 = (cvo)$$29.getValue();
            $$31.b($$0, $$30, 2);
            $$27.a($$0, $$30, 2);
            $$27.b($$0, $$30, 2);
         }

         $$15 = 0;

         for(int $$32 = $$12.size() - 1; $$32 >= 0; --$$32) {
            cvo $$33 = $$13[$$15++];
            gt $$34 = (gt)$$12.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b());
         }

         for(int $$35 = $$7.size() - 1; $$35 >= 0; --$$35) {
            $$0.a((gt)$$7.get($$35), $$13[$$15++].b());
         }

         if ($$3) {
            $$0.a($$4, cju.bm);
         }

         return true;
      }
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
      $$0.a(a, b);
   }

   @Override
   public boolean g_(cvo $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
