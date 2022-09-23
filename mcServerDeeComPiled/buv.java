import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class buv {
   public static dwo a(bbn $$0, Predicate<bbn> $$1) {
      dwq $$2 = $$0.dd();
      cgx $$3 = $$0.s;
      dwq $$4 = $$0.cY();
      dwq $$5 = $$4.e($$2);
      dwo $$6 = $$3.a(new cgg($$4, $$5, cgg.a.a, cgg.b.a, $$0));
      if ($$6.c() != dwo.a.a) {
         $$5 = $$6.e();
      }

      dwo $$7 = a($$3, $$0, $$4, $$5, $$0.cy().b($$0.dd()).g(1.0), $$1);
      if ($$7 != null) {
         $$6 = $$7;
      }

      return $$6;
   }

   @Nullable
   public static dwn a(bbn $$0, dwq $$1, dwq $$2, dwl $$3, Predicate<bbn> $$4, double $$5) {
      cgx $$6 = $$0.s;
      double $$7 = $$5;
      bbn $$8 = null;
      dwq $$9 = null;

      for(bbn $$10 : $$6.a($$0, $$3, $$4)) {
         dwl $$11 = $$10.cy().g((double)$$10.bx());
         Optional<dwq> $$12 = $$11.b($$1, $$2);
         if ($$11.d($$1)) {
            if ($$7 >= 0.0) {
               $$8 = $$10;
               $$9 = (dwq)$$12.orElse($$1);
               $$7 = 0.0;
            }
         } else if ($$12.isPresent()) {
            dwq $$13 = (dwq)$$12.get();
            double $$14 = $$1.g($$13);
            if ($$14 < $$7 || $$7 == 0.0) {
               if ($$10.cO() == $$0.cO()) {
                  if ($$7 == 0.0) {
                     $$8 = $$10;
                     $$9 = $$13;
                  }
               } else {
                  $$8 = $$10;
                  $$9 = $$13;
                  $$7 = $$14;
               }
            }
         }
      }

      return $$8 == null ? null : new dwn($$8, $$9);
   }

   @Nullable
   public static dwn a(cgx $$0, bbn $$1, dwq $$2, dwq $$3, dwl $$4, Predicate<bbn> $$5) {
      return a($$0, $$1, $$2, $$3, $$4, $$5, 0.3F);
   }

   @Nullable
   public static dwn a(cgx $$0, bbn $$1, dwq $$2, dwq $$3, dwl $$4, Predicate<bbn> $$5, float $$6) {
      double $$7 = Double.MAX_VALUE;
      bbn $$8 = null;

      for(bbn $$9 : $$0.a($$1, $$4, $$5)) {
         dwl $$10 = $$9.cy().g((double)$$6);
         Optional<dwq> $$11 = $$10.b($$2, $$3);
         if ($$11.isPresent()) {
            double $$12 = $$2.g((dwq)$$11.get());
            if ($$12 < $$7) {
               $$8 = $$9;
               $$7 = $$12;
            }
         }
      }

      return $$8 == null ? null : new dwn($$8);
   }

   public static void a(bbn $$0, float $$1) {
      dwq $$2 = $$0.dd();
      if ($$2.g() != 0.0) {
         double $$3 = $$2.h();
         $$0.o((float)(ami.d($$2.e, $$2.c) * 180.0F / (float)Math.PI) + 90.0F);
         $$0.p((float)(ami.d($$3, $$2.d) * 180.0F / (float)Math.PI) - 90.0F);

         while($$0.ds() - $$0.x < -180.0F) {
            $$0.x -= 360.0F;
         }

         while($$0.ds() - $$0.x >= 180.0F) {
            $$0.x += 360.0F;
         }

         while($$0.dq() - $$0.w < -180.0F) {
            $$0.w -= 360.0F;
         }

         while($$0.dq() - $$0.w >= 180.0F) {
            $$0.w += 360.0F;
         }

         $$0.p(ami.i($$1, $$0.x, $$0.ds()));
         $$0.o(ami.i($$1, $$0.w, $$0.dq()));
      }
   }

   public static bai a(bcc $$0, cat $$1) {
      return $$0.ez().a($$1) ? bai.a : bai.b;
   }

   public static bui a(bcc $$0, cax $$1, float $$2) {
      bys $$3 = (bys)($$1.c() instanceof bys ? $$1.c() : caz.mR);
      bui $$4 = $$3.a($$0.s, $$1, $$0);
      $$4.a($$0, $$2);
      if ($$1.a(caz.tk) && $$4 instanceof buk) {
         ((buk)$$4).a($$1);
      }

      return $$4;
   }
}
