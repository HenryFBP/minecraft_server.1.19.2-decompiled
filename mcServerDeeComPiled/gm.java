import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class gm implements gf<IntegerArgumentType, gm.a> {
   public void a(gm.a $$0, qx $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.writeByte(gh.a($$2, $$3));
      if ($$2) {
         $$1.writeInt($$0.b);
      }

      if ($$3) {
         $$1.writeInt($$0.c);
      }

   }

   public gm.a a(qx $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = gh.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = gh.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new gm.a($$2, $$3);
   }

   public void a(gm.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }

   }

   public gm.a a(IntegerArgumentType $$0) {
      return new gm.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gf.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dl $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public gf<IntegerArgumentType, ?> a() {
         return gm.this;
      }
   }
}
