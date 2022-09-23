import javax.annotation.Nullable;

public abstract class bvu extends bvt implements bvx {
   private hi<cax> c = hi.a(36, cax.b);
   @Nullable
   private abb d;
   private long e;

   protected bvu(bbr<?> $$0, cgx $$1) {
      super($$0, $$1);
   }

   protected bvu(bbr<?> $$0, double $$1, double $$2, double $$3, cgx $$4) {
      super($$0, $$4, $$1, $$2, $$3);
   }

   @Override
   public void a(baw $$0) {
      super.a($$0);
      this.a($$0, this.s, this);
   }

   @Override
   public cax a(int $$0) {
      return this.d_($$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      return this.b($$0, $$1);
   }

   @Override
   public cax b(int $$0) {
      return this.c_($$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.c($$0, $$1);
   }

   @Override
   public bct k(int $$0) {
      return this.e_($$0);
   }

   @Override
   public void e() {
   }

   @Override
   public boolean a(buc $$0) {
      return this.f($$0);
   }

   @Override
   public void a(bbn.c $$0) {
      if (!this.s.y && $$0.a()) {
         baf.a(this.s, this, this);
      }

      super.a($$0);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.a_($$0);
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      return this.a(this::a, $$0);
   }

   @Override
   protected void l() {
      float $$0 = 0.98F;
      if (this.d == null) {
         int $$1 = 15 - bwm.b(this);
         $$0 += (float)$$1 * 0.001F;
      }

      if (this.aR()) {
         $$0 *= 0.95F;
      }

      this.f(this.dd().d((double)$$0, 0.0, (double)$$0));
   }

   @Override
   public void a() {
      this.f();
   }

   public void a(abb $$0, long $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      if (this.d != null && $$2.B_()) {
         return null;
      } else {
         this.e($$1.l);
         return this.a($$0, $$1);
      }
   }

   protected abstract bwm a(int var1, bub var2);

   @Nullable
   @Override
   public abb y() {
      return this.d;
   }

   @Override
   public void a(@Nullable abb $$0) {
      this.d = $$0;
   }

   @Override
   public long z() {
      return this.e;
   }

   @Override
   public void a(long $$0) {
      this.e = $$0;
   }

   @Override
   public hi<cax> A() {
      return this.c;
   }

   @Override
   public void C() {
      this.c = hi.a(this.b(), cax.b);
   }
}
