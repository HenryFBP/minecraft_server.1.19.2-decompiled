import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dft implements dfx {
   public static final Codec<dft> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvo.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               cvo.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               azo.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               azo.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dft::new)
   );
   private final cvo b;
   private final cvo c;
   private final azo d;
   private final azo e;

   public dft(cvo $$0, cvo $$1, azo $$2, azo $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public cvo a() {
      return this.b;
   }

   public cvo b() {
      return this.c;
   }

   public azo c() {
      return this.d;
   }

   public azo d() {
      return this.e;
   }
}
