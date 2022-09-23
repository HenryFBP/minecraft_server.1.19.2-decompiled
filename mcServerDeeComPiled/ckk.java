import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckk extends cnf implements ccp {
   public static final cwi a = cnf.aD;
   @Nullable
   private cvt b;
   @Nullable
   private cvt c;
   @Nullable
   private cvt d;
   @Nullable
   private cvt e;
   private static final Predicate<cvo> f = $$0 -> $$0 != null && ($$0.a(cju.do) || $$0.a(cju.dp));

   protected ckk(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.c));
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   public boolean a(cha $$0, gt $$1) {
      return this.b().a($$0, $$1) != null || this.u().a($$0, $$1) != null;
   }

   private void a(cgx $$0, gt $$1) {
      cvt.b $$2 = this.q().a($$0, $$1);
      if ($$2 != null) {
         for(int $$3 = 0; $$3 < this.q().b(); ++$$3) {
            cvs $$4 = $$2.a(0, $$3, 0);
            $$0.a($$4.d(), cju.a.m(), 2);
            $$0.c(2001, $$4.d(), cjt.i($$4.a()));
         }

         boc $$5 = bbr.aI.a($$0);
         gt $$6 = $$2.a(0, 2, 0).d();
         $$5.b((double)$$6.u() + 0.5, (double)$$6.v() + 0.05, (double)$$6.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$5);

         for(agh $$7 : $$0.a(agh.class, $$5.cy().g(5.0))) {
            aj.n.a($$7, $$5);
         }

         for(int $$8 = 0; $$8 < this.q().b(); ++$$8) {
            cvs $$9 = $$2.a(0, $$8, 0);
            $$0.b($$9.d(), cju.a);
         }
      } else {
         $$2 = this.v().a($$0, $$1);
         if ($$2 != null) {
            for(int $$10 = 0; $$10 < this.v().c(); ++$$10) {
               for(int $$11 = 0; $$11 < this.v().b(); ++$$11) {
                  cvs $$12 = $$2.a($$10, $$11, 0);
                  $$0.a($$12.d(), cju.a.m(), 2);
                  $$0.c(2001, $$12.d(), cjt.i($$12.a()));
               }
            }

            gt $$13 = $$2.a(1, 2, 0).d();
            bnq $$14 = bbr.S.a($$0);
            $$14.w(true);
            $$14.b((double)$$13.u() + 0.5, (double)$$13.v() + 0.05, (double)$$13.w() + 0.5, 0.0F, 0.0F);
            $$0.b($$14);

            for(agh $$15 : $$0.a(agh.class, $$14.cy().g(5.0))) {
               aj.n.a($$15, $$14);
            }

            for(int $$16 = 0; $$16 < this.v().c(); ++$$16) {
               for(int $$17 = 0; $$17 < this.v().b(); ++$$17) {
                  cvs $$18 = $$2.a($$16, $$17, 0);
                  $$0.b($$18.d(), cju.a);
               }
            }
         }
      }

   }

   @Override
   public cvo a(ccx $$0) {
      return this.m().a(a, $$0.g().g());
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
   }

   private cvt b() {
      if (this.b == null) {
         this.b = cvu.a().a(" ", "#", "#").a('#', cvs.a(cvy.a(cju.cY))).b();
      }

      return this.b;
   }

   private cvt q() {
      if (this.c == null) {
         this.c = cvu.a().a("^", "#", "#").a('^', cvs.a(f)).a('#', cvs.a(cvy.a(cju.cY))).b();
      }

      return this.c;
   }

   private cvt u() {
      if (this.d == null) {
         this.d = cvu.a().a("~ ~", "###", "~#~").a('#', cvs.a(cvy.a(cju.bU))).a('~', cvs.a(cvw.a(dpz.a))).b();
      }

      return this.d;
   }

   private cvt v() {
      if (this.e == null) {
         this.e = cvu.a().a("~^~", "###", "~#~").a('^', cvs.a(f)).a('#', cvs.a(cvy.a(cju.bU))).a('~', cvs.a(cvw.a(dpz.a))).b();
      }

      return this.e;
   }
}
