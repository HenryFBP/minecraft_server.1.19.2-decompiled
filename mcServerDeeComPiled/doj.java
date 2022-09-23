import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class doj extends doq {
   public final akz<cjt> a;
   public static final Codec<doj> b = akz.b(hm.h).xmap(doj::new, $$0 -> $$0.a);

   public doj(akz<cjt> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      return ddt.a(this.a).test($$0.a_($$4.a)) ? $$4 : null;
   }

   @Override
   protected dos<?> a() {
      return dos.j;
   }
}
