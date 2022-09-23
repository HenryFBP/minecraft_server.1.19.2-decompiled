import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class po extends pw {
   private static final int b = 96;
   public static final qe<po> a = new qe.a<po>() {
      public po a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(96L);
         return po.a($$0.readInt());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readInt());
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "INT";
      }

      @Override
      public String b() {
         return "TAG_Int";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final int c;

   po(int $$0) {
      this.c = $$0;
   }

   public static po a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? po.a.a[$$0 - -128] : new po($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c);
   }

   @Override
   public byte a() {
      return 3;
   }

   @Override
   public qe<po> b() {
      return a;
   }

   public po d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof po && this.c == ((po)$$0).c;
      }
   }

   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public long e() {
      return (long)this.c;
   }

   @Override
   public int f() {
      return this.c;
   }

   @Override
   public short g() {
      return (short)(this.c & 65535);
   }

   @Override
   public byte h() {
      return (byte)(this.c & 0xFF);
   }

   @Override
   public double i() {
      return (double)this.c;
   }

   @Override
   public float j() {
      return (float)this.c;
   }

   @Override
   public Number k() {
      return this.c;
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final po[] a = new po[1153];

      private a() {
      }

      static {
         for(int $$0 = 0; $$0 < a.length; ++$$0) {
            a[$$0] = new po(-128 + $$0);
         }

      }
   }
}
