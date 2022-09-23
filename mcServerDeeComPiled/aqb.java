import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class aqb extends DataFix {
   public aqb(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Schema $$0 = this.getInputSchema();
      Schema $$1 = this.getOutputSchema();
      Type<?> $$2 = $$0.getTypeRaw(asr.p);
      Type<?> $$3 = $$1.getTypeRaw(asr.p);
      Type<?> $$4 = $$0.getTypeRaw(asr.q);
      return this.a($$0, $$1, $$2, $$3, $$4);
   }

   private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule a(Schema $$0, Schema $$1, Type<OldEntityTree> $$2, Type<NewEntityTree> $$3, Type<Entity> $$4) {
      Type<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> $$5 = DSL.named(asr.p.typeName(), DSL.and(DSL.optional(DSL.field("Riding", $$2)), $$4));
      Type<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> $$6 = DSL.named(
         asr.p.typeName(), DSL.and(DSL.optional(DSL.field("Passengers", DSL.list($$3))), $$4)
      );
      Type<?> $$7 = $$0.getType(asr.p);
      Type<?> $$8 = $$1.getType(asr.p);
      if (!Objects.equals($$7, $$5)) {
         throw new IllegalStateException("Old entity type is not what was expected.");
      } else if (!$$8.equals($$6, true, true)) {
         throw new IllegalStateException("New entity type is not what was expected.");
      } else {
         OpticFinder<Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>>> $$9 = DSL.typeFinder($$5);
         OpticFinder<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> $$10 = DSL.typeFinder($$6);
         OpticFinder<NewEntityTree> $$11 = DSL.typeFinder($$3);
         Type<?> $$12 = $$0.getType(asr.b);
         Type<?> $$13 = $$1.getType(asr.b);
         return TypeRewriteRule.seq(
            this.fixTypeEverywhere(
               "EntityRidingToPassengerFix",
               $$5,
               $$6,
               $$5x -> $$6x -> {
                     Optional<Pair<String, Pair<Either<List<NewEntityTree>, Unit>, Entity>>> $$7x = Optional.empty();
                     Pair<String, Pair<Either<OldEntityTree, Unit>, Entity>> $$8x = $$6x;
      
                     while(true) {
                        Either<List<NewEntityTree>, Unit> $$9x = (Either)DataFixUtils.orElse(
                           $$7x.map(
                              $$4xxx -> {
                                 Typed<NewEntityTree> $$5xxx = (Typed)$$3.pointTyped($$5x)
                                    .orElseThrow(() -> new IllegalStateException("Could not create new entity tree"));
                                 NewEntityTree $$6xx = $$5xxx.set($$10, $$4xxx)
                                    .getOptional($$11)
                                    .orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                                 return Either.left(ImmutableList.of($$6xx));
                              }
                           ),
                           Either.right(DSL.unit())
                        );
                        $$7x = Optional.of(Pair.of(asr.p.typeName(), Pair.of($$9x, ((Pair)$$8x.getSecond()).getSecond())));
                        Optional<OldEntityTree> $$10x = ((Either)((Pair)$$8x.getSecond()).getFirst()).left();
                        if (!$$10x.isPresent()) {
                           return (Pair)$$7x.orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                        }
      
                        $$8x = (Pair)new Typed($$2, $$5x, $$10x.get())
                           .getOptional($$9)
                           .orElseThrow(() -> new IllegalStateException("Should always have an entity here"));
                     }
                  }
            ),
            this.writeAndRead("player RootVehicle injecter", $$12, $$13)
         );
      }
   }
}
