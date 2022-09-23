import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cfz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 1;
   private int c = 20;
   private ayt<chn> d = ayt.b();
   private chn e = new chn();
   private double f;
   private double g;
   private int h = 200;
   private int i = 800;
   private int j = 4;
   @Nullable
   private bbn k;
   private int l = 6;
   private int m = 16;
   private int n = 4;

   public void a(bbr<?> $$0) {
      this.e.a().a("id", hm.X.b($$0).toString());
   }

   private boolean b(cgx $$0, gt $$1) {
      return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.m);
   }

   public void a(cgx $$0, gt $$1) {
      if (!this.b($$0, $$1)) {
         this.g = this.f;
      } else {
         amn $$2 = $$0.r_();
         double $$3 = (double)$$1.u() + $$2.j();
         double $$4 = (double)$$1.v() + $$2.j();
         double $$5 = (double)$$1.w() + $$2.j();
         $$0.a(io.Y, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         $$0.a(io.C, $$3, $$4, $$5, 0.0, 0.0, 0.0);
         if (this.c > 0) {
            --this.c;
         }

         this.g = this.f;
         this.f = (this.f + (double)(1000.0F / ((float)this.c + 200.0F))) % 360.0;
      }

   }

   public void a(agg $$0, gt $$1) {
      if (this.b($$0, $$1)) {
         if (this.c == -1) {
            this.c($$0, $$1);
         }

         if (this.c > 0) {
            --this.c;
         } else {
            boolean $$2 = false;

            for(int $$3 = 0; $$3 < this.j; ++$$3) {
               pj $$4 = this.e.a();
               Optional<bbr<?>> $$5 = bbr.a($$4);
               if ($$5.isEmpty()) {
                  this.c($$0, $$1);
                  return;
               }

               pp $$6 = $$4.c("Pos", 6);
               int $$7 = $$6.size();
               amn $$8 = $$0.r_();
               double $$9 = $$7 >= 1 ? $$6.h(0) : (double)$$1.u() + ($$8.j() - $$8.j()) * (double)this.n + 0.5;
               double $$10 = $$7 >= 2 ? $$6.h(1) : (double)($$1.v() + $$8.a(3) - 1);
               double $$11 = $$7 >= 3 ? $$6.h(2) : (double)$$1.w() + ($$8.j() - $$8.j()) * (double)this.n + 0.5;
               if ($$0.b(((bbr)$$5.get()).a($$9, $$10, $$11))) {
                  gt $$12 = new gt($$9, $$10, $$11);
                  if (this.e.b().isPresent()) {
                     if (!((bbr)$$5.get()).f().d() && $$0.ag() == bag.a) {
                        continue;
                     }

                     chn.a $$13 = (chn.a)this.e.b().get();
                     if (!$$13.a().a($$0.a(chg.b, $$12)) || !$$13.b().a($$0.a(chg.a, $$12))) {
                        continue;
                     }
                  } else if (!bcv.a((bbr)$$5.get(), $$0, bcg.c, $$12, $$0.r_())) {
                     continue;
                  }

                  bbn $$14 = bbr.a($$4, $$0, $$3x -> {
                     $$3x.b($$9, $$10, $$11, $$3x.dq(), $$3x.ds());
                     return $$3x;
                  });
                  if ($$14 == null) {
                     this.c($$0, $$1);
                     return;
                  }

                  int $$15 = $$0.a(
                        $$14.getClass(),
                        new dwl((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), (double)($$1.u() + 1), (double)($$1.v() + 1), (double)($$1.w() + 1))
                           .g((double)this.n)
                     )
                     .size();
                  if ($$15 >= this.l) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$14.b($$14.df(), $$14.dh(), $$14.dl(), $$8.i() * 360.0F, 0.0F);
                  if ($$14 instanceof bce $$16) {
                     if (this.e.b().isEmpty() && !$$16.a($$0, bcg.c) || !$$16.a((cha)$$0)) {
                        continue;
                     }

                     if (this.e.a().e() == 1 && this.e.a().b("id", 8)) {
                        ((bce)$$14).a($$0, $$0.d_($$14.da()), bcg.c, null, null);
                     }
                  }

                  if (!$$0.e($$14)) {
                     this.c($$0, $$1);
                     return;
                  }

                  $$0.c(2004, $$1, 0);
                  $$0.a($$14, czv.s, $$12);
                  if ($$14 instanceof bce) {
                     ((bce)$$14).L();
                  }

                  $$2 = true;
               }
            }

            if ($$2) {
               this.c($$0, $$1);
            }

         }
      }
   }

   private void c(cgx $$0, gt $$1) {
      amn $$2 = $$0.w;
      if (this.i <= this.h) {
         this.c = this.h;
      } else {
         this.c = this.h + $$2.a(this.i - this.h);
      }

      this.d.b($$2).ifPresent($$2x -> this.a($$0, $$1, (chn)$$2x.b()));
      this.a($$0, $$1, 1);
   }

   public void a(@Nullable cgx $$0, gt $$1, pj $$2) {
      this.c = $$2.g("Delay");
      boolean $$3 = $$2.b("SpawnPotentials", 9);
      boolean $$4 = $$2.b("SpawnData", 10);
      if (!$$3) {
         chn $$5;
         if ($$4) {
            $$5 = (chn)chn.a.parse(pu.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(chn::new);
         } else {
            $$5 = new chn();
         }

         this.d = ayt.a($$5);
         this.a($$0, $$1, $$5);
      } else {
         pp $$7 = $$2.c("SpawnPotentials", 10);
         this.d = (ayt)chn.b.parse(pu.a, $$7).resultOrPartial($$0x -> a.warn("Invalid SpawnPotentials list: {}", $$0x)).orElseGet(ayt::b);
         if ($$4) {
            chn $$8 = (chn)chn.a.parse(pu.a, $$2.p("SpawnData")).resultOrPartial($$0x -> a.warn("Invalid SpawnData: {}", $$0x)).orElseGet(chn::new);
            this.a($$0, $$1, $$8);
         } else {
            this.d.b($$0.r_()).ifPresent($$2x -> this.a($$0, $$1, (chn)$$2x.b()));
         }
      }

      if ($$2.b("MinSpawnDelay", 99)) {
         this.h = $$2.g("MinSpawnDelay");
         this.i = $$2.g("MaxSpawnDelay");
         this.j = $$2.g("SpawnCount");
      }

      if ($$2.b("MaxNearbyEntities", 99)) {
         this.l = $$2.g("MaxNearbyEntities");
         this.m = $$2.g("RequiredPlayerRange");
      }

      if ($$2.b("SpawnRange", 99)) {
         this.n = $$2.g("SpawnRange");
      }

      this.k = null;
   }

   public pj a(pj $$0) {
      $$0.a("Delay", (short)this.c);
      $$0.a("MinSpawnDelay", (short)this.h);
      $$0.a("MaxSpawnDelay", (short)this.i);
      $$0.a("SpawnCount", (short)this.j);
      $$0.a("MaxNearbyEntities", (short)this.l);
      $$0.a("RequiredPlayerRange", (short)this.m);
      $$0.a("SpawnRange", (short)this.n);
      $$0.a("SpawnData", (qc)chn.a.encodeStart(pu.a, this.e).result().orElseThrow(() -> new IllegalStateException("Invalid SpawnData")));
      $$0.a("SpawnPotentials", (qc)chn.b.encodeStart(pu.a, this.d).result().orElseThrow());
      return $$0;
   }

   @Nullable
   public bbn a(cgx $$0) {
      if (this.k == null) {
         this.k = bbr.a(this.e.a(), $$0, Function.identity());
         if (this.e.a().e() == 1 && this.e.a().b("id", 8) && this.k instanceof bce) {
         }
      }

      return this.k;
   }

   public boolean a(cgx $$0, int $$1) {
      if ($$1 == 1) {
         if ($$0.y) {
            this.c = this.h;
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(@Nullable cgx $$0, gt $$1, chn $$2) {
      this.e = $$2;
   }

   public abstract void a(cgx var1, gt var2, int var3);

   public double a() {
      return this.f;
   }

   public double b() {
      return this.g;
   }
}
