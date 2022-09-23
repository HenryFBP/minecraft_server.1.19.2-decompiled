import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;

public class aot extends DataFix {
   public static final String a = "__context";
   private static final String d = "ChunkHeightAndBiomeFix";
   private static final int e = 16;
   private static final int f = 24;
   private static final int g = -4;
   public static final int b = 4096;
   private static final int h = 64;
   private static final int i = 9;
   private static final long j = 511L;
   private static final int k = 64;
   private static final String[] l = new String[]{
      "WORLD_SURFACE_WG", "WORLD_SURFACE", "WORLD_SURFACE_IGNORE_SNOW", "OCEAN_FLOOR_WG", "OCEAN_FLOOR", "MOTION_BLOCKING", "MOTION_BLOCKING_NO_LEAVES"
   };
   private static final Set<String> m = Set.of("surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
   private static final Set<String> n = Set.of("noise", "surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
   private static final Set<String> o = Set.of(
      new String[]{
         "minecraft:air",
         "minecraft:basalt",
         "minecraft:bedrock",
         "minecraft:blackstone",
         "minecraft:calcite",
         "minecraft:cave_air",
         "minecraft:coarse_dirt",
         "minecraft:crimson_nylium",
         "minecraft:dirt",
         "minecraft:end_stone",
         "minecraft:grass_block",
         "minecraft:gravel",
         "minecraft:ice",
         "minecraft:lava",
         "minecraft:mycelium",
         "minecraft:nether_wart_block",
         "minecraft:netherrack",
         "minecraft:orange_terracotta",
         "minecraft:packed_ice",
         "minecraft:podzol",
         "minecraft:powder_snow",
         "minecraft:red_sand",
         "minecraft:red_sandstone",
         "minecraft:sand",
         "minecraft:sandstone",
         "minecraft:snow_block",
         "minecraft:soul_sand",
         "minecraft:soul_soil",
         "minecraft:stone",
         "minecraft:terracotta",
         "minecraft:warped_nylium",
         "minecraft:warped_wart_block",
         "minecraft:water",
         "minecraft:white_terracotta"
      }
   );
   private static final int p = 16;
   private static final int q = 64;
   private static final int r = 1008;
   public static final String c = "minecraft:plains";
   private static final Int2ObjectMap<String> s = new Int2ObjectOpenHashMap();

   public aot(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(asr.c);
      OpticFinder<?> $$1 = $$0.findField("Level");
      OpticFinder<?> $$2 = $$1.type().findField("Sections");
      Schema $$3 = this.getOutputSchema();
      Type<?> $$4 = $$3.getType(asr.c);
      Type<?> $$5 = $$4.findField("Level").type();
      Type<?> $$6 = $$5.findField("Sections").type();
      return this.fixTypeEverywhereTyped(
         "ChunkHeightAndBiomeFix",
         $$0,
         $$4,
         $$4x -> $$4x.updateTyped(
               $$1,
               $$5,
               $$3xx -> {
                  Dynamic<?> $$4xx = (Dynamic)$$3xx.get(DSL.remainderFinder());
                  OptionalDynamic<?> $$5x = ((Dynamic)$$4x.get(DSL.remainderFinder())).get("__context");
                  String $$6x = (String)$$5x.get("dimension").asString().result().orElse("");
                  String $$7 = (String)$$5x.get("generator").asString().result().orElse("");
                  boolean $$8 = "minecraft:overworld".equals($$6x);
                  MutableBoolean $$9 = new MutableBoolean();
                  int $$10 = $$8 ? -4 : 0;
                  Dynamic<?>[] $$11 = a($$4xx, $$8, $$10, $$9);
                  Dynamic<?> $$12 = d(
                     $$4xx.createList(Stream.of($$4xx.createMap(ImmutableMap.of($$4xx.createString("Name"), $$4xx.createString("minecraft:air")))))
                  );
                  Set<String> $$13 = Sets.newHashSet();
                  MutableObject<Supplier<aow.a>> $$14 = new MutableObject((Supplier)() -> null);
                  $$3xx = $$3xx.updateTyped(
                     $$2,
                     $$6,
                     $$7x -> {
                        IntSet $$8x = new IntOpenHashSet();
                        Dynamic<?> $$9x = (Dynamic)$$7x.write().result().orElseThrow(() -> new IllegalStateException("Malformed Chunk.Level.Sections"));
                        List<Dynamic<?>> $$10x = (List)$$9x.asStream().map($$6xxx -> {
                           int $$7xx = $$6xxx.get("Y").asInt(0);
                           Dynamic<?> $$8xx = (Dynamic)DataFixUtils.orElse($$6xxx.get("Palette").result().flatMap($$2xxxxx -> {
                              $$2xxxxx.asStream().map($$0xxxxxx -> $$0xxxxxx.get("Name").asString("minecraft:air")).forEach($$13::add);
                              return $$6xxx.get("BlockStates").result().map($$1xxxxxx -> b($$2xxxxx, $$1xxxxxx));
                           }), $$12);
                           Dynamic<?> $$9xx = $$6xxx;
                           int $$10xx = $$7xx - $$10;
                           if ($$10xx >= 0 && $$10xx < $$11.length) {
                              $$9xx = $$6xxx.set("biomes", $$11[$$10xx]);
                           }
         
                           $$8x.add($$7xx);
                           if ($$6xxx.get("Y").asInt(Integer.MAX_VALUE) == 0) {
                              $$14.setValue((Supplier)() -> {
                                 List<? extends Dynamic<?>> $$1xxxxx = $$8xx.get("palette").asList(Function.identity());
                                 long[] $$2xxxxx = $$8xx.get("data").asLongStream().toArray();
                                 return new aow.a($$1xxxxx, $$2xxxxx);
                              });
                           }
         
                           return $$9xx.set("block_states", $$8xx).remove("Palette").remove("BlockStates");
                        }).collect(Collectors.toCollection(ArrayList::new));
         
                        for(int $$11x = 0; $$11x < $$11.length; ++$$11x) {
                           int $$12x = $$11x + $$10;
                           if ($$8x.add($$12x)) {
                              Dynamic<?> $$13x = $$4xx.createMap(Map.of($$4xx.createString("Y"), $$4xx.createInt($$12x)));
                              $$13x = $$13x.set("block_states", $$12);
                              $$13x = $$13x.set("biomes", $$11[$$11x]);
                              $$10x.add($$13x);
                           }
                        }
         
                        return (Typed)((Pair)$$6.readTyped($$4xx.createList($$10x.stream()))
                              .result()
                              .orElseThrow(() -> new IllegalStateException("ChunkHeightAndBiomeFix failed.")))
                           .getFirst();
                     }
                  );
                  return $$3xx.update(DSL.remainderFinder(), $$5xx -> {
                     if ($$8) {
                        $$5xx = this.a($$5xx, $$13);
                     }
      
                     return a($$5xx, $$8, $$9.booleanValue(), "minecraft:noise".equals($$7), (Supplier<aow.a>)$$14.getValue());
                  });
               }
            )
      );
   }

   private Dynamic<?> a(Dynamic<?> $$0, Set<String> $$1) {
      return $$0.update("Status", $$1x -> {
         String $$2 = $$1x.asString("empty");
         if (m.contains($$2)) {
            return $$1x;
         } else {
            $$1.remove("minecraft:air");
            boolean $$3 = !$$1.isEmpty();
            $$1.removeAll(o);
            boolean $$4 = !$$1.isEmpty();
            if ($$4) {
               return $$1x.createString("liquid_carvers");
            } else if ("noise".equals($$2) || $$3) {
               return $$1x.createString("noise");
            } else {
               return "biomes".equals($$2) ? $$1x.createString("structure_references") : $$1x;
            }
         }
      });
   }

   private static Dynamic<?>[] a(Dynamic<?> $$0, boolean $$1, int $$2, MutableBoolean $$3) {
      Dynamic<?>[] $$4 = new Dynamic[$$1 ? 24 : 16];
      int[] $$5 = (int[])$$0.get("Biomes").asIntStreamOpt().result().map(IntStream::toArray).orElse(null);
      if ($$5 != null && $$5.length == 1536) {
         $$3.setValue(true);

         for(int $$6 = 0; $$6 < 24; ++$$6) {
            $$4[$$6] = a($$0, (Int2IntFunction)($$2x -> a($$5, $$6 * 64 + $$2x)));
         }
      } else if ($$5 != null && $$5.length == 1024) {
         for(int $$8 = 0; $$8 < 16; ++$$8) {
            int $$9 = $$8 - $$2;
            $$4[$$9] = a($$0, (Int2IntFunction)($$2x -> a($$5, $$8 * 64 + $$2x)));
         }

         if ($$1) {
            Dynamic<?> $$11 = a($$0, (Int2IntFunction)($$1x -> a($$5, $$1x % 16)));
            Dynamic<?> $$12 = a($$0, (Int2IntFunction)($$1x -> a($$5, $$1x % 16 + 1008)));

            for(int $$13 = 0; $$13 < 4; ++$$13) {
               $$4[$$13] = $$11;
            }

            for(int $$14 = 20; $$14 < 24; ++$$14) {
               $$4[$$14] = $$12;
            }
         }
      } else {
         Arrays.fill($$4, d($$0.createList(Stream.of($$0.createString("minecraft:plains")))));
      }

      return $$4;
   }

   private static int a(int[] $$0, int $$1) {
      return $$0[$$1] & 0xFF;
   }

   private static Dynamic<?> a(Dynamic<?> $$0, boolean $$1, boolean $$2, boolean $$3, Supplier<aow.a> $$4) {
      $$0 = $$0.remove("Biomes");
      if (!$$1) {
         return a($$0, 16, 0);
      } else if ($$2) {
         return a($$0, 24, 0);
      } else {
         $$0 = b($$0);
         $$0 = a($$0, "Lights");
         $$0 = a($$0, "LiquidsToBeTicked");
         $$0 = a($$0, "PostProcessing");
         $$0 = a($$0, "ToBeTicked");
         $$0 = a($$0, 24, 4);
         $$0 = $$0.update("UpgradeData", aot::a);
         if (!$$3) {
            return $$0;
         } else {
            Optional<? extends Dynamic<?>> $$5 = $$0.get("Status").result();
            if ($$5.isPresent()) {
               Dynamic<?> $$6 = (Dynamic)$$5.get();
               String $$7 = $$6.asString("");
               if (!"empty".equals($$7)) {
                  $$0 = $$0.set("blending_data", $$0.createMap(ImmutableMap.of($$0.createString("old_noise"), $$0.createBoolean(n.contains($$7)))));
                  aow.a $$8 = (aow.a)$$4.get();
                  if ($$8 != null) {
                     BitSet $$9 = new BitSet(256);
                     boolean $$10 = $$7.equals("noise");

                     for(int $$11 = 0; $$11 < 16; ++$$11) {
                        for(int $$12 = 0; $$12 < 16; ++$$12) {
                           Dynamic<?> $$13 = $$8.a($$12, 0, $$11);
                           boolean $$14 = $$13 != null && "minecraft:bedrock".equals($$13.get("Name").asString(""));
                           boolean $$15 = $$13 != null && "minecraft:air".equals($$13.get("Name").asString(""));
                           if ($$15) {
                              $$9.set($$11 * 16 + $$12);
                           }

                           $$10 |= $$14;
                        }
                     }

                     if ($$10 && $$9.cardinality() != $$9.size()) {
                        Dynamic<?> $$16 = "full".equals($$7) ? $$0.createString("heightmaps") : $$6;
                        $$0 = $$0.set(
                           "below_zero_retrogen",
                           $$0.createMap(
                              ImmutableMap.of(
                                 $$0.createString("target_status"),
                                 $$16,
                                 $$0.createString("missing_bedrock"),
                                 $$0.createLongList(LongStream.of($$9.toLongArray()))
                              )
                           )
                        );
                        $$0 = $$0.set("Status", $$0.createString("empty"));
                     }

                     $$0 = $$0.set("isLightOn", $$0.createBoolean(false));
                  }
               }
            }

            return $$0;
         }
      }
   }

   private static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return $$0.update("Indices", $$0x -> {
         Map<Dynamic<?>, Dynamic<?>> $$1 = new HashMap();
         $$0x.getMapValues().result().ifPresent($$1x -> $$1x.forEach(($$1xx, $$2) -> {
               try {
                  $$1xx.asString().result().map(Integer::parseInt).ifPresent($$3 -> {
                     int $$4 = $$3 - -4;
                     $$1.put($$1xx.createString(Integer.toString($$4)), $$2);
                  });
               } catch (NumberFormatException var4) {
               }

            }));
         return $$0x.createMap($$1);
      });
   }

   private static Dynamic<?> a(Dynamic<?> $$0, int $$1, int $$2) {
      Dynamic<?> $$3 = $$0.get("CarvingMasks").orElseEmptyMap();
      $$3 = $$3.updateMapValues($$3x -> {
         long[] $$4 = BitSet.valueOf(((Dynamic)$$3x.getSecond()).asByteBuffer().array()).toLongArray();
         long[] $$5 = new long[64 * $$1];
         System.arraycopy($$4, 0, $$5, 64 * $$2, $$4.length);
         return Pair.of((Dynamic)$$3x.getFirst(), $$0.createLongList(LongStream.of($$5)));
      });
      return $$0.set("CarvingMasks", $$3);
   }

   private static Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      List<Dynamic<?>> $$2 = (List)$$0.get($$1).orElseEmptyList().asStream().collect(Collectors.toCollection(ArrayList::new));
      if ($$2.size() == 24) {
         return $$0;
      } else {
         Dynamic<?> $$3 = $$0.emptyList();

         for(int $$4 = 0; $$4 < 4; ++$$4) {
            $$2.add(0, $$3);
            $$2.add($$3);
         }

         return $$0.set($$1, $$0.createList($$2.stream()));
      }
   }

