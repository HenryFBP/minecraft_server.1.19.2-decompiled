import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class dkw {
   private static final Map<String, String> a = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put("Village", "Village");
      $$0.put("Mineshaft", "Mineshaft");
      $$0.put("Mansion", "Mansion");
      $$0.put("Igloo", "Temple");
      $$0.put("Desert_Pyramid", "Temple");
      $$0.put("Jungle_Pyramid", "Temple");
      $$0.put("Swamp_Hut", "Temple");
      $$0.put("Stronghold", "Stronghold");
      $$0.put("Monument", "Monument");
      $$0.put("Fortress", "Fortress");
      $$0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> b = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put("Iglu", "Igloo");
      $$0.put("TeDP", "Desert_Pyramid");
      $$0.put("TeJP", "Jungle_Pyramid");
      $$0.put("TeSH", "Swamp_Hut");
   });
   private static final Set<String> c = Set.of(
      new String[]{
         "pillager_outpost",
         "mineshaft",
         "mansion",
         "jungle_pyramid",
         "desert_pyramid",
         "igloo",
         "ruined_portal",
         "shipwreck",
         "swamp_hut",
         "stronghold",
         "monument",
         "ocean_ruin",
         "fortress",
         "endcity",
         "buried_treasure",
         "village",
         "nether_fossil",
         "bastion_remnant"
      }
   );
   private final boolean d;
   private final Map<String, Long2ObjectMap<pj>> e = Maps.newHashMap();
   private final Map<String, dle> f = Maps.newHashMap();
   private final List<String> g;
   private final List<String> h;

   public dkw(@Nullable drm $$0, List<String> $$1, List<String> $$2) {
      this.g = $$1;
      this.h = $$2;
      this.a($$0);
      boolean $$3 = false;

      for(String $$4 : this.h) {
         $$3 |= this.e.get($$4) != null;
      }

      this.d = $$3;
   }

   public void a(long $$0) {
      for(String $$1 : this.g) {
         dle $$2 = (dle)this.f.get($$1);
         if ($$2 != null && $$2.c($$0)) {
            $$2.d($$0);
            $$2.b();
         }
      }

   }

   public pj a(pj $$0) {
      pj $$1 = $$0.p("Level");
      cge $$2 = new cge($$1.h("xPos"), $$1.h("zPos"));
      if (this.a($$2.e, $$2.f)) {
         $$0 = this.a($$0, $$2);
      }

      pj $$3 = $$1.p("Structures");
      pj $$4 = $$3.p("References");

      for(String $$5 : this.h) {
         boolean $$6 = c.contains($$5.toLowerCase(Locale.ROOT));
         if (!$$4.b($$5, 12) && $$6) {
            int $$7 = 8;
            LongList $$8 = new LongArrayList();

            for(int $$9 = $$2.e - 8; $$9 <= $$2.e + 8; ++$$9) {
               for(int $$10 = $$2.f - 8; $$10 <= $$2.f + 8; ++$$10) {
                  if (this.a($$9, $$10, $$5)) {
                     $$8.add(cge.c($$9, $$10));
                  }
               }
            }

            $$4.c($$5, $$8);
         }
      }

      $$3.a("References", (qc)$$4);
      $$1.a("Structures", (qc)$$3);
      $$0.a("Level", (qc)$$1);
      return $$0;
   }

   private boolean a(int $$0, int $$1, String $$2) {
      if (!this.d) {
         return false;
      } else {
         return this.e.get($$2) != null && ((dle)this.f.get(a.get($$2))).b(cge.c($$0, $$1));
      }
   }

   private boolean a(int $$0, int $$1) {
      if (!this.d) {
         return false;
      } else {
         for(String $$2 : this.h) {
            if (this.e.get($$2) != null && ((dle)this.f.get(a.get($$2))).c(cge.c($$0, $$1))) {
               return true;
            }
         }

         return false;
      }
   }

   private pj a(pj $$0, cge $$1) {
      pj $$2 = $$0.p("Level");
      pj $$3 = $$2.p("Structures");
      pj $$4 = $$3.p("Starts");

      for(String $$5 : this.h) {
         Long2ObjectMap<pj> $$6 = (Long2ObjectMap)this.e.get($$5);
         if ($$6 != null) {
            long $$7 = $$1.a();
            if (((dle)this.f.get(a.get($$5))).c($$7)) {
               pj $$8 = (pj)$$6.get($$7);
               if ($$8 != null) {
                  $$4.a($$5, (qc)$$8);
               }
            }
         }
      }

      $$3.a("Starts", (qc)$$4);
      $$2.a("Structures", (qc)$$3);
      $$0.a("Level", (qc)$$2);
      return $$0;
   }

   private void a(@Nullable drm $$0) {
      if ($$0 != null) {
         for(String $$1 : this.g) {
            pj $$2 = new pj();

            try {
               $$2 = $$0.a($$1, 1493).p("data").p("Features");
               if ($$2.f()) {
                  continue;
               }
            } catch (IOException var13) {
            }

            for(String $$3 : $$2.d()) {
               pj $$4 = $$2.p($$3);
               long $$5 = cge.c($$4.h("ChunkX"), $$4.h("ChunkZ"));
               pp $$6 = $$4.c("Children", 10);
               if (!$$6.isEmpty()) {
                  String $$7 = $$6.a(0).l("id");
                  String $$8 = (String)b.get($$7);
                  if ($$8 != null) {
                     $$4.a("id", $$8);
                  }
               }

               String $$9 = $$4.l("id");
               ((Long2ObjectMap)this.e.computeIfAbsent($$9, $$0x -> new Long2ObjectOpenHashMap())).put($$5, $$4);
            }

            String $$10 = $$1 + "_index";
            dle $$11 = $$0.a(dle::b, dle::new, $$10);
            if (!$$11.a().isEmpty()) {
               this.f.put($$1, $$11);
            } else {
               dle $$12 = new dle();
               this.f.put($$1, $$12);

               for(String $$13 : $$2.d()) {
                  pj $$14 = $$2.p($$13);
                  $$12.a(cge.c($$14.h("ChunkX"), $$14.h("ChunkZ")));
               }

               $$12.b();
            }
         }

      }
   }

   public static dkw a(aba<cgx> $$0, @Nullable drm $$1) {
      if ($$0 == cgx.e) {
         return new dkw(
            $$1,
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument")
         );
      } else if ($$0 == cgx.f) {
         List<String> $$2 = ImmutableList.of("Fortress");
         return new dkw($$1, $$2, $$2);
      } else if ($$0 == cgx.g) {
         List<String> $$3 = ImmutableList.of("EndCity");
         return new dkw($$1, $$3, $$3);
      } else {
         throw new RuntimeException(String.format(Locale.ROOT, "Unknown dimension type : %s", $$0));
      }
   }
}
