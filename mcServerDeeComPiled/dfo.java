import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfo(List<dfo.a> b, gy c, dbw d, boolean e) implements dfx {
   public static final Codec<dfo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfo.a.a.listOf().fieldOf("layers").forGetter(dfo::a),
               gy.g.fieldOf("direction").forGetter(dfo::b),
               dbw.b.fieldOf("allowed_placement").forGetter(dfo::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dfo::d)
            )
            .apply($$0, dfo::new)
   );

   public static dfo.a a(azo $$0, dhw $$1) {
      return new dfo.a($$0, $$1);
   }

   public static dfo b(azo $$0, dhw $$1) {
      return new dfo(List.of(a($$0, $$1)), gy.b, dbw.c, false);
   }

   public List<dfo.a> a() {
      return this.b;
   }

   public gy b() {
      return this.c;
   }

   public dbw c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(azo b, dhw c) {
      public static final Codec<dfo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(azo.d.fieldOf("height").forGetter(dfo.a::a), dhw.a.fieldOf("provider").forGetter(dfo.a::b)).apply($$0, dfo.a::new)
      );

      public azo a() {
         return this.b;
      }

      public dhw b() {
         return this.c;
      }
   }
}
