import java.util.function.Supplier;

public class crf extends cka implements cjv {
   public static final int a = 7;
   public static final cwo b = cwe.av;
   protected static final float c = 1.0F;
   protected static final dxj[] d = new dxj[]{
      cjt.a(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      cjt.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final crg e;
   private final Supplier<cat> f;

   protected crf(crg $$0, Supplier<cat> $$1, cvn.c $$2) {
      super($$2);
      this.e = $$0;
      this.f = $$1;
      this.k(this.D.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d[$$0.c(b)];
   }

   @Override
   protected boolean d(cvo $$0, cgd $$1, gt $$2) {
      return $$0.a(cju.cn);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = clf.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(b);
            if ($$5 < 7) {
               $$0 = $$0.a(b, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               gy $$6 = gy.c.a.a($$3);
               gt $$7 = $$2.a($$6);
               cvo $$8 = $$1.a_($$7.c());
               if ($$1.a_($$7).h() && ($$8.a(cju.cn) || $$8.a(akl.ac))) {
                  $$1.b($$7, this.e.m());
                  $$1.b($$2, this.e.c().m().a(cnf.aD, $$6));
               }
            }
         }

      }
   }

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      return new cax((cgw)this.f.get());
   }

   @Override
   public boolean a(cgd $$0, gt $$1, cvo $$2, boolean $$3) {
      return $$2.c(b) != 7;
   }

   @Override
   public boolean a(cgx $$0, amn $$1, gt $$2, cvo $$3) {
      return true;
   }

   @Override
   public void a(agg $$0, amn $$1, gt $$2, cvo $$3) {
      int $$4 = Math.min(7, $$3.c(b) + ami.a($$0.w, 2, 5));
      cvo $$5 = $$3.a(b, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.w);
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   public crg b() {
      return this.e;
   }
}
