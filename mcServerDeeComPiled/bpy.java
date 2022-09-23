import javax.annotation.Nullable;

public class bpy extends bpr {
   @Nullable
   private dwq b;

   public bpy(bpp $$0) {
      super($$0);
   }

   @Override
   public void b() {
      dwq $$0 = this.a.x(1.0F).d();
      $$0.b((float) (-Math.PI / 4));
      double $$1 = this.a.e.df();
      double $$2 = this.a.e.e(0.5);
      double $$3 = this.a.e.dl();

      for(int $$4 = 0; $$4 < 8; ++$$4) {
         amn $$5 = this.a.dQ();
         double $$6 = $$1 + $$5.k() / 2.0;
         double $$7 = $$2 + $$5.k() / 2.0;
         double $$8 = $$3 + $$5.k() / 2.0;
         dwq $$9 = this.a.dd();
         this.a.s.a(io.i, $$6, $$7, $$8, -$$0.c * 0.08F + $$9.c, -$$0.d * 0.3F + $$9.d, -$$0.e * 0.08F + $$9.e);
         $$0.b((float) (Math.PI / 16));
      }

   }

   @Override
   public void c() {
      if (this.b == null) {
         this.b = dwq.c(this.a.s.a(dar.a.f, dds.e));
      }

      if (this.b.c(this.a.df(), this.a.dh(), this.a.dl()) < 1.0) {
         this.a.fG().b(bqf.f).j();
         this.a.fG().a(bqf.g);
      }

   }

   @Override
   public float f() {
      return 1.5F;
   }

   @Override
   public float h() {
      float $$0 = (float)this.a.dd().h() + 1.0F;
      float $$1 = Math.min($$0, 40.0F);
      return $$1 / $$0;
   }

   @Override
   public void d() {
      this.b = null;
   }

   @Nullable
   @Override
   public dwq g() {
      return this.b;
   }

   @Override
   public bqf<bpy> i() {
      return bqf.d;
   }
}
