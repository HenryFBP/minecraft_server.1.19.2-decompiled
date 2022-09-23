import java.util.List;

public class bul extends buj {
   public static final float e = 4.0F;

   public bul(bbr<? extends bul> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bul(cgx $$0, bcc $$1, double $$2, double $$3, double $$4) {
      super(bbr.t, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      if ($$0.c() != dwo.a.c || !this.d(((dwn)$$0).a())) {
         if (!this.s.y) {
            List<bcc> $$1 = this.s.a(bcc.class, this.cy().c(4.0, 2.0, 4.0));
            bbm $$2 = new bbm(this.s, this.df(), this.dh(), this.dl());
            bbn $$3 = this.x();
            if ($$3 instanceof bcc) {
               $$2.a((bcc)$$3);
            }

            $$2.a(io.i);
            $$2.a(3.0F);
            $$2.b(600);
            $$2.c((7.0F - $$2.h()) / (float)$$2.n());
            $$2.a(new bbg(bbi.g, 1, 1));
            if (!$$1.isEmpty()) {
               for(bcc $$4 : $$1) {
                  double $$5 = this.f($$4);
                  if ($$5 < 16.0) {
                     $$2.e($$4.df(), $$4.dh(), $$4.dl());
                     break;
                  }
               }
            }

            this.s.c(2006, this.da(), this.aM() ? -1 : 1);
            this.s.b($$2);
            this.ah();
         }

      }
   }

   @Override
   public boolean bk() {
      return false;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      return false;
   }

   @Override
   protected im i() {
      return io.i;
   }

   @Override
   protected boolean M_() {
      return false;
   }
}
