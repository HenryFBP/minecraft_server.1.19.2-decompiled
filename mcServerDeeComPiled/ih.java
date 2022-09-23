import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ih extends ij {
   public static final k a = new k(dwq.a(3790560));
   public static final ih b = new ih(a, ii.a, 1.0F);
   public static final Codec<ih> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               k.a.fieldOf("fromColor").forGetter($$0x -> $$0x.g),
               k.a.fieldOf("toColor").forGetter($$0x -> $$0x.i),
               Codec.FLOAT.fieldOf("scale").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ih::new)
   );
   public static final im.a<ih> d = new im.a<ih>() {
      public ih a(in<ih> $$0, StringReader $$1) throws CommandSyntaxException {
         k $$2 = ij.a($$1);
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         k $$4 = ij.a($$1);
         return new ih($$2, $$4, $$3);
      }

      public ih a(in<ih> $$0, qx $$1) {
         k $$2 = ij.b($$1);
         float $$3 = $$1.readFloat();
         k $$4 = ij.b($$1);
         return new ih($$2, $$4, $$3);
      }
   };
   private final k i;

   public ih(k $$0, k $$1, float $$2) {
      super($$0, $$2);
      this.i = $$1;
   }

   public k c() {
      return this.g;
   }

   public k d() {
      return this.i;
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      $$0.writeFloat(this.i.a());
      $$0.writeFloat(this.i.b());
      $$0.writeFloat(this.i.c());
   }

   @Override
   public String a() {
      return String.format(
         Locale.ROOT,
         "%s %.2f %.2f %.2f %.2f %.2f %.2f %.2f",
         hm.aa.b(this.b()),
         this.g.a(),
         this.g.b(),
         this.g.c(),
         this.h,
         this.i.a(),
         this.i.b(),
         this.i.c()
      );
   }

   @Override
   public in<ih> b() {
      return io.p;
   }
}
