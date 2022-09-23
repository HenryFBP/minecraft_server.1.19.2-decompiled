import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bpp extends bce implements bri {
   private static final Logger cc = LogUtils.getLogger();
   public static final aaj<Integer> b = aam.a(bpp.class, aal.b);
   private static final bmf cd = bmf.a().a(64.0);
   private static final int ce = 200;
   private static final int cf = 400;
   private static final float cg = 0.25F;
   private static final String ch = "DragonDeathTime";
   private static final String ci = "DragonPhase";
   public final double[][] c = new double[64][3];
   public int d = -1;
   private final bpn[] cj;
   public final bpn e;
   private final bpn ck;
   private final bpn cl;
   private final bpn cm;
   private final bpn cn;
   private final bpn co;
   private final bpn cp;
   private final bpn cq;
   public float bW;
   public float bX;
   public boolean bY;
   public int bZ;
   public float ca;
   @Nullable
   public bpo cb;
   @Nullable
   private final cyx cr;
   private final bqg cs;
   private int ct = 100;
   private float cu;
   private final dqj[] cv = new dqj[24];
   private final int[] cw = new int[24];
   private final dqg cx = new dqg();

   public bpp(bbr<? extends bpp> $$0, cgx $$1) {
      super(bbr.x, $$1);
      this.e = new bpn(this, "head", 1.0F, 1.0F);
      this.ck = new bpn(this, "neck", 3.0F, 3.0F);
      this.cl = new bpn(this, "body", 5.0F, 3.0F);
      this.cm = new bpn(this, "tail", 2.0F, 2.0F);
      this.cn = new bpn(this, "tail", 2.0F, 2.0F);
      this.co = new bpn(this, "tail", 2.0F, 2.0F);
      this.cp = new bpn(this, "wing", 4.0F, 2.0F);
      this.cq = new bpn(this, "wing", 4.0F, 2.0F);
      this.cj = new bpn[]{this.e, this.ck, this.cl, this.cm, this.cn, this.co, this.cp, this.cq};
      this.c(this.et());
      this.Q = true;
      this.ae = true;
      if ($$1 instanceof agg) {
         this.cr = ((agg)$$1).C();
      } else {
         this.cr = null;
      }

      this.cs = new bqg(this);
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 200.0);
   }

   @Override
   public boolean aL() {
      float $$0 = ami.b(this.bX * (float) (Math.PI * 2));
      float $$1 = ami.b(this.bW * (float) (Math.PI * 2));
      return $$1 <= -0.3F && $$0 >= -0.3F;
   }

   @Override
   public void aK() {
      if (this.s.y && !this.aM()) {
         this.s.a(this.df(), this.dh(), this.dl(), ajw.fx, this.cR(), 5.0F, 0.8F + this.R.i() * 0.3F, false);
      }

   }

   @Override
   protected void a_() {
      super.a_();
      this.ai().a(b, bqf.k.b());
   }

   public double[] a(int $$0, float $$1) {
      if (this.eg()) {
         $$1 = 0.0F;
      }

      $$1 = 1.0F - $$1;
      int $$2 = this.d - $$0 & 63;
      int $$3 = this.d - $$0 - 1 & 63;
      double[] $$4 = new double[3];
      double $$5 = this.c[$$2][0];
      double $$6 = ami.f(this.c[$$3][0] - $$5);
      $$4[0] = $$5 + $$6 * (double)$$1;
      $$5 = this.c[$$2][1];
      $$6 = this.c[$$3][1] - $$5;
      $$4[1] = $$5 + $$6 * (double)$$1;
      $$4[2] = ami.d((double)$$1, this.c[$$2][2], this.c[$$3][2]);
      return $$4;
   }

   @Override
   public void w_() {
      this.az();
      if (this.s.y) {
         this.c(this.ef());
         if (!this.aM() && !this.cs.a().a() && --this.ct < 0) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.fy, this.cR(), 2.5F, 0.8F + this.R.i() * 0.3F, false);
            this.ct = 200 + this.R.a(200);
         }
      }

      this.bW = this.bX;
      if (this.eg()) {
         float $$0 = (this.R.i() - 0.5F) * 8.0F;
         float $$1 = (this.R.i() - 0.5F) * 4.0F;
         float $$2 = (this.R.i() - 0.5F) * 8.0F;
         this.s.a(io.x, this.df() + (double)$$0, this.dh() + 2.0 + (double)$$1, this.dl() + (double)$$2, 0.0, 0.0, 0.0);
      } else {
         this.fJ();
         dwq $$3 = this.dd();
         float $$4 = 0.2F / ((float)$$3.h() * 10.0F + 1.0F);
         $$4 *= (float)Math.pow(2.0, $$3.d);
         if (this.cs.a().a()) {
            this.bX += 0.1F;
         } else if (this.bY) {
            this.bX += $$4 * 0.5F;
         } else {
            this.bX += $$4;
         }

         this.o(ami.g(this.dq()));
         if (this.fA()) {
            this.bX = 0.5F;
         } else {
            if (this.d < 0) {
               for(int $$5 = 0; $$5 < this.c.length; ++$$5) {
                  this.c[$$5][0] = (double)this.dq();
                  this.c[$$5][1] = this.dh();
               }
            }

            if (++this.d == this.c.length) {
               this.d = 0;
            }

            this.c[this.d][0] = (double)this.dq();
            this.c[this.d][1] = this.dh();
            if (this.s.y) {
               if (this.br > 0) {
                  double $$6 = this.df() + (this.bs - this.df()) / (double)this.br;
                  double $$7 = this.dh() + (this.bt - this.dh()) / (double)this.br;
                  double $$8 = this.dl() + (this.bu - this.dl()) / (double)this.br;
                  double $$9 = ami.f(this.bv - (double)this.dq());
                  this.o(this.dq() + (float)$$9 / (float)this.br);
                  this.p(this.ds() + (float)(this.bw - (double)this.ds()) / (float)this.br);
                  --this.br;
                  this.e($$6, $$7, $$8);
                  this.a(this.dq(), this.ds());
               }

               this.cs.a().b();
            } else {
               bpz $$10 = this.cs.a();
               $$10.c();
               if (this.cs.a() != $$10) {
                  $$10 = this.cs.a();
                  $$10.c();
               }

               dwq $$11 = $$10.g();
               if ($$11 != null) {
                  double $$12 = $$11.c - this.df();
                  double $$13 = $$11.d - this.dh();
                  double $$14 = $$11.e - this.dl();
                  double $$15 = $$12 * $$12 + $$13 * $$13 + $$14 * $$14;
                  float $$16 = $$10.f();
                  double $$17 = Math.sqrt($$12 * $$12 + $$14 * $$14);
                  if ($$17 > 0.0) {
                     $$13 = ami.a($$13 / $$17, (double)(-$$16), (double)$$16);
                  }

                  this.f(this.dd().b(0.0, $$13 * 0.01, 0.0));
                  this.o(ami.g(this.dq()));
                  dwq $$18 = $$11.a(this.df(), this.dh(), this.dl()).d();
                  dwq $$19 = new dwq(
                        (double)ami.a(this.dq() * (float) (Math.PI / 180.0)), this.dd().d, (double)(-ami.b(this.dq() * (float) (Math.PI / 180.0)))
                     )
                     .d();
                  float $$20 = Math.max(((float)$$19.b($$18) + 0.5F) / 1.5F, 0.0F);
                  if (Math.abs($$12) > 1.0E-5F || Math.abs($$14) > 1.0E-5F) {
                     float $$21 = ami.a(ami.g(180.0F - (float)ami.d($$12, $$14) * 180.0F / (float)Math.PI - this.dq()), -50.0F, 50.0F);
                     this.ca *= 0.8F;
                     this.ca += $$21 * $$10.h();
                     this.o(this.dq() + this.ca * 0.1F);
                  }

                  float $$22 = (float)(2.0 / ($$15 + 1.0));
                  float $$23 = 0.06F;
                  this.a(0.06F * ($$20 * $$22 + (1.0F - $$22)), new dwq(0.0, 0.0, -1.0));
                  if (this.bY) {
                     this.a(bci.a, this.dd().a(0.8F));
                  } else {
                     this.a(bci.a, this.dd());
                  }

                  dwq $$24 = this.dd().d();
                  double $$25 = 0.8 + 0.15 * ($$24.b($$19) + 1.0) / 2.0;
                  this.f(this.dd().d($$25, 0.91F, $$25));
               }
            }

            this.aX = this.dq();
            dwq[] $$26 = new dwq[this.cj.length];

            for(int $$27 = 0; $$27 < this.cj.length; ++$$27) {
               $$26[$$27] = new dwq(this.cj[$$27].df(), this.cj[$$27].dh(), this.cj[$$27].dl());
            }

            float $$28 = (float)(this.a(5, 1.0F)[1] - this.a(10, 1.0F)[1]) * 10.0F * (float) (Math.PI / 180.0);
            float $$29 = ami.b($$28);
            float $$30 = ami.a($$28);
            float $$31 = this.dq() * (float) (Math.PI / 180.0);
            float $$32 = ami.a($$31);
            float $$33 = ami.b($$31);
            this.a(this.cl, (double)($$32 * 0.5F), 0.0, (double)(-$$33 * 0.5F));
            this.a(this.cp, (double)($$33 * 4.5F), 2.0, (double)($$32 * 4.5F));
            this.a(this.cq, (double)($$33 * -4.5F), 2.0, (double)($$32 * -4.5F));
            if (!this.s.y && this.aK == 0) {
               this.a(this.s.a(this, this.cp.cy().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bbq.e));
               this.a(this.s.a(this, this.cq.cy().c(4.0, 2.0, 4.0).d(0.0, -2.0, 0.0), bbq.e));
               this.b(this.s.a(this, this.e.cy().g(1.0), bbq.e));
               this.b(this.s.a(this, this.ck.cy().g(1.0), bbq.e));
            }

            float $$34 = ami.a(this.dq() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$35 = ami.b(this.dq() * (float) (Math.PI / 180.0) - this.ca * 0.01F);
            float $$36 = this.fI();
            this.a(this.e, (double)($$34 * 6.5F * $$29), (double)($$36 + $$30 * 6.5F), (double)(-$$35 * 6.5F * $$29));
            this.a(this.ck, (double)($$34 * 5.5F * $$29), (double)($$36 + $$30 * 5.5F), (double)(-$$35 * 5.5F * $$29));
            double[] $$37 = this.a(5, 1.0F);

            for(int $$38 = 0; $$38 < 3; ++$$38) {
               bpn $$39 = null;
               if ($$38 == 0) {
                  $$39 = this.cm;
               }

               if ($$38 == 1) {
                  $$39 = this.cn;
               }

               if ($$38 == 2) {
                  $$39 = this.co;
               }

               double[] $$40 = this.a(12 + $$38 * 2, 1.0F);
               float $$41 = this.dq() * (float) (Math.PI / 180.0) + this.i($$40[0] - $$37[0]) * (float) (Math.PI / 180.0);
               float $$42 = ami.a($$41);
               float $$43 = ami.b($$41);
               float $$44 = 1.5F;
               float $$45 = (float)($$38 + 1) * 2.0F;
               this.a(
                  $$39,
                  (double)(-($$32 * 1.5F + $$42 * $$45) * $$29),
                  $$40[1] - $$37[1] - (double)(($$45 + 1.5F) * $$30) + 1.5,
                  (double)(($$33 * 1.5F + $$43 * $$45) * $$29)
               );
            }

            if (!this.s.y) {
               this.bY = this.b(this.e.cy()) | this.b(this.ck.cy()) | this.b(this.cl.cy());
               if (this.cr != null) {
                  this.cr.b(this);
               }
            }

            for(int $$46 = 0; $$46 < this.cj.length; ++$$46) {
               this.cj[$$46].t = $$26[$$46].c;
               this.cj[$$46].u = $$26[$$46].d;
               this.cj[$$46].v = $$26[$$46].e;
               this.cj[$$46].M = $$26[$$46].c;
               this.cj[$$46].N = $$26[$$46].d;
               this.cj[$$46].O = $$26[$$46].e;
            }

         }
      }
   }

   private void a(bpn $$0, double $$1, double $$2, double $$3) {
      $$0.e(this.df() + $$1, this.dh() + $$2, this.dl() + $$3);
   }

   private float fI() {
      if (this.cs.a().a()) {
         return -1.0F;
      } else {
         double[] $$0 = this.a(5, 1.0F);
         double[] $$1 = this.a(0, 1.0F);
         return (float)($$0[1] - $$1[1]);
      }
   }

   private void fJ() {
      if (this.cb != null) {
         if (this.cb.dt()) {
            this.cb = null;
         } else if (this.S % 10 == 0 && this.ef() < this.et()) {
            this.c(this.ef() + 1.0F);
         }
      }

      if (this.R.a(10) == 0) {
         List<bpo> $$0 = this.s.a(bpo.class, this.cy().g(32.0));
         bpo $$1 = null;
         double $$2 = Double.MAX_VALUE;

         for(bpo $$3 : $$0) {
            double $$4 = $$3.f(this);
            if ($$4 < $$2) {
               $$2 = $$4;
               $$1 = $$3;
            }
         }

         this.cb = $$1;
      }

   }

   private void a(List<bbn> $$0) {
      double $$1 = (this.cl.cy().a + this.cl.cy().d) / 2.0;
      double $$2 = (this.cl.cy().c + this.cl.cy().f) / 2.0;

      for(bbn $$3 : $$0) {
         if ($$3 instanceof bcc) {
            double $$4 = $$3.df() - $$1;
            double $$5 = $$3.dl() - $$2;
            double $$6 = Math.max($$4 * $$4 + $$5 * $$5, 0.1);
            $$3.i($$4 / $$6 * 4.0, 0.2F, $$5 / $$6 * 4.0);
            if (!this.cs.a().a() && ((bcc)$$3).dS() < $$3.S - 2) {
               $$3.a(baw.c(this), 5.0F);
               this.a(this, $$3);
            }
         }
      }

   }

   private void b(List<bbn> $$0) {
      for(bbn $$1 : $$0) {
         if ($$1 instanceof bcc) {
            $$1.a(baw.c(this), 10.0F);
            this.a(this, $$1);
         }
      }

   }

   private float i(double $$0) {
      return (float)ami.f($$0);
   }

   private boolean b(dwl $$0) {
      int $$1 = ami.b($$0.a);
      int $$2 = ami.b($$0.b);
      int $$3 = ami.b($$0.c);
      int $$4 = ami.b($$0.d);
      int $$5 = ami.b($$0.e);
      int $$6 = ami.b($$0.f);
      boolean $$7 = false;
      boolean $$8 = false;

      for(int $$9 = $$1; $$9 <= $$4; ++$$9) {
         for(int $$10 = $$2; $$10 <= $$5; ++$$10) {
            for(int $$11 = $$3; $$11 <= $$6; ++$$11) {
               gt $$12 = new gt($$9, $$10, $$11);
               cvo $$13 = this.s.a_($$12);
               if (!$$13.h() && !$$13.a(akl.au)) {
                  if (this.s.W().b(cgt.c) && !$$13.a(akl.at)) {
                     $$8 = this.s.a($$12, false) || $$8;
                  } else {
                     $$7 = true;
                  }
               }
            }
         }
      }

      if ($$8) {
         gt $$14 = new gt($$1 + this.R.a($$4 - $$1 + 1), $$2 + this.R.a($$5 - $$2 + 1), $$3 + this.R.a($$6 - $$3 + 1));
         this.s.c(2008, $$14, 0);
      }

      return $$7;
   }

   public boolean a(bpn $$0, baw $$1, float $$2) {
      if (this.cs.a().i() == bqf.j) {
         return false;
      } else {
         $$2 = this.cs.a().a($$1, $$2);
         if ($$0 != this.e) {
            $$2 = $$2 / 4.0F + Math.min($$2, 1.0F);
         }

         if ($$2 < 0.01F) {
            return false;
         } else {
            if ($$1.m() instanceof buc || $$1.d()) {
               float $$3 = this.ef();
               this.g($$1, $$2);
               if (this.eg() && !this.cs.a().a()) {
                  this.c(1.0F);
                  this.cs.a(bqf.j);
               }

               if (this.cs.a().a()) {
                  this.cu = this.cu + $$3 - this.ef();
                  if (this.cu > 0.25F * this.et()) {
                     this.cu = 0.0F;
                     this.cs.a(bqf.e);
                  }
               }
            }

            return true;
         }
      }
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      return !this.s.y ? this.a(this.cl, $$0, $$1) : false;
   }

   protected boolean g(baw $$0, float $$1) {
      return super.a($$0, $$1);
   }

   @Override
   public void ag() {
      this.a(bbn.c.a);
      this.a(czv.q);
      if (this.cr != null) {
         this.cr.b(this);
         this.cr.a(this);
      }

   }

   @Override
   protected void dL() {
      if (this.cr != null) {
         this.cr.b(this);
      }

      ++this.bZ;
      if (this.bZ >= 180 && this.bZ <= 200) {
         float $$0 = (this.R.i() - 0.5F) * 8.0F;
         float $$1 = (this.R.i() - 0.5F) * 4.0F;
         float $$2 = (this.R.i() - 0.5F) * 8.0F;
         this.s.a(io.w, this.df() + (double)$$0, this.dh() + 2.0 + (double)$$1, this.dl() + (double)$$2, 0.0, 0.0, 0.0);
      }

      boolean $$3 = this.s.W().b(cgt.f);
      int $$4 = 500;
      if (this.cr != null && !this.cr.d()) {
         $$4 = 12000;
      }

      if (this.s instanceof agg) {
         if (this.bZ > 150 && this.bZ % 5 == 0 && $$3) {
            bbt.a((agg)this.s, this.cY(), ami.d((float)$$4 * 0.08F));
         }

         if (this.bZ == 1 && !this.aM()) {
            this.s.b(1028, this.da(), 0);
         }
      }

      this.a(bci.a, new dwq(0.0, 0.1F, 0.0));
      this.o(this.dq() + 20.0F);
      this.aX = this.dq();
      if (this.bZ == 200 && this.s instanceof agg) {
         if ($$3) {
            bbt.a((agg)this.s, this.cY(), ami.d((float)$$4 * 0.2F));
         }

         if (this.cr != null) {
            this.cr.a(this);
         }

         this.a(bbn.c.a);
         this.a(czv.q);
      }

   }

   public int q() {
      if (this.cv[0] == null) {
         for(int $$0 = 0; $$0 < 24; ++$$0) {
            int $$1 = 5;
            int $$3;
            int $$4;
            if ($$0 < 12) {
               $$3 = ami.d(60.0F * ami.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
               $$4 = ami.d(60.0F * ami.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 12) * (float)$$0)));
            } else if ($$0 < 20) {
               int $$2 = $$0 - 12;
               $$3 = ami.d(40.0F * ami.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$4 = ami.d(40.0F * ami.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 8) * (float)$$2)));
               $$1 += 10;
            } else {
               int var7 = $$0 - 20;
               $$3 = ami.d(20.0F * ami.b(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
               $$4 = ami.d(20.0F * ami.a(2.0F * ((float) -Math.PI + (float) (Math.PI / 4) * (float)var7)));
            }

            int $$9 = Math.max(this.s.m_() + 10, this.s.a(dar.a.f, new gt($$3, 0, $$4)).v() + $$1);
            this.cv[$$0] = new dqj($$3, $$9, $$4);
         }

         this.cw[0] = 6146;
         this.cw[1] = 8197;
         this.cw[2] = 8202;
         this.cw[3] = 16404;
         this.cw[4] = 32808;
         this.cw[5] = 32848;
         this.cw[6] = 65696;
         this.cw[7] = 131392;
         this.cw[8] = 131712;
         this.cw[9] = 263424;
         this.cw[10] = 526848;
         this.cw[11] = 525313;
         this.cw[12] = 1581057;
         this.cw[13] = 3166214;
         this.cw[14] = 2138120;
         this.cw[15] = 6373424;
         this.cw[16] = 4358208;
         this.cw[17] = 12910976;
         this.cw[18] = 9044480;
         this.cw[19] = 9706496;
         this.cw[20] = 15216640;
         this.cw[21] = 13688832;
         this.cw[22] = 11763712;
         this.cw[23] = 8257536;
      }

      return this.q(this.df(), this.dh(), this.dl());
   }

   public int q(double $$0, double $$1, double $$2) {
      float $$3 = 10000.0F;
      int $$4 = 0;
      dqj $$5 = new dqj(ami.b($$0), ami.b($$1), ami.b($$2));
      int $$6 = 0;
      if (this.cr == null || this.cr.c() == 0) {
         $$6 = 12;
      }

      for(int $$7 = $$6; $$7 < 24; ++$$7) {
         if (this.cv[$$7] != null) {
            float $$8 = this.cv[$$7].c($$5);
            if ($$8 < $$3) {
               $$3 = $$8;
               $$4 = $$7;
            }
         }
      }

      return $$4;
   }

   @Nullable
   public dql a(int $$0, int $$1, @Nullable dqj $$2) {
      for(int $$3 = 0; $$3 < 24; ++$$3) {
         dqj $$4 = this.cv[$$3];
         $$4.i = false;
         $$4.g = 0.0F;
         $$4.e = 0.0F;
         $$4.f = 0.0F;
         $$4.h = null;
         $$4.d = -1;
      }

      dqj $$5 = this.cv[$$0];
      dqj $$6 = this.cv[$$1];
      $$5.e = 0.0F;
      $$5.f = $$5.a($$6);
      $$5.g = $$5.f;
      this.cx.a();
      this.cx.a($$5);
      dqj $$7 = $$5;
      int $$8 = 0;
      if (this.cr == null || this.cr.c() == 0) {
         $$8 = 12;
      }

      while(!this.cx.e()) {
         dqj $$9 = this.cx.c();
         if ($$9.equals($$6)) {
            if ($$2 != null) {
               $$2.h = $$6;
               $$6 = $$2;
            }

            return this.a($$5, $$6);
         }

         if ($$9.a($$6) < $$7.a($$6)) {
            $$7 = $$9;
         }

         $$9.i = true;
         int $$10 = 0;

         for(int $$11 = 0; $$11 < 24; ++$$11) {
            if (this.cv[$$11] == $$9) {
               $$10 = $$11;
               break;
            }
         }

         for(int $$12 = $$8; $$12 < 24; ++$$12) {
            if ((this.cw[$$10] & 1 << $$12) > 0) {
               dqj $$13 = this.cv[$$12];
               if (!$$13.i) {
                  float $$14 = $$9.e + $$9.a($$13);
                  if (!$$13.c() || $$14 < $$13.e) {
                     $$13.h = $$9;
                     $$13.e = $$14;
                     $$13.f = $$13.a($$6);
                     if ($$13.c()) {
                        this.cx.a($$13, $$13.e + $$13.f);
                     } else {
                        $$13.g = $$13.e + $$13.f;
                        this.cx.a($$13);
                     }
                  }
               }
            }
         }
      }

      if ($$7 == $$5) {
         return null;
      } else {
         cc.debug("Failed to find path from {} to {}", $$0, $$1);
         if ($$2 != null) {
            $$2.h = $$7;
            $$7 = $$2;
         }

         return this.a($$5, $$7);
      }
   }

   private dql a(dqj $$0, dqj $$1) {
      List<dqj> $$2 = Lists.newArrayList();
      dqj $$3 = $$1;
      $$2.add(0, $$1);

      while($$3.h != null) {
         $$3 = $$3.h;
         $$2.add(0, $$3);
      }

      return new dql($$2, new gt($$1.a, $$1.b, $$1.c), true);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("DragonPhase", this.cs.a().i().b());
      $$0.a("DragonDeathTime", this.bZ);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("DragonPhase")) {
         this.cs.a(bqf.a($$0.h("DragonPhase")));
      }

      if ($$0.e("DragonDeathTime")) {
         this.bZ = $$0.h("DragonDeathTime");
      }

   }

   @Override
   public void dm() {
   }

   public bpn[] t() {
      return this.cj;
   }

   @Override
   public boolean bk() {
      return false;
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected ajv r() {
      return ajw.fu;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.fz;
   }

   @Override
   protected float eC() {
      return 5.0F;
   }

   public float a(int $$0, double[] $$1, double[] $$2) {
      bpz $$3 = this.cs.a();
      bqf<? extends bpz> $$4 = $$3.i();
      double $$7;
      if ($$4 == bqf.d || $$4 == bqf.e) {
         gt $$5 = this.s.a(dar.a.f, dds.e);
         double $$6 = Math.max(Math.sqrt($$5.b(this.cY())) / 4.0, 1.0);
         $$7 = (double)$$0 / $$6;
      } else if ($$3.a()) {
         $$7 = (double)$$0;
      } else if ($$0 == 6) {
         $$7 = 0.0;
      } else {
         $$7 = $$2[1] - $$1[1];
      }

      return (float)$$7;
   }

   public dwq x(float $$0) {
      bpz $$1 = this.cs.a();
      bqf<? extends bpz> $$2 = $$1.i();
      dwq $$8;
      if ($$2 == bqf.d || $$2 == bqf.e) {
         gt $$3 = this.s.a(dar.a.f, dds.e);
         float $$4 = Math.max((float)Math.sqrt($$3.b(this.cY())) / 4.0F, 1.0F);
         float $$5 = 6.0F / $$4;
         float $$6 = this.ds();
         float $$7 = 1.5F;
         this.p(-$$5 * 1.5F * 5.0F);
         $$8 = this.e($$0);
         this.p($$6);
      } else if ($$1.a()) {
         float $$9 = this.ds();
         float $$10 = 1.5F;
         this.p(-45.0F);
         $$8 = this.e($$0);
         this.p($$9);
      } else {
         $$8 = this.e($$0);
      }

      return $$8;
   }

   public void a(bpo $$0, gt $$1, baw $$2) {
      buc $$3;
      if ($$2.m() instanceof buc) {
         $$3 = (buc)$$2.m();
      } else {
         $$3 = this.s.a(cd, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
      }

      if ($$0 == this.cb) {
         this.a(this.e, baw.d($$3), 10.0F);
      }

      this.cs.a().a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aaj<?> $$0) {
      if (b.equals($$0) && this.s.y) {
         this.cs.a(bqf.a(this.ai().a(b)));
      }

      super.a($$0);
   }

   public bqg fG() {
      return this.cs;
   }

   @Nullable
   public cyx fH() {
      return this.cr;
   }

   @Override
   public boolean b(bbg $$0, @Nullable bbn $$1) {
      return false;
   }

   @Override
   protected boolean l(bbn $$0) {
      return false;
   }

   @Override
   public boolean ck() {
      return false;
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      bpn[] $$1 = this.t();

      for(int $$2 = 0; $$2 < $$1.length; ++$$2) {
         $$1[$$2].e($$2 + $$0.b());
      }

   }

   @Override
   public boolean c(bcc $$0) {
      return $$0.dY();
   }
}
