import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.file.Path;

public class jl implements iz {
   private final iy c;

   public jl(iy $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ix $$0) throws IOException {
      JsonObject $$1 = new JsonObject();
      hm.d.g().forEach($$1x -> $$1.add($$1x.g().a().toString(), a((hm)$$1x.a())));
      Path $$2 = this.c.a(iy.b.c).resolve("registries.json");
      iz.a($$0, $$1, $$2);
   }

   private static <T> JsonElement a(hm<T> $$0) {
      JsonObject $$1 = new JsonObject();
      if ($$0 instanceof gx) {
         abb $$2 = ((gx)$$0).a();
         $$1.addProperty("default", $$2.toString());
      }

      int $$3 = hm.d.a($$0);
      $$1.addProperty("protocol_id", $$3);
      JsonObject $$4 = new JsonObject();
      $$0.g().forEach($$2 -> {
         T $$3x = $$2.a();
         int $$4x = $$0.a((T)$$3x);
         JsonObject $$5 = new JsonObject();
         $$5.addProperty("protocol_id", $$4x);
         $$4.add($$2.g().a().toString(), $$5);
      });
      $$1.add("entries", $$4);
      return $$1;
   }

   @Override
   public String a() {
      return "Registry Dump";
   }
}
