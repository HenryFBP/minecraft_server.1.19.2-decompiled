import javax.annotation.Nullable;

public class bqw extends bbn {
   private static final aaj<Integer> b = aam.a(bqw.class, aal.b);
   private static final int c = 80;
   @Nullable
   private bcc d;

   public bqw(bbr<? extends bqw> $$0, cgx $$1) {
      super($$0, $$1);
      this.q = true;
   }

   public bqw(cgx $$0, double $$1, double $$2, double $$3, @Nullable bcc $$4) {
      this(bbr.av, $$0);
      this.e($$1, $$2, $$3);
      double $$5 = $$0.w.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.a(80);
      this.t = $$1;
      this.u = $$2;
      this.v = $$3;
      this.d = $$4;
   }

   @Override
   protected void a_() {
      this.Y.a(b, 80);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   public boolean bk() {
      return !this.dt();
   }

   @Override
   public void k() {
      if (!this.aN()) {
         this.f(this.dd().b(0.0, -0.04, 0.0));
      }

      this.a(bci.a, this.dd());
      this.f(this.dd().a(0.98));
      if (this.y) {
         this.f(this.dd().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.i() - 1;
      this.a($$0);
      if ($$0 <= 0) {
         this.ah();
         if (!this.s.y) {
            this.j();
         }
      } else {
         this.aY();
         if (this.s.y) {
            this.s.a(io.Y, this.df(), this.dh() + 0.5, this.dl(), 0.0, 0.0, 0.0);
         }
      }

   }

   private void j() {
      float $$0 = 4.0F;
      this.s.a(this, this.df(), this.e(0.0625), this.dl(), 4.0F, cgp.a.b);
   }

   @Override
   protected void b(pj $$0) {
      $$0.a("Fuse", (short)this.i());
   }

   @Override
   protected void a(pj $$0) {
      this.a($$0.g("Fuse"));
   }

   @Nullable
   public bcc h() {
      return this.d;
   }

   @Override
   protected float a(bco $$0, bbo $$1) {
      return 0.15F;
   }

   public void a(int $$0) {
      this.Y.b(b, $$0);
   }

   public int i() {
      return this.Y.a(b);
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }
}
