import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class bbn implements ban, czc, dq {
   private static final Logger b = LogUtils.getLogger();
   public static final String g = "id";
   public static final String h = "Passengers";
   private static final AtomicInteger c = new AtomicInteger();
   private static final List<cax> d = Collections.emptyList();
   public static final int i = 60;
   public static final int j = 300;
   public static final int k = 1024;
   public static final double l = 0.5000001;
   public static final float m = 0.11111111F;
   public static final int n = 140;
   public static final int o = 40;
   private static final dwl e = new dwl(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double ao = 0.014;
   private static final double ap = 0.007;
   private static final double aq = 0.0023333333333333335;
   public static final String p = "UUID";
   private static double ar = 1.0;
   private final bbr<?> as;
   private int at = c.incrementAndGet();
   public boolean q;
   private ImmutableList<bbn> au = ImmutableList.of();
   protected int r;
   @Nullable
   private bbn av;
   public cgx s;
   public double t;
   public double u;
   public double v;
   private dwq aw;
   private gt ax;
   private cge ay;
   private dwq az = dwq.b;
   private float aA;
   private float aB;
   public float w;
   public float x;
   private dwl aC = e;
   protected boolean y;
   public boolean z;
   public boolean A;
   public boolean B;
   public boolean C;
   public boolean D;
   protected dwq E = dwq.b;
   @Nullable
   private bbn.c aD;
   public static final float F = 0.6F;
   public static final float G = 1.8F;
   public float H;
   public float I;
   public float J;
   public float K;
   public float L;
   private float aE = 1.0F;
   public double M;
   public double N;
   public double O;
   public float P;
   public boolean Q;
   protected final amn R = amn.a();
   public int S;
   private int aF = -this.cS();
   protected boolean T;
   protected Object2DoubleMap<akz<dpu>> U = new Object2DoubleArrayMap(2);
   protected boolean V;
   private final Set<akz<dpu>> aG = new HashSet();
   public int W;
   protected boolean X = true;
   protected final aam Y;
   protected static final aaj<Byte> Z = aam.a(bbn.class, aal.a);
   protected static final int aa = 0;
   private static final int aH = 1;
   private static final int aI = 3;
   private static final int aJ = 4;
   private static final int aK = 5;
   protected static final int ab = 6;
   protected static final int ac = 7;
   private static final aaj<Integer> aL = aam.a(bbn.class, aal.b);
   private static final aaj<Optional<rq>> aM = aam.a(bbn.class, aal.f);
   private static final aaj<Boolean> aN = aam.a(bbn.class, aal.i);
   private static final aaj<Boolean> aO = aam.a(bbn.class, aal.i);
   private static final aaj<Boolean> aP = aam.a(bbn.class, aal.i);
   protected static final aaj<bco> ad = aam.a(bbn.class, aal.t);
   private static final aaj<Integer> aQ = aam.a(bbn.class, aal.b);
   private czd aR = czd.a;
   private final zk aS = new zk();
   public boolean ae;
   public boolean af;
   private int aT;
   protected boolean ag;
   protected int ah;
   protected gt ai;
   private boolean aU;
   protected UUID aj = ami.a(this.R);
   protected String ak = this.aj.toString();
   private boolean aV;
   private final Set<String> aW = Sets.newHashSet();
   private final double[] aX = new double[]{0.0, 0.0, 0.0};
   private long aY;
   private bbo aZ;
   private float ba;
   public boolean al;
   public boolean am;
   public boolean an;
   private float bb;
   private int bc;
   private boolean bd;
   @Nullable
   private cvo be = null;

   public bbn(bbr<?> $$0, cgx $$1) {
      this.as = $$0;
      this.s = $$1;
      this.aZ = $$0.m();
      this.aw = dwq.b;
      this.ax = gt.b;
      this.ay = cge.b;
      this.Y = new aam(this);
      this.Y.a(Z, (byte)0);
      this.Y.a(aL, this.bZ());
      this.Y.a(aN, false);
      this.Y.a(aM, Optional.empty());
      this.Y.a(aO, false);
      this.Y.a(aP, false);
      this.Y.a(ad, bco.a);
      this.Y.a(aQ, 0);
      this.a_();
      this.e(0.0, 0.0, 0.0);
      this.ba = this.a(bco.a, this.aZ);
   }

   public boolean a(gt $$0, cvo $$1) {
      dxj $$2 = $$1.b(this.s, $$0, dwv.a(this));
      dxj $$3 = $$2.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w());
      return dxg.c($$3, dxg.a(this.cy()), dwu.i);
   }

   public int aa() {
      dxq $$0 = this.bY();
      return $$0 != null && $$0.n().f() != null ? $$0.n().f() : 16777215;
   }

   public boolean B_() {
      return false;
   }

   public final void ab() {
      if (this.bJ()) {
         this.bv();
      }

      if (this.bI()) {
         this.p();
      }

   }

   public void d(double $$0, double $$1, double $$2) {
      this.aS.e(new dwq($$0, $$1, $$2));
   }

   public zk ac() {
      return this.aS;
   }

   public bbr<?> ad() {
      return this.as;
   }

   @Override
   public int ae() {
      return this.at;
   }

   public void e(int $$0) {
      this.at = $$0;
   }

   public Set<String> af() {
      return this.aW;
   }

   public boolean a(String $$0) {
      return this.aW.size() >= 1024 ? false : this.aW.add($$0);
   }

   public boolean b(String $$0) {
      return this.aW.remove($$0);
   }

   public void ag() {
      this.a(bbn.c.a);
      this.a(czv.q);
   }

   public final void ah() {
      this.a(bbn.c.b);
   }

   protected abstract void a_();

   public aam ai() {
      return this.Y;
   }

   public boolean equals(Object $$0) {
      if ($$0 instanceof bbn) {
         return ((bbn)$$0).at == this.at;
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.at;
   }

   public void a(bbn.c $$0) {
      this.b($$0);
   }

   public void aj() {
   }

   public void b(bco $$0) {
      this.Y.b(ad, $$0);
   }

   public bco ak() {
      return this.Y.a(ad);
   }

   public boolean c(bco $$0) {
      return this.ak() == $$0;
   }

   public boolean a(bbn $$0, double $$1) {
      return this.cY().a((hj)$$0.cY(), $$1);
   }

   public boolean a(bbn $$0, double $$1, double $$2) {
      double $$3 = $$0.df() - this.df();
      double $$4 = $$0.dh() - this.dh();
      double $$5 = $$0.dl() - this.dl();
      return ami.e($$3, $$5) < ami.m($$1) && ami.m($$4) < ami.m($$2);
   }

   protected void a(float $$0, float $$1) {
      this.o($$0 % 360.0F);
      this.p($$1 % 360.0F);
   }

   public final void a_(dwq $$0) {
      this.e($$0.a(), $$0.b(), $$0.c());
   }

   public void e(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      this.a(this.al());
   }

   protected dwl al() {
      return this.aZ.a(this.aw);
   }

   protected void am() {
      this.e(this.aw.c, this.aw.d, this.aw.e);
   }

   public void a(double $$0, double $$1) {
      float $$2 = (float)$$1 * 0.15F;
      float $$3 = (float)$$0 * 0.15F;
      this.p(this.ds() + $$2);
      this.o(this.dq() + $$3);
      this.p(ami.a(this.ds(), -90.0F, 90.0F));
      this.x += $$2;
      this.w += $$3;
      this.x = ami.a(this.x, -90.0F, 90.0F);
      if (this.av != null) {
         this.av.j(this);
      }

   }

   public void k() {
      this.an();
   }

   public void an() {
      this.s.ac().a("entityBaseTick");
      this.be = null;
      if (this.bI() && this.cQ().dt()) {
         this.p();
      }

      if (this.r > 0) {
         --this.r;
      }

      this.H = this.I;
      this.x = this.ds();
      this.w = this.dq();
      this.bB();
      if (this.bd()) {
         this.be();
      }

      this.am = this.al;
      this.al = false;
      this.aY();
      this.n();
      this.aX();
      if (this.s.y) {
         this.au();
      } else if (this.aF > 0) {
         if (this.aQ()) {
            this.g(this.aF - 4);
            if (this.aF < 0) {
               this.au();
            }
         } else {
            if (this.aF % 20 == 0 && !this.bf()) {
               this.a(baw.c, 1.0F);
            }

            this.g(this.aF - 1);
         }

         if (this.cb() > 0) {
            this.j(0);
            this.s.a(null, 1009, this.ax, 1);
         }
      }

      if (this.bf()) {
         this.as();
         this.L *= 0.5F;
      }

      this.ao();
      if (!this.s.y) {
         this.a_(this.aF > 0);
      }

      this.X = false;
      this.s.ac().c();
   }

   public void a_(boolean $$0) {
      this.b(0, $$0 || this.bd);
   }

   public void ao() {
      if (this.dh() < (double)(this.s.u_() - 64)) {
         this.av();
      }

   }

   public void ap() {
      this.aT = this.bC();
   }

   public boolean aq() {
      return this.aT > 0;
   }

   protected void H() {
      if (this.aq()) {
         --this.aT;
      }

   }

   public int ar() {
      return 0;
   }

   public void as() {
      if (!this.aQ()) {
         this.f(15);
         if (this.a(baw.d, 4.0F)) {
            this.a(ajw.hk, 0.4F, 2.0F + this.R.i() * 0.4F);
         }

      }
   }

   public void f(int $$0) {
      int $$1 = $$0 * 20;
      if (this instanceof bcc) {
         $$1 = cfe.a((bcc)this, $$1);
      }

      if (this.aF < $$1) {
         this.g($$1);
      }

   }

   public void g(int $$0) {
      this.aF = $$0;
   }

   public int at() {
      return this.aF;
   }

   public void au() {
      this.g(0);
   }

   protected void av() {
      this.ah();
   }

   public boolean f(double $$0, double $$1, double $$2) {
      return this.b(this.cy().d($$0, $$1, $$2));
   }

   private boolean b(dwl $$0) {
      return this.s.a(this, $$0) && !this.s.d($$0);
   }

   public void c(boolean $$0) {
      this.y = $$0;
   }

   public boolean aw() {
      return this.y;
   }

   public void a(bci $$0, dwq $$1) {
      if (this.Q) {
         this.e(this.df() + $$1.c, this.dh() + $$1.d, this.dl() + $$1.e);
      } else {
         this.an = this.bH();
         if ($$0 == bci.c) {
            $$1 = this.c($$1);
            if ($$1.equals(dwq.b)) {
               return;
            }
         }

         this.s.ac().a("move");
         if (this.E.g() > 1.0E-7) {
            $$1 = $$1.h(this.E);
            this.E = dwq.b;
            this.f(dwq.b);
         }

         $$1 = this.a($$1, $$0);
         dwq $$2 = this.g($$1);
         double $$3 = $$2.g();
         if ($$3 > 1.0E-7) {
            if (this.L != 0.0F && $$3 >= 1.0) {
               dwm $$4 = this.s.a(new cgg(this.cY(), this.cY().e($$2), cgg.a.d, cgg.b.d, this));
               if ($$4.c() != dwo.a.a) {
                  this.m();
               }
            }

            this.e(this.df() + $$2.c, this.dh() + $$2.d, this.dl() + $$2.e);
         }

         this.s.ac().c();
         this.s.ac().a("rest");
         boolean $$5 = !ami.b($$1.c, $$2.c);
         boolean $$6 = !ami.b($$1.e, $$2.e);
         this.z = $$5 || $$6;
         this.A = $$1.d != $$2.d;
         this.B = this.A && $$1.d < 0.0;
         if (this.z) {
            this.C = this.b($$2);
         } else {
            this.C = false;
         }

         this.y = this.A && $$1.d < 0.0;
         gt $$7 = this.aA();
         cvo $$8 = this.s.a_($$7);
         this.a($$2.d, this.y, $$8, $$7);
         if (this.dt()) {
            this.s.ac().c();
         } else {
            if (this.z) {
               dwq $$9 = this.dd();
               this.n($$5 ? 0.0 : $$9.c, $$9.d, $$6 ? 0.0 : $$9.e);
            }

            cjt $$10 = $$8.b();
            if ($$1.d != $$2.d) {
               $$10.a(this.s, this);
            }

            if (this.y) {
               $$10.a(this.s, $$7, $$8, this);
            }

            bbn.b $$11 = this.aO();
            if ($$11.a() && !this.bI()) {
               double $$12 = $$2.c;
               double $$13 = $$2.d;
               double $$14 = $$2.e;
               this.K += (float)($$2.f() * 0.6);
               boolean $$15 = $$8.a(akl.aG) || $$8.a(cju.pn);
               if (!$$15) {
                  $$13 = 0.0;
               }

               this.I += (float)$$2.h() * 0.6F;
               this.J += (float)Math.sqrt($$12 * $$12 + $$13 * $$13 + $$14 * $$14) * 0.6F;
               if (this.J > this.aE && !$$8.h()) {
                  this.aE = this.aF();
                  if (this.aR()) {
                     if ($$11.c()) {
                        bbn $$16 = this.bJ() && this.cG() != null ? this.cG() : this;
                        float $$17 = $$16 == this ? 0.35F : 0.4F;
                        dwq $$18 = $$16.dd();
                        float $$19 = Math.min(1.0F, (float)Math.sqrt($$18.c * $$18.c * 0.2F + $$18.d * $$18.d + $$18.e * $$18.e * 0.2F) * $$17);
                        this.d($$19);
                     }

                     if ($$11.b()) {
                        this.a(czv.S);
                     }
                  } else {
                     if ($$11.c()) {
                        this.b($$8);
                        this.b($$7, $$8);
                     }

                     if ($$11.b() && (this.y || $$1.d == 0.0 || this.al || $$15)) {
                        this.s.a(czv.R, this.aw, czv.a.a(this, this.bc()));
                     }
                  }
               } else if ($$8.h()) {
                  this.az();
               }
            }

            this.ax();
            float $$20 = this.aD();
            this.f(this.dd().d((double)$$20, 1.0, (double)$$20));
            if (this.s.c(this.cy().h(1.0E-6)).noneMatch($$0x -> $$0x.a(akl.aB) || $$0x.a(cju.D))) {
               if (this.aF <= 0) {
                  this.g(-this.cS());
               }

               if (this.an && (this.al || this.aT())) {
                  this.ay();
               }
            }

            if (this.bH() && (this.al || this.aT())) {
               this.g(-this.cS());
            }

            this.s.ac().c();
         }
      }
   }

   protected boolean b(dwq $$0) {
      return false;
   }

   protected void ax() {
      try {
         this.aJ();
      } catch (Throwable var4) {
         q $$1 = q.a(var4, "Checking entity block collision");
         r $$2 = $$1.a("Entity being checked for collision");
         this.a($$2);
         throw new z($$1);
      }
   }

   protected void ay() {
      this.a(ajw.hp, 0.7F, 1.6F + (this.R.i() - this.R.i()) * 0.4F);
   }

   protected void az() {
      if (this.aL()) {
         this.aK();
         if (this.aO().b()) {
            this.a(czv.x);
         }
      }

   }

   @Deprecated
   public gt aA() {
      return this.a(0.2F);
   }

   public gt aB() {
      return this.a(1.0E-5F);
   }

   private gt a(float $$0) {
      int $$1 = ami.b(this.aw.c);
      int $$2 = ami.b(this.aw.d - (double)$$0);
      int $$3 = ami.b(this.aw.e);
      gt $$4 = new gt($$1, $$2, $$3);
      if (this.s.a_($$4).h()) {
         gt $$5 = $$4.c();
         cvo $$6 = this.s.a_($$5);
         if ($$6.a(akl.O) || $$6.a(akl.H) || $$6.b() instanceof cmh) {
            return $$5;
         }
      }

      return $$4;
   }

   protected float aC() {
      float $$0 = this.s.a_(this.da()).b().j();
      float $$1 = this.s.a_(this.aE()).b().j();
      return (double)$$0 == 1.0 ? $$1 : $$0;
   }

   protected float aD() {
      cvo $$0 = this.s.a_(this.da());
      float $$1 = $$0.b().i();
      if (!$$0.a(cju.C) && !$$0.a(cju.lO)) {
         return (double)$$1 == 1.0 ? this.s.a_(this.aE()).b().i() : $$1;
      } else {
         return $$1;
      }
   }

   protected gt aE() {
      return new gt(this.aw.c, this.cy().b - 0.5000001, this.aw.e);
   }

   protected dwq a(dwq $$0, bci $$1) {
      return $$0;
   }

   protected dwq c(dwq $$0) {
      if ($$0.g() <= 1.0E-7) {
         return $$0;
      } else {
         long $$1 = this.s.U();
         if ($$1 != this.aY) {
            Arrays.fill(this.aX, 0.0);
            this.aY = $$1;
         }

         if ($$0.c != 0.0) {
            double $$2 = this.a(gy.a.a, $$0.c);
            return Math.abs($$2) <= 1.0E-5F ? dwq.b : new dwq($$2, 0.0, 0.0);
         } else if ($$0.d != 0.0) {
            double $$3 = this.a(gy.a.b, $$0.d);
            return Math.abs($$3) <= 1.0E-5F ? dwq.b : new dwq(0.0, $$3, 0.0);
         } else if ($$0.e != 0.0) {
            double $$4 = this.a(gy.a.c, $$0.e);
            return Math.abs($$4) <= 1.0E-5F ? dwq.b : new dwq(0.0, 0.0, $$4);
         } else {
            return dwq.b;
         }
      }
   }

   private double a(gy.a $$0, double $$1) {
      int $$2 = $$0.ordinal();
      double $$3 = ami.a($$1 + this.aX[$$2], -0.51, 0.51);
      $$1 = $$3 - this.aX[$$2];
      this.aX[$$2] = $$3;
      return $$1;
   }

   private dwq g(dwq $$0) {
      dwl $$1 = this.cy();
      List<dxj> $$2 = this.s.b(this, $$1.b($$0));
      dwq $$3 = $$0.g() == 0.0 ? $$0 : a(this, $$0, $$1, this.s, $$2);
      boolean $$4 = $$0.c != $$3.c;
      boolean $$5 = $$0.d != $$3.d;
      boolean $$6 = $$0.e != $$3.e;
      boolean $$7 = this.y || $$5 && $$0.d < 0.0;
      if (this.P > 0.0F && $$7 && ($$4 || $$6)) {
         dwq $$8 = a(this, new dwq($$0.c, (double)this.P, $$0.e), $$1, this.s, $$2);
         dwq $$9 = a(this, new dwq(0.0, (double)this.P, 0.0), $$1.b($$0.c, 0.0, $$0.e), this.s, $$2);
         if ($$9.d < (double)this.P) {
            dwq $$10 = a(this, new dwq($$0.c, 0.0, $$0.e), $$1.c($$9), this.s, $$2).e($$9);
            if ($$10.i() > $$8.i()) {
               $$8 = $$10;
            }
         }

         if ($$8.i() > $$3.i()) {
            return $$8.e(a(this, new dwq(0.0, -$$8.d + $$0.d, 0.0), $$1.c($$8), this.s, $$2));
         }
      }

      return $$3;
   }

   public static dwq a(@Nullable bbn $$0, dwq $$1, dwl $$2, cgx $$3, List<dxj> $$4) {
      Builder<dxj> $$5 = ImmutableList.builderWithExpectedSize($$4.size() + 1);
      if (!$$4.isEmpty()) {
         $$5.addAll($$4);
      }

      cxe $$6 = $$3.p_();
      boolean $$7 = $$0 != null && $$6.a($$0, $$2.b($$1));
      if ($$7) {
         $$5.add($$6.c());
      }

      $$5.addAll($$3.d($$0, $$2.b($$1)));
      return a($$1, $$2, $$5.build());
   }

   private static dwq a(dwq $$0, dwl $$1, List<dxj> $$2) {
      if ($$2.isEmpty()) {
         return $$0;
      } else {
         double $$3 = $$0.c;
         double $$4 = $$0.d;
         double $$5 = $$0.e;
         if ($$4 != 0.0) {
            $$4 = dxg.a(gy.a.b, $$1, $$2, $$4);
            if ($$4 != 0.0) {
               $$1 = $$1.d(0.0, $$4, 0.0);
            }
         }

         boolean $$6 = Math.abs($$3) < Math.abs($$5);
         if ($$6 && $$5 != 0.0) {
            $$5 = dxg.a(gy.a.c, $$1, $$2, $$5);
            if ($$5 != 0.0) {
               $$1 = $$1.d(0.0, 0.0, $$5);
            }
         }

         if ($$3 != 0.0) {
            $$3 = dxg.a(gy.a.a, $$1, $$2, $$3);
            if (!$$6 && $$3 != 0.0) {
               $$1 = $$1.d($$3, 0.0, 0.0);
            }
         }

         if (!$$6 && $$5 != 0.0) {
            $$5 = dxg.a(gy.a.c, $$1, $$2, $$5);
         }

         return new dwq($$3, $$4, $$5);
      }
   }

   protected float aF() {
      return (float)((int)this.J + 1);
   }

   protected ajv aG() {
      return ajw.ht;
   }

   protected ajv aH() {
      return ajw.hs;
   }

   protected ajv aI() {
      return ajw.hs;
   }

   protected void aJ() {
      dwl $$0 = this.cy();
      gt $$1 = new gt($$0.a + 0.001, $$0.b + 0.001, $$0.c + 0.001);
      gt $$2 = new gt($$0.d - 0.001, $$0.e - 0.001, $$0.f - 0.001);
      if (this.s.a($$1, $$2)) {
         gt.a $$3 = new gt.a();

         for(int $$4 = $$1.u(); $$4 <= $$2.u(); ++$$4) {
            for(int $$5 = $$1.v(); $$5 <= $$2.v(); ++$$5) {
               for(int $$6 = $$1.w(); $$6 <= $$2.w(); ++$$6) {
                  $$3.d($$4, $$5, $$6);
                  cvo $$7 = this.s.a_($$3);

                  try {
                     $$7.a(this.s, $$3, this);
                     this.a($$7);
                  } catch (Throwable var12) {
                     q $$9 = q.a(var12, "Colliding entity with block");
                     r $$10 = $$9.a("Block being collided with");
                     r.a($$10, this.s, $$3, $$7);
                     throw new z($$9);
                  }
               }
            }
         }
      }

   }

   protected void a(cvo $$0) {
   }

   public void a(czv $$0, @Nullable bbn $$1) {
      this.s.a($$1, $$0, this.aw);
   }

   public void a(czv $$0) {
      this.a($$0, this);
   }

   protected void b(gt $$0, cvo $$1) {
      if (!$$1.d().a()) {
         cvo $$2 = this.s.a_($$0.b());
         cqw $$3 = $$2.a(akl.be) ? $$2.r() : $$1.r();
         this.a($$3.d(), $$3.a() * 0.15F, $$3.b());
      }
   }

   private void b(cvo $$0) {
      if ($$0.a(akl.bd) && this.S >= this.bc + 20) {
         this.bb *= (float)Math.pow(0.997, (double)(this.S - this.bc));
         this.bb = Math.min(1.0F, this.bb + 0.07F);
         float $$1 = 0.5F + this.bb * this.R.i() * 1.2F;
         float $$2 = 0.1F + this.bb * 1.2F;
         this.a(ajw.E, $$2, $$1);
         this.bc = this.S;
      }

   }

   protected void d(float $$0) {
      this.a(this.aG(), $$0, 1.0F + (this.R.i() - this.R.i()) * 0.4F);
   }

   protected void aK() {
   }

   protected boolean aL() {
      return false;
   }

   public void a(ajv $$0, float $$1, float $$2) {
      if (!this.aM()) {
         this.s.a(null, this.df(), this.dh(), this.dl(), $$0, this.cR(), $$1, $$2);
      }

   }

   public void a(ajv $$0) {
      if (!this.aM()) {
         this.a($$0, 1.0F, 1.0F);
      }

   }

   public boolean aM() {
      return this.Y.a(aO);
   }

   public void d(boolean $$0) {
      this.Y.b(aO, $$0);
   }

   public boolean aN() {
      return this.Y.a(aP);
   }

   public void e(boolean $$0) {
      this.Y.b(aP, $$0);
   }

   protected bbn.b aO() {
      return bbn.b.d;
   }

   public boolean aP() {
      return false;
   }

   protected void a(double $$0, boolean $$1, cvo $$2, gt $$3) {
      if ($$1) {
         if (this.L > 0.0F) {
            $$2.b().a(this.s, $$2, $$3, this, this.L);
            this.s.a(czv.A, this.aw, czv.a.a(this, this.bc()));
         }

         this.m();
      } else if ($$0 < 0.0) {
         this.L -= (float)$$0;
      }

   }

   public boolean aQ() {
      return this.ad().d();
   }

   public boolean a(float $$0, float $$1, baw $$2) {
      if (this.bJ()) {
         for(bbn $$3 : this.cI()) {
            $$3.a($$0, $$1, $$2);
         }
      }

      return false;
   }

   public boolean aR() {
      return this.T;
   }

   private boolean j() {
      gt $$0 = this.da();
      return this.s.t($$0) || this.s.t(new gt((double)$$0.u(), this.cy().e, (double)$$0.w()));
   }

   private boolean l() {
      return this.s.a_(this.da()).a(cju.lO);
   }

   public boolean aS() {
      return this.aR() || this.j();
   }

   public boolean aT() {
      return this.aR() || this.j() || this.l();
   }

   public boolean aU() {
      return this.aR() || this.l();
   }

   public boolean aV() {
      return this.V && this.aR();
   }

   public rl aW() {
      return rl.a;
   }

   public void aX() {
      if (this.bS()) {
         this.h(this.bR() && this.aR() && !this.bI());
      } else {
         this.h(this.bR() && this.aV() && !this.bI() && this.s.b_(this.ax).a(akp.a));
      }

   }

   protected boolean aY() {
      this.U.clear();
      this.aZ();
      double $$0 = this.s.q_().i() ? 0.007 : 0.0023333333333333335;
      boolean $$1 = this.a(akp.b, $$0);
      return this.aR() || $$1;
   }

   void aZ() {
      if (this.cQ() instanceof bvv) {
         this.T = false;
      } else if (this.a(akp.a, 0.014)) {
         if (!this.T && !this.X) {
            this.ba();
         }

         this.m();
         this.T = true;
         this.au();
      } else {
         this.T = false;
      }

   }

   private void n() {
      this.V = this.a(akp.a);
      this.aG.clear();
      double $$0 = this.dj() - 0.11111111F;
      bbn $$1 = this.cQ();
      if ($$1 instanceof bvv $$2 && !$$2.aV() && $$2.cy().e >= $$0 && $$2.cy().b <= $$0) {
         return;
      }

      gt $$3 = new gt(this.df(), $$0, this.dl());
      dpv $$4 = this.s.b_($$3);
      double $$5 = (double)((float)$$3.v() + $$4.a((cgd)this.s, $$3));
      if ($$5 > $$0) {
         $$4.k().forEach(this.aG::add);
      }

   }

   protected void ba() {
      bbn $$0 = this.bJ() && this.cG() != null ? this.cG() : this;
      float $$1 = $$0 == this ? 0.2F : 0.9F;
      dwq $$2 = $$0.dd();
      float $$3 = Math.min(1.0F, (float)Math.sqrt($$2.c * $$2.c * 0.2F + $$2.d * $$2.d + $$2.e * $$2.e * 0.2F) * $$1);
      if ($$3 < 0.25F) {
         this.a(this.aH(), $$3, 1.0F + (this.R.i() - this.R.i()) * 0.4F);
      } else {
         this.a(this.aI(), $$3, 1.0F + (this.R.i() - this.R.i()) * 0.4F);
      }

      float $$4 = (float)ami.b(this.dh());

      for(int $$5 = 0; (float)$$5 < 1.0F + this.aZ.a * 20.0F; ++$$5) {
         double $$6 = (this.R.j() * 2.0 - 1.0) * (double)this.aZ.a;
         double $$7 = (this.R.j() * 2.0 - 1.0) * (double)this.aZ.a;
         this.s.a(io.e, this.df() + $$6, (double)($$4 + 1.0F), this.dl() + $$7, $$2.c, $$2.d - this.R.j() * 0.2F, $$2.e);
      }

      for(int $$8 = 0; (float)$$8 < 1.0F + this.aZ.a * 20.0F; ++$$8) {
         double $$9 = (this.R.j() * 2.0 - 1.0) * (double)this.aZ.a;
         double $$10 = (this.R.j() * 2.0 - 1.0) * (double)this.aZ.a;
         this.s.a(io.af, this.df() + $$9, (double)($$4 + 1.0F), this.dl() + $$10, $$2.c, $$2.d, $$2.e);
      }

      this.a(czv.Q);
   }

   @Deprecated
   protected cvo bb() {
      return this.s.a_(this.aA());
   }

   public cvo bc() {
      return this.s.a_(this.aB());
   }

   public boolean bd() {
      return this.bR() && !this.aR() && !this.B_() && !this.bQ() && !this.bf() && this.bo();
   }

   protected void be() {
      int $$0 = ami.b(this.df());
      int $$1 = ami.b(this.dh() - 0.2F);
      int $$2 = ami.b(this.dl());
      gt $$3 = new gt($$0, $$1, $$2);
      cvo $$4 = this.s.a_($$3);
      if ($$4.i() != cpp.a) {
         dwq $$5 = this.dd();
         this.s
            .a(
               new ig(io.c, $$4),
               this.df() + (this.R.j() - 0.5) * (double)this.aZ.a,
               this.dh() + 0.1,
               this.dl() + (this.R.j() - 0.5) * (double)this.aZ.a,
               $$5.c * -4.0,
               1.5,
               $$5.e * -4.0
            );
      }

   }

   public boolean a(akz<dpu> $$0) {
      return this.aG.contains($$0);
   }

   public boolean bf() {
      return !this.X && this.U.getDouble(akp.b) > 0.0;
   }

   public void a(float $$0, dwq $$1) {
      dwq $$2 = a($$1, $$0, this.dq());
      this.f(this.dd().e($$2));
   }

   private static dwq a(dwq $$0, float $$1, float $$2) {
      double $$3 = $$0.g();
      if ($$3 < 1.0E-7) {
         return dwq.b;
      } else {
         dwq $$4 = ($$3 > 1.0 ? $$0.d() : $$0).a((double)$$1);
         float $$5 = ami.a($$2 * (float) (Math.PI / 180.0));
         float $$6 = ami.b($$2 * (float) (Math.PI / 180.0));
         return new dwq($$4.c * (double)$$6 - $$4.e * (double)$$5, $$4.d, $$4.e * (double)$$6 + $$4.c * (double)$$5);
      }
   }

   @Deprecated
   public float bg() {
      return this.s.f(this.de(), this.dk()) ? this.s.A(new gt(this.df(), this.dj(), this.dl())) : 0.0F;
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.g($$0, $$1, $$2);
      this.o($$3 % 360.0F);
      this.p(ami.a($$4, -90.0F, 90.0F) % 360.0F);
      this.w = this.dq();
      this.x = this.ds();
   }

   public void g(double $$0, double $$1, double $$2) {
      double $$3 = ami.a($$0, -3.0E7, 3.0E7);
      double $$4 = ami.a($$2, -3.0E7, 3.0E7);
      this.t = $$3;
      this.u = $$1;
      this.v = $$4;
      this.e($$3, $$1, $$4);
   }

   public void d(dwq $$0) {
      this.c($$0.c, $$0.d, $$0.e);
   }

   public void c(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2, this.dq(), this.ds());
   }

   public void a(gt $$0, float $$1, float $$2) {
      this.b((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.o($$0, $$1, $$2);
      this.o($$3);
      this.p($$4);
      this.bh();
      this.am();
   }

   public final void bh() {
      double $$0 = this.df();
      double $$1 = this.dh();
      double $$2 = this.dl();
      this.t = $$0;
      this.u = $$1;
      this.v = $$2;
      this.M = $$0;
      this.N = $$1;
      this.O = $$2;
      this.w = this.dq();
      this.x = this.ds();
   }

   public float e(bbn $$0) {
      float $$1 = (float)(this.df() - $$0.df());
      float $$2 = (float)(this.dh() - $$0.dh());
      float $$3 = (float)(this.dl() - $$0.dl());
      return ami.c($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
   }

   public double h(double $$0, double $$1, double $$2) {
      double $$3 = this.df() - $$0;
      double $$4 = this.dh() - $$1;
      double $$5 = this.dl() - $$2;
      return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
   }

   public double f(bbn $$0) {
      return this.e($$0.cY());
   }

   public double e(dwq $$0) {
      double $$1 = this.df() - $$0.c;
      double $$2 = this.dh() - $$0.d;
      double $$3 = this.dl() - $$0.e;
      return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
   }

   public void b_(buc $$0) {
   }

   public void g(bbn $$0) {
      if (!this.v($$0)) {
         if (!$$0.Q && !this.Q) {
            double $$1 = $$0.df() - this.df();
            double $$2 = $$0.dl() - this.dl();
            double $$3 = ami.a($$1, $$2);
            if ($$3 >= 0.01F) {
               $$3 = Math.sqrt($$3);
               $$1 /= $$3;
               $$2 /= $$3;
               double $$4 = 1.0 / $$3;
               if ($$4 > 1.0) {
                  $$4 = 1.0;
               }

               $$1 *= $$4;
               $$2 *= $$4;
               $$1 *= 0.05F;
               $$2 *= 0.05F;
               if (!this.bJ() && this.bl()) {
                  this.i(-$$1, 0.0, -$$2);
               }

               if (!$$0.bJ() && $$0.bl()) {
                  $$0.i($$1, 0.0, $$2);
               }
            }

         }
      }
   }

   public void i(double $$0, double $$1, double $$2) {
      this.f(this.dd().b($$0, $$1, $$2));
      this.af = true;
   }

   protected void bi() {
      this.D = true;
   }

   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bi();
         return false;
      }
   }

   public final dwq e(float $$0) {
      return this.b(this.f($$0), this.g($$0));
   }

   public float f(float $$0) {
      return $$0 == 1.0F ? this.ds() : ami.i($$0, this.x, this.ds());
   }

   public float g(float $$0) {
      return $$0 == 1.0F ? this.dq() : ami.i($$0, this.w, this.dq());
   }

   protected final dwq b(float $$0, float $$1) {
      float $$2 = $$0 * (float) (Math.PI / 180.0);
      float $$3 = -$$1 * (float) (Math.PI / 180.0);
      float $$4 = ami.b($$3);
      float $$5 = ami.a($$3);
      float $$6 = ami.b($$2);
      float $$7 = ami.a($$2);
      return new dwq((double)($$5 * $$6), (double)(-$$7), (double)($$4 * $$6));
   }

   public final dwq h(float $$0) {
      return this.c(this.f($$0), this.g($$0));
   }

   protected final dwq c(float $$0, float $$1) {
      return this.b($$0 - 90.0F, $$1);
   }

   public final dwq bj() {
      return new dwq(this.df(), this.dj(), this.dl());
   }

   public final dwq i(float $$0) {
      double $$1 = ami.d((double)$$0, this.t, this.df());
      double $$2 = ami.d((double)$$0, this.u, this.dh()) + (double)this.cA();
      double $$3 = ami.d((double)$$0, this.v, this.dl());
      return new dwq($$1, $$2, $$3);
   }

   public dwq j(float $$0) {
      return this.i($$0);
   }

   public final dwq k(float $$0) {
      double $$1 = ami.d((double)$$0, this.t, this.df());
      double $$2 = ami.d((double)$$0, this.u, this.dh());
      double $$3 = ami.d((double)$$0, this.v, this.dl());
      return new dwq($$1, $$2, $$3);
   }

   public dwo a(double $$0, float $$1, boolean $$2) {
      dwq $$3 = this.i($$1);
      dwq $$4 = this.e($$1);
      dwq $$5 = $$3.b($$4.c * $$0, $$4.d * $$0, $$4.e * $$0);
      return this.s.a(new cgg($$3, $$5, cgg.a.b, $$2 ? cgg.b.c : cgg.b.a, this));
   }

   public boolean bk() {
      return false;
   }

   public boolean bl() {
      return false;
   }

   public void a(bbn $$0, int $$1, baw $$2) {
      if ($$0 instanceof agh) {
         aj.c.a((agh)$$0, this, $$2);
      }

   }

   public boolean j(double $$0, double $$1, double $$2) {
      double $$3 = this.df() - $$0;
      double $$4 = this.dh() - $$1;
      double $$5 = this.dl() - $$2;
      double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
      return this.a($$6);
   }

   public boolean a(double $$0) {
      double $$1 = this.cy().a();
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * ar;
      return $$0 < $$1 * $$1;
   }

   public boolean d(pj $$0) {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else {
         String $$1 = this.bn();
         if ($$1 == null) {
            return false;
         } else {
            $$0.a("id", $$1);
            this.f($$0);
            return true;
         }
      }
   }

   public boolean e(pj $$0) {
      return this.bI() ? false : this.d($$0);
   }

   public pj f(pj $$0) {
      try {
         if (this.av != null) {
            $$0.a("Pos", (qc)this.a(this.av.df(), this.dh(), this.av.dl()));
         } else {
            $$0.a("Pos", (qc)this.a(this.df(), this.dh(), this.dl()));
         }

         dwq $$1 = this.dd();
         $$0.a("Motion", (qc)this.a($$1.c, $$1.d, $$1.e));
         $$0.a("Rotation", (qc)this.a(this.dq(), this.ds()));
         $$0.a("FallDistance", this.L);
         $$0.a("Fire", (short)this.aF);
         $$0.a("Air", (short)this.ca());
         $$0.a("OnGround", this.y);
         $$0.a("Invulnerable", this.aU);
         $$0.a("PortalCooldown", this.aT);
         $$0.a("UUID", this.co());
         rq $$2 = this.Z();
         if ($$2 != null) {
            $$0.a("CustomName", rq.a.a($$2));
         }

         if (this.ct()) {
            $$0.a("CustomNameVisible", this.ct());
         }

         if (this.aM()) {
            $$0.a("Silent", this.aM());
         }

         if (this.aN()) {
            $$0.a("NoGravity", this.aN());
         }

         if (this.aV) {
            $$0.a("Glowing", true);
         }

         int $$3 = this.cb();
         if ($$3 > 0) {
            $$0.a("TicksFrozen", this.cb());
         }

         if (this.bd) {
            $$0.a("HasVisualFire", this.bd);
         }

         if (!this.aW.isEmpty()) {
            pp $$4 = new pp();

            for(String $$5 : this.aW) {
               $$4.add(qa.a($$5));
            }

            $$0.a("Tags", (qc)$$4);
         }

         this.b($$0);
         if (this.bJ()) {
            pp $$6 = new pp();

            for(bbn $$7 : this.cI()) {
               pj $$8 = new pj();
               if ($$7.d($$8)) {
                  $$6.add($$8);
               }
            }

            if (!$$6.isEmpty()) {
               $$0.a("Passengers", (qc)$$6);
            }
         }

         return $$0;
      } catch (Throwable var9) {
         q $$10 = q.a(var9, "Saving entity NBT");
         r $$11 = $$10.a("Entity being saved");
         this.a($$11);
         throw new z($$10);
      }
   }

   public void g(pj $$0) {
      try {
         pp $$1 = $$0.c("Pos", 6);
         pp $$2 = $$0.c("Motion", 6);
         pp $$3 = $$0.c("Rotation", 5);
         double $$4 = $$2.h(0);
         double $$5 = $$2.h(1);
         double $$6 = $$2.h(2);
         this.n(Math.abs($$4) > 10.0 ? 0.0 : $$4, Math.abs($$5) > 10.0 ? 0.0 : $$5, Math.abs($$6) > 10.0 ? 0.0 : $$6);
         double $$7 = 3.0000512E7;
         this.o(ami.a($$1.h(0), -3.0000512E7, 3.0000512E7), ami.a($$1.h(1), -2.0E7, 2.0E7), ami.a($$1.h(2), -3.0000512E7, 3.0000512E7));
         this.o($$3.i(0));
         this.p($$3.i(1));
         this.bh();
         this.l(this.dq());
         this.m(this.dq());
         this.L = $$0.j("FallDistance");
         this.aF = $$0.g("Fire");
         if ($$0.e("Air")) {
            this.i($$0.g("Air"));
         }

         this.y = $$0.q("OnGround");
         this.aU = $$0.q("Invulnerable");
         this.aT = $$0.h("PortalCooldown");
         if ($$0.b("UUID")) {
            this.aj = $$0.a("UUID");
            this.ak = this.aj.toString();
         }

         if (!Double.isFinite(this.df()) || !Double.isFinite(this.dh()) || !Double.isFinite(this.dl())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.dq()) && Double.isFinite((double)this.ds())) {
            this.am();
            this.a(this.dq(), this.ds());
            if ($$0.b("CustomName", 8)) {
               String $$8 = $$0.l("CustomName");

               try {
                  this.b(rq.a.a($$8));
               } catch (Exception var16) {
                  b.warn("Failed to parse entity custom name {}", $$8, var16);
               }
            }

            this.n($$0.q("CustomNameVisible"));
            this.d($$0.q("Silent"));
            this.e($$0.q("NoGravity"));
            this.i($$0.q("Glowing"));
            this.j($$0.h("TicksFrozen"));
            this.bd = $$0.q("HasVisualFire");
            if ($$0.b("Tags", 9)) {
               this.aW.clear();
               pp $$10 = $$0.c("Tags", 8);
               int $$11 = Math.min($$10.size(), 1024);

               for(int $$12 = 0; $$12 < $$11; ++$$12) {
                  this.aW.add($$10.j($$12));
               }
            }

            this.a($$0);
            if (this.bm()) {
               this.am();
            }

         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         q $$14 = q.a(var17, "Loading entity NBT");
         r $$15 = $$14.a("Entity being loaded");
         this.a($$15);
         throw new z($$14);
      }
   }

   protected boolean bm() {
      return true;
   }

   @Nullable
   protected final String bn() {
      bbr<?> $$0 = this.ad();
      abb $$1 = bbr.a($$0);
      return $$0.b() && $$1 != null ? $$1.toString() : null;
   }

   protected abstract void a(pj var1);

   protected abstract void b(pj var1);

   protected pp a(double... $$0) {
      pp $$1 = new pp();

      for(double $$2 : $$0) {
         $$1.add(pk.a($$2));
      }

      return $$1;
   }

   protected pp a(float... $$0) {
      pp $$1 = new pp();

      for(float $$2 : $$0) {
         $$1.add(pm.a($$2));
      }

      return $$1;
   }

   @Nullable
   public bqv a(cgw $$0) {
      return this.a($$0, 0);
   }

   @Nullable
   public bqv a(cgw $$0, int $$1) {
      return this.a(new cax($$0), (float)$$1);
   }

   @Nullable
   public bqv b(cax $$0) {
      return this.a($$0, 0.0F);
   }

   @Nullable
   public bqv a(cax $$0, float $$1) {
      if ($$0.b()) {
         return null;
      } else if (this.s.y) {
         return null;
      } else {
         bqv $$2 = new bqv(this.s, this.df(), this.dh() + (double)$$1, this.dl(), $$0);
         $$2.o();
         this.s.b($$2);
         return $$2;
      }
   }

   public boolean bo() {
      return !this.dt();
   }

   public boolean bp() {
      if (this.Q) {
         return false;
      } else {
         float $$0 = this.aZ.a * 0.8F;
         dwl $$1 = dwl.a(this.bj(), (double)$$0, 1.0E-6, (double)$$0);
         return gt.a($$1).anyMatch($$1x -> {
            cvo $$2 = this.s.a_($$1x);
            return !$$2.h() && $$2.o(this.s, $$1x) && dxg.c($$2.k(this.s, $$1x).a((double)$$1x.u(), (double)$$1x.v(), (double)$$1x.w()), dxg.a($$1), dwu.i);
         });
      }
   }

   public baj a(buc $$0, bai $$1) {
      return baj.d;
   }

   public boolean h(bbn $$0) {
      return $$0.bq() && !this.v($$0);
   }

   public boolean bq() {
      return false;
   }

   public void br() {
      this.f(dwq.b);
      this.k();
      if (this.bI()) {
         this.cQ().i(this);
      }
   }

   public void i(bbn $$0) {
      this.a($$0, bbn::e);
   }

   private void a(bbn $$0, bbn.a $$1) {
      if (this.u($$0)) {
         double $$2 = this.dh() + this.bt() + $$0.bs();
         $$1.accept($$0, this.df(), $$2, this.dl());
      }
   }

   public void j(bbn $$0) {
   }

   public double bs() {
      return 0.0;
   }

   public double bt() {
      return (double)this.aZ.b * 0.75;
   }

   public boolean k(bbn $$0) {
      return this.a($$0, false);
   }

   public boolean bu() {
      return this instanceof bcc;
   }

   public boolean a(bbn $$0, boolean $$1) {
      if ($$0 == this.av) {
         return false;
      } else {
         for(bbn $$2 = $$0; $$2.av != null; $$2 = $$2.av) {
            if ($$2.av == this) {
               return false;
            }
         }

         if ($$1 || this.l($$0) && $$0.o(this)) {
            if (this.bI()) {
               this.p();
            }

            this.b(bco.a);
            this.av = $$0;
            this.av.m(this);
            $$0.o().filter($$0x -> $$0x instanceof agh).forEach($$0x -> aj.R.a((agh)$$0x));
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean l(bbn $$0) {
      return !this.bL() && this.r <= 0;
   }

   protected boolean d(bco $$0) {
      return this.s.a(this, this.e($$0).h(1.0E-7));
   }

   public void bv() {
      for(int $$0 = this.au.size() - 1; $$0 >= 0; --$$0) {
         ((bbn)this.au.get($$0)).p();
      }

   }

   public void bw() {
      if (this.av != null) {
         bbn $$0 = this.av;
         this.av = null;
         $$0.n(this);
      }

   }

   public void p() {
      this.bw();
   }

   protected void m(bbn $$0) {
      if ($$0.cQ() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.au.isEmpty()) {
            this.au = ImmutableList.of($$0);
         } else {
            List<bbn> $$1 = Lists.newArrayList(this.au);
            if (!this.s.y && $$0 instanceof buc && !(this.cG() instanceof buc)) {
               $$1.add(0, $$0);
            } else {
               $$1.add($$0);
            }

            this.au = ImmutableList.copyOf($$1);
         }

      }
   }

   protected void n(bbn $$0) {
      if ($$0.cQ() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.au.size() == 1 && this.au.get(0) == $$0) {
            this.au = ImmutableList.of();
         } else {
            this.au = (ImmutableList)this.au.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
         }

         $$0.r = 60;
      }
   }

   protected boolean o(bbn $$0) {
      return this.au.isEmpty();
   }

   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   public void a(float $$0, int $$1) {
      this.l($$0);
   }

   public float bx() {
      return 0.0F;
   }

   public dwq by() {
      return this.b(this.ds(), this.dq());
   }

   public dwq a(cat $$0) {
      if (!(this instanceof buc)) {
         return dwq.b;
      } else {
         buc $$1 = (buc)this;
         boolean $$2 = $$1.eA().a($$0) && !$$1.ez().a($$0);
         bbx $$3 = $$2 ? $$1.eS().d() : $$1.eS();
         return this.b(0.0F, this.dq() + (float)($$3 == bbx.b ? 80 : -80)).a(0.5);
      }
   }

   public dwp bz() {
      return new dwp(this.ds(), this.dq());
   }

   public dwq bA() {
      return dwq.a(this.bz());
   }

   public void d(gt $$0) {
      if (this.aq()) {
         this.ap();
      } else {
         if (!this.s.y && !$$0.equals(this.ai)) {
            this.ai = $$0.h();
         }

         this.ag = true;
      }
   }

   protected void bB() {
      if (this.s instanceof agg) {
         int $$0 = this.ar();
         agg $$1 = (agg)this.s;
         if (this.ag) {
            MinecraftServer $$2 = $$1.n();
            aba<cgx> $$3 = this.s.ab() == cgx.f ? cgx.e : cgx.f;
            agg $$4 = $$2.a($$3);
            if ($$4 != null && $$2.A() && !this.bI() && this.ah++ >= $$0) {
               this.s.ac().a("portal");
               this.ah = $$0;
               this.ap();
               this.b($$4);
               this.s.ac().c();
            }

            this.ag = false;
         } else {
            if (this.ah > 0) {
               this.ah -= 4;
            }

            if (this.ah < 0) {
               this.ah = 0;
            }
         }

         this.H();
      }
   }

   public int bC() {
      return 300;
   }

   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
   }

   public void a(byte $$0) {
      switch($$0) {
         case 53:
            cnd.a(this);
      }
   }

   public void bD() {
   }

   public Iterable<cax> bE() {
      return d;
   }

   public Iterable<cax> bF() {
      return d;
   }

   public Iterable<cax> bG() {
      return Iterables.concat(this.bE(), this.bF());
   }

   public void a(bbs $$0, cax $$1) {
   }

   public boolean bH() {
      boolean $$0 = this.s != null && this.s.y;
      return !this.aQ() && (this.aF > 0 || $$0 && this.h(0));
   }

   public boolean bI() {
      return this.cQ() != null;
   }

   public boolean bJ() {
      return !this.au.isEmpty();
   }

   public boolean bK() {
      return true;
   }

   public void f(boolean $$0) {
      this.b(1, $$0);
   }

   public boolean bL() {
      return this.h(1);
   }

   public boolean bM() {
      return this.bL();
   }

   public boolean bN() {
      return this.bL();
   }

   public boolean bO() {
      return this.bL();
   }

   public boolean bP() {
      return this.bL();
   }

   public boolean bQ() {
      return this.c(bco.f);
   }

   public boolean bR() {
      return this.h(3);
   }

   public void g(boolean $$0) {
      this.b(3, $$0);
   }

   public boolean bS() {
      return this.h(4);
   }

   public boolean bT() {
      return this.c(bco.d);
   }

   public boolean bU() {
      return this.bT() && !this.aR();
   }

   public void h(boolean $$0) {
      this.b(4, $$0);
   }

   public final boolean bV() {
      return this.aV;
   }

   public final void i(boolean $$0) {
      this.aV = $$0;
      this.b(6, this.bW());
   }

   public boolean bW() {
      return this.s.k_() ? this.h(6) : this.aV;
   }

   public boolean bX() {
      return this.h(5);
   }

   public boolean c(buc $$0) {
      if ($$0.B_()) {
         return false;
      } else {
         dxq $$1 = this.bY();
         return $$1 != null && $$0 != null && $$0.bY() == $$1 && $$1.i() ? false : this.bX();
      }
   }

   public void a(BiConsumer<czs<?>, agg> $$0) {
   }

   @Nullable
   public dxq bY() {
      return this.s.H().i(this.cq());
   }

   public boolean p(bbn $$0) {
      return this.a($$0.bY());
   }

   public boolean a(dxq $$0) {
      return this.bY() != null ? this.bY().a($$0) : false;
   }

   public void j(boolean $$0) {
      this.b(5, $$0);
   }

   protected boolean h(int $$0) {
      return (this.Y.a(Z) & 1 << $$0) != 0;
   }

   protected void b(int $$0, boolean $$1) {
      byte $$2 = this.Y.a(Z);
      if ($$1) {
         this.Y.b(Z, (byte)($$2 | 1 << $$0));
      } else {
         this.Y.b(Z, (byte)($$2 & ~(1 << $$0)));
      }

   }

   public int bZ() {
      return 300;
   }

   public int ca() {
      return this.Y.a(aL);
   }

   public void i(int $$0) {
      this.Y.b(aL, $$0);
   }

   public int cb() {
      return this.Y.a(aQ);
   }

   public void j(int $$0) {
      this.Y.b(aQ, $$0);
   }

   public float cc() {
      int $$0 = this.ce();
      return (float)Math.min(this.cb(), $$0) / (float)$$0;
   }

   public boolean cd() {
      return this.cb() >= this.ce();
   }

   public int ce() {
      return 140;
   }

   public void a(agg $$0, bcb $$1) {
      this.g(this.aF + 1);
      if (this.aF == 0) {
         this.f(8);
      }

      this.a(baw.b, 5.0F);
   }

   public void k(boolean $$0) {
      dwq $$1 = this.dd();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.9, $$1.d - 0.03);
      } else {
         $$2 = Math.min(1.8, $$1.d + 0.1);
      }

      this.n($$1.c, $$2, $$1.e);
   }

   public void l(boolean $$0) {
      dwq $$1 = this.dd();
      double $$2;
      if ($$0) {
         $$2 = Math.max(-0.3, $$1.d - 0.03);
      } else {
         $$2 = Math.min(0.7, $$1.d + 0.06);
      }

      this.n($$1.c, $$2, $$1.e);
      this.m();
   }

   public boolean a(agg $$0, bcc $$1) {
      return true;
   }

   public void m() {
      this.L = 0.0F;
   }

   protected void l(double $$0, double $$1, double $$2) {
      gt $$3 = new gt($$0, $$1, $$2);
      dwq $$4 = new dwq($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
      gt.a $$5 = new gt.a();
      gy $$6 = gy.b;
      double $$7 = Double.MAX_VALUE;

      for(gy $$8 : new gy[]{gy.c, gy.d, gy.e, gy.f, gy.b}) {
         $$5.a($$3, $$8);
         if (!this.s.a_($$5).r(this.s, $$5)) {
            double $$9 = $$4.a($$8.o());
            double $$10 = $$8.f() == gy.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$7) {
               $$7 = $$10;
               $$6 = $$8;
            }
         }
      }

      float $$11 = this.R.i() * 0.2F + 0.1F;
      float $$12 = (float)$$6.f().a();
      dwq $$13 = this.dd().a(0.75);
      if ($$6.o() == gy.a.a) {
         this.n((double)($$12 * $$11), $$13.d, $$13.e);
      } else if ($$6.o() == gy.a.b) {
         this.n($$13.c, (double)($$12 * $$11), $$13.e);
      } else if ($$6.o() == gy.a.c) {
         this.n($$13.c, $$13.d, (double)($$12 * $$11));
      }

   }

   public void a(cvo $$0, dwq $$1) {
      this.m();
      this.E = $$1;
   }

   private static rq c(rq $$0) {
      sb $$1 = $$0.d().b($$0.a().a(null));

      for(rq $$2 : $$0.c()) {
         $$1.b(c($$2));
      }

      return $$1;
   }

   @Override
   public rq X() {
      rq $$0 = this.Z();
      return $$0 != null ? c($$0) : this.cf();
   }

   protected rq cf() {
      return this.as.h();
   }

   public boolean q(bbn $$0) {
      return this == $$0;
   }

   public float cg() {
      return 0.0F;
   }

   public void l(float $$0) {
   }

   public void m(float $$0) {
   }

   public boolean ch() {
      return true;
   }

   public boolean r(bbn $$0) {
      return false;
   }

   public String toString() {
      String $$0 = this.s == null ? "~NULL~" : this.s.toString();
      return this.aD != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.X().getString(),
            this.at,
            $$0,
            this.df(),
            this.dh(),
            this.dl(),
            this.aD
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.X().getString(),
            this.at,
            $$0,
            this.df(),
            this.dh(),
            this.dl()
         );
   }

   public boolean b(baw $$0) {
      return this.dt() || this.aU && $$0 != baw.m && !$$0.D() || $$0.u() && this.aQ();
   }

   public boolean ci() {
      return this.aU;
   }

   public void m(boolean $$0) {
      this.aU = $$0;
   }

   public void s(bbn $$0) {
      this.b($$0.df(), $$0.dh(), $$0.dl(), $$0.dq(), $$0.ds());
   }

   public void t(bbn $$0) {
      pj $$1 = $$0.f(new pj());
      $$1.r("Dimension");
      this.g($$1);
      this.aT = $$0.aT;
      this.ai = $$0.ai;
   }

   @Nullable
   public bbn b(agg $$0) {
      if (this.s instanceof agg && !this.dt()) {
         this.s.ac().a("changeDimension");
         this.ab();
         this.s.ac().a("reposition");
         dqt $$1 = this.a($$0);
         if ($$1 == null) {
            return null;
         } else {
            this.s.ac().b("reloading");
            bbn $$2 = this.ad().a((cgx)$$0);
            if ($$2 != null) {
               $$2.t(this);
               $$2.b($$1.a.c, $$1.a.d, $$1.a.e, $$1.c, $$2.ds());
               $$2.f($$1.b);
               $$0.d($$2);
               if ($$0.ab() == cgx.g) {
                  agg.a($$0);
               }
            }

            this.cj();
            this.s.ac().c();
            ((agg)this.s).g();
            $$0.g();
            this.s.ac().c();
            return $$2;
         }
      } else {
         return null;
      }
   }

   protected void cj() {
      this.b(bbn.c.e);
   }

   @Nullable
   protected dqt a(agg $$0) {
      boolean $$1 = this.s.ab() == cgx.g && $$0.ab() == cgx.e;
      boolean $$2 = $$0.ab() == cgx.g;
      if (!$$1 && !$$2) {
         boolean $$5 = $$0.ab() == cgx.f;
         if (this.s.ab() != cgx.f && !$$5) {
            return null;
         } else {
            cxe $$6 = $$0.p_();
            double $$7 = cyu.a(this.s.q_(), $$0.q_());
            gt $$8 = $$6.b(this.df() * $$7, this.dh(), this.dl() * $$7);
            return (dqt)this.a($$0, $$8, $$5, $$6).map($$1x -> {
               cvo $$2x = this.s.a_(this.ai);
               gy.a $$6x;
               dwq $$7x;
               if ($$2x.b(cwe.I)) {
                  $$6x = $$2x.c(cwe.I);
                  n.a $$4 = n.a(this.ai, $$6x, 21, gy.a.b, 21, $$1xx -> this.s.a_($$1xx) == $$2x);
                  $$7x = this.a($$6x, $$4);
               } else {
                  $$6x = gy.a.a;
                  $$7x = new dwq(0.5, 0.0, 0.0);
               }

               return dqu.a($$0, $$1x, $$6x, $$7x, this.a(this.ak()), this.dd(), this.dq(), this.ds());
            }).orElse(null);
         }
      } else {
         gt $$3;
         if ($$2) {
            $$3 = agg.a;
         } else {
            $$3 = $$0.a(dar.a.f, $$0.Q());
         }

         return new dqt(new dwq((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5), this.dd(), this.dq(), this.ds());
      }
   }

   protected dwq a(gy.a $$0, n.a $$1) {
      return dqu.a($$1, $$0, this.cY(), this.a(this.ak()));
   }

   protected Optional<n.a> a(agg $$0, gt $$1, boolean $$2, cxe $$3) {
      return $$0.o().a($$1, $$2, $$3);
   }

   public boolean ck() {
      return true;
   }

   public float a(cgp $$0, cgd $$1, gt $$2, cvo $$3, dpv $$4, float $$5) {
      return $$5;
   }

   public boolean a(cgp $$0, cgd $$1, gt $$2, cvo $$3, float $$4) {
      return true;
   }

   public int cl() {
      return 3;
   }

   public boolean cm() {
      return false;
   }

   public void a(r $$0) {
      $$0.a("Entity Type", (s<String>)(() -> bbr.a(this.ad()) + " (" + this.getClass().getCanonicalName() + ")"));
      $$0.a("Entity ID", this.at);
      $$0.a("Entity Name", (s<String>)(() -> this.X().getString()));
      $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.df(), this.dh(), this.dl()));
      $$0.a("Entity's Block location", r.a(this.s, ami.b(this.df()), ami.b(this.dh()), ami.b(this.dl())));
      dwq $$1 = this.dd();
      $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.c, $$1.d, $$1.e));
      $$0.a("Entity's Passengers", (s<String>)(() -> this.cI().toString()));
      $$0.a("Entity's Vehicle", (s<String>)(() -> String.valueOf(this.cQ())));
   }

   public boolean cn() {
      return this.bH() && !this.B_();
   }

   public void a_(UUID $$0) {
      this.aj = $$0;
      this.ak = this.aj.toString();
   }

   @Override
   public UUID co() {
      return this.aj;
   }

   public String cp() {
      return this.ak;
   }

   public String cq() {
      return this.ak;
   }

   public boolean cr() {
      return true;
   }

   public static double cs() {
      return ar;
   }

   public static void b(double $$0) {
      ar = $$0;
   }

   @Override
   public rq C_() {
      return dxm.a(this.bY(), this.X()).a($$0 -> $$0.a(this.cx()).a(this.cp()));
   }

   public void b(@Nullable rq $$0) {
      this.Y.b(aM, Optional.ofNullable($$0));
   }

   @Nullable
   @Override
   public rq Z() {
      return (rq)((Optional)this.Y.a(aM)).orElse(null);
   }

   @Override
   public boolean Y() {
      return ((Optional)this.Y.a(aM)).isPresent();
   }

   public void n(boolean $$0) {
      this.Y.b(aN, $$0);
   }

   public boolean ct() {
      return this.Y.a(aN);
   }

   public final void m(double $$0, double $$1, double $$2) {
      if (this.s instanceof agg) {
         cge $$3 = new cge(new gt($$0, $$1, $$2));
         ((agg)this.s).k().a(agl.g, $$3, 0, this.ae());
         this.s.d($$3.e, $$3.f);
         this.b($$0, $$1, $$2);
      }
   }

   public void a(double $$0, double $$1, double $$2) {
      this.b($$0, $$1, $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (this.s instanceof agg) {
         this.b($$0, $$1, $$2, this.dq(), this.ds());
         this.cK().forEach($$0x -> {
            UnmodifiableIterator var1x = $$0x.au.iterator();

            while(var1x.hasNext()) {
               bbn $$1x = (bbn)var1x.next();
               $$0x.a($$1x, bbn::c);
            }

         });
      }
   }

   public boolean cu() {
      return this.ct();
   }

   public void a(aaj<?> $$0) {
      if (ad.equals($$0)) {
         this.z_();
      }

   }

   public void z_() {
      bbo $$0 = this.aZ;
      bco $$1 = this.ak();
      bbo $$2 = this.a($$1);
      this.aZ = $$2;
      this.ba = this.a($$1, $$2);
      this.am();
      boolean $$3 = (double)$$2.a <= 4.0 && (double)$$2.b <= 4.0;
      if (!this.s.y && !this.X && !this.Q && $$3 && ($$2.a > $$0.a || $$2.b > $$0.b) && !(this instanceof buc)) {
         dwq $$4 = this.cY().b(0.0, (double)$$0.b / 2.0, 0.0);
         double $$5 = (double)Math.max(0.0F, $$2.a - $$0.a) + 1.0E-6;
         double $$6 = (double)Math.max(0.0F, $$2.b - $$0.b) + 1.0E-6;
         dxj $$7 = dxg.a(dwl.a($$4, $$5, $$6, $$5));
         this.s.a(this, $$7, $$4, (double)$$2.a, (double)$$2.b, (double)$$2.a).ifPresent($$1x -> this.a_($$1x.b(0.0, (double)(-$$2.b) / 2.0, 0.0)));
      }

   }

   public gy cv() {
      return gy.a((double)this.dq());
   }

   public gy cw() {
      return this.cv();
   }

   protected rv cx() {
      return new rv(rv.a.c, new rv.b(this.ad(), this.co(), this.X()));
   }

   public boolean a(agh $$0) {
      return true;
   }

   @Override
   public final dwl cy() {
      return this.aC;
   }

   public dwl cz() {
      return this.cy();
   }

   protected dwl e(bco $$0) {
      bbo $$1 = this.a($$0);
      float $$2 = $$1.a / 2.0F;
      dwq $$3 = new dwq(this.df() - (double)$$2, this.dh(), this.dl() - (double)$$2);
      dwq $$4 = new dwq(this.df() + (double)$$2, this.dh() + (double)$$1.b, this.dl() + (double)$$2);
      return new dwl($$3, $$4);
   }

   public final void a(dwl $$0) {
      this.aC = $$0;
   }

   protected float a(bco $$0, bbo $$1) {
      return $$1.b * 0.85F;
   }

   public float f(bco $$0) {
      return this.a($$0, this.a($$0));
   }

   public final float cA() {
      return this.ba;
   }

   public dwq cB() {
      return new dwq(0.0, (double)this.cA(), (double)(this.cW() * 0.4F));
   }

   public bct k(int $$0) {
      return bct.a;
   }

   @Override
   public void a(rq $$0) {
   }

   public cgx cC() {
      return this.s;
   }

   @Nullable
   public MinecraftServer cD() {
      return this.s.n();
   }

   public baj a(buc $$0, dwq $$1, bai $$2) {
      return baj.d;
   }

   public boolean cE() {
      return false;
   }

   public void a(bcc $$0, bbn $$1) {
      if ($$1 instanceof bcc) {
         cet.a((bcc)$$1, $$0);
      }

      cet.b($$0, $$1);
   }

   public void c(agh $$0) {
   }

   public void d(agh $$0) {
   }

   public float a(cpw $$0) {
      float $$1 = ami.g(this.dq());
      switch($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 270.0F;
         case b:
            return $$1 + 90.0F;
         default:
            return $$1;
      }
   }

   public float a(coh $$0) {
      float $$1 = ami.g(this.dq());
      switch($$0) {
         case c:
            return -$$1;
         case b:
            return 180.0F - $$1;
         default:
            return $$1;
      }
   }

   public boolean cF() {
      return false;
   }

   @Nullable
   public bbn cG() {
      return null;
   }

   public final boolean cH() {
      return this.cG() != null;
   }

   public final List<bbn> cI() {
      return this.au;
   }

   @Nullable
   public bbn cJ() {
      return this.au.isEmpty() ? null : (bbn)this.au.get(0);
   }

   public boolean u(bbn $$0) {
      return this.au.contains($$0);
   }

   public boolean a(Predicate<bbn> $$0) {
      UnmodifiableIterator var2 = this.au.iterator();

      while(var2.hasNext()) {
         bbn $$1 = (bbn)var2.next();
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   private Stream<bbn> o() {
      return this.au.stream().flatMap(bbn::cK);
   }

   @Override
   public Stream<bbn> cK() {
      return Stream.concat(Stream.of(this), this.o());
   }

   @Override
   public Stream<bbn> cL() {
      return Stream.concat(this.au.stream().flatMap(bbn::cL), Stream.of(this));
   }

   public Iterable<bbn> cM() {
      return () -> this.o().iterator();
   }

   public boolean cN() {
      return this.o().filter($$0 -> $$0 instanceof buc).count() == 1L;
   }

   public bbn cO() {
      bbn $$0 = this;

      while($$0.bI()) {
         $$0 = $$0.cQ();
      }

      return $$0;
   }

   public boolean v(bbn $$0) {
      return this.cO() == $$0.cO();
   }

   public boolean w(bbn $$0) {
      return this.o().anyMatch($$1 -> $$1 == $$0);
   }

   public boolean cP() {
      bbn $$0 = this.cG();
      if ($$0 instanceof buc) {
         return ((buc)$$0).fx();
      } else {
         return !this.s.y;
      }
   }

   protected static dwq a(double $$0, double $$1, float $$2) {
      double $$3 = ($$0 + $$1 + 1.0E-5F) / 2.0;
      float $$4 = -ami.a($$2 * (float) (Math.PI / 180.0));
      float $$5 = ami.b($$2 * (float) (Math.PI / 180.0));
      float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
      return new dwq((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
   }

   public dwq b(bcc $$0) {
      return new dwq(this.df(), this.cy().e, this.dl());
   }

   @Nullable
   public bbn cQ() {
      return this.av;
   }

   public dqb c_() {
      return dqb.a;
   }

   public ajx cR() {
      return ajx.g;
   }

   protected int cS() {
      return 1;
   }

   public dr cT() {
      return new dr(this, this.cY(), this.bz(), this.s instanceof agg ? (agg)this.s : null, this.B(), this.X().getString(), this.C_(), this.s.n(), this);
   }

   protected int B() {
      return 0;
   }

   public boolean l(int $$0) {
      return this.B() >= $$0;
   }

   @Override
   public boolean i_() {
      return this.s.W().b(cgt.o);
   }

   @Override
   public boolean j_() {
      return true;
   }

   @Override
   public boolean G_() {
      return true;
   }

   public void a(ea.a $$0, dwq $$1) {
      dwq $$2 = $$0.a(this);
      double $$3 = $$1.c - $$2.c;
      double $$4 = $$1.d - $$2.d;
      double $$5 = $$1.e - $$2.e;
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      this.p(ami.g((float)(-(ami.d($$4, $$6) * 180.0F / (float)Math.PI))));
      this.o(ami.g((float)(ami.d($$5, $$3) * 180.0F / (float)Math.PI) - 90.0F));
      this.l(this.dq());
      this.x = this.ds();
      this.w = this.dq();
   }

   public boolean a(akz<dpu> $$0, double $$1) {
      if (this.cU()) {
         return false;
      } else {
         dwl $$2 = this.cy().h(0.001);
         int $$3 = ami.b($$2.a);
         int $$4 = ami.e($$2.d);
         int $$5 = ami.b($$2.b);
         int $$6 = ami.e($$2.e);
         int $$7 = ami.b($$2.c);
         int $$8 = ami.e($$2.f);
         double $$9 = 0.0;
         boolean $$10 = this.cr();
         boolean $$11 = false;
         dwq $$12 = dwq.b;
         int $$13 = 0;
         gt.a $$14 = new gt.a();

         for(int $$15 = $$3; $$15 < $$4; ++$$15) {
            for(int $$16 = $$5; $$16 < $$6; ++$$16) {
               for(int $$17 = $$7; $$17 < $$8; ++$$17) {
                  $$14.d($$15, $$16, $$17);
                  dpv $$18 = this.s.b_($$14);
                  if ($$18.a($$0)) {
                     double $$19 = (double)((float)$$16 + $$18.a((cgd)this.s, $$14));
                     if ($$19 >= $$2.b) {
                        $$11 = true;
                        $$9 = Math.max($$19 - $$2.b, $$9);
                        if ($$10) {
                           dwq $$20 = $$18.c(this.s, $$14);
                           if ($$9 < 0.4) {
                              $$20 = $$20.a($$9);
                           }

                           $$12 = $$12.e($$20);
                           ++$$13;
                        }
                     }
                  }
               }
            }
         }

         if ($$12.f() > 0.0) {
            if ($$13 > 0) {
               $$12 = $$12.a(1.0 / (double)$$13);
            }

            if (!(this instanceof buc)) {
               $$12 = $$12.d();
            }

            dwq $$21 = this.dd();
            $$12 = $$12.a($$1 * 1.0);
            double $$22 = 0.003;
            if (Math.abs($$21.c) < 0.003 && Math.abs($$21.e) < 0.003 && $$12.f() < 0.0045000000000000005) {
               $$12 = $$12.d().a(0.0045000000000000005);
            }

            this.f(this.dd().e($$12));
         }

         this.U.put($$0, $$9);
         return $$11;
      }
   }

   public boolean cU() {
      dwl $$0 = this.cy().g(1.0);
      int $$1 = ami.b($$0.a);
      int $$2 = ami.e($$0.d);
      int $$3 = ami.b($$0.c);
      int $$4 = ami.e($$0.f);
      return !this.s.b($$1, $$3, $$2, $$4);
   }

   public double b(akz<dpu> $$0) {
      return this.U.getDouble($$0);
   }

   public double cV() {
      return (double)this.cA() < 0.4 ? 0.0 : 0.4;
   }

   public final float cW() {
      return this.aZ.a;
   }

   public final float cX() {
      return this.aZ.b;
   }

   public abstract tc<?> S();

   public bbo a(bco $$0) {
      return this.as.m();
   }

   public dwq cY() {
      return this.aw;
   }

   public dwq cZ() {
      return this.cY();
   }

   @Override
   public gt da() {
      return this.ax;
   }

   public cvo db() {
      if (this.be == null) {
         this.be = this.s.a_(this.da());
      }

      return this.be;
   }

   public cge dc() {
      return this.ay;
   }

   public dwq dd() {
      return this.az;
   }

   public void f(dwq $$0) {
      this.az = $$0;
   }

   public void n(double $$0, double $$1, double $$2) {
      this.f(new dwq($$0, $$1, $$2));
   }

   public final int de() {
      return this.ax.u();
   }

   public final double df() {
      return this.aw.c;
   }

   public double c(double $$0) {
      return this.aw.c + (double)this.cW() * $$0;
   }

   public double d(double $$0) {
      return this.c((2.0 * this.R.j() - 1.0) * $$0);
   }

   public final int dg() {
      return this.ax.v();
   }

   public final double dh() {
      return this.aw.d;
   }

   public double e(double $$0) {
      return this.aw.d + (double)this.cX() * $$0;
   }

   public double di() {
      return this.e(this.R.j());
   }

   public double dj() {
      return this.aw.d + (double)this.ba;
   }

   public final int dk() {
      return this.ax.w();
   }

   public final double dl() {
      return this.aw.e;
   }

   public double f(double $$0) {
      return this.aw.e + (double)this.cW() * $$0;
   }

   public double g(double $$0) {
      return this.f((2.0 * this.R.j() - 1.0) * $$0);
   }

   public final void o(double $$0, double $$1, double $$2) {
      if (this.aw.c != $$0 || this.aw.d != $$1 || this.aw.e != $$2) {
         this.aw = new dwq($$0, $$1, $$2);
         int $$3 = ami.b($$0);
         int $$4 = ami.b($$1);
         int $$5 = ami.b($$2);
         if ($$3 != this.ax.u() || $$4 != this.ax.v() || $$5 != this.ax.w()) {
            this.ax = new gt($$3, $$4, $$5);
            this.be = null;
            if (hq.a($$3) != this.ay.e || hq.a($$5) != this.ay.f) {
               this.ay = new cge(this.ax);
            }
         }

         this.aR.a();
      }

   }

   public void dm() {
   }

   public dwq n(float $$0) {
      return this.k($$0).b(0.0, (double)this.ba * 0.7, 0.0);
   }

   public void a(tg $$0) {
      int $$1 = $$0.b();
      double $$2 = $$0.e();
      double $$3 = $$0.f();
      double $$4 = $$0.g();
      this.d($$2, $$3, $$4);
      this.c($$2, $$3, $$4);
      this.p($$0.k());
      this.o($$0.l());
      this.e($$1);
      this.a_($$0.c());
   }

   @Nullable
   public cax dn() {
      return null;
   }

   public void o(boolean $$0) {
      this.al = $$0;
   }

   public boolean do() {
      return !this.ad().a(akn.i);
   }

   public boolean dp() {
      return (this.al || this.am) && this.do();
   }

   public float dq() {
      return this.aA;
   }

   public float dr() {
      return this.dq();
   }

   public void o(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aA = $$0;
      }
   }

   public float ds() {
      return this.aB;
   }

   public void p(float $$0) {
      if (!Float.isFinite($$0)) {
         ad.a("Invalid entity rotation: " + $$0 + ", discarding.");
      } else {
         this.aB = $$0;
      }
   }

   public final boolean dt() {
      return this.aD != null;
   }

   @Nullable
   public bbn.c du() {
      return this.aD;
   }

   @Override
   public final void b(bbn.c $$0) {
      if (this.aD == null) {
         this.aD = $$0;
      }

      if (this.aD.a()) {
         this.p();
      }

      this.cI().forEach(bbn::p);
      this.aR.a($$0);
   }

   protected void dv() {
      this.aD = null;
   }

   @Override
   public void a(czd $$0) {
      this.aR = $$0;
   }

   @Override
   public boolean dw() {
      if (this.aD != null && !this.aD.b()) {
         return false;
      } else if (this.bI()) {
         return false;
      } else {
         return !this.bJ() || !this.cN();
      }
   }

   @Override
   public boolean dx() {
      return false;
   }

   public boolean a(cgx $$0, gt $$1) {
      return true;
   }

   public cgx W() {
      return this.s;
   }

   @FunctionalInterface
   public interface a {
      void accept(bbn var1, double var2, double var4, double var6);
   }

   public static enum b {
      a(false, false),
      b(true, false),
      c(false, true),
      d(true, true);

      final boolean e;
      final boolean f;

      private b(boolean $$0, boolean $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public boolean a() {
         return this.f || this.e;
      }

      public boolean b() {
         return this.f;
      }

      public boolean c() {
         return this.e;
      }
   }

   public static enum c {
      a(true, false),
      b(true, false),
      c(false, true),
      d(false, false),
      e(false, false);

      private final boolean f;
      private final boolean g;

      private c(boolean $$0, boolean $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public boolean a() {
         return this.f;
      }

      public boolean b() {
         return this.g;
      }
   }
}
