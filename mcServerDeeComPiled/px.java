import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class px extends pw {
   private static final int b = 80;
   public static final qe<px> a = new qe.a<px>() {
      public px a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(80L);
         return px.a($$0.readShort());
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readShort());
      }

      @Override
      public int c() {
         return 2;
      }

      @Override
      public String a() {
         return "SHORT";
      }

      @Override
      public String b() {
         return "TAG_Short";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final short c;

   px(short $$0) {
      this.c = $$0;
   }

   public static px a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? px.a.a[$$0 - -128] : new px($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.c);
   }

   @Override
   public byte a() {
      return 2;
   }

   @Override
   public qe<px> b() {
      return a;
   }

   public px d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof px && this.c == ((px)$$0).c;
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
      return this.c;
   }

   @Override
   public byte h() {
      return (byte)(this.c & 255);
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
      static final px[] a = new px[1153];

      private a() {
      }

      static {
         for(int $$0 = 0; $$0 < a.length; ++$$0) {
            a[$$0] = new px((short)(-128 + $$0));
         }

      }
   }
}
