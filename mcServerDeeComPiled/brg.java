import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brg extends brq implements bcj {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bdb d = new bdb(c, "Attacking speed boost", 0.15F, bdb.a.a);
   private static final int e = 400;
   private static final int bX = 600;
   private static final aaj<Optional<cvo>> bY = aam.a(brg.class, aal.h);
   private static final aaj<Boolean> bZ = aam.a(brg.class, aal.i);
   private static final aaj<Boolean> ca = aam.a(brg.class, aal.i);
   private int cb = Integer.MIN_VALUE;
   private int cc;
   private static final azu cd = anc.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public brg(bbr<? extends brg> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 1.0F;
      this.a(dqh.j, -1.0F);
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(1, new brg.a(this));
      this.bS.a(2, new biz(this, 1.0, false));
      this.bS.a(7, new bkb(this, 1.0, 0.0F));
      this.bS.a(8, new bix(this, buc.class, 8.0F));
      this.bS.a(8, new bjk(this));
      this.bS.a(10, new brg.b(this));
      this.bS.a(11, new brg.d(this));
      this.bT.a(1, new brg.c(this, this::a_));
      this.bT.a(2, new bkg(this));
      this.bT.a(3, new bkh(this, brh.class, true, false));
      this.bT.a(4, new bkn<>(this, false));
   }

   public static bdc.a n() {
      return brq.fO().a(bdd.a, 40.0).a(bdd.d, 0.3F).a(bdd.f, 7.0).a(bdd.b, 64.0);
   }

   @Override
   public void h(@Nullable bcc $$0) {
      super.h($$0);
      bcz $$1 = this.a(bdd.d);
      if ($$0 == null) {
         this.cc = 0;
         this.Y.b(bZ, false);
         this.Y.b(ca, false);
         $$1.d(d);
      } else {
         this.cc = this.S;
         this.Y.b(bZ, true);
         if (!$$1.a(d)) {
            $$1.b(d);
         }
      }

   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bY, Optional.empty());
      this.Y.a(bZ, false);
      this.Y.a(ca, false);
   }

   @Override
   public void c() {
      this.a(cd.a(this.R));
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   public void q() {
      if (this.S >= this.cb + 400) {
         this.cb = this.S;
         if (!this.aM()) {
            this.s.a(this.df(), this.dj(), this.dl(), ajw.fH, this.cR(), 2.5F, 1.0F, false);
         }
      }

   }

   @Override
   public void a(aaj<?> $$0) {
      if (bZ.equals($$0) && this.fL() && this.s.y) {
         this.q();
      }

      super.a($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      cvo $$1 = this.fJ();
      if ($$1 != null) {
         $$0.a("carriedBlockState", (qc)pv.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      cvo $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = pv.c($$0.p("carriedBlockState"));
         if ($$1.h()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.s, $$0);
   }

   boolean f(buc $$0) {
      cax $$1 = $$0.fA().i.get(3);
      if ($$1.a(cju.do.l())) {
         return false;
      } else {
         dwq $$2 = $$0.e(1.0F).d();
         dwq $$3 = new dwq(this.df() - $$0.df(), this.dj() - $$0.dj(), this.dl() - $$0.dl());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.B(this) : false;
      }
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return 2.55F;
   }

   @Override
   public void w_() {
      if (this.s.y) {
         for(int $$0 = 0; $$0 < 2; ++$$0) {
            this.s.a(io.W, this.d(0.5), this.di() - 0.25, this.g(0.5), (this.R.j() - 0.5) * 2.0, -this.R.j(), (this.R.j() - 0.5) * 2.0);
         }
      }

      this.bn = false;
      if (!this.s.y) {
         this.a((agg)this.s, true);
      }

      super.w_();
   }

   @Override
   public boolean eL() {
      return true;
   }

   @Override
   protected void T() {
      if (this.s.M() && this.S >= this.cc + 600) {
         float $$0 = this.bg();
         if ($$0 > 0.5F && this.s.g(this.da()) && this.R.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.T();
   }

   protected boolean t() {
      if (!this.s.k_() && this.bo()) {
         double $$0 = this.df() + (this.R.j() - 0.5) * 64.0;
         double $$1 = this.dh() + (double)(this.R.a(64) - 32);
         double $$2 = this.dl() + (this.R.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bbn $$0) {
      dwq $$1 = new dwq(this.df() - $$0.df(), this.e(0.5) - $$0.dj(), this.dl() - $$0.dl());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.df() + (this.R.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dh() + (double)(this.R.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dl() + (this.R.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      gt.a $$3 = new gt.a($$0, $$1, $$2);

      while($$3.v() > this.s.u_() && !this.s.a_($$3).d().c()) {
         $$3.c(gy.a);
      }

      cvo $$4 = this.s.a_($$3);
      boolean $$5 = $$4.d().c();
      boolean $$6 = $$4.p().a(akp.a);
      if ($$5 && !$$6) {
         dwq $$7 = this.cY();
         boolean $$8 = this.a($$0, $$1, $$2, true);
         if ($$8) {
            this.s.a(czv.T, $$7, czv.a.a(this));
            if (!this.aM()) {
               this.s.a(null, this.t, this.u, this.v, ajw.fI, this.cR(), 1.0F, 1.0F);
               this.a(ajw.fI, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ajv r() {
      return this.fK() ? ajw.fG : ajw.fD;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.fF;
   }

   @Override
   protected ajv x_() {
      return ajw.fE;
   }

   @Override
   protected void a(baw $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      cvo $$3 = this.fJ();
      if ($$3 != null) {
         this.a($$3.b());
      }

   }

   public void c(@Nullable cvo $$0) {
      this.Y.b(bY, Optional.ofNullable($$0));
   }

   @Nullable
   public cvo fJ() {
      return (cvo)((Optional)this.Y.a(bY)).orElse(null);
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0 instanceof bay) {
         bbn $$2 = $$0.l();
         boolean $$3;
         if ($$2 instanceof bvf) {
            $$3 = this.a($$0, (bvf)$$2, $$1);
         } else {
            $$3 = false;
         }

         for(int $$5 = 0; $$5 < 64; ++$$5) {
            if (this.t()) {
               return true;
            }
         }

         return $$3;
      } else {
         boolean $$6 = super.a($$0, $$1);
         if (!this.s.k_() && !($$0.m() instanceof bcc) && this.R.a(10) != 0) {
            this.t();
         }

         return $$6;
      }
   }

   private boolean a(baw $$0, bvf $$1, float $$2) {
      cax $$3 = $$1.h();
      ccs $$4 = ccu.d($$3);
      List<bbg> $$5 = ccu.a($$3);
      boolean $$6 = $$4 == ccv.b && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean fK() {
      return this.Y.a(bZ);
   }

   public boolean fL() {
      return this.Y.a(ca);
   }

   public void fM() {
      this.Y.b(ca, true);
   }

   @Override
   public boolean P() {
      return super.P() || this.fJ() != null;
   }

   static class a extends bip {
      private final brg a;
      @Nullable
      private bcc b;

      public a(brg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.c, bip.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.G();
         if (!(this.b instanceof buc)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.f((buc)this.b);
         }
      }

      @Override
      public void c() {
         this.a.D().n();
      }

      @Override
      public void e() {
         this.a.z().a(this.b.df(), this.b.dj(), this.b.dl());
      }
   }

   static class b extends bip {
      private final brg a;

      public b(brg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.fJ() == null) {
            return false;
         } else if (!this.a.s.W().b(cgt.c)) {
            return false;
         } else {
            return this.a.dQ().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         amn $$0 = this.a.dQ();
         cgx $$1 = this.a.s;
         int $$2 = ami.b(this.a.df() - 1.0 + $$0.j() * 2.0);
         int $$3 = ami.b(this.a.dh() + $$0.j() * 2.0);
         int $$4 = ami.b(this.a.dl() - 1.0 + $$0.j() * 2.0);
         gt $$5 = new gt($$2, $$3, $$4);
         cvo $$6 = $$1.a_($$5);
         gt $$7 = $$5.c();
         cvo $$8 = $$1.a_($$7);
         cvo $$9 = this.a.fJ();
         if ($$9 != null) {
            $$9 = cjt.b($$9, this.a.s, $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(czv.i, $$5, czv.a.a(this.a, $$9));
               this.a.c(null);
            }

         }
      }

      private boolean a(cgx $$0, gt $$1, cvo $$2, cvo $$3, cvo $$4, gt $$5) {
         return $$3.h() && !$$4.h() && !$$4.a(cju.B) && $$4.r($$0, $$5) && $$2.a((cha)$$0, $$1) && $$0.a_(this.a, dwl.a(dwq.b($$1))).isEmpty();
      }
   }

   static class c extends bkh<buc> {
      private final brg i;
      @Nullable
      private buc j;
      private int k;
      private int l;
      private final bmf m;
      private final bmf n = bmf.a().d();

      public c(brg $$0, @Nullable Predicate<bcc> $$1) {
         super($$0, buc.class, 10, false, false, $$1);
         this.i = $$0;
         this.m = bmf.a().a(this.l()).a($$1x -> $$0.f((buc)$$1x));
      }

      @Override
      public boolean a() {
         this.j = this.i.s.a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.fM();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.i.f(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            return this.c != null && this.n.a(this.i, this.c) ? true : super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.G() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bI()) {
               if (this.i.f((buc)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.t();
                  }

                  this.l = 0;
               } else if (this.c.f(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }

      }
   }

   static class d extends bip {
      private final brg a;

      public d(brg $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.fJ() != null) {
            return false;
         } else if (!this.a.s.W().b(cgt.c)) {
            return false;
         } else {
            return this.a.dQ().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         amn $$0 = this.a.dQ();
         cgx $$1 = this.a.s;
         int $$2 = ami.b(this.a.df() - 2.0 + $$0.j() * 4.0);
         int $$3 = ami.b(this.a.dh() + $$0.j() * 3.0);
         int $$4 = ami.b(this.a.dl() - 2.0 + $$0.j() * 4.0);
         gt $$5 = new gt($$2, $$3, $$4);
         cvo $$6 = $$1.a_($$5);
         dwq $$7 = new dwq((double)this.a.de() + 0.5, (double)$$3 + 0.5, (double)this.a.dk() + 0.5);
         dwq $$8 = new dwq((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         dwm $$9 = $$1.a(new cgg($$7, $$8, cgg.a.b, cgg.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(akl.ag) && $$10) {
            $$1.a($$5, false);
            $$1.a(czv.f, $$5, czv.a.a(this.a, $$6));
            this.a.c($$6.b().m());
         }

      }
   }
}
