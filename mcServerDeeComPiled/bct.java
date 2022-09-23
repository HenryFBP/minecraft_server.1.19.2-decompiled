import java.util.function.Predicate;

public interface bct {
   bct a = new bct() {
      @Override
      public cax a() {
         return cax.b;
      }

      @Override
      public boolean a(cax $$0) {
         return false;
      }
   };

   static bct a(final bac $$0, final int $$1, final Predicate<cax> $$2) {
      return new bct() {
         @Override
         public cax a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cax $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bct a(bac $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bct a(final bcc $$0, final bbs $$1, final Predicate<cax> $$2) {
      return new bct() {
         @Override
         public cax a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cax $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bct a(bcc $$0, bbs $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cax a();

   boolean a(cax var1);
}
