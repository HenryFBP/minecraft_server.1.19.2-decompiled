import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class aiz {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final rq f = rq.c("chat.filtered_full");
   private static final Logger a = LogUtils.getLogger();
   private static final int h = 600;
   private static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer j;
   private final List<agh> k = Lists.newArrayList();
   private final Map<UUID, agh> l = Maps.newHashMap();
   private final ajf m = new ajf(b);
   private final aiw n = new aiw(c);
   private final aja o = new aja(d);
   private final ajh p = new ajh(e);
   private final Map<UUID, akc> q = Maps.newHashMap();
   private final Map<UUID, abj> r = Maps.newHashMap();
   private final drt s;
   private boolean t;
   private final hn.a u;
   protected final int g;
   private int v;
   private int w;
   private boolean x;
   private static final boolean y = false;
   private int z;

   public aiz(MinecraftServer $$0, hn.a $$1, drt $$2, int $$3) {
      this.j = $$0;
      this.u = $$1;
      this.g = $$3;
      this.s = $$2;
   }

   public void a(qv $$0, agh $$1) {
      GameProfile $$2 = $$1.fy();
      aiv $$3 = this.j.ap();
      Optional<GameProfile> $$4 = $$3.a($$2.getId());
      String $$5 = (String)$$4.map(GameProfile::getName).orElse($$2.getName());
      $$3.a($$2);
      pj $$6 = this.a($$1);
      aba<cgx> $$7 = $$6 != null ? (aba)cyu.a(new Dynamic(pu.a, $$6.c("Dimension"))).resultOrPartial(a::error).orElse(cgx.e) : cgx.e;
      agg $$8 = this.j.a($$7);
      agg $$9;
      if ($$8 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$7);
         $$9 = this.j.C();
      } else {
         $$9 = $$8;
      }

      $$1.c($$9);
      String $$11 = "local";
      if ($$0.c() != null) {
         $$11 = $$0.c().toString();
      }

      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.X().getString(), $$11, $$1.ae(), $$1.df(), $$1.dh(), $$1.dl()});
      drn $$12 = $$9.n_();
      $$1.c($$6);
      agz $$13 = new agz(this.j, $$0, $$1);
      cgt $$14 = $$9.W();
      boolean $$15 = $$14.b(cgt.A);
      boolean $$16 = $$14.b(cgt.p);
      $$13.a(
         new ut(
            $$1.ae(),
            $$12.n(),
            $$1.d.b(),
            $$1.d.c(),
            this.j.D(),
            this.u,
            $$9.Z(),
            $$9.ab(),
            chv.a($$9.B()),
            this.n(),
            this.v,
            this.w,
            $$16,
            !$$15,
            $$9.ae(),
            $$9.A(),
            $$1.ga()
         )
      );
      $$13.a(new uc(uc.a, new qx(Unpooled.buffer()).a(this.c().getServerModName())));
      $$13.a(new tr($$12.s(), $$12.t()));
      $$13.a(new vd($$1.fB()));
      $$13.a(new wc($$1.fA().k));
      $$13.a(new xi(this.j.aE().b()));
      $$13.a(new xj(alc.a(this.u)));
      this.d($$1);
      $$1.D().c();
      $$1.E().a($$1);
      this.a($$9.f(), $$1);
      this.j.ar();
      sb $$17;
      if ($$1.fy().getName().equalsIgnoreCase($$5)) {
         $$17 = rq.a("multiplayer.player.joined", $$1.C_());
      } else {
         $$17 = rq.a("multiplayer.player.joined.renamed", $$1.C_(), $$5);
      }

      this.a($$17.a(p.o), false);
      $$13.b($$1.df(), $$1.dh(), $$1.dl(), $$1.dq(), $$1.ds());
      this.k.add($$1);
      this.l.put($$1.co(), $$1);
      this.a(new vj(vj.a.a, $$1));

      for(int $$19 = 0; $$19 < this.k.size(); ++$$19) {
         $$1.b.a(new vj(vj.a.a, (agh)this.k.get($$19)));
      }

      $$9.c($$1);
      this.j.aL().a($$1);
      this.a($$1, $$9);
      this.j.R().ifPresent($$1x -> $$1.a($$1x.a(), $$1x.b(), $$1x.c(), $$1x.d()));
      $$1.a(this.j.aq());

      for(bbg $$20 : $$1.ec()) {
         $$13.a(new xh($$1.ae(), $$20));
      }

      if ($$6 != null && $$6.b("RootVehicle", 10)) {
         pj $$21 = $$6.p("RootVehicle");
         bbn $$22 = bbr.a($$21.p("Entity"), $$9, $$1x -> !$$9.c($$1x) ? null : $$1x);
         if ($$22 != null) {
            UUID $$23;
            if ($$21.b("Attach")) {
               $$23 = $$21.a("Attach");
            } else {
               $$23 = null;
            }

            if ($$22.co().equals($$23)) {
               $$1.a($$22, true);
            } else {
               for(bbn $$25 : $$22.cM()) {
                  if ($$25.co().equals($$23)) {
                     $$1.a($$25, true);
                     break;
                  }
               }
            }

            if (!$$1.bI()) {
               a.warn("Couldn't reattach entity to player");
               $$22.ah();

               for(bbn $$26 : $$22.cM()) {
                  $$26.ah();
               }
            }
         }
      }

      $$1.g();
   }

   protected void a(abq $$0, agh $$1) {
      Set<dxl> $$2 = Sets.newHashSet();

      for(dxm $$3 : $$0.g()) {
         $$1.b.a(wq.a($$3, true));
      }

      for(int $$4 = 0; $$4 < 19; ++$$4) {
         dxl $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for(tc<?> $$7 : $$0.d($$5)) {
               $$1.b.a($$7);
            }

            $$2.add($$5);
         }
      }

   }

   public void a(agg $$0) {
      $$0.p_().a(new cxc() {
         @Override
         public void a(cxe $$0, double $$1) {
            aiz.this.a(new vy($$0));
         }

         @Override
         public void a(cxe $$0, double $$1, double $$2, long $$3) {
            aiz.this.a(new vx($$0));
         }

         @Override
         public void a(cxe $$0, double $$1, double $$2) {
            aiz.this.a(new vw($$0));
         }

         @Override
         public void a(cxe $$0, int $$1) {
            aiz.this.a(new vz($$0));
         }

         @Override
         public void b(cxe $$0, int $$1) {
            aiz.this.a(new wa($$0));
         }

         @Override
         public void b(cxe $$0, double $$1) {
         }

         @Override
         public void c(cxe $$0, double $$1) {
         }
      });
   }

   @Nullable
   public pj a(agh $$0) {
      pj $$1 = this.j.aW().y();
      pj $$2;
      if (this.j.a($$0.fy()) && $$1 != null) {
         $$2 = $$1;
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.s.b($$0);
      }

      return $$2;
   }

   protected void b(agh $$0) {
      this.s.a($$0);
      akc $$1 = (akc)this.q.get($$0.co());
      if ($$1 != null) {
         $$1.a();
      }

      abj $$2 = (abj)this.r.get($$0.co());
      if ($$2 != null) {
         $$2.b();
      }

   }

   public void c(agh $$0) {
      agg $$1 = $$0.x();
      $$0.a(akg.j);
      this.b($$0);
      if ($$0.bI()) {
         bbn $$2 = $$0.cO();
         if ($$2.cN()) {
            a.debug("Removing player mount");
            $$0.p();
            $$2.cL().forEach($$0x -> $$0x.b(bbn.c.d));
         }
      }

      $$0.ab();
      $$1.a($$0, bbn.c.d);
      $$0.M().a();
      this.k.remove($$0);
      this.j.aL().b($$0);
      UUID $$3 = $$0.co();
      agh $$4 = (agh)this.l.get($$3);
      if ($$4 == $$0) {
         this.l.remove($$3);
         this.q.remove($$3);
         this.r.remove($$3);
      }

      this.a(new vj(vj.a.e, $$0));
   }

   @Nullable
   public rq a(SocketAddress $$0, GameProfile $$1) {
      if (this.m.a($$1)) {
         ajg $$2 = this.m.b($$1);
         sb $$3 = rq.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(rq.a("multiplayer.disconnect.banned.expiration", i.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return rq.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.n.a($$0)) {
         aix $$4 = this.n.b($$0);
         sb $$5 = rq.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(rq.a("multiplayer.disconnect.banned_ip.expiration", i.format($$4.c())));
         }

         return $$5;
      } else {
         return this.k.size() >= this.g && !this.d($$1) ? rq.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public agh a(GameProfile $$0, @Nullable buf $$1) {
      UUID $$2 = hr.a($$0);
      List<agh> $$3 = Lists.newArrayList();

      for(int $$4 = 0; $$4 < this.k.size(); ++$$4) {
         agh $$5 = (agh)this.k.get($$4);
         if ($$5.co().equals($$2)) {
            $$3.add($$5);
         }
      }

      agh $$6 = (agh)this.l.get($$0.getId());
      if ($$6 != null && !$$3.contains($$6)) {
         $$3.add($$6);
      }

      for(agh $$7 : $$3) {
         $$7.b.b(rq.c("multiplayer.disconnect.duplicate_login"));
      }

      return new agh(this.j, this.j.C(), $$0, $$1);
   }

   public agh a(agh $$0, boolean $$1) {
      this.k.remove($$0);
      $$0.x().a($$0, bbn.c.b);
      gt $$2 = $$0.N();
      float $$3 = $$0.O();
      boolean $$4 = $$0.Q();
      agg $$5 = this.j.a($$0.P());
      Optional<dwq> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = buc.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      agg $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.j.C();
      agh $$9 = new agh(this.j, $$8, $$0.fy(), $$0.fz());
      $$9.b = $$0.b;
      $$9.a($$0, $$1);
      $$9.e($$0.ae());
      $$9.a($$0.eS());

      for(String $$10 : $$0.af()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         cvo $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cju.nW);
         dwq $$14 = (dwq)$$6.get();
         float $$17;
         if (!$$12.a(akl.N) && !$$13) {
            $$17 = $$3;
         } else {
            dwq $$15 = dwq.c($$2).d($$14).d();
            $$17 = (float)ami.f(ami.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ab(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.b.a(new uj(uj.a, 0.0F));
      }

      while(!$$8.g($$9) && $$9.dh() < (double)$$8.ah()) {
         $$9.e($$9.df(), $$9.dh() + 1.0, $$9.dl());
      }

      drn $$18 = $$9.s.n_();
      $$9.b.a(new vq($$9.s.Z(), $$9.s.ab(), chv.a($$9.x().B()), $$9.d.b(), $$9.d.c(), $$9.x().ae(), $$9.x().A(), $$1, $$9.ga()));
      $$9.b.b($$9.df(), $$9.dh(), $$9.dl(), $$9.dq(), $$9.ds());
      $$9.b.a(new wf($$8.Q(), $$8.R()));
      $$9.b.a(new tr($$18.s(), $$18.t()));
      $$9.b.a(new wm($$9.ck, $$9.cj, $$9.ci));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.k.add($$9);
      this.l.put($$9.co(), $$9);
      $$9.g();
      $$9.c($$9.ef());
      if ($$11) {
         $$9.b.a(new wy(ajw.re, ajx.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.r_().g()));
      }

      return $$9;
   }

   public void d(agh $$0) {
      GameProfile $$1 = $$0.fy();
      int $$2 = this.j.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.z > 600) {
         this.a(new vj(vj.a.c, this.k));
         this.z = 0;
      }

   }

   public void a(tc<?> $$0) {
      for(agh $$1 : this.k) {
         $$1.b.a($$0);
      }

   }

   public void a(tc<?> $$0, aba<cgx> $$1) {
      for(agh $$2 : this.k) {
         if ($$2.s.ab() == $$1) {
            $$2.b.a($$0);
         }
      }

   }

   public void a(buc $$0, rq $$1) {
      dxq $$2 = $$0.bY();
      if ($$2 != null) {
         for(String $$4 : $$2.g()) {
            agh $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }

      }
   }

   public void b(buc $$0, rq $$1) {
      dxq $$2 = $$0.bY();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for(int $$3 = 0; $$3 < this.k.size(); ++$$3) {
            agh $$4 = (agh)this.k.get($$3);
            if ($$4.bY() != $$2) {
               $$4.a($$1);
            }
         }

      }
   }

   public String[] e() {
      String[] $$0 = new String[this.k.size()];

      for(int $$1 = 0; $$1 < this.k.size(); ++$$1) {
         $$0[$$1] = ((agh)this.k.get($$1)).fy().getName();
      }

      return $$0;
   }

   public ajf f() {
      return this.m;
   }

   public aiw g() {
      return this.n;
   }

   public void a(GameProfile $$0) {
      this.o.a(new ajb($$0, this.j.h(), this.o.a($$0)));
      agh $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }

   }

   public void b(GameProfile $$0) {
      this.o.c($$0);
      agh $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }

   }

   private void a(agh $$0, int $$1) {
      if ($$0.b != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.b.a(new ug($$0, $$2));
      }

      this.j.aC().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.t || this.o.d($$0) || this.p.d($$0);
   }

   public boolean e(GameProfile $$0) {
      return this.o.d($$0) || this.j.a($$0) && this.j.aW().o() || this.x;
   }

   @Nullable
   public agh a(String $$0) {
      for(agh $$1 : this.k) {
         if ($$1.fy().getName().equalsIgnoreCase($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(@Nullable buc $$0, double $$1, double $$2, double $$3, double $$4, aba<cgx> $$5, tc<?> $$6) {
      for(int $$7 = 0; $$7 < this.k.size(); ++$$7) {
         agh $$8 = (agh)this.k.get($$7);
         if ($$8 != $$0 && $$8.s.ab() == $$5) {
            double $$9 = $$1 - $$8.df();
            double $$10 = $$2 - $$8.dh();
            double $$11 = $$3 - $$8.dl();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.b.a($$6);
            }
         }
      }

   }

   public void h() {
      for(int $$0 = 0; $$0 < this.k.size(); ++$$0) {
         this.b((agh)this.k.get($$0));
      }

   }

   public ajh i() {
      return this.p;
   }

   public String[] j() {
      return this.p.a();
   }

   public aja k() {
      return this.o;
   }

   public String[] l() {
      return this.o.a();
   }

   public void a() {
   }

   public void a(agh $$0, agg $$1) {
      cxe $$2 = this.j.C().p_();
      $$0.b.a(new ul($$2));
      $$0.b.a(new wu($$1.U(), $$1.V(), $$1.W().b(cgt.k)));
      $$0.b.a(new wf($$1.Q(), $$1.R()));
      if ($$1.Y()) {
         $$0.b.a(new uj(uj.b, 0.0F));
         $$0.b.a(new uj(uj.h, $$1.d(1.0F)));
         $$0.b.a(new uj(uj.i, $$1.b(1.0F)));
      }

   }

   public void e(agh $$0) {
      $$0.bT.b();
      $$0.u();
      $$0.b.a(new wc($$0.fA().k));
   }

   public int m() {
      return this.k.size();
   }

   public int n() {
      return this.g;
   }

   public boolean o() {
      return this.t;
   }

   public void a(boolean $$0) {
      this.t = $$0;
   }

   public List<agh> b(String $$0) {
      List<agh> $$1 = Lists.newArrayList();

      for(agh $$2 : this.k) {
         if ($$2.y().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.v;
   }

   public int q() {
      return this.w;
   }

   public MinecraftServer c() {
      return this.j;
   }

   @Nullable
   public pj r() {
      return null;
   }

   public void b(boolean $$0) {
      this.x = $$0;
   }

   public void s() {
      for(int $$0 = 0; $$0 < this.k.size(); ++$$0) {
         ((agh)this.k.get($$0)).b.b(rq.c("multiplayer.disconnect.server_shutdown"));
      }

   }

   public void a(rq $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(rq $$0, Function<agh, rq> $$1, boolean $$2) {
      this.j.a($$0);

      for(agh $$3 : this.k) {
         rq $$4 = (rq)$$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }

   }

   public void a(sd $$0, dr $$1, rm.a $$2) {
      this.a($$0, $$1::a, $$1.j(), $$1.d(), $$2);
   }

   public void a(sd $$0, agh $$1, rm.a $$2) {
      this.a($$0, $$1::b, $$1, $$1.aW(), $$2);
   }

   private void a(sd $$0, Predicate<agh> $$1, @Nullable agh $$2, rl $$3, rm.a $$4) {
      boolean $$5 = this.a($$0, $$3);
      this.j.a($$0.c(), $$4, $$5 ? null : "Not Secure");
      sc $$6 = sc.a($$0);
      boolean $$7 = $$0.h();
      boolean $$8 = false;

      for(agh $$9 : this.k) {
         boolean $$10 = $$1.test($$9);
         $$9.a($$6, $$10, $$4);
         if ($$2 != $$9) {
            $$8 |= $$7 && $$10;
         }
      }

      if ($$8 && $$2 != null) {
         $$2.a(f);
      }

      $$6.a(this);
   }

   public void a(sd $$0, Set<agh> $$1) {
      byte[] $$2 = $$0.k().a().asBytes();

      for(agh $$3 : this.k) {
         if (!$$1.contains($$3)) {
            $$3.a($$0.i(), $$0.j(), $$2);
         }
      }

   }

   private boolean a(sd $$0, rl $$1) {
      return !$$0.a(Instant.now()) && $$0.a($$1);
   }

   public akc a(buc $$0) {
      UUID $$1 = $$0.co();
      akc $$2 = (akc)this.q.get($$1);
      if ($$2 == null) {
         File $$3 = this.j.a(dro.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.X().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (x.a($$6) && x.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new akc(this.j, $$4);
         this.q.put($$1, $$2);
      }

      return $$2;
   }

   public abj f(agh $$0) {
      UUID $$1 = $$0.co();
      abj $$2 = (abj)this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.j.a(dro.a).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         $$2 = new abj(this.j.ay(), this, this.j.az(), $$4, $$0);
         this.r.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.v = $$0;
      this.a(new we($$0));

      for(agg $$1 : this.j.E()) {
         if ($$1 != null) {
            $$1.k().a($$0);
         }
      }

   }

   public void b(int $$0) {
      this.w = $$0;
      this.a(new ws($$0));

      for(agg $$1 : this.j.E()) {
         if ($$1 != null) {
            $$1.k().b($$0);
         }
      }

   }

   public List<agh> t() {
      return this.k;
   }

   @Nullable
   public agh a(UUID $$0) {
      return (agh)this.l.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for(abj $$0 : this.r.values()) {
         $$0.a(this.j.az());
      }

      this.a(new xj(alc.a(this.u)));
      xi $$1 = new xi(this.j.aE().b());

      for(agh $$2 : this.k) {
         $$2.b.a($$1);
         $$2.E().a($$2);
      }

   }

   public boolean v() {
      return this.x;
   }
}
