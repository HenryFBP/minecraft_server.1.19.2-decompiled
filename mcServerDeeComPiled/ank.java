import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class ank {
   private static final Logger b = LogUtils.getLogger();
   private static final BiFunction<Integer, Schema, Schema> c = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> d = aua::new;
   private static final DataFixer e = b();
   public static final int a = 3088;

   private ank() {
   }

   public static DataFixer a() {
      return e;
   }

   private static synchronized DataFixer b() {
      DataFixerBuilder $$0 = new DataFixerBuilder(ab.b().getWorldVersion());
      a($$0);

      boolean $$1 = switch(ab.aM) {
         case b -> true;
         case a -> false;
         default -> throw new IllegalStateException("Already loaded");
      };
      ab.aM = $$1 ? anj.d : anj.c;
      b.info("Building {} datafixer", $$1 ? "optimized" : "unoptimized");
      return $$1 ? $$0.buildOptimized(ad.f()) : $$0.buildUnoptimized();
   }

   private static void a(DataFixerBuilder $$0) {
      Schema $$1 = $$0.addSchema(99, awn::new);
      Schema $$2 = $$0.addSchema(100, aub::new);
      $$0.addFixer(new apl($$2, true));
      Schema $$3 = $$0.addSchema(101, c);
      $$0.addFixer(new aog($$3, false));
      Schema $$4 = $$0.addSchema(102, auc::new);
      $$0.addFixer(new aqy($$4, true));
      $$0.addFixer(new ara($$4, false));
      Schema $$5 = $$0.addSchema(105, c);
      $$0.addFixer(new are($$5, true));
      Schema $$6 = $$0.addSchema(106, aue::new);
      $$0.addFixer(new arw($$6, true));
      Schema $$7 = $$0.addSchema(107, auf::new);
      $$0.addFixer(new aps($$7, true));
      Schema $$8 = $$0.addSchema(108, c);
      $$0.addFixer(new aqf($$8, true));
      Schema $$9 = $$0.addSchema(109, c);
      $$0.addFixer(new apn($$9, true));
      Schema $$10 = $$0.addSchema(110, c);
      $$0.addFixer(new apo($$10, true));
      Schema $$11 = $$0.addSchema(111, c);
      $$0.addFixer(new apu($$11, true));
      Schema $$12 = $$0.addSchema(113, c);
      $$0.addFixer(new apz($$12, true));
      Schema $$13 = $$0.addSchema(135, auh::new);
      $$0.addFixer(new aqb($$13, true));
      Schema $$14 = $$0.addSchema(143, aui::new);
      $$0.addFixer(new aqh($$14, true));
      Schema $$15 = $$0.addSchema(147, c);
      $$0.addFixer(new apf($$15, true));
      Schema $$16 = $$0.addSchema(165, c);
      $$0.addFixer(new arm($$16, true));
      Schema $$17 = $$0.addSchema(501, awf::new);
      $$0.addFixer(new anq($$17, "Add 1.10 entities fix", asr.q));
      Schema $$18 = $$0.addSchema(502, c);
      $$0.addFixer(arc.a($$18, "cooked_fished item renamer", $$0x -> Objects.equals(aua.a($$0x), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : $$0x));
      $$0.addFixer(new aqm($$18, false));
      Schema $$19 = $$0.addSchema(505, c);
      $$0.addFixer(new ase($$19, false));
      Schema $$20 = $$0.addSchema(700, awg::new);
      $$0.addFixer(new apk($$20, true));
      Schema $$21 = $$0.addSchema(701, awh::new);
      $$0.addFixer(new aqe($$21, true));
      Schema $$22 = $$0.addSchema(702, awi::new);
      $$0.addFixer(new aql($$22, true));
      Schema $$23 = $$0.addSchema(703, awj::new);
      $$0.addFixer(new app($$23, true));
      Schema $$24 = $$0.addSchema(704, awk::new);
      $$0.addFixer(new aoc($$24, true));
      Schema $$25 = $$0.addSchema(705, awl::new);
      $$0.addFixer(new apq($$25, true));
      Schema $$26 = $$0.addSchema(804, d);
      $$0.addFixer(new aqw($$26, true));
      Schema $$27 = $$0.addSchema(806, d);
      $$0.addFixer(new arl($$27, false));
      Schema $$28 = $$0.addSchema(808, awm::new);
      $$0.addFixer(new anq($$28, "added shulker box", asr.l));
      Schema $$29 = $$0.addSchema(808, 1, d);
      $$0.addFixer(new aqc($$29, false));
      Schema $$30 = $$0.addSchema(813, d);
      $$0.addFixer(new ard($$30, false));
      $$0.addFixer(new aof($$30, false));
      Schema $$31 = $$0.addSchema(816, d);
      $$0.addFixer(new ash($$31, false));
      Schema $$32 = $$0.addSchema(820, d);
      $$0.addFixer(arc.a($$32, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
      Schema $$33 = $$0.addSchema(1022, aud::new);
      $$0.addFixer(new atw($$33, "added shoulder entities to players", asr.b));
      Schema $$34 = $$0.addSchema(1125, aug::new);
      $$0.addFixer(new aoq($$34, true));
      $$0.addFixer(new anu($$34, false));
      Schema $$35 = $$0.addSchema(1344, d);
      $$0.addFixer(new asf($$35, false));
      Schema $$36 = $$0.addSchema(1446, d);
      $$0.addFixer(new asg($$36, false));
      Schema $$37 = $$0.addSchema(1450, d);
      $$0.addFixer(new aom($$37, false));
      Schema $$38 = $$0.addSchema(1451, auj::new);
      $$0.addFixer(new anq($$38, "AddTrappedChestFix", asr.l));
      Schema $$39 = $$0.addSchema(1451, 1, auk::new);
      $$0.addFixer(new aov($$39, true));
      Schema $$40 = $$0.addSchema(1451, 2, aul::new);
      $$0.addFixer(new aoa($$40, true));
      Schema $$41 = $$0.addSchema(1451, 3, aum::new);
      $$0.addFixer(new apg($$41, true));
      $$0.addFixer(new arg($$41, false));
      Schema $$42 = $$0.addSchema(1451, 4, aun::new);
      $$0.addFixer(new aoi($$42, true));
      $$0.addFixer(new arj($$42, false));
      Schema $$43 = $$0.addSchema(1451, 5, auo::new);
      $$0.addFixer(
         new arb(
            $$43,
            false,
            Set.of(
               new String[]{
                  "minecraft:note_block",
                  "minecraft:flower_pot",
                  "minecraft:dandelion",
                  "minecraft:poppy",
                  "minecraft:blue_orchid",
                  "minecraft:allium",
                  "minecraft:azure_bluet",
                  "minecraft:red_tulip",
                  "minecraft:orange_tulip",
                  "minecraft:white_tulip",
                  "minecraft:pink_tulip",
                  "minecraft:oxeye_daisy",
                  "minecraft:cactus",
                  "minecraft:brown_mushroom",
                  "minecraft:red_mushroom",
                  "minecraft:oak_sapling",
                  "minecraft:spruce_sapling",
                  "minecraft:birch_sapling",
                  "minecraft:jungle_sapling",
                  "minecraft:acacia_sapling",
                  "minecraft:dark_oak_sapling",
                  "minecraft:dead_bush",
                  "minecraft:fern"
               }
            )
         )
      );
      $$0.addFixer(new anq($$43, "RemoveNoteBlockFlowerPotFix", asr.l));
      $$0.addFixer(new arh($$43, false));
      $$0.addFixer(new aqk($$43, false));
      $$0.addFixer(new anz($$43, false));
      $$0.addFixer(new arr($$43, false));
      Schema $$44 = $$0.addSchema(1451, 6, aup::new);
      $$0.addFixer(new ate($$44, true));
      $$0.addFixer(new atw($$44, "Rewrite objectives", asr.w));
      $$0.addFixer(new aod($$44, false));
      Schema $$45 = $$0.addSchema(1451, 7, auq::new);
      $$0.addFixer(new asz($$45, true));
      Schema $$46 = $$0.addSchema(1451, 7, d);
      $$0.addFixer(new atq($$46, false));
      Schema $$47 = $$0.addSchema(1456, d);
      $$0.addFixer(new apr($$47, false));
      Schema $$48 = $$0.addSchema(1458, d);
      $$0.addFixer(new apj($$48, false));
      $$0.addFixer(new aqx($$48, false));
      $$0.addFixer(new aob($$48, false));
      Schema $$49 = $$0.addSchema(1460, aur::new);
      $$0.addFixer(new apv($$49, false));
      Schema $$50 = $$0.addSchema(1466, aus::new);
      $$0.addFixer(new apb($$50, true));
      Schema $$51 = $$0.addSchema(1470, aut::new);
      $$0.addFixer(new anq($$51, "Add 1.13 entities fix", asr.q));
      Schema $$52 = $$0.addSchema(1474, d);
      $$0.addFixer(new apc($$52, false));
      $$0.addFixer(
         aoj.a($$52, "Colorless shulker block fixer", $$0x -> Objects.equals(aua.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      $$0.addFixer(
         arc.a($$52, "Colorless shulker item fixer", $$0x -> Objects.equals(aua.a($$0x), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : $$0x)
      );
      Schema $$53 = $$0.addSchema(1475, d);
      $$0.addFixer(aoj.a($$53, "Flowing fixer", a(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
      Schema $$54 = $$0.addSchema(1480, d);
      $$0.addFixer(aoj.a($$54, "Rename coral blocks", a(asv.a)));
      $$0.addFixer(arc.a($$54, "Rename coral items", a(asv.a)));
      Schema $$55 = $$0.addSchema(1481, auu::new);
      $$0.addFixer(new anq($$55, "Add conduit", asr.l));
      Schema $$56 = $$0.addSchema(1483, auv::new);
      $$0.addFixer(new apx($$56, true));
      $$0.addFixer(arc.a($$56, "Rename pufferfish egg item", a(apx.a)));
      Schema $$57 = $$0.addSchema(1484, d);
      $$0.addFixer(
         arc.a(
            $$57,
            "Rename seagrass items",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(
         aoj.a(
            $$57,
            "Rename seagrass blocks",
            a(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      $$0.addFixer(new aqu($$57, false));
      Schema $$58 = $$0.addSchema(1486, auw::new);
      $$0.addFixer(new api($$58, true));
      $$0.addFixer(arc.a($$58, "Rename cod/salmon egg items", a(api.b)));
      Schema $$59 = $$0.addSchema(1487, d);
      $$0.addFixer(
         arc.a(
            $$59,
            "Rename prismarine_brick(s)_* blocks",
            a(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      $$0.addFixer(
         aoj.a(
            $$59,
            "Rename prismarine_brick(s)_* items",
            a(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema $$60 = $$0.addSchema(1488, d);
      $$0.addFixer(aoj.a($$60, "Rename kelp/kelptop", a(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
      $$0.addFixer(arc.a($$60, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
      $$0.addFixer(new arx($$60, false, "Command block block entity custom name fix", asr.l, "minecraft:command_block") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), apj::a);
         }
      });
      $$0.addFixer(new arx($$60, false, "Command block minecart custom name fix", asr.q, "minecraft:commandblock_minecart") {
         @Override
         protected Typed<?> a(Typed<?> $$0) {
            return $$0.update(DSL.remainderFinder(), apj::a);
         }
      });
      $$0.addFixer(new aqv($$60, false));
      Schema $$61 = $$0.addSchema(1490, d);
      $$0.addFixer(aoj.a($$61, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
      $$0.addFixer(
         arc.a(
            $$61,
            "Rename melon_block/melon/speckled_melon",
            a(
               ImmutableMap.of(
                  "minecraft:melon_block",
                  "minecraft:melon",
                  "minecraft:melon",
                  "minecraft:melon_slice",
                  "minecraft:speckled_melon",
                  "minecraft:glistering_melon_slice"
               )
            )
         )
      );
      Schema $$62 = $$0.addSchema(1492, d);
      $$0.addFixer(new apa($$62, false));
      Schema $$63 = $$0.addSchema(1494, d);
      $$0.addFixer(new arf($$63, false));
      Schema $$64 = $$0.addSchema(1496, d);
      $$0.addFixer(new arp($$64, false));
      Schema $$65 = $$0.addSchema(1500, d);
      $$0.addFixer(new aoe($$65, false));
      Schema $$66 = $$0.addSchema(1501, d);
      $$0.addFixer(new anr($$66, false));
      Schema $$67 = $$0.addSchema(1502, d);
      $$0.addFixer(new asn($$67, false));
      Schema $$68 = $$0.addSchema(1506, d);
      $$0.addFixer(new arq($$68, false));
      Schema $$69 = $$0.addSchema(1510, auy::new);
      $$0.addFixer(aoj.a($$69, "Block renamening fix", a(aqg.b)));
      $$0.addFixer(arc.a($$69, "Item renamening fix", a(aqg.c)));
      $$0.addFixer(new asp($$69, false));
      $$0.addFixer(new aqg($$69, true));
      $$0.addFixer(
         new atf(
            $$69,
            "SwimStatsRenameFix",
            ImmutableMap.of("minecraft:swim_one_cm", "minecraft:walk_on_water_one_cm", "minecraft:dive_one_cm", "minecraft:walk_under_water_one_cm")
         )
      );
      Schema $$70 = $$0.addSchema(1514, d);
      $$0.addFixer(new arz($$70, false));
      $$0.addFixer(new atk($$70, false));
      $$0.addFixer(new asa($$70, false));
      Schema $$71 = $$0.addSchema(1515, d);
      $$0.addFixer(aoj.a($$71, "Rename coral fan blocks", a(asu.a)));
      Schema $$72 = $$0.addSchema(1624, d);
      $$0.addFixer(new atl($$72, false));
      Schema $$73 = $$0.addSchema(1800, auz::new);
      $$0.addFixer(new anq($$73, "Added 1.14 mobs fix", asr.q));
      $$0.addFixer(arc.a($$73, "Rename dye items", a(ape.a)));
      Schema $$74 = $$0.addSchema(1801, ava::new);
      $$0.addFixer(new anq($$74, "Added Illager Beast", asr.q));
      Schema $$75 = $$0.addSchema(1802, d);
      $$0.addFixer(
         aoj.a(
            $$75,
            "Rename sign blocks & stone slabs",
            a(
               ImmutableMap.of(
                  "minecraft:stone_slab",
                  "minecraft:smooth_stone_slab",
                  "minecraft:sign",
                  "minecraft:oak_sign",
                  "minecraft:wall_sign",
                  "minecraft:oak_wall_sign"
               )
            )
         )
      );
      $$0.addFixer(
         arc.a(
            $$75,
            "Rename sign item & stone slabs",
            a(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema $$76 = $$0.addSchema(1803, d);
      $$0.addFixer(new aqz($$76, false));
      Schema $$77 = $$0.addSchema(1904, avb::new);
      $$0.addFixer(new anq($$77, "Added Cats", asr.q));
      $$0.addFixer(new aph($$77, false));
      Schema $$78 = $$0.addSchema(1905, d);
      $$0.addFixer(new aoy($$78, false));
      Schema $$79 = $$0.addSchema(1906, avc::new);
      $$0.addFixer(new anq($$79, "Add POI Blocks", asr.l));
      Schema $$80 = $$0.addSchema(1909, avd::new);
      $$0.addFixer(new anq($$80, "Add jigsaw", asr.l));
      Schema $$81 = $$0.addSchema(1911, d);
      $$0.addFixer(new aoz($$81, false));
      Schema $$82 = $$0.addSchema(1914, d);
      $$0.addFixer(new ats($$82, false));
      Schema $$83 = $$0.addSchema(1917, d);
      $$0.addFixer(new aon($$83, false));
      Schema $$84 = $$0.addSchema(1918, d);
      $$0.addFixer(new atn($$84, "minecraft:villager"));
      $$0.addFixer(new atn($$84, "minecraft:zombie_villager"));
      Schema $$85 = $$0.addSchema(1920, ave::new);
      $$0.addFixer(new ary($$85, false));
      $$0.addFixer(new anq($$85, "Add campfire", asr.l));
      Schema $$86 = $$0.addSchema(1925, d);
      $$0.addFixer(new art($$86, false));
      Schema $$87 = $$0.addSchema(1928, avf::new);
      $$0.addFixer(new apy($$87, true));
      $$0.addFixer(arc.a($$87, "Rename ravager egg item", a(apy.a)));
      Schema $$88 = $$0.addSchema(1929, avg::new);
      $$0.addFixer(new anq($$88, "Add Wandering Trader and Trader Llama", asr.q));
      Schema $$89 = $$0.addSchema(1931, avh::new);
      $$0.addFixer(new anq($$89, "Added Fox", asr.q));
      Schema $$90 = $$0.addSchema(1936, d);
      $$0.addFixer(new asd($$90, false));
      Schema $$91 = $$0.addSchema(1946, d);
      $$0.addFixer(new asw($$91, false));
      Schema $$92 = $$0.addSchema(1948, d);
      $$0.addFixer(new asc($$92));
      Schema $$93 = $$0.addSchema(1953, d);
      $$0.addFixer(new asb($$93, false));
      Schema $$94 = $$0.addSchema(1955, d);
      $$0.addFixer(new atp($$94, false));
      $$0.addFixer(new atx($$94, false));
      Schema $$95 = $$0.addSchema(1961, d);
      $$0.addFixer(new aou($$95, false));
      Schema $$96 = $$0.addSchema(1963, d);
      $$0.addFixer(new ass($$96, false));
      Schema $$97 = $$0.addSchema(2100, avi::new);
      $$0.addFixer(new anq($$97, "Added Bee and Bee Stinger", asr.q));
      $$0.addFixer(new anq($$97, "Add beehive", asr.l));
      $$0.addFixer(new aso($$97, false, "Rename sugar recipe", a("minecraft:sugar", "sugar_from_sugar_cane")));
      $$0.addFixer(new ans($$97, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
      Schema $$98 = $$0.addSchema(2202, d);
      $$0.addFixer(new aor($$98, false));
      Schema $$99 = $$0.addSchema(2209, d);
      UnaryOperator<String> $$100 = a("minecraft:bee_hive", "minecraft:beehive");
      $$0.addFixer(arc.a($$99, "Rename bee_hive item to beehive", $$100));
      $$0.addFixer(new asm($$99, "Rename bee_hive poi to beehive", $$100));
      $$0.addFixer(aoj.a($$99, "Rename bee_hive block to beehive", $$100));
      Schema $$101 = $$0.addSchema(2211, d);
      $$0.addFixer(new ath($$101, false));
      Schema $$102 = $$0.addSchema(2218, d);
      $$0.addFixer(new aqq($$102, false));
      Schema $$103 = $$0.addSchema(2501, avj::new);
      $$0.addFixer(new aqr($$103, true));
      Schema $$104 = $$0.addSchema(2502, avk::new);
      $$0.addFixer(new anq($$104, "Added Hoglin", asr.q));
      Schema $$105 = $$0.addSchema(2503, d);
      $$0.addFixer(new atr($$105, false));
      $$0.addFixer(new ans($$105, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
      Schema $$106 = $$0.addSchema(2505, avl::new);
      $$0.addFixer(new anq($$106, "Added Piglin", asr.q));
      $$0.addFixer(new aru($$106, "minecraft:villager"));
      Schema $$107 = $$0.addSchema(2508, d);
      $$0.addFixer(
         arc.a(
            $$107,
            "Renamed fungi items to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      $$0.addFixer(
         aoj.a(
            $$107,
            "Renamed fungi blocks to fungus",
            a(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema $$108 = $$0.addSchema(2509, avm::new);
      $$0.addFixer(new aqn($$108));
      $$0.addFixer(arc.a($$108, "Rename zombie pigman egg item", a(aqn.a)));
      Schema $$109 = $$0.addSchema(2511, d);
      $$0.addFixer(new apw($$109));
      Schema $$110 = $$0.addSchema(2514, d);
      $$0.addFixer(new aqi($$110));
      $$0.addFixer(new aoh($$110));
      $$0.addFixer(new ask($$110));
      $$0.addFixer(new ars($$110));
      $$0.addFixer(new asy($$110));
      $$0.addFixer(new ark($$110));
      Schema $$111 = $$0.addSchema(2516, d);
      $$0.addFixer(new aqt($$111, "minecraft:villager"));
      $$0.addFixer(new aqt($$111, "minecraft:zombie_villager"));
      Schema $$112 = $$0.addSchema(2518, d);
      $$0.addFixer(new arn($$112, false));
      $$0.addFixer(new aro($$112, false));
      Schema $$113 = $$0.addSchema(2519, avn::new);
      $$0.addFixer(new anq($$113, "Added Strider", asr.q));
      Schema $$114 = $$0.addSchema(2522, avo::new);
      $$0.addFixer(new anq($$114, "Added Zoglin", asr.q));
      Schema $$115 = $$0.addSchema(2523, d);
      $$0.addFixer(new ant($$115));
      Schema $$116 = $$0.addSchema(2527, d);
      $$0.addFixer(new anw($$116));
      Schema $$117 = $$0.addSchema(2528, d);
      $$0.addFixer(
         arc.a(
            $$117,
            "Rename soul fire torch and soul fire lantern",
            a(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      $$0.addFixer(
         aoj.a(
            $$117,
            "Rename soul fire torch and soul fire lantern",
            a(
               ImmutableMap.of(
                  "minecraft:soul_fire_torch",
                  "minecraft:soul_torch",
                  "minecraft:soul_fire_wall_torch",
                  "minecraft:soul_wall_torch",
                  "minecraft:soul_fire_lantern",
                  "minecraft:soul_lantern"
               )
            )
         )
      );
      Schema $$118 = $$0.addSchema(2529, d);
      $$0.addFixer(new atg($$118, false));
      Schema $$119 = $$0.addSchema(2531, d);
      $$0.addFixer(new asq($$119));
      Schema $$120 = $$0.addSchema(2533, d);
      $$0.addFixer(new ato($$120));
      Schema $$121 = $$0.addSchema(2535, d);
      $$0.addFixer(new aqd($$121));
      Schema $$122 = $$0.addSchema(2550, d);
      $$0.addFixer(new atu($$122));
      Schema $$123 = $$0.addSchema(2551, avp::new);
      $$0.addFixer(new atw($$123, "add types to WorldGenData", asr.A));
      Schema $$124 = $$0.addSchema(2552, d);
      $$0.addFixer(new ast($$124, false, "Nether biome rename", ImmutableMap.of("minecraft:nether", "minecraft:nether_wastes")));
      Schema $$125 = $$0.addSchema(2553, d);
      $$0.addFixer(new anv($$125, false));
      Schema $$126 = $$0.addSchema(2558, d);
      $$0.addFixer(new arv($$126, false));
      $$0.addFixer(new asi($$126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema $$127 = $$0.addSchema(2568, avq::new);
      $$0.addFixer(new anq($$127, "Added Piglin Brute", asr.q));
      Schema $$128 = $$0.addSchema(2571, avr::new);
      $$0.addFixer(new anq($$128, "Added Goat", asr.q));
      Schema $$129 = $$0.addSchema(2679, d);
      $$0.addFixer(new aoo($$129, false));
      Schema $$130 = $$0.addSchema(2680, d);
      $$0.addFixer(arc.a($$130, "Renamed grass path item to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      $$0.addFixer(aok.b($$130, "Renamed grass path block to dirt path", a("minecraft:grass_path", "minecraft:dirt_path")));
      Schema $$131 = $$0.addSchema(2684, avs::new);
      $$0.addFixer(new anq($$131, "Added Sculk Sensor", asr.l));
      Schema $$132 = $$0.addSchema(2686, avt::new);
      $$0.addFixer(new anq($$132, "Added Axolotl", asr.q));
      Schema $$133 = $$0.addSchema(2688, avu::new);
      $$0.addFixer(new anq($$133, "Added Glow Squid", asr.q));
      $$0.addFixer(new anq($$133, "Added Glow Item Frame", asr.q));
      Schema $$134 = $$0.addSchema(2690, d);
      ImmutableMap<String, String> $$135 = ImmutableMap.builder()
         .put("minecraft:weathered_copper_block", "minecraft:oxidized_copper_block")
         .put("minecraft:semi_weathered_copper_block", "minecraft:weathered_copper_block")
         .put("minecraft:lightly_weathered_copper_block", "minecraft:exposed_copper_block")
         .put("minecraft:weathered_cut_copper", "minecraft:oxidized_cut_copper")
         .put("minecraft:semi_weathered_cut_copper", "minecraft:weathered_cut_copper")
         .put("minecraft:lightly_weathered_cut_copper", "minecraft:exposed_cut_copper")
         .put("minecraft:weathered_cut_copper_stairs", "minecraft:oxidized_cut_copper_stairs")
         .put("minecraft:semi_weathered_cut_copper_stairs", "minecraft:weathered_cut_copper_stairs")
         .put("minecraft:lightly_weathered_cut_copper_stairs", "minecraft:exposed_cut_copper_stairs")
         .put("minecraft:weathered_cut_copper_slab", "minecraft:oxidized_cut_copper_slab")
         .put("minecraft:semi_weathered_cut_copper_slab", "minecraft:weathered_cut_copper_slab")
         .put("minecraft:lightly_weathered_cut_copper_slab", "minecraft:exposed_cut_copper_slab")
         .put("minecraft:waxed_semi_weathered_copper", "minecraft:waxed_weathered_copper")
         .put("minecraft:waxed_lightly_weathered_copper", "minecraft:waxed_exposed_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper", "minecraft:waxed_weathered_cut_copper")
         .put("minecraft:waxed_lightly_weathered_cut_copper", "minecraft:waxed_exposed_cut_copper")
         .put("minecraft:waxed_semi_weathered_cut_copper_stairs", "minecraft:waxed_weathered_cut_copper_stairs")
         .put("minecraft:waxed_lightly_weathered_cut_copper_stairs", "minecraft:waxed_exposed_cut_copper_stairs")
         .put("minecraft:waxed_semi_weathered_cut_copper_slab", "minecraft:waxed_weathered_cut_copper_slab")
         .put("minecraft:waxed_lightly_weathered_cut_copper_slab", "minecraft:waxed_exposed_cut_copper_slab")
         .build();
      $$0.addFixer(arc.a($$134, "Renamed copper block items to new oxidized terms", a($$135)));
      $$0.addFixer(aok.b($$134, "Renamed copper blocks to new oxidized terms", a($$135)));
      Schema $$136 = $$0.addSchema(2691, d);
      ImmutableMap<String, String> $$137 = ImmutableMap.builder()
         .put("minecraft:waxed_copper", "minecraft:waxed_copper_block")
         .put("minecraft:oxidized_copper_block", "minecraft:oxidized_copper")
         .put("minecraft:weathered_copper_block", "minecraft:weathered_copper")
         .put("minecraft:exposed_copper_block", "minecraft:exposed_copper")
         .build();
      $$0.addFixer(arc.a($$136, "Rename copper item suffixes", a($$137)));
      $$0.addFixer(aok.b($$136, "Rename copper blocks suffixes", a($$137)));
      Schema $$138 = $$0.addSchema(2693, d);
      $$0.addFixer(new anp($$138, asr.A, "has_increased_height_already", false));
      Schema $$139 = $$0.addSchema(2696, d);
      ImmutableMap<String, String> $$140 = ImmutableMap.builder()
         .put("minecraft:grimstone", "minecraft:deepslate")
         .put("minecraft:grimstone_slab", "minecraft:cobbled_deepslate_slab")
         .put("minecraft:grimstone_stairs", "minecraft:cobbled_deepslate_stairs")
         .put("minecraft:grimstone_wall", "minecraft:cobbled_deepslate_wall")
         .put("minecraft:polished_grimstone", "minecraft:polished_deepslate")
         .put("minecraft:polished_grimstone_slab", "minecraft:polished_deepslate_slab")
         .put("minecraft:polished_grimstone_stairs", "minecraft:polished_deepslate_stairs")
         .put("minecraft:polished_grimstone_wall", "minecraft:polished_deepslate_wall")
         .put("minecraft:grimstone_tiles", "minecraft:deepslate_tiles")
         .put("minecraft:grimstone_tile_slab", "minecraft:deepslate_tile_slab")
         .put("minecraft:grimstone_tile_stairs", "minecraft:deepslate_tile_stairs")
         .put("minecraft:grimstone_tile_wall", "minecraft:deepslate_tile_wall")
         .put("minecraft:grimstone_bricks", "minecraft:deepslate_bricks")
         .put("minecraft:grimstone_brick_slab", "minecraft:deepslate_brick_slab")
         .put("minecraft:grimstone_brick_stairs", "minecraft:deepslate_brick_stairs")
         .put("minecraft:grimstone_brick_wall", "minecraft:deepslate_brick_wall")
         .put("minecraft:chiseled_grimstone", "minecraft:chiseled_deepslate")
         .build();
      $$0.addFixer(arc.a($$139, "Renamed grimstone block items to deepslate", a($$140)));
      $$0.addFixer(aok.b($$139, "Renamed grimstone blocks to deepslate", a($$140)));
      Schema $$141 = $$0.addSchema(2700, d);
      $$0.addFixer(
         aok.b(
            $$141,
            "Renamed cave vines blocks",
            a(ImmutableMap.of("minecraft:cave_vines_head", "minecraft:cave_vines", "minecraft:cave_vines_body", "minecraft:cave_vines_plant"))
         )
      );
      Schema $$142 = $$0.addSchema(2701, d);
      $$0.addFixer(new asx($$142));
      Schema $$143 = $$0.addSchema(2702, d);
      $$0.addFixer(new anm($$143));
      Schema $$144 = $$0.addSchema(2704, avv::new);
      $$0.addFixer(new anq($$144, "Added Goat", asr.q));
      Schema $$145 = $$0.addSchema(2707, avw::new);
      $$0.addFixer(new anq($$145, "Added Marker", asr.q));
      $$0.addFixer(new anp($$145, asr.A, "has_increased_height_already", true));
      Schema $$146 = $$0.addSchema(2710, d);
      $$0.addFixer(new atf($$146, "Renamed play_one_minute stat to play_time", ImmutableMap.of("minecraft:play_one_minute", "minecraft:play_time")));
      Schema $$147 = $$0.addSchema(2717, d);
      $$0.addFixer(arc.a($$147, "Rename azalea_leaves_flowers", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves"))));
      $$0.addFixer(
         aoj.a($$147, "Rename azalea_leaves_flowers items", a(ImmutableMap.of("minecraft:azalea_leaves_flowers", "minecraft:flowering_azalea_leaves")))
      );
      Schema $$148 = $$0.addSchema(2825, d);
      $$0.addFixer(new anp($$148, asr.A, "has_increased_height_already", false));
      Schema $$149 = $$0.addSchema(2831, avx::new);
      $$0.addFixer(new atd($$149));
      Schema $$150 = $$0.addSchema(2832, avy::new);
      $$0.addFixer(new atv($$150));
      $$0.addFixer(new aot($$150));
      Schema $$151 = $$0.addSchema(2833, d);
      $$0.addFixer(new att($$151));
      Schema $$152 = $$0.addSchema(2838, d);
      $$0.addFixer(new ast($$152, false, "Caves and Cliffs biome renames", aop.a));
      Schema $$153 = $$0.addSchema(2841, d);
      $$0.addFixer(new aow($$153));
      Schema $$154 = $$0.addSchema(2842, avz::new);
      $$0.addFixer(new aox($$154));
      Schema $$155 = $$0.addSchema(2843, d);
      $$0.addFixer(new asj($$155));
      $$0.addFixer(new ast($$155, false, "Remove Deep Warm Ocean", Map.of("minecraft:deep_warm_ocean", "minecraft:warm_ocean")));
      Schema $$156 = $$0.addSchema(2846, d);
      $$0.addFixer(
         new ans(
            $$156,
            false,
            "Rename some C&C part 2 advancements",
            a(
               ImmutableMap.of(
                  "minecraft:husbandry/play_jukebox_in_meadows",
                  "minecraft:adventure/play_jukebox_in_meadows",
                  "minecraft:adventure/caves_and_cliff",
                  "minecraft:adventure/fall_from_world_height",
                  "minecraft:adventure/ride_strider_in_overworld_lava",
                  "minecraft:nether/ride_strider_in_overworld_lava"
               )
            )
         )
      );
      Schema $$157 = $$0.addSchema(2852, d);
      $$0.addFixer(new att($$157));
      Schema $$158 = $$0.addSchema(2967, d);
      $$0.addFixer(new ati($$158));
      Schema $$159 = $$0.addSchema(2970, d);
      $$0.addFixer(new atj($$159));
      Schema $$160 = $$0.addSchema(3076, awa::new);
      $$0.addFixer(new anq($$160, "Added Sculk Catalyst", asr.l));
      Schema $$161 = $$0.addSchema(3077, d);
      $$0.addFixer(new aos($$161));
      Schema $$162 = $$0.addSchema(3078, awb::new);
      $$0.addFixer(new anq($$162, "Added Frog", asr.q));
      $$0.addFixer(new anq($$162, "Added Tadpole", asr.q));
      $$0.addFixer(new anq($$162, "Added Sculk Shrieker", asr.l));
      Schema $$163 = $$0.addSchema(3081, awc::new);
      $$0.addFixer(new anq($$163, "Added Warden", asr.q));
      Schema $$164 = $$0.addSchema(3082, awd::new);
      $$0.addFixer(new anq($$164, "Added Chest Boat", asr.q));
      Schema $$165 = $$0.addSchema(3083, awe::new);
      $$0.addFixer(new anq($$165, "Added Allay", asr.q));
      Schema $$166 = $$0.addSchema(3084, d);
      $$0.addFixer(
         new atb(
            $$166,
            asr.t,
            ImmutableMap.builder()
               .put("minecraft:block_press", "minecraft:block_activate")
               .put("minecraft:block_switch", "minecraft:block_activate")
               .put("minecraft:block_unpress", "minecraft:block_deactivate")
               .put("minecraft:block_unswitch", "minecraft:block_deactivate")
               .put("minecraft:drinking_finish", "minecraft:drink")
               .put("minecraft:elytra_free_fall", "minecraft:elytra_glide")
               .put("minecraft:entity_damaged", "minecraft:entity_damage")
               .put("minecraft:entity_dying", "minecraft:entity_die")
               .put("minecraft:entity_killed", "minecraft:entity_die")
               .put("minecraft:mob_interact", "minecraft:entity_interact")
               .put("minecraft:ravager_roar", "minecraft:entity_roar")
               .put("minecraft:ring_bell", "minecraft:block_change")
               .put("minecraft:shulker_close", "minecraft:container_close")
               .put("minecraft:shulker_open", "minecraft:container_open")
               .put("minecraft:wolf_shaking", "minecraft:entity_shake")
               .build()
         )
      );
      Schema $$167 = $$0.addSchema(3086, d);
      $$0.addFixer(new aqj($$167, "Change cat variant type", asr.q, "minecraft:cat", "CatType", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.defaultReturnValue("minecraft:tabby");
         $$0x.put(0, "minecraft:tabby");
         $$0x.put(1, "minecraft:black");
         $$0x.put(2, "minecraft:red");
         $$0x.put(3, "minecraft:siamese");
         $$0x.put(4, "minecraft:british");
         $$0x.put(5, "minecraft:calico");
         $$0x.put(6, "minecraft:persian");
         $$0x.put(7, "minecraft:ragdoll");
         $$0x.put(8, "minecraft:white");
         $$0x.put(9, "minecraft:jellie");
         $$0x.put(10, "minecraft:all_black");
      })::get));
      ImmutableMap<String, String> $$168 = ImmutableMap.builder()
         .put("textures/entity/cat/tabby.png", "minecraft:tabby")
         .put("textures/entity/cat/black.png", "minecraft:black")
         .put("textures/entity/cat/red.png", "minecraft:red")
         .put("textures/entity/cat/siamese.png", "minecraft:siamese")
         .put("textures/entity/cat/british_shorthair.png", "minecraft:british")
         .put("textures/entity/cat/calico.png", "minecraft:calico")
         .put("textures/entity/cat/persian.png", "minecraft:persian")
         .put("textures/entity/cat/ragdoll.png", "minecraft:ragdoll")
         .put("textures/entity/cat/white.png", "minecraft:white")
         .put("textures/entity/cat/jellie.png", "minecraft:jellie")
         .put("textures/entity/cat/all_black.png", "minecraft:all_black")
         .build();
      $$0.addFixer(new apd($$167, "Migrate cat variant advancement", "minecraft:husbandry/complete_catalogue", $$1x -> (String)$$168.getOrDefault($$1x, $$1x)));
      Schema $$169 = $$0.addSchema(3087, d);
      $$0.addFixer(new aqj($$169, "Change frog variant type", asr.q, "minecraft:frog", "Variant", ad.a(new Int2ObjectOpenHashMap(), $$0x -> {
         $$0x.put(0, "minecraft:temperate");
         $$0x.put(1, "minecraft:warm");
         $$0x.put(2, "minecraft:cold");
      })::get));
      Schema $$170 = $$0.addSchema(3088, d);
      $$0.addFixer(new anx($$170));
      Schema $$171 = $$0.addSchema(3090, d);
      $$0.addFixer(new apt($$171));
      Schema $$172 = $$0.addSchema(3093, d);
      $$0.addFixer(new apm($$172));
      Schema $$173 = $$0.addSchema(3094, d);
      $$0.addFixer(new aqs($$173));
      Schema $$174 = $$0.addSchema(3097, d);
      $$0.addFixer(new aqo($$174));
      $$0.addFixer(new aqp($$174));
      Map<String, String> $$175 = Map.of("minecraft:british", "minecraft:british_shorthair");
      $$0.addFixer(new atm($$174, "Rename british shorthair", asr.q, "minecraft:cat", $$175));
      $$0.addFixer(
         new apd(
            $$174,
            "Migrate cat variant advancement for british shorthair",
            "minecraft:husbandry/complete_catalogue",
            $$1x -> (String)$$175.getOrDefault($$1x, $$1x)
         )
      );
      $$0.addFixer(new asl($$174, "Remove unpopulated villager PoI types", Set.of("minecraft:unemployed", "minecraft:nitwit")::contains));
      Schema $$176 = $$0.addSchema(3108, d);
      $$0.addFixer(new any($$176));
   }

   private static UnaryOperator<String> a(Map<String, String> $$0) {
      return $$1 -> (String)$$0.getOrDefault($$1, $$1);
   }

   private static UnaryOperator<String> a(String $$0, String $$1) {
      return $$2 -> Objects.equals($$2, $$0) ? $$1 : $$2;
   }
}
