import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = -1;
   private final cyh c;
   private final hn d;
   private final hm<cht> e;
   private final hm<dlb> f;
   private final dou g;
   private final aba<cgx> h;
   private final cxk i;
   private final dbf j;
   private final cgz k;
   private final chx l;
   private final long m;
   private final DataFixer n;
   private final Long2ObjectMap<Object2IntMap<dlb>> o = new Long2ObjectOpenHashMap();
   private final Map<dlb, Long2BooleanMap> p = new HashMap();

   public dlc(cyh $$0, hn $$1, dou $$2, aba<cgx> $$3, cxk $$4, dbf $$5, cgz $$6, chx $$7, long $$8, DataFixer $$9) {
      this.c = $$0;
      this.d = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = $$4;
      this.j = $$5;
      this.k = $$6;
      this.l = $$7;
      this.m = $$8;
      this.n = $$9;
      this.e = $$1.b(hm.aR);
      this.f = $$1.b(hm.aN);
   }

   public dld a(cge $$0, dlb $$1, boolean $$2) {
      long $$3 = $$0.a();
      Object2IntMap<dlb> $$4 = (Object2IntMap)this.o.get($$3);
      if ($$4 != null) {
         return this.a($$4, $$1, $$2);
      } else {
         dld $$5 = this.a($$0, $$1, $$2, $$3);
         if ($$5 != null) {
            return $$5;
         } else {
            boolean $$6 = ((Long2BooleanMap)this.p.computeIfAbsent($$1, $$0x -> new Long2BooleanOpenHashMap())).computeIfAbsent($$3, $$2x -> this.b($$0, $$1));
            return !$$6 ? dld.b : dld.c;
         }
      }
   }

   private boolean b(cge $$0, dlb $$1) {
      return $$1.a(new dlb.a(this.d, this.i, this.l, this.j, this.g, this.m, $$0, this.k, $$1.a()::a)).isPresent();
   }

   @Nullable
   private dld a(cge $$0, dlb $$1, boolean $$2, long $$3) {
      qj $$4 = new qj(new ql(po.a, "DataVersion"), new ql("Level", "Structures", pj.b, "Starts"), new ql("structures", pj.b, "starts"));

      try {
         this.c.a($$0, $$4).join();
      } catch (Exception var13) {
         a.warn("Failed to read chunk {}", $$0, var13);
         return dld.c;
      }

      qc $$6 = $$4.d();
      if (!($$6 instanceof pj)) {
         return null;
      } else {
         pj $$7 = (pj)$$6;
         int $$8 = cyj.a($$7);
         if ($$8 <= 1493) {
            return dld.c;
         } else {
            cyj.a($$7, this.h, this.i.c());

            pj $$9;
            try {
               $$9 = pv.a(this.n, ani.c, $$7, $$8);
            } catch (Exception var12) {
               a.warn("Failed to partially datafix chunk {}", $$0, var12);
               return dld.c;
            }

            Object2IntMap<dlb> $$12 = this.a($$9);
            if ($$12 == null) {
               return null;
            } else {
               this.a($$3, $$12);
               return this.a($$12, $$1, $$2);
            }
         }
      }
   }

   @Nullable
   private Object2IntMap<dlb> a(pj $$0) {
      if (!$$0.b("structures", 10)) {
         return null;
      } else {
         pj $$1 = $$0.p("structures");
         if (!$$1.b("starts", 10)) {
            return null;
         } else {
            pj $$2 = $$1.p("starts");
            if ($$2.f()) {
               return Object2IntMaps.emptyMap();
            } else {
               Object2IntMap<dlb> $$3 = new Object2IntOpenHashMap();
               hm<dlb> $$4 = this.d.d(hm.aN);

               for(String $$5 : $$2.d()) {
                  abb $$6 = abb.a($$5);
                  if ($$6 != null) {
                     dlb $$7 = $$4.a($$6);
                     if ($$7 != null) {
                        pj $$8 = $$2.p($$5);
                        if (!$$8.f()) {
                           String $$9 = $$8.l("id");
                           if (!"INVALID".equals($$9)) {
                              int $$10 = $$8.h("references");
                              $$3.put($$7, $$10);
                           }
                        }
                     }
                  }
               }

               return $$3;
            }
         }
      }
   }

   private static Object2IntMap<dlb> a(Object2IntMap<dlb> $$0) {
      return $$0.isEmpty() ? Object2IntMaps.emptyMap() : $$0;
   }

   private dld a(Object2IntMap<dlb> $$0, dlb $$1, boolean $$2) {
      int $$3 = $$0.getOrDefault($$1, -1);
      return $$3 == -1 || $$2 && $$3 != 0 ? dld.b : dld.a;
   }

   public void a(cge $$0, Map<dlb, dlj> $$1) {
      long $$2 = $$0.a();
      Object2IntMap<dlb> $$3 = new Object2IntOpenHashMap();
      $$1.forEach(($$1x, $$2x) -> {
         if ($$2x.b()) {
            $$3.put($$1x, $$2x.f());
         }

      });
      this.a($$2, $$3);
   }

   private void a(long $$0, Object2IntMap<dlb> $$1) {
      this.o.put($$0, a($$1));
      this.p.values().forEach($$1x -> $$1x.remove($$0));
   }

   public void a(cge $$0, dlb $$1) {
      this.o.compute($$0.a(), ($$1x, $$2) -> {
         if ($$2 == null || $$2.isEmpty()) {
            $$2 = new Object2IntOpenHashMap();
         }

         $$2.computeInt($$1, ($$0xx, $$1xx) -> $$1xx == null ? 1 : $$1xx + 1);
         return $$2;
      });
   }
}
