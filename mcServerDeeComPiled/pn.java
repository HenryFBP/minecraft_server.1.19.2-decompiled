import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class pn extends pi<po> {
   private static final int b = 192;
   public static final qe<pn> a = new qe.b<pn>() {
      public pn a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(192L);
         int $$3 = $$0.readInt();
         $$2.a(32L * (long)$$3);
         int[] $$4 = new int[$$3];

         for(int $$5 = 0; $$5 < $$3; ++$$5) {
            $$4[$$5] = $$0.readInt();
         }

         return new pn($$4);
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         int $$2 = $$0.readInt();
         int[] $$3 = new int[$$2];

         for(int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3[$$4] = $$0.readInt();
         }

         return $$1.a($$3);
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         $$0.skipBytes($$0.readInt() * 4);
      }

      @Override
      public String a() {
         return "INT[]";
      }

      @Override
      public String b() {
         return "TAG_Int_Array";
      }
   };
   private int[] c;

   public pn(int[] $$0) {
      this.c = $$0;
   }

   public pn(List<Integer> $$0) {
      this(a($$0));
   }

   private static int[] a(List<Integer> $$0) {
      int[] $$1 = new int[$$0.size()];

      for(int $$2 = 0; $$2 < $$0.size(); ++$$2) {
         Integer $$3 = (Integer)$$0.get($$2);
         $$1[$$2] = $$3 == null ? 0 : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);

      for(int $$1 : this.c) {
         $$0.writeInt($$1);
      }

   }

   @Override
   public byte a() {
      return 11;
   }

   @Override
   public qe<pn> b() {
      return a;
   }

   @Override
   public String toString() {
      return this.e_();
   }

   public pn d() {
      int[] $$0 = new int[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new pn($$0);
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof pn && Arrays.equals(this.c, ((pn)$$0).c);
      }
   }

   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   public int[] f() {
      return this.c;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   public int size() {
      return this.c.length;
   }

   public po a(int $$0) {
      return po.a(this.c[$$0]);
   }

   public po a(int $$0, po $$1) {
      int $$2 = this.c[$$0];
      this.c[$$0] = $$1.f();
      return po.a($$2);
   }

   public void b(int $$0, po $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.f());
   }

   @Override
   public boolean a(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c[$$0] = ((pw)$$1).f();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, qc $$1) {
      if ($$1 instanceof pw) {
         this.c = ArrayUtils.add(this.c, $$0, ((pw)$$1).f());
         return true;
      } else {
         return false;
      }
   }

   public po b(int $$0) {
      int $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return po.a($$1);
   }

   @Override
   public byte e() {
      return 3;
   }

   public void clear() {
      this.c = new int[0];
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.c);
   }
}
