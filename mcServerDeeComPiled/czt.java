import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class czt implements czy {
   public static final Codec<czt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alq.a.fieldOf("source_entity").forGetter(czt::b), Codec.FLOAT.fieldOf("y_offset").orElse(0.0F).forGetter($$0x -> $$0x.d))
            .apply($$0, ($$0x, $$1) -> new czt(Either.right(Either.left($$0x)), $$1))
   );
   private Either<bbn, Either<UUID, Integer>> c;
   final float d;

   public czt(bbn $$0, float $$1) {
      this(Either.left($$0), $$1);
   }

   czt(Either<bbn, Either<UUID, Integer>> $$0, float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Optional<dwq> a(cgx $$0) {
      if (this.c.left().isEmpty()) {
         this.b($$0);
      }

      return this.c.left().map($$0x -> $$0x.cY().b(0.0, (double)this.d, 0.0));
   }

   private void b(cgx $$0) {
      ((Optional)this.c.map(Optional::of, $$1 -> Optional.ofNullable((bbn)$$1.map($$1x -> $$0 instanceof agg $$2 ? $$2.a($$1x) : null, $$0::a))))
         .ifPresent($$0x -> this.c = Either.left($$0x));
   }

   private UUID b() {
      return (UUID)this.c.map(bbn::co, $$0 -> (UUID)$$0.map(Function.identity(), $$0x -> {
            throw new RuntimeException("Unable to get entityId from uuid");
         }));
   }

   int c() {
      return this.c.map(bbn::ae, $$0 -> (Integer)$$0.map($$0x -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
         }, Function.identity()));
   }

   @Override
   public czz<?> a() {
      return czz.b;
   }

   public static class a implements czz<czt> {
      public czt a(qx $$0) {
         return new czt(Either.right(Either.right($$0.k())), $$0.readFloat());
      }

      public void a(qx $$0, czt $$1) {
         $$0.d($$1.c());
         $$0.writeFloat($$1.d);
      }

      @Override
      public Codec<czt> a() {
         return czt.a;
      }
   }
}
