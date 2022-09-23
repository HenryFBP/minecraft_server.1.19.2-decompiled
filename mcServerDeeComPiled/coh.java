import com.mojang.serialization.Codec;

public enum coh implements amw {
   a("none", f.a),
   b("left_right", f.B),
   c("front_back", f.z);

   public static final Codec<coh> d = amw.a(coh::values);
   private final String e;
   private final rq f;
   private final f g;

   private coh(String $$0, f $$1) {
      this.e = $$0;
      this.f = rq.c("mirror." + $$0);
      this.g = $$1;
   }

   public int a(int $$0, int $$1) {
      int $$2 = $$1 / 2;
      int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
      switch(this) {
         case c:
            return ($$1 - $$3) % $$1;
         case b:
            return ($$2 - $$3 + $$1) % $$1;
         default:
            return $$0;
      }
   }

   public cpw a(gy $$0) {
      gy.a $$1 = $$0.o();
      return (this != b || $$1 != gy.a.c) && (this != c || $$1 != gy.a.a) ? cpw.a : cpw.c;
   }

   public gy b(gy $$0) {
      if (this == c && $$0.o() == gy.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == gy.a.c ? $$0.g() : $$0;
      }
   }

   public f a() {
      return this.g;
   }

   public rq b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
