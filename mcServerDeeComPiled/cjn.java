import java.util.List;
import javax.annotation.Nullable;

public class cjn extends cjg {
   public static final cwi a = cnf.aD;
   public static final cwo b = cwe.aN;
   public static final int c = 5;
   private static final int d = 3;

   public cjn(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(0)).a(a, gy.c));
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return $$0.c(b);
   }

   @Override
   public void a(cgx $$0, buc $$1, gt $$2, cvo $$3, @Nullable cti $$4, cax $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.y && $$4 instanceof ctf $$6) {
         if (cet.a(cev.v, $$5) == 0) {
            $$6.a($$1, $$3, ctf.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         aj.K.a((agh)$$1, $$3, $$5, $$6.g());
      }

   }

   private void b(cgx $$0, gt $$1) {
      List<bnf> $$2 = $$0.a(bnf.class, new dwl($$1).c(8.0, 6.0, 8.0));
      if (!$$2.isEmpty()) {
         List<buc> $$3 = $$0.a(buc.class, new dwl($$1).c(8.0, 6.0, 8.0));
         int $$4 = $$3.size();

         for(bnf $$5 : $$2) {
            if ($$5.G() == null) {
               $$5.h((bcc)$$3.get($$0.w.a($$4)));
            }
         }
      }

   }

   public static void a(cgx $$0, gt $$1) {
      a($$0, $$1, new cax(caz.un, 3));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      int $$7 = $$0.c(b);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cat $$9 = $$6.c();
         if ($$6.a(caz.qd)) {
            $$1.a($$3, $$3.df(), $$3.dh(), $$3.dl(), ajw.bs, ajx.g, 1.0F, 1.0F);
            a($$1, $$2);
            $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            $$8 = true;
            $$1.a($$3, czv.O, $$2);
         } else if ($$6.a(caz.qt)) {
            $$6.g(1);
            $$1.a($$3, $$3.df(), $$3.dh(), $$3.dl(), ajw.bS, ajx.g, 1.0F, 1.0F);
            if ($$6.b()) {
               $$3.a($$4, new cax(caz.uq));
            } else if (!$$3.fA().e(new cax(caz.uq))) {
               $$3.a(new cax(caz.uq), false);
            }

            $$8 = true;
            $$1.a($$3, czv.y, $$2);
         }

         if (!$$1.k_() && $$8) {
            $$3.b(akg.c.b($$9));
         }
      }

      if ($$8) {
         if (!cke.a($$1, $$2)) {
            if (this.c($$1, $$2)) {
               this.b($$1, $$2);
            }

            this.a($$1, $$0, $$2, $$3, ctf.b.c);
         } else {
            this.a($$1, $$0, $$2);
         }

         return baj.a($$1.y);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private boolean c(cgx $$0, gt $$1) {
      cti $$2 = $$0.c_($$1);
      if ($$2 instanceof ctf $$3) {
         return !$$3.d();
      } else {
         return false;
      }
   }

   public void a(cgx $$0, cvo $$1, gt $$2, @Nullable buc $$3, ctf.b $$4) {
      this.a($$0, $$1, $$2);
      cti $$5 = $$0.c_($$2);
      if ($$5 instanceof ctf $$6) {
         $$6.a($$3, $$1, $$4);
      }

   }

   public void a(cgx $$0, cvo $$1, gt $$2) {
      $$0.a($$2, $$1.a(b, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(b) >= 5) {
         for(int $$4 = 0; $$4 < $$3.a(1) + 1; ++$$4) {
            this.a($$1, $$2, $$0);
         }
      }

   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      if ($$2.p().c() && !($$0.w.i() < 0.3F)) {
         dxj $$3 = $$2.k($$0, $$1);
         double $$4 = $$3.c(gy.a.b);
         if ($$4 >= 1.0 && !$$2.a(akl.aj)) {
            double $$5 = $$3.b(gy.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               gt $$6 = $$1.c();
               cvo $$7 = $$0.a_($$6);
               dxj $$8 = $$7.k($$0, $$6);
               double $$9 = $$8.c(gy.a.b);
               if (($$9 < 1.0 || !$$7.r($$0, $$6)) && $$7.p().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }

      }
   }

   private void a(cgx $$0, gt $$1, dxj $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(gy.a.a), (double)$$1.u() + $$2.c(gy.a.a), (double)$$1.w() + $$2.b(gy.a.c), (double)$$1.w() + $$2.c(gy.a.c), $$3);
   }

   private void a(cgx $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(io.ao, ami.d($$0.w.j(), $$1, $$2), $$5, ami.d($$0.w.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().g());
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, a);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new ctf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? null : a($$2, ctk.G, ctf::a);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y && $$3.f() && $$0.W().b(cgt.g)) {
         cti $$4 = $$0.c_($$1);
         if ($$4 instanceof ctf $$5) {
            cax $$6 = new cax(this);
            int $$7 = $$2.c(b);
            boolean $$8 = !$$5.d();
            if ($$8 || $$7 > 0) {
               if ($$8) {
                  pj $$9 = new pj();
                  $$9.a("Bees", (qc)$$5.j());
                  byx.a($$6, ctk.G, $$9);
               }

               pj $$10 = new pj();
               $$10.a("honey_level", $$7);
               $$6.a("BlockStateTag", $$10);
               bqv $$11 = new bqv($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$6);
               $$11.o();
               $$0.b($$11);
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public List<cax> a(cvo $$0, dsd.a $$1) {
      bbn $$2 = $$1.b(dul.a);
      if ($$2 instanceof bqw || $$2 instanceof brc || $$2 instanceof bvh || $$2 instanceof bqj || $$2 instanceof bwf) {
         cti $$3 = $$1.b(dul.h);
         if ($$3 instanceof ctf $$4) {
            $$4.a(null, $$0, ctf.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$3.a_($$5).b() instanceof cmi) {
         cti $$6 = $$3.c_($$4);
         if ($$6 instanceof ctf $$7) {
            $$7.a(null, $$0, ctf.b.c);
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
