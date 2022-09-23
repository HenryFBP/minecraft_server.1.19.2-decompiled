import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class cdv implements cdh {
   private final abb a;
   final String b;
   final cax c;
   final hi<cdm> d;

   public cdv(abb $$0, String $$1, cax $$2, hi<cdm> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public abb f() {
      return this.a;
   }

   @Override
   public cdr<?> U_() {
      return cdr.b;
   }

   @Override
   public String d() {
      return this.b;
   }

   @Override
   public cax c() {
      return this.c;
   }

   @Override
   public hi<cdm> a() {
      return this.d;
   }

   public boolean a(bxa $$0, cgx $$1) {
      bug $$2 = new bug();
      int $$3 = 0;

      for(int $$4 = 0; $$4 < $$0.b(); ++$$4) {
         cax $$5 = $$0.a($$4);
         if (!$$5.b()) {
            ++$$3;
            $$2.a($$5, 1);
         }
      }

      return $$3 == this.d.size() && $$2.a(this, null);
   }

   public cax a(bxa $$0) {
      return this.c.o();
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= this.d.size();
   }

   public static class a implements cdr<cdv> {
      public cdv b(abb $$0, JsonObject $$1) {
         String $$2 = alz.a($$1, "group", "");
         hi<cdm> $$3 = a(alz.u($$1, "ingredients"));
         if ($$3.isEmpty()) {
            throw new JsonParseException("No ingredients for shapeless recipe");
         } else if ($$3.size() > 9) {
            throw new JsonParseException("Too many ingredients for shapeless recipe");
         } else {
            cax $$4 = cdu.a(alz.t($$1, "result"));
            return new cdv($$0, $$2, $$4, $$3);
         }
      }

      private static hi<cdm> a(JsonArray $$0) {
         hi<cdm> $$1 = hi.a();

         for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
            cdm $$3 = cdm.a($$0.get($$2));
            if (!$$3.d()) {
               $$1.add($$3);
            }
         }

         return $$1;
      }

      public cdv b(abb $$0, qx $$1) {
         String $$2 = $$1.q();
         int $$3 = $$1.k();
         hi<cdm> $$4 = hi.a($$3, cdm.a);

         for(int $$5 = 0; $$5 < $$4.size(); ++$$5) {
            $$4.set($$5, cdm.b($$1));
         }

         cax $$6 = $$1.p();
         return new cdv($$0, $$2, $$6, $$4);
      }

      public void a(qx $$0, cdv $$1) {
         $$0.a($$1.b);
         $$0.d($$1.d.size());

         for(cdm $$2 : $$1.d) {
            $$2.a($$0);
         }

         $$0.a($$1.c);
      }
   }
}
