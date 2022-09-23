import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class iq implements im {
   public static final Codec<iq> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, iq::new));
   public static final im.a<iq> b = new im.a<iq>() {
      public iq a(in<iq> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new iq($$2);
      }

      public iq a(in<iq> $$0, qx $$1) {
         return new iq($$1.k());
      }
   };
   private final int c;

   public iq(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(qx $$0) {
      $$0.d(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", hm.aa.b(this.b()), this.c);
   }

   @Override
   public in<iq> b() {
      return io.aO;
   }

   public int c() {
      return this.c;
   }
}
