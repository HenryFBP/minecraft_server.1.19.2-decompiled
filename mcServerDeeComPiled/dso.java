import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public abstract class dso extends dsv {
   protected final dsv[] c;
   private final dsn e;

   protected dso(dsv[] $$0, dux[] $$1) {
      super($$1);
      this.c = $$0;
      this.e = this.a($$0);
   }

   @Override
   public void a(dsl $$0) {
      super.a($$0);
      if (this.c.length == 0) {
         $$0.a("Empty children list");
      }

      for(int $$1 = 0; $$1 < this.c.length; ++$$1) {
         this.c[$$1].a($$0.b(".entry[" + $$1 + "]"));
      }

   }

   protected abstract dsn a(dsn[] var1);

   @Override
   public final boolean expand(dsd $$0, Consumer<dsu> $$1) {
      return !this.a($$0) ? false : this.e.expand($$0, $$1);
   }

   public static <T extends dso> dsv.b<T> a(final dso.a<T> $$0) {
      return new dsv.b<T>() {
         public void a(JsonObject $$0x, T $$1, JsonSerializationContext $$2) {
            $$0.add("children", $$2.serialize($$1.c));
         }

         public final T a(JsonObject $$0x, JsonDeserializationContext $$1, dux[] $$2) {
            dsv[] $$3 = alz.a($$0, "children", $$1, dsv[].class);
            return $$0.create($$3, $$2);
         }
      };
   }

   @FunctionalInterface
   public interface a<T extends dso> {
      T create(dsv[] var1, dux[] var2);
   }
}
