import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buq extends buu {
   private static final Logger b = LogUtils.getLogger();
   private final amn c = amn.a();
   private boolean d;
   private int e;
   private static final int f = 10;
   private static final aaj<Integer> ao = aam.a(buq.class, aal.b);
   private static final aaj<Boolean> ap = aam.a(buq.class, aal.i);
   private int aq;
   private int ar;
   private int as;
   private int at;
   private float au;
   private boolean av = true;
   @Nullable
   private bbn aw;
   private buq.a ax = buq.a.a;
   private final int ay;
   private final int az;

   private buq(bbr<? extends buq> $$0, cgx $$1, int $$2, int $$3) {
      super($$0, $$1);
      this.ae = true;
      this.ay = Math.max(0, $$2);
      this.az = Math.max(0, $$3);
   }

   public buq(bbr<? extends buq> $$0, cgx $$1) {
      this($$0, $$1, 0, 0);
   }

   public buq(buc $$0, cgx $$1, int $$2, int $$3) {
      this(bbr.bo, $$1, $$2, $$3);
      this.b($$0);
      float $$4 = $$0.ds();
      float $$5 = $$0.dq();
      float $$6 = ami.b(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$7 = ami.a(-$$5 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float $$8 = -ami.b(-$$4 * (float) (Math.PI / 180.0));
      float $$9 = ami.a(-$$4 * (float) (Math.PI / 180.0));
      double $$10 = $$0.df() - (double)$$7 * 0.3;
      double $$11 = $$0.dj();
      double $$12 = $$0.dl() - (double)$$6 * 0.3;
      this.b($$10, $$11, $$12, $$5, $$4);
      dwq $$13 = new dwq((double)(-$$7), (double)ami.a(-($$9 / $$8), -5.0F, 5.0F), (double)(-$$6));
      double $$14 = $$13.f();
      $$13 = $$13.d(0.6 / $$14 + this.R.a(0.5, 0.0103365), 0.6 / $$14 + this.R.a(0.5, 0.0103365), 0.6 / $$14 + this.R.a(0.5, 0.0103365));
      this.f($$13);
      this.o((float)(ami.d($$13.c, $$13.e) * 180.0F / (float)Math.PI));
      this.p((float)(ami.d($$13.d, $$13.h()) * 180.0F / (float)Math.PI));
      this.w = this.dq();
      this.x = this.ds();
   }

   @Override
   protected void a_() {
      this.ai().a(ao, 0);
      this.ai().a(ap, false);
   }

   @Override
   public void a(aaj<?> $$0) {
      if (ao.equals($$0)) {
         int $$1 = this.ai().a(ao);
         this.aw = $$1 > 0 ? this.s.a($$1 - 1) : null;
      }

      if (ap.equals($$0)) {
         this.d = this.ai().a(ap);
         if (this.d) {
            this.n(this.dd().c, (double)(-0.4F * ami.a(this.c, 0.6F, 1.0F)), this.dd().e);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0;
      return $$0 < 4096.0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
   }

   @Override
   public void k() {
      this.c.b(this.co().getLeastSignificantBits() ^ this.s.U());
      super.k();
      buc $$0 = this.i();
      if ($$0 == null) {
         this.ah();
      } else if (this.s.y || !this.a($$0)) {
         if (this.y) {
            ++this.aq;
            if (this.aq >= 1200) {
               this.ah();
               return;
            }
         } else {
            this.aq = 0;
         }

         float $$1 = 0.0F;
         gt $$2 = this.da();
         dpv $$3 = this.s.b_($$2);
         if ($$3.a(akp.a)) {
            $$1 = $$3.a((cgd)this.s, $$2);
         }

         boolean $$4 = $$1 > 0.0F;
         if (this.ax == buq.a.a) {
            if (this.aw != null) {
               this.f(dwq.b);
               this.ax = buq.a.b;
               return;
            }

            if ($$4) {
               this.f(this.dd().d(0.3, 0.2, 0.3));
               this.ax = buq.a.c;
               return;
            }

            this.l();
         } else {
            if (this.ax == buq.a.b) {
               if (this.aw != null) {
                  if (!this.aw.dt() && this.aw.s.ab() == this.s.ab()) {
                     this.e(this.aw.df(), this.aw.e(0.8), this.aw.dl());
                  } else {
                     this.x(null);
                     this.ax = buq.a.a;
                  }
               }

               return;
            }

            if (this.ax == buq.a.c) {
               dwq $$5 = this.dd();
               double $$6 = this.dh() + $$5.d - (double)$$2.v() - (double)$$1;
               if (Math.abs($$6) < 0.01) {
                  $$6 += Math.signum($$6) * 0.1;
               }

               this.n($$5.c * 0.9, $$5.d - $$6 * (double)this.R.i() * 0.2, $$5.e * 0.9);
               if (this.ar <= 0 && this.at <= 0) {
                  this.av = true;
               } else {
                  this.av = this.av && this.e < 10 && this.b($$2);
               }

               if ($$4) {
                  this.e = Math.max(0, this.e - 1);
                  if (this.d) {
                     this.f(this.dd().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                  }

                  if (!this.s.y) {
                     this.a($$2);
                  }
               } else {
                  this.e = Math.min(10, this.e + 1);
               }
            }
         }

         if (!$$3.a(akp.a)) {
            this.f(this.dd().b(0.0, -0.03, 0.0));
         }

         this.a(bci.a, this.dd());
         this.z();
         if (this.ax == buq.a.a && (this.y || this.z)) {
            this.f(dwq.b);
         }

         double $$7 = 0.92;
         this.f(this.dd().a(0.92));
         this.am();
      }
   }

   private boolean a(buc $$0) {
      cax $$1 = $$0.ez();
      cax $$2 = $$0.eA();
      boolean $$3 = $$1.a(caz.pe);
      boolean $$4 = $$2.a(caz.pe);
      if (!$$0.dt() && $$0.bo() && ($$3 || $$4) && !(this.f($$0) > 1024.0)) {
         return false;
      } else {
         this.ah();
         return true;
      }
   }

   private void l() {
      dwo $$0 = buv.a(this, this::a);
      this.a($$0);
   }

   @Override
   protected boolean a(bbn $$0) {
      return super.a($$0) || $$0.bo() && $$0 instanceof bqv;
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      if (!this.s.y) {
         this.x($$0.a());
      }

   }

   @Override
   protected void a(dwm $$0) {
      super.a($$0);
      this.f(this.dd().d().a($$0.a(this)));
   }

   private void x(@Nullable bbn $$0) {
      this.aw = $$0;
      this.ai().b(ao, $$0 == null ? 0 : $$0.ae() + 1);
   }

   private void a(gt $$0) {
      agg $$1 = (agg)this.s;
      int $$2 = 1;
      gt $$3 = $$0.b();
      if (this.R.i() < 0.25F && this.s.t($$3)) {
         ++$$2;
      }

      if (this.R.i() < 0.5F && !this.s.g($$3)) {
         --$$2;
      }

      if (this.ar > 0) {
         --this.ar;
         if (this.ar <= 0) {
            this.as = 0;
            this.at = 0;
            this.ai().b(ap, false);
         }
      } else if (this.at > 0) {
         this.at -= $$2;
         if (this.at > 0) {
            this.au += (float)this.R.a(0.0, 9.188);
            float $$4 = this.au * (float) (Math.PI / 180.0);
            float $$5 = ami.a($$4);
            float $$6 = ami.b($$4);
            double $$7 = this.df() + (double)($$5 * (float)this.at * 0.1F);
            double $$8 = (double)((float)ami.b(this.dh()) + 1.0F);
            double $$9 = this.dl() + (double)($$6 * (float)this.at * 0.1F);
            cvo $$10 = $$1.a_(new gt($$7, $$8 - 1.0, $$9));
            if ($$10.a(cju.C)) {
               if (this.R.i() < 0.15F) {
                  $$1.a(io.e, $$7, $$8 - 0.1F, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
               }

               float $$11 = $$5 * 0.04F;
               float $$12 = $$6 * 0.04F;
               $$1.a(io.B, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
               $$1.a(io.B, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
            }
         } else {
            this.a(ajw.gr, 0.25F, 1.0F + (this.R.i() - this.R.i()) * 0.4F);
            double $$13 = this.dh() + 0.5;
            $$1.a(io.e, this.df(), $$13, this.dl(), (int)(1.0F + this.cW() * 20.0F), (double)this.cW(), 0.0, (double)this.cW(), 0.2F);
            $$1.a(io.B, this.df(), $$13, this.dl(), (int)(1.0F + this.cW() * 20.0F), (double)this.cW(), 0.0, (double)this.cW(), 0.2F);
            this.ar = ami.a(this.R, 20, 40);
            this.ai().b(ap, true);
         }
      } else if (this.as > 0) {
         this.as -= $$2;
         float $$14 = 0.15F;
         if (this.as < 20) {
            $$14 += (float)(20 - this.as) * 0.05F;
         } else if (this.as < 40) {
            $$14 += (float)(40 - this.as) * 0.02F;
         } else if (this.as < 60) {
            $$14 += (float)(60 - this.as) * 0.01F;
         }

         if (this.R.i() < $$14) {
            float $$15 = ami.a(this.R, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float $$16 = ami.a(this.R, 25.0F, 60.0F);
            double $$17 = this.df() + (double)(ami.a($$15) * $$16) * 0.1;
            double $$18 = (double)((float)ami.b(this.dh()) + 1.0F);
            double $$19 = this.dl() + (double)(ami.b($$15) * $$16) * 0.1;
            cvo $$20 = $$1.a_(new gt($$17, $$18 - 1.0, $$19));
            if ($$20.a(cju.C)) {
               $$1.a(io.af, $$17, $$18, $$19, 2 + this.R.a(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.as <= 0) {
            this.au = ami.a(this.R, 0.0F, 360.0F);
            this.at = ami.a(this.R, 20, 80);
         }
      } else {
         this.as = ami.a(this.R, 100, 600);
         this.as -= this.az * 20 * 5;
      }

   }

   private boolean b(gt $$0) {
      buq.b $$1 = buq.b.c;

      for(int $$2 = -1; $$2 <= 2; ++$$2) {
         buq.b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
         switch($$3) {
            case c:
               return false;
            case a:
               if ($$1 == buq.b.c) {
                  return false;
               }
               break;
            case b:
               if ($$1 == buq.b.a) {
                  return false;
               }
         }

         $$1 = $$3;
      }

      return true;
   }

   private buq.b a(gt $$0, gt $$1) {
      return (buq.b)gt.b($$0, $$1).map(this::c).reduce(($$0x, $$1x) -> $$0x == $$1x ? $$0x : buq.b.c).orElse(buq.b.c);
   }

   private buq.b c(gt $$0) {
      cvo $$1 = this.s.a_($$0);
      if (!$$1.h() && !$$1.a(cju.et)) {
         dpv $$2 = $$1.p();
         return $$2.a(akp.a) && $$2.b() && $$1.k(this.s, $$0).b() ? buq.b.b : buq.b.c;
      } else {
         return buq.b.a;
      }
   }

   public boolean h() {
      return this.av;
   }

   @Override
   public void b(pj $$0) {
   }

   @Override
   public void a(pj $$0) {
   }

   public int a(cax $$0) {
      buc $$1 = this.i();
      if (!this.s.y && $$1 != null && !this.a($$1)) {
         int $$2 = 0;
         if (this.aw != null) {
            this.c(this.aw);
            aj.D.a((agh)$$1, $$0, this, Collections.emptyList());
            this.s.a(this, (byte)31);
            $$2 = this.aw instanceof bqv ? 3 : 5;
         } else if (this.ar > 0) {
            dsd.a $$3 = new dsd.a((agg)this.s).a(dul.f, this.cY()).a(dul.i, $$0).a(dul.a, this).a(this.R).a((float)this.ay + $$1.fX());
            dsg $$4 = this.s.n().aH().a(dry.ai);
            List<cax> $$5 = $$4.a($$3.a(duk.e));
            aj.D.a((agh)$$1, $$0, this, $$5);

            for(cax $$6 : $$5) {
               bqv $$7 = new bqv(this.s, this.df(), this.dh(), this.dl(), $$6);
               double $$8 = $$1.df() - this.df();
               double $$9 = $$1.dh() - this.dh();
               double $$10 = $$1.dl() - this.dl();
               double $$11 = 0.1;
               $$7.n($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
               this.s.b($$7);
               $$1.s.b(new bbt($$1.s, $$1.df(), $$1.dh() + 0.5, $$1.dl() + 0.5, this.R.a(6) + 1));
               if ($$6.a(aks.ak)) {
                  $$1.a(akg.R, 1);
               }
            }

            $$2 = 1;
         }

         if (this.y) {
            $$2 = 2;
         }

         this.ah();
         return $$2;
      } else {
         return 0;
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 31 && this.s.y && this.aw instanceof buc && ((buc)this.aw).fx()) {
         this.c(this.aw);
      }

      super.a($$0);
   }

   protected void c(bbn $$0) {
      bbn $$1 = this.x();
      if ($$1 != null) {
         dwq $$2 = new dwq($$1.df() - this.df(), $$1.dh() - this.dh(), $$1.dl() - this.dl()).a(0.1);
         $$0.f($$0.dd().e($$2));
      }
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   public void a(bbn.c $$0) {
      this.a(null);
      super.a($$0);
   }

   @Override
   public void aj() {
      this.a(null);
   }

   @Override
   public void b(@Nullable bbn $$0) {
      super.b($$0);
      this.a(this);
   }

   private void a(@Nullable buq $$0) {
      buc $$1 = this.i();
      if ($$1 != null) {
         $$1.cn = $$0;
      }

   }

   @Nullable
   public buc i() {
      bbn $$0 = this.x();
      return $$0 instanceof buc ? (buc)$$0 : null;
   }

   @Nullable
   public bbn j() {
      return this.aw;
   }

   @Override
   public boolean ck() {
      return false;
   }

   @Override
   public tc<?> S() {
      bbn $$0 = this.x();
      return new tg(this, $$0 == null ? this.ae() : $$0.ae());
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      if (this.i() == null) {
         int $$1 = $$0.n();
         b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.s.a($$1), $$1);
         this.ag();
      }

   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }
}
