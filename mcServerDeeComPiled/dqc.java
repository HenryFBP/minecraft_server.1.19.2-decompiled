import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dqc extends dpt {
   @Override
   public dpu d() {
      return dpw.b;
   }

   @Override
   public dpu e() {
      return dpw.c;
   }

   @Override
   public cat a() {
      return caz.oI;
   }

   @Override
   public void a(cgx $$0, gt $$1, dpv $$2, amn $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ajw.wN, ajx.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(io.ae, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }

   }

   @Nullable
   @Override
   public im i() {
      return io.m;
   }

   @Override
   protected boolean f() {
      return true;
   }

   @Override
   protected void a(cgy $$0, gt $$1, cvo $$2) {
      cti $$3 = $$2.o() ? $$0.c_($$1) : null;
      cjt.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cha $$0) {
      return 4;
   }

   @Override
   public cvo b(dpv $$0) {
      return cju.C.m().a(cnz.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(dpu $$0) {
      return $$0 == dpw.c || $$0 == dpw.b;
   }

   @Override
   public int c(cha $$0) {
      return 1;
   }

   @Override
   public int a(cha $$0) {
      return 5;
   }

   @Override
   public boolean a(dpv $$0, cgd $$1, gt $$2, dpu $$3, gy $$4) {
      return $$4 == gy.a && !$$3.a(akp.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ajv> k() {
      return Optional.of(ajw.cg);
   }

   public static class a extends dqc {
      @Override
      protected void a(cvp.a<dpu, dpv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(dpv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(dpv $$0) {
         return false;
      }
   }

   public static class b extends dqc {
      @Override
      public int d(dpv $$0) {
         return 8;
      }

      @Override
      public boolean c(dpv $$0) {
         return true;
      }
   }
}
