import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class doc extends doq {
   public static final Codec<doc> a = Codec.unit(() -> doc.b);
   public static final doc b = new doc();

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      gt $$6 = $$4.a;
      boolean $$7 = $$0.a_($$6).a(cju.D);
      return $$7 && !cjt.a($$4.b.j($$0, $$6)) ? new dot.c($$6, cju.D.m(), $$4.c) : $$4;
   }

   @Override
   protected dos<?> a() {
      return dos.i;
   }
}
