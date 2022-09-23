import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class pm extends pw {
   private static final int c = 96;
   public static final pm a = new pm(0.0F);
   public static final qe<pm> b = new qe.a<pm>() {
      public pm a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(96L);
         return pm.a($$0.readFloat());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readFloat());
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final float w;

   private pm(float $$0) {
      this.w = $$0;
   }

   public static pm a(float $$0) {
      return $$0 == 0.0F ? a : new pm($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.w);
   }

   @Override
   public byte a() {
      return 5;
   }

   @Override
   public qe<pm> b() {
      return b;
   }

   public pm d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pm && this.w == ((pm)$$0).w;
      }
   }

   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public long e() {
      return (long)this.w;
   }

   @Override
   public int f() {
      return ami.d(this.w);
   }

   @Override
   public short g() {
      return (short)(ami.d(this.w) & 65535);
   }

   @Override
   public byte h() {
      return (byte)(ami.d(this.w) & 0xFF);
   }

   @Override
   public double i() {
      return (double)this.w;
   }

   @Override
   public float j() {
      return this.w;
   }

   @Override
   public Number k() {
      return this.w;
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.w);
   }
}
