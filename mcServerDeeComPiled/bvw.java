import javax.annotation.Nullable;

public class bvw extends bvv implements bbw, bvx {
   private static final int f = 27;
   private hi<cax> ao = hi.a(27, cax.b);
   @Nullable
   private abb ap;
   private long aq;

   public bvw(bbr<? extends bvv> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bvw(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.k, $$0);
      this.e($$1, $$2, $$3);
      this.t = $$1;
      this.u = $$2;
      this.v = $$3;
   }

   @Override
   protected float n() {
      return 0.15F;
   }

   @Override
   protected int t() {
      return 1;
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
   public void a(baw $$0) {
      super.a($$0);
      this.a($$0, this.s, this);
   }

   @Override
   public void a(bbn.c $$0) {
      if (!this.s.y && $$0.a()) {
         baf.a(this.s, this, this);
      }

      super.a($$0);
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      return this.o($$0) && !$$0.fo() ? super.a($$0, $$1) : this.a(this::a, $$0);
   }

   @Override
   public void b(buc $$0) {
      $$0.a((bam)this);
      if (!$$0.s.y) {
         this.a(czv.k, $$0);
         bst.a($$0, true);
      }

   }

   @Override
   public cat h() {
      return switch(this.s()) {
         case b -> caz.mz;
         case c -> caz.mB;
         case d -> caz.mD;
         case e -> caz.mF;
         case f -> caz.mH;
         case g -> caz.mJ;
         default -> caz.mx;
      };
   }

   @Override
   public void a() {
      this.f();
   }

   @Override
   public int b() {
      return 27;
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

   @Nullable
   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      if (this.ap != null && $$2.B_()) {
         return null;
      } else {
         this.d($$1.l);
         return bwt.a($$0, $$1, this);
      }
   }

   public void d(@Nullable buc $$0) {
      this.e($$0);
   }

   @Nullable
   @Override
   public abb y() {
      return this.ap;
   }

   @Override
   public void a(@Nullable abb $$0) {
      this.ap = $$0;
   }

   @Override
   public long z() {
      return this.aq;
   }

   @Override
   public void a(long $$0) {
      this.aq = $$0;
   }

   @Override
   public hi<cax> A() {
      return this.ao;
   }

   @Override
   public void C() {
      this.ao = hi.a(this.b(), cax.b);
   }
}
