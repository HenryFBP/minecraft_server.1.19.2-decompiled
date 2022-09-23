import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cyi {
   private static final Codec<cya<cvo>> h = cya.a(cjt.o, cvo.b, cya.d.d, cju.a.m());
   private static final Logger i = LogUtils.getLogger();
   private static final String j = "UpgradeData";
   private static final String k = "block_ticks";
   private static final String l = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   public static cyc a(agg $$0, bms $$1, cge $$2, pj $$3) {
      cge $$4 = new cge($$3.h("xPos"), $$3.h("zPos"));
      if (!Objects.equals($$2, $$4)) {
         i.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$2, $$2, $$4});
      }

      cyf $$5 = $$3.b("UpgradeData", 10) ? new cyf($$3.p("UpgradeData"), $$0) : cyf.a;
      boolean $$6 = $$3.q("isLightOn");
      pp $$7 = $$3.c("sections", 10);
      int $$8 = $$0.ai();
      cxu[] $$9 = new cxu[$$8];
      boolean $$10 = $$0.q_().g();
      cxm $$11 = $$0.k();
      dpm $$12 = $$11.o();
      hm<cht> $$13 = $$0.s().d(hm.aR);
      Codec<cyb<hc<cht>>> $$14 = a($$13);
      boolean $$15 = false;

      for(int $$16 = 0; $$16 < $$7.size(); ++$$16) {
         pj $$17 = $$7.a($$16);
         int $$18 = $$17.f("Y");
         int $$19 = $$0.f($$18);
         if ($$19 >= 0 && $$19 < $$9.length) {
            cya<cvo> $$20;
            if ($$17.b("block_states", 10)) {
               $$20 = (cya)h.parse(pu.a, $$17.p("block_states")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$20 = new cya<>(cjt.o, cju.a.m(), cya.d.d);
            }

            cyb<hc<cht>> $$22;
            if ($$17.b("biomes", 10)) {
               $$22 = (cyb)$$14.parse(pu.a, $$17.p("biomes")).promotePartial($$2x -> a($$2, $$18, $$2x)).getOrThrow(false, i::error);
            } else {
               $$22 = new cya<>($$13.s(), $$13.h(cia.b), cya.d.e);
            }

            cxu $$24 = new cxu($$18, $$20, $$22);
            $$9[$$19] = $$24;
            $$1.a($$2, $$24);
         }

         boolean $$25 = $$17.b("BlockLight", 7);
         boolean $$26 = $$10 && $$17.b("SkyLight", 7);
         if ($$25 || $$26) {
            if (!$$15) {
               $$12.b($$2, true);
               $$15 = true;
            }

            if ($$25) {
               $$12.a(chg.b, hq.a($$2, $$18), new cxo($$17.m("BlockLight")), true);
            }

            if ($$26) {
               $$12.a(chg.a, hq.a($$2, $$18), new cxo($$17.m("SkyLight")), true);
            }
         }
      }

      long $$27 = $$3.i("InhabitedTime");
      cxn.a $$28 = a($$3);
      dbs $$29;
      if ($$3.b("blending_data", 10)) {
         $$29 = (dbs)dbs.e.parse(new Dynamic(pu.a, $$3.p("blending_data"))).resultOrPartial(i::error).orElse(null);
      } else {
         $$29 = null;
      }

      cxj $$33;
      if ($$28 == cxn.a.b) {
         dxv<cjt> $$31 = dxv.a($$3.c("block_ticks", 10), $$0x -> hm.V.b(abb.a($$0x)), $$2);
         dxv<dpu> $$32 = dxv.a($$3.c("fluid_ticks", 10), $$0x -> hm.T.b(abb.a($$0x)), $$2);
         $$33 = new cxt($$0.D(), $$2, $$5, $$31, $$32, $$27, $$9, a($$0, $$3), $$29);
      } else {
         dxy<cjt> $$34 = dxy.a($$3.c("block_ticks", 10), $$0x -> hm.V.b(abb.a($$0x)), $$2);
         dxy<dpu> $$35 = dxy.a($$3.c("fluid_ticks", 10), $$0x -> hm.T.b(abb.a($$0x)), $$2);
         cyc $$36 = new cyc($$2, $$5, $$9, $$34, $$35, $$0, $$13, $$29);
         $$33 = $$36;
         $$36.b($$27);
         if ($$3.b("below_zero_retrogen", 10)) {
            daf.a.parse(new Dynamic(pu.a, $$3.p("below_zero_retrogen"))).resultOrPartial(i::error).ifPresent($$36::a);
         }

         cxn $$38 = cxn.a($$3.l("Status"));
         $$36.a($$38);
         if ($$38.b(cxn.k)) {
            $$36.a($$12);
         }

         daf $$39 = $$36.x();
         boolean $$40 = $$38.b(cxn.l) || $$39 != null && $$39.a().b(cxn.l);
         if (!$$6 && $$40) {
            for(gt $$41 : gt.b($$2.d(), $$0.u_(), $$2.e(), $$2.f(), $$0.ah() - 1, $$2.g())) {
               if ($$33.a_($$41).g() != 0) {
                  $$36.j($$41);
               }
            }
         }
      }

      $$33.b($$6);
      pj $$42 = $$3.p("Heightmaps");
      EnumSet<dar.a> $$43 = EnumSet.noneOf(dar.a.class);

      for(dar.a $$44 : $$33.j().h()) {
         String $$45 = $$44.a();
         if ($$42.b($$45, 12)) {
            $$33.a($$44, $$42.o($$45));
         } else {
            $$43.add($$44);
         }
      }

      dar.a($$33, $$43);
      pj $$46 = $$3.p("structures");
      $$33.a(a(dlr.a($$0), $$46, $$0.B()));
      $$33.b(a($$0.s(), $$2, $$46));
      if ($$3.q("shouldSave")) {
         $$33.a(true);
      }

      pp $$47 = $$3.c("PostProcessing", 9);

      for(int $$48 = 0; $$48 < $$47.size(); ++$$48) {
         pp $$49 = $$47.b($$48);

         for(int $$50 = 0; $$50 < $$49.size(); ++$$50) {
            $$33.a($$49.d($$50), $$48);
         }
      }

      if ($$28 == cxn.a.b) {
         return new cxs((cxt)$$33, false);
      } else {
         cyc $$51 = (cyc)$$33;
         pp $$52 = $$3.c("entities", 10);

         for(int $$53 = 0; $$53 < $$52.size(); ++$$53) {
            $$51.b($$52.a($$53));
         }

         pp $$54 = $$3.c("block_entities", 10);

         for(int $$55 = 0; $$55 < $$54.size(); ++$$55) {
            pj $$56 = $$54.a($$55);
            $$33.a($$56);
         }

         pp $$57 = $$3.c("Lights", 9);

         for(int $$58 = 0; $$58 < $$57.size(); ++$$58) {
            pp $$59 = $$57.b($$58);

            for(int $$60 = 0; $$60 < $$59.size(); ++$$60) {
               $$51.b($$59.d($$60), $$58);
            }
         }

         pj $$61 = $$3.p("CarvingMasks");

         for(String $$62 : $$61.d()) {
            dan.a $$63 = dan.a.valueOf($$62);
            $$51.a($$63, new cxi($$61.o($$62), $$33.u_()));
         }

         return $$51;
      }
   }

   private static void a(cge $$0, int $$1, String $$2) {
      i.error("Recoverable errors when loading section [" + $$0.e + ", " + $$1 + ", " + $$0.f + "]: " + $$2);
   }

   private static Codec<cyb<hc<cht>>> a(hm<cht> $$0) {
      return cya.b($$0.s(), $$0.q(), cya.d.e, $$0.h(cia.b));
   }

   public static pj a(agg $$0, cxj $$1) {
      cge $$2 = $$1.f();
      pj $$3 = new pj();
      $$3.a("DataVersion", ab.b().getWorldVersion());
      $$3.a("xPos", $$2.e);
      $$3.a("yPos", $$1.aj());
      $$3.a("zPos", $$2.f);
      $$3.a("LastUpdate", $$0.U());
      $$3.a("InhabitedTime", $$1.u());
      $$3.a("Status", $$1.j().d());
      dbs $$4 = $$1.t();
      if ($$4 != null) {
         dbs.e.encodeStart(pu.a, $$4).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("blending_data", $$1x));
      }

      daf $$5 = $$1.x();
      if ($$5 != null) {
         daf.a.encodeStart(pu.a, $$5).resultOrPartial(i::error).ifPresent($$1x -> $$3.a("below_zero_retrogen", $$1x));
      }

      cyf $$6 = $$1.r();
      if (!$$6.a()) {
         $$3.a("UpgradeData", (qc)$$6.b());
      }

      cxu[] $$7 = $$1.d();
      pp $$8 = new pp();
      dpm $$9 = $$0.k().a();
      hm<cht> $$10 = $$0.s().d(hm.aR);
      Codec<cyb<hc<cht>>> $$11 = a($$10);
      boolean $$12 = $$1.v();

      for(int $$13 = $$9.c(); $$13 < $$9.d(); ++$$13) {
         int $$14 = $$1.f($$13);
         boolean $$15 = $$14 >= 0 && $$14 < $$7.length;
         cxo $$16 = $$9.a(chg.b).a(hq.a($$2, $$13));
         cxo $$17 = $$9.a(chg.a).a(hq.a($$2, $$13));
         if ($$15 || $$16 != null || $$17 != null) {
            pj $$18 = new pj();
            if ($$15) {
               cxu $$19 = $$7[$$14];
               $$18.a("block_states", (qc)h.encodeStart(pu.a, $$19.i()).getOrThrow(false, i::error));
               $$18.a("biomes", (qc)$$11.encodeStart(pu.a, $$19.j()).getOrThrow(false, i::error));
            }

            if ($$16 != null && !$$16.c()) {
               $$18.a("BlockLight", $$16.a());
            }

            if ($$17 != null && !$$17.c()) {
               $$18.a("SkyLight", $$17.a());
            }

            if (!$$18.f()) {
               $$18.a("Y", (byte)$$13);
               $$8.add($$18);
            }
         }
      }

      $$3.a("sections", (qc)$$8);
      if ($$12) {
         $$3.a("isLightOn", true);
      }

      pp $$20 = new pp();

      for(gt $$21 : $$1.c()) {
         pj $$22 = $$1.g($$21);
         if ($$22 != null) {
            $$20.add($$22);
         }
      }

      $$3.a("block_entities", (qc)$$20);
      if ($$1.j().g() == cxn.a.a) {
         cyc $$23 = (cyc)$$1;
         pp $$24 = new pp();
         $$24.addAll($$23.D());
         $$3.a("entities", (qc)$$24);
         $$3.a("Lights", (qc)a($$23.B()));
         pj $$25 = new pj();

         for(dan.a $$26 : dan.a.values()) {
            cxi $$27 = $$23.a($$26);
            if ($$27 != null) {
               $$25.a($$26.toString(), $$27.a());
            }
         }

         $$3.a("CarvingMasks", (qc)$$25);
      }

      a($$0, $$3, $$1.q());
      $$3.a("PostProcessing", (qc)a($$1.m()));
      pj $$28 = new pj();

      for(Entry<dar.a, dar> $$29 : $$1.e()) {
         if ($$1.j().h().contains($$29.getKey())) {
            $$28.a(((dar.a)$$29.getKey()).a(), (qc)(new pq(((dar)$$29.getValue()).a())));
         }
      }

      $$3.a("Heightmaps", (qc)$$28);
      $$3.a("structures", (qc)a(dlr.a($$0), $$2, $$1.g(), $$1.h()));
      return $$3;
   }

   private static void a(agg $$0, pj $$1, cxj.a $$2) {
      long $$3 = $$0.n_().e();
      $$1.a("block_ticks", $$2.a().b($$3, $$0x -> hm.V.b($$0x).toString()));
      $$1.a("fluid_ticks", $$2.b().b($$3, $$0x -> hm.T.b($$0x).toString()));
   }

   public static cxn.a a(@Nullable pj $$0) {
      return $$0 != null ? cxn.a($$0.l("Status")).g() : cxn.a.a;
   }

   @Nullable
   private static cxt.c a(agg $$0, pj $$1) {
      pp $$2 = a($$1, "entities");
      pp $$3 = a($$1, "block_entities");
      return $$2 == null && $$3 == null ? null : $$3x -> {
         if ($$2 != null) {
            $$0.a(bbr.a($$2, $$0));
         }

         if ($$3 != null) {
            for(int $$4 = 0; $$4 < $$3.size(); ++$$4) {
               pj $$5 = $$3.a($$4);
               boolean $$6 = $$5.q("keepPacked");
               if ($$6) {
                  $$3x.a($$5);
               } else {
                  gt $$7 = cti.c($$5);
                  cti $$8 = cti.a($$7, $$3x.a_($$7), $$5);
                  if ($$8 != null) {
                     $$3x.a($$8);
                  }
               }
            }
         }

      };
   }

   @Nullable
   private static pp a(pj $$0, String $$1) {
      pp $$2 = $$0.c($$1, 10);
      return $$2.isEmpty() ? null : $$2;
   }

   private static pj a(dlr $$0, cge $$1, Map<dlb, dlj> $$2, Map<dlb, LongSet> $$3) {
      pj $$4 = new pj();
      pj $$5 = new pj();
      hm<dlb> $$6 = $$0.b().d(hm.aN);

      for(Entry<dlb, dlj> $$7 : $$2.entrySet()) {
         abb $$8 = $$6.b((dlb)$$7.getKey());
         $$5.a($$8.toString(), (qc)((dlj)$$7.getValue()).a($$0, $$1));
      }

      $$4.a("starts", (qc)$$5);
      pj $$9 = new pj();

      for(Entry<dlb, LongSet> $$10 : $$3.entrySet()) {
         if (!((LongSet)$$10.getValue()).isEmpty()) {
            abb $$11 = $$6.b((dlb)$$10.getKey());
            $$9.a($$11.toString(), (qc)(new pq((LongSet)$$10.getValue())));
         }
      }

      $$4.a("References", (qc)$$9);
      return $$4;
   }

   private static Map<dlb, dlj> a(dlr $$0, pj $$1, long $$2) {
      Map<dlb, dlj> $$3 = Maps.newHashMap();
      hm<dlb> $$4 = $$0.b().d(hm.aN);
      pj $$5 = $$1.p("starts");

      for(String $$6 : $$5.d()) {
         abb $$7 = abb.a($$6);
         dlb $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.error("Unknown structure start: {}", $$7);
         } else {
            dlj $$9 = dlj.a($$0, $$5.p($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<dlb, LongSet> a(hn $$0, cge $$1, pj $$2) {
      Map<dlb, LongSet> $$3 = Maps.newHashMap();
      hm<dlb> $$4 = $$0.d(hm.aN);
      pj $$5 = $$2.p("References");

      for(String $$6 : $$5.d()) {
         abb $$7 = abb.a($$6);
         dlb $$8 = $$4.a($$7);
         if ($$8 == null) {
            i.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.o($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  cge $$3x = new cge($$2x);
                  if ($$3x.a($$1) > 8) {
                     i.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }

      return $$3;
   }

   public static pp a(ShortList[] $$0) {
      pp $$1 = new pp();

      for(ShortList $$2 : $$0) {
         pp $$3 = new pp();
         if ($$2 != null) {
            ShortListIterator var7 = $$2.iterator();

            while(var7.hasNext()) {
               Short $$4 = (Short)var7.next();
               $$3.add(px.a($$4));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }
}
