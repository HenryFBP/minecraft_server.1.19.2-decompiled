import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dob extends doq {
   public static final Codec<dob> a = Codec.unit(() -> dob.b);
   public static final dob b = new dob();

   private dob() {
   }

   @Nullable
   @Override
   public dot.c a(cha $$0, gt $$1, gt $$2, dot.c $$3, dot.c $$4, dop $$5) {
      cvo $$6 = $$4.b;
      if ($$6.a(cju.nM)) {
         String $$7 = $$4.c.l("final_state");

         cvo $$9;
         try {
            ff.a $$8 = ff.a(hm.V, $$7, true);
            $$9 = $$8.a();
         } catch (CommandSyntaxException var11) {
            throw new RuntimeException(var11);
         }

         return $$9.a(cju.jz) ? null : new dot.c($$4.a, $$9, null);
      } else {
         return $$4;
      }
   }

   @Override
   protected dos<?> a() {
      return dos.d;
   }
}
