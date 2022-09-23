import com.mojang.serialization.Codec;
import java.util.List;

public enum cpw implements amw {
   a("none", f.a),
   b("clockwise_90", f.u),
   c("180", f.c),
   d("counterclockwise_90", f.v);

   public static final Codec<cpw> e = amw.a(cpw::values);
   private final String f;
   private final f g;

   private cpw(String $$0, f $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public cpw a(cpw $$0) {
      switch($$0) {
         case c:
            switch(this) {
               case a:
                  return c;
               case b:
                  return d;
               case c:
                  return a;
               case d:
                  return b;
            }
         case d:
            switch(this) {
               case a:
                  return d;
               case b:
                  return a;
               case c:
                  return b;
               case d:
                  return c;
            }
         case b:
            switch(this) {
               case a:
                  return b;
               case b:
                  return c;
               case c:
                  return d;
               case d:
                  return a;
            }
         default:
            return this;
      }
   }

   public f a() {
      return this.g;
   }

   public gy a(gy $$0) {
      if ($$0.o() == gy.a.b) {
         return $$0;
      } else {
         switch(this) {
            case b:
               return $$0.h();
            case c:
               return $$0.g();
            case d:
               return $$0.i();
            default:
               return $$0;
         }
      }
   }

   public int a(int $$0, int $$1) {
      switch(this) {
         case b:
            return ($$0 + $$1 / 4) % $$1;
         case c:
            return ($$0 + $$1 / 2) % $$1;
         case d:
            return ($$0 + $$1 * 3 / 4) % $$1;
         default:
            return $$0;
      }
   }

   public static cpw a(amn $$0) {
      return ad.a(values(), $$0);
   }

   public static List<cpw> b(amn $$0) {
      return ad.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.f;
   }
}
