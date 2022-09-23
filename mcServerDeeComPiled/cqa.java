import java.util.Collection;
import javax.annotation.Nullable;

public interface cqa {
   cqa q_ = new cqa() {
      @Override
      public boolean a(cgy $$0, gt $$1, cvo $$2, @Nullable Collection<gy> $$3, boolean $$4) {
         if ($$3 == null) {
            return ((cqg)cju.pq).d().a($$0.a_($$1), $$0, $$1, $$4) > 0L;
         } else if (!$$3.isEmpty()) {
            return !$$2.h() && !$$2.p().b(dpw.c) ? false : cqg.a($$0, $$1, $$2, $$3);
         } else {
            return cqa.super.a($$0, $$1, $$2, $$3, $$4);
         }
      }

      @Override
      public int a(cqf.a $$0, cgy $$1, gt $$2, amn $$3, cqf $$4, boolean $$5) {
         return $$0.c() > 0 ? $$0.b() : 0;
      }

      @Override
      public int g_(int $$0) {
         return Math.max($$0 - 1, 0);
      }
   };

   default byte a() {
      return 1;
   }

   default void a(cgy $$0, cvo $$1, gt $$2, amn $$3) {
   }

   default boolean a(cgy $$0, gt $$1, amn $$2) {
      return false;
   }

   default boolean a(cgy $$0, gt $$1, cvo $$2, @Nullable Collection<gy> $$3, boolean $$4) {
      return ((cok)cju.pq).c().a($$2, $$0, $$1, $$4) > 0L;
   }

   default boolean b() {
      return true;
   }

   default int g_(int $$0) {
      return 1;
   }

   int a(cqf.a var1, cgy var2, gt var3, amn var4, cqf var5, boolean var6);
}
