public class cep extends cer {
   protected cep(cer.a $$0, bbs... $$1) {
      super($$0, ces.j, $$1);
   }

   @Override
   public int a(int $$0) {
      return 5 + ($$0 - 1) * 8;
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
      return $$0.h() ? true : super.a($$0);
   }

   public static boolean a(cax $$0, int $$1, amn $$2) {
      if ($$0.c() instanceof byo && $$2.i() < 0.6F) {
         return false;
      } else {
         return $$2.a($$1 + 1) > 0;
      }
   }
}
