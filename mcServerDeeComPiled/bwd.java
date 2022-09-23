import java.util.List;

public class bwd extends bvu implements ctz {
   public static final int c = 4;
   private boolean f = true;
   private int ao = -1;
   private final gt ap = gt.b;

   public bwd(bbr<? extends bwd> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bwd(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.ag, $$1, $$2, $$3, $$0);
   }

   @Override
   public bvt.a r() {
      return bvt.a.f;
   }

   @Override
   public cvo t() {
      return cju.gd.m();
   }

   @Override
   public int w() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.D()) {
         this.p($$4);
      }

   }

   public boolean D() {
      return this.f;
   }

   public void p(boolean $$0) {
      this.f = $$0;
   }

   @Override
   public double E() {
      return this.df();
   }

   @Override
   public double F() {
      return this.dh() + 0.5;
   }

   @Override
   public double G() {
      return this.dl();
   }

   @Override
   public void k() {
      super.k();
      if (!this.s.y && this.bo() && this.D()) {
         gt $$0 = this.da();
         if ($$0.equals(this.ap)) {
            --this.ao;
         } else {
            this.n(0);
         }

         if (!this.J()) {
            this.n(0);
            if (this.I()) {
               this.n(4);
               this.e();
            }
         }
      }

   }

   public boolean I() {
      if (cua.a(this.s, this)) {
         return true;
      } else {
         List<bqv> $$0 = this.s.a(bqv.class, this.cy().c(0.25, 0.0, 0.25), bbq.a);
         if (!$$0.isEmpty()) {
            cua.a(this, (bqv)$$0.get(0));
         }

         return false;
      }
   }

   @Override
   protected cat h() {
      return caz.ms;
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("TransferCooldown", this.ao);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.ao = $$0.h("TransferCooldown");
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   public void n(int $$0) {
      this.ao = $$0;
   }

   public boolean J() {
      return this.ao > 0;
   }

   @Override
   public bwm a(int $$0, bub $$1) {
      return new bxj($$0, $$1, this);
   }
}
