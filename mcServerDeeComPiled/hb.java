import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class hb {
   public static final Codec<hb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cgx.d.fieldOf("dimension").forGetter(hb::a), gt.a.fieldOf("pos").forGetter(hb::b)).apply($$0, hb::a)
   );
   private final aba<cgx> b;
   private final gt c;

   private hb(aba<cgx> $$0, gt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static hb a(aba<cgx> $$0, gt $$1) {
      return new hb($$0, $$1);
   }

   public aba<cgx> a() {
      return this.b;
   }

   public gt b() {
      return this.c;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         hb $$1 = (hb)$$0;
         return Objects.equals(this.b, $$1.b) && Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.b, this.c});
   }

   public String toString() {
      return this.b + " " + this.c;
   }
}
