import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class brt extends bqy implements brd, btn {
   private static final aaj<Boolean> b = aam.a(brt.class, aal.i);
   private static final int e = 5;
   private static final int bX = 300;
   private static final float bY = 1.6F;
   private final bao bZ = new bao(5);

   public brt(bbr<? extends brt> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(2, new bvk.a(this, 10.0F));
      this.bS.a(3, new bjp<>(this, 1.0, 8.0F));
      this.bS.a(8, new bjl(this, 0.6));
      this.bS.a(9, new bix(this, buc.class, 15.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 15.0F));
      this.bT.a(1, new bkg(this, bvk.class).a());
      this.bT.a(2, new bkh(this, buc.class, true));
      this.bT.a(3, new bkh(this, btk.class, false));
      this.bT.a(3, new bkh(this, bnq.class, true));
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.d, 0.35F).a(bdd.a, 24.0).a(bdd.f, 5.0).a(bdd.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, false);
   }

   @Override
   public boolean a(cbm $$0) {
      return $$0 == caz.tM;
   }

   public boolean fJ() {
      return this.Y.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.Y.b(b, $$0);
   }

   @Override
   public void a() {
      this.bf = 0;
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      pp $$1 = new pp();

      for(int $$2 = 0; $$2 < this.bZ.b(); ++$$2) {
         cax $$3 = this.bZ.a($$2);
         if (!$$3.b()) {
            $$1.add($$3.b(new pj()));
         }
      }

      $$0.a("Inventory", (qc)$$1);
   }

   @Override
   public bqy.a n() {
      if (this.fJ()) {
         return bqy.a.f;
      } else if (this.b(caz.tM)) {
         return bqy.a.e;
      } else {
         return this.fC() ? bqy.a.b : bqy.a.h;
      }
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      pp $$1 = $$0.c("Inventory", 10);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         cax $$3 = cax.a($$1.a($$2));
         if (!$$3.b()) {
            this.bZ.a($$3);
         }
      }

      this.r(true);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return 0.0F;
   }

   @Override
   public int fo() {
      return 1;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      this.a(bbs.a, new cax(caz.tM));
   }

   @Override
   protected void a(amn $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cax $$2 = this.ez();
         if ($$2.a(caz.tM)) {
            Map<cer, Integer> $$3 = cet.a($$2);
            $$3.putIfAbsent(cev.K, 1);
            cet.a($$3, $$2);
            this.a(bbs.a, $$2);
         }
      }

   }

   @Override
   public boolean p(bbn $$0) {
      if (super.p($$0)) {
         return true;
      } else if ($$0 instanceof bcc && ((bcc)$$0).ey() == bch.d) {
         return this.bY() == null && $$0.bY() == null;
      } else {
         return false;
      }
   }

   @Override
   protected ajv r() {
      return ajw.pC;
   }

   @Override
   protected ajv x_() {
      return ajw.pE;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.pF;
   }

   @Override
   public void a(bcc $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bcc $$0, cax $$1, buu $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bao t() {
      return this.bZ;
   }

   @Override
   protected void b(bqv $$0) {
      cax $$1 = $$0.i();
      if ($$1.c() instanceof byu) {
         super.b($$0);
      } else if (this.m($$1)) {
         this.a($$0);
         cax $$2 = this.bZ.a($$1);
         if ($$2.b()) {
            $$0.ah();
         } else {
            $$1.e($$2.K());
         }
      }

   }

   private boolean m(cax $$0) {
      return this.fY() && $$0.a(caz.sL);
   }

   @Override
   public bct k(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bct.a(this.bZ, $$1) : super.k($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      bvj $$2 = this.fX();
      boolean $$3 = this.R.i() <= $$2.w();
      if ($$3) {
         cax $$4 = new cax(caz.tM);
         Map<cer, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bag.c)) {
            $$5.put(cev.J, 2);
         } else if ($$0 > $$2.a(bag.b)) {
            $$5.put(cev.J, 1);
         }

         $$5.put(cev.I, 1);
         cet.a($$5, $$4);
         this.a(bbs.a, $$4);
      }

   }

   @Override
   public ajv L_() {
      return ajw.pD;
   }
}
