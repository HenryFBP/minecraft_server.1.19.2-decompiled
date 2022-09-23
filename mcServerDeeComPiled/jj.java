import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class jj implements iz {
   private final iy c;

   public jj(iy $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ix $$0) throws IOException {
      JsonObject $$1 = new JsonObject();

      for(cjt $$2 : hm.V) {
         abb $$3 = hm.V.b($$2);
         JsonObject $$4 = new JsonObject();
         cvp<cjt, cvo> $$5 = $$2.k();
         if (!$$5.d().isEmpty()) {
            JsonObject $$6 = new JsonObject();

            for(cwr<?> $$7 : $$5.d()) {
               JsonArray $$8 = new JsonArray();

               for(Comparable<?> $$9 : $$7.a()) {
                  $$8.add(ad.a($$7, $$9));
               }

               $$6.add($$7.f(), $$8);
            }

            $$4.add("properties", $$6);
         }

         JsonArray $$10 = new JsonArray();

         JsonObject $$12;
         for(UnmodifiableIterator var17 = $$5.a().iterator(); var17.hasNext(); $$10.add($$12)) {
            cvo $$11 = (cvo)var17.next();
            $$12 = new JsonObject();
            JsonObject $$13 = new JsonObject();

            for(cwr<?> $$14 : $$5.d()) {
               $$13.addProperty($$14.f(), ad.a($$14, $$11.c($$14)));
            }

            if ($$13.size() > 0) {
               $$12.add("properties", $$13);
            }

            $$12.addProperty("id", cjt.i($$11));
            if ($$11 == $$2.m()) {
               $$12.addProperty("default", true);
            }
         }

         $$4.add("states", $$10);
         $$1.add($$3.toString(), $$4);
      }

      Path $$15 = this.c.a(iy.b.c).resolve("blocks.json");
      iz.a($$0, $$1, $$15);
   }

   @Override
   public String a() {
      return "Block List";
   }
}
