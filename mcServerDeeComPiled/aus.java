import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class aus extends aua {
   public aus(int $$0, Schema $$1) {
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
                  DSL.list(DSL.optionalFields("Palette", DSL.list(asr.n.in($$0)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(asr.v.in($$0)))
               )
            )
      );
      $$0.registerType(
         false,
         asr.v,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(DSL.optionalFields("CA", asr.n.in($$0), "CB", asr.n.in($$0), "CC", asr.n.in($$0), "CD", asr.n.in($$0))),
               "biome",
               asr.z.in($$0)
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$1.put("DUMMY", DSL::remainder);
      return $$1;
   }
}
