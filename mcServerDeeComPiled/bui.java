import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bui extends buu {
   private static final double f = 2.0;
   private static final aaj<Byte> ao = aam.a(bui.class, aal.a);
   private static final aaj<Byte> ap = aam.a(bui.class, aal.a);
   private static final int aq = 1;
   private static final int ar = 2;
   private static final int as = 4;
   @Nullable
   private cvo at;
   protected boolean b;
   protected int c;
   public bui.a d = bui.a.a;
   public int e;
   private int au;
   private double av = 2.0;
   private int aw;
   private ajv ax = this.i();
   @Nullable
   private IntOpenHashSet ay;
   @Nullable
   private List<bbn> az;

   protected bui(bbr<? extends bui> $$0, cgx $$1) {
      super($$0, $$1);
   }

   protected bui(bbr<? extends bui> $$0, double $$1, double $$2, double $$3, cgx $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected bui(bbr<? extends bui> $$0, bcc $$1, cgx $$2) {
      this($$0, $$1.df(), $$1.dj() - 0.1F, $$1.dl(), $$2);
      this.b($$1);
      if ($$1 instanceof buc) {
         this.d = bui.a.b;
      }

   }

   public void b(ajv $$0) {
      this.ax = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cy().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cs();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
      this.Y.a(ao, (byte)0);
      this.Y.a(ap, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.au = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      super.k($$0, $$1, $$2);
      this.au = 0;
   }

   @Override
   public void k() {
      super.k();
      boolean $$0 = this.u();
      dwq $$1 = this.dd();
      if (this.x == 0.0F && this.w == 0.0F) {
         double $$2 = $$1.h();
         this.o((float)(ami.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.p((float)(ami.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.w = this.dq();
         this.x = this.ds();
      }

      gt $$3 = this.da();
      cvo $$4 = this.s.a_($$3);
      if (!$$4.h() && !$$0) {
         dxj $$5 = $$4.k(this.s, $$3);
         if (!$$5.b()) {
            dwq $$6 = this.cY();

            for(dwl $$7 : $$5.d()) {
               if ($$7.a($$3).d($$6)) {
                  this.b = true;
                  break;
               }
            }
         }
      }

      if (this.e > 0) {
         --this.e;
      }

      if (this.aS() || $$4.a(cju.pn)) {
         this.au();
      }

      if (this.b && !$$0) {
         if (this.at != $$4 && this.w()) {
            this.A();
         } else if (!this.s.y) {
            this.h();
         }

         ++this.c;
      } else {
         this.c = 0;
         dwq $$8 = this.cY();
         dwq $$9 = $$8.e($$1);
         dwo $$10 = this.s.a(new cgg($$8, $$9, cgg.a.a, cgg.b.a, this));
         if ($$10.c() != dwo.a.a) {
            $$9 = $$10.e();
         }

         while(!this.dt()) {
            dwn $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == dwo.a.c) {
               bbn $$12 = ((dwn)$$10).a();
               bbn $$13 = this.x();
               if ($$12 instanceof buc && $$13 instanceof buc && !((buc)$$13).a((buc)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.af = true;
            }

            if ($$11 == null || this.s() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dd();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.q()) {
            for(int $$17 = 0; $$17 < 4; ++$$17) {
               this.s
                  .a(
                     io.g,
                     this.df() + $$14 * (double)$$17 / 4.0,
                     this.dh() + $$15 * (double)$$17 / 4.0,
                     this.dl() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.df() + $$14;
         double $$19 = this.dh() + $$15;
         double $$20 = this.dl() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.o((float)(ami.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.o((float)(ami.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.p((float)(ami.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.p(d(this.x, this.ds()));
         this.o(d(this.w, this.dq()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aR()) {
            for(int $$24 = 0; $$24 < 4; ++$$24) {
               float $$25 = 0.25F;
               this.s.a(io.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.t();
         }

         this.f($$1.a((double)$$22));
         if (!this.aN() && !$$0) {
            dwq $$26 = this.dd();
            this.n($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.e($$18, $$19, $$20);
         this.aJ();
      }
   }

   private boolean w() {
      return this.b && this.s.b(new dwl(this.cY(), this.cY()).g(0.06));
   }

   private void A() {
      this.b = false;
      dwq $$0 = this.dd();
      this.f($$0.d((double)(this.R.i() * 0.2F), (double)(this.R.i() * 0.2F), (double)(this.R.i() * 0.2F)));
      this.au = 0;
   }

   @Override
   public void a(bci $$0, dwq $$1) {
      super.a($$0, $$1);
      if ($$0 != bci.a && this.w()) {
         this.A();
      }

   }

   protected void h() {
      ++this.au;
      if (this.au >= 1200) {
         this.ah();
      }

   }

   private void C() {
      if (this.az != null) {
         this.az.clear();
      }

      if (this.ay != null) {
         this.ay.clear();
      }

   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      bbn $$1 = $$0.a();
      float $$2 = (float)this.dd().f();
      int $$3 = ami.e(ami.a((double)$$2 * this.av, 0.0, 2.147483647E9));
      if (this.s() > 0) {
         if (this.ay == null) {
            this.ay = new IntOpenHashSet(5);
         }

         if (this.az == null) {
            this.az = Lists.newArrayListWithCapacity(5);
         }

         if (this.ay.size() >= this.s() + 1) {
            this.ah();
            return;
         }

         this.ay.add($$1.ae());
      }

      if (this.q()) {
         long $$4 = (long)this.R.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bbn $$5 = this.x();
      baw $$6;
      if ($$5 == null) {
         $$6 = baw.a(this, this);
      } else {
         $$6 = baw.a(this, $$5);
         if ($$5 instanceof bcc) {
            ((bcc)$$5).x($$1);
         }
      }

      boolean $$8 = $$1.ad() == bbr.y;
      int $$9 = $$1.at();
      if (this.bH() && !$$8) {
         $$1.f(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bcc $$10) {
            if (!this.s.y && this.s() <= 0) {
               $$10.p($$10.eu() + 1);
            }

            if (this.aw > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bdd.c));
               dwq $$12 = this.dd().d(1.0, 0.0, 1.0).d().a((double)this.aw * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.i($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.s.y && $$5 instanceof bcc) {
               cet.a($$10, $$5);
               cet.b((bcc)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof buc && $$5 instanceof agh && !this.aM()) {
               ((agh)$$5).b.a(new uj(uj.g, 0.0F));
            }

            if (!$$1.bo() && this.az != null) {
               this.az.add($$10);
            }

            if (!this.s.y && $$5 instanceof agh $$13) {
               if (this.az != null && this.r()) {
                  aj.G.a($$13, this.az);
               } else if (!$$1.bo() && this.r()) {
                  aj.G.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.ax, 1.0F, 1.2F / (this.R.i() * 0.2F + 0.9F));
         if (this.s() <= 0) {
            this.ah();
         }
      } else {
         $$1.g($$9);
         this.f(this.dd().a(-0.1));
         this.o(this.dq() + 180.0F);
         this.w += 180.0F;
         if (!this.s.y && this.dd().g() < 1.0E-7) {
            if (this.d == bui.a.b) {
               this.a(this.l(), 0.1F);
            }

            this.ah();
         }
      }

   }

   @Override
   protected void a(dwm $$0) {
      this.at = this.s.a_($$0.a());
      super.a($$0);
      dwq $$1 = $$0.e().a(this.df(), this.dh(), this.dl());
      this.f($$1);
      dwq $$2 = $$1.d().a(0.05F);
      this.o(this.df() - $$2.c, this.dh() - $$2.d, this.dl() - $$2.e);
      this.a(this.j(), 1.0F, 1.2F / (this.R.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.b((byte)0);
      this.b(ajw.ao);
      this.q(false);
      this.C();
   }

   protected ajv i() {
      return ajw.ao;
   }

   protected final ajv j() {
      return this.ax;
   }

   protected void a(bcc $$0) {
   }

   @Nullable
   protected dwn a(dwq $$0, dwq $$1) {
      return buv.a(this.s, this, $$0, $$1, this.cy().b(this.dd()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bbn $$0) {
      return super.a($$0) && (this.ay == null || !this.ay.contains($$0.ae()));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("life", (short)this.au);
      if (this.at != null) {
         $$0.a("inBlockState", (qc)pv.a(this.at));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.av);
      $$0.a("crit", this.q());
      $$0.a("PierceLevel", this.s());
      $$0.a("SoundEvent", hm.S.b(this.ax).toString());
      $$0.a("ShotFromCrossbow", this.r());
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.au = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.at = pv.c($$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.av = $$0.k("damage");
      }

      this.d = bui.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.b($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.ax = (ajv)hm.S.b(new abb($$0.l("SoundEvent"))).orElse(this.i());
      }

      this.q($$0.q("ShotFromCrossbow"));
   }

   @Override
   public void b(@Nullable bbn $$0) {
      super.b($$0);
      if ($$0 instanceof buc) {
         this.d = ((buc)$$0).fB().d ? bui.a.c : bui.a.b;
      }

   }

   @Override
   public void b_(buc $$0) {
      if (!this.s.y && (this.b || this.u()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ah();
         }

      }
   }

   protected boolean a(buc $$0) {
      switch(this.d) {
         case b:
            return $$0.fA().e(this.l());
         case c:
            return $$0.fB().d;
         default:
            return false;
      }
   }

   protected abstract cax l();

   @Override
   protected bbn.b aO() {
      return bbn.b.a;
   }

   public void h(double $$0) {
      this.av = $$0;
   }

   public double n() {
      return this.av;
   }

   public void a(int $$0) {
      this.aw = $$0;
   }

   public int o() {
      return this.aw;
   }

   @Override
   public boolean ch() {
      return false;
   }

   @Override
   protected float a(bco $$0, bbo $$1) {
      return 0.13F;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void b(byte $$0) {
      this.Y.b(ap, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.Y.a(ao);
      if ($$1) {
         this.Y.b(ao, (byte)($$2 | $$0));
      } else {
         this.Y.b(ao, (byte)($$2 & ~$$0));
      }

   }

   public boolean q() {
      byte $$0 = this.Y.a(ao);
      return ($$0 & 1) != 0;
   }

   public boolean r() {
      byte $$0 = this.Y.a(ao);
      return ($$0 & 4) != 0;
   }

   public byte s() {
      return this.Y.a(ap);
   }

   public void a(bcc $$0, float $$1) {
      int $$2 = cet.a(cev.y, $$0);
      int $$3 = cet.a(cev.z, $$0);
      this.h((double)($$1 * 2.0F) + this.R.a((double)this.s.ag().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.n() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.a($$3);
      }

      if (cet.a(cev.A, $$0) > 0) {
         this.f(100);
      }

   }

   protected float t() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.Q = $$0;
      this.a(2, $$0);
   }

   public boolean u() {
      if (!this.s.y) {
         return this.Q;
      } else {
         return (this.Y.a(ao) & 2) != 0;
      }
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static bui.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