   private static Dynamic<?> b(Dynamic<?> $$0) {
      return $$0.update("Heightmaps", $$0x -> {
         for(String $$1 : l) {
            $$0x = $$0x.update($$1, aot::c);
         }

         return $$0x;
      });
   }

   private static Dynamic<?> c(Dynamic<?> $$0) {
      return $$0.createLongList($$0.asLongStream().map($$0x -> {
         long $$1 = 0L;

         for(int $$2 = 0; $$2 + 9 <= 64; $$2 += 9) {
            long $$3 = $$0x >> $$2 & 511L;
            long $$4;
            if ($$3 == 0L) {
               $$4 = 0L;
            } else {
               $$4 = Math.min($$3 + 64L, 511L);
            }

            $$1 |= $$4 << $$2;
         }

         return $$1;
      }));
   }

   private static Dynamic<?> a(Dynamic<?> $$0, Int2IntFunction $$1) {
      Int2IntMap $$2 = new Int2IntLinkedOpenHashMap();

      for(int $$3 = 0; $$3 < 64; ++$$3) {
         int $$4 = $$1.applyAsInt($$3);
         if (!$$2.containsKey($$4)) {
            $$2.put($$4, $$2.size());
         }
      }

      Dynamic<?> $$5 = $$0.createList($$2.keySet().stream().map($$1x -> $$0.createString((String)s.getOrDefault($$1x, "minecraft:plains"))));
      int $$6 = a($$2.size());
      if ($$6 == 0) {
         return d($$5);
      } else {
         int $$7 = 64 / $$6;
         int $$8 = (64 + $$7 - 1) / $$7;
         long[] $$9 = new long[$$8];
         int $$10 = 0;
         int $$11 = 0;

         for(int $$12 = 0; $$12 < 64; ++$$12) {
            int $$13 = $$1.applyAsInt($$12);
            $$9[$$10] |= (long)$$2.get($$13) << $$11;
            $$11 += $$6;
            if ($$11 + $$6 > 64) {
               ++$$10;
               $$11 = 0;
            }
         }

         Dynamic<?> $$14 = $$0.createLongList(Arrays.stream($$9));
         return a($$5, $$14);
      }
   }

