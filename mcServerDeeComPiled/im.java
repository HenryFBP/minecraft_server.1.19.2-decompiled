import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public interface im {
   in<?> b();

   void a(qx var1);

   String a();

   @Deprecated
   public interface a<T extends im> {
      T b(in<T> var1, StringReader var2) throws CommandSyntaxException;

      T b(in<T> var1, qx var2);
   }
}
