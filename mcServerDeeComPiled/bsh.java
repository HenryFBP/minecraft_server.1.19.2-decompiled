import javax.annotation.Nullable;

public class bsh extends bqz {
   public bsh(bbr<? extends bsh> $$0, cgx $$1) {
      super($$0, $$1);
      this.a(dqh.i, 8.0F);
   }

   @Override
   protected void u() {
      this.bT.a(3, new bkh(this, bsr.class, true));
      super.u();
   }

   @Override
   protected ajv r() {
      return ajw.xg;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.xi;
   }

   @Override
   protected ajv x_() {
      return ajw.xh;
   }

   @Override
   ajv q() {
      return ajw.xj;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bbn $$3 = $$0.m();
      if ($$3 instanceof brc $$4 && $$4.fK()) {
         $$4.fL();
         this.a((cgw)caz.sj);
      }

   }

   @Override
   protected void a(amn $$0, bah $$1) {
      this.a(bbs.a, new cax(caz.nm));
   }

   @Override
   protected void b(amn $$0, bah $$1) {
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      bcu $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bdd.f).a(4.0);
      this.t();
      return $$5;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 2.1F;
   }

   @Override
   public boolean z(bbn $$0) {
      if (!super.z($$0)) {
         return false;
      } else {
         if ($$0 instanceof bcc) {
            ((bcc)$$0).b(new bbg(bbi.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected bui b(cax $$0, float $$1) {
      bui $$2 = super.b($$0, $$1);
      $$2.f(100);
      return $$2;
   }

   @Override
   public boolean c(bbg $$0) {
      return $$0.b() == bbi.t ? false : super.c($$0);
   }
}
