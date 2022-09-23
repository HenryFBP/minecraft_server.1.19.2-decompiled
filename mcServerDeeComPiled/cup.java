import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cup extends cuq {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private gt i;
   private boolean j;

   public cup(gt $$0, cvo $$1) {
      super(ctk.u, $$0, $$1);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", (qc)pv.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         gt $$1 = pv.b($$0.p("ExitPortal"));
         if (cgx.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cup $$3) {
      ++$$3.g;
      if ($$3.d()) {
         --$$3.h;
      }

   }

   public static void b(cgx $$0, gt $$1, cvo $$2, cup $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      ++$$3.g;
      if ($$5) {
         --$$3.h;
      } else {
         List<bbn> $$6 = $$0.a(bbn.class, new dwl($$1), cup::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, (bbn)$$6.get($$0.w.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.c() || $$5 != $$3.d()) {
         a($$0, $$1, $$2);
      }

   }

   public static boolean a(bbn $$0) {
      return bbq.f.test($$0) && !$$0.cO().aq();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return ami.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - ami.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public tn f() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   private static void c(cgx $$0, gt $$1, cvo $$2, cup $$3) {
      if (!$$0.y) {
         $$3.h = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }

   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h = 40;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, bbn $$3, cup $$4) {
      if ($$0 instanceof agg $$5 && !$$4.d()) {
         $$4.h = 100;
         if ($$4.i == null && $$0.ab() == cgx.g) {
            gt $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dfw.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            gt $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bbn $$9;
            if ($$3 instanceof bvd) {
               bbn $$8 = ((bvd)$$3).x();
               if ($$8 instanceof agh) {
                  aj.d.a((agh)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ah();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cO();
            }

            $$9.ap();
            $$9.m((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static gt a(cgx $$0, gt $$1) {
      gt $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.b();
   }

   private static gt a(agg $$0, gt $$1) {
      dwq $$2 = b($$0, $$1);
      cxt $$3 = a((cgx)$$0, $$2);
      gt $$4 = a($$3);
      if ($$4 == null) {
         $$4 = new gt($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$4);
         ((ddg)nd.e.a()).a($$0, $$0.k().g(), amn.a($$4.a()), $$4);
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static dwq b(agg $$0, gt $$1) {
      dwq $$2 = new dwq((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      dwq $$4 = $$2.a(1024.0);

      for(int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for(int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(agg $$0, dwq $$1) {
      return a((cgx)$$0, $$1).b() <= $$0.u_();
   }

   private static gt a(cgd $$0, gt $$1, int $$2, boolean $$3) {
      gt $$4 = null;

      for(int $$5 = -$$2; $$5 <= $$2; ++$$5) {
         for(int $$6 = -$$2; $$6 <= $$2; ++$$6) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for(int $$7 = $$0.ah() - 1; $$7 > ($$4 == null ? $$0.u_() : $$4.v()); --$$7) {
                  gt $$8 = new gt($$1.u() + $$5, $$7, $$1.w() + $$6);
                  cvo $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cju.B))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static cxt a(cgx $$0, dwq $$1) {
      return $$0.d(ami.b($$1.c / 16.0), ami.b($$1.e / 16.0));
   }

   @Nullable
   private static gt a(cxt $$0) {
      cge $$1 = $$0.f();
      gt $$2 = new gt($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      gt $$4 = new gt($$1.f(), $$3, $$1.g());
      gt $$5 = null;
      double $$6 = 0.0;

      for(gt $$7 : gt.a($$2, $$4)) {
         cvo $$8 = $$0.a_($$7);
         gt $$9 = $$7.b();
         gt $$10 = $$7.b(2);
         if ($$8.a(cju.eG) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.d(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(agg $$0, gt $$1, dfw $$2) {
      ddt.M.a($$2, $$0, $$0.k().g(), amn.a(), $$1);
   }

   @Override
   public boolean a(gy $$0) {
      return cjt.a(this.q(), this.n, this.p(), $$0, this.p().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for(gy $$1 : gy.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(gt $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
