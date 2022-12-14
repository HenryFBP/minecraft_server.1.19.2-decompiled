import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class agg extends cgx implements chp {
   public static final gt a = new gt(100, 50, 0);
   private static final int z = 12000;
   private static final int A = 180000;
   private static final int B = 12000;
   private static final int C = 24000;
   private static final int D = 12000;
   private static final int E = 180000;
   private static final int F = 3600;
   private static final int G = 15600;
   private static final Logger H = LogUtils.getLogger();
   private static final int I = 300;
   private static final int J = 65536;
   final List<agh> K = Lists.newArrayList();
   private final age L;
   private final MinecraftServer M;
   private final drv N;
   final czi O = new czi();
   private final czn<bbn> P;
   public boolean b;
   private final ajc Q;
   private int R;
   private final dqs S;
   private final dxx<cjt> T = new dxx<>(this::d, this.ad());
   private final dxx<dpu> U = new dxx<>(this::d, this.ad());
   final Set<bce> V = new ObjectOpenHashSet();
   volatile boolean W;
   protected final bvl c;
   private final ObjectLinkedOpenHashSet<cgc> X = new ObjectLinkedOpenHashSet();
   private final List<cgc> Y = new ArrayList(64);
   private List<czv.b> Z = new ArrayList();
   private boolean aa;
   private final List<cgk> ab;
   @Nullable
   private final cyx ac;
   final Int2ObjectMap<bpn> ad = new Int2ObjectOpenHashMap();
   private final cho ae;
   private final dlc af;
   private final boolean ag;

   public agg(MinecraftServer $$0, Executor $$1, drq.c $$2, drv $$3, aba<cgx> $$4, cyv $$5, agp $$6, boolean $$7, long $$8, List<cgk> $$9, boolean $$10) {
      super($$3, $$4, $$5.a(), $$0::aP, false, $$7, $$8, $$0.be());
      this.ag = $$10;
      this.M = $$0;
      this.ab = $$9;
      this.N = $$3;
      cxk $$11 = $$5.b();
      boolean $$12 = $$0.aU();
      DataFixer $$13 = $$0.ay();
      czf<bbn> $$14 = new cyk(this, $$2.a($$4).resolve("entities"), $$13, $$12, $$0);
      this.P = new czn<>(bbn.class, new agg.a(), $$14);
      this.L = new age(this, $$2, $$13, $$0.aV(), $$1, $$11, $$0.ac().p(), $$0.ac().q(), $$12, $$6, this.P::a, () -> $$0.C().t());
      $$11.a(this.L.h());
      this.S = new dqs(this);
      this.P();
      this.S();
      this.p_().a($$0.as());
      this.c = this.t().a($$0x -> bvl.a(this, $$0x), () -> new bvl(this), bvl.a(this.aa()));
      if (!$$0.N()) {
         $$3.a($$0.g_());
      }

      long $$15 = $$0.aW().A().a();
      this.af = new dlc(this.L.l(), this.s(), $$0.aV(), $$4, $$11, this.L.h(), this, $$11.d(), $$15, $$13);
      this.ae = new cho(this, $$0.aW().A(), this.af);
      if (this.ab() == cgx.g && this.aa().a(cys.c)) {
         this.ac = new cyx(this, $$15, $$0.aW().C());
      } else {
         this.ac = null;
      }

      this.Q = new ajc();
   }

   public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
      this.N.a($$0);
      this.N.f($$1);
      this.N.e($$1);
      this.N.b($$2);
      this.N.a($$3);
   }

   @Override
   public hc<cht> a(int $$0, int $$1, int $$2) {
      return this.k().g().d().getNoiseBiome($$0, $$1, $$2, this.k().h().c());
   }

   public cho a() {
      return this.ae;
   }

   public void a(BooleanSupplier $$0) {
      awz $$1 = this.ac();
      this.aa = true;
      $$1.a("world border");
      this.p_().s();
      $$1.b("weather");
      this.ap();
      int $$2 = this.W().c(cgt.K);
      if (this.Q.a($$2) && this.Q.a($$2, this.K)) {
         if (this.W().b(cgt.k)) {
            long $$3 = this.x.f() + 24000L;
            this.b($$3 - $$3 % 24000L);
         }

         this.an();
         if (this.W().b(cgt.u) && this.Y()) {
            this.aq();
         }
      }

      this.P();
      this.b();
      $$1.b("tickPending");
      if (!this.ae()) {
         long $$4 = this.U();
         $$1.a("blockTicks");
         this.T.a($$4, 65536, this::d);
         $$1.b("fluidTicks");
         this.U.a($$4, 65536, this::a);
         $$1.c();
      }

      $$1.b("raid");
      this.c.a();
      $$1.b("chunkSource");
      this.k().a($$0, true);
      $$1.b("blockEvents");
      this.at();
      this.aa = false;
      $$1.c();
      boolean $$5 = !this.K.isEmpty() || !this.v().isEmpty();
      if ($$5) {
         this.g();
      }

      if ($$5 || this.R++ < 300) {
         $$1.a("entities");
         if (this.ac != null) {
            $$1.a("dragonFight");
            this.ac.b();
            $$1.c();
         }

         this.O.a($$1x -> {
            if (!$$1x.dt()) {
               if (this.i($$1x)) {
                  $$1x.ah();
               } else {
                  $$1.a("checkDespawn");
                  $$1x.dm();
                  $$1.c();
                  if (this.L.a.i().c($$1x.dc().a())) {
                     bbn $$2x = $$1x.cQ();
                     if ($$2x != null) {
                        if (!$$2x.dt() && $$2x.u($$1x)) {
                           return;
                        }

                        $$1x.p();
                     }

                     $$1.a("tick");
                     this.a(this::a, $$1x);
                     $$1.c();
                  }
               }
            }
         });
         $$1.c();
         this.O();
      }

      $$1.a("entityManagement");
      this.P.a();
      $$1.b("gameEvents");
      this.as();
      $$1.c();
   }

   @Override
   public boolean a(long $$0) {
      return this.L.a.i().d($$0);
   }

   protected void b() {
      if (this.ag) {
         long $$0 = this.x.e() + 1L;
         this.N.a($$0);
         this.N.u().a(this.M, $$0);
         if (this.x.q().b(cgt.k)) {
            this.b(this.x.f() + 1L);
         }

      }
   }

   public void b(long $$0) {
      this.N.b($$0);
   }

   public void a(boolean $$0, boolean $$1) {
      for(cgk $$2 : this.ab) {
         $$2.a(this, $$0, $$1);
      }

   }

   private boolean i(bbn $$0) {
      if (this.M.V() || !($$0 instanceof bne) && !($$0 instanceof bog)) {
         return !this.M.W() && $$0 instanceof bto;
      } else {
         return true;
      }
   }

   private void an() {
      this.Q.a();
      ((List)this.K.stream().filter(bcc::fj).collect(Collectors.toList())).forEach($$0 -> $$0.a(false, false));
   }

   public void a(cxt $$0, int $$1) {
      cge $$2 = $$0.f();
      boolean $$3 = this.Y();
      int $$4 = $$2.d();
      int $$5 = $$2.e();
      awz $$6 = this.ac();
      $$6.a("thunder");
      if ($$3 && this.X() && this.w.a(100000) == 0) {
         gt $$7 = this.a(this.a($$4, 0, $$5, 15));
         if (this.t($$7)) {
            bah $$8 = this.d_($$7);
            boolean $$9 = this.W().b(cgt.e) && this.w.j() < (double)$$8.b() * 0.01 && !this.a_($$7.c()).a(cju.qb);
            if ($$9) {
               bpg $$10 = bbr.aF.a((cgx)this);
               $$10.v(true);
               $$10.b_(0);
               $$10.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               this.b($$10);
            }

            bcb $$11 = bbr.X.a((cgx)this);
            $$11.d(dwq.c($$7));
            $$11.a($$9);
            this.b($$11);
         }
      }

      $$6.b("iceandsnow");
      if (this.w.a(16) == 0) {
         gt $$12 = this.a(dar.a.e, this.a($$4, 0, $$5, 15));
         gt $$13 = $$12.c();
         cht $$14 = this.w($$12).a();
         if ($$14.a(this, $$13)) {
            this.b($$13, cju.cX.m());
         }

         if ($$3) {
            if ($$14.b(this, $$12)) {
               this.b($$12, cju.cW.m());
            }

            cvo $$15 = this.a_($$13);
            cht.c $$16 = $$14.c();
            if ($$16 == cht.c.b && $$14.a($$13)) {
               $$16 = cht.c.c;
            }

            $$15.b().a($$15, this, $$13, $$16);
         }
      }

      $$6.b("tickBlocks");
      if ($$1 > 0) {
         for(cxu $$17 : $$0.d()) {
            if ($$17.d()) {
               int $$18 = $$17.g();

               for(int $$19 = 0; $$19 < $$1; ++$$19) {
                  gt $$20 = this.a($$4, $$18, $$5, 15);
                  $$6.a("randomTick");
                  cvo $$21 = $$17.a($$20.u() - $$4, $$20.v() - $$18, $$20.w() - $$5);
                  if ($$21.q()) {
                     $$21.b(this, $$20, this.w);
                  }

                  dpv $$22 = $$21.p();
                  if ($$22.f()) {
                     $$22.b(this, $$20, this.w);
                  }

                  $$6.c();
               }
            }
         }
      }

      $$6.c();
   }

   private Optional<gt> F(gt $$0) {
      Optional<gt> $$1 = this.x().e($$0x -> $$0x.a(bmw.t), $$0x -> $$0x.v() == this.a(dar.a.b, $$0x.u(), $$0x.w()) - 1, $$0, 128, bms.b.c);
      return $$1.map($$0x -> $$0x.b(1));
   }

   protected gt a(gt $$0) {
      gt $$1 = this.a(dar.a.e, $$0);
      Optional<gt> $$2 = this.F($$1);
      if ($$2.isPresent()) {
         return (gt)$$2.get();
      } else {
         dwl $$3 = new dwl($$1, new gt($$1.u(), this.ah(), $$1.w())).g(3.0);
         List<bcc> $$4 = this.a(bcc.class, $$3, $$0x -> $$0x != null && $$0x.bo() && this.g($$0x.da()));
         if (!$$4.isEmpty()) {
            return ((bcc)$$4.get(this.w.a($$4.size()))).da();
         } else {
            if ($$1.v() == this.u_() - 1) {
               $$1 = $$1.b(2);
            }

            return $$1;
         }
      }
   }

   public boolean c() {
      return this.aa;
   }

   public boolean d() {
      return this.W().c(cgt.K) <= 100;
   }

   private void ao() {
      if (this.d()) {
         if (!this.n().N() || this.n().o()) {
            int $$0 = this.W().c(cgt.K);
            rq $$1;
            if (this.Q.a($$0)) {
               $$1 = rq.c("sleep.skipping_night");
            } else {
               $$1 = rq.a("sleep.players_sleeping", this.Q.b(), this.Q.b($$0));
            }

            for(agh $$3 : this.K) {
               $$3.a($$1, true);
            }

         }
      }
   }

   public void e() {
      if (!this.K.isEmpty() && this.Q.a(this.K)) {
         this.ao();
      }

   }

   public abq f() {
      return this.M.aF();
   }

   private void ap() {
      boolean $$0 = this.Y();
      if (this.q_().g()) {
         if (this.W().b(cgt.u)) {
            int $$1 = this.N.h();
            int $$2 = this.N.j();
            int $$3 = this.N.l();
            boolean $$4 = this.x.i();
            boolean $$5 = this.x.k();
            if ($$1 > 0) {
               --$$1;
               $$2 = $$4 ? 0 : 1;
               $$3 = $$5 ? 0 : 1;
               $$4 = false;
               $$5 = false;
            } else {
               if ($$2 > 0) {
                  if (--$$2 == 0) {
                     $$4 = !$$4;
                  }
               } else if ($$4) {
                  $$2 = ami.b(this.w, 3600, 15600);
               } else {
                  $$2 = ami.b(this.w, 12000, 180000);
               }

               if ($$3 > 0) {
                  if (--$$3 == 0) {
                     $$5 = !$$5;
                  }
               } else if ($$5) {
                  $$3 = ami.b(this.w, 12000, 24000);
               } else {
                  $$3 = ami.b(this.w, 12000, 180000);
               }
            }

            this.N.e($$2);
            this.N.f($$3);
            this.N.a($$1);
            this.N.a($$4);
            this.N.b($$5);
         }

         this.u = this.v;
         if (this.x.i()) {
            this.v += 0.01F;
         } else {
            this.v -= 0.01F;
         }

         this.v = ami.a(this.v, 0.0F, 1.0F);
         this.s = this.t;
         if (this.x.k()) {
            this.t += 0.01F;
         } else {
            this.t -= 0.01F;
         }

         this.t = ami.a(this.t, 0.0F, 1.0F);
      }

      if (this.s != this.t) {
         this.M.ac().a(new uj(uj.h, this.t), this.ab());
      }

      if (this.u != this.v) {
         this.M.ac().a(new uj(uj.i, this.v), this.ab());
      }

      if ($$0 != this.Y()) {
         if ($$0) {
            this.M.ac().a(new uj(uj.c, 0.0F));
         } else {
            this.M.ac().a(new uj(uj.b, 0.0F));
         }

         this.M.ac().a(new uj(uj.h, this.t));
         this.M.ac().a(new uj(uj.i, this.v));
      }

   }

   private void aq() {
      this.N.f(0);
      this.N.b(false);
      this.N.e(0);
      this.N.a(false);
   }

   public void g() {
      this.R = 0;
   }

   private void a(gt $$0, dpu $$1) {
      dpv $$2 = this.b_($$0);
      if ($$2.b($$1)) {
         $$2.a((cgx)this, $$0);
      }

   }

   private void d(gt $$0, cjt $$1) {
      cvo $$2 = this.a_($$0);
      if ($$2.a($$1)) {
         $$2.a(this, $$0, this.w);
      }

   }

   public void a(bbn $$0) {
      $$0.bh();
      awz $$1 = this.ac();
      ++$$0.S;
      this.ac().a((Supplier<String>)(() -> hm.X.b($$0.ad()).toString()));
      $$1.d("tickNonPassenger");
      $$0.k();
      this.ac().c();

      for(bbn $$2 : $$0.cI()) {
         this.a($$0, $$2);
      }

   }

   private void a(bbn $$0, bbn $$1) {
      if ($$1.dt() || $$1.cQ() != $$0) {
         $$1.p();
      } else if ($$1 instanceof buc || this.O.c($$1)) {
         $$1.bh();
         ++$$1.S;
         awz $$2 = this.ac();
         $$2.a((Supplier<String>)(() -> hm.X.b($$1.ad()).toString()));
         $$2.d("tickPassenger");
         $$1.br();
         $$2.c();

         for(bbn $$3 : $$1.cI()) {
            this.a($$1, $$3);
         }

      }
   }

   @Override
   public boolean a(buc $$0, gt $$1) {
      return !this.M.a(this, $$1, $$0) && this.p_().a($$1);
   }

   public void a(@Nullable amm $$0, boolean $$1, boolean $$2) {
      age $$3 = this.k();
      if (!$$2) {
         if ($$0 != null) {
            $$0.a(rq.c("menu.savingLevel"));
         }

         this.ar();
         if ($$0 != null) {
            $$0.c(rq.c("menu.savingChunks"));
         }

         $$3.a($$1);
         if ($$1) {
            this.P.c();
         } else {
            this.P.b();
         }

      }
   }

   private void ar() {
      if (this.ac != null) {
         this.M.aW().a(this.ac.a());
      }

      this.k().j().a();
   }

   public <T extends bbn> List<? extends T> a(czj<bbn, T> $$0, Predicate<? super T> $$1) {
      List<T> $$2 = Lists.newArrayList();
      this.F().a($$0, $$2x -> {
         if ($$1.test($$2x)) {
            $$2.add($$2x);
         }

      });
      return $$2;
   }

   public List<? extends bpp> h() {
      return this.a(bbr.x, bcc::bo);
   }

   public List<agh> a(Predicate<? super agh> $$0) {
      List<agh> $$1 = Lists.newArrayList();

      for(agh $$2 : this.K) {
         if ($$0.test($$2)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   @Nullable
   public agh i() {
      List<agh> $$0 = this.a(bcc::bo);
      return $$0.isEmpty() ? null : (agh)$$0.get(this.w.a($$0.size()));
   }

   @Override
   public boolean b(bbn $$0) {
      return this.j($$0);
   }

   public boolean c(bbn $$0) {
      return this.j($$0);
   }

   public void d(bbn $$0) {
      this.j($$0);
   }

   public void a(agh $$0) {
      this.e($$0);
   }

   public void b(agh $$0) {
      this.e($$0);
   }

   public void c(agh $$0) {
      this.e($$0);
   }

   public void d(agh $$0) {
      this.e($$0);
   }

   private void e(agh $$0) {
      bbn $$1 = this.F().a($$0.co());
      if ($$1 != null) {
         H.warn("Force-added player with duplicate UUID {}", $$0.co().toString());
         $$1.ab();
         this.a((agh)$$1, bbn.c.b);
      }

      this.P.a($$0);
   }

   private boolean j(bbn $$0) {
      if ($$0.dt()) {
         H.warn("Tried to add entity {} but it was marked as removed already", bbr.a($$0.ad()));
         return false;
      } else {
         return this.P.a($$0);
      }
   }

   public boolean e(bbn $$0) {
      if ($$0.cK().map(bbn::co).anyMatch(this.P::a)) {
         return false;
      } else {
         this.a_($$0);
         return true;
      }
   }

   public void a(cxt $$0) {
      $$0.G();
      $$0.b(this);
   }

   public void a(agh $$0, bbn.c $$1) {
      $$0.a($$1);
   }

   @Override
   public void a(int $$0, gt $$1, int $$2) {
      for(agh $$3 : this.M.ac().t()) {
         if ($$3 != null && $$3.s == this && $$3.ae() != $$0) {
            double $$4 = (double)$$1.u() - $$3.df();
            double $$5 = (double)$$1.v() - $$3.dh();
            double $$6 = (double)$$1.w() - $$3.dl();
            if ($$4 * $$4 + $$5 * $$5 + $$6 * $$6 < 1024.0) {
               $$3.b.a(new tm($$0, $$1, $$2));
            }
         }
      }

   }

   @Override
   public void a(@Nullable buc $$0, double $$1, double $$2, double $$3, ajv $$4, ajx $$5, float $$6, float $$7, long $$8) {
      this.M.ac().a($$0, $$1, $$2, $$3, (double)$$4.a($$6), this.ab(), new wy($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
   }

   @Override
   public void a(@Nullable buc $$0, bbn $$1, ajv $$2, ajx $$3, float $$4, float $$5, long $$6) {
      this.M.ac().a($$0, $$1.df(), $$1.dh(), $$1.dl(), (double)$$2.a($$4), this.ab(), new wx($$2, $$3, $$1, $$4, $$5, $$6));
   }

   @Override
   public void b(int $$0, gt $$1, int $$2) {
      this.M.ac().a(new up($$0, $$1, $$2, true));
   }

   @Override
   public void a(@Nullable buc $$0, int $$1, gt $$2, int $$3) {
      this.M.ac().a($$0, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 64.0, this.ab(), new up($$1, $$2, $$3, false));
   }

   public int j() {
      return this.q_().p();
   }

   @Override
   public void a(czv $$0, dwq $$1, czv.a $$2) {
      int $$3 = $$0.b();
      gt $$4 = new gt($$1);
      int $$5 = hq.a($$4.u() - $$3);
      int $$6 = hq.a($$4.v() - $$3);
      int $$7 = hq.a($$4.w() - $$3);
      int $$8 = hq.a($$4.u() + $$3);
      int $$9 = hq.a($$4.v() + $$3);
      int $$10 = hq.a($$4.w() + $$3);
      List<czv.b> $$11 = new ArrayList();
      boolean $$12 = false;

      for(int $$13 = $$5; $$13 <= $$8; ++$$13) {
         for(int $$14 = $$7; $$14 <= $$10; ++$$14) {
            cxj $$15 = this.k().a($$13, $$14);
            if ($$15 != null) {
               for(int $$16 = $$6; $$16 <= $$9; ++$$16) {
                  $$12 |= $$15.a($$16).a($$0, $$1, $$2, ($$4x, $$5x) -> ($$4x.c() ? $$11 : this.Z).add(new czv.b($$0, $$1, $$2, $$4x, $$5x)));
               }
            }
         }
      }

      if (!$$11.isEmpty()) {
         this.a($$11);
      }

      if ($$12) {
         xl.a(this, $$0, $$1);
      }

   }

   private void as() {
      if (!this.Z.isEmpty()) {
         List<czv.b> $$0 = this.Z;
         this.Z = new ArrayList();
         this.a($$0);
      }
   }

   private void a(List<czv.b> $$0) {
      Collections.sort($$0);

      for(czv.b $$1 : $$0) {
         czx $$2 = $$1.d();
         $$2.a(this, $$1);
      }

   }

   @Override
   public void a(gt $$0, cvo $$1, cvo $$2, int $$3) {
      if (this.W) {
         String $$4 = "recursive call to sendBlockUpdated";
         ad.a("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.k().a($$0);
      dxj $$5 = $$1.k(this, $$0);
      dxj $$6 = $$2.k(this, $$0);
      if (dxg.c($$5, $$6, dwu.g)) {
         List<blc> $$7 = new ObjectArrayList();

         for(bce $$8 : this.V) {
            blc $$9 = $$8.D();
            if ($$9.b($$0)) {
               $$7.add($$9);
            }
         }

         try {
            this.W = true;

            for(blc $$10 : $$7) {
               $$10.i();
            }
         } finally {
            this.W = false;
         }

      }
   }

   @Override
   public void a(gt $$0, cjt $$1) {
      this.p.a($$0, $$1, null);
   }

   @Override
   public void a(gt $$0, cjt $$1, gy $$2) {
      this.p.a($$0, $$1, $$2);
   }

   @Override
   public void a(gt $$0, cjt $$1, gt $$2) {
      this.p.a($$0, $$1, $$2);
   }

   @Override
   public void a(cvo $$0, gt $$1, cjt $$2, gt $$3, boolean $$4) {
      this.p.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bbn $$0, byte $$1) {
      this.k().a($$0, new ug($$0, $$1));
   }

   public age k() {
      return this.L;
   }

   @Override
   public cgp a(@Nullable bbn $$0, @Nullable baw $$1, @Nullable cgq $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, cgp.a $$8) {
      cgp $$9 = new cgp(this, $$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      $$9.a();
      $$9.a(false);
      if ($$8 == cgp.a.a) {
         $$9.e();
      }

      for(agh $$10 : this.K) {
         if ($$10.h($$3, $$4, $$5) < 4096.0) {
            $$10.b.a(new uh($$3, $$4, $$5, $$6, $$9.f(), (dwq)$$9.c().get($$10)));
         }
      }

      return $$9;
   }

   @Override
   public void a(gt $$0, cjt $$1, int $$2, int $$3) {
      this.X.add(new cgc($$0, $$1, $$2, $$3));
   }

   private void at() {
      this.Y.clear();

      while(!this.X.isEmpty()) {
         cgc $$0 = (cgc)this.X.removeFirst();
         if (this.m($$0.a())) {
            if (this.a($$0)) {
               this.M.ac().a(null, (double)$$0.a().u(), (double)$$0.a().v(), (double)$$0.a().w(), 64.0, this.ab(), new to($$0.a(), $$0.b(), $$0.c(), $$0.d()));
            }
         } else {
            this.Y.add($$0);
         }
      }

      this.X.addAll(this.Y);
   }

   private boolean a(cgc $$0) {
      cvo $$1 = this.a_($$0.a());
      return $$1.a($$0.b()) ? $$1.a(this, $$0.a(), $$0.c(), $$0.d()) : false;
   }

   public dxx<cjt> l() {
      return this.T;
   }

   public dxx<dpu> m() {
      return this.U;
   }

   @Nonnull
   @Override
   public MinecraftServer n() {
      return this.M;
   }

   public dqs o() {
      return this.S;
   }

   public dou p() {
      return this.M.aV();
   }

   public <T extends im> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
      uq $$9 = new uq($$0, false, $$1, $$2, $$3, (float)$$5, (float)$$6, (float)$$7, (float)$$8, $$4);
      int $$10 = 0;

      for(int $$11 = 0; $$11 < this.K.size(); ++$$11) {
         agh $$12 = (agh)this.K.get($$11);
         if (this.a($$12, false, $$1, $$2, $$3, $$9)) {
            ++$$10;
         }
      }

      return $$10;
   }

   public <T extends im> boolean a(agh $$0, T $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
      tc<?> $$11 = new uq($$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
      return this.a($$0, $$2, $$3, $$4, $$5, $$11);
   }

   private boolean a(agh $$0, boolean $$1, double $$2, double $$3, double $$4, tc<?> $$5) {
      if ($$0.x() != this) {
         return false;
      } else {
         gt $$6 = $$0.da();
         if ($$6.a(new dwq($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.b.a($$5);
            return true;
         } else {
            return false;
         }
      }
   }

   @Nullable
   @Override
   public bbn a(int $$0) {
      return this.F().a($$0);
   }

   @Deprecated
   @Nullable
   public bbn b(int $$0) {
      bbn $$1 = this.F().a($$0);
      return $$1 != null ? $$1 : (bbn)this.ad.get($$0);
   }

   @Nullable
   public bbn a(UUID $$0) {
      return this.F().a($$0);
   }

   @Nullable
   public gt a(akz<dlb> $$0, gt $$1, int $$2, boolean $$3) {
      if (!this.M.aW().A().b()) {
         return null;
      } else {
         Optional<he.c<dlb>> $$4 = this.s().d(hm.aN).c($$0);
         if ($$4.isEmpty()) {
            return null;
         } else {
            Pair<gt, hc<dlb>> $$5 = this.k().g().a(this, (he<dlb>)$$4.get(), $$1, $$2, $$3);
            return $$5 != null ? (gt)$$5.getFirst() : null;
         }
      }
   }

   @Nullable
   public Pair<gt, hc<cht>> a(Predicate<hc<cht>> $$0, gt $$1, int $$2, int $$3, int $$4) {
      return this.k().g().d().a($$1, $$2, $$3, $$4, $$0, this.k().h().c(), this);
   }

   @Override
   public cdq q() {
      return this.M.aE();
   }

   @Override
   public boolean r() {
      return this.b;
   }

   @Override
   public hn s() {
      return this.M.aX();
   }

   public drm t() {
      return this.k().j();
   }

   @Nullable
   @Override
   public drg a(String $$0) {
      return this.n().C().t().a(drg::b, $$0);
   }

   @Override
   public void a(String $$0, drg $$1) {
      this.n().C().t().a($$0, $$1);
   }

   @Override
   public int u() {
      return this.n().C().t().<drf>a(drf::b, drf::new, "idcounts").a();
   }

   public void a(gt $$0, float $$1) {
      cge $$2 = new cge(new gt(this.x.a(), 0, this.x.c()));
      this.x.a($$0, $$1);
      this.k().b(agl.a, $$2, 11, anf.a);
      this.k().a(agl.a, new cge($$0), 11, anf.a);
      this.n().ac().a(new wf($$0, $$1));
   }

   public LongSet v() {
      cgs $$0 = this.t().a(cgs::b, "chunks");
      return (LongSet)($$0 != null ? LongSets.unmodifiable($$0.a()) : LongSets.EMPTY_SET);
   }

   public boolean a(int $$0, int $$1, boolean $$2) {
      cgs $$3 = this.t().a(cgs::b, cgs::new, "chunks");
      cge $$4 = new cge($$0, $$1);
      long $$5 = $$4.a();
      boolean $$6;
      if ($$2) {
         $$6 = $$3.a().add($$5);
         if ($$6) {
            this.d($$0, $$1);
         }
      } else {
         $$6 = $$3.a().remove($$5);
      }

      $$3.a($$6);
      if ($$6) {
         this.k().a($$4, $$2);
      }

      return $$6;
   }

   @Override
   public List<agh> w() {
      return this.K;
   }

   @Override
   public void a(gt $$0, cvo $$1, cvo $$2) {
      Optional<hc<bmv>> $$3 = bmw.a($$1);
      Optional<hc<bmv>> $$4 = bmw.a($$2);
      if (!Objects.equals($$3, $$4)) {
         gt $$5 = $$0.h();
         $$3.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5);
               xl.b(this, $$5);
            }));
         $$4.ifPresent($$1x -> this.n().execute(() -> {
               this.x().a($$5, $$1x);
               xl.a(this, $$5);
            }));
      }
   }

   public bms x() {
      return this.k().k();
   }

   public boolean b(gt $$0) {
      return this.a($$0, 1);
   }

   public boolean a(hq $$0) {
      return this.b($$0.q());
   }

   public boolean a(gt $$0, int $$1) {
      if ($$1 > 6) {
         return false;
      } else {
         return this.b(hq.a($$0)) <= $$1;
      }
   }

   public int b(hq $$0) {
      return this.x().a($$0);
   }

   public bvl y() {
      return this.c;
   }

   @Nullable
   public bvj c(gt $$0) {
      return this.c.a($$0, 9216);
   }

   public boolean d(gt $$0) {
      return this.c($$0) != null;
   }

   public void a(bmp $$0, bbn $$1, bcq $$2) {
      $$2.a($$0, $$1);
   }

   public void a(Path $$0) throws IOException {
      aft $$1 = this.k().a;
      Writer $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"));

      try {
         $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.i().b()));
         chi.d $$3 = this.k().m();
         if ($$3 != null) {
            ObjectIterator $$9 = $$3.b().object2IntEntrySet().iterator();

            while($$9.hasNext()) {
               Entry<bcf> $$4 = (Entry)$$9.next();
               $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((bcf)$$4.getKey()).a(), $$4.getIntValue()));
            }
         }

         $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.P.e()));
         $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.o.size()));
         $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.l().a()));
         $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.m().a()));
         $$2.write("distance_manager: " + $$1.i().c() + "\n");
         $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.k().f()));
      } catch (Throwable var22) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (Throwable var16) {
               var22.addSuppressed(var16);
            }
         }

         throw var22;
      }

      if ($$2 != null) {
         $$2.close();
      }

      q $$5 = new q("Level dump", new Exception("dummy"));
      this.a($$5);
      Writer $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"));

      try {
         $$6.write($$5.e());
      } catch (Throwable var21) {
         if ($$6 != null) {
            try {
               $$6.close();
            } catch (Throwable var15) {
               var21.addSuppressed(var15);
            }
         }

         throw var21;
      }

      if ($$6 != null) {
         $$6.close();
      }

      Path $$7 = $$0.resolve("chunks.csv");
      Writer $$8 = Files.newBufferedWriter($$7);

      try {
         $$1.a($$8);
      } catch (Throwable var20) {
         if ($$8 != null) {
            try {
               $$8.close();
            } catch (Throwable var14) {
               var20.addSuppressed(var14);
            }
         }

         throw var20;
      }

      if ($$8 != null) {
         $$8.close();
      }

      Path $$9 = $$0.resolve("entity_chunks.csv");
      Writer $$10 = Files.newBufferedWriter($$9);

      try {
         this.P.a($$10);
      } catch (Throwable var19) {
         if ($$10 != null) {
            try {
               $$10.close();
            } catch (Throwable var13) {
               var19.addSuppressed(var13);
            }
         }

         throw var19;
      }

      if ($$10 != null) {
         $$10.close();
      }

      Path $$11 = $$0.resolve("entities.csv");
      Writer $$12 = Files.newBufferedWriter($$11);

      try {
         a($$12, this.F().a());
      } catch (Throwable var18) {
         if ($$12 != null) {
            try {
               $$12.close();
            } catch (Throwable var12) {
               var18.addSuppressed(var12);
            }
         }

         throw var18;
      }

      if ($$12 != null) {
         $$12.close();
      }

      Path $$13 = $$0.resolve("block_entities.csv");
      Writer $$14 = Files.newBufferedWriter($$13);

      try {
         this.a($$14);
      } catch (Throwable var17) {
         if ($$14 != null) {
            try {
               $$14.close();
            } catch (Throwable var11) {
               var17.addSuppressed(var11);
            }
         }

         throw var17;
      }

      if ($$14 != null) {
         $$14.close();
      }

   }

   private static void a(Writer $$0, Iterable<bbn> $$1) throws IOException {
      alk $$2 = alk.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);

      for(bbn $$3 : $$1) {
         rq $$4 = $$3.Z();
         rq $$5 = $$3.C_();
         $$2.a($$3.df(), $$3.dh(), $$3.dl(), $$3.co(), hm.X.b($$3.ad()), $$3.bo(), $$5.getString(), $$4 != null ? $$4.getString() : null);
      }

   }

   private void a(Writer $$0) throws IOException {
      alk $$1 = alk.a().a("x").a("y").a("z").a("type").a($$0);

      for(cur $$2 : this.o) {
         gt $$3 = $$2.c();
         $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
      }

   }

   @VisibleForTesting
   public void a(dkt $$0) {
      this.X.removeIf($$1 -> $$0.b($$1.a()));
   }

   @Override
   public void b(gt $$0, cjt $$1) {
      if (!this.ae()) {
         this.a($$0, $$1);
      }

   }

   @Override
   public float a(gy $$0, boolean $$1) {
      return 1.0F;
   }

   public Iterable<bbn> z() {
      return this.F().a();
   }

   public String toString() {
      return "ServerLevel[" + this.N.g() + "]";
   }

   public boolean A() {
      return this.M.aW().A().h();
   }

   @Override
   public long B() {
      return this.M.aW().A().a();
   }

   @Nullable
   public cyx C() {
      return this.ac;
   }

   @Override
   public agg D() {
      return this;
   }

   @VisibleForTesting
   public String E() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.K.size(),
         this.P.e(),
         a(this.P.d().a(), $$0 -> hm.X.b($$0.ad()).toString()),
         this.o.size(),
         a(this.o, cur::d),
         this.l().a(),
         this.m().a(),
         this.G()
      );
   }

   private static <T> String a(Iterable<T> $$0, Function<T, String> $$1) {
      try {
         Object2IntOpenHashMap<String> $$2 = new Object2IntOpenHashMap();

         for(T $$3 : $$0) {
            String $$4 = (String)$$1.apply($$3);
            $$2.addTo($$4, 1);
         }

         return (String)$$2.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(Entry::getIntValue).reversed())
            .limit(5L)
            .map($$0x -> (String)$$0x.getKey() + ":" + $$0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception var6) {
         return "";
      }
   }

   public static void a(agg $$0) {
      gt $$1 = a;
      int $$2 = $$1.u();
      int $$3 = $$1.v() - 2;
      int $$4 = $$1.w();
      gt.b($$2 - 2, $$3 + 1, $$4 - 2, $$2 + 2, $$3 + 3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cju.a.m()));
      gt.b($$2 - 2, $$3, $$4 - 2, $$2 + 2, $$3, $$4 + 2).forEach($$1x -> $$0.b($$1x, cju.bZ.m()));
   }

   @Override
   protected czl<bbn> F() {
      return this.P.d();
   }

   public void a(Stream<bbn> $$0) {
      this.P.a($$0);
   }

   public void b(Stream<bbn> $$0) {
      this.P.b($$0);
   }

   public void b(cxt $$0) {
      $$0.c(this.n_().e());
   }

   public void a(cxj $$0) {
      this.M.execute(() -> this.af.a($$0.f(), $$0.g()));
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.P.close();
   }

   @Override
   public String G() {
      return "Chunks[S] W: " + this.L.e() + " E: " + this.P.e();
   }

   public boolean c(long $$0) {
      return this.P.a($$0);
   }

   private boolean d(long $$0) {
      return this.c($$0) && this.L.a($$0);
   }

   public boolean e(gt $$0) {
      return this.P.a($$0) && this.L.a.i().c(cge.a($$0));
   }

   public boolean f(gt $$0) {
      return this.P.a($$0);
   }

   public boolean a(cge $$0) {
      return this.P.a($$0);
   }

   final class a implements czk<bbn> {
      public void a(bbn $$0) {
      }

      public void b(bbn $$0) {
         agg.this.f().a($$0);
      }

      public void c(bbn $$0) {
         agg.this.O.a($$0);
      }

      public void d(bbn $$0) {
         agg.this.O.b($$0);
      }

      public void e(bbn $$0) {
         agg.this.k().b($$0);
         if ($$0 instanceof agh $$1) {
            agg.this.K.add($$1);
            agg.this.e();
         }

         if ($$0 instanceof bce $$2) {
            if (agg.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            agg.this.V.add($$2);
         }

         if ($$0 instanceof bpp $$4) {
            for(bpn $$5 : $$4.t()) {
               agg.this.ad.put($$5.ae(), $$5);
            }
         }

         $$0.a(czs::a);
      }

      public void f(bbn $$0) {
         agg.this.k().a($$0);
         if ($$0 instanceof agh $$1) {
            agg.this.K.remove($$1);
            agg.this.e();
         }

         if ($$0 instanceof bce $$2) {
            if (agg.this.W) {
               String $$3 = "onTrackingStart called during navigation iteration";
               ad.a("onTrackingStart called during navigation iteration", new IllegalStateException("onTrackingStart called during navigation iteration"));
            }

            agg.this.V.remove($$2);
         }

         if ($$0 instanceof bpp $$4) {
            for(bpn $$5 : $$4.t()) {
               agg.this.ad.remove($$5.ae());
            }
         }

         $$0.a(czs::b);
      }

      public void g(bbn $$0) {
         $$0.a(czs::c);
      }
   }
}
