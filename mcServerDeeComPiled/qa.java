import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.util.Objects;

public class qa implements qc {
   private static final int b = 288;
   public static final qe<qa> a = new qe.b<qa>() {
      public qa a(DataInput $$0, int $$1, ps $$2) throws IOException {
         $$2.a(288L);
         String $$3 = $$0.readUTF();
         $$2.a((long)(16 * $$3.length()));
         return qa.a($$3);
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) throws IOException {
         return $$1.a($$0.readUTF());
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         qa.a($$0);
      }

      @Override
      public String a() {
         return "STRING";
      }

      @Override
      public String b() {
         return "TAG_String";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private static final qa c = new qa("");
   private static final char w = '"';
   private static final char x = '\'';
   private static final char y = '\\';
   private static final char z = '\u0000';
   private final String A;

   public static void a(DataInput $$0) throws IOException {
      $$0.skipBytes($$0.readUnsignedShort());
   }

   private qa(String $$0) {
      Objects.requireNonNull($$0, "Null string not allowed");
      this.A = $$0;
   }

   public static qa a(String $$0) {
      return $$0.isEmpty() ? c : new qa($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      try {
         $$0.writeUTF(this.A);
      } catch (UTFDataFormatException var3) {
         ad.a("Failed to write NBT String", var3);
         $$0.writeUTF("");
      }

   }

   @Override
   public byte a() {
      return 8;
   }

   @Override
   public qe<qa> b() {
      return a;
   }

   @Override
   public String toString() {
      return qc.super.e_();
   }

   public qa d() {
      return this;
   }

   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof qa && Objects.equals(this.A, ((qa)$$0).A);
      }
   }

   public int hashCode() {
      return this.A.hashCode();
   }

   @Override
   public String e_() {
      return this.A;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   public static String b(String $$0) {
      StringBuilder $$1 = new StringBuilder(" ");
      char $$2 = 0;

      for(int $$3 = 0; $$3 < $$0.length(); ++$$3) {
         char $$4 = $$0.charAt($$3);
         if ($$4 == '\\') {
            $$1.append('\\');
         } else if ($$4 == '"' || $$4 == '\'') {
            if ($$2 == 0) {
               $$2 = (char)($$4 == '"' ? 39 : 34);
            }

            if ($$2 == $$4) {
               $$1.append('\\');
            }
         }

         $$1.append($$4);
      }

      if ($$2 == 0) {
         $$2 = '"';
      }

      $$1.setCharAt(0, $$2);
      $$1.append($$2);
      return $$1.toString();
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a(this.A);
   }
}
