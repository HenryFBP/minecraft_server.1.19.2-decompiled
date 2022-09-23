import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class apl extends DataFix {
   public apl(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.a(this.getInputSchema().getTypeRaw(asr.m));
   }

   private <IS> TypeRewriteRule a(Type<IS> $$0) {
      Type<Pair<Either<List<IS>, Unit>, Dynamic<?>>> $$1 = DSL.and(DSL.optional(DSL.field("Equipment", DSL.list($$0))), DSL.remainderType());
      Type<Pair<Either<List<IS>, Unit>, Pair<Either<List<IS>, Unit>, Dynamic<?>>>> $$2 = DSL.and(
         DSL.optional(DSL.field("ArmorItems", DSL.list($$0))), DSL.optional(DSL.field("HandItems", DSL.list($$0))), DSL.remainderType()
      );
      OpticFinder<Pair<Either<List<IS>, Unit>, Dynamic<?>>> $$3 = DSL.typeFinder($$1);
      OpticFinder<List<IS>> $$4 = DSL.fieldFinder("Equipment", DSL.list($$0));
      return this.fixTypeEverywhereTyped(
         "EntityEquipmentToArmorAndHandFix",
         this.getInputSchema().getType(asr.q),
         this.getOutputSchema().getType(asr.q),
         $$4x -> {
            Either<List<IS>, Unit> $$5 = Either.right(DSL.unit());
            Either<List<IS>, Unit> $$6 = Either.right(DSL.unit());
            Dynamic<?> $$7 = (Dynamic)$$4x.getOrCreate(DSL.remainderFinder());
            Optional<List<IS>> $$8 = $$4x.getOptional($$4);
            if ($$8.isPresent()) {
               List<IS> $$9 = (List)$$8.get();
               IS $$10 = (IS)((Pair)$$0.read($$7.emptyMap())
                     .result()
                     .orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack.")))
                  .getFirst();
               if (!$$9.isEmpty()) {
                  $$5 = Either.left(Lists.newArrayList(new Object[]{$$9.get(0), $$10}));
               }
   
               if ($$9.size() > 1) {
                  List<IS> $$11 = Lists.newArrayList(new Object[]{$$10, $$10, $$10, $$10});
   
                  for(int $$12 = 1; $$12 < Math.min($$9.size(), 5); ++$$12) {
                     $$11.set($$12 - 1, $$9.get($$12));
                  }
   
                  $$6 = Either.left($$11);
               }
            }
   
            Dynamic<?> $$13 = $$7;
            Optional<? extends Stream<? extends Dynamic<?>>> $$14 = $$7.get("DropChances").asStreamOpt().result();
            if ($$14.isPresent()) {
               Iterator<? extends Dynamic<?>> $$15 = Stream.concat((Stream)$$14.get(), Stream.generate(() -> $$13.createInt(0))).iterator();
               float $$16 = ((Dynamic)$$15.next()).asFloat(0.0F);
               if (!$$7.get("HandDropChances").result().isPresent()) {
                  Dynamic<?> $$17 = $$7.createList(Stream.of($$16, 0.0F).map($$7::createFloat));
                  $$7 = $$7.set("HandDropChances", $$17);
               }
   
               if (!$$7.get("ArmorDropChances").result().isPresent()) {
                  Dynamic<?> $$18 = $$7.createList(
                     Stream.of(
                           ((Dynamic)$$15.next()).asFloat(0.0F),
                           ((Dynamic)$$15.next()).asFloat(0.0F),
                           ((Dynamic)$$15.next()).asFloat(0.0F),
                           ((Dynamic)$$15.next()).asFloat(0.0F)
                        )
                        .map($$7::createFloat)
                  );
                  $$7 = $$7.set("ArmorDropChances", $$18);
               }
   
               $$7 = $$7.remove("DropChances");
            }
   
            return $$4x.set($$3, $$2, Pair.of($$5, Pair.of($$6, $$7)));
         }
      );
   }
}
