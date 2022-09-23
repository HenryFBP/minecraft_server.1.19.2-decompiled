import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bnt extends bne {
   private static final aaj<Integer> ca = aam.a(bnt.class, aal.b);
   private static final aaj<Integer> cb = aam.a(bnt.class, aal.b);
   private static final aaj<Integer> cc = aam.a(bnt.class, aal.b);
   private static final aaj<Byte> cd = aam.a(bnt.class, aal.a);
   private static final aaj<Byte> ce = aam.a(bnt.class, aal.a);
   private static final aaj<Byte> cf = aam.a(bnt.class, aal.a);
   static final bmf cg = bmf.b().a(8.0);
   private static final int ch = 2;
   private static final int ci = 4;
   private static final int cj = 8;
   private static final int ck = 16;
   private static final int cl = 5;
   public static final int bX = 32;
   private static final int cm = 32;
   boolean cn;
   boolean co;
   public int bY;
   private dwq cp;
   private float cq;
   private float cr;
   private float cs;
   private float ct;
   private float cu;
   private float cv;
   bnt.g cw;
   static final Predicate<bqv> cx = $$0 -> {
      cax $$1 = $$0.i();
      return ($$1.a(cju.lK.l()) || $$1.a(cju.dq.l())) && $$0.bo() && !$$0.s();
   };

   public bnt(bbr<? extends bnt> $$0, cgx $$1) {
      super($$0, $$1);
      this.bP = new bnt.h(this);
      if (!this.y_()) {
         this.r(true);
      }

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

   public int q() {
      return this.Y.a(ca);
   }

   public void t(int $$0) {
      this.Y.b(ca, $$0);
   }

   public boolean t() {
      return this.w(2);
   }

   public boolean fJ() {
      return this.w(8);
   }

   public void v(boolean $$0) {
      this.d(8, $$0);
   }

   public boolean fK() {
      return this.w(16);
   }

   public void w(boolean $$0) {
      this.d(16, $$0);
   }

   public boolean fL() {
      return this.Y.a(cc) > 0;
   }

   public void x(boolean $$0) {
      this.Y.b(cc, $$0 ? 1 : 0);
   }

   private int gf() {
      return this.Y.a(cc);
   }

   private void v(int $$0) {
      this.Y.b(cc, $$0);
   }

   public void y(boolean $$0) {
      this.d(2, $$0);
      if (!$$0) {
         this.u(0);
      }

   }

   public int fR() {
      return this.Y.a(cb);
   }

   public void u(int $$0) {
      this.Y.b(cb, $$0);
   }

   public bnt.a fS() {
      return bnt.a.a(this.Y.a(cd));
   }

   public void a(bnt.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bnt.a.a(this.R);
      }

      this.Y.b(cd, (byte)$$0.a());
   }

   public bnt.a fT() {
      return bnt.a.a(this.Y.a(ce));
   }

   public void b(bnt.a $$0) {
      if ($$0.a() > 6) {
         $$0 = bnt.a.a(this.R);
      }

      this.Y.b(ce, (byte)$$0.a());
   }

   public boolean fU() {
      return this.w(4);
   }

   public void z(boolean $$0) {
      this.d(4, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ca, 0);
      this.Y.a(cb, 0);
      this.Y.a(cd, (byte)0);
      this.Y.a(ce, (byte)0);
      this.Y.a(cf, (byte)0);
      this.Y.a(cc, 0);
   }

   private boolean w(int $$0) {
      return (this.Y.a(cf) & $$0) != 0;
   }

   private void d(int $$0, boolean $$1) {
      byte $$2 = this.Y.a(cf);
      if ($$1) {
         this.Y.b(cf, (byte)($$2 | $$0));
      } else {
         this.Y.b(cf, (byte)($$2 & ~$$0));
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("MainGene", this.fS().b());
      $$0.a("HiddenGene", this.fT().b());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(bnt.a.a($$0.l("MainGene")));
      this.b(bnt.a.a($$0.l("HiddenGene")));
   }

   @Nullable
   @Override
   public bbk a(agg $$0, bbk $$1) {
      bnt $$2 = bbr.an.a((cgx)$$0);
      if ($$1 instanceof bnt) {
         $$2.a(this, (bnt)$$1);
      }

      $$2.gd();
      return $$2;
   }

   @Override
   protected void u() {
      this.bS.a(0, new bij(this));
      this.bS.a(2, new bnt.i(this, 2.0));
      this.bS.a(2, new bnt.d(this, 1.0));
      this.bS.a(3, new bnt.b(this, 1.2F, true));
      this.bS.a(4, new bjw(this, 1.0, cdm.a(cju.lK.l()), false));
      this.bS.a(6, new bnt.c(this, buc.class, 8.0F, 2.0, 2.0));
      this.bS.a(6, new bnt.c(this, brq.class, 4.0F, 2.0, 2.0));
      this.bS.a(7, new bnt.k());
      this.bS.a(8, new bnt.f(this));
      this.bS.a(8, new bnt.l(this));
      this.cw = new bnt.g(this, buc.class, 6.0F);
      this.bS.a(9, this.cw);
      this.bS.a(10, new bjk(this));
      this.bS.a(12, new bnt.j(this));
      this.bS.a(13, new bio(this, 1.25));
      this.bS.a(14, new bkb(this, 1.0));
      this.bT.a(1, new bnt.e(this).a(new Class[0]));
   }

   public static bdc.a fV() {
      return bce.w().a(bdd.d, 0.15F).a(bdd.f, 6.0);
   }

   public bnt.a fW() {
      return bnt.a.a(this.fS(), this.fT());
   }

   public boolean fX() {
      return this.fW() == bnt.a.b;
   }

   public boolean fY() {
      return this.fW() == bnt.a.c;
   }

   public boolean fZ() {
      return this.fW() == bnt.a.d;
   }

   public boolean ga() {
      return this.fW() == bnt.a.e;
   }

   public boolean gb() {
      return this.fW() == bnt.a.f;
   }

   @Override
   public boolean fC() {
      return this.fW() == bnt.a.g;
   }

   @Override
   public boolean a(buc $$0) {
      return false;
   }

   @Override
   public boolean z(bbn $$0) {
      this.a(ajw.on, 1.0F, 1.0F);
      if (!this.fC()) {
         this.co = true;
      }

      return super.z($$0);
   }

   @Override
   public void k() {
      super.k();
      if (this.fY()) {
         if (this.s.X() && !this.aR()) {
            this.v(true);
            this.x(false);
         } else if (!this.fL()) {
            this.v(false);
         }
      }

      bcc $$0 = this.G();
      if ($$0 == null) {
         this.cn = false;
         this.co = false;
      }

      if (this.q() > 0) {
         if ($$0 != null) {
            this.a($$0, 90.0F, 90.0F);
         }

         if (this.q() == 29 || this.q() == 14) {
            this.a(ajw.oj, 1.0F, 1.0F);
         }

         this.t(this.q() - 1);
      }

      if (this.t()) {
         this.u(this.fR() + 1);
         if (this.fR() > 20) {
            this.y(false);
            this.gm();
         } else if (this.fR() == 1) {
            this.a(ajw.od, 1.0F, 1.0F);
         }
      }

      if (this.fU()) {
         this.gl();
      } else {
         this.bY = 0;
      }

      if (this.fJ()) {
         this.p(0.0F);
      }

      this.gi();
      this.gg();
      this.gj();
      this.gk();
   }

   public boolean gc() {
      return this.fY() && this.s.X();
   }

   private void gg() {
      if (!this.fL() && this.fJ() && !this.gc() && !this.c(bbs.a).b() && this.R.a(80) == 1) {
         this.x(true);
      } else if (this.c(bbs.a).b() || !this.fJ()) {
         this.x(false);
      }

      if (this.fL()) {
         this.gh();
         if (!this.s.y && this.gf() > 80 && this.R.a(20) == 1) {
            if (this.gf() > 100 && this.m(this.c(bbs.a))) {
               if (!this.s.y) {
                  this.a(bbs.a, cax.b);
                  this.a(czv.n);
               }

               this.v(false);
            }

            this.x(false);
            return;
         }

         this.v(this.gf() + 1);
      }

   }

   private void gh() {
      if (this.gf() % 5 == 0) {
         this.a(ajw.oh, 0.5F + 0.5F * (float)this.R.a(2), (this.R.i() - this.R.i()) * 0.2F + 1.0F);

         for(int $$0 = 0; $$0 < 6; ++$$0) {
            dwq $$1 = new dwq(((double)this.R.i() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, ((double)this.R.i() - 0.5) * 0.1);
            $$1 = $$1.a(-this.ds() * (float) (Math.PI / 180.0));
            $$1 = $$1.b(-this.dq() * (float) (Math.PI / 180.0));
            double $$2 = (double)(-this.R.i()) * 0.6 - 0.3;
            dwq $$3 = new dwq(((double)this.R.i() - 0.5) * 0.8, $$2, 1.0 + ((double)this.R.i() - 0.5) * 0.4);
            $$3 = $$3.b(-this.aX * (float) (Math.PI / 180.0));
            $$3 = $$3.b(this.df(), this.dj() + 1.0, this.dl());
            this.s.a(new ik(io.N, this.c(bbs.a)), $$3.c, $$3.d, $$3.e, $$1.c, $$1.d + 0.05, $$1.e);
         }
      }

   }

   private void gi() {
      this.cr = this.cq;
      if (this.fJ()) {
         this.cq = Math.min(1.0F, this.cq + 0.15F);
      } else {
         this.cq = Math.max(0.0F, this.cq - 0.19F);
      }

   }

   private void gj() {
      this.ct = this.cs;
      if (this.fK()) {
         this.cs = Math.min(1.0F, this.cs + 0.15F);
      } else {
         this.cs = Math.max(0.0F, this.cs - 0.19F);
      }

   }

   private void gk() {
      this.cv = this.cu;
      if (this.fU()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.19F);
      }

   }

   public float y(float $$0) {
      return ami.i($$0, this.cr, this.cq);
   }

   public float z(float $$0) {
      return ami.i($$0, this.ct, this.cs);
   }

   public float A(float $$0) {
      return ami.i($$0, this.cv, this.cu);
   }

   private void gl() {
      ++this.bY;
      if (this.bY > 32) {
         this.z(false);
      } else {
         if (!this.s.y) {
            dwq $$0 = this.dd();
            if (this.bY == 1) {
               float $$1 = this.dq() * (float) (Math.PI / 180.0);
               float $$2 = this.y_() ? 0.1F : 0.2F;
               this.cp = new dwq($$0.c + (double)(-ami.a($$1) * $$2), 0.0, $$0.e + (double)(ami.b($$1) * $$2));
               this.f(this.cp.b(0.0, 0.27, 0.0));
            } else if ((float)this.bY != 7.0F && (float)this.bY != 15.0F && (float)this.bY != 23.0F) {
               this.n(this.cp.c, $$0.d, this.cp.e);
            } else {
               this.n(0.0, this.y ? 0.27 : $$0.d, 0.0);
            }
         }

      }
   }

   private void gm() {
      dwq $$0 = this.dd();
      this.s
         .a(
            io.Z,
            this.df() - (double)(this.cW() + 1.0F) * 0.5 * (double)ami.a(this.aX * (float) (Math.PI / 180.0)),
            this.dj() - 0.1F,
            this.dl() + (double)(this.cW() + 1.0F) * 0.5 * (double)ami.b(this.aX * (float) (Math.PI / 180.0)),
            $$0.c,
            0.0,
            $$0.e
         );
      this.a(ajw.oe, 1.0F, 1.0F);

      for(bnt $$2 : this.s.a(bnt.class, this.cy().g(10.0))) {
         if (!$$2.y_() && $$2.y && !$$2.aR() && $$2.ge()) {
            $$2.eH();
         }
      }

      if (!this.s.k_() && this.R.a(700) == 0 && this.s.W().b(cgt.f)) {
         this.a(caz.oZ);
      }

   }

   @Override
   protected void b(bqv $$0) {
      if (this.c(bbs.a).b() && cx.test($$0)) {
         this.a($$0);
         cax $$1 = $$0.i();
         this.a(bbs.a, $$1);
         this.e(bbs.a);
         this.a($$0, $$1.K());
         $$0.ah();
      }

   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (!this.s.y) {
         this.v(false);
      }

      return super.a($$0, $$1);
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      this.a(bnt.a.a($$5));
      this.b(bnt.a.a($$5));
      this.gd();
      if ($$3 == null) {
         $$3 = new bbk.a(0.2F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void a(bnt $$0, @Nullable bnt $$1) {
      if ($$1 == null) {
         if (this.R.h()) {
            this.a($$0.gn());
            this.b(bnt.a.a(this.R));
         } else {
            this.a(bnt.a.a(this.R));
            this.b($$0.gn());
         }
      } else if (this.R.h()) {
         this.a($$0.gn());
         this.b($$1.gn());
      } else {
         this.a($$1.gn());
         this.b($$0.gn());
      }

      if (this.R.a(32) == 0) {
         this.a(bnt.a.a(this.R));
      }

      if (this.R.a(32) == 0) {
         this.b(bnt.a.a(this.R));
      }

   }

   private bnt.a gn() {
      return this.R.h() ? this.fS() : this.fT();
   }

   public void gd() {
      if (this.gb()) {
         this.a(bdd.a).a(10.0);
      }

      if (this.fX()) {
         this.a(bdd.d).a(0.07F);
      }

   }

   void go() {
      if (!this.aR()) {
         this.u(0.0F);
         this.D().n();
         this.v(true);
      }

   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (this.gc()) {
         return baj.d;
      } else if (this.fK()) {
         this.w(false);
         return baj.a(this.s.y);
      } else if (this.n($$2)) {
         if (this.G() != null) {
            this.cn = true;
         }

         if (this.y_()) {
            this.a($$0, $$1, $$2);
            this.a((int)((float)(-this.j() / 20) * 0.1F), true);
         } else if (!this.s.y && this.j() == 0 && this.fM()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
         } else {
            if (this.s.y || this.fJ() || this.aR()) {
               return baj.d;
            }

            this.go();
            this.x(true);
            cax $$3 = this.c(bbs.a);
            if (!$$3.b() && !$$0.fB().d) {
               this.b($$3);
            }

            this.a(bbs.a, new cax($$2.c(), 1));
            this.a($$0, $$1, $$2);
         }

         return baj.a;
      } else {
         return baj.d;
      }
   }

   @Nullable
   @Override
   protected ajv r() {
      if (this.fC()) {
         return ajw.ok;
      } else {
         return this.fY() ? ajw.ol : ajw.of;
      }
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.oi, 0.15F, 1.0F);
   }

   @Override
   public boolean n(cax $$0) {
      return $$0.a(cju.lK.l());
   }

   private boolean m(cax $$0) {
      return this.n($$0) || $$0.a(cju.dq.l());
   }

   @Nullable
   @Override
   protected ajv x_() {
      return ajw.og;
   }

   @Nullable
   @Override
   protected ajv c(baw $$0) {
      return ajw.om;
   }

   public boolean ge() {
      return !this.fK() && !this.gc() && !this.fL() && !this.fU() && !this.fJ();
   }

   public static enum a {
      a(0, "normal", false),
      b(1, "lazy", false),
      c(2, "worried", false),
      d(3, "playful", false),
      e(4, "brown", true),
      f(5, "weak", true),
      g(6, "aggressive", false);

      private static final bnt.a[] h = (bnt.a[])Arrays.stream(values()).sorted(Comparator.comparingInt(bnt.a::a)).toArray($$0 -> new bnt.a[$$0]);
      private static final int i = 6;
      private final int j;
      private final String k;
      private final boolean l;

      private a(int $$0, String $$1, boolean $$2) {
         this.j = $$0;
         this.k = $$1;
         this.l = $$2;
      }

      public int a() {
         return this.j;
      }

      public String b() {
         return this.k;
      }

      public boolean c() {
         return this.l;
      }

      static bnt.a a(bnt.a $$0, bnt.a $$1) {
         if ($$0.c()) {
            return $$0 == $$1 ? $$0 : a;
         } else {
            return $$0;
         }
      }

      public static bnt.a a(int $$0) {
         if ($$0 < 0 || $$0 >= h.length) {
            $$0 = 0;
         }

         return h[$$0];
      }

      public static bnt.a a(String $$0) {
         for(bnt.a $$1 : values()) {
            if ($$1.k.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }

      public static bnt.a a(amn $$0) {
         int $$1 = $$0.a(16);
         if ($$1 == 0) {
            return b;
         } else if ($$1 == 1) {
            return c;
         } else if ($$1 == 2) {
            return d;
         } else if ($$1 == 4) {
            return g;
         } else if ($$1 < 9) {
            return f;
         } else {
            return $$1 < 11 ? e : a;
         }
      }
   }

   static class b extends biz {
      private final bnt b;

      public b(bnt $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.ge() && super.a();
      }
   }

   static class c<T extends bcc> extends bhw<T> {
      private final bnt i;

      public c(bnt $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bbq.f::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.fY() && this.i.ge() && super.a();
      }
   }

   static class d extends bib {
      private final bnt d;
      private int e;

      public d(bnt $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         if (!super.a() || this.d.q() != 0) {
            return false;
         } else if (!this.h()) {
            if (this.e <= this.d.S) {
               this.d.t(32);
               this.e = this.d.S + 600;
               if (this.d.eP()) {
                  buc $$0 = this.b.a(bnt.cg, this.d);
                  this.d.cw.a($$0);
               }
            }

            return false;
         } else {
            return true;
         }
      }

      private boolean h() {
         gt $$0 = this.d.da();
         gt.a $$1 = new gt.a();

         for(int $$2 = 0; $$2 < 3; ++$$2) {
            for(int $$3 = 0; $$3 < 8; ++$$3) {
               for(int $$4 = 0; $$4 <= $$3; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
                  for(int $$5 = $$4 < $$3 && $$4 > -$$3 ? $$3 : 0; $$5 <= $$3; $$5 = $$5 > 0 ? -$$5 : 1 - $$5) {
                     $$1.a($$0, $$4, $$2, $$5);
                     if (this.b.a_($$1).a(cju.lK)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      }
   }

   static class e extends bkg {
      private final bnt a;

      public e(bnt $$0, Class<?>... $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.cn && !this.a.co) {
            return super.b();
         } else {
            this.a.h(null);
            return false;
         }
      }

      @Override
      protected void a(bce $$0, bcc $$1) {
         if ($$0 instanceof bnt && ((bnt)$$0).fC()) {
            $$0.h($$1);
         }

      }
   }

   static class f extends bip {
      private final bnt a;
      private int b;

      public f(bnt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         return this.b < this.a.S && this.a.fX() && this.a.ge() && this.a.R.a(b(400)) == 1;
      }

      @Override
      public boolean b() {
         if (!this.a.aR() && (this.a.fX() || this.a.R.a(b(600)) != 1)) {
            return this.a.R.a(b(2000)) != 1;
         } else {
            return false;
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.b = 0;
      }

      @Override
      public void d() {
         this.a.w(false);
         this.b = this.a.S + 200;
      }
   }

   static class g extends bix {
      private final bnt h;

      public g(bnt $$0, Class<? extends bcc> $$1, float $$2) {
         super($$0, $$1, $$2);
         this.h = $$0;
      }

      public void a(bcc $$0) {
         this.c = $$0;
      }

      @Override
      public boolean b() {
         return this.c != null && super.b();
      }

      @Override
      public boolean a() {
         if (this.b.dQ().i() >= this.e) {
            return false;
         } else {
            if (this.c == null) {
               if (this.f == buc.class) {
                  this.c = this.b.s.a(this.g, this.b, this.b.df(), this.b.dj(), this.b.dl());
               } else {
                  this.c = this.b
                     .s
                     .a(
                        this.b.s.a(this.f, this.b.cy().c((double)this.d, 3.0, (double)this.d), $$0 -> true),
                        this.g,
                        this.b,
                        this.b.df(),
                        this.b.dj(),
                        this.b.dl()
                     );
               }
            }

            return this.h.ge() && this.c != null;
         }
      }

      @Override
      public void e() {
         if (this.c != null) {
            super.e();
         }

      }
   }

   static class h extends bhs {
      private final bnt l;

      public h(bnt $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.ge()) {
            super.a();
         }
      }
   }

   static class i extends bji {
      private final bnt h;

      public i(bnt $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      protected boolean h() {
         return this.b.dp() || this.b.bH();
      }

      @Override
      public boolean b() {
         if (this.h.fJ()) {
            this.h.D().n();
            return false;
         } else {
            return super.b();
         }
      }
   }

   static class j extends bip {
      private final bnt a;

      public j(bnt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bip.a.a, bip.a.b, bip.a.c));
      }

      @Override
      public boolean a() {
         if ((this.a.y_() || this.a.fZ()) && this.a.y) {
            if (!this.a.ge()) {
               return false;
            } else {
               float $$0 = this.a.dq() * (float) (Math.PI / 180.0);
               float $$1 = -ami.a($$0);
               float $$2 = ami.b($$0);
               int $$3 = (double)Math.abs($$1) > 0.5 ? ami.k((double)$$1) : 0;
               int $$4 = (double)Math.abs($$2) > 0.5 ? ami.k((double)$$2) : 0;
               if (this.a.s.a_(this.a.da().b($$3, -1, $$4)).h()) {
                  return true;
               } else if (this.a.fZ() && this.a.R.a(b(60)) == 1) {
                  return true;
               } else {
                  return this.a.R.a(b(500)) == 1;
               }
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.z(true);
      }

      @Override
      public boolean D_() {
         return false;
      }
   }

   class k extends bip {
      private int b;

      public k() {
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean a() {
         if (this.b <= bnt.this.S && !bnt.this.y_() && !bnt.this.aR() && bnt.this.ge() && bnt.this.q() <= 0) {
            List<bqv> $$0 = bnt.this.s.a(bqv.class, bnt.this.cy().c(6.0, 6.0, 6.0), bnt.cx);
            return !$$0.isEmpty() || !bnt.this.c(bbs.a).b();
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         if (!bnt.this.aR() && (bnt.this.fX() || bnt.this.R.a(b(600)) != 1)) {
            return bnt.this.R.a(b(2000)) != 1;
         } else {
            return false;
         }
      }

      @Override
      public void e() {
         if (!bnt.this.fJ() && !bnt.this.c(bbs.a).b()) {
            bnt.this.go();
         }

      }

      @Override
      public void c() {
         List<bqv> $$0 = bnt.this.s.a(bqv.class, bnt.this.cy().c(8.0, 8.0, 8.0), bnt.cx);
         if (!$$0.isEmpty() && bnt.this.c(bbs.a).b()) {
            bnt.this.D().a((bbn)$$0.get(0), 1.2F);
         } else if (!bnt.this.c(bbs.a).b()) {
            bnt.this.go();
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cax $$0 = bnt.this.c(bbs.a);
         if (!$$0.b()) {
            bnt.this.b($$0);
            bnt.this.a(bbs.a, cax.b);
            int $$1 = bnt.this.fX() ? bnt.this.R.a(50) + 10 : bnt.this.R.a(150) + 10;
            this.b = bnt.this.S + $$1 * 20;
         }

         bnt.this.v(false);
      }
   }

   static class l extends bip {
      private final bnt a;

      public l(bnt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.y_() && this.a.ge()) {
            if (this.a.gb() && this.a.R.a(b(500)) == 1) {
               return true;
            } else {
               return this.a.R.a(b(6000)) == 1;
            }
         } else {
            return false;
         }
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void c() {
         this.a.y(true);
      }
   }
}
