import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class pq extends pi<pr> {
   private static final int b = 192;
   public static final qe<pq> a = new qe.b<pq>() {
      public pq a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(192L);
         int $$3 = $$0.readInt();
         $$2.a(64L * (long)$$3);
         long[] $$4 = new long[$$3];

         for(int $$5 = 0; $$5 < $$3; ++$$5) {
            $$4[$$5] = $$0.readLong();
         }

         return new pq($$4);
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         int $$2 = $$0.readInt();
         long[] $$3 = new long[$$2];

         for(int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3[$$4] = $$0.readLong();
         }

         return $$1.a($$3);
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         $$0.skipBytes($$0.readInt() * 8);
      }

      @Override
      public String a() {
         return "LONG[]";
      }

      @Override
      public String b() {
         return "TAG_Long_Array";
      }
   };
   private long[] c;

   public pq(long[] $$0) {
      this.c = $$0;
   }

   public pq(LongSet $$0) {
      this.c = $$0.toLongArray();
   }

   public pq(List<Long> $$0) {
      this(a($$0));
   }

   private static long[] a(List<Long> $$0) {
      long[] $$1 = new long[$$0.size()];

      for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
         Long $$3 = (Long)$$0.get($$2);
         $$1[$$2] = $$3 == null ? 0L : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);

      for(long $$1 : this.c) {
         $$0.writeLong($$1);
      }

   }

   @Override
   public byte a() {
      return 12;
   }

   @Override
   public qe<pq> b() {
      return a;
   }

   @Override
   public String toString() {
      return this.e_();
   }

   public pq d() {
      long[] $$0 = new long[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new pq($$0);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pq && Arrays.equals(this.c, ((pq)$$0).c);
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   public long[] f() {
      return this.c;
   }

   public int size() {
      return this.c.length;
   }

   public pr a(int $$0) {
      return pr.a(this.c[$$0]);
   }

   public pr a(int $$0, pr $$1) {
      long $$2 = this.c[$$0];
      this.c[$$0] = $$1.e();
      return pr.a($$2);
   }

   public void b(int $$0, pr $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.e());
   }

   @Override
   public boolean a(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c[$$0] = ((pw)$$1).e();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c = ArrayUtils.add(this.c, $$0, ((pw)$$1).e());
         return true;
      } else {
         return false;
      }
   }

   public pr b(int $$0) {
      long $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return pr.a($$1);
   }

   @Override
   public byte e() {
      return 4;
   }

   public void clear() {
      this.c = new long[0];
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.c);
   }
}
