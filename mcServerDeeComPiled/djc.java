import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djc {
   public static final Codec<djc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, cyu.c).fieldOf("height").forGetter(djc::a), hm.V.p().fieldOf("block").orElse(cju.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, djc::new)
   );
   private final cjt b;
   private final int c;

   public djc(int $$0, cjt $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public cvo b() {
      return this.b.m();
   }

   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + hm.V.b(this.b);
   }
}
