import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface gf<A extends ArgumentType<?>, T extends gf.a<A>> {
   void a(T var1, qx var2);

   T b(qx var1);

   void a(T var1, JsonObject var2);

   T a(A var1);

   public interface a<A extends ArgumentType<?>> {
      A b(dl var1);

      gf<A, ?> a();
   }
}
