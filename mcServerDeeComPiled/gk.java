import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class gk implements gf<DoubleArgumentType, gk.a> {
   public void a(gk.a $$0, qx $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.writeByte(gh.a($$2, $$3));
      if ($$2) {
         $$1.writeDouble($$0.b);
      }

      if ($$3) {
         $$1.writeDouble($$0.c);
      }

   }

   public gk.a a(qx $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = gh.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = gh.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new gk.a($$2, $$3);
   }

   public void a(gk.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }

   }

   public gk.a a(DoubleArgumentType $$0) {
      return new gk.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gf.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dl $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public gf<DoubleArgumentType, ?> a() {
         return gk.this;
      }
   }
}
