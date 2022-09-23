import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;

public class cl {
   public static final cl a = new cl(null);
   @Nullable
   private final pj b;

   public cl(@Nullable pj $$0) {
      this.b = $$0;
   }

   public boolean a(cax $$0) {
      return this == a ? true : this.a($$0.u());
   }

   public boolean a(bbn $$0) {
      return this == a ? true : this.a(b($$0));
   }

   public boolean a(@Nullable qc $$0) {
      if ($$0 == null) {
         return this == a;
      } else {
         return this.b == null || pv.a(this.b, $$0, true);
      }
   }

   public JsonElement a() {
      return (JsonElement)(this != a && this.b != null ? new JsonPrimitive(this.b.toString()) : JsonNull.INSTANCE);
   }

   public static cl a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         pj $$1;
         try {
            $$1 = qd.a(alz.a($$0, "nbt"));
         } catch (CommandSyntaxException var3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3.getMessage());
         }

         return new cl($$1);
      } else {
         return a;
      }
   }

   public static pj b(bbn $$0) {
      pj $$1 = $$0.f(new pj());
      if ($$0 instanceof buc) {
         cax $$2 = ((buc)$$0).fA().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", (qc)$$2.b(new pj()));
         }
      }

      return $$1;
   }
}
