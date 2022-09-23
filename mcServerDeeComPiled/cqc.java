import javax.annotation.Nullable;

public class cqc extends cjg {
   public static final int a = 8;
   public static final cwf b = cwe.F;
   private final azo c = azl.a(5);

   public cqc(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }

   }

   public static void a(agg $$0, gt $$1, cvo $$2, amn $$3) {
      $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 3);
      $$0.a($$1, $$2.b(), 8);
      $$0.a(io.D, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
      $$0.a(null, $$1, ajw.rG, ajx.e, 2.0F, 0.6F + $$3.i() * 0.4F);
   }

   @Nullable
   @Override
   public cti a(gt $$0, cvo $$1) {
      return new cug($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends cti> czx a(agg $$0, T $$1) {
      return $$1 instanceof cug ? (cug)$$1 : null;
   }

   @Nullable
   @Override
   public <T extends cti> ctj<T> a(cgx $$0, cvo $$1, ctk<T> $$2) {
      return $$0.y ? null : a($$2, ctk.I, cug::a);
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.c;
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, cax $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }

   }
}
