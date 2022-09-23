import javax.annotation.Nullable;

public abstract class cmx extends cjt {
   protected final gy a;
   protected final boolean b;
   protected final dxj c;

   protected cmx(cvn.c $$0, gy $$1, dxj $$2, boolean $$3) {
      super($$0);
      this.a = $$1;
      this.c = $$2;
      this.b = $$3;
   }

   @Nullable
   @Override
   public cvo a(ccx $$0) {
      cvo $$1 = $$0.q().a_($$0.a().a(this.a));
      return !$$1.a(this.c()) && !$$1.a(this.b()) ? this.a($$0.q()) : this.b().m();
   }

   public cvo a(cgy $$0) {
      return this.m();
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      gt $$3 = $$2.a(this.a.g());
      cvo $$4 = $$1.a_($$3);
      if (!this.h($$4)) {
         return false;
      } else {
         return $$4.a(this.c()) || $$4.a(this.b()) || $$4.d($$1, $$3, this.a);
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }

   }

   protected boolean h(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return this.c;
   }

   protected abstract cmz c();

   protected abstract cjt b();
}
