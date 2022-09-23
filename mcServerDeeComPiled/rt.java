import java.util.BitSet;
import javax.annotation.Nullable;

public class rt {
   public static final rt a = new rt(new BitSet(0), rt.a.b);
   public static final rt b = new rt(new BitSet(0), rt.a.a);
   private static final char c = '#';
   private final BitSet d;
   private final rt.a e;

   private rt(BitSet $$0, rt.a $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public rt(int $$0) {
      this(new BitSet($$0), rt.a.c);
   }

   public static rt a(qx $$0) {
      rt.a $$1 = $$0.a(rt.a.class);

      return switch($$1) {
         case a -> b;
         case b -> a;
         case c -> new rt($$0.w(), rt.a.c);
         default -> throw new IncompatibleClassChangeError();
      };
   }

   public static void a(qx $$0, rt $$1) {
      $$0.a((Enum<?>)$$1.e);
      if ($$1.e == rt.a.c) {
         $$0.a($$1.d);
      }

   }

   public void a(int $$0) {
      this.d.set($$0);
   }

   @Nullable
   public String a(String $$0) {
      return switch(this.e) {
         case a -> $$0;
         case b -> String;
         case c -> {
            char[] $$1 = $$0.toCharArray();

            for(int $$2 = 0; $$2 < $$1.length && $$2 < this.d.length(); ++$$2) {
               if (this.d.get($$2)) {
                  $$1[$$2] = '#';
               }
            }

            yield new String($$1);
         }
         default -> throw new IncompatibleClassChangeError();
      };
   }

   @Nullable
   public rq a(ri $$0) {
      String $$1 = $$0.b();
      return ad.a(this.a($$1), rq::b);
   }

   public boolean a() {
      return this.e == rt.a.a;
   }

   public boolean b() {
      return this.e == rt.a.b;
   }

   static enum a {
      a,
      b,
      c;
   }
}
