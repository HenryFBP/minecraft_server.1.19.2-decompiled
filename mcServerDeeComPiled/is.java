import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class is implements im {
   public static final Codec<is> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czy.b.fieldOf("destination").forGetter($$0x -> $$0x.c), Codec.INT.fieldOf("arrival_in_ticks").forGetter($$0x -> $$0x.d))
            .apply($$0, is::new)
   );
   public static final im.a<is> b = new im.a<is>() {
      public is a(in<is> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$3 = (float)$$1.readDouble();
         $$1.expect(' ');
         float $$4 = (float)$$1.readDouble();
         $$1.expect(' ');
         int $$5 = $$1.readInt();
         gt $$6 = new gt((double)$$2, (double)$$3, (double)$$4);
         return new is(new czr($$6), $$5);
      }

      public is a(in<is> $$0, qx $$1) {
         czy $$2 = czz.c($$1);
         int $$3 = $$1.k();
         return new is($$2, $$3);
      }
   };
   private final czy c;
   private final int d;

   public is(czy $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(qx $$0) {
      czz.a(this.c, $$0);
      $$0.d(this.d);
   }

   @Override
   public String a() {
      dwq $$0 = (dwq)this.c.a(null).get();
      double $$1 = $$0.a();
      double $$2 = $$0.b();
      double $$3 = $$0.c();
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %d", hm.aa.b(this.b()), $$1, $$2, $$3, this.d);
   }

   @Override
   public in<is> b() {
      return io.O;
   }

   public czy c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }
}
