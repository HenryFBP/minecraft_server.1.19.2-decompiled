import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class btq {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] d = new int[]{0, 10, 70, 150, 250};
   public static final Codec<btq> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hm.ao.p().fieldOf("type").orElseGet(() -> btu.c).forGetter($$0x -> $$0x.e),
               hm.ap.p().fieldOf("profession").orElseGet(() -> bts.b).forGetter($$0x -> $$0x.f),
               Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, btq::new)
   );
   private final btu e;
   private final bts f;
   private final int g;

   public btq(btu $$0, bts $$1, int $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = Math.max(1, $$2);
   }

   public btu a() {
      return this.e;
   }

   public bts b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public btq a(btu $$0) {
      return new btq($$0, this.f, this.g);
   }

   public btq a(bts $$0) {
      return new btq(this.e, $$0, this.g);
   }

   public btq a(int $$0) {
      return new btq(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? d[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? d[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }
}
