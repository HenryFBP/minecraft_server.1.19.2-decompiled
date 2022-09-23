import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public abstract class cgx implements cgy, AutoCloseable {
   public static final Codec<aba<cgx>> d = aba.a(hm.P);
   public static final aba<cgx> e = aba.a(hm.P, new abb("overworld"));
   public static final aba<cgx> f = aba.a(hm.P, new abb("the_nether"));
   public static final aba<cgx> g = aba.a(hm.P, new abb("the_end"));
   public static final int h = 30000000;
   public static final int i = 512;
   public static final int j = 32;
   private static final gy[] a = gy.values();
   public static final int k = 15;
   public static final int l = 24000;
   public static final int m = 20000000;
   public static final int n = -20000000;
   protected final List<cur> o = Lists.newArrayList();
   protected final dqy p;
   private final List<cur> b = Lists.newArrayList();
   private boolean c;
   private final Thread z;
   private final boolean A;
   private int B;
   protected int q = amn.a().f();
   protected final int r = 1013904223;
   protected float s;
   protected float t;
   protected float u;
   protected float v;
   public final amn w = amn.a();
   @Deprecated
   private final amn C = amn.b();
   private final aba<cyu> D;
   private final hc<cyu> E;
   protected final drx x;
   private final Supplier<awz> F;
   public final boolean y;
   private final cxe G;
   private final chv H;
   private final aba<cgx> I;
   private long J;

   protected cgx(drx $$0, aba<cgx> $$1, hc<cyu> $$2, Supplier<awz> $$3, boolean $$4, boolean $$5, long $$6, int $$7) {
      this.F = $$3;
      this.x = $$0;
      this.E = $$2;
      this.D = (aba)$$2.e().orElseThrow(() -> new IllegalArgumentException("Dimension must be registered, got " + $$2));
      final cyu $$8 = (cyu)$$2.a();
      this.I = $$1;
      this.y = $$4;
      if ($$8.k() != 1.0) {
         this.G = new cxe() {
            @Override
            public double a() {
               return super.a() / $$8.k();
            }

            @Override
            public double b() {
               return super.b() / $$8.k();
            }
         };
      } else {
         this.G = new cxe();
      }

      this.z = Thread.currentThread();
      this.H = new chv(this, $$6);
      this.A = $$5;
      this.p = new dqw(this, $$7);
   }

   @Override
   public boolean k_() {
      return this.y;
   }

   @Nullable
   @Override
   public MinecraftServer n() {
      return null;
   }

   public boolean j(gt $$0) {
      return !this.v($$0) && F($$0);
   }

   public static boolean k(gt $$0) {
      return !b($$0.v()) && F($$0);
   }

   private static boolean F(gt $$0) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000;
   }

   private static boolean b(int $$0) {
      return $$0 < -20000000 || $$0 >= 20000000;
   }

   public cxt l(gt $$0) {
      return this.d(hq.a($$0.u()), hq.a($$0.w()));
   }

   public cxt d(int $$0, int $$1) {
      return (cxt)this.a($$0, $$1, cxn.o);
   }

   @Nullable
   @Override
   public cxj a(int $$0, int $$1, cxn $$2, boolean $$3) {
      cxj $$4 = this.I().a($$0, $$1, $$2, $$3);
      if ($$4 == null && $$3) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return $$4;
      }
   }

   @Override
   public boolean a(gt $$0, cvo $$1, int $$2) {
      return this.a($$0, $$1, $$2, 512);
   }

   @Override
   public boolean a(gt $$0, cvo $$1, int $$2, int $$3) {
      if (this.v($$0)) {
         return false;
      } else if (!this.y && this.ae()) {
         return false;
      } else {
         cxt $$4 = this.l($$0);
         cjt $$5 = $$1.b();
         cvo $$6 = $$4.a($$0, $$1, ($$2 & 64) != 0);
         if ($$6 == null) {
            return false;
         } else {
            cvo $$7 = this.a_($$0);
            if (($$2 & 128) == 0 && $$7 != $$6 && ($$7.b((cgd)this, $$0) != $$6.b((cgd)this, $$0) || $$7.g() != $$6.g() || $$7.f() || $$6.f())) {
               this.ac().a("queueCheckLight");
               this.I().o().a($$0);
               this.ac().c();
            }

            if ($$7 == $$1) {
               if ($$6 != $$7) {
                  this.b($$0, $$6, $$7);
               }

               if (($$2 & 2) != 0 && (!this.y || ($$2 & 4) == 0) && (this.y || $$4.B() != null && $$4.B().a(afs.c.c))) {
                  this.a($$0, $$6, $$1, $$2);
               }

               if (($$2 & 1) != 0) {
                  this.b($$0, $$6.b());
                  if (!this.y && $$1.k()) {
                     this.c($$0, $$5);
                  }
               }

               if (($$2 & 16) == 0 && $$3 > 0) {
                  int $$8 = $$2 & -34;
                  $$6.b(this, $$0, $$8, $$3 - 1);
                  $$1.a((cgy)this, $$0, $$8, $$3 - 1);
                  $$1.b(this, $$0, $$8, $$3 - 1);
               }

               this.a($$0, $$6, $$7);
            }

            return true;
         }
      }
   }

   public void a(gt $$0, cvo $$1, cvo $$2) {
   }

   @Override
   public boolean a(gt $$0, boolean $$1) {
      dpv $$2 = this.b_($$0);
      return this.a($$0, $$2.g(), 3 | ($$1 ? 64 : 0));
   }

   @Override
   public boolean a(gt $$0, boolean $$1, @Nullable bbn $$2, int $$3) {
      cvo $$4 = this.a_($$0);
      if ($$4.h()) {
         return false;
      } else {
         dpv $$5 = this.b_($$0);
         if (!($$4.b() instanceof cjh)) {
            this.c(2001, $$0, cjt.i($$4));
         }

         if ($$1) {
            cti $$6 = $$4.o() ? this.c_($$0) : null;
            cjt.a($$4, this, $$0, $$6, $$2, cax.b);
         }

         boolean $$7 = this.a($$0, $$5.g(), 3, $$3);
         if ($$7) {
            this.a(czv.f, $$0, czv.a.a($$2, $$4));
         }

         return $$7;
      }
   }

   public void a(gt $$0, cvo $$1) {
   }

   public boolean b(gt $$0, cvo $$1) {
      return this.a($$0, $$1, 3);
   }

   public abstract void a(gt var1, cvo var2, cvo var3, int var4);

   public void b(gt $$0, cvo $$1, cvo $$2) {
   }

   public void a(gt $$0, cjt $$1) {
   }

   public void a(gt $$0, cjt $$1, gy $$2) {
   }

   public void a(gt $$0, cjt $$1, gt $$2) {
   }

   public void a(cvo $$0, gt $$1, cjt $$2, gt $$3, boolean $$4) {
   }

   @Override
   public void a(gy $$0, cvo $$1, gt $$2, gt $$3, int $$4, int $$5) {
      this.p.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int a(dar.a $$0, int $$1, int $$2) {
      int $$4;
      if ($$1 >= -30000000 && $$2 >= -30000000 && $$1 < 30000000 && $$2 < 30000000) {
         if (this.b(hq.a($$1), hq.a($$2))) {
            $$4 = this.d(hq.a($$1), hq.a($$2)).a($$0, $$1 & 15, $$2 & 15) + 1;
         } else {
            $$4 = this.u_();
         }
      } else {
         $$4 = this.m_() + 1;
      }

      return $$4;
   }

   @Override
   public dpm l_() {
      return this.I().o();
   }

   @Override
   public cvo a_(gt $$0) {
      if (this.v($$0)) {
         return cju.lM.m();
      } else {
         cxt $$1 = this.d(hq.a($$0.u()), hq.a($$0.w()));
         return $$1.a_($$0);
      }
   }

   @Override
   public dpv b_(gt $$0) {
      if (this.v($$0)) {
         return dpw.a.h();
      } else {
         cxt $$1 = this.l($$0);
         return $$1.b_($$0);
      }
   }

   public boolean M() {
      return !this.q_().a() && this.B < 4;
   }

   public boolean N() {
      return !this.q_().a() && !this.M();
   }

   @Override
   public void a(@Nullable buc $$0, gt $$1, ajv $$2, ajx $$3, float $$4, float $$5) {
      this.a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$2, $$3, $$4, $$5);
   }

   public abstract void a(@Nullable buc var1, double var2, double var4, double var6, ajv var8, ajx var9, float var10, float var11, long var12);

   public abstract void a(@Nullable buc var1, bbn var2, ajv var3, ajx var4, float var5, float var6, long var7);

   public void a(@Nullable buc $$0, double $$1, double $$2, double $$3, ajv $$4, ajx $$5, float $$6, float $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.C.g());
   }

   public void a(@Nullable buc $$0, bbn $$1, ajv $$2, ajx $$3, float $$4, float $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, this.C.g());
   }

   public void a(double $$0, double $$1, double $$2, ajv $$3, ajx $$4, float $$5, float $$6, boolean $$7) {
   }

   @Override
   public void a(im $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void a(im $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public void b(im $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
   }

   public void b(im $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
   }

   public float a(float $$0) {
      float $$1 = this.f($$0);
      return $$1 * (float) (Math.PI * 2);
   }

   public void a(cur $$0) {
      (this.c ? this.b : this.o).add($$0);
   }

   protected void O() {
      awz $$0 = this.ac();
      $$0.a("blockEntities");
      this.c = true;
      if (!this.b.isEmpty()) {
         this.o.addAll(this.b);
         this.b.clear();
      }

      Iterator<cur> $$1 = this.o.iterator();

      while($$1.hasNext()) {
         cur $$2 = (cur)$$1.next();
         if ($$2.b()) {
            $$1.remove();
         } else if (this.m($$2.c())) {
            $$2.a();
         }
      }

      this.c = false;
      $$0.c();
   }

   public <T extends bbn> void a(Consumer<T> $$0, T $$1) {
      try {
         $$0.accept($$1);
      } catch (Throwable var6) {
         q $$3 = q.a(var6, "Ticking entity");
         r $$4 = $$3.a("Entity being ticked");
         $$1.a($$4);
         throw new z($$3);
      }
   }

   public boolean h(bbn $$0) {
      return true;
   }

   public boolean a(long $$0) {
      return true;
   }

   public boolean m(gt $$0) {
      return this.a(cge.a($$0));
   }

   public cgp a(@Nullable bbn $$0, double $$1, double $$2, double $$3, float $$4, cgp.a $$5) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, false, $$5);
   }

   public cgp a(@Nullable bbn $$0, double $$1, double $$2, double $$3, float $$4, boolean $$5, cgp.a $$6) {
      return this.a($$0, null, null, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public cgp a(@Nullable bbn $$0, @Nullable baw $$1, @Nullable cgq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cgp.a $$8) {
      cgp $$9 = new cgp(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      $$9.a();
      $$9.a(true);
      return $$9;
   }

   public abstract String G();

   @Nullable
   @Override
   public cti c_(gt $$0) {
      if (this.v($$0)) {
         return null;
      } else {
         return !this.y && Thread.currentThread() != this.z ? null : this.l($$0).a($$0, cxt.b.a);
      }
   }

   public void a(cti $$0) {
      gt $$1 = $$0.p();
      if (!this.v($$1)) {
         this.l($$1).b($$0);
      }
   }

   public void n(gt $$0) {
      if (!this.v($$0)) {
         this.l($$0).d($$0);
      }
   }

   public boolean o(gt $$0) {
      return this.v($$0) ? false : this.I().b(hq.a($$0.u()), hq.a($$0.w()));
   }

   public boolean a(gt $$0, bbn $$1, gy $$2) {
      if (this.v($$0)) {
         return false;
      } else {
         cxj $$3 = this.a(hq.a($$0.u()), hq.a($$0.w()), cxn.o, false);
         return $$3 == null ? false : $$3.a_($$0).a(this, $$0, $$1, $$2);
      }
   }

   public boolean a(gt $$0, bbn $$1) {
      return this.a($$0, $$1, gy.b);
   }

   public void P() {
      double $$0 = 1.0 - (double)(this.d(1.0F) * 5.0F) / 16.0;
      double $$1 = 1.0 - (double)(this.b(1.0F) * 5.0F) / 16.0;
      double $$2 = 0.5 + 2.0 * ami.a((double)ami.b(this.f(1.0F) * (float) (Math.PI * 2)), -0.25, 0.25);
      this.B = (int)((1.0 - $$2 * $$0 * $$1) * 11.0);
   }

   public void b(boolean $$0, boolean $$1) {
      this.I().a($$0, $$1);
   }

   public gt Q() {
      gt $$0 = new gt(this.x.a(), this.x.b(), this.x.c());
      if (!this.p_().a($$0)) {
         $$0 = this.a(dar.a.e, new gt(this.p_().a(), 0.0, this.p_().b()));
      }

      return $$0;
   }

   public float R() {
      return this.x.d();
   }

   protected void S() {
      if (this.x.k()) {
         this.t = 1.0F;
         if (this.x.i()) {
            this.v = 1.0F;
         }
      }

   }

   public void close() throws IOException {
      this.I().close();
   }

   @Nullable
   @Override
   public cgd c(int $$0, int $$1) {
      return this.a($$0, $$1, cxn.o, false);
   }

   @Override
   public List<bbn> a(@Nullable bbn $$0, dwl $$1, Predicate<? super bbn> $$2) {
      this.ac().d("getEntities");
      List<bbn> $$3 = Lists.newArrayList();
      this.F().a($$1, $$3x -> {
         if ($$3x != $$0 && $$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bpp) {
            for(bpn $$4 : ((bpp)$$3x).t()) {
               if ($$3x != $$0 && $$2.test($$4)) {
                  $$3.add($$4);
               }
            }
         }

      });
      return $$3;
   }

   @Override
   public <T extends bbn> List<T> a(czj<bbn, T> $$0, dwl $$1, Predicate<? super T> $$2) {
      this.ac().d("getEntities");
      List<T> $$3 = Lists.newArrayList();
      this.F().a($$0, $$1, $$3x -> {
         if ($$2.test($$3x)) {
            $$3.add($$3x);
         }

         if ($$3x instanceof bpp $$4) {
            for(bpn $$5 : $$4.t()) {
               T $$6 = $$0.a($$5);
               if ($$6 != null && $$2.test($$6)) {
                  $$3.add($$6);
               }
            }
         }

      });
      return $$3;
   }

   @Nullable
   public abstract bbn a(int var1);

   public void p(gt $$0) {
      if (this.E($$0)) {
         this.l($$0).a(true);
      }

   }

   @Override
   public int m_() {
      return 63;
   }

   public int q(gt $$0) {
      int $$1 = 0;
      $$1 = Math.max($$1, this.c($$0.c(), gy.a));
      if ($$1 >= 15) {
         return $$1;
      } else {
         $$1 = Math.max($$1, this.c($$0.b(), gy.b));
         if ($$1 >= 15) {
            return $$1;
         } else {
            $$1 = Math.max($$1, this.c($$0.d(), gy.c));
            if ($$1 >= 15) {
               return $$1;
            } else {
               $$1 = Math.max($$1, this.c($$0.e(), gy.d));
               if ($$1 >= 15) {
                  return $$1;
               } else {
                  $$1 = Math.max($$1, this.c($$0.f(), gy.e));
                  if ($$1 >= 15) {
                     return $$1;
                  } else {
                     $$1 = Math.max($$1, this.c($$0.g(), gy.f));
                     return $$1 >= 15 ? $$1 : $$1;
                  }
               }
            }
         }
      }
   }

   public boolean a(gt $$0, gy $$1) {
      return this.b($$0, $$1) > 0;
   }

   public int b(gt $$0, gy $$1) {
      cvo $$2 = this.a_($$0);
      int $$3 = $$2.b(this, $$0, $$1);
      return $$2.g(this, $$0) ? Math.max($$3, this.q($$0)) : $$3;
   }

   public boolean r(gt $$0) {
      if (this.b($$0.c(), gy.a) > 0) {
         return true;
      } else if (this.b($$0.b(), gy.b) > 0) {
         return true;
      } else if (this.b($$0.d(), gy.c) > 0) {
         return true;
      } else if (this.b($$0.e(), gy.d) > 0) {
         return true;
      } else if (this.b($$0.f(), gy.e) > 0) {
         return true;
      } else {
         return this.b($$0.g(), gy.f) > 0;
      }
   }

   public int s(gt $$0) {
      int $$1 = 0;

      for(gy $$2 : a) {
         int $$3 = this.b($$0.a($$2), $$2);
         if ($$3 >= 15) {
            return 15;
         }

         if ($$3 > $$1) {
            $$1 = $$3;
         }
      }

      return $$1;
   }

   public void T() {
   }

   public long U() {
      return this.x.e();
   }

   public long V() {
      return this.x.f();
   }

   public boolean a(buc $$0, gt $$1) {
      return true;
   }

   public void a(bbn $$0, byte $$1) {
   }

   public void a(gt $$0, cjt $$1, int $$2, int $$3) {
      this.a_($$0).a(this, $$0, $$2, $$3);
   }

   @Override
   public drn n_() {
      return this.x;
   }

   public cgt W() {
      return this.x.q();
   }

   public float b(float $$0) {
      return ami.i($$0, this.u, this.v) * this.d($$0);
   }

   public void c(float $$0) {
      float $$1 = ami.a($$0, 0.0F, 1.0F);
      this.u = $$1;
      this.v = $$1;
   }

   public float d(float $$0) {
      return ami.i($$0, this.s, this.t);
   }

   public void e(float $$0) {
      float $$1 = ami.a($$0, 0.0F, 1.0F);
      this.s = $$1;
      this.t = $$1;
   }

   public boolean X() {
      if (this.q_().g() && !this.q_().h()) {
         return (double)this.b(1.0F) > 0.9;
      } else {
         return false;
      }
   }

   public boolean Y() {
      return (double)this.d(1.0F) > 0.2;
   }

   public boolean t(gt $$0) {
      if (!this.Y()) {
         return false;
      } else if (!this.g($$0)) {
         return false;
      } else if (this.a(dar.a.e, $$0).v() > $$0.v()) {
         return false;
      } else {
         cht $$1 = this.w($$0).a();
         return $$1.c() == cht.c.b && $$1.b($$0);
      }
   }

   public boolean u(gt $$0) {
      cht $$1 = this.w($$0).a();
      return $$1.d();
   }

   @Nullable
   public abstract drg a(String var1);

   public abstract void a(String var1, drg var2);

   public abstract int u();

   public void b(int $$0, gt $$1, int $$2) {
   }

   public r a(q $$0) {
      r $$1 = $$0.a("Affected level", 1);
      $$1.a("All players", (s<String>)(() -> this.w().size() + " total; " + this.w()));
      $$1.a("Chunk stats", this.I()::e);
      $$1.a("Level dimension", (s<String>)(() -> this.ab().a().toString()));

      try {
         this.x.a($$1, this);
      } catch (Throwable var4) {
         $$1.a("Level Data Unobtainable", var4);
      }

      return $$1;
   }

   public abstract void a(int var1, gt var2, int var3);

   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, @Nullable pj $$6) {
   }

   public abstract dxo H();

   public void c(gt $$0, cjt $$1) {
      for(gy $$2 : gy.c.a) {
         gt $$3 = $$0.a($$2);
         if (this.E($$3)) {
            cvo $$4 = this.a_($$3);
            if ($$4.a(cju.fZ)) {
               this.a($$4, $$3, $$1, $$0, false);
            } else if ($$4.g(this, $$3)) {
               $$3 = $$3.a($$2);
               $$4 = this.a_($$3);
               if ($$4.a(cju.fZ)) {
                  this.a($$4, $$3, $$1, $$0, false);
               }
            }
         }
      }

   }

   @Override
   public bah d_(gt $$0) {
      long $$1 = 0L;
      float $$2 = 0.0F;
      if (this.E($$0)) {
         $$2 = this.al();
         $$1 = this.l($$0).u();
      }

      return new bah(this.ag(), this.V(), $$1, $$2);
   }

   @Override
   public int o_() {
      return this.B;
   }

   public void c(int $$0) {
   }

   @Override
   public cxe p_() {
      return this.G;
   }

   public void a(tc<?> $$0) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public cyu q_() {
      return (cyu)this.E.a();
   }

   public aba<cyu> Z() {
      return this.D;
   }

   public hc<cyu> aa() {
      return this.E;
   }

   public aba<cgx> ab() {
      return this.I;
   }

   @Override
   public amn r_() {
      return this.w;
   }

   @Override
   public boolean a(gt $$0, Predicate<cvo> $$1) {
      return $$1.test(this.a_($$0));
   }

   @Override
   public boolean b(gt $$0, Predicate<dpv> $$1) {
      return $$1.test(this.b_($$0));
   }

   public abstract cdq q();

   public gt a(int $$0, int $$1, int $$2, int $$3) {
      this.q = this.q * 3 + 1013904223;
      int $$4 = this.q >> 2;
      return new gt($$0 + ($$4 & 15), $$1 + ($$4 >> 16 & $$3), $$2 + ($$4 >> 8 & 15));
   }

   public boolean r() {
      return false;
   }

   public awz ac() {
      return (awz)this.F.get();
   }

   public Supplier<awz> ad() {
      return this.F;
   }

   @Override
   public chv s_() {
      return this.H;
   }

   public final boolean ae() {
      return this.A;
   }

   protected abstract czl<bbn> F();

   @Override
   public long t_() {
      return (long)(this.J++);
   }
}
