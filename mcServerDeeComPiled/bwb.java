public class bwb extends bvt {
   static final aaj<String> c = aam.a(bwb.class, aal.d);
   static final aaj<rq> d = aam.a(bwb.class, aal.e);
   private final cfy e = new bwb.a();
   private static final int f = 4;
   private int ao;

   public bwb(bbr<? extends bwb> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bwb(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.ae, $$0, $$1, $$2, $$3);
   }

   @Override
   protected cat h() {
      return caz.mo;
   }

   @Override
   protected void a_() {
      super.a_();
      this.ai().a(c, "");
      this.ai().a(d, rp.a);
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.e.b($$0);
      this.ai().b(c, this.y().l());
      this.ai().b(d, this.y().k());
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      this.e.a($$0);
   }

   @Override
   public bvt.a r() {
      return bvt.a.g;
   }

   @Override
   public cvo t() {
      return cju.eU.m();
   }

   public cfy y() {
      return this.e;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.S - this.ao >= 4) {
         this.y().a(this.s);
         this.ao = this.S;
      }

   }

   @Override
   public baj a(buc $$0, bai $$1) {
      return this.e.a($$0);
   }

   @Override
   public void a(aaj<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         try {
            this.e.c(this.ai().a(d));
         } catch (Throwable var3) {
         }
      } else if (c.equals($$0)) {
         this.e.a(this.ai().a(c));
      }

   }

   @Override
   public boolean cF() {
      return true;
   }

   public class a extends cfy {
      @Override
      public agg e() {
         return (agg)bwb.this.s;
      }

      @Override
      public void f() {
         bwb.this.ai().b(bwb.c, this.l());
         bwb.this.ai().b(bwb.d, this.k());
      }

      @Override
      public dwq g() {
         return bwb.this.cY();
      }

      public bwb h() {
         return bwb.this;
      }

      @Override
      public dr i() {
         return new dr(this, bwb.this.cY(), bwb.this.bz(), this.e(), 2, this.m().getString(), bwb.this.C_(), this.e().n(), bwb.this);
      }
   }
}
