import java.util.Map.Entry;

public class cfj extends cer {
   private static final float a = 0.15F;

   public cfj(cer.a $$0, bbs... $$1) {
      super($$0, ces.d, $$1);
   }

   @Override
   public int a(int $$0) {
      return 10 + 20 * ($$0 - 1);
   }

   @Override
   public int b(int $$0) {
      return super.a($$0) + 50;
   }

   @Override
   public int a() {
      return 3;
   }

   @Override
   public boolean a(cax $$0) {
      return $$0.c() instanceof byo ? true : super.a($$0);
   }

   @Override
   public void b(bcc $$0, bbn $$1, int $$2) {
      amn $$3 = $$0.dQ();
      Entry<bbs, cax> $$4 = cet.b(cev.h, $$0);
      if (a($$2, $$3)) {
         if ($$1 != null) {
            $$1.a(baw.a((bbn)$$0), (float)b($$2, $$3));
         }

         if ($$4 != null) {
            ((cax)$$4.getValue()).a(2, $$0, $$1x -> $$1x.d((bbs)$$4.getKey()));
         }
      }

   }

   public static boolean a(int $$0, amn $$1) {
      if ($$0 <= 0) {
         return false;
      } else {
         return $$1.i() < 0.15F * (float)$$0;
      }
   }

   public static int b(int $$0, amn $$1) {
      return $$0 > 10 ? $$0 - 10 : 1 + $$1.a(4);
   }
}
