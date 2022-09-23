import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dom extends doq {
   public static final Codec<dom> a = doi.a.listOf().fieldOf("rules").xmap(dom::new, $$0 -> $$0.b).codec();
   private final ImmutableList<doi> b;

   public dom(List<? extends doi> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      amn $$6 = amn.a(ami.a((hs)$$4.a));
      cvo $$7 = $$0.a_($$4.a);
      UnmodifiableIterator var9 = this.b.iterator();

      while(var9.hasNext()) {
         doi $$8 = (doi)var9.next();
         if ($$8.a($$4.b, $$7, $$3.a, $$4.a, $$2, $$6)) {
            return new dot.c($$4.a, $$8.a(), $$8.b());
         }
      }

      return $$4;
   }

   @Override
   protected dos<?> a() {
      return dos.e;
   }
}
