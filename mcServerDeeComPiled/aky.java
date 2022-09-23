import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aky(List<akx> b, boolean c) {
   public static final Codec<aky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akx.a.listOf().fieldOf("values").forGetter(aky::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aky::b))
            .apply($$0, aky::new)
   );

   public List<akx> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
