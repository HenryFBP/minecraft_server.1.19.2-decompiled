import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqu extends bbn {
   private static final Logger f = LogUtils.getLogger();
   private cvo ao = cju.E.m();
   public int b;
   public boolean c = true;
   private boolean ap;
   private boolean aq;
   private int ar = 40;
   private float as;
   @Nullable
   public pj d;
   protected static final aaj<gt> e = aam.a(bqu.class, aal.l);

   public bqu(bbr<? extends bqu> $$0, cgx $$1) {
      super($$0, $$1);
   }

   private bqu(cgx $$0, double $$1, double $$2, double $$3, cvo $$4) {
      this(bbr.E, $$0);
      this.ao = $$4;
      this.q = true;
      this.e($$1, $$2, $$3);
      this.f(dwq.b);
      this.t = $$1;
      this.u = $$2;
      this.v = $$3;
      this.a(this.da());
   }

   public static bqu a(cgx $$0, gt $$1, cvo $$2) {
      bqu $$3 = new bqu($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b(cwe.C) ? $$2.a(cwe.C, Boolean.valueOf(false)) : $$2);
      $$0.a($$1, $$2.p().g(), 3);
      $$0.b($$3);
      return $$3;
   }

   @Override
   public boolean ch() {
      return false;
   }

   public void a(gt $$0) {
      this.Y.b(e, $$0);
   }

   public gt h() {
      return this.Y.a(e);
   }

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   @Override
   protected void a_() {
      this.Y.a(e, gt.b);
   }

   @Override
   public boolean bk() {
      return !this.dt();
   }

   @Override
   public void k() {
      if (this.ao.h()) {
         this.ah();
      } else {
         cjt $$0 = this.ao.b();
         ++this.b;
         if (!this.aN()) {
            this.f(this.dd().b(0.0, -0.04, 0.0));
         }

         this.a(bci.a, this.dd());
         if (!this.s.y) {
            gt $$1 = this.da();
            boolean $$2 = this.ao.b() instanceof cky;
            boolean $$3 = $$2 && this.s.b_($$1).a(akp.a);
            double $$4 = this.dd().g();
            if ($$2 && $$4 > 1.0) {
               dwm $$5 = this.s.a(new cgg(new dwq(this.t, this.u, this.v), this.cY(), cgg.a.a, cgg.b.b, this));
               if ($$5.c() != dwo.a.a && this.s.b_($$5.a()).a(akp.a)) {
                  $$1 = $$5.a();
                  $$3 = true;
               }
            }

            if (this.y || $$3) {
               cvo $$6 = this.s.a_($$1);
               this.f(this.dd().d(0.7, -0.5, 0.7));
               if (!$$6.a(cju.bD)) {
                  if (!this.ap) {
                     boolean $$7 = $$6.a(new ccy(this.s, $$1, gy.a, cax.b, gy.b));
                     boolean $$8 = cme.h(this.s.a_($$1.c())) && (!$$2 || !$$3);
                     boolean $$9 = this.ao.a((cha)this.s, $$1) && !$$8;
                     if ($$7 && $$9) {
                        if (this.ao.b(cwe.C) && this.s.b_($$1).a() == dpw.c) {
                           this.ao = this.ao.a(cwe.C, Boolean.valueOf(true));
                        }

                        if (this.s.a($$1, this.ao, 3)) {
                           ((agg)this.s).k().a.a(this, new tp($$1, this.s.a_($$1)));
                           this.ah();
                           if ($$0 instanceof cmd) {
                              ((cmd)$$0).a(this.s, $$1, this.ao, $$6, this);
                           }

                           if (this.d != null && this.ao.o()) {
                              cti $$10 = this.s.c_($$1);
                              if ($$10 != null) {
                                 pj $$11 = $$10.o();

                                 for(String $$12 : this.d.d()) {
                                    $$11.a($$12, this.d.c($$12).c());
                                 }

                                 try {
                                    $$10.a($$11);
                                 } catch (Exception var15) {
                                    f.error("Failed to load block entity from falling block", var15);
                                 }

                                 $$10.e();
                              }
                           }
                        } else if (this.c && this.s.W().b(cgt.h)) {
                           this.ah();
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     } else {
                        this.ah();
                        if (this.c && this.s.W().b(cgt.h)) {
                           this.a($$0, $$1);
                           this.a($$0);
                        }
                     }
                  } else {
                     this.ah();
                     this.a($$0, $$1);
                  }
               }
            } else if (!this.s.y && (this.b > 100 && ($$1.v() <= this.s.u_() || $$1.v() > this.s.ah()) || this.b > 600)) {
               if (this.c && this.s.W().b(cgt.h)) {
                  this.a($$0);
               }

               this.ah();
            }
         }

         this.f(this.dd().a(0.98));
      }
   }

   public void a(cjt $$0, gt $$1) {
      if ($$0 instanceof cmd) {
         ((cmd)$$0).a(this.s, $$1, this);
      }

   }

   @Override
   public boolean a(float $$0, float $$1, baw $$2) {
      if (!this.aq) {
         return false;
      } else {
         int $$3 = ami.f($$0 - 1.0F);
         if ($$3 < 0) {
            return false;
         } else {
            Predicate<bbn> $$5;
            baw $$6;
            if (this.ao.b() instanceof cmd $$4) {
               $$5 = $$4.W_();
               $$6 = $$4.b();
            } else {
               $$5 = bbq.f;
               $$6 = baw.r;
            }

            float $$9 = (float)Math.min(ami.d((float)$$3 * this.as), this.ar);
            this.s.a(this, this.cy(), $$5).forEach($$2x -> $$2x.a($$6, $$9));
            boolean $$10 = this.ao.a(akl.I);
            if ($$10 && $$9 > 0.0F && this.R.i() < 0.05F + (float)$$3 * 0.05F) {
               cvo $$11 = ciu.e(this.ao);
               if ($$11 == null) {
                  this.ap = true;
               } else {
                  this.ao = $$11;
               }
            }

            return false;
         }
      }
   }

   @Override
   protected void b(pj $$0) {
      $$0.a("BlockState", (qc)pv.a(this.ao));
      $$0.a("Time", this.b);
      $$0.a("DropItem", this.c);
      $$0.a("HurtEntities", this.aq);
      $$0.a("FallHurtAmount", this.as);
      $$0.a("FallHurtMax", this.ar);
      if (this.d != null) {
         $$0.a("TileEntityData", (qc)this.d);
      }

   }

   @Override
   protected void a(pj $$0) {
      this.ao = pv.c($$0.p("BlockState"));
      this.b = $$0.h("Time");
      if ($$0.b("HurtEntities", 99)) {
         this.aq = $$0.q("HurtEntities");
         this.as = $$0.j("FallHurtAmount");
         this.ar = $$0.h("FallHurtMax");
      } else if (this.ao.a(akl.I)) {
         this.aq = true;
      }

      if ($$0.b("DropItem", 99)) {
         this.c = $$0.q("DropItem");
      }

      if ($$0.b("TileEntityData", 10)) {
         this.d = $$0.p("TileEntityData");
      }

      if (this.ao.h()) {
         this.ao = cju.E.m();
      }

   }

   public void b(float $$0, int $$1) {
      this.aq = true;
      this.as = $$0;
      this.ar = $$1;
   }

   @Override
   public boolean cn() {
      return false;
   }

   @Override
   public void a(r $$0) {
      super.a($$0);
      $$0.a("Immitating BlockState", this.ao.toString());
   }

   public cvo i() {
      return this.ao;
   }

   @Override
   public boolean cF() {
      return true;
   }

   @Override
   public tc<?> S() {
      return new tg(this, cjt.i(this.i()));
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      this.ao = cjt.a($$0.n());
      this.q = true;
      double $$1 = $$0.e();
      double $$2 = $$0.f();
      double $$3 = $$0.g();
      this.e($$1, $$2, $$3);
      this.a(this.da());
   }
}
