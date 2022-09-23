import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.Supplier;

public interface sc {
   rq a();

   void a(agh var1, boolean var2, rm.a var3);

   void a(aiz var1);

   static sc a(sd $$0) {
      return (sc)($$0.f().b() ? new sc.a($$0) : new sc.b($$0));
   }

   public static class a implements sc {
      private final sd a;

      public a(sd $$0) {
         this.a = $$0;
      }

      @Override
      public rq a() {
         return this.a.c();
      }

      @Override
      public void a(agh $$0, boolean $$1, rm.a $$2) {
         sd $$3 = this.a.a($$1);
         if (!$$3.h()) {
            hn $$4 = $$0.s.s();
            rm.b $$5 = $$2.a($$4);
            $$0.b.a(new vf($$3, $$5));
            $$0.b.a($$3);
         }

      }

      @Override
      public void a(aiz $$0) {
      }
   }

   public static class b implements sc {
      private final sd a;
      private final Set<agh> b = Sets.newIdentityHashSet();

      public b(sd $$0) {
         this.a = $$0;
      }

      @Override
      public rq a() {
         return this.a.c();
      }

      @Override
      public void a(agh $$0, boolean $$1, rm.a $$2) {
         sd $$3 = this.a.a($$1);
         if (!$$3.h()) {
            this.b.add($$0);
            hn $$4 = $$0.s.s();
            rm.b $$5 = $$2.a($$4);
            $$0.b.a(new vf($$3, $$5), rb.a((Supplier<tc<?>>)(() -> new ve(this.a))));
            $$0.b.a($$3);
         }

      }

      @Override
      public void a(aiz $$0) {
         $$0.a(this.a, this.b);
      }
   }
}
