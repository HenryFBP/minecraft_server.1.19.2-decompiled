import java.util.Optional;
import javax.annotation.Nullable;

public class bpo extends bbn {
   private static final aaj<Optional<gt>> c = aam.a(bpo.class, aal.m);
   private static final aaj<Boolean> d = aam.a(bpo.class, aal.i);
   public int b;

   public bpo(bbr<? extends bpo> $$0, cgx $$1) {
      super($$0, $$1);
      this.q = true;
      this.b = this.R.a(100000);
   }

   public bpo(cgx $$0, double $$1, double $$2, double $$3) {
      this(bbr.w, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   protected void a_() {
      this.ai().a(c, Optional.empty());
      this.ai().a(d, true);
   }

   @Override
   public void k() {
      ++this.b;
      if (this.s instanceof agg) {
         gt $$0 = this.da();
         if (((agg)this.s).C() != null && this.s.a_($$0).h()) {
            this.s.b($$0, cjh.a(this.s, $$0));
         }
      }

   }

   @Override
   protected void b(pj $$0) {
      if (this.h() != null) {
         $$0.a("BeamTarget", (qc)pv.a(this.h()));
      }

      $$0.a("ShowBottom", this.i());
   }

   @Override
   protected void a(pj $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(pv.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }

   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.m() instanceof bpp) {
         return false;
      } else {
         if (!this.dt() && !this.s.y) {
            this.a(bbn.c.a);
            if (!$$0.d()) {
               this.s.a(null, this.df(), this.dh(), this.dl(), 6.0F, cgp.a.c);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ag() {
      this.a(baw.n);
      super.ag();
   }

   private void a(baw $$0) {
      if (this.s instanceof agg) {
         cyx $$1 = ((agg)this.s).C();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }

   }

   public void a(@Nullable gt $$0) {
      this.ai().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gt h() {
      return (gt)((Optional)this.ai().a(c)).orElse(null);
   }

   public void a(boolean $$0) {
      this.ai().b(d, $$0);
   }

   public boolean i() {
      return this.ai().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.h() != null;
   }

   @Override
   public cax dn() {
      return new cax(caz.tb);
   }

   @Override
   public tc<?> S() {
      return new tg(this);
   }
}