   private static Dynamic<?> d(Dynamic<?> $$0) {
      return $$0.createMap(ImmutableMap.of($$0.createString("palette"), $$0));
   }

   private static Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1) {
      return $$0.createMap(ImmutableMap.of($$0.createString("palette"), $$0, $$0.createString("data"), $$1));
   }

   private static Dynamic<?> b(Dynamic<?> $$0, Dynamic<?> $$1) {
      List<Dynamic<?>> $$2 = (List)$$0.asStream().collect(Collectors.toCollection(ArrayList::new));
      if ($$2.size() == 1) {
         return d($$0);
      } else {
         $$0 = a($$0, $$1, $$2);
         return a($$0, $$1);
      }
   }

   private static Dynamic<?> a(Dynamic<?> $$0, Dynamic<?> $$1, List<Dynamic<?>> $$2) {
      long $$3 = $$1.asLongStream().count() * 64L;
      long $$4 = $$3 / 4096L;
      int $$5 = $$2.size();
      int $$6 = a($$5);
      if ($$4 <= (long)$$6) {
         return $$0;
      } else {
         Dynamic<?> $$7 = $$0.createMap(ImmutableMap.of($$0.createString("Name"), $$0.createString("minecraft:air")));
         int $$8 = (1 << (int)($$4 - 1L)) + 1;
         int $$9 = $$8 - $$5;

         for(int $$10 = 0; $$10 < $$9; ++$$10) {
            $$2.add($$7);
         }

         return $$0.createList($$2.stream());
      }
   }

   public static int a(int $$0) {
      return $$0 == 0 ? 0 : (int)Math.ceil(Math.log((double)$$0) / Math.log(2.0));
   }

   static {
      s.put(0, "minecraft:ocean");
      s.put(1, "minecraft:plains");
      s.put(2, "minecraft:desert");
      s.put(3, "minecraft:mountains");
      s.put(4, "minecraft:forest");
      s.put(5, "minecraft:taiga");
      s.put(6, "minecraft:swamp");
      s.put(7, "minecraft:river");
      s.put(8, "minecraft:nether_wastes");
      s.put(9, "minecraft:the_end");
      s.put(10, "minecraft:frozen_ocean");
      s.put(11, "minecraft:frozen_river");
      s.put(12, "minecraft:snowy_tundra");
      s.put(13, "minecraft:snowy_mountains");
      s.put(14, "minecraft:mushroom_fields");
      s.put(15, "minecraft:mushroom_field_shore");
      s.put(16, "minecraft:beach");
      s.put(17, "minecraft:desert_hills");
      s.put(18, "minecraft:wooded_hills");
      s.put(19, "minecraft:taiga_hills");
      s.put(20, "minecraft:mountain_edge");
      s.put(21, "minecraft:jungle");
      s.put(22, "minecraft:jungle_hills");
      s.put(23, "minecraft:jungle_edge");
      s.put(24, "minecraft:deep_ocean");
      s.put(25, "minecraft:stone_shore");
      s.put(26, "minecraft:snowy_beach");
      s.put(27, "minecraft:birch_forest");
      s.put(28, "minecraft:birch_forest_hills");
      s.put(29, "minecraft:dark_forest");
      s.put(30, "minecraft:snowy_taiga");
      s.put(31, "minecraft:snowy_taiga_hills");
      s.put(32, "minecraft:giant_tree_taiga");
      s.put(33, "minecraft:giant_tree_taiga_hills");
      s.put(34, "minecraft:wooded_mountains");
      s.put(35, "minecraft:savanna");
      s.put(36, "minecraft:savanna_plateau");
      s.put(37, "minecraft:badlands");
      s.put(38, "minecraft:wooded_badlands_plateau");
      s.put(39, "minecraft:badlands_plateau");
      s.put(40, "minecraft:small_end_islands");
      s.put(41, "minecraft:end_midlands");
      s.put(42, "minecraft:end_highlands");
      s.put(43, "minecraft:end_barrens");
      s.put(44, "minecraft:warm_ocean");
      s.put(45, "minecraft:lukewarm_ocean");
      s.put(46, "minecraft:cold_ocean");
      s.put(47, "minecraft:deep_warm_ocean");
      s.put(48, "minecraft:deep_lukewarm_ocean");
      s.put(49, "minecraft:deep_cold_ocean");
      s.put(50, "minecraft:deep_frozen_ocean");
      s.put(127, "minecraft:the_void");
      s.put(129, "minecraft:sunflower_plains");
      s.put(130, "minecraft:desert_lakes");
      s.put(131, "minecraft:gravelly_mountains");
      s.put(132, "minecraft:flower_forest");
      s.put(133, "minecraft:taiga_mountains");
      s.put(134, "minecraft:swamp_hills");
      s.put(140, "minecraft:ice_spikes");
      s.put(149, "minecraft:modified_jungle");
      s.put(151, "minecraft:modified_jungle_edge");
      s.put(155, "minecraft:tall_birch_forest");
      s.put(156, "minecraft:tall_birch_hills");
      s.put(157, "minecraft:dark_forest_hills");
      s.put(158, "minecraft:snowy_taiga_mountains");
      s.put(160, "minecraft:giant_spruce_taiga");
      s.put(161, "minecraft:giant_spruce_taiga_hills");
      s.put(162, "minecraft:modified_gravelly_mountains");
      s.put(163, "minecraft:shattered_savanna");
      s.put(164, "minecraft:shattered_savanna_plateau");
      s.put(165, "minecraft:eroded_badlands");
      s.put(166, "minecraft:modified_wooded_badlands_plateau");
      s.put(167, "minecraft:modified_badlands_plateau");
      s.put(168, "minecraft:bamboo_jungle");
      s.put(169, "minecraft:bamboo_jungle_hills");
      s.put(170, "minecraft:soul_sand_valley");
      s.put(171, "minecraft:crimson_forest");
      s.put(172, "minecraft:warped_forest");
      s.put(173, "minecraft:basalt_deltas");
      s.put(174, "minecraft:dripstone_caves");
      s.put(175, "minecraft:lush_caves");
      s.put(177, "minecraft:meadow");
      s.put(178, "minecraft:grove");
      s.put(179, "minecraft:snowy_slopes");
      s.put(180, "minecraft:snowcapped_peaks");
      s.put(181, "minecraft:lofty_peaks");
      s.put(182, "minecraft:stony_peaks");
   }
}
