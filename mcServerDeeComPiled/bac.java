import java.util.Set;
import java.util.function.Predicate;

public interface bac extends baa {
   int j_ = 64;

   int b();

   boolean c();

   cax a(int var1);

   cax a(int var1, int var2);

   cax b(int var1);

   void a(int var1, cax var2);

   default int O_() {
      return 64;
   }

   void e();

   boolean a(buc var1);

   default void d_(buc $$0) {
   }

   default void c_(buc $$0) {
   }

   default boolean b(int $$0, cax $$1) {
      return true;
   }

   default int a_(cat $$0) {
      int $$1 = 0;

      for(int $$2 = 0; $$2 < this.b(); ++$$2) {
         cax $$3 = this.a($$2);
         if ($$3.c().equals($$0)) {
            $$1 += $$3.K();
         }
      }

      return $$1;
   }

   default boolean a(Set<cat> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.c()));
   }

   default boolean a_(Predicate<cax> $$0) {
      for(int $$1 = 0; $$1 < this.b(); ++$$1) {
         cax $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }
}
