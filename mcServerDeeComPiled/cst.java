import javax.annotation.Nullable;

public class cst extends cqm {
   @Nullable
   private static cvt d;
   @Nullable
   private static cvt e;

   protected cst(cvn.c $$0) {
      super(cqm.b.b, $$0);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, @Nullable bcc $$3, cax $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cti $$5 = $$0.c_($$1);
      if ($$5 instanceof cul) {
         a($$0, $$1, (cul)$$5);
      }

   }

   public static void a(cgx $$0, gt $$1, cul $$2) {
      if (!$$0.y) {
         cvo $$3 = $$2.q();
         boolean $$4 = $$3.a(cju.fJ) || $$3.a(cju.fK);
         if ($$4 && $$1.v() >= $$0.u_() && $$0.ag() != bag.a) {
            cvt $$5 = q();
            cvt.b $$6 = $$5.a($$0, $$1);
            if ($$6 != null) {
               for(int $$7 = 0; $$7 < $$5.c(); ++$$7) {
                  for(int $$8 = 0; $$8 < $$5.b(); ++$$8) {
                     cvs $$9 = $$6.a($$7, $$8, 0);
                     $$0.a($$9.d(), cju.a.m(), 2);
                     $$0.c(2001, $$9.d(), cjt.i($$9.a()));
                  }
               }

               bqj $$10 = bbr.be.a($$0);
               gt $$11 = $$6.a(1, 2, 0).d();
               $$10.b((double)$$11.u() + 0.5, (double)$$11.v() + 0.55, (double)$$11.w() + 0.5, $$6.b().o() == gy.a.a ? 0.0F : 90.0F, 0.0F);
               $$10.aX = $$6.b().o() == gy.a.a ? 0.0F : 90.0F;
               $$10.n();

               for(agh $$12 : $$0.a(agh.class, $$10.cy().g(50.0))) {
                  aj.n.a($$12, $$10);
               }

               $$0.b($$10);

               for(int $$13 = 0; $$13 < $$5.c(); ++$$13) {
                  for(int $$14 = 0; $$14 < $$5.b(); ++$$14) {
                     $$0.b($$6.a($$13, $$14, 0).d(), cju.a);
                  }
               }

            }
         }
      }
   }

   public static boolean b(cgx $$0, gt $$1, cax $$2) {
      if ($$2.a(caz.sj) && $$1.v() >= $$0.u_() + 2 && $$0.ag() != bag.a && !$$0.y) {
         return u().a($$0, $$1) != null;
      } else {
         return false;
      }
   }

   private static cvt q() {
      if (d == null) {
         d = cvu.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(akl.aw)).a('^', cvs.a(cvy.a(cju.fJ).or(cvy.a(cju.fK)))).a('~', cvs.a(cvw.a(dpz.a))).b();
      }

      return d;
   }

   private static cvt u() {
      if (e == null) {
         e = cvu.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(akl.aw)).a('~', cvs.a(cvw.a(dpz.a))).b();
      }

      return e;
   }
}
