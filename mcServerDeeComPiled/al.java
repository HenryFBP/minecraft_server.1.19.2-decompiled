import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;

public class al {
   private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   @Nullable
   private Date b;

   public boolean a() {
      return this.b != null;
   }

   public void b() {
      this.b = new Date();
   }

   public void c() {
      this.b = null;
   }

   @Nullable
   public Date d() {
      return this.b;
   }

   public String toString() {
      return "CriterionProgress{obtained=" + (this.b == null ? "false" : this.b) + "}";
   }

   public void a(qx $$0) {
      $$0.a(this.b, qx::a);
   }

   public JsonElement e() {
      return (JsonElement)(this.b != null ? new JsonPrimitive(a.format(this.b)) : JsonNull.INSTANCE);
   }

   public static al b(qx $$0) {
      al $$1 = new al();
      $$1.b = $$0.c(qx::s);
      return $$1;
   }

   public static al a(String $$0) {
      al $$1 = new al();

      try {
         $$1.b = a.parse($$0);
         return $$1;
      } catch (ParseException var3) {
         throw new JsonSyntaxException("Invalid datetime: " + $$0, var3);
      }
   }
}
