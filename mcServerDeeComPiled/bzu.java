import java.util.List;

public interface bzu {
   String l_ = "color";
   String m_ = "display";
   int n_ = 10511680;

   default boolean a(cax $$0) {
      pj $$1 = $$0.b("display");
      return $$1 != null && $$1.b("color", 99);
   }

   default int d_(cax $$0) {
      pj $$1 = $$0.b("display");
      return $$1 != null && $$1.b("color", 99) ? $$1.h("color") : 10511680;
   }

   default void e_(cax $$0) {
      pj $$1 = $$0.b("display");
      if ($$1 != null && $$1.e("color")) {
         $$1.r("color");
      }

   }

   default void a(cax $$0, int $$1) {
      $$0.a("display").a("color", $$1);
   }

   static cax a(cax $$0, List<bzr> $$1) {
      cax $$2 = cax.b;
      int[] $$3 = new int[3];
      int $$4 = 0;
      int $$5 = 0;
      bzu $$6 = null;
      cat $$7 = $$0.c();
      if ($$7 instanceof bzu) {
         $$6 = (bzu)$$7;
         $$2 = $$0.o();
         $$2.e(1);
         if ($$6.a($$0)) {
            int $$8 = $$6.d_($$2);
            float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0F;
            float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0F;
            float $$11 = (float)($$8 & 0xFF) / 255.0F;
            $$4 += (int)(Math.max($$9, Math.max($$10, $$11)) * 255.0F);
            $$3[0] += (int)($$9 * 255.0F);
            $$3[1] += (int)($$10 * 255.0F);
            $$3[2] += (int)($$11 * 255.0F);
            ++$$5;
         }

         for(bzr $$12 : $$1) {
            float[] $$13 = $$12.d().d();
            int $$14 = (int)($$13[0] * 255.0F);
            int $$15 = (int)($$13[1] * 255.0F);
            int $$16 = (int)($$13[2] * 255.0F);
            $$4 += Math.max($$14, Math.max($$15, $$16));
            $$3[0] += $$14;
            $$3[1] += $$15;
            $$3[2] += $$16;
            ++$$5;
         }
      }

      if ($$6 == null) {
         return cax.b;
      } else {
         int $$17 = $$3[0] / $$5;
         int $$18 = $$3[1] / $$5;
         int $$19 = $$3[2] / $$5;
         float $$20 = (float)$$4 / (float)$$5;
         float $$21 = (float)Math.max($$17, Math.max($$18, $$19));
         $$17 = (int)((float)$$17 * $$20 / $$21);
         $$18 = (int)((float)$$18 * $$20 / $$21);
         $$19 = (int)((float)$$19 * $$20 / $$21);
         int var26 = ($$17 << 8) + $$18;
         var26 = (var26 << 8) + $$19;
         $$6.a($$2, var26);
         return $$2;
      }
   }
}
