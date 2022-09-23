import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cyf {
   private static final Logger b = LogUtils.getLogger();
   public static final cyf a = new cyf(cgm.a);
   private static final String c = "Indices";
   private static final gz[] d = gz.values();
   private final EnumSet<gz> e = EnumSet.noneOf(gz.class);
   private final List<dxz<cjt>> f = Lists.newArrayList();
   private final List<dxz<dpu>> g = Lists.newArrayList();
   private final int[][] h;
   static final Map<cjt, cyf.a> i = new IdentityHashMap();
   static final Set<cyf.a> j = Sets.newHashSet();

   private cyf(cgz $$0) {
      this.h = new int[$$0.ai()][];
   }

   public cyf(pj $$0, cgz $$1) {
      this($$1);
      if ($$0.b("Indices", 10)) {
         pj $$2 = $$0.p("Indices");

         for(int $$3 = 0; $$3 < this.h.length; ++$$3) {
            String $$4 = String.valueOf($$3);
            if ($$2.b($$4, 11)) {
               this.h[$$3] = $$2.n($$4);
            }
         }
      }

      int $$5 = $$0.h("Sides");

      for(gz $$6 : gz.values()) {
         if (($$5 & 1 << $$6.ordinal()) != 0) {
            this.e.add($$6);
         }
      }

      a($$0, "neighbor_block_ticks", $$0x -> hm.V.b(abb.a($$0x)).or(() -> Optional.of(cju.a)), this.f);
      a($$0, "neighbor_fluid_ticks", $$0x -> hm.T.b(abb.a($$0x)).or(() -> Optional.of(dpw.a)), this.g);
   }

   private static <T> void a(pj $$0, String $$1, Function<String, Optional<T>> $$2, List<dxz<T>> $$3) {
      if ($$0.b($$1, 9)) {
         for(qc $$5 : $$0.c($$1, 10)) {
            dxz.a((pj)$$5, $$2).ifPresent($$3::add);
         }
      }

   }

   public void a(cxt $$0) {
      this.b($$0);

      for(gz $$1 : d) {
         a($$0, $$1);
      }

      cgx $$2 = $$0.D();
      this.f.forEach($$1x -> {
         cjt $$2 = $$1x.a() == cju.a ? $$2.a_($$1x.b()).b() : (cjt)$$1x.a();
         $$2.a($$1x.b(), $$2, $$1x.c(), $$1x.d());
      });
      this.g.forEach($$1x -> {
         dpu $$2 = $$1x.a() == dpw.a ? $$2.b_($$1x.b()).a() : (dpu)$$1x.a();
         $$2.a($$1x.b(), $$2, $$1x.c(), $$1x.d());
      });
      j.forEach($$1x -> $$1x.a($$2));
   }

   private static void a(cxt $$0, gz $$1) {
      cgx $$2 = $$0.D();
      if ($$0.r().e.remove($$1)) {
         Set<gy> $$3 = $$1.a();
         int $$4 = 0;
         int $$5 = 15;
         boolean $$6 = $$3.contains(gy.f);
         boolean $$7 = $$3.contains(gy.e);
         boolean $$8 = $$3.contains(gy.d);
         boolean $$9 = $$3.contains(gy.c);
         boolean $$10 = $$3.size() == 1;
         cge $$11 = $$0.f();
         int $$12 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 1);
         int $$13 = $$11.d() + (!$$10 || !$$9 && !$$8 ? ($$7 ? 0 : 15) : 14);
         int $$14 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 1);
         int $$15 = $$11.e() + (!$$10 || !$$6 && !$$7 ? ($$9 ? 0 : 15) : 14);
         gy[] $$16 = gy.values();
         gt.a $$17 = new gt.a();

         for(gt $$18 : gt.b($$12, $$2.u_(), $$14, $$13, $$2.ah() - 1, $$15)) {
            cvo $$19 = $$2.a_($$18);
            cvo $$20 = $$19;

            for(gy $$21 : $$16) {
               $$17.a($$18, $$21);
               $$20 = a($$20, $$21, $$2, $$18, $$17);
            }

            cjt.a($$19, $$20, $$2, $$18, 18);
         }

      }
   }

   private static cvo a(cvo $$0, gy $$1, cgy $$2, gt $$3, gt $$4) {
      return ((cyf.a)i.getOrDefault($$0.b(), cyf.b.b)).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
   }

   private void b(cxt $$0) {
      gt.a $$1 = new gt.a();
      gt.a $$2 = new gt.a();
      cge $$3 = $$0.f();
      cgy $$4 = $$0.D();

      for(int $$5 = 0; $$5 < this.h.length; ++$$5) {
         cxu $$6 = $$0.b($$5);
         int[] $$7 = this.h[$$5];
         this.h[$$5] = null;
         if ($$7 != null && $$7.length > 0) {
            gy[] $$8 = gy.values();
            cya<cvo> $$9 = $$6.i();

            for(int $$10 : $$7) {
               int $$11 = $$10 & 15;
               int $$12 = $$10 >> 8 & 15;
               int $$13 = $$10 >> 4 & 15;
               $$1.d($$3.d() + $$11, $$6.g() + $$12, $$3.e() + $$13);
               cvo $$14 = $$9.a($$10);
               cvo $$15 = $$14;

               for(gy $$16 : $$8) {
                  $$2.a($$1, $$16);
                  if (hq.a($$1.u()) == $$3.e && hq.a($$1.w()) == $$3.f) {
                     $$15 = a($$15, $$16, $$4, $$1, $$2);
                  }
               }

               cjt.a($$14, $$15, $$4, $$1, 18);
            }
         }
      }

      for(int $$17 = 0; $$17 < this.h.length; ++$$17) {
         if (this.h[$$17] != null) {
            b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.g($$17), $$3.e, $$3.f});
         }

         this.h[$$17] = null;
      }

   }

   public boolean a() {
      for(int[] $$0 : this.h) {
         if ($$0 != null) {
            return false;
         }
      }

      return this.e.isEmpty();
   }

   public pj b() {
      pj $$0 = new pj();
      pj $$1 = new pj();

      for(int $$2 = 0; $$2 < this.h.length; ++$$2) {
         String $$3 = String.valueOf($$2);
         if (this.h[$$2] != null && this.h[$$2].length != 0) {
            $$1.a($$3, this.h[$$2]);
         }
      }

      if (!$$1.f()) {
         $$0.a("Indices", (qc)$$1);
      }

      int $$4 = 0;

      for(gz $$5 : this.e) {
         $$4 |= 1 << $$5.ordinal();
      }

      $$0.a("Sides", (byte)$$4);
      if (!this.f.isEmpty()) {
         pp $$6 = new pp();
         this.f.forEach($$1x -> $$6.add($$1x.a($$0xx -> hm.V.b($$0xx).toString())));
         $$0.a("neighbor_block_ticks", (qc)$$6);
      }

      if (!this.g.isEmpty()) {
         pp $$7 = new pp();
         this.g.forEach($$1x -> $$7.add($$1x.a($$0xx -> hm.T.b($$0xx).toString())));
         $$0.a("neighbor_fluid_ticks", (qc)$$7);
      }

      return $$0;
   }

   public interface a {
      cvo a(cvo var1, gy var2, cvo var3, cgy var4, gt var5, gt var6);

      default void a(cgy $$0) {
      }
   }

   static enum b implements cyf.a {
      a(
         cju.jA,
         cju.dn,
         cju.ky,
         cju.kz,
         cju.kA,
         cju.kB,
         cju.kC,
         cju.kD,
         cju.kE,
         cju.kF,
         cju.kG,
         cju.kH,
         cju.kI,
         cju.kJ,
         cju.kK,
         cju.kL,
         cju.kM,
         cju.kN,
         cju.fT,
         cju.fU,
         cju.fV,
         cju.eH,
         cju.G,
         cju.E,
         cju.F,
         cju.cp,
         cju.cq,
         cju.cr,
         cju.cs,
         cju.ct,
         cju.cu,
         cju.cA,
         cju.cB,
         cju.cC,
         cju.cD,
         cju.cE,
         cju.cF
      ) {
         @Override
         public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
            return $$0;
         }
      },
      b {
         @Override
         public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
            return $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
         }
      },
      c(cju.cg, cju.fW) {
         @Override
         public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
            if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(ckr.c) == cwg.a && $$2.c(ckr.c) == cwg.a) {
               gy $$6 = $$0.c(ckr.b);
               if ($$1.o() != $$6.o() && $$6 == $$2.c(ckr.b)) {
                  cwg $$7 = $$1 == $$6.h() ? cwg.b : cwg.c;
                  $$3.a($$5, $$2.a(ckr.c, $$7.a()), 18);
                  if ($$6 == gy.c || $$6 == gy.f) {
                     cti $$8 = $$3.c_($$4);
                     cti $$9 = $$3.c_($$5);
                     if ($$8 instanceof ctn && $$9 instanceof ctn) {
                        ctn.a((ctn)$$8, (ctn)$$9);
                     }
                  }

                  return $$0.a(ckr.c, $$7);
               }
            }

            return $$0;
         }
      },
      d(true, cju.aw, cju.au, cju.ax, cju.av, cju.as, cju.at) {
         private final ThreadLocal<List<ObjectSet<gt>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));

         @Override
         public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
            cvo $$6 = $$0.a($$1, $$3.a_($$5), $$3, $$4, $$5);
            if ($$0 != $$6) {
               int $$7 = $$6.c(cwe.aC);
               List<ObjectSet<gt>> $$8 = (List)this.g.get();
               if ($$8.isEmpty()) {
                  for(int $$9 = 0; $$9 < 7; ++$$9) {
                     $$8.add(new ObjectOpenHashSet());
                  }
               }

               ((ObjectSet)$$8.get($$7)).add($$4.h());
            }

            return $$0;
         }

         @Override
         public void a(cgy $$0) {
            gt.a $$1 = new gt.a();
            List<ObjectSet<gt>> $$2 = (List)this.g.get();

            for(int $$3 = 2; $$3 < $$2.size(); ++$$3) {
               int $$4 = $$3 - 1;
               ObjectSet<gt> $$5 = (ObjectSet)$$2.get($$4);
               ObjectSet<gt> $$6 = (ObjectSet)$$2.get($$3);
               ObjectIterator var8 = $$5.iterator();

               while(var8.hasNext()) {
                  gt $$7 = (gt)var8.next();
                  cvo $$8 = $$0.a_($$7);
                  if ($$8.c(cwe.aC) >= $$4) {
                     $$0.a($$7, $$8.a(cwe.aC, Integer.valueOf($$4)), 18);
                     if ($$3 != 7) {
                        for(gy $$9 : f) {
                           $$1.a($$7, $$9);
                           cvo $$10 = $$0.a_($$1);
                           if ($$10.b(cwe.aC) && $$8.c(cwe.aC) > $$3) {
                              $$6.add($$1.h());
                           }
                        }
                     }
                  }
               }
            }

            $$2.clear();
         }
      },
      e(cju.el, cju.ek) {
         @Override
         public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
            if ($$0.c(crf.b) == 7) {
               crg $$6 = ((crf)$$0.b()).b();
               if ($$2.a($$6)) {
                  return $$6.c().m().a(cnf.aD, $$1);
               }
            }

            return $$0;
         }
      };

      public static final gy[] f = gy.values();

      b(cjt... $$0) {
         this(false, $$0);
      }

      b(boolean $$0, cjt... $$1) {
         for(cjt $$2 : $$1) {
            cyf.i.put($$2, this);
         }

         if ($$0) {
            cyf.j.add(this);
         }

      }
   }
}
