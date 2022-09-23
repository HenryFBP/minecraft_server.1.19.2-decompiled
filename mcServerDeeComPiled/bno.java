import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bno extends bne {
   private static final aaj<Integer> cb = aam.a(bno.class, aal.b);
   private static final aaj<Byte> cc = aam.a(bno.class, aal.a);
   private static final int cd = 1;
   public static final int bX = 4;
   public static final int bY = 8;
   public static final int ca = 16;
   private static final int ce = 32;
   private static final int cf = 64;
   private static final int cg = 128;
   private static final aaj<Optional<UUID>> ch = aam.a(bno.class, aal.o);
   private static final aaj<Optional<UUID>> ci = aam.a(bno.class, aal.o);
   static final Predicate<bqv> cj = $$0 -> !$$0.s() && $$0.bo();
   private static final Predicate<bbn> ck = $$0 -> {
      if (!($$0 instanceof bcc)) {
         return false;
      } else {
         bcc $$1 = (bcc)$$0;
         return $$1.dT() != null && $$1.dU() < $$1.S + 600;
      }
   };
   static final Predicate<bbn> cl = $$0 -> $$0 instanceof bnj || $$0 instanceof bny;
   private static final Predicate<bbn> cm = $$0 -> !$$0.bO() && bbq.e.test($$0);
   private static final int cn = 600;
   private bip co;
   private bip cp;
   private bip cq;
   private float cr;
   private float cs;
   float ct;
   float cu;
   private int cv;

   public bno(bbr<? extends bno> $$0, cgx $$1) {
      super($$0, $$1);
      this.bO = new bno.k();
      this.bP = new bno.m();
      this.a(dqh.r, 0.0F);
      this.a(dqh.s, 0.0F);
      this.r(true);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ch, Optional.empty());
      this.Y.a(ci, Optional.empty());
      this.Y.a(cb, 0);
      this.Y.a(cc, (byte)0);
   }

   @Override
   protected void u() {
      this.co = new bkh(this, bne.class, 10, false, false, $$0 -> $$0 instanceof bnj || $$0 instanceof bny);
      this.cp = new bkh(this, bof.class, 10, false, false, bof.bY);
      this.cq = new bkh(this, bnb.class, 20, false, false, $$0 -> $$0 instanceof bnd);
      this.bS.a(0, new bno.g());
      this.bS.a(0, new bie(this, this.s));
      this.bS.a(1, new bno.b());
      this.bS.a(2, new bno.n(2.2));
      this.bS.a(3, new bno.e(1.0));
      this.bS.a(4, new bhw(this, buc.class, 16.0F, 1.6, 1.4, $$0 -> cm.test($$0) && !this.c($$0.co()) && !this.fW()));
      this.bS.a(4, new bhw(this, boh.class, 8.0F, 1.6, 1.4, $$0 -> !((boh)$$0).q() && !this.fW()));
      this.bS.a(4, new bhw(this, bnw.class, 8.0F, 1.6, 1.4, $$0 -> !this.fW()));
      this.bS.a(5, new bno.u());
      this.bS.a(6, new bno.o());
      this.bS.a(6, new bno.s(1.25));
      this.bS.a(7, new bno.l(1.2F, true));
      this.bS.a(7, new bno.t());
      this.bS.a(8, new bno.h(this, 1.25));
      this.bS.a(9, new bno.q(32, 200));
      this.bS.a(10, new bno.f(1.2F, 12, 1));
      this.bS.a(10, new biv(this, 0.4F));
      this.bS.a(11, new bkb(this, 1.0));
      this.bS.a(11, new bno.p());
      this.bS.a(12, new bno.j(this, buc.class, 24.0F));
      this.bS.a(13, new bno.r());
      this.bT.a(3, new bno.a(bcc.class, false, false, $$0 -> ck.test($$0) && !this.c($$0.co())));
   }

   @Override
   public ajv e(cax $$0) {
      return ajw.gD;
   }

   @Override
   public void w_() {
      if (!this.s.y && this.bo() && this.eP()) {
         ++this.cv;
         cax $$0 = this.c(bbs.a);
         if (this.m($$0)) {
            if (this.cv > 600) {
               cax $$1 = $$0.a(this.s, this);
               if (!$$1.b()) {
                  this.a(bbs.a, $$1);
               }

               this.cv = 0;
            } else if (this.cv > 560 && this.R.i() < 0.1F) {
               this.a(this.e($$0), 1.0F, 1.0F);
               this.s.a(this, (byte)45);
            }
         }

         bcc $$2 = this.G();
         if ($$2 == null || !$$2.bo()) {
            this.x(false);
            this.y(false);
         }
      }

      if (this.fj() || this.eE()) {
         this.bn = false;
         this.bo = 0.0F;
         this.bq = 0.0F;
      }

      super.w_();
      if (this.fW() && this.R.i() < 0.05F) {
         this.a(ajw.gz, 1.0F, 1.0F);
      }

   }

   @Override
   protected boolean eE() {
      return this.eg();
   }

   private boolean m(cax $$0) {
      return $$0.c().v() && this.G() == null && this.y && !this.fj();
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      if ($$0.i() < 0.2F) {
         float $$2 = $$0.i();
         cax $$3;
         if ($$2 < 0.05F) {
            $$3 = new cax(caz.mV);
         } else if ($$2 < 0.2F) {
            $$3 = new cax(caz.pa);
         } else if ($$2 < 0.4F) {
            $$3 = $$0.h() ? new cax(caz.sz) : new cax(caz.sA);
         } else if ($$2 < 0.6F) {
            $$3 = new cax(caz.nS);
         } else if ($$2 < 0.8F) {
            $$3 = new cax(caz.oM);
         } else {
            $$3 = new cax(caz.nP);
         }

         this.a(bbs.a, $$3);
      }

   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 45) {
         cax $$1 = this.c(bbs.a);
         if (!$$1.b()) {
            for(int $$2 = 0; $$2 < 8; ++$$2) {
               dwq $$3 = new dwq(((double)this.R.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                  .a(-this.ds() * (float) (Math.PI / 180.0))
                  .b(-this.dq() * (float) (Math.PI / 180.0));
               this.s.a(new ik(io.N, $$1), this.df() + this.by().c / 2.0, this.dh(), this.dl() + this.by().e / 2.0, $$3.c, $$3.d + 0.05, $$3.e);
            }
         }
      } else {
         super.a($$0);
      }

   }

   public static bdc.a q() {
      return bce.w().a(bdd.d, 0.3F).a(bdd.a, 10.0).a(bdd.b, 32.0).a(bdd.f, 2.0);
   }

   public bno b(agg $$0, bbk $$1) {
      bno $$2 = bbr.G.a((cgx)$$0);
      $$2.a(this.R.h() ? this.t() : ((bno)$$1).t());
      return $$2;
   }

   public static boolean c(bbr<bno> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bK) && a($$1, $$3);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      hc<cht> $$5 = $$0.w(this.da());
      bno.v $$6 = bno.v.a($$5);
      boolean $$7 = false;
      if ($$3 instanceof bno.i $$8) {
         $$6 = $$8.a;
         if ($$8.a() >= 2) {
            $$7 = true;
         }
      } else {
         $$3 = new bno.i($$6);
      }

      this.a($$6);
      if ($$7) {
         this.b_(-24000);
      }

      if ($$0 instanceof agg) {
         this.fU();
      }

      this.a($$0.r_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void fU() {
      if (this.t() == bno.v.a) {
         this.bT.a(4, this.co);
         this.bT.a(4, this.cp);
         this.bT.a(6, this.cq);
      } else {
         this.bT.a(4, this.cq);
         this.bT.a(6, this.co);
         this.bT.a(6, this.cp);
      }

   }

   @Override
   protected void a(buc $$0, bai $$1, cax $$2) {
      if (this.n($$2)) {
         this.a(this.e($$2), 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return this.y_() ? $$1.b * 0.85F : 0.4F;
   }

   public bno.v t() {
      return bno.v.a(this.Y.a(cb));
   }

   private void a(bno.v $$0) {
      this.Y.b(cb, $$0.b());
   }

   List<UUID> fV() {
      List<UUID> $$0 = Lists.newArrayList();
      $$0.add((UUID)((Optional)this.Y.a(ch)).orElse(null));
      $$0.add((UUID)((Optional)this.Y.a(ci)).orElse(null));
      return $$0;
   }

   void b(@Nullable UUID $$0) {
      if (((Optional)this.Y.a(ch)).isPresent()) {
         this.Y.b(ci, Optional.ofNullable($$0));
      } else {
         this.Y.b(ch, Optional.ofNullable($$0));
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      List<UUID> $$1 = this.fV();
      pp $$2 = new pp();

      for(UUID $$3 : $$1) {
         if ($$3 != null) {
            $$2.add(pv.a($$3));
         }
      }

      $$0.a("Trusted", (qc)$$2);
      $$0.a("Sleeping", this.fj());
      $$0.a("Type", this.t().a());
      $$0.a("Sitting", this.fJ());
      $$0.a("Crouching", this.bQ());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      pp $$1 = $$0.c("Trusted", 11);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         this.b(pv.a($$1.k($$2)));
      }

      this.B($$0.q("Sleeping"));
      this.a(bno.v.a($$0.l("Type")));
      this.v($$0.q("Sitting"));
      this.x($$0.q("Crouching"));
      if (this.s instanceof agg) {
         this.fU();
      }

   }

   public boolean fJ() {
      return this.t(1);
   }

   public void v(boolean $$0) {
      this.d(1, $$0);
   }

   public boolean fK() {
      return this.t(64);
   }

   void z(boolean $$0) {
      this.d(64, $$0);
   }

   boolean fW() {
      return this.t(128);
   }

   void A(boolean $$0) {
      this.d(128, $$0);
   }

   @Override
   public boolean fj() {
      return this.t(32);
   }

   void B(boolean $$0) {
      this.d(32, $$0);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.Y.b(cc, (byte)(this.Y.a(cc) | $$0));
      } else {
         this.Y.b(cc, (byte)(this.Y.a(cc) & ~$$0));
      }

   }

   private boolean t(int $$0) {
      return (this.Y.a(cc) & $$0) != 0;
   }

   @Override
   public boolean g(cax $$0) {
      bbs $$1 = bce.i($$0);
      if (!this.c($$1).b()) {
         return false;
      } else {
         return $$1 == bbs.a && super.g($$0);
      }
   }

   @Override
   public boolean k(cax $$0) {
      cat $$1 = $$0.c();
      cax $$2 = this.c(bbs.a);
      return $$2.b() || this.cv > 0 && $$1.v() && !$$2.c().v();
   }

   private void o(cax $$0) {
      if (!$$0.b() && !this.s.y) {
         bqv $$1 = new bqv(this.s, this.df() + this.by().c, this.dh() + 1.0, this.dl() + this.by().e, $$0);
         $$1.a(40);
         $$1.c(this.co());
         this.a(ajw.gI, 1.0F, 1.0F);
         this.s.b($$1);
      }
   }

   private void p(cax $$0) {
      bqv $$1 = new bqv(this.s, this.df(), this.dh(), this.dl(), $$0);
      this.s.b($$1);
   }

   @Override
   protected void b(bqv $$0) {
      cax $$1 = $$0.i();
      if (this.k($$1)) {
         int $$2 = $$1.K();
         if ($$2 > 1) {
            this.p($$1.a($$2 - 1));
         }

         this.o(this.c(bbs.a));
         this.a($$0);
         this.a(bbs.a, $$1.a(1));
         this.e(bbs.a);
         this.a($$0, $$1.K());
         $$0.ah();
         this.cv = 0;
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.eP()) {
         boolean $$0 = this.aR();
         if ($$0 || this.G() != null || this.s.X()) {
            this.fX();
         }

         if ($$0 || this.fj()) {
            this.v(false);
         }

         if (this.fK() && this.s.w.i() < 0.2F) {
            gt $$1 = this.da();
            cvo $$2 = this.s.a_($$1);
            this.s.c(2001, $$1, cjt.i($$2));
         }
      }

      this.cs = this.cr;
      if (this.fT()) {
         this.cr += (1.0F - this.cr) * 0.4F;
      } else {
         this.cr += (0.0F - this.cr) * 0.4F;
      }

      this.cu = this.ct;
      if (this.bQ()) {
         this.ct += 0.2F;
         if (this.ct > 3.0F) {
            this.ct = 3.0F;
         }
      } else {
         this.ct = 0.0F;
      }

   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(aks.T);
   }

   @Override
   protected void a(buc $$0, bce $$1) {
      ((bno)$$1).b($$0.co());
   }

   public boolean fL() {
      return this.t(16);
   }

   public void w(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean fR() {
      return this.bn;
   }

   public boolean fS() {
      return this.ct == 3.0F;
   }

   public void x(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   public boolean bQ() {
      return this.t(4);
   }

   public void y(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean fT() {
      return this.t(8);
   }

   public float y(float $$0) {
      return ami.i($$0, this.cs, this.cr) * 0.11F * (float) Math.PI;
   }

   public float z(float $$0) {
      return ami.i($$0, this.cu, this.ct);
   }

   @Override
   public void h(@Nullable bcc $$0) {
      if (this.fW() && $$0 == null) {
         this.A(false);
      }

      super.h($$0);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return ami.f(($$0 - 5.0F) * $$1);
   }

   void fX() {
      this.B(false);
   }

   void fY() {
      this.y(false);
      this.x(false);
      this.v(false);
      this.B(false);
      this.A(false);
      this.z(false);
   }

   boolean fZ() {
      return !this.fj() && !this.fJ() && !this.fK();
   }

   @Override
   public void K() {
      ajv $$0 = this.r();
      if ($$0 == ajw.gF) {
         this.a($$0, 2.0F, this.eD());
      } else {
         super.K();
      }

   }

   @Nullable
   @Override
   protected ajv r() {
      if (this.fj()) {
         return ajw.gG;
      } else {
         if (!this.s.M() && this.R.i() < 0.1F) {
            List<buc> $$0 = this.s.a(buc.class, this.cy().c(16.0, 16.0, 16.0), bbq.f);
            if ($$0.isEmpty()) {
               return ajw.gF;
            }
         }

         return ajw.gA;
      }
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.gE;
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.gC;
   }

   boolean c(UUID $$0) {
      return this.fV().contains($$0);
   }

   @Override
   protected void f(baw $$0) {
      cax $$1 = this.c(bbs.a);
      if (!$$1.b()) {
         this.b($$1);
         this.a(bbs.a, cax.b);
      }

      super.f($$0);
   }

   public static boolean a(bno $$0, bcc $$1) {
      double $$2 = $$1.dl() - $$0.dl();
      double $$3 = $$1.df() - $$0.df();
      double $$4 = $$2 / $$3;
      int $$5 = 6;

      for(int $$6 = 0; $$6 < 6; ++$$6) {
         double $$7 = $$4 == 0.0 ? 0.0 : $$2 * (double)((float)$$6 / 6.0F);
         double $$8 = $$4 == 0.0 ? $$3 * (double)((float)$$6 / 6.0F) : $$7 / $$4;

         for(int $$9 = 1; $$9 < 4; ++$$9) {
            if (!$$0.s.a_(new gt($$0.df() + $$8, $$0.dh() + (double)$$9, $$0.dl() + $$7)).d().e()) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.55F * this.cA()), (double)(this.cW() * 0.4F));
   }

   class a extends bkh<bcc> {
      @Nullable
      private bcc j;
      @Nullable
      private bcc k;
      private int l;

      public a(Class<bcc> $$0, boolean $$1, boolean $$2, @Nullable Predicate<bcc> $$3) {
         super(bno.this, $$0, 10, $$1, $$2, $$3);
      }

      @Override
      public boolean a() {
         if (this.b > 0 && this.e.dQ().a(this.b) != 0) {
            return false;
         } else {
            for(UUID $$0 : bno.this.fV()) {
               if ($$0 != null && bno.this.s instanceof agg) {
                  bbn $$1 = ((agg)bno.this.s).a($$0);
                  if ($$1 instanceof bcc $$2) {
                     this.k = $$2;
                     this.j = $$2.dR();
                     int $$3 = $$2.dS();
                     return $$3 != this.l && this.a(this.j, this.d);
                  }
               }
            }

            return false;
         }
      }

      @Override
      public void c() {
         this.a(this.j);
         this.c = this.j;
         if (this.k != null) {
            this.l = this.k.dS();
         }

         bno.this.a(ajw.gz, 1.0F, 1.0F);
         bno.this.A(true);
         bno.this.fX();
         super.c();
      }
   }

   class b extends bip {
      int a;

      public b() {
         this.a(EnumSet.of(bip.a.b, bip.a.c, bip.a.a));
      }

      @Override
      public boolean a() {
         return bno.this.fK();
      }

      @Override
      public boolean b() {
         return this.a() && this.a > 0;
      }

      @Override
      public void c() {
         this.a = this.a(40);
      }

      @Override
      public void d() {
         bno.this.z(false);
      }

      @Override
      public void e() {
         --this.a;
      }
   }

   public class c implements Predicate<bcc> {
      public boolean a(bcc $$0) {
         if ($$0 instanceof bno) {
            return false;
         } else if ($$0 instanceof bnj || $$0 instanceof bny || $$0 instanceof brq) {
            return true;
         } else if ($$0 instanceof bcw) {
            return !((bcw)$$0).q();
         } else if (!($$0 instanceof buc) || !$$0.B_() && !((buc)$$0).f()) {
            if (bno.this.c($$0.co())) {
               return false;
            } else {
               return !$$0.fj() && !$$0.bO();
            }
         } else {
            return false;
         }
      }
   }

   abstract class d extends bip {
      private final bmf b = bmf.a().a(12.0).d().a(bno.this.new c());

      protected boolean h() {
         gt $$0 = new gt(bno.this.df(), bno.this.cy().e, bno.this.dl());
         return !bno.this.s.g($$0) && bno.this.f($$0) >= 0.0F;
      }

      protected boolean i() {
         return !bno.this.s.a(bcc.class, this.b, bno.this, bno.this.cy().c(12.0, 6.0, 12.0)).isEmpty();
      }
   }

   class e extends bib {
      public e(double $$0) {
         super(bno.this, $$0);
      }

      @Override
      public void c() {
         ((bno)this.a).fY();
         ((bno)this.c).fY();
         super.c();
      }

      @Override
      protected void g() {
         agg $$0 = (agg)this.b;
         bno $$1 = (bno)this.a.a($$0, (bbk)this.c);
         if ($$1 != null) {
            agh $$2 = this.a.fO();
            agh $$3 = this.c.fO();
            agh $$4 = $$2;
            if ($$2 != null) {
               $$1.b($$2.co());
            } else {
               $$4 = $$3;
            }

            if ($$3 != null && $$2 != $$3) {
               $$1.b($$3.co());
            }

            if ($$4 != null) {
               $$4.a(akg.P);
               aj.o.a($$4, this.a, this.c, $$1);
            }

            this.a.b_(6000);
            this.c.b_(6000);
            this.a.fQ();
            this.c.fQ();
            $$1.b_(-24000);
            $$1.b(this.a.df(), this.a.dh(), this.a.dl(), 0.0F, 0.0F);
            $$0.a_($$1);
            this.b.a(this.a, (byte)18);
            if (this.b.W().b(cgt.f)) {
               this.b.b(new bbt(this.b, this.a.df(), this.a.dh(), this.a.dl(), this.a.dQ().a(7) + 1));
            }

         }
      }
   }

   public class f extends bjc {
      private static final int i = 40;
      protected int g;

      public f(double $$1, int $$2, int $$3) {
         super(bno.this, $$1, $$2, $$3);
      }

      @Override
      public double i() {
         return 2.0;
      }

      @Override
      public boolean l() {
         return this.d % 100 == 0;
      }

      @Override
      protected boolean a(cha $$0, gt $$1) {
         cvo $$2 = $$0.a_($$1);
         return $$2.a(cju.mT) && $$2.c(crn.b) >= 2 || ckm.a($$2);
      }

      @Override
      public void e() {
         if (this.m()) {
            if (this.g >= 40) {
               this.o();
            } else {
               ++this.g;
            }
         } else if (!this.m() && bno.this.R.i() < 0.05F) {
            bno.this.a(ajw.gH, 1.0F, 1.0F);
         }

         super.e();
      }

      protected void o() {
         if (bno.this.s.W().b(cgt.c)) {
            cvo $$0 = bno.this.s.a_(this.e);
            if ($$0.a(cju.mT)) {
               this.b($$0);
            } else if (ckm.a($$0)) {
               this.a($$0);
            }

         }
      }

      private void a(cvo $$0) {
         ckm.a_($$0, bno.this.s, this.e);
      }

      private void b(cvo $$0) {
         int $$1 = $$0.c(crn.b);
         $$0.a(crn.b, Integer.valueOf(1));
         int $$2 = 1 + bno.this.s.w.a(2) + ($$1 == 3 ? 1 : 0);
         cax $$3 = bno.this.c(bbs.a);
         if ($$3.b()) {
            bno.this.a(bbs.a, new cax(caz.ui));
            --$$2;
         }

         if ($$2 > 0) {
            cjt.a(bno.this.s, this.e, new cax(caz.ui, $$2));
         }

         bno.this.a(ajw.uD, 1.0F, 1.0F);
         bno.this.s.a(this.e, $$0.a(crn.b, Integer.valueOf(1)), 2);
      }

      @Override
      public boolean a() {
         return !bno.this.fj() && super.a();
      }

      @Override
      public void c() {
         this.g = 0;
         bno.this.v(false);
         super.c();
      }
   }

   class g extends bij {
      public g() {
         super(bno.this);
      }

      @Override
      public void c() {
         super.c();
         bno.this.fY();
      }

      @Override
      public boolean a() {
         return bno.this.aR() && bno.this.b(akp.a) > 0.25 || bno.this.bf();
      }
   }

   class h extends bio {
      private final bno e;

      public h(bno $$0, double $$1) {
         super($$0, $$1);
         this.e = $$0;
      }

      @Override
      public boolean a() {
         return !this.e.fW() && super.a();
      }

      @Override
      public boolean b() {
         return !this.e.fW() && super.b();
      }

      @Override
      public void c() {
         this.e.fY();
         super.c();
      }
   }

   public static class i extends bbk.a {
      public final bno.v a;

      public i(bno.v $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class j extends bix {
      public j(bce $$0, Class<? extends bcc> $$1, float $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && !bno.this.fK() && !bno.this.fT();
      }

      @Override
      public boolean b() {
         return super.b() && !bno.this.fK() && !bno.this.fT();
      }
   }

   public class k extends bhr {
      public k() {
         super(bno.this);
      }

      @Override
      public void a() {
         if (!bno.this.fj()) {
            super.a();
         }

      }

      @Override
      protected boolean c() {
         return !bno.this.fL() && !bno.this.bQ() && !bno.this.fT() && !bno.this.fK();
      }
   }

   class l extends biz {
      public l(double $$0, boolean $$1) {
         super(bno.this, $$0, $$1);
      }

      @Override
      protected void a(bcc $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.z($$0);
            bno.this.a(ajw.gB, 1.0F, 1.0F);
         }

      }

      @Override
      public void c() {
         bno.this.y(false);
         super.c();
      }

      @Override
      public boolean a() {
         return !bno.this.fJ() && !bno.this.fj() && !bno.this.bQ() && !bno.this.fK() && super.a();
      }
   }

   class m extends bhs {
      public m() {
         super(bno.this);
      }

      @Override
      public void a() {
         if (bno.this.fZ()) {
            super.a();
         }

      }
   }

   class n extends bji {
      public n(double $$0) {
         super(bno.this, $$0);
      }

      @Override
      public boolean h() {
         return !bno.this.fW() && super.h();
      }
   }

   public class o extends bit {
      @Override
      public boolean a() {
         if (!bno.this.fS()) {
            return false;
         } else {
            bcc $$0 = bno.this.G();
            if ($$0 != null && $$0.bo()) {
               if ($$0.cw() != $$0.cv()) {
                  return false;
               } else {
                  boolean $$1 = bno.a(bno.this, $$0);
                  if (!$$1) {
                     bno.this.D().a($$0, 0);
                     bno.this.x(false);
                     bno.this.y(false);
                  }

                  return $$1;
               }
            } else {
               return false;
            }
         }
      }

      @Override
      public boolean b() {
         bcc $$0 = bno.this.G();
         if ($$0 != null && $$0.bo()) {
            double $$1 = bno.this.dd().d;
            return (!($$1 * $$1 < 0.05F) || !(Math.abs(bno.this.ds()) < 15.0F) || !bno.this.y) && !bno.this.fK();
         } else {
            return false;
         }
      }

      @Override
      public boolean D_() {
         return false;
      }

      @Override
      public void c() {
         bno.this.q(true);
         bno.this.w(true);
         bno.this.y(false);
         bcc $$0 = bno.this.G();
         if ($$0 != null) {
            bno.this.z().a($$0, 60.0F, 30.0F);
            dwq $$1 = new dwq($$0.df() - bno.this.df(), $$0.dh() - bno.this.dh(), $$0.dl() - bno.this.dl()).d();
            bno.this.f(bno.this.dd().b($$1.c * 0.8, 0.9, $$1.e * 0.8));
         }

         bno.this.D().n();
      }

      @Override
      public void d() {
         bno.this.x(false);
         bno.this.ct = 0.0F;
         bno.this.cu = 0.0F;
         bno.this.y(false);
         bno.this.w(false);
      }

      @Override
      public void e() {
         bcc $$0 = bno.this.G();
         if ($$0 != null) {
            bno.this.z().a($$0, 60.0F, 30.0F);
         }

         if (!bno.this.fK()) {
            dwq $$1 = bno.this.dd();
            if ($$1.d * $$1.d < 0.03F && bno.this.ds() != 0.0F) {
               bno.this.p(ami.l(bno.this.ds(), 0.0F, 0.2F));
            } else {
               double $$2 = $$1.h();
               double $$3 = Math.signum(-$$1.d) * Math.acos($$2 / $$1.f()) * 180.0F / (float)Math.PI;
               bno.this.p((float)$$3);
            }
         }

         if ($$0 != null && bno.this.e($$0) <= 2.0F) {
            bno.this.z($$0);
         } else if (bno.this.ds() > 0.0F && bno.this.y && (float)bno.this.dd().d != 0.0F && bno.this.s.a_(bno.this.da()).a(cju.cW)) {
            bno.this.p(60.0F);
            bno.this.h(null);
            bno.this.z(true);
         }

      }
   }

   class p extends bip {
      public p() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         if (!bno.this.c(bbs.a).b()) {
            return false;
         } else if (bno.this.G() != null || bno.this.dR() != null) {
            return false;
         } else if (!bno.this.fZ()) {
            return false;
         } else if (bno.this.dQ().a(b(10)) != 0) {
            return false;
         } else {
            List<bqv> $$0 = bno.this.s.a(bqv.class, bno.this.cy().c(8.0, 8.0, 8.0), bno.cj);
            return !$$0.isEmpty() && bno.this.c(bbs.a).b();
         }
      }

      @Override
      public void e() {
         List<bqv> $$0 = bno.this.s.a(bqv.class, bno.this.cy().c(8.0, 8.0, 8.0), bno.cj);
         cax $$1 = bno.this.c(bbs.a);
         if ($$1.b() && !$$0.isEmpty()) {
            bno.this.D().a((bbn)$$0.get(0), 1.2F);
         }

      }

      @Override
      public void c() {
         List<bqv> $$0 = bno.this.s.a(bqv.class, bno.this.cy().c(8.0, 8.0, 8.0), bno.cj);
         if (!$$0.isEmpty()) {
            bno.this.D().a((bbn)$$0.get(0), 1.2F);
         }

      }
   }

   class q extends bju {
      public q(int $$0, int $$1) {
         super(bno.this, $$1);
      }

      @Override
      public void c() {
         bno.this.fY();
         super.c();
      }

      @Override
      public boolean a() {
         return super.a() && this.h();
      }

      @Override
      public boolean b() {
         return super.b() && this.h();
      }

      private boolean h() {
         return !bno.this.fj() && !bno.this.fJ() && !bno.this.fW() && bno.this.G() == null;
      }
   }

   class r extends bno.d {
      private double c;
      private double d;
      private int e;
      private int f;

      public r() {
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         return bno.this.dR() == null
            && bno.this.dQ().i() < 0.02F
            && !bno.this.fj()
            && bno.this.G() == null
            && bno.this.D().l()
            && !this.i()
            && !bno.this.fL()
            && !bno.this.bQ();
      }

      @Override
      public boolean b() {
         return this.f > 0;
      }

      @Override
      public void c() {
         this.k();
         this.f = 2 + bno.this.dQ().a(3);
         bno.this.v(true);
         bno.this.D().n();
      }

      @Override
      public void d() {
         bno.this.v(false);
      }

      @Override
      public void e() {
         --this.e;
         if (this.e <= 0) {
            --this.f;
            this.k();
         }

         bno.this.z().a(bno.this.df() + this.c, bno.this.dj(), bno.this.dl() + this.d, (float)bno.this.V(), (float)bno.this.U());
      }

      private void k() {
         double $$0 = Math.PI * 2 * bno.this.dQ().j();
         this.c = Math.cos($$0);
         this.d = Math.sin($$0);
         this.e = this.a(80 + bno.this.dQ().a(20));
      }
   }

   class s extends bii {
      private int c = b(100);

      public s(double $$0) {
         super(bno.this, $$0);
      }

      @Override
      public boolean a() {
         if (!bno.this.fj() && this.a.G() == null) {
            if (bno.this.s.X() && bno.this.s.g(this.a.da())) {
               return this.h();
            } else if (this.c > 0) {
               --this.c;
               return false;
            } else {
               this.c = 100;
               gt $$0 = this.a.da();
               return bno.this.s.M() && bno.this.s.g($$0) && !((agg)bno.this.s).b($$0) && this.h();
            }
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         bno.this.fY();
         super.c();
      }
   }

   class t extends bno.d {
      private static final int c = b(140);
      private int d = bno.this.R.a(c);

      public t() {
         this.a(EnumSet.of(bip.a.a, bip.a.b, bip.a.c));
      }

      @Override
      public boolean a() {
         if (bno.this.bo == 0.0F && bno.this.bp == 0.0F && bno.this.bq == 0.0F) {
            return this.k() || bno.this.fj();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return this.k();
      }

      private boolean k() {
         if (this.d > 0) {
            --this.d;
            return false;
         } else {
            return bno.this.s.M() && this.h() && !this.i() && !bno.this.al;
         }
      }

      @Override
      public void d() {
         this.d = bno.this.R.a(c);
         bno.this.fY();
      }

      @Override
      public void c() {
         bno.this.v(false);
         bno.this.x(false);
         bno.this.y(false);
         bno.this.q(false);
         bno.this.B(true);
         bno.this.D().n();
         bno.this.A().a(bno.this.df(), bno.this.dh(), bno.this.dl(), 0.0);
      }
   }

   class u extends bip {
      public u() {
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         if (bno.this.fj()) {
            return false;
         } else {
            bcc $$0 = bno.this.G();
            return $$0 != null && $$0.bo() && bno.cl.test($$0) && bno.this.f($$0) > 36.0 && !bno.this.bQ() && !bno.this.fT() && !bno.this.bn;
         }
      }

      @Override
      public void c() {
         bno.this.v(false);
         bno.this.z(false);
      }

      @Override
      public void d() {
         bcc $$0 = bno.this.G();
         if ($$0 != null && bno.a(bno.this, $$0)) {
            bno.this.y(true);
            bno.this.x(true);
            bno.this.D().n();
            bno.this.z().a($$0, (float)bno.this.V(), (float)bno.this.U());
         } else {
            bno.this.y(false);
            bno.this.x(false);
         }

      }

      @Override
      public void e() {
         bcc $$0 = bno.this.G();
         if ($$0 != null) {
            bno.this.z().a($$0, (float)bno.this.V(), (float)bno.this.U());
            if (bno.this.f($$0) <= 36.0) {
               bno.this.y(true);
               bno.this.x(true);
               bno.this.D().n();
            } else {
               bno.this.D().a($$0, 1.5);
            }

         }
      }
   }

   public static enum v {
      a(0, "red"),
      b(1, "snow");

      private static final bno.v[] c = (bno.v[])Arrays.stream(values()).sorted(Comparator.comparingInt(bno.v::b)).toArray($$0 -> new bno.v[$$0]);
      private static final Map<String, bno.v> d = (Map<String, bno.v>)Arrays.stream(values()).collect(Collectors.toMap(bno.v::a, $$0 -> $$0));
      private final int e;
      private final String f;

      private v(int $$0, String $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public String a() {
         return this.f;
      }

      public int b() {
         return this.e;
      }

      public static bno.v a(String $$0) {
         return (bno.v)d.getOrDefault($$0, a);
      }

      public static bno.v a(int $$0) {
         if ($$0 < 0 || $$0 > c.length) {
            $$0 = 0;
         }

         return c[$$0];
      }

      public static bno.v a(hc<cht> $$0) {
         return $$0.a().c() == cht.c.c ? b : a;
      }
   }
}
