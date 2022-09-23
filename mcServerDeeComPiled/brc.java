import java.util.Collection;
import javax.annotation.Nullable;

public class brc extends brq implements bcp {
   private static final aaj<Integer> b = aam.a(brc.class, aal.b);
   private static final aaj<Boolean> c = aam.a(brc.class, aal.i);
   private static final aaj<Boolean> d = aam.a(brc.class, aal.i);
   private int e;
   private int bX;
   private int bY = 30;
   private int bZ = 3;
   private int ca;

   public brc(bbr<? extends brc> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      this.bS.a(1, new bij(this));
      this.bS.a(2, new bjv(this));
      this.bS.a(3, new bhw(this, bns.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new bhw(this, bnh.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new biz(this, 1.0, false));
      this.bS.a(5, new bkb(this, 0.8));
      this.bS.a(6, new bix(this, buc.class, 8.0F));
      this.bS.a(6, new bjk(this));
      this.bT.a(1, new bkh(this, buc.class, true));
      this.bT.a(2, new bkg(this));
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.d, 0.25);
   }

   @Override
   public int cl() {
      return this.G() == null ? 3 : 3 + (int)(this.ef() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bX += (int)($$0 * 1.5F);
      if (this.bX > this.bY - 5) {
         this.bX = this.bY - 5;
      }

      return $$3;
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(b, -1);
      this.Y.a(c, false);
      this.Y.a(d, false);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.Y.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bY);
      $$0.a("ExplosionRadius", (byte)this.bZ);
      $$0.a("ignited", this.t());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.Y.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bY = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bZ = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.fJ();
      }

   }

   @Override
   public void k() {
      if (this.bo()) {
         this.e = this.bX;
         if (this.t()) {
            this.a(1);
         }

         int $$0 = this.q();
         if ($$0 > 0 && this.bX == 0) {
            this.a(ajw.dN, 1.0F, 0.5F);
            this.a(czv.K);
         }

         this.bX += $$0;
         if (this.bX < 0) {
            this.bX = 0;
         }

         if (this.bX >= this.bY) {
            this.bX = this.bY;
            this.fM();
         }
      }

      super.k();
   }

   @Override
   public void h(@Nullable bcc $$0) {
      if (!($$0 instanceof bow)) {
         super.h($$0);
      }
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.dM;
   }

   @Override
   protected ajv x_() {
      return ajw.dL;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bbn $$3 = $$0.m();
      if ($$3 != this && $$3 instanceof brc $$4 && $$4.fK()) {
         $$4.fL();
         this.a(caz.sm);
      }

   }

   @Override
   public boolean z(bbn $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.Y.a(c);
   }

   public float y(float $$0) {
      return ami.i($$0, (float)this.e, (float)this.bX) / (float)(this.bY - 2);
   }

   public int q() {
      return this.Y.a(b);
   }

   public void a(int $$0) {
      this.Y.b(b, $$0);
   }

   @Override
   public void a(agg $$0, bcb $$1) {
      super.a($$0, $$1);
      this.Y.b(c, true);
   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.mO)) {
         this.s.a($$0, this.df(), this.dh(), this.dl(), ajw.gt, this.cR(), 1.0F, this.R.i() * 0.4F + 0.8F);
         if (!this.s.y) {
            this.fJ();
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void fM() {
      if (!this.s.y) {
         cgp.a $$0 = this.s.W().b(cgt.c) ? cgp.a.c : cgp.a.a;
         float $$1 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.s.a(this, this.df(), this.dh(), this.dl(), (float)this.bZ * $$1, $$0);
         this.ah();
         this.fP();
      }

   }

   private void fP() {
      Collection<bbg> $$0 = this.ec();
      if (!$$0.isEmpty()) {
         bbm $$1 = new bbm(this.s, this.df(), this.dh(), this.dl());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.n() / 2);
         $$1.c(-$$1.h() / (float)$$1.n());

         for(bbg $$2 : $$0) {
            $$1.a(new bbg($$2));
         }

         this.s.b($$1);
      }

   }

   public boolean t() {
      return this.Y.a(d);
   }

   public void fJ() {
      this.Y.b(d, true);
   }

   public boolean fK() {
      return this.a() && this.ca < 1;
   }

   public void fL() {
      ++this.ca;
   }
}
