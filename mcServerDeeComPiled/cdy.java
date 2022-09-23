import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class cdy<T extends cdb> implements cdr<T> {
   private final int v;
   private final cdy.a<T> w;

   public cdy(cdy.a<T> $$0, int $$1) {
      this.v = $$1;
      this.w = $$0;
   }

   public T b(abb $$0, JsonObject $$1) {
      String $$2 = alz.a($$1, "group", "");
      JsonElement $$3 = (JsonElement)(alz.d($$1, "ingredient") ? alz.u($$1, "ingredient") : alz.t($$1, "ingredient"));
      cdm $$4 = cdm.a($$3);
      String $$5 = alz.h($$1, "result");
      abb $$6 = new abb($$5);
      cax $$7 = new cax((cgw)hm.Y.b($$6).orElseThrow(() -> new IllegalStateException("Item: " + $$5 + " does not exist")));
      float $$8 = alz.a($$1, "experience", 0.0F);
      int $$9 = alz.a($$1, "cookingtime", this.v);
      return this.w.create($$0, $$2, $$4, $$7, $$8, $$9);
   }

   public T b(abb $$0, qx $$1) {
      String $$2 = $$1.q();
      cdm $$3 = cdm.b($$1);
      cax $$4 = $$1.p();
      float $$5 = $$1.readFloat();
      int $$6 = $$1.k();
      return this.w.create($$0, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(qx $$0, T $$1) {
      $$0.a($$1.c);
      $$1.d.a($$0);
      $$0.a($$1.e);
      $$0.writeFloat($$1.f);
      $$0.d($$1.g);
   }

   interface a<T extends cdb> {
      T create(abb var1, String var2, cdm var3, cax var4, float var5, int var6);
   }
}
