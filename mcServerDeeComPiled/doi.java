import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class doi {
   public static final Codec<doi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               don.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.b),
               don.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.c),
               dog.c.optionalFieldOf("position_predicate", dof.b).forGetter($$0x -> $$0x.d),
               cvo.b.fieldOf("output_state").forGetter($$0x -> $$0x.e),
               pj.a.optionalFieldOf("output_nbt").forGetter($$0x -> Optional.ofNullable($$0x.f))
            )
            .apply($$0, doi::new)
   );
   private final don b;
   private final don c;
   private final dog d;
   private final cvo e;
   @Nullable
   private final pj f;

   public doi(don $$0, don $$1, cvo $$2) {
      this($$0, $$1, dof.b, $$2, Optional.empty());
   }

   public doi(don $$0, don $$1, dog $$2, cvo $$3) {
      this($$0, $$1, $$2, $$3, Optional.empty());
   }

   public doi(don $$0, don $$1, dog $$2, cvo $$3, Optional<pj> $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = (pj)$$4.orElse(null);
   }

   public boolean a(cvo $$0, cvo $$1, gt $$2, gt $$3, gt $$4, amn $$5) {
      return this.b.a($$0, $$5) && this.c.a($$1, $$5) && this.d.a($$2, $$3, $$4, $$5);
   }

   public cvo a() {
      return this.e;
   }

   @Nullable
   public pj b() {
      return this.f;
   }
}
