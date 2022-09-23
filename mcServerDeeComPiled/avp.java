import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class avp extends aua {
   public avp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
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
                                       (Supplier)() -> DSL.list(DSL.fields("biome", asr.z.in($$0))),
                                       "minecraft:checkerboard",
                                       (Supplier)() -> DSL.fields("biomes", DSL.list(asr.z.in($$0))),
                                       "minecraft:vanilla_layered",
                                       DSL::remainder,
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
