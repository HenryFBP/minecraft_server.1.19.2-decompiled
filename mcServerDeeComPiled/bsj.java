import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsj extends brq {
   private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
   private static final bdb c = new bdb(b, "Baby speed boost", 0.5, bdb.a.b);
   private static final aaj<Boolean> d = aam.a(bsj.class, aal.i);
   private static final aaj<Integer> ca = aam.a(bsj.class, aal.b);
   private static final aaj<Boolean> cb = aam.a(bsj.class, aal.i);
   public static final float e = 0.05F;
   public static final int bX = 50;
   public static final int bY = 40;
   public static final int bZ = 7;
   private static final float cc = 0.1F;
   private static final Predicate<bag> cd = $$0 -> $$0 == bag.d;
   private final bhz ce = new bhz(this, cd);
   private boolean cf;
   private int cg;
   private int ch;

   public bsj(bbr<? extends bsj> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bsj(cgx $$0) {
      this(bbr.bj, $$0);
   }

   @Override
   protected void u() {
      this.bS.a(4, new bsj.a(this, 1.0, 3));
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bjk(this));
      this.n();
   }

   @Override
   protected void n() {
      this.bS.a(2, new bkd(this, 1.0, false));
      this.bS.a(6, new bjb(this, 1.0, true, 4, this::fR));
      this.bS.a(7, new bkb(this, 1.0));
      this.bT.a(1, new bkg(this).a(bsl.class));
      this.bT.a(2, new bkh(this, buc.class, true));
      this.bT.a(3, new bkh(this, btk.class, false));
      this.bT.a(3, new bkh(this, bnq.class, true));
      this.bT.a(5, new bkh(this, bof.class, 10, true, false, bof.bY));
   }

   public static bdc.a fP() {
      return brq.fO().a(bdd.b, 35.0).a(bdd.d, 0.23F).a(bdd.f, 3.0).a(bdd.i, 2.0).a(bdd.l);
   }

   @Override
   protected void a_() {
      super.a_();
      this.ai().a(d, false);
      this.ai().a(ca, 0);
      this.ai().a(cb, false);
   }

   public boolean fQ() {
      return this.ai().a(cb);
   }

   public boolean fR() {
      return this.cf;
   }

   public void w(boolean $$0) {
      if (this.q() && bmk.a(this)) {
         if (this.cf != $$0) {
            this.cf = $$0;
            ((blb)this.D()).b($$0);
            if ($$0) {
               this.bS.a(1, this.ce);
            } else {
               this.bS.a(this.ce);
            }
         }
      } else if (this.cf) {
         this.bS.a(this.ce);
         this.cf = false;
      }

   }

   protected boolean q() {
      return true;
   }

   @Override
   public boolean y_() {
      return this.ai().a(d);
   }

   @Override
   public int dO() {
      if (this.y_()) {
         this.bN = (int)((double)this.bN * 2.5);
      }

      return super.dO();
   }

   @Override
   public void a(boolean $$0) {
      this.ai().b(d, $$0);
      if (this.s != null && !this.s.y) {
         bcz $$1 = this.a(bdd.d);
         $$1.d(c);
         if ($$0) {
            $$1.b(c);
         }
      }

   }

   @Override
   public void a(aaj<?> $$0) {
      if (d.equals($$0)) {
         this.z_();
      }

      super.a($$0);
   }

   protected boolean fK() {
      return true;
   }

   @Override
   public void k() {
      if (!this.s.y && this.bo() && !this.fA()) {
         if (this.fQ()) {
            --this.ch;
            if (this.ch < 0) {
               this.fM();
            }
         } else if (this.fK()) {
            if (this.a(akp.a)) {
               ++this.cg;
               if (this.cg >= 600) {
                  this.a(300);
               }
            } else {
               this.cg = -1;
            }
         }
      }

      super.k();
   }

   @Override
   public void w_() {
      if (this.bo()) {
         boolean $$0 = this.K_() && this.fD();
         if ($$0) {
            cax $$1 = this.c(bbs.f);
            if (!$$1.b()) {
               if ($$1.h()) {
                  $$1.b($$1.j() + this.R.a(2));
                  if ($$1.j() >= $$1.k()) {
                     this.d(bbs.f);
                     this.a(bbs.f, cax.b);
                  }
               }

               $$0 = false;
            }

            if ($$0) {
               this.f(8);
            }
         }
      }

      super.w_();
   }

   private void a(int $$0) {
      this.ch = $$0;
      this.ai().b(cb, true);
   }

   protected void fM() {
      this.b(bbr.u);
      if (!this.aM()) {
         this.s.a(null, 1040, this.da(), 0);
      }

   }

   protected void b(bbr<? extends bsj> $$0) {
      bsj $$1 = this.a($$0, true);
      if ($$1 != null) {
         $$1.y($$1.s.d_($$1.da()).d());
         $$1.w($$1.q() && this.fR());
      }

   }

   protected boolean K_() {
      return true;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else if (!(this.s instanceof agg)) {
         return false;
      } else {
         agg $$2 = (agg)this.s;
         bcc $$3 = this.G();
         if ($$3 == null && $$0.m() instanceof bcc) {
            $$3 = (bcc)$$0.m();
         }

         if ($$3 != null && this.s.ag() == bag.d && (double)this.R.i() < this.b(bdd.l) && this.s.W().b(cgt.e)) {
            int $$4 = ami.b(this.df());
            int $$5 = ami.b(this.dh());
            int $$6 = ami.b(this.dl());
            bsj $$7 = new bsj(this.s);

            for(int $$8 = 0; $$8 < 50; ++$$8) {
               int $$9 = $$4 + ami.a(this.R, 7, 40) * ami.a(this.R, -1, 1);
               int $$10 = $$5 + ami.a(this.R, 7, 40) * ami.a(this.R, -1, 1);
               int $$11 = $$6 + ami.a(this.R, 7, 40) * ami.a(this.R, -1, 1);
               gt $$12 = new gt($$9, $$10, $$11);
               bbr<?> $$13 = $$7.ad();
               bcv.c $$14 = bcv.a($$13);
               if (chi.a($$14, this.s, $$12, $$13) && bcv.a($$13, $$2, bcg.j, $$12, this.s.w)) {
                  $$7.e((double)$$9, (double)$$10, (double)$$11);
                  if (!this.s.a((double)$$9, (double)$$10, (double)$$11, 7.0) && this.s.f($$7) && this.s.g($$7) && !this.s.d($$7.cy())) {
                     $$7.h($$3);
                     $$7.a($$2, this.s.d_($$7.da()), bcg.j, null, null);
                     $$2.a_($$7);
                     this.a(bdd.l).c(new bdb("Zombie reinforcement caller charge", -0.05F, bdb.a.a));
                     $$7.a(bdd.l).c(new bdb("Zombie reinforcement callee charge", -0.05F, bdb.a.a));
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   public boolean z(bbn $$0) {
      boolean $$1 = super.z($$0);
      if ($$1) {
         float $$2 = this.s.d_(this.da()).b();
         if (this.ez().b() && this.bH() && this.R.i() < $$2 * 0.3F) {
            $$0.f(2 * (int)$$2);
         }
      }

      return $$1;
   }

   @Override
   protected ajv r() {
      return ajw.xS;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.yc;
   }

   @Override
   protected ajv x_() {
      return ajw.xX;
   }

   protected ajv t() {
      return ajw.yi;
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(this.t(), 0.15F, 1.0F);
   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      super.a($$0, $$1);
      if ($$0.i() < (this.s.ag() == bag.d ? 0.05F : 0.01F)) {
         int $$2 = $$0.a(3);
         if ($$2 == 0) {
            this.a(bbs.a, new cax(caz.nw));
         } else {
            this.a(bbs.a, new cax(caz.nx));
         }
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("IsBaby", this.y_());
      $$0.a("CanBreakDoors", this.fR());
      $$0.a("InWaterTime", this.aR() ? this.cg : -1);
      $$0.a("DrownedConversionTime", this.fQ() ? this.ch : -1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a($$0.q("IsBaby"));
      this.w($$0.q("CanBreakDoors"));
      this.cg = $$0.h("InWaterTime");
      if ($$0.b("DrownedConversionTime", 99) && $$0.h("DrownedConversionTime") > -1) {
         this.a($$0.h("DrownedConversionTime"));
      }

   }

   @Override
   public boolean a(agg $$0, bcc $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (($$0.ag() == bag.c || $$0.ag() == bag.d) && $$1 instanceof btp) {
         if ($$0.ag() != bag.d && this.R.h()) {
            return $$2;
         }

         btp $$3 = (btp)$$1;
         bsk $$4 = $$3.a(bbr.bl, false);
         $$4.a($$0, $$0.d_($$4.da()), bcg.i, new bsj.b(false, true), null);
         $$4.a($$3.fU());
         $$4.a((qc)$$3.gf().a(pu.a).getValue());
         $$4.c($$3.fM().a());
         $$4.a($$3.fJ());
         if (!this.aM()) {
            $$0.a(null, 1026, this.da(), 0);
         }

         $$2 = false;
      }

      return $$2;
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? 0.93F : 1.74F;
   }

   @Override
   public boolean k(cax $$0) {
      return $$0.a(caz.pa) && this.y_() && this.bI() ? false : super.k($$0);
   }

   @Override
   public boolean l(cax $$0) {
      return $$0.a(caz.pp) ? false : super.l($$0);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      float $$6 = $$1.d();
      this.r($$5.i() < 0.55F * $$6);
      if ($$3 == null) {
         $$3 = new bsj.b(a($$5), true);
      }

      if ($$3 instanceof bsj.b $$7) {
         if ($$7.a) {
            this.a(true);
            if ($$7.b) {
               if ((double)$$5.i() < 0.05) {
                  List<bnj> $$8 = $$0.a(bnj.class, this.cy().c(5.0, 3.0, 5.0), bbq.c);
                  if (!$$8.isEmpty()) {
                     bnj $$9 = (bnj)$$8.get(0);
                     $$9.v(true);
                     this.k($$9);
                  }
               } else if ((double)$$5.i() < 0.05) {
                  bnj $$10 = bbr.n.a(this.s);
                  $$10.b(this.df(), this.dh(), this.dl(), this.dq(), 0.0F);
                  $$10.a($$0, $$1, bcg.g, null, null);
                  $$10.v(true);
                  this.k($$10);
                  $$0.b($$10);
               }
            }
         }

         this.w(this.q() && $$5.i() < $$6 * 0.1F);
         this.a($$5, $$1);
         this.b($$5, $$1);
      }

      if (this.c(bbs.f).b()) {
         LocalDate $$11 = LocalDate.now();
         int $$12 = $$11.get(ChronoField.DAY_OF_MONTH);
         int $$13 = $$11.get(ChronoField.MONTH_OF_YEAR);
         if ($$13 == 10 && $$12 == 31 && $$5.i() < 0.25F) {
            this.a(bbs.f, new cax($$5.i() < 0.1F ? cju.dp : cju.do));
            this.bV[bbs.f.b()] = 0.0F;
         }
      }

      this.y($$6);
      return $$3;
   }

   public static boolean a(amn $$0) {
      return $$0.i() < 0.05F;
   }

   protected void y(float $$0) {
      this.fS();
      this.a(bdd.c).c(new bdb("Random spawn bonus", this.R.j() * 0.05F, bdb.a.a));
      double $$1 = this.R.j() * 1.5 * (double)$$0;
      if ($$1 > 1.0) {
         this.a(bdd.b).c(new bdb("Random zombie-spawn bonus", $$1, bdb.a.c));
      }

      if (this.R.i() < $$0 * 0.05F) {
         this.a(bdd.l).c(new bdb("Leader zombie bonus", this.R.j() * 0.25 + 0.5, bdb.a.a));
         this.a(bdd.a).c(new bdb("Leader zombie bonus", this.R.j() * 3.0 + 1.0, bdb.a.c));
         this.w(this.q());
      }

   }

   protected void fS() {
      this.a(bdd.l).a(this.R.j() * 0.1F);
   }

   @Override
   public double bs() {
      return this.y_() ? 0.0 : -0.45;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bbn $$3 = $$0.m();
      if ($$3 instanceof brc $$4 && $$4.fK()) {
         cax $$5 = this.fJ();
         if (!$$5.b()) {
            $$4.fL();
            this.b($$5);
         }
      }

   }

   protected cax fJ() {
      return new cax(caz.sl);
   }

   class a extends bjq {
      a(bcl $$0, double $$1, int $$2) {
         super(cju.kR, $$0, $$1, $$2);
      }

      @Override
      public void a(cgy $$0, gt $$1) {
         $$0.a(null, $$1, ajw.xY, ajx.f, 0.5F, 0.9F + bsj.this.R.i() * 0.2F);
      }

      @Override
      public void a(cgx $$0, gt $$1) {
         $$0.a(null, $$1, ajw.vj, ajx.e, 0.7F, 0.9F + $$0.w.i() * 0.2F);
      }

      @Override
      public double i() {
         return 1.14;
      }
   }

   public static class b implements bcu {
      public final boolean a;
      public final boolean b;

      public b(boolean $$0, boolean $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
