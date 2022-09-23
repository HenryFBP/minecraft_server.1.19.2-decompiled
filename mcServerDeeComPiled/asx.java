import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class asx extends DataFix {
   private static final Pattern a = Pattern.compile("\\[(\\d+)\\]");
   private static final Set<String> b = Sets.newHashSet(
      new String[]{"minecraft:jigsaw", "minecraft:nvi", "minecraft:pcp", "minecraft:bastionremnant", "minecraft:runtime"}
   );
   private static final Set<String> c = Sets.newHashSet(new String[]{"minecraft:tree", "minecraft:flower", "minecraft:block_pile", "minecraft:random_patch"});

   public asx(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead("SavedDataFeaturePoolElementFix", this.getInputSchema().getType(asr.v), this.getOutputSchema().getType(asr.v), asx::b);
   }

   private static <T> Dynamic<T> b(Dynamic<T> $$0) {
      return $$0.update("Children", asx::c);
   }

   private static <T> Dynamic<T> c(Dynamic<T> $$0) {
      return (Dynamic<T>)$$0.asStreamOpt().map(asx::a).map($$0::createList).result().orElse($$0);
   }

   private static Stream<? extends Dynamic<?>> a(Stream<? extends Dynamic<?>> $$0) {
      return $$0.map(
         $$0x -> {
            String $$1 = $$0x.get("id").asString("");
            if (!b.contains($$1)) {
               return $$0x;
            } else {
               OptionalDynamic<?> $$2 = $$0x.get("pool_element");
               return !$$2.get("element_type").asString("").equals("minecraft:feature_pool_element")
                  ? $$0x
                  : $$0x.update("pool_element", $$0xx -> $$0xx.update("feature", asx::a));
            }
         }
      );
   }

   private static <T> OptionalDynamic<T> a(Dynamic<T> $$0, String... $$1) {
      if ($$1.length == 0) {
         throw new IllegalArgumentException("Missing path");
      } else {
         OptionalDynamic<T> $$2 = $$0.get($$1[0]);

         for(int $$3 = 1; $$3 < $$1.length; ++$$3) {
            String $$4 = $$1[$$3];
            Matcher $$5 = a.matcher($$4);
            if ($$5.matches()) {
               int $$6 = Integer.parseInt($$5.group(1));
               List<? extends Dynamic<T>> $$7 = $$2.asList(Function.identity());
               if ($$6 >= 0 && $$6 < $$7.size()) {
                  $$2 = new OptionalDynamic($$0.getOps(), DataResult.success((Dynamic)$$7.get($$6)));
               } else {
                  $$2 = new OptionalDynamic($$0.getOps(), DataResult.error("Missing id:" + $$6));
               }
            } else {
               $$2 = $$2.get($$4);
            }
         }

         return $$2;
      }
   }

   @VisibleForTesting
   protected static Dynamic<?> a(Dynamic<?> $$0) {
      Optional<String> $$1 = a(
         a($$0, "type").asString(""),
         a($$0, "name").asString(""),
         a($$0, "config", "state_provider", "type").asString(""),
         a($$0, "config", "state_provider", "state", "Name").asString(""),
         a($$0, "config", "state_provider", "entries", "[0]", "data", "Name").asString(""),
         a($$0, "config", "foliage_placer", "type").asString(""),
         a($$0, "config", "leaves_provider", "state", "Name").asString("")
      );
      return $$1.isPresent() ? $$0.createString((String)$$1.get()) : $$0;
   }

   private static Optional<String> a(String $$0, String $$1, String $$2, String $$3, String $$4, String $$5, String $$6) {
      String $$7;
      if (!$$0.isEmpty()) {
         $$7 = $$0;
      } else {
         if ($$1.isEmpty()) {
            return Optional.empty();
         }

         if ("minecraft:normal_tree".equals($$1)) {
            $$7 = "minecraft:tree";
         } else {
            $$7 = $$1;
         }
      }

      if (c.contains($$7)) {
         if ("minecraft:random_patch".equals($$7)) {
            if ("minecraft:simple_state_provider".equals($$2)) {
               if ("minecraft:sweet_berry_bush".equals($$3)) {
                  return Optional.of("minecraft:patch_berry_bush");
               }

               if ("minecraft:cactus".equals($$3)) {
                  return Optional.of("minecraft:patch_cactus");
               }
            } else if ("minecraft:weighted_state_provider".equals($$2) && ("minecraft:grass".equals($$4) || "minecraft:fern".equals($$4))) {
               return Optional.of("minecraft:patch_taiga_grass");
            }
         } else if ("minecraft:block_pile".equals($$7)) {
            if (!"minecraft:simple_state_provider".equals($$2) && !"minecraft:rotated_block_provider".equals($$2)) {
               if ("minecraft:weighted_state_provider".equals($$2)) {
                  if ("minecraft:packed_ice".equals($$4) || "minecraft:blue_ice".equals($$4)) {
                     return Optional.of("minecraft:pile_ice");
                  }

                  if ("minecraft:jack_o_lantern".equals($$4) || "minecraft:pumpkin".equals($$4)) {
                     return Optional.of("minecraft:pile_pumpkin");
                  }
               }
            } else {
               if ("minecraft:hay_block".equals($$3)) {
                  return Optional.of("minecraft:pile_hay");
               }

               if ("minecraft:melon".equals($$3)) {
                  return Optional.of("minecraft:pile_melon");
               }

               if ("minecraft:snow".equals($$3)) {
                  return Optional.of("minecraft:pile_snow");
               }
            }
         } else {
            if ("minecraft:flower".equals($$7)) {
               return Optional.of("minecraft:flower_plain");
            }

            if ("minecraft:tree".equals($$7)) {
               if ("minecraft:acacia_foliage_placer".equals($$5)) {
                  return Optional.of("minecraft:acacia");
               }

               if ("minecraft:blob_foliage_placer".equals($$5) && "minecraft:oak_leaves".equals($$6)) {
                  return Optional.of("minecraft:oak");
               }

               if ("minecraft:pine_foliage_placer".equals($$5)) {
                  return Optional.of("minecraft:pine");
               }

               if ("minecraft:spruce_foliage_placer".equals($$5)) {
                  return Optional.of("minecraft:spruce");
               }
            }
         }
      }

      return Optional.empty();
   }
}
