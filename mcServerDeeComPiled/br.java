import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class br<V> {
   private static final String a = "variant";
   final hm<V> b;
   final Function<bbn, Optional<V>> c;
   final bp.a d;

   public static <V> br<V> a(hm<V> $$0, Function<bbn, Optional<V>> $$1) {
      return new br<>($$0, $$1);
   }

   private br(hm<V> $$0, Function<bbn, Optional<V>> $$1) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$1x -> {
         String $$2 = alz.h($$1x, "variant");
         V $$3 = $$0.a(abb.a($$2));
         if ($$3 == null) {
            throw new JsonSyntaxException("Unknown variant: " + $$2);
         } else {
            return this.a($$3);
         }
      };
   }

   public bp.a a() {
      return this.d;
   }

   public bp a(final V $$0) {
      return new bp() {
         @Override
         public boolean a(bbn $$0x, agg $$1, @Nullable dwq $$2) {
            return ((Optional)br.this.c.apply($$0)).filter($$1x -> $$1x.equals($$0)).isPresent();
         }

         @Override
         public JsonObject a() {
            JsonObject $$0 = new JsonObject();
            $$0.addProperty("variant", br.this.b.b($$0).toString());
            return $$0;
         }

         @Override
         public bp.a c() {
            return br.this.d;
         }
      };
   }
}
