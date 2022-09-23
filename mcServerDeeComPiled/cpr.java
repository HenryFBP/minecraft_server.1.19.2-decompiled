import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class cpr extends cjt {
   public static final int a = 0;
   public static final int b = 4;
   public static final cwo c = cwe.aZ;
   private static final ImmutableList<hs> d = ImmutableList.of(
      new hs(0, 0, -1), new hs(-1, 0, 0), new hs(0, 0, 1), new hs(1, 0, 0), new hs(-1, 0, -1), new hs(1, 0, -1), new hs(-1, 0, 1), new hs(1, 0, 1)
   );
   private static final ImmutableList<hs> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(hs::n).iterator())
      .addAll(d.stream().map(hs::o).iterator())
      .add(new hs(0, 1, 0))
      .build();

   public cpr(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      cax $$6 = $$3.b($$4);
      if ($$4 == bai.a && !a($$6) && a($$3.b(bai.b))) {
         return baj.d;
      } else if (a($$6) && h($$0)) {
         a($$1, $$2, $$0);
         if (!$$3.fB().d) {
            $$6.g(1);
         }

         return baj.a($$1.y);
      } else if ($$0.c(c) == 0) {
         return baj.d;
      } else if (!a($$1)) {
         if (!$$1.y) {
            this.d($$0, $$1, $$2);
         }

         return baj.a($$1.y);
      } else {
         if (!$$1.y) {
            agh $$7 = (agh)$$3;
            if ($$7.P() != $$1.ab() || !$$2.equals($$7.N())) {
               $$7.a($$1.ab(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.rf, ajx.e, 1.0F, 1.0F);
               return baj.a;
            }
         }

         return baj.b;
      }
   }

   private static boolean a(cax $$0) {
      return $$0.a(caz.eB);
   }

   private static boolean h(cvo $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gt $$0, cgx $$1) {
      dpv $$2 = $$1.b_($$0);
      if (!$$2.a(akp.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            dpv $$4 = $$1.b_($$0.c());
            return !$$4.a(akp.a);
         }
      }
   }

   private void d(cvo $$0, cgx $$1, final gt $$2) {
      $$1.a($$2, false);
      boolean $$3 = gy.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.b()).a(akp.a);
      cgq $$5 = new cgq() {
         @Override
         public Optional<Float> a(cgp $$0, cgd $$1, gt $$2x, cvo $$3, dpv $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cju.C.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      $$1.a(null, baw.a(), $$5, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 5.0F, true, cgp.a.c);
   }

   public static boolean a(cgx $$0) {
      return $$0.q_().m();
   }

   public static void a(cgx $$0, gt $$1, cvo $$2) {
      $$0.a($$1, $$2.a(c, Integer.valueOf($$2.c(c) + 1)), 3);
      $$0.a(null, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, ajw.rd, ajx.e, 1.0F, 1.0F);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ajw.rc, ajx.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(io.aA, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   public static int a(cvo $$0, int $$1) {
      return ami.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      return a($$0, 15);
   }

   public static Optional<dwq> a(bbr<?> $$0, cgh $$1, gt $$2) {
      Optional<dwq> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<dwq> a(bbr<?> $$0, cgh $$1, gt $$2, boolean $$3) {
      gt.a $$4 = new gt.a();
      UnmodifiableIterator var5 = e.iterator();

      while(var5.hasNext()) {
         hs $$5 = (hs)var5.next();
         $$4.g($$2).h($$5);
         dwq $$6 = bvy.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
