import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ctf extends cti {
   public static final String a = "FlowerPos";
   public static final String b = "MinOccupationTicks";
   public static final String c = "EntityData";
   public static final String d = "TicksInHive";
   public static final String e = "HasNectar";
   public static final String f = "Bees";
   private static final List<String> i = Arrays.asList(
      "Air",
      "ArmorDropChances",
      "ArmorItems",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "FallDistance",
      "FallFlying",
      "Fire",
      "HandDropChances",
      "HandItems",
      "HurtByTimestamp",
      "HurtTime",
      "LeftHanded",
      "Motion",
      "NoGravity",
      "OnGround",
      "PortalCooldown",
      "Pos",
      "Rotation",
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "HivePos",
      "Passengers",
      "Leash",
      "UUID"
   );
   public static final int g = 3;
   private static final int j = 400;
   private static final int k = 2400;
   public static final int h = 600;
   private final List<ctf.a> l = Lists.newArrayList();
   @Nullable
   private gt m;

   public ctf(gt $$0, cvo $$1) {
      super(ctk.G, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.c()) {
         this.a(null, this.n.a_(this.p()), ctf.b.c);
      }

      super.e();
   }

   public boolean c() {
      if (this.n == null) {
         return false;
      } else {
         for(gt $$0 : gt.a(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof cmi) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean d() {
      return this.l.isEmpty();
   }

   public boolean f() {
      return this.l.size() == 3;
   }

   public void a(@Nullable buc $$0, cvo $$1, ctf.b $$2) {
      List<bbn> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for(bbn $$4 : $$3) {
            if ($$4 instanceof bnf $$5 && $$0.cY().g($$4.cY()) <= 16.0) {
               if (!this.i()) {
                  $$5.h($$0);
               } else {
                  $$5.t(400);
               }
            }
         }
      }

   }

   private List<bbn> a(cvo $$0, ctf.b $$1) {
      List<bbn> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.n, this.o, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(bbn $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @ang
   public int g() {
      return this.l.size();
   }

   public static int a(cvo $$0) {
      return $$0.c(cjn.b);
   }

   @ang
   public boolean i() {
      return cke.a(this.n, this.p());
   }

   public void a(bbn $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.p();
         $$0.bv();
         pj $$3 = new pj();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.n != null) {
            if ($$0 instanceof bnf $$4 && $$4.t() && (!this.t() || this.n.w.h())) {
               this.m = $$4.q();
            }

            gt $$5 = this.p();
            this.n.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), ajw.bq, ajx.e, 1.0F, 1.0F);
            this.n.a(czv.c, $$5, czv.a.a($$0, this.q()));
         }

         $$0.ah();
         super.e();
      }
   }

   public void a(pj $$0, int $$1, boolean $$2) {
      this.l.add(new ctf.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cgx $$0, gt $$1, cvo $$2, ctf.a $$3, @Nullable List<bbn> $$4, ctf.b $$5, @Nullable gt $$6) {
      if (($$0.N() || $$0.Y()) && $$5 != ctf.b.c) {
         return false;
      } else {
         pj $$7 = $$3.a.g();
         d($$7);
         $$7.a("HivePos", (qc)pv.a($$1));
         $$7.a("NoGravity", true);
         gy $$8 = $$2.c(cjn.a);
         gt $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).b();
         if ($$10 && $$5 != ctf.b.c) {
            return false;
         } else {
            bbn $$11 = bbr.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ad().a(akn.c)) {
                  return false;
               } else {
                  if ($$11 instanceof bnf $$12) {
                     if ($$6 != null && !$$12.t() && $$0.w.i() < 0.9F) {
                        $$12.g($$6);
                     }

                     if ($$5 == ctf.b.a) {
                        $$12.fY();
                        if ($$2.a(akl.ax, $$0x -> $$0x.b(cjn.b))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.w.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 --$$14;
                              }

                              $$0.b($$1, $$2.a(cjn.b, Integer.valueOf($$13 + $$14)));
                           }
                        }
                     }

                     a($$3.b, $$12);
                     if ($$4 != null) {
                        $$4.add($$12);
                     }

                     float $$15 = $$11.cW();
                     double $$16 = $$10 ? 0.0 : 0.55 + (double)($$15 / 2.0F);
                     double $$17 = (double)$$1.u() + 0.5 + $$16 * (double)$$8.j();
                     double $$18 = (double)$$1.v() + 0.5 - (double)($$11.cX() / 2.0F);
                     double $$19 = (double)$$1.w() + 0.5 + $$16 * (double)$$8.l();
                     $$11.b($$17, $$18, $$19, $$11.dq(), $$11.ds());
                  }

                  $$0.a(null, $$1, ajw.br, ajx.e, 1.0F, 1.0F);
                  $$0.a(czv.c, $$1, czv.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void d(pj $$0) {
      for(String $$1 : i) {
         $$0.r($$1);
      }

   }

   private static void a(int $$0, bnf $$1) {
      int $$2 = $$1.j();
      if ($$2 < 0) {
         $$1.b_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.b_(Math.max(0, $$2 - $$0));
      }

      $$1.s(Math.max(0, $$1.fN() - $$0));
   }

   private boolean t() {
      return this.m != null;
   }

   private static void a(cgx $$0, gt $$1, cvo $$2, List<ctf.a> $$3, @Nullable gt $$4) {
      boolean $$5 = false;

      ctf.a $$7;
      for(Iterator<ctf.a> $$6 = $$3.iterator(); $$6.hasNext(); ++$$7.b) {
         $$7 = (ctf.a)$$6.next();
         if ($$7.b > $$7.c) {
            ctf.b $$8 = $$7.a.q("HasNectar") ? ctf.b.a : ctf.b.b;
            if (a($$0, $$1, $$2, $$7, null, $$8, $$4)) {
               $$5 = true;
               $$6.remove();
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctf $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.r_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, ajw.bt, ajx.e, 1.0F, 1.0F);
      }

      xl.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.l.clear();
      pp $$1 = $$0.c("Bees", 10);

      for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
         pj $$3 = $$1.a($$2);
         ctf.a $$4 = new ctf.a($$3.p("EntityData"), $$3.h("TicksInHive"), $$3.h("MinOccupationTicks"));
         this.l.add($$4);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = pv.b($$0.p("FlowerPos"));
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("Bees", (qc)this.j());
      if (this.t()) {
         $$0.a("FlowerPos", (qc)pv.a(this.m));
      }

   }

   public pp j() {
      pp $$0 = new pp();

      for(ctf.a $$1 : this.l) {
         pj $$2 = $$1.a.g();
         $$2.r("UUID");
         pj $$3 = new pj();
         $$3.a("EntityData", (qc)$$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final pj a;
      int b;
      final int c;

      a(pj $$0, int $$1, int $$2) {
         ctf.d($$0);
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
