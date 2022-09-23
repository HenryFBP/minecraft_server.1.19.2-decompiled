import com.google.gson.JsonObject;

public abstract class cea implements cdp<bac> {
   protected final cdm a;
   protected final cax b;
   private final cds<?> e;
   private final cdr<?> f;
   protected final abb c;
   protected final String d;

   public cea(cds<?> $$0, cdr<?> $$1, abb $$2, String $$3, cdm $$4, cax $$5) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.a = $$4;
      this.b = $$5;
   }

   @Override
   public cds<?> g() {
      return this.e;
   }

   @Override
   public cdr<?> U_() {
      return this.f;
   }

   @Override
   public abb f() {
      return this.c;
   }

   @Override
   public String d() {
      return this.d;
   }

   @Override
   public cax c() {
      return this.b;
   }

   @Override
   public hi<cdm> a() {
      hi<cdm> $$0 = hi.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cax a(bac $$0) {
      return this.b.o();
   }

   public static class a<T extends cea> implements cdr<T> {
      final cea.a.a<T> v;

      protected a(cea.a.a<T> $$0) {
         this.v = $$0;
      }

      public T b(abb $$0, JsonObject $$1) {
         String $$2 = alz.a($$1, "group", "");
         cdm $$3;
         if (alz.d($$1, "ingredient")) {
            $$3 = cdm.a(alz.u($$1, "ingredient"));
         } else {
            $$3 = cdm.a(alz.t($$1, "ingredient"));
         }

         String $$5 = alz.h($$1, "result");
         int $$6 = alz.n($$1, "count");
         cax $$7 = new cax(hm.Y.a(new abb($$5)), $$6);
         return this.v.create($$0, $$2, $$3, $$7);
      }

      public T b(abb $$0, qx $$1) {
         String $$2 = $$1.q();
         cdm $$3 = cdm.b($$1);
         cax $$4 = $$1.p();
         return this.v.create($$0, $$2, $$3, $$4);
      }

      public void a(qx $$0, T $$1) {
         $$0.a($$1.d);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cea> {
         T create(abb var1, String var2, cdm var3, cax var4);
      }
   }
}
