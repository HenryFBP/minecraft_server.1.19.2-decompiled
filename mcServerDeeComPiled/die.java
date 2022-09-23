import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record die(dhw b, List<die.a> c) {
   public static final Codec<die> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dhw.a.fieldOf("fallback").forGetter(die::a), die.a.a.listOf().fieldOf("rules").forGetter(die::b)).apply($$0, die::new)
   );

   public static die a(dhw $$0) {
      return new die($$0, List.of());
   }

   public static die a(cjt $$0) {
      return a(dhw.a($$0));
   }

   public cvo a(chp $$0, amn $$1, gt $$2) {
      for(die.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dhw a() {
      return this.b;
   }

   public List<die.a> b() {
      return this.c;
   }

   public static record a(dbw b, dhw c) {
      public static final Codec<die.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dbw.b.fieldOf("if_true").forGetter(die.a::a), dhw.a.fieldOf("then").forGetter(die.a::b)).apply($$0, die.a::new)
      );

      public dbw a() {
         return this.b;
      }

      public dhw b() {
         return this.c;
      }
   }
}
