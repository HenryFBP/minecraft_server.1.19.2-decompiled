import java.util.Collection;

public class cqg extends cok implements cqa, cql {
   private static final cwf b = cwe.C;
   private final col c = new col(new cqg.a(col.a));
   private final col d = new col(new cqg.a(col.e.a));

   public cqg(cvn.c $$0) {
      super($$0);
      this.k(this.m().a(b, Boolean.valueOf(false)));
   }

   @Override
   public col c() {
      return this.c;
   }

   public col d() {
      return this.d;
   }

   public static boolean a(cgy $$0, gt $$1, cvo $$2, Collection<gy> $$3) {
      boolean $$4 = false;
      cvo $$5 = cju.pq.m();

      for(gy $$6 : $$3) {
         gt $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.p().c()) {
            $$5 = $$5.a(b, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(cgy $$0, cvo $$1, gt $$2, amn $$3) {
      if ($$1.a(this)) {
         for(gy $$4 : a) {
            cwf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cju.pp)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            dpv $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cju.a : cju.C).m();
         }

         $$0.a($$2, $$1, 3);
         cqa.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(cqf.a $$0, cgy $$1, gt $$2, amn $$3, cqf $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ami.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(cqf $$0, cgy $$1, gt $$2, amn $$3) {
      cvo $$4 = $$1.a_($$2);
      akz<cjt> $$5 = $$0.c();

      for(gy $$6 : gy.a($$3)) {
         if (a($$4, $$6)) {
            gt $$7 = $$2.a($$6);
            cvo $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               cvo $$9 = cju.pp.m();
               $$1.a($$7, $$9, 3);
               cjt.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, ajw.rz, ajx.e, 1.0F, 1.0F);
               this.c.a($$9, $$1, $$7, $$0.h());
               gy $$10 = $$6.g();

               for(gy $$11 : a) {
                  if ($$11 != $$10) {
                     gt $$12 = $$7.a($$11);
                     cvo $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(cgy $$0, cvo $$1, gt $$2) {
      if (!$$1.a(cju.pq)) {
         return false;
      } else {
         for(gy $$3 : a) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(akl.bA)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public boolean a(cvo $$0, ccx $$1) {
      return !$$1.n().a(caz.fp) || super.a($$0, $$1);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.b;
   }

   class a extends col.a {
      private final col.e[] c;

      public a(col.e... $$0) {
         super(cqg.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cgd $$0, gt $$1, gt $$2, gy $$3, cvo $$4) {
         cvo $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cju.pp) && !$$5.a(cju.pr) && !$$5.a(cju.bD)) {
            if ($$1.k($$2) == 2) {
               gt $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            dpv $$7 = $$4.p();
            if (!$$7.c() && !$$7.b(dpw.c)) {
               return false;
            } else {
               dpz $$8 = $$4.d();
               if ($$8 == dpz.n) {
                  return false;
               } else {
                  return $$8.e() || super.a($$0, $$1, $$2, $$3, $$4);
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public col.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(cvo $$0) {
         return !$$0.a(cju.pq);
      }
   }
}
