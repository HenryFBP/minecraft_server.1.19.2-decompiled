import javax.annotation.Nullable;

public class cqe extends cjg implements cql {
   public static final cwf a = cwe.G;
   public static final cwf b = cwe.C;
   public static final cwf c = cwe.H;
   protected static final dxj d = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(gy.a.b);

   public cqe(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      if ($$0 instanceof agg $$4) {
         agh $$5 = cui.a($$3);
         if ($$5 != null) {
            $$4.a($$1, ctk.J).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if ($$1 instanceof agg $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, ctk.J).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, ctk.J).ifPresent($$1x -> $$1x.a($$1));
      }

   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public dxj c(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return d;
   }

   @Override
   public dxj b_(cvo $$0, cgd $$1, gt $$2) {
      return d;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cui($$0, $$1);
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      return this.m().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == dpw.c));
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(b) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, azl.a(5));
      }

   }

   @Nullable
   @Override
   public <T extends cti> czx a(agg $$0, T $$1) {
      return $$1 instanceof cui $$2 ? $$2.c() : null;
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return !$$0.y ? cjg.a($$2, ctk.J, ($$0x, $$1x, $$2x, $$3) -> $$3.c().a($$0x)) : null;
   }
}
