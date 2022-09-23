import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dh {
   public static final dh a = new dh(null, null);
   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(rq.c("argument.range.ints"));
   @Nullable
   private final Float c;
   @Nullable
   private final Float d;

   public dh(@Nullable Float $$0, @Nullable Float $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public static dh a(float $$0) {
      return new dh($$0, $$0);
   }

   public static dh a(float $$0, float $$1) {
      return new dh($$0, $$1);
   }

   public static dh b(float $$0) {
      return new dh($$0, null);
   }

   public static dh c(float $$0) {
      return new dh(null, $$0);
   }

   public boolean d(float $$0) {
      if (this.c != null && this.d != null && this.c > this.d && this.c > $$0 && this.d < $$0) {
         return false;
      } else if (this.c != null && this.c > $$0) {
         return false;
      } else {
         return this.d == null || !(this.d < $$0);
      }
   }

   public boolean a(double $$0) {
      if (this.c != null && this.d != null && this.c > this.d && (double)(this.c * this.c) > $$0 && (double)(this.d * this.d) < $$0) {
         return false;
      } else if (this.c != null && (double)(this.c * this.c) > $$0) {
         return false;
      } else {
         return this.d == null || !((double)(this.d * this.d) < $$0);
      }
   }

   @Nullable
   public Float a() {
      return this.c;
   }

   @Nullable
   public Float b() {
      return this.d;
   }

   public JsonElement c() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else if (this.c != null && this.d != null && this.c.equals(this.d)) {
         return new JsonPrimitive(this.c);
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            $$0.addProperty("min", this.c);
         }

         if (this.d != null) {
            $$0.addProperty("max", this.c);
         }

         return $$0;
      }
   }

   public static dh a(@Nullable JsonElement $$0) {
      if ($$0 == null || $$0.isJsonNull()) {
         return a;
      } else if (alz.b($$0)) {
         float $$1 = alz.e($$0, "value");
         return new dh($$1, $$1);
      } else {
         JsonObject $$2 = alz.m($$0, "value");
         Float $$3 = $$2.has("min") ? alz.l($$2, "min") : null;
         Float $$4 = $$2.has("max") ? alz.l($$2, "max") : null;
         return new dh($$3, $$4);
      }
   }

   public static dh a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      return a($$0, $$1, $$0x -> $$0x);
   }

   public static dh a(StringReader $$0, boolean $$1, Function<Float, Float> $$2) throws CommandSyntaxException {
      if (!$$0.canRead()) {
         throw cj.a.createWithContext($$0);
      } else {
         int $$3 = $$0.getCursor();
         Float $$4 = a(b($$0, $$1), $$2);
         Float $$5;
         if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
            $$0.skip();
            $$0.skip();
            $$5 = a(b($$0, $$1), $$2);
            if ($$4 == null && $$5 == null) {
               $$0.setCursor($$3);
               throw cj.a.createWithContext($$0);
            }
         } else {
            if (!$$1 && $$0.canRead() && $$0.peek() == '.') {
               $$0.setCursor($$3);
               throw b.createWithContext($$0);
            }

            $$5 = $$4;
         }

         if ($$4 == null && $$5 == null) {
            $$0.setCursor($$3);
            throw cj.a.createWithContext($$0);
         } else {
            return new dh($$4, $$5);
         }
      }
   }

   @Nullable
   private static Float b(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();

      while($$0.canRead() && c($$0, $$1)) {
         $$0.skip();
      }

      String $$3 = $$0.getString().substring($$2, $$0.getCursor());
      if ($$3.isEmpty()) {
         return null;
      } else {
         try {
            return Float.parseFloat($$3);
         } catch (NumberFormatException var5) {
            if ($$1) {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext($$0, $$3);
            } else {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext($$0, $$3);
            }
         }
      }
   }

   private static boolean c(StringReader $$0, boolean $$1) {
      char $$2 = $$0.peek();
      if (($$2 < '0' || $$2 > '9') && $$2 != '-') {
         if ($$1 && $$2 == '.') {
            return !$$0.canRead(2) || $$0.peek(1) != '.';
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Nullable
   private static Float a(@Nullable Float $$0, Function<Float, Float> $$1) {
      return $$0 == null ? null : (Float)$$1.apply($$0);
   }
}
