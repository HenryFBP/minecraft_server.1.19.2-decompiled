import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class pg extends pi<ph> {
   private static final int b = 192;
   public static final qe<pg> a = new qe.b<pg>() {
      public pg a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(192L);
         int $$3 = $$0.readInt();
         $$2.a(8L * (long)$$3);
         byte[] $$4 = new byte[$$3];
         $$0.readFully($$4);
         return new pg($$4);
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         int $$2 = $$0.readInt();
         byte[] $$3 = new byte[$$2];
         $$0.readFully($$3);
         return $$1.a($$3);
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         $$0.skipBytes($$0.readInt() * 1);
      }

      @Override
      public String a() {
         return "BYTE[]";
      }

      @Override
      public String b() {
         return "TAG_Byte_Array";
      }
   };
   private byte[] c;

   public pg(byte[] $$0) {
      this.c = $$0;
   }

   public pg(List<Byte> $$0) {
      this(a($$0));
   }

   private static byte[] a(List<Byte> $$0) {
      byte[] $$1 = new byte[$$0.size()];

      for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
         Byte $$3 = (Byte)$$0.get($$2);
         $$1[$$2] = $$3 == null ? 0 : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);
      $$0.write(this.c);
   }

   @Override
   public byte a() {
      return 7;
   }

   @Override
   public qe<pg> b() {
      return a;
   }

   @Override
   public String toString() {
      return this.e_();
   }

   @Override
   public qc c() {
      byte[] $$0 = new byte[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new pg($$0);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pg && Arrays.equals(this.c, ((pg)$$0).c);
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   public byte[] d() {
      return this.c;
   }

   public int size() {
      return this.c.length;
   }

   public ph a(int $$0) {
      return ph.a(this.c[$$0]);
   }

   public ph a(int $$0, ph $$1) {
      byte $$2 = this.c[$$0];
      this.c[$$0] = $$1.h();
      return ph.a($$2);
   }

   public void b(int $$0, ph $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.h());
   }

   @Override
   public boolean a(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c[$$0] = ((pw)$$1).h();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c = ArrayUtils.add(this.c, $$0, ((pw)$$1).h());
         return true;
      } else {
         return false;
      }
   }

   public ph b(int $$0) {
      byte $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return ph.a($$1);
   }

   @Override
   public byte e() {
      return 1;
   }

   public void clear() {
      this.c = new byte[0];
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.c);
   }
}
