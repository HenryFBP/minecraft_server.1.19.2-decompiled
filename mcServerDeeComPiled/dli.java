import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dli(dli.a b, ayx<cif.c> c) {
   public static final Codec<dli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dli.a.c.fieldOf("bounding_box").forGetter(dli::a), ayx.c(cif.c.a).fieldOf("spawns").forGetter(dli::b)).apply($$0, dli::new)
   );

   public dli.a a() {
      return this.b;
   }

   public ayx<cif.c> b() {
      return this.c;
   }

   public static enum a implements amw {
      a("piece"),
      b("full");

      public static final Codec<dli.a> c = amw.a(dli.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }
   }
}
