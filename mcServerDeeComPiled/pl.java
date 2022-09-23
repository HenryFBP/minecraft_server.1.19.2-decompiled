import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class pl implements qc {
   private static final int c = 64;
   public static final qe<pl> a = new qe<pl>() {
      public pl a(DataInput $$0, int $$1, ps $$2) {
         $$2.a(64L);
         return pl.b;
      }

      @Override
      public pz.b a(DataInput $$0, pz $$1) {
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1) {
      }

      @Override
      public void a(DataInput $$0) {
      }

      @Override
      public String a() {
         return "END";
      }

      @Override
      public String b() {
         return "TAG_End";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final pl b = new pl();

   private pl() {
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
   }

   @Override
   public byte a() {
      return 0;
   }

   @Override
   public qe<pl> b() {
      return a;
   }

   @Override
   public String toString() {
      return this.e_();
   }

   public pl d() {
      return this;
   }

   @Override
   public void a(qg $$0) {
      $$0.a(this);
   }

   @Override
   public pz.b a(pz $$0) {
      return $$0.a();
   }
}
