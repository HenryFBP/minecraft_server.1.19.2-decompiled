import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dnw extends doq {
   public static final Codec<dnw> a = cvo.b.xmap(cvn.a::b, cjt::m).listOf().fieldOf("blocks").xmap(dnw::new, $$0 -> $$0.e).codec();
   public static final dnw b = new dnw(ImmutableList.of(cju.nL));
   public static final dnw c = new dnw(ImmutableList.of(cju.a));
   public static final dnw d = new dnw(ImmutableList.of(cju.a, cju.nL));
   private final ImmutableList<cjt> e;

   public dnw(List<cjt> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      return this.e.contains($$4.b.b()) ? null : $$4;
   }

   @Override
   protected dos<?> a() {
      return dos.a;
   }
}
