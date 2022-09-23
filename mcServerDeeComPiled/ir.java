import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class ir extends in<ir> implements im {
   private static final im.a<ir> a = new im.a<ir>() {
      public ir a(in<ir> $$0, StringReader $$1) {
         return (ir)$$0;
      }

      public ir a(in<ir> $$0, qx $$1) {
         return (ir)$$0;
      }
   };
   private final Codec<ir> b = Codec.unit(this::f);

   protected ir(boolean $$0) {
      super($$0, a);
   }

   public ir f() {
      return this;
   }

   @Override
   public Codec<ir> e() {
      return this.b;
   }

   @Override
   public void a(qx $$0) {
   }

   @Override
   public String a() {
      return hm.aa.b(this).toString();
   }
}
