import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record ip(float c) implements im {
   public static final Codec<ip> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, ip::new));
   public static final im.a<ip> b = new im.a<ip>() {
      public ip a(in<ip> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new ip($$2);
      }

      public ip a(in<ip> $$0, qx $$1) {
         return new ip($$1.readFloat());
      }
   };

   @Override
   public in<ip> b() {
      return io.E;
   }

   @Override
   public void a(qx $$0) {
      $$0.writeFloat(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", hm.aa.b(this.b()), this.c);
   }
}
