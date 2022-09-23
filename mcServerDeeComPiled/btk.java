import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class btk extends bbk implements btn, bto, cfu {
   private static final aaj<Integer> bZ = aam.a(btk.class, aal.b);
   public static final int bX = 300;
   private static final int ca = 8;
   @Nullable
   private buc cb;
   @Nullable
   protected cfw bY;
   private final bao cc = new bao(8);

   public btk(bbr<? extends btk> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.n, 16.0F);
      this.a(dqh.o, -1.0F);
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$3 == null) {
         $$3 = new bbk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public int q() {
      return this.Y.a(bZ);
   }

   public void s(int $$0) {
      this.Y.b(bZ, $$0);
   }

   @Override
   public int fJ() {
      return 0;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? 0.81F : 1.62F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bZ, 0);
   }

   @Override
   public void e(@Nullable buc $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public buc fK() {
      return this.cb;
   }

   public boolean fL() {
      return this.cb != null;
   }

   @Override
   public cfw fM() {
      if (this.bY == null) {
         this.bY = new cfw();
         this.fR();
      }

      return this.bY;
   }

   @Override
   public void a(@Nullable cfw $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(cfv $$0) {
      $$0.j();
      this.bM = -this.J();
      this.b($$0);
      if (this.cb instanceof agh) {
         aj.s.a((agh)this.cb, this, $$0.d());
      }

   }

   protected abstract void b(cfv var1);

   @Override
   public boolean fN() {
      return true;
   }

   @Override
   public void m(cax $$0) {
      if (!this.s.y && this.bM > -this.J() + 20) {
         this.bM = -this.J();
         this.a(this.v(!$$0.b()), this.eC(), this.eD());
      }

   }

   @Override
   public ajv fO() {
      return ajw.vL;
   }

   protected ajv v(boolean $$0) {
      return $$0 ? ajw.vL : ajw.vJ;
   }

   public void fP() {
      this.a(ajw.vG, this.eC(), this.eD());
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      cfw $$1 = this.fM();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (qc)$$1.a());
      }

      $$0.a("Inventory", (qc)this.cc.g());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Offers", 10)) {
         this.bY = new cfw($$0.p("Offers"));
      }

      this.cc.a($$0.c("Inventory", 10));
   }

   @Nullable
   @Override
   public bbn b(agg $$0) {
      this.fQ();
      return super.b($$0);
   }

   protected void fQ() {
      this.e(null);
   }

   @Override
   public void a(baw $$0) {
      super.a($$0);
      this.fQ();
   }

   protected void a(im $$0) {
      for(int $$1 = 0; $$1 < 5; ++$$1) {
         double $$2 = this.R.k() * 0.02;
         double $$3 = this.R.k() * 0.02;
         double $$4 = this.R.k() * 0.02;
         this.s.a($$0, this.d(1.0), this.di() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }

   }

   @Override
   public boolean a(buc $$0) {
      return false;
   }

   @Override
   public bao t() {
      return this.cc;
   }

   @Override
   public bct k(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cc.b() ? bct.a(this.cc, $$1) : super.k($$0);
   }

   protected abstract void fR();

   protected void a(cfw $$0, btt.f[] $$1, int $$2) {
      Set<Integer> $$3 = Sets.newHashSet();
      if ($$1.length > $$2) {
         while($$3.size() < $$2) {
            $$3.add(this.R.a($$1.length));
         }
      } else {
         for(int $$4 = 0; $$4 < $$1.length; ++$$4) {
            $$3.add($$4);
         }
      }

      for(Integer $$5 : $$3) {
         btt.f $$6 = $$1[$$5];
         cfv $$7 = $$6.a(this, this.R);
         if ($$7 != null) {
            $$0.add($$7);
         }
      }

   }

   @Override
   public dwq n(float $$0) {
      float $$1 = ami.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      dwq $$2 = new dwq(0.0, this.cy().c() - 1.0, 0.2);
      return this.k($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean fS() {
      return this.s.y;
   }
}
