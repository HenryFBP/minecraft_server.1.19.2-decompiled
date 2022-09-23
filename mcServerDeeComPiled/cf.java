import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class cf implements bp {
   private static final String b = "blocks_set_on_fire";
   private static final String c = "entity_struck";
   private final cj.d d;
   private final bo e;

   private cf(cj.d $$0, bo $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public static cf a(cj.d $$0) {
      return new cf($$0, bo.a);
   }

   public static cf a(JsonObject $$0) {
      return new cf(cj.d.a($$0.get("blocks_set_on_fire")), bo.a($$0.get("entity_struck")));
   }

   @Override
   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.add("blocks_set_on_fire", this.d.d());
      $$0.add("entity_struck", this.e.a());
      return $$0;
   }

   @Override
   public bp.a c() {
      return bp.b.b;
   }

   @Override
   public boolean a(bbn $$0, agg $$1, @Nullable dwq $$2) {
      if (!($$0 instanceof bcb)) {
         return false;
      } else {
         bcb $$3 = (bcb)$$0;
         return this.d.d($$3.i()) && (this.e == bo.a || $$3.j().anyMatch($$2x -> this.e.a($$1, $$2, $$2x)));
      }
   }
}
