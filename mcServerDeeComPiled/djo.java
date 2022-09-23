import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djo extends djj {
   public static final Codec<djo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayt.b(djj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, djo::new)
   );
   private final ayt<djj> b;

   public djo(ayt<djj> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(amn $$0, dbn $$1) {
      return ((djj)this.b.a($$0).orElseThrow(IllegalStateException::new)).a($$0, $$1);
   }

   @Override
   public djk<?> a() {
      return djk.f;
   }
}
