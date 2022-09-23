import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;

public class dut implements dux {
   static final dut a = new dut();

   private dut() {
   }

   @Override
   public duy a() {
      return duz.k;
   }

   @Override
   public Set<dui<?>> b() {
      return ImmutableSet.of(dul.j);
   }

   public boolean a(dsd $$0) {
      Float $$1 = $$0.c(dul.j);
      if ($$1 != null) {
         amn $$2 = $$0.a();
         float $$3 = 1.0F / $$1;
         return $$2.i() <= $$3;
      } else {
         return true;
      }
   }

   public static dux.a c() {
      return () -> a;
   }

   public static class a implements dsj<dut> {
      public void a(JsonObject $$0, dut $$1, JsonSerializationContext $$2) {
      }

      public dut b(JsonObject $$0, JsonDeserializationContext $$1) {
         return dut.a;
      }
   }
}
