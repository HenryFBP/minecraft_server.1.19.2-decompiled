import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ii extends ij {
   public static final k a = new k(dwq.a(16711680));
   public static final ii b = new ii(a, 1.0F);
   public static final Codec<ii> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(k.a.fieldOf("color").forGetter($$0x -> $$0x.g), Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)).apply($$0, ii::new)
   );
   public static final im.a<ii> d = new im.a<ii>() {
      public ii a(in<ii> $$0, StringReader $$1) throws CommandSyntaxException {
         k $$2 = ij.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new ii($$2, $$3);
      }

      public ii a(in<ii> $$0, qx $$1) {
         return new ii(ij.b($$1), $$1.readFloat());
      }
   };

   public ii(k $$0, float $$1) {
      super($$0, $$1);
   }

   @Override
   public in<ii> b() {
      return io.o;
   }
}
