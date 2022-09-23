import java.io.DataOutput;
import java.io.IOException;

public interface qc {
   int d = 64;
   int e = 96;
   int f = 32;
   int g = 224;
   byte h = 0;
   byte i = 1;
   byte j = 2;
   byte k = 3;
   byte l = 4;
   byte m = 5;
   byte n = 6;
   byte o = 7;
   byte p = 8;
   byte q = 9;
   byte r = 10;
   byte s = 11;
   byte t = 12;
   byte u = 99;
   int v = 512;

   void a(DataOutput var1) throws IOException;

   String toString();

   byte a();

   qe<?> b();

   qc c();

   default String e_() {
      return new qb().a(this);
   }

   void a(qg var1);

   pz.b a(pz var1);

   default void b(pz $$0) {
      pz.b $$1 = $$0.b(this.b());
      if ($$1 == pz.b.a) {
         this.a($$0);
      }

   }
}
