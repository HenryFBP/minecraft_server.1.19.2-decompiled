import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class dic extends dhw {
   public static final Codec<dic> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhw.a.fieldOf("source").forGetter($$0x -> $$0x.c),
               Codec.STRING.fieldOf("property").forGetter($$0x -> $$0x.d),
               azo.c.fieldOf("values").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dic::new)
   );
   private final dhw c;
   private final String d;
   @Nullable
   private cwo e;
   private final azo f;

   public dic(dhw $$0, cwo $$1, azo $$2) {
      this.c = $$0;
      this.e = $$1;
      this.d = $$1.f();
      this.f = $$2;
      Collection<Integer> $$3 = $$1.a();

      for(int $$4 = $$2.a(); $$4 <= $$2.b(); ++$$4) {
         if (!$$3.contains($$4)) {
            throw new IllegalArgumentException("Property value out of range: " + $$1.f() + ": " + $$4);
         }
      }

   }

   public dic(dhw $$0, String $$1, azo $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected dhx<?> a() {
      return dhx.g;
   }

   @Override
   public cvo a(amn $$0, gt $$1) {
      cvo $$2 = this.c.a($$0, $$1);
      if (this.e == null || !$$2.b(this.e)) {
         this.e = a($$2, this.d);
      }

      return $$2.a(this.e, Integer.valueOf(this.f.a($$0)));
   }

   private static cwo a(cvo $$0, String $$1) {
      Collection<cwr<?>> $$2 = $$0.v();
      Optional<cwo> $$3 = $$2.stream().filter($$1x -> $$1x.f().equals($$1)).filter($$0x -> $$0x instanceof cwo).map($$0x -> (cwo)$$0x).findAny();
      return (cwo)$$3.orElseThrow(() -> new IllegalArgumentException("Illegal property: " + $$1));
   }
}
