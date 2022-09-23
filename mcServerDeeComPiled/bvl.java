import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bvl extends drb {
   private static final String a = "raids";
   private final Map<Integer, bvj> b = Maps.newHashMap();
   private final agg c;
   private int d;
   private int e;

   public bvl(agg $$0) {
      this.c = $$0;
      this.d = 1;
      this.b();
   }

   public bvj a(int $$0) {
      return (bvj)this.b.get($$0);
   }

   public void a() {
      ++this.e;
      Iterator<bvj> $$0 = this.b.values().iterator();

      while($$0.hasNext()) {
         bvj $$1 = (bvj)$$0.next();
         if (this.c.W().b(cgt.y)) {
            $$1.n();
         }

         if ($$1.d()) {
            $$0.remove();
            this.b();
         } else {
            $$1.o();
         }
      }

      if (this.e % 200 == 0) {
         this.b();
      }

      xl.a(this.c, this.b.values());
   }

   public static boolean a(bvk $$0, bvj $$1) {
      if ($$0 != null && $$1 != null && $$1.i() != null) {
         return $$0.bo() && $$0.fW() && $$0.dV() <= 2400 && $$0.s.q_() == $$1.i().q_();
      } else {
         return false;
      }
   }

   @Nullable
   public bvj a(agh $$0) {
      if ($$0.B_()) {
         return null;
      } else if (this.c.W().b(cgt.y)) {
         return null;
      } else {
         cyu $$1 = $$0.s.q_();
         if (!$$1.c()) {
            return null;
         } else {
            gt $$2 = $$0.da();
            List<bmt> $$3 = this.c.x().c($$0x -> $$0x.a(aku.b), $$2, 64, bms.b.b).toList();
            int $$4 = 0;
            dwq $$5 = dwq.b;

            for(bmt $$6 : $$3) {
               gt $$7 = $$6.f();
               $$5 = $$5.b((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
               ++$$4;
            }

            gt $$8;
            if ($$4 > 0) {
               $$5 = $$5.a(1.0 / (double)$$4);
               $$8 = new gt($$5);
            } else {
               $$8 = $$2;
            }

            bvj $$10 = this.a($$0.x(), $$8);
            boolean $$11 = false;
            if (!$$10.j()) {
               if (!this.b.containsKey($$10.u())) {
                  this.b.put($$10.u(), $$10);
               }

               $$11 = true;
            } else if ($$10.m() < $$10.l()) {
               $$11 = true;
            } else {
               $$0.d(bbi.E);
               $$0.b.a(new ug($$0, (byte)43));
            }

            if ($$11) {
               $$10.a((buc)$$0);
               $$0.b.a(new ug($$0, (byte)43));
               if (!$$10.c()) {
                  $$0.a(akg.aA);
                  aj.I.a($$0);
               }
            }

            this.b();
            return $$10;
         }
      }
   }

   private bvj a(agg $$0, gt $$1) {
      bvj $$2 = $$0.c($$1);
      return $$2 != null ? $$2 : new bvj(this.d(), $$0, $$1);
   }

   public static bvl a(agg $$0, pj $$1) {
      bvl $$2 = new bvl($$0);
      $$2.d = $$1.h("NextAvailableID");
      $$2.e = $$1.h("Tick");
      pp $$3 = $$1.c("Raids", 10);

      for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
         pj $$5 = $$3.a($$4);
         bvj $$6 = new bvj($$0, $$5);
         $$2.b.put($$6.u(), $$6);
      }

      return $$2;
   }

   @Override
   public pj a(pj $$0) {
      $$0.a("NextAvailableID", this.d);
      $$0.a("Tick", this.e);
      pp $$1 = new pp();

      for(bvj $$2 : this.b.values()) {
         pj $$3 = new pj();
         $$2.a($$3);
         $$1.add($$3);
      }

      $$0.a("Raids", (qc)$$1);
      return $$0;
   }

   public static String a(hc<cyu> $$0) {
      return $$0.a(cys.c) ? "raids_end" : "raids";
   }

   private int d() {
      return ++this.d;
   }

   @Nullable
   public bvj a(gt $$0, int $$1) {
      bvj $$2 = null;
      double $$3 = (double)$$1;

      for(bvj $$4 : this.b.values()) {
         double $$5 = $$4.t().j($$0);
         if ($$4.v() && $$5 < $$3) {
            $$2 = $$4;
            $$3 = $$5;
         }
      }

      return $$2;
   }
}
