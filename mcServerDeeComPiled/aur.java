import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class aur extends aua {
   public aur(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   protected static void a(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> aub.a($$0));
   }

   protected static void b(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, String $$2) {
      $$0.register($$1, $$2, () -> DSL.optionalFields("Items", DSL.list(asr.m.in($$0))));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      $$0.registerSimple($$1, "minecraft:area_effect_cloud");
      a($$0, $$1, "minecraft:armor_stand");
      $$0.register($$1, "minecraft:arrow", $$1x -> DSL.optionalFields("inBlockState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:bat");
      a($$0, $$1, "minecraft:blaze");
      $$0.registerSimple($$1, "minecraft:boat");
      a($$0, $$1, "minecraft:cave_spider");
      $$0.register($$1, "minecraft:chest_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0), "Items", DSL.list(asr.m.in($$0))));
      a($$0, $$1, "minecraft:chicken");
      $$0.register($$1, "minecraft:commandblock_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:cow");
      a($$0, $$1, "minecraft:creeper");
      $$0.register($$1, "minecraft:donkey", $$1x -> DSL.optionalFields("Items", DSL.list(asr.m.in($$0)), "SaddleItem", asr.m.in($$0), aub.a($$0)));
      $$0.registerSimple($$1, "minecraft:dragon_fireball");
      $$0.registerSimple($$1, "minecraft:egg");
      a($$0, $$1, "minecraft:elder_guardian");
      $$0.registerSimple($$1, "minecraft:ender_crystal");
      a($$0, $$1, "minecraft:ender_dragon");
      $$0.register($$1, "minecraft:enderman", $$1x -> DSL.optionalFields("carriedBlockState", asr.n.in($$0), aub.a($$0)));
      a($$0, $$1, "minecraft:endermite");
      $$0.registerSimple($$1, "minecraft:ender_pearl");
      $$0.registerSimple($$1, "minecraft:evocation_fangs");
      a($$0, $$1, "minecraft:evocation_illager");
      $$0.registerSimple($$1, "minecraft:eye_of_ender_signal");
      $$0.register($$1, "minecraft:falling_block", $$1x -> DSL.optionalFields("BlockState", asr.n.in($$0), "TileEntityData", asr.l.in($$0)));
      $$0.registerSimple($$1, "minecraft:fireball");
      $$0.register($$1, "minecraft:fireworks_rocket", $$1x -> DSL.optionalFields("FireworksItem", asr.m.in($$0)));
      $$0.register($$1, "minecraft:furnace_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:ghast");
      a($$0, $$1, "minecraft:giant");
      a($$0, $$1, "minecraft:guardian");
      $$0.register($$1, "minecraft:hopper_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0), "Items", DSL.list(asr.m.in($$0))));
      $$0.register($$1, "minecraft:horse", $$1x -> DSL.optionalFields("ArmorItem", asr.m.in($$0), "SaddleItem", asr.m.in($$0), aub.a($$0)));
      a($$0, $$1, "minecraft:husk");
      $$0.registerSimple($$1, "minecraft:illusion_illager");
      $$0.register($$1, "minecraft:item", $$1x -> DSL.optionalFields("Item", asr.m.in($$0)));
      $$0.register($$1, "minecraft:item_frame", $$1x -> DSL.optionalFields("Item", asr.m.in($$0)));
      $$0.registerSimple($$1, "minecraft:leash_knot");
      $$0.register(
         $$1,
         "minecraft:llama",
         $$1x -> DSL.optionalFields("Items", DSL.list(asr.m.in($$0)), "SaddleItem", asr.m.in($$0), "DecorItem", asr.m.in($$0), aub.a($$0))
      );
      $$0.registerSimple($$1, "minecraft:llama_spit");
      a($$0, $$1, "minecraft:magma_cube");
      $$0.register($$1, "minecraft:minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:mooshroom");
      $$0.register($$1, "minecraft:mule", $$1x -> DSL.optionalFields("Items", DSL.list(asr.m.in($$0)), "SaddleItem", asr.m.in($$0), aub.a($$0)));
      a($$0, $$1, "minecraft:ocelot");
      $$0.registerSimple($$1, "minecraft:painting");
      $$0.registerSimple($$1, "minecraft:parrot");
      a($$0, $$1, "minecraft:pig");
      a($$0, $$1, "minecraft:polar_bear");
      $$0.register($$1, "minecraft:potion", $$1x -> DSL.optionalFields("Potion", asr.m.in($$0)));
      a($$0, $$1, "minecraft:rabbit");
      a($$0, $$1, "minecraft:sheep");
      a($$0, $$1, "minecraft:shulker");
      $$0.registerSimple($$1, "minecraft:shulker_bullet");
      a($$0, $$1, "minecraft:silverfish");
      a($$0, $$1, "minecraft:skeleton");
      $$0.register($$1, "minecraft:skeleton_horse", $$1x -> DSL.optionalFields("SaddleItem", asr.m.in($$0), aub.a($$0)));
      a($$0, $$1, "minecraft:slime");
      $$0.registerSimple($$1, "minecraft:small_fireball");
      $$0.registerSimple($$1, "minecraft:snowball");
      a($$0, $$1, "minecraft:snowman");
      $$0.register($$1, "minecraft:spawner_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0), asr.u.in($$0)));
      $$0.register($$1, "minecraft:spectral_arrow", $$1x -> DSL.optionalFields("inBlockState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:spider");
      a($$0, $$1, "minecraft:squid");
      a($$0, $$1, "minecraft:stray");
      $$0.registerSimple($$1, "minecraft:tnt");
      $$0.register($$1, "minecraft:tnt_minecart", $$1x -> DSL.optionalFields("DisplayState", asr.n.in($$0)));
      a($$0, $$1, "minecraft:vex");
      $$0.register(
         $$1,
         "minecraft:villager",
         $$1x -> DSL.optionalFields(
               "Inventory",
               DSL.list(asr.m.in($$0)),
               "Offers",
               DSL.optionalFields("Recipes", DSL.list(DSL.optionalFields("buy", asr.m.in($$0), "buyB", asr.m.in($$0), "sell", asr.m.in($$0)))),
               aub.a($$0)
            )
      );
      a($$0, $$1, "minecraft:villager_golem");
      a($$0, $$1, "minecraft:vindication_illager");
      a($$0, $$1, "minecraft:witch");
      a($$0, $$1, "minecraft:wither");
      a($$0, $$1, "minecraft:wither_skeleton");
      $$0.registerSimple($$1, "minecraft:wither_skull");
      a($$0, $$1, "minecraft:wolf");
      $$0.registerSimple($$1, "minecraft:xp_bottle");
      $$0.registerSimple($$1, "minecraft:xp_orb");
      a($$0, $$1, "minecraft:zombie");
      $$0.register($$1, "minecraft:zombie_horse", $$1x -> DSL.optionalFields("SaddleItem", asr.m.in($$0), aub.a($$0)));
      a($$0, $$1, "minecraft:zombie_pigman");
      a($$0, $$1, "minecraft:zombie_villager");
      return $$1;
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = Maps.newHashMap();
      b($$0, $$1, "minecraft:furnace");
      b($$0, $$1, "minecraft:chest");
      b($$0, $$1, "minecraft:trapped_chest");
      $$0.registerSimple($$1, "minecraft:ender_chest");
      $$0.register($$1, "minecraft:jukebox", $$1x -> DSL.optionalFields("RecordItem", asr.m.in($$0)));
      b($$0, $$1, "minecraft:dispenser");
      b($$0, $$1, "minecraft:dropper");
      $$0.registerSimple($$1, "minecraft:sign");
      $$0.register($$1, "minecraft:mob_spawner", $$1x -> asr.u.in($$0));
      $$0.register($$1, "minecraft:piston", $$1x -> DSL.optionalFields("blockState", asr.n.in($$0)));
      b($$0, $$1, "minecraft:brewing_stand");
      $$0.registerSimple($$1, "minecraft:enchanting_table");
      $$0.registerSimple($$1, "minecraft:end_portal");
      $$0.registerSimple($$1, "minecraft:beacon");
      $$0.registerSimple($$1, "minecraft:skull");
      $$0.registerSimple($$1, "minecraft:daylight_detector");
      b($$0, $$1, "minecraft:hopper");
      $$0.registerSimple($$1, "minecraft:comparator");
      $$0.registerSimple($$1, "minecraft:banner");
      $$0.registerSimple($$1, "minecraft:structure_block");
      $$0.registerSimple($$1, "minecraft:end_gateway");
      $$0.registerSimple($$1, "minecraft:command_block");
      b($$0, $$1, "minecraft:shulker_box");
      $$0.registerSimple($$1, "minecraft:bed");
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      $$0.registerType(false, asr.a, DSL::remainder);
      $$0.registerType(false, asr.y, () -> DSL.constType(a()));
      $$0.registerType(
         false,
         asr.b,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", asr.p.in($$0)),
               "Inventory",
               DSL.list(asr.m.in($$0)),
               "EnderItems",
               DSL.list(asr.m.in($$0)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  asr.p.in($$0),
                  "ShoulderEntityRight",
                  asr.p.in($$0),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(asr.y.in($$0)), "toBeDisplayed", DSL.list(asr.y.in($$0)))
               )
            )
      );
      $$0.registerType(
         false,
         asr.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(asr.p.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(asr.l.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", asr.r.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(asr.n.in($$0))))
               )
            )
      );
      $$0.registerType(true, asr.l, () -> DSL.taggedChoiceLazy("id", a(), $$2));
      $$0.registerType(true, asr.p, () -> DSL.optionalFields("Passengers", DSL.list(asr.p.in($$0)), asr.q.in($$0)));
      $$0.registerType(true, asr.q, () -> DSL.taggedChoiceLazy("id", a(), $$1));
      $$0.registerType(
         true,
         asr.m,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  asr.s.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     asr.p.in($$0),
                     "BlockEntityTag",
                     asr.l.in($$0),
                     "CanDestroy",
                     DSL.list(asr.r.in($$0)),
                     "CanPlaceOn",
                     DSL.list(asr.r.in($$0)),
                     "Items",
                     DSL.list(asr.m.in($$0))
                  )
               ),
               awl.b,
               HookFunction.IDENTITY
            )
      );
      $$0.registerType(false, asr.d, () -> DSL.compoundList(DSL.list(asr.m.in($$0))));
      $$0.registerType(false, asr.e, DSL::remainder);
      $$0.registerType(
         false,
         asr.f,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(DSL.optionalFields("nbt", asr.p.in($$0))),
               "blocks",
               DSL.list(DSL.optionalFields("nbt", asr.l.in($$0))),
               "palette",
               DSL.list(asr.n.in($$0))
            )
      );
      $$0.registerType(false, asr.r, () -> DSL.constType(a()));
      $$0.registerType(false, asr.s, () -> DSL.constType(a()));
      $$0.registerType(false, asr.n, DSL::remainder);
      Supplier<TypeTemplate> $$3 = () -> DSL.compoundList(asr.s.in($$0), DSL.constType(DSL.intType()));
      $$0.registerType(
         false,
         asr.g,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(asr.r.in($$0), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  (TypeTemplate)$$3.get(),
                  "minecraft:used",
                  (TypeTemplate)$$3.get(),
                  "minecraft:broken",
                  (TypeTemplate)$$3.get(),
                  "minecraft:picked_up",
                  (TypeTemplate)$$3.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     (TypeTemplate)$$3.get(),
                     "minecraft:killed",
                     DSL.compoundList(asr.o.in($$0), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(asr.o.in($$0), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(a()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
      $$0.registerType(
         false,
         asr.h,
         () -> DSL.optionalFields(
               "data",
               DSL.optionalFields("Features", DSL.compoundList(asr.v.in($$0)), "Objectives", DSL.list(asr.w.in($$0)), "Teams", DSL.list(asr.x.in($$0)))
            )
      );
      $$0.registerType(
         false,
         asr.v,
         () -> DSL.optionalFields("Children", DSL.list(DSL.optionalFields("CA", asr.n.in($$0), "CB", asr.n.in($$0), "CC", asr.n.in($$0), "CD", asr.n.in($$0))))
      );
      Map<String, Supplier<TypeTemplate>> $$4 = aup.a($$0);
      $$0.registerType(false, asr.w, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), aup.c, aup.d));
      $$0.registerType(false, asr.x, DSL::remainder);
      $$0.registerType(true, asr.u, () -> DSL.optionalFields("SpawnPotentials", DSL.list(DSL.fields("Entity", asr.p.in($$0))), "SpawnData", asr.p.in($$0)));
      $$0.registerType(
         false,
         asr.i,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(asr.z.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(asr.o.in($$0), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(asr.o.in($$0), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(asr.o.in($$0), DSL.constType(DSL.string())))
            )
      );
      $$0.registerType(false, asr.z, () -> DSL.constType(a()));
      $$0.registerType(false, asr.o, () -> DSL.constType(a()));
      $$0.registerType(false, asr.j, DSL::remainder);
      $$0.registerType(true, asr.A, DSL::remainder);
      $$0.registerType(false, asr.k, () -> DSL.optionalFields("Entities", DSL.list(asr.p.in($$0))));
   }
}
