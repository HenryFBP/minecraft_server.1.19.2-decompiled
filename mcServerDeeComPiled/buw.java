import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class buw extends buu {
   private static final double b = 0.15;
   @Nullable
   private bbn c;
   @Nullable
   private gy d;
   private int e;
   private double f;
   private double ao;
   private double ap;
   @Nullable
   private UUID aq;

   public buw(bbr<? extends buw> $$0, cgx $$1) {
      super($$0, $$1);
      this.Q = true;
   }

   public buw(cgx $$0, bcc $$1, bbn $$2, gy.a $$3) {
      this(bbr.aC, $$0);
      this.b($$1);
      gt $$4 = $$1.da();
      double $$5 = (double)$$4.u() + 0.5;
      double $$6 = (double)$$4.v() + 0.5;
      double $$7 = (double)$$4.w() + 0.5;
      this.b($$5, $$6, $$7, this.dq(), this.ds());
      this.c = $$2;
      this.d = gy.b;
      this.a($$3);
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (this.c != null) {
         $$0.a("Target", this.c.co());
      }

      if (this.d != null) {
         $$0.a("Dir", this.d.d());
      }

      $$0.a("Steps", this.e);
      $$0.a("TXD", this.f);
      $$0.a("TYD", this.ao);
      $$0.a("TZD", this.ap);
   }

   @Override
   protected void a(pj $$0) {
      super.a($$0);
      this.e = $$0.h("Steps");
      this.f = $$0.k("TXD");
      this.ao = $$0.k("TYD");
      this.ap = $$0.k("TZD");
      if ($$0.b("Dir", 99)) {
         this.d = gy.a($$0.h("Dir"));
      }

      if ($$0.b("Target")) {
         this.aq = $$0.a("Target");
      }

   }

   @Override
   protected void a_() {
   }

   @Nullable
   private gy h() {
      return this.d;
   }

   private void a(@Nullable gy $$0) {
      this.d = $$0;
   }

   private void a(@Nullable gy.a $$0) {
      double $$1 = 0.5;
      gt $$2;
      if (this.c == null) {
         $$2 = this.da().c();
      } else {
         $$1 = (double)this.c.cX() * 0.5;
         $$2 = new gt(this.c.df(), this.c.dh() + $$1, this.c.dl());
      }

      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + $$1;
      double $$6 = (double)$$2.w() + 0.5;
      gy $$7 = null;
      if (!$$2.a(this.cY(), 2.0)) {
         gt $$8 = this.da();
         List<gy> $$9 = Lists.newArrayList();
         if ($$0 != gy.a.a) {
            if ($$8.u() < $$2.u() && this.s.x($$8.g())) {
               $$9.add(gy.f);
            } else if ($$8.u() > $$2.u() && this.s.x($$8.f())) {
               $$9.add(gy.e);
            }
         }

         if ($$0 != gy.a.b) {
            if ($$8.v() < $$2.v() && this.s.x($$8.b())) {
               $$9.add(gy.b);
            } else if ($$8.v() > $$2.v() && this.s.x($$8.c())) {
               $$9.add(gy.a);
            }
         }

         if ($$0 != gy.a.c) {
            if ($$8.w() < $$2.w() && this.s.x($$8.e())) {
               $$9.add(gy.d);
            } else if ($$8.w() > $$2.w() && this.s.x($$8.d())) {
               $$9.add(gy.c);
            }
         }

         $$7 = gy.b(this.R);
         if ($$9.isEmpty()) {
            for(int $$10 = 5; !this.s.x($$8.a($$7)) && $$10 > 0; --$$10) {
               $$7 = gy.b(this.R);
            }
         } else {
            $$7 = (gy)$$9.get(this.R.a($$9.size()));
         }

         $$4 = this.df() + (double)$$7.j();
         $$5 = this.dh() + (double)$$7.k();
         $$6 = this.dl() + (double)$$7.l();
      }

      this.a($$7);
      double $$11 = $$4 - this.df();
      double $$12 = $$5 - this.dh();
      double $$13 = $$6 - this.dl();
      double $$14 = Math.sqrt($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
      if ($$14 == 0.0) {
         this.f = 0.0;
         this.ao = 0.0;
         this.ap = 0.0;
      } else {
         this.f = $$11 / $$14 * 0.15;
         this.ao = $$12 / $$14 * 0.15;
         this.ap = $$13 / $$14 * 0.15;
      }

      this.af = true;
      this.e = 10 + this.R.a(5) * 10;
   }

   @Override
   public void dm() {
      if (this.s.ag() == bag.a) {
         this.ah();
      }

   }

   @Override
   public void k() {
      super.k();
      if (!this.s.y) {
         if (this.c == null && this.aq != null) {
            this.c = ((agg)this.s).a(this.aq);
            if (this.c == null) {
               this.aq = null;
            }
         }

         if (this.c == null || !this.c.bo() || this.c instanceof buc && this.c.B_()) {
            if (!this.aN()) {
               this.f(this.dd().b(0.0, -0.04, 0.0));
            }
         } else {
            this.f = ami.a(this.f * 1.025, -1.0, 1.0);
            this.ao = ami.a(this.ao * 1.025, -1.0, 1.0);
            this.ap = ami.a(this.ap * 1.025, -1.0, 1.0);
            dwq $$0 = this.dd();
            this.f($$0.b((this.f - $$0.c) * 0.2, (this.ao - $$0.d) * 0.2, (this.ap - $$0.e) * 0.2));
         }

         dwo $$1 = buv.a(this, this::a);
         if ($$1.c() != dwo.a.a) {
            this.a($$1);
         }
      }

      this.aJ();
      dwq $$2 = this.dd();
      this.e(this.df() + $$2.c, this.dh() + $$2.d, this.dl() + $$2.e);
      buv.a(this, 0.5F);
      if (this.s.y) {
         this.s.a(io.u, this.df() - $$2.c, this.dh() - $$2.d + 0.15, this.dl() - $$2.e, 0.0, 0.0, 0.0);
      } else if (this.c != null && !this.c.dt()) {
         if (this.e > 0) {
            --this.e;
            if (this.e == 0) {
               this.a(this.d == null ? null : this.d.o());
            }
         }

         if (this.d != null) {
            gt $$3 = this.da();
            gy.a $$4 = this.d.o();
            if (this.s.a($$3.a(this.d), this)) {
               this.a($$4);
            } else {
               gt $$5 = this.c.da();
               if ($$4 == gy.a.a && $$3.u() == $$5.u() || $$4 == gy.a.c && $$3.w() == $$5.w() || $$4 == gy.a.b && $$3.v() == $$5.v()) {
                  this.a($$4);
               }
            }
         }
      }

   }

   @Override
   protected boolean a(bbn $$0) {
      return super.a($$0) && !$$0.Q;
   }

   @Override
   public boolean bH() {
      return false;
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 16384.0;
   }

   @Override
   public float bg() {
      return 1.0F;
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      bbn $$1 = $$0.a();
      bbn $$2 = this.x();
      bcc $$3 = $$2 instanceof bcc ? (bcc)$$2 : null;
      boolean $$4 = $$1.a(baw.a(this, $$3).c(), 4.0F);
      if ($$4) {
         this.a($$3, $$1);
         if ($$1 instanceof bcc) {
            ((bcc)$$1).b(new bbg(bbi.y, 200), (bbn)MoreObjects.firstNonNull($$2, this));
         }
      }

   }

   @Override
   protected void a(dwm $$0) {
      super.a($$0);
      ((agg)this.s).a(io.x, this.df(), this.dh(), this.dl(), 2, 0.2, 0.2, 0.2, 0.0);
      this.a(ajw.su, 1.0F, 1.0F);
   }

   @Override
   protected void a(dwo $$0) {
      super.a($$0);
      this.ah();
   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (!this.s.y) {
         this.a(ajw.sv, 1.0F, 1.0F);
         ((agg)this.s).a(io.g, this.df(), this.dh(), this.dl(), 15, 0.2, 0.2, 0.2, 0.0);
         this.ah();
      }

      return true;
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      double $$1 = $$0.h();
      double $$2 = $$0.i();
      double $$3 = $$0.j();
      this.n($$1, $$2, $$3);
   }
}
