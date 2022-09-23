import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class dta extends dsx {
   final akz<cat> i;
   final boolean j;

   dta(akz<cat> $$0, boolean $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
      super($$2, $$3, $$4, $$5);
      this.i = $$0;
      this.j = $$1;
   }

   @Override
   public dsw a() {
      return dst.e;
   }

   @Override
   public void a(Consumer<cax> $$0, dsd $$1) {
      hm.Y.d(this.i).forEach($$1x -> $$0.accept(new cax($$1x)));
   }

   private boolean a(dsd $$0, Consumer<dsu> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for(final hc<cat> $$2 : hm.Y.d(this.i)) {
            $$1.accept(new dsx.c() {
               @Override
               public void a(Consumer<cax> $$0, dsd $$1) {
                  $$0.accept(new cax($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(dsd $$0, Consumer<dsu> $$1) {
      return this.j ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static dsx.a<?> a(akz<cat> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new dta($$0, false, $$1, $$2, $$3, $$4));
   }

   public static dsx.a<?> b(akz<cat> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new dta($$0, true, $$1, $$2, $$3, $$4));
   }

   public static class a extends dsx.e<dta> {
      public void a(JsonObject $$0, dta $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.i.b().toString());
         $$0.addProperty("expand", $$1.j);
      }

      protected dta a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, dux[] $$4, dto[] $$5) {
         abb $$6 = new abb(alz.h($$0, "name"));
         akz<cat> $$7 = akz.a(hm.k, $$6);
         boolean $$8 = alz.j($$0, "expand");
         return new dta($$7, $$8, $$2, $$3, $$4, $$5);
      }
   }
}
