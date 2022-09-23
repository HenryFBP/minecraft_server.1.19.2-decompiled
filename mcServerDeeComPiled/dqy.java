import java.util.Locale;
import javax.annotation.Nullable;

public interface dqy {
   gy[] a = new gy[]{gy.e, gy.f, gy.a, gy.b, gy.c, gy.d};

   void a(gy var1, cvo var2, gt var3, gt var4, int var5, int var6);

   void a(gt var1, cjt var2, gt var3);

   void a(cvo var1, gt var2, cjt var3, gt var4, boolean var5);

   default void a(gt $$0, cjt $$1, @Nullable gy $$2) {
      for(gy $$3 : a) {
         if ($$3 != $$2) {
            this.a($$0.a($$3), $$1, $$0);
         }
      }

   }

   static void a(cgy $$0, gy $$1, cvo $$2, gt $$3, gt $$4, int $$5, int $$6) {
      cvo $$7 = $$0.a_($$3);
      cvo $$8 = $$7.a($$1, $$2, $$0, $$3, $$4);
      cjt.a($$7, $$8, $$0, $$3, $$5, $$6);
   }

   static void a(cgx $$0, cvo $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      try {
         $$1.a($$0, $$2, $$3, $$4, $$5);
      } catch (Throwable var9) {
         q $$7 = q.a(var9, "Exception while updating neighbours");
         r $$8 = $$7.a("Block being updated");
         $$8.a("Source block type", (s<String>)(() -> {
            try {
               return String.format(Locale.ROOT, "ID #%s (%s // %s)", hm.V.b($$3), $$3.g(), $$3.getClass().getCanonicalName());
            } catch (Throwable var2x) {
               return "ID #" + hm.V.b($$3);
            }
         }));
         r.a($$8, $$0, $$2, $$1);
         throw new z($$7);
      }
   }
}
