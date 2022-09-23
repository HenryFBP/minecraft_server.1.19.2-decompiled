import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class aup extends aua {
   public static final String b = "_special";
   protected static final HookFunction c = new HookFunction() {
      public <T> T apply(DynamicOps<T> $$0, T $$1) {
         Dynamic<T> $$2 = new Dynamic($$0, $$1);
         return (T)((Dynamic)DataFixUtils.orElse(
               $$2.get("CriteriaName")
                  .asString()
                  .get()
                  .left()
                  .map($$0x -> {
                     int $$1x = $$0x.indexOf(58);
                     if ($$1x < 0) {
                        return Pair.of("_special", $$0x);
                     } else {
                        try {
                           abb $$2 = abb.a($$0x.substring(0, $$1x), '.');
                           abb $$3 = abb.a($$0x.substring($$1x + 1), '.');
                           return Pair.of($$2.toString(), $$3.toString());
                        } catch (Exception var4) {
                           return Pair.of("_special", $$0x);
                        }
                     }
                  })
                  .map(
                     $$1x -> $$2.set(
                           "CriteriaType",
                           $$2.createMap(
                              ImmutableMap.of(
                                 $$2.createString("type"),
                                 $$2.createString((String)$$1x.getFirst()),
                                 $$2.createString("id"),
                                 $$2.createString((String)$$1x.getSecond())
                              )
                           )
                        )
                  ),
               $$2
            ))
            .getValue();
      }
   };
   protected static final HookFunction d = new HookFunction() {
      private String a(String $$0) {
         abb $$1 = abb.a($$0);
         return $$1 != null ? $$1.b() + "." + $$1.a() : $$0;
      }

      public <T> T apply(DynamicOps<T> $$0, T $$1) {
         Dynamic<T> $$2 = new Dynamic($$0, $$1);
         Optional<Dynamic<T>> $$3 = $$2.get("CriteriaType")
            .get()
            .get()
            .left()
            .flatMap(
               $$1x -> {
                  Optional<String> $$2x = $$1x.get("type").asString().get().left();
                  Optional<String> $$3x = $$1x.get("id").asString().get().left();
                  if ($$2x.isPresent() && $$3x.isPresent()) {
                     String $$4 = (String)$$2x.get();
                     return $$4.equals("_special")
                        ? Optional.of($$2.createString((String)$$3x.get()))
                        : Optional.of($$1x.createString(this.a($$4) + ":" + this.a((String)$$3x.get())));
                  } else {
                     return Optional.empty();
                  }
               }
            );
         return (T)((Dynamic)DataFixUtils.orElse($$3.map($$1x -> $$2.set("CriteriaName", $$1x).remove("CriteriaType")), $$2)).getValue();
      }
   };

   public aup(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
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
      Map<String, Supplier<TypeTemplate>> $$4 = a($$0);
      $$0.registerType(false, asr.w, () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), $$4)), c, d));
   }

   protected static Map<String, Supplier<TypeTemplate>> a(Schema $$0) {
      Supplier<TypeTemplate> $$1 = () -> DSL.optionalFields("id", asr.s.in($$0));
      Supplier<TypeTemplate> $$2 = () -> DSL.optionalFields("id", asr.r.in($$0));
      Supplier<TypeTemplate> $$3 = () -> DSL.optionalFields("id", asr.o.in($$0));
      Map<String, Supplier<TypeTemplate>> $$4 = Maps.newHashMap();
      $$4.put("minecraft:mined", $$2);
      $$4.put("minecraft:crafted", $$1);
      $$4.put("minecraft:used", $$1);
      $$4.put("minecraft:broken", $$1);
      $$4.put("minecraft:picked_up", $$1);
      $$4.put("minecraft:dropped", $$1);
      $$4.put("minecraft:killed", $$3);
      $$4.put("minecraft:killed_by", $$3);
      $$4.put("minecraft:custom", (Supplier)() -> DSL.optionalFields("id", DSL.constType(a())));
      $$4.put("_special", (Supplier)() -> DSL.optionalFields("id", DSL.constType(DSL.string())));
      return $$4;
   }
}
