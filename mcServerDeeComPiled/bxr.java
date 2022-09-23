import javax.annotation.Nullable;

public class bxr implements bac {
   private final cfu b;
   private final hi<cax> c = hi.a(3, cax.b);
   @Nullable
   private cfv d;
   private int e;
   private int f;

   public bxr(cfu $$0) {
      this.b = $$0;
   }

   @Override
   public int b() {
      return this.c.size();
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.c) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cax a(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public cax a(int $$0, int $$1) {
      cax $$2 = this.c.get($$0);
      if ($$0 == 2 && !$$2.b()) {
         return bad.a(this.c, $$0, $$2.K());
      } else {
         cax $$3 = bad.a(this.c, $$0, $$1);
         if (!$$3.b() && this.d($$0)) {
            this.f();
         }

         return $$3;
      }
   }

   private boolean d(int $$0) {
      return $$0 == 0 || $$0 == 1;
   }

   @Override
   public cax b(int $$0) {
      return bad.a(this.c, $$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.c.set($$0, $$1);
      if (!$$1.b() && $$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

      if (this.d($$0)) {
         this.f();
      }

   }

   @Override
   public boolean a(buc $$0) {
      return this.b.fK() == $$0;
   }

   @Override
   public void e() {
      this.f();
   }

   public void f() {
      this.d = null;
      cax $$0;
      cax $$1;
      if (this.c.get(0).b()) {
         $$0 = this.c.get(1);
         $$1 = cax.b;
      } else {
         $$0 = this.c.get(0);
         $$1 = this.c.get(1);
      }

      if ($$0.b()) {
         this.a(2, cax.b);
         this.f = 0;
      } else {
         cfw $$4 = this.b.fM();
         if (!$$4.isEmpty()) {
            cfv $$5 = $$4.a($$0, $$1, this.e);
            if ($$5 == null || $$5.p()) {
               this.d = $$5;
               $$5 = $$4.a($$1, $$0, this.e);
            }

            if ($$5 != null && !$$5.p()) {
               this.d = $$5;
               this.a(2, $$5.f());
               this.f = $$5.o();
            } else {
               this.a(2, cax.b);
               this.f = 0;
            }
         }

         this.b.m(this.a(2));
      }
   }

   @Nullable
   public cfv g() {
      return this.d;
   }

   public void c(int $$0) {
      this.e = $$0;
      this.f();
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public int h() {
      return this.f;
   }
}
