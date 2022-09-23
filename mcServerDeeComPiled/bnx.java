import java.util.List;
import java.util.function.Predicate;

public class bnx extends bnb {
   private static final aaj<Integer> e = aam.a(bnx.class, aal.b);
   int bX;
   int bY;
   private static final Predicate<bcc> bZ = $$0 -> {
      if ($$0 instanceof buc && ((buc)$$0).f()) {
         return false;
      } else {
         return $$0.ad() == bbr.f || $$0.ey() != bch.e;
      }
   };
   static final bmf ca = bmf.b().e().d().a(bZ);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bnx(bbr<? extends bnx> $$0, cgx $$1) {
      super($$0, $$1);
      this.z_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(e, 0);
   }

   public int fL() {
      return this.Y.a(e);
   }

   public void b(int $$0) {
      this.Y.b(e, $$0);
   }

   @Override
   public void a(aaj<?> $$0) {
      if (e.equals($$0)) {
         this.z_();
      }

      super.a($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("PuffState", this.fL());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cax b() {
      return new cax(caz.oO);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(1, new bnx.a(this));
   }

   @Override
   public void k() {
      if (!this.s.y && this.bo() && this.eP()) {
         if (this.bX > 0) {
            if (this.fL() == 0) {
               this.a(ajw.qx, this.eC(), this.eD());
               this.b(1);
            } else if (this.bX > 40 && this.fL() == 1) {
               this.a(ajw.qx, this.eC(), this.eD());
               this.b(2);
            }

            ++this.bX;
         } else if (this.fL() != 0) {
            if (this.bY > 60 && this.fL() == 2) {
               this.a(ajw.qw, this.eC(), this.eD());
               this.b(1);
            } else if (this.bY > 100 && this.fL() == 1) {
               this.a(ajw.qw, this.eC(), this.eD());
               this.b(0);
            }

            ++this.bY;
         }
      }

      super.k();
   }

   @Override
   public void w_() {
      super.w_();
      if (this.bo() && this.fL() > 0) {
         for(bce $$1 : this.s.a(bce.class, this.cy().g(0.3), $$0 -> ca.a(this, $$0))) {
            if ($$1.bo()) {
               this.a($$1);
            }
         }
      }

   }

   private void a(bce $$0) {
      int $$1 = this.fL();
      if ($$0.a(baw.c(this), (float)(1 + $$1))) {
         $$0.b(new bbg(bbi.s, 60 * $$1, 0), this);
         this.a(ajw.qB, 1.0F, 1.0F);
      }

   }

   @Override
   public void b_(buc $$0) {
      int $$1 = this.fL();
      if ($$0 instanceof agh && $$1 > 0 && $$0.a(baw.c(this), (float)(1 + $$1))) {
         if (!this.aM()) {
            ((agh)$$0).b.a(new uj(uj.j, 0.0F));
         }

         $$0.b(new bbg(bbi.s, 60 * $$1, 0), this);
      }

   }

   @Override
   protected ajv r() {
      return ajw.qv;
   }

   @Override
   protected ajv x_() {
      return ajw.qy;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.qA;
   }

   @Override
   protected ajv fK() {
      return ajw.qz;
   }

   @Override
   public bbo a(bco $$0) {
      return super.a($$0).a(c(this.fL()));
   }

   private static float c(int $$0) {
      switch($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bip {
      private final bnx a;

      public a(bnx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bcc> $$0 = this.a.s.a(bcc.class, this.a.cy().g(2.0), $$0x -> bnx.ca.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bX = 1;
         this.a.bY = 0;
      }

      @Override
      public void d() {
         this.a.bX = 0;
      }
   }
}
