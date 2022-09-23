import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ph extends pw {
   private static final int w = 72;
   public static final qe<ph> a = new qe.a<ph>() {
      public ph a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(72L);
         return ph.a($$0.readByte());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readByte());
      }

      @Override
      public int c() {
         return 1;
      }

      @Override
      public String a() {
         return "BYTE";
      }

      @Override
      public String b() {
         return "TAG_Byte";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final ph b = a((byte)0);
   public static final ph c = a((byte)1);
   private final byte x;

   ph(byte $$0) {
      this.x = $$0;
   }

   public static ph a(byte $$0) {
      return ph.a.a[128 + $$0];
   }

   public static ph a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.x);
   }

   @Override
   public byte a() {
      return 1;
   }

   @Override
   public qe<ph> b() {
      return a;
   }

   public ph d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof ph && this.x == ((ph)$$0).x;
      }
   }

   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public long e() {
      return (long)this.x;
   }

   @Override
   public int f() {
      return this.x;
   }

   @Override
   public short g() {
      return (short)this.x;
   }

   @Override
   public byte h() {
      return this.x;
   }

   @Override
   public double i() {
      return (double)this.x;
   }

   @Override
   public float j() {
      return (float)this.x;
   }

   @Override
   public Number k() {
      return this.x;
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final ph[] a = new ph[256];

      private a() {
      }

      static {
         for(int $$0 = 0; $$0 < a.length; ++$$0) {
            a[$$0] = new ph((byte)($$0 - 128));
         }

      }
   }
}
