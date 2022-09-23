import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cyx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 1200;
   private static final int e = 100;
   private static final int f = 20;
   private static final int g = 8;
   public static final int a = 9;
   private static final int h = 20;
   private static final int i = 96;
   public static final int b = 128;
   private static final Predicate<bbn> j = bbq.a.and(bbq.a(0.0, 128.0, 0.0, 192.0));
   private final agd k = (agd)new agd(rq.c("entity.minecraft.ender_dragon"), azz.a.a, azz.b.a).b(true).c(true);
   private final agg l;
   private final ObjectArrayList<Integer> m = new ObjectArrayList();
   private final cvt n;
   private int o;
   private int p;
   private int q;
   private int r;
   private boolean s;
   private boolean t;
   @Nullable
   private UUID u;
   private boolean v = true;
   @Nullable
   private gt w;
   @Nullable
   private cyw x;
   private int y;
   @Nullable
   private List<bpo> z;

   public cyx(agg $$0, long $$1, pj $$2) {
      this.l = $$0;
      if ($$2.e("NeedsStateScanning")) {
         this.v = $$2.q("NeedsStateScanning");
      }

      if ($$2.b("DragonKilled", 99)) {
         if ($$2.b("Dragon")) {
            this.u = $$2.a("Dragon");
         }

         this.s = $$2.q("DragonKilled");
         this.t = $$2.q("PreviouslyKilled");
         if ($$2.q("IsRespawning")) {
            this.x = cyw.a;
         }

         if ($$2.b("ExitPortalLocation", 10)) {
            this.w = pv.b($$2.p("ExitPortalLocation"));
         }
      } else {
         this.s = true;
         this.t = true;
      }

      if ($$2.b("Gateways", 9)) {
         pp $$3 = $$2.c("Gateways", 3);

         for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            this.m.add($$3.e($$4));
         }
      } else {
         this.m.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         ad.b(this.m, amn.a($$1));
      }

      this.n = cvu.a()
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .a('#', cvs.a(cvx.a(cju.B)))
         .b();
   }

   public pj a() {
      pj $$0 = new pj();
      $$0.a("NeedsStateScanning", this.v);
      if (this.u != null) {
         $$0.a("Dragon", this.u);
      }

      $$0.a("DragonKilled", this.s);
      $$0.a("PreviouslyKilled", this.t);
      if (this.w != null) {
         $$0.a("ExitPortalLocation", (qc)pv.a(this.w));
      }

      pp $$1 = new pp();
      ObjectListIterator var3 = this.m.iterator();

      while(var3.hasNext()) {
         int $$2 = var3.next();
         $$1.add(po.a($$2));
      }

      $$0.a("Gateways", (qc)$$1);
      return $$0;
   }

   public void b() {
      this.k.d(!this.s);
      if (++this.r >= 20) {
         this.l();
         this.r = 0;
      }

      if (!this.k.h().isEmpty()) {
         this.l.k().a(agl.b, new cge(0, 0), 9, anf.a);
         boolean $$0 = this.k();
         if (this.v && $$0) {
            this.g();
            this.v = false;
         }

         if (this.x != null) {
            if (this.z == null && $$0) {
               this.x = null;
               this.e();
            }

            this.x.a(this.l, this, this.z, this.y++, this.w);
         }

         if (!this.s) {
            if ((this.u == null || ++this.o >= 1200) && $$0) {
               this.h();
               this.o = 0;
            }

            if (++this.q >= 100 && $$0) {
               this.m();
               this.q = 0;
            }
         }
      } else {
         this.l.k().b(agl.b, new cge(0, 0), 9, anf.a);
      }

   }

   private void g() {
      c.info("Scanning for legacy world dragon fight...");
      boolean $$0 = this.i();
      if ($$0) {
         c.info("Found that the dragon has been killed in this world already.");
         this.t = true;
      } else {
         c.info("Found that the dragon has not yet been killed in this world.");
         this.t = false;
         if (this.j() == null) {
            this.a(false);
         }
      }

      List<? extends bpp> $$1 = this.l.h();
      if ($$1.isEmpty()) {
         this.s = true;
      } else {
         bpp $$2 = (bpp)$$1.get(0);
         this.u = $$2.co();
         c.info("Found that there's a dragon still alive ({})", $$2);
         this.s = false;
         if (!$$0) {
            c.info("But we didn't have a portal, let's remove it.");
            $$2.ah();
            this.u = null;
         }
      }

      if (!this.t && this.s) {
         this.s = false;
      }

   }

   private void h() {
      List<? extends bpp> $$0 = this.l.h();
      if ($$0.isEmpty()) {
         c.debug("Haven't seen the dragon, respawning it");
         this.o();
      } else {
         c.debug("Haven't seen our dragon, but found another one to use.");
         this.u = ((bpp)$$0.get(0)).co();
      }

   }

   protected void a(cyw $$0) {
      if (this.x == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.y = 0;
         if ($$0 == cyw.e) {
            this.x = null;
            this.s = false;
            bpp $$1 = this.o();

            for(agh $$2 : this.k.h()) {
               aj.n.a($$2, $$1);
            }
         } else {
            this.x = $$0;
         }

      }
   }

   private boolean i() {
      for(int $$0 = -8; $$0 <= 8; ++$$0) {
         for(int $$1 = -8; $$1 <= 8; ++$$1) {
            cxt $$2 = this.l.d($$0, $$1);

            for(cti $$3 : $$2.E().values()) {
               if ($$3 instanceof cuq) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private cvt.b j() {
      for(int $$0 = -8; $$0 <= 8; ++$$0) {
         for(int $$1 = -8; $$1 <= 8; ++$$1) {
            cxt $$2 = this.l.d($$0, $$1);

            for(cti $$3 : $$2.E().values()) {
               if ($$3 instanceof cuq) {
                  cvt.b $$4 = this.n.a(this.l, $$3.p());
                  if ($$4 != null) {
                     gt $$5 = $$4.a(3, 3, 3).d();
                     if (this.w == null) {
                        this.w = $$5;
                     }

                     return $$4;
                  }
               }
            }
         }
      }

      int $$6 = this.l.a(dar.a.e, dds.e).v();

      for(int $$7 = $$6; $$7 >= this.l.u_(); --$$7) {
         cvt.b $$8 = this.n.a(this.l, new gt(dds.e.u(), $$7, dds.e.w()));
         if ($$8 != null) {
            if (this.w == null) {
               this.w = $$8.a(3, 3, 3).d();
            }

            return $$8;
         }
      }

      return null;
   }

   private boolean k() {
      for(int $$0 = -8; $$0 <= 8; ++$$0) {
         for(int $$1 = 8; $$1 <= 8; ++$$1) {
            cxj $$2 = this.l.a($$0, $$1, cxn.o, false);
            if (!($$2 instanceof cxt)) {
               return false;
            }

            afs.c $$3 = ((cxt)$$2).B();
            if (!$$3.a(afs.c.c)) {
               return false;
            }
         }
      }

      return true;
   }

   private void l() {
      Set<agh> $$0 = Sets.newHashSet();

      for(agh $$1 : this.l.a(j)) {
         this.k.a($$1);
         $$0.add($$1);
      }

      Set<agh> $$2 = Sets.newHashSet(this.k.h());
      $$2.removeAll($$0);

      for(agh $$3 : $$2) {
         this.k.b($$3);
      }

   }

   private void m() {
      this.q = 0;
      this.p = 0;

      for(dfd.a $$0 : dfd.a(this.l)) {
         this.p += this.l.a(bpo.class, $$0.f()).size();
      }

      c.debug("Found {} end crystals still alive", this.p);
   }

   public void a(bpp $$0) {
      if ($$0.co().equals(this.u)) {
         this.k.a(0.0F);
         this.k.d(false);
         this.a(true);
         this.n();
         if (!this.t) {
            this.l.b(this.l.a(dar.a.e, dds.e), cju.eH.m());
         }

         this.t = true;
         this.s = true;
      }

   }

   private void n() {
      if (!this.m.isEmpty()) {
         int $$0 = this.m.remove(this.m.size() - 1);
         int $$1 = ami.b(96.0 * Math.cos(2.0 * (-Math.PI + Math.PI / 20 * (double)$$0)));
         int $$2 = ami.b(96.0 * Math.sin(2.0 * (-Math.PI + Math.PI / 20 * (double)$$0)));
         this.a(new gt($$1, 75, $$2));
      }
   }

   private void a(gt $$0) {
      this.l.c(3000, $$0, 0);
      ((ddg)nd.c.a()).a(this.l, this.l.k().g(), amn.a(), $$0);
   }

   private void a(boolean $$0) {
      dds $$1 = new dds($$0);
      if (this.w == null) {
         this.w = this.l.a(dar.a.f, dds.e).c();

         while(this.l.a_(this.w).a(cju.B) && this.w.v() > this.l.m_()) {
            this.w = this.w.c();
         }
      }

      $$1.a(dfx.m, this.l, this.l.k().g(), amn.a(), this.w);
   }

   private bpp o() {
      this.l.l(new gt(0, 128, 0));
      bpp $$0 = bbr.x.a((cgx)this.l);
      $$0.fG().a(bqf.a);
      $$0.b(0.0, 128.0, 0.0, this.l.w.i() * 360.0F, 0.0F);
      this.l.b($$0);
      this.u = $$0.co();
      return $$0;
   }

   public void b(bpp $$0) {
      if ($$0.co().equals(this.u)) {
         this.k.a($$0.ef() / $$0.et());
         this.o = 0;
         if ($$0.Y()) {
            this.k.a($$0.C_());
         }
      }

   }

   public int c() {
      return this.p;
   }

   public void a(bpo $$0, baw $$1) {
      if (this.x != null && this.z.contains($$0)) {
         c.debug("Aborting respawn sequence");
         this.x = null;
         this.y = 0;
         this.f();
         this.a(true);
      } else {
         this.m();
         bbn $$2 = this.l.a(this.u);
         if ($$2 instanceof bpp) {
            ((bpp)$$2).a($$0, $$0.da(), $$1);
         }
      }

   }

   public boolean d() {
      return this.t;
   }

   public void e() {
      if (this.s && this.x == null) {
         gt $$0 = this.w;
         if ($$0 == null) {
            c.debug("Tried to respawn, but need to find the portal first.");
            cvt.b $$1 = this.j();
            if ($$1 == null) {
               c.debug("Couldn't find a portal, so we made one.");
               this.a(true);
            } else {
               c.debug("Found the exit portal & saved its location for next time.");
            }

            $$0 = this.w;
         }

         List<bpo> $$2 = Lists.newArrayList();
         gt $$3 = $$0.b(1);

         for(gy $$4 : gy.c.a) {
            List<bpo> $$5 = this.l.a(bpo.class, new dwl($$3.a($$4, 2)));
            if ($$5.isEmpty()) {
               return;
            }

            $$2.addAll($$5);
         }

         c.debug("Found all crystals, respawning dragon.");
         this.a($$2);
      }

   }

   private void a(List<bpo> $$0) {
      if (this.s && this.x == null) {
         for(cvt.b $$1 = this.j(); $$1 != null; $$1 = this.j()) {
            for(int $$2 = 0; $$2 < this.n.c(); ++$$2) {
               for(int $$3 = 0; $$3 < this.n.b(); ++$$3) {
                  for(int $$4 = 0; $$4 < this.n.a(); ++$$4) {
                     cvs $$5 = $$1.a($$2, $$3, $$4);
                     if ($$5.a().a(cju.B) || $$5.a().a(cju.eE)) {
                        this.l.b($$5.d(), cju.eG.m());
                     }
                  }
               }
            }
         }

         this.x = cyw.a;
         this.y = 0;
         this.a(false);
         this.z = $$0;
      }

   }

   public void f() {
      for(dfd.a $$0 : dfd.a(this.l)) {
         for(bpo $$2 : this.l.a(bpo.class, $$0.f())) {
            $$2.m(false);
            $$2.a(null);
         }
      }

   }
}
