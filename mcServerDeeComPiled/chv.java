import com.google.common.hash.Hashing;

public class chv {
   public static final int a = hl.a(8);
   private static final int b = 2;
   private static final int c = 4;
   private static final int d = 3;
   private final chv.a e;
   private final long f;

   public chv(chv.a $$0, long $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public static long a(long $$0) {
      return Hashing.sha256().hashLong($$0).asLong();
   }

   public chv a(chv.a $$0) {
      return new chv($$0, this.f);
   }

   public hc<cht> a(gt $$0) {
      int $$1 = $$0.u() - 2;
      int $$2 = $$0.v() - 2;
      int $$3 = $$0.w() - 2;
      int $$4 = $$1 >> 2;
      int $$5 = $$2 >> 2;
      int $$6 = $$3 >> 2;
      double $$7 = (double)($$1 & 3) / 4.0;
      double $$8 = (double)($$2 & 3) / 4.0;
      double $$9 = (double)($$3 & 3) / 4.0;
      int $$10 = 0;
      double $$11 = Double.POSITIVE_INFINITY;

      for(int $$12 = 0; $$12 < 8; ++$$12) {
         boolean $$13 = ($$12 & 4) == 0;
         boolean $$14 = ($$12 & 2) == 0;
         boolean $$15 = ($$12 & 1) == 0;
         int $$16 = $$13 ? $$4 : $$4 + 1;
         int $$17 = $$14 ? $$5 : $$5 + 1;
         int $$18 = $$15 ? $$6 : $$6 + 1;
         double $$19 = $$13 ? $$7 : $$7 - 1.0;
         double $$20 = $$14 ? $$8 : $$8 - 1.0;
         double $$21 = $$15 ? $$9 : $$9 - 1.0;
         double $$22 = a(this.f, $$16, $$17, $$18, $$19, $$20, $$21);
         if ($$11 > $$22) {
            $$10 = $$12;
            $$11 = $$22;
         }
      }

      int $$23 = ($$10 & 4) == 0 ? $$4 : $$4 + 1;
      int $$24 = ($$10 & 2) == 0 ? $$5 : $$5 + 1;
      int $$25 = ($$10 & 1) == 0 ? $$6 : $$6 + 1;
      return this.e.getNoiseBiome($$23, $$24, $$25);
   }

   public hc<cht> a(double $$0, double $$1, double $$2) {
      int $$3 = hl.a(ami.b($$0));
      int $$4 = hl.a(ami.b($$1));
      int $$5 = hl.a(ami.b($$2));
      return this.a($$3, $$4, $$5);
   }

   public hc<cht> b(gt $$0) {
      int $$1 = hl.a($$0.u());
      int $$2 = hl.a($$0.v());
      int $$3 = hl.a($$0.w());
      return this.a($$1, $$2, $$3);
   }

   public hc<cht> a(int $$0, int $$1, int $$2) {
      return this.e.getNoiseBiome($$0, $$1, $$2);
   }

   private static double a(long $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      long $$7 = ame.a($$0, (long)$$1);
      $$7 = ame.a($$7, (long)$$2);
      $$7 = ame.a($$7, (long)$$3);
      $$7 = ame.a($$7, (long)$$1);
      $$7 = ame.a($$7, (long)$$2);
      $$7 = ame.a($$7, (long)$$3);
      double $$8 = b($$7);
      $$7 = ame.a($$7, $$0);
      double $$9 = b($$7);
      $$7 = ame.a($$7, $$0);
      double $$10 = b($$7);
      return ami.m($$6 + $$10) + ami.m($$5 + $$9) + ami.m($$4 + $$8);
   }

   private static double b(long $$0) {
      double $$1 = (double)Math.floorMod($$0 >> 24, 1024) / 1024.0;
      return ($$1 - 0.5) * 0.9;
   }

   public interface a {
      hc<cht> getNoiseBiome(int var1, int var2, int var3);
   }
}
