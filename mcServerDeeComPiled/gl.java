import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class gl implements gf<FloatArgumentType, gl.a> {
   public void a(gl.a $$0, qx $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.writeByte(gh.a($$2, $$3));
      if ($$2) {
         $$1.writeFloat($$0.b);
      }

      if ($$3) {
         $$1.writeFloat($$0.c);
      }

   }

   public gl.a a(qx $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = gh.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = gh.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new gl.a($$2, $$3);
   }

   public void a(gl.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }

   }

   public gl.a a(FloatArgumentType $$0) {
      return new gl.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gf.a<FloatArgumentType> {
      final float b;
      final float c;

      a(float $$1, float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(dl $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public gf<FloatArgumentType, ?> a() {
         return gl.this;
      }
   }
}
