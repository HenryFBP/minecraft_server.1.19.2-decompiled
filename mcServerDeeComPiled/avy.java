import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class avy extends aua {
   public avy(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
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
                  DSL.list(
                     DSL.optionalFields(
                        "biomes",
                        DSL.optionalFields("palette", DSL.list(asr.z.in($$0))),
                        "block_states",
                        DSL.optionalFields("palette", DSL.list(asr.n.in($$0)))
                     )
                  ),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(asr.v.in($$0)))
               )
            )
      );
      $$0.registerType(
         false,
         asr.A,
         () -> DSL.fields(
               "dimensions",
               DSL.compoundList(
                  DSL.constType(a()),
                  DSL.fields(
                     "generator",
                     DSL.taggedChoiceLazy(
                        "type",
                        DSL.string(),
                        ImmutableMap.of(
                           "minecraft:debug",
                           DSL::remainder,
                           "minecraft:flat",
                           (Supplier)() -> DSL.optionalFields(
                                 "settings", DSL.optionalFields("biome", asr.z.in($$0), "layers", DSL.list(DSL.optionalFields("block", asr.r.in($$0))))
                              ),
                           "minecraft:noise",
                           (Supplier)() -> DSL.optionalFields(
                                 "biome_source",
                                 DSL.taggedChoiceLazy(
                                    "type",
                                    DSL.string(),
                                    ImmutableMap.of(
                                       "minecraft:fixed",
                                       (Supplier)() -> DSL.fields("biome", asr.z.in($$0)),
                                       "minecraft:multi_noise",
                                       (Supplier)() -> DSL.or(DSL.fields("preset", a().template()), DSL.list(DSL.fields("biome", asr.z.in($$0)))),
                                       "minecraft:checkerboard",
                                       (Supplier)() -> DSL.fields("biomes", DSL.list(asr.z.in($$0))),
                                       "minecraft:the_end",
                                       DSL::remainder
                                    )
                                 ),
                                 "settings",
                                 DSL.or(DSL.constType(DSL.string()), DSL.optionalFields("default_block", asr.r.in($$0), "default_fluid", asr.r.in($$0)))
                              )
                        )
                     )
                  )
               )
            )
      );
   }
}
