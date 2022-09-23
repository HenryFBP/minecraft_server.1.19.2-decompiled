import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class djw extends dkj {
   public static final Codec<djw> a = dan.a.c.fieldOf("step").xmap(djw::new, $$0 -> $$0.c).codec();
   private final dan.a c;

   private djw(dan.a $$0) {
      this.c = $$0;
   }

   public static djw a(dan.a $$0) {
      return new djw($$0);
   }

   @Override
   public Stream<gt> a_(dkh $$0, amn $$1, gt $$2) {
      cge $$3 = new cge($$2);
      return $$0.a($$3, this.c).a($$3);
   }

   @Override
   public dkk<?> b() {
      return dkk.o;
   }
}
