public class cny extends cps implements cql {
   public static final cwf b = cwe.C;
   public static final cwf c = cwe.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cny(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, gy.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == dpw.c;
      return this.m().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(cvo $$0, cgx $$1, gt $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, ((gy)$$0.c(a)).o().ordinal());
   }

   private void e(cvo $$0, cgx $$1, gt $$2) {
      $$1.a($$2.a(((gy)$$0.c(a)).g()), this);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$1.X() && (long)$$1.w.a(200) <= $$1.U() % 200L && $$2.v() == $$1.a(dar.a.b, $$2.u(), $$2.w()) - 1) {
         aml.a(((gy)$$0.c(a)).o(), $$1, $$2, 0.125, io.aM, azu.a(1, 2));
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.K().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }

      }
   }

   @Override
   public void a(cgx $$0, cvo $$1, dwm $$2, buu $$3) {
      if ($$0.X() && $$3 instanceof bvg && ((bvg)$$3).A()) {
         gt $$4 = $$2.a();
         if ($$0.g($$4)) {
            bcb $$5 = bbr.X.a($$0);
            $$5.d(dwq.c($$4.b()));
            bbn $$6 = $$3.x();
            $$5.b($$6 instanceof agh ? (agh)$$6 : null);
            $$0.b($$5);
            $$0.a(null, $$4, ajw.uS, ajx.d, 5.0F, 1.0F);
         }
      }

   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }
}
