import java.util.stream.Stream;

public class cay {
   public static bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      $$1.c($$2);
      return bak.b($$1.b($$2));
   }

   public static cax a(cax $$0, buc $$1, cax $$2, boolean $$3) {
      boolean $$4 = $$1.fB().d;
      if ($$3 && $$4) {
         if (!$$1.fA().h($$2)) {
            $$1.fA().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.g(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fA().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cax a(cax $$0, buc $$1, cax $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(bqv $$0, Stream<cax> $$1) {
      cgx $$2 = $$0.s;
      if (!$$2.y) {
         $$1.forEach($$2x -> $$2.b(new bqv($$2, $$0.df(), $$0.dh(), $$0.dl(), $$2x)));
      }
   }
}
