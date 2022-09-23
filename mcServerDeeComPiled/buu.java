import com.google.common.base.MoreObjects;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class buu extends bbn {
   @Nullable
   private UUID b;
   @Nullable
   private bbn c;
   private boolean d;
   private boolean e;

   buu(bbr<? extends buu> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public void b(@Nullable bbn $$0) {
      if ($$0 != null) {
         this.b = $$0.co();
         this.c = $$0;
      }

   }

   @Nullable
   public bbn x() {
      if (this.c != null && !this.c.dt()) {
         return this.c;
      } else if (this.b != null && this.s instanceof agg) {
         this.c = ((agg)this.s).a(this.b);
         return this.c;
      } else {
         return null;
      }
   }

   public bbn y() {
      return (bbn)MoreObjects.firstNonNull(this.x(), this);
   }

   @Override
   protected void b(pj $$0) {
      if (this.b != null) {
         $$0.a("Owner", this.b);
      }

      if (this.d) {
         $$0.a("LeftOwner", true);
      }

      $$0.a("HasBeenShot", this.e);
   }

   protected boolean d(bbn $$0) {
      return $$0.co().equals(this.b);
   }

   @Override
   protected void a(pj $$0) {
      if ($$0.b("Owner")) {
         this.b = $$0.a("Owner");
      }

      this.d = $$0.q("LeftOwner");
      this.e = $$0.q("HasBeenShot");
   }

   @Override
   public void k() {
      if (!this.e) {
         this.a(czv.M, this.x());
         this.e = true;
      }

      if (!this.d) {
         this.d = this.i();
      }

      super.k();
   }

   private boolean i() {
      bbn $$0 = this.x();
      if ($$0 != null) {
         for(bbn $$1 : this.s.a(this, this.cy().b(this.dd()).g(1.0), $$0x -> !$$0x.B_() && $$0x.bk())) {
            if ($$1.cO() == $$0.cO()) {
               return false;
            }
         }
      }

      return true;
   }

   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      dwq $$5 = new dwq($$0, $$1, $$2)
         .d()
         .b(this.R.a(0.0, 0.0172275 * (double)$$4), this.R.a(0.0, 0.0172275 * (double)$$4), this.R.a(0.0, 0.0172275 * (double)$$4))
         .a((double)$$3);
      this.f($$5);
      double $$6 = $$5.h();
      this.o((float)(ami.d($$5.c, $$5.e) * 180.0F / (float)Math.PI));
      this.p((float)(ami.d($$5.d, $$6) * 180.0F / (float)Math.PI));
      this.w = this.dq();
      this.x = this.ds();
   }

   public void a(bbn $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = -ami.a($$2 * (float) (Math.PI / 180.0)) * ami.b($$1 * (float) (Math.PI / 180.0));
      float $$7 = -ami.a(($$1 + $$3) * (float) (Math.PI / 180.0));
      float $$8 = ami.b($$2 * (float) (Math.PI / 180.0)) * ami.b($$1 * (float) (Math.PI / 180.0));
      this.c((double)$$6, (double)$$7, (double)$$8, $$4, $$5);
      dwq $$9 = $$0.dd();
      this.f(this.dd().b($$9.c, $$0.aw() ? 0.0 : $$9.d, $$9.e));
   }

   protected void a(dwo $$0) {
      dwo.a $$1 = $$0.c();
      if ($$1 == dwo.a.c) {
         this.a((dwn)$$0);
         this.s.a(czv.L, $$0.e(), czv.a.a(this, null));
      } else if ($$1 == dwo.a.b) {
         dwm $$2 = (dwm)$$0;
         this.a($$2);
         gt $$3 = $$2.a();
         this.s.a(czv.L, $$3, czv.a.a(this, this.s.a_($$3)));
      }

   }

   protected void a(dwn $$0) {
   }

   protected void a(dwm $$0) {
      cvo $$1 = this.s.a_($$0.a());
      $$1.a(this.s, $$1, $$0, this);
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.x == 0.0F && this.w == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.p((float)(ami.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.o((float)(ami.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.x = this.ds();
         this.w = this.dq();
         this.b(this.df(), this.dh(), this.dl(), this.dq(), this.ds());
      }

   }

   protected boolean a(bbn $$0) {
      if (!$$0.B_() && $$0.bo() && $$0.bk()) {
         bbn $$1 = this.x();
         return $$1 == null || this.d || !$$1.v($$0);
      } else {
         return false;
      }
   }

   protected void z() {
      dwq $$0 = this.dd();
      double $$1 = $$0.h();
      this.p(d(this.x, (float)(ami.d($$0.d, $$1) * 180.0F / (float)Math.PI)));
      this.o(d(this.w, (float)(ami.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
   }

   protected static float d(float $$0, float $$1) {
      while($$1 - $$0 < -180.0F) {
         $$0 -= 360.0F;
      }

      while($$1 - $$0 >= 180.0F) {
         $$0 += 360.0F;
      }

      return ami.i(0.2F, $$0, $$1);
   }

   @Override
   public tc<?> S() {
      bbn $$0 = this.x();
      return new tg(this, $$0 == null ? 0 : $$0.ae());
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      bbn $$1 = this.s.a($$0.n());
      if ($$1 != null) {
         this.b($$1);
      }

   }

   @Override
   public boolean a(cgx $$0, gt $$1) {
      bbn $$2 = this.x();
      if ($$2 instanceof buc) {
         return $$2.a($$0, $$1);
      } else {
         return $$2 == null || $$0.W().b(cgt.c);
      }
   }
}
