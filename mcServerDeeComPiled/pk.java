import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class pk extends pw {
   private static final int c = 128;
   public static final pk a = new pk(0.0);
   public static final qe<pk> b = new qe.a<pk>() {
      public pk a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(128L);
         return pk.a($$0.readDouble());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readDouble());
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "DOUBLE";
      }

      @Override
      public String b() {
         return "TAG_Double";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final double w;

   private pk(double $$0) {
      this.w = $$0;
   }

   public static pk a(double $$0) {
      return $$0 == 0.0 ? a : new pk($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeDouble(this.w);
   }

   @Override
   public byte a() {
      return 6;
   }

   @Override
   public qe<pk> b() {
      return b;
   }

   public pk d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pk && this.w == ((pk)$$0).w;
      }
   }

   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public long e() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int f() {
      return ami.b(this.w);
   }

   @Override
   public short g() {
      return (short)(ami.b(this.w) & 65535);
   }

   @Override
   public byte h() {
      return (byte)(ami.b(this.w) & 0xFF);
   }

   @Override
   public double i() {
      return this.w;
   }

   @Override
   public float j() {
      return (float)this.w;
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
