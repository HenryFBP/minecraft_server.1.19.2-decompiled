import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class cua extends cuf implements ctz {
   public static final int c = 8;
   public static final int f = 5;
   private hi<cax> i = hi.a(5, cax.b);
   private int j = -1;
   private long k;

   public cua(gt $$0, cvo $$1) {
      super(ctk.q, $$0, $$1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.i = hi.a(this.b(), cax.b);
      if (!this.d($$0)) {
         bad.b($$0, this.i);
      }

      this.j = $$0.h("TransferCooldown");
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (!this.e($$0)) {
         bad.a($$0, this.i);
      }

      $$0.a("TransferCooldown", this.j);
   }

   @Override
   public int b() {
      return this.i.size();
   }

   @Override
   public cax a(int $$0, int $$1) {
      this.e(null);
      return bad.a(this.f(), $$0, $$1);
   }

   @Override
   public void a(int $$0, cax $$1) {
      this.e(null);
      this.f().set($$0, $$1);
      if ($$1.K() > this.O_()) {
         $$1.e(this.O_());
      }

   }

   @Override
   protected rq g() {
      return rq.c("container.hopper");
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, cua $$3) {
      --$$3.j;
      $$3.k = $$0.U();
      if (!$$3.t()) {
         $$3.c(0);
         a($$0, $$1, $$2, $$3, () -> a($$0, (ctz)$$3));
      }

   }

   private static boolean a(cgx $$0, gt $$1, cvo $$2, cua $$3, BooleanSupplier $$4) {
      if ($$0.y) {
         return false;
      } else {
         if (!$$3.t() && $$2.c(cne.b)) {
            boolean $$5 = false;
            if (!$$3.c()) {
               $$5 = a($$0, $$1, $$2, (bac)$$3);
            }

            if (!$$3.j()) {
               $$5 |= $$4.getAsBoolean();
            }

            if ($$5) {
               $$3.c(8);
               a($$0, $$1, $$2);
               return true;
            }
         }

         return false;
      }
   }

   private boolean j() {
      for(cax $$0 : this.i) {
         if ($$0.b() || $$0.K() != $$0.f()) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(cgx $$0, gt $$1, cvo $$2, bac $$3) {
      bac $$4 = b($$0, $$1, $$2);
      if ($$4 == null) {
         return false;
      } else {
         gy $$5 = ((gy)$$2.c(cne.a)).g();
         if (b($$4, $$5)) {
            return false;
         } else {
            for(int $$6 = 0; $$6 < $$3.b(); ++$$6) {
               if (!$$3.a($$6).b()) {
                  cax $$7 = $$3.a($$6).o();
                  cax $$8 = a($$3, $$4, $$3.a($$6, 1), $$5);
                  if ($$8.b()) {
                     $$4.e();
                     return true;
                  }

                  $$3.a($$6, $$7);
               }
            }

            return false;
         }
      }
   }

   private static IntStream a(bac $$0, gy $$1) {
      return $$0 instanceof baq ? IntStream.of(((baq)$$0).a($$1)) : IntStream.range(0, $$0.b());
   }

   private static boolean b(bac $$0, gy $$1) {
      return a($$0, $$1).allMatch($$1x -> {
         cax $$2 = $$0.a($$1x);
         return $$2.K() >= $$2.f();
      });
   }

   private static boolean c(bac $$0, gy $$1) {
      return a($$0, $$1).allMatch($$1x -> $$0.a($$1x).b());
   }

   public static boolean a(cgx $$0, ctz $$1) {
      bac $$2 = c($$0, $$1);
      if ($$2 != null) {
         gy $$3 = gy.a;
         return c($$2, $$3) ? false : a($$2, $$3).anyMatch($$3 -> a($$1, $$2, $$3, $$3));
      } else {
         for(bqv $$4 : b($$0, $$1)) {
            if (a($$1, $$4)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(ctz $$0, bac $$1, int $$2, gy $$3) {
      cax $$4 = $$1.a($$2);
      if (!$$4.b() && b($$1, $$4, $$2, $$3)) {
         cax $$5 = $$4.o();
         cax $$6 = a($$1, $$0, $$1.a($$2, 1), null);
         if ($$6.b()) {
            $$1.e();
            return true;
         }

         $$1.a($$2, $$5);
      }

      return false;
   }

   public static boolean a(bac $$0, bqv $$1) {
      boolean $$2 = false;
      cax $$3 = $$1.i().o();
      cax $$4 = a(null, $$0, $$3, null);
      if ($$4.b()) {
         $$2 = true;
         $$1.ah();
      } else {
         $$1.a($$4);
      }

      return $$2;
   }

   public static cax a(@Nullable bac $$0, bac $$1, cax $$2, @Nullable gy $$3) {
      if ($$1 instanceof baq $$4 && $$3 != null) {
         int[] $$5 = $$4.a($$3);

         for(int $$6 = 0; $$6 < $$5.length && !$$2.b(); ++$$6) {
            $$2 = a($$0, $$1, $$2, $$5[$$6], $$3);
         }
      } else {
         int $$7 = $$1.b();

         for(int $$8 = 0; $$8 < $$7 && !$$2.b(); ++$$8) {
            $$2 = a($$0, $$1, $$2, $$8, $$3);
         }
      }

      return $$2;
   }

   private static boolean a(bac $$0, cax $$1, int $$2, @Nullable gy $$3) {
      if (!$$0.b($$2, $$1)) {
         return false;
      } else {
         return !($$0 instanceof baq) || ((baq)$$0).a($$2, $$1, $$3);
      }
   }

   private static boolean b(bac $$0, cax $$1, int $$2, gy $$3) {
      return !($$0 instanceof baq) || ((baq)$$0).b($$2, $$1, $$3);
   }

   private static cax a(@Nullable bac $$0, bac $$1, cax $$2, int $$3, @Nullable gy $$4) {
      cax $$5 = $$1.a($$3);
      if (a($$1, $$2, $$3, $$4)) {
         boolean $$6 = false;
         boolean $$7 = $$1.c();
         if ($$5.b()) {
            $$1.a($$3, $$2);
            $$2 = cax.b;
            $$6 = true;
         } else if (a($$5, $$2)) {
            int $$8 = $$2.f() - $$5.K();
            int $$9 = Math.min($$2.K(), $$8);
            $$2.g($$9);
            $$5.f($$9);
            $$6 = $$9 > 0;
         }

         if ($$6) {
            if ($$7 && $$1 instanceof cua $$10 && !$$10.w()) {
               int $$11 = 0;
               if ($$0 instanceof cua $$12 && $$10.k >= $$12.k) {
                  $$11 = 1;
               }

               $$10.c(8 - $$11);
            }

            $$1.e();
         }
      }

      return $$2;
   }

   @Nullable
   private static bac b(cgx $$0, gt $$1, cvo $$2) {
      gy $$3 = $$2.c(cne.a);
      return a($$0, $$1.a($$3));
   }

   @Nullable
   private static bac c(cgx $$0, ctz $$1) {
      return a($$0, $$1.E(), $$1.F() + 1.0, $$1.G());
   }

   public static List<bqv> b(cgx $$0, ctz $$1) {
      return (List<bqv>)$$1.N_()
         .d()
         .stream()
         .flatMap($$2 -> $$0.a(bqv.class, $$2.d($$1.E() - 0.5, $$1.F() - 0.5, $$1.G() - 0.5), bbq.a).stream())
         .collect(Collectors.toList());
   }

   @Nullable
   public static bac a(cgx $$0, gt $$1) {
      return a($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
   }

   @Nullable
   private static bac a(cgx $$0, double $$1, double $$2, double $$3) {
      bac $$4 = null;
      gt $$5 = new gt($$1, $$2, $$3);
      cvo $$6 = $$0.a_($$5);
      cjt $$7 = $$6.b();
      if ($$7 instanceof bar) {
         $$4 = ((bar)$$7).a($$6, $$0, $$5);
      } else if ($$6.o()) {
         cti $$8 = $$0.c_($$5);
         if ($$8 instanceof bac) {
            $$4 = (bac)$$8;
            if ($$4 instanceof ctn && $$7 instanceof ckr) {
               $$4 = ckr.a((ckr)$$7, $$6, $$0, $$5, true);
            }
         }
      }

      if ($$4 == null) {
         List<bbn> $$9 = $$0.a((bbn)null, new dwl($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), bbq.d);
         if (!$$9.isEmpty()) {
            $$4 = (bac)$$9.get($$0.w.a($$9.size()));
         }
      }

      return $$4;
   }

   private static boolean a(cax $$0, cax $$1) {
      if (!$$0.a($$1.c())) {
         return false;
      } else if ($$0.j() != $$1.j()) {
         return false;
      } else if ($$0.K() > $$0.f()) {
         return false;
      } else {
         return cax.a($$0, $$1);
      }
   }

   @Override
   public double E() {
      return (double)this.o.u() + 0.5;
   }

   @Override
   public double F() {
      return (double)this.o.v() + 0.5;
   }

   @Override
   public double G() {
      return (double)this.o.w() + 0.5;
   }

   private void c(int $$0) {
      this.j = $$0;
   }

   private boolean t() {
      return this.j > 0;
   }

   private boolean w() {
      return this.j > 8;
   }

   @Override
   protected hi<cax> f() {
      return this.i;
   }

   @Override
   protected void a(hi<cax> $$0) {
      this.i = $$0;
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, bbn $$3, cua $$4) {
      if ($$3 instanceof bqv && dxg.c(dxg.a($$3.cy().d((double)(-$$1.u()), (double)(-$$1.v()), (double)(-$$1.w()))), $$4.N_(), dwu.i)) {
         a($$0, $$1, $$2, $$4, () -> a($$4, (bqv)$$3));
      }

   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return new bxj($$0, $$1, this);
   }
}
