import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqu {
   private static final int c = 2;
   public static final int a = 21;
   private static final int d = 3;
   public static final int b = 21;
   private static final cvn.e e = ($$0, $$1, $$2) -> $$0.a(cju.bZ);
   private final cgy f;
   private final gy.a g;
   private final gy h;
   private int i;
   @Nullable
   private gt j;
   private int k;
   private final int l;

   public static Optional<dqu> a(cgy $$0, gt $$1, gy.a $$2) {
      return a($$0, $$1, $$0x -> $$0x.a() && $$0x.i == 0, $$2);
   }

   public static Optional<dqu> a(cgy $$0, gt $$1, Predicate<dqu> $$2, gy.a $$3) {
      Optional<dqu> $$4 = Optional.of(new dqu($$0, $$1, $$3)).filter($$2);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         gy.a $$5 = $$3 == gy.a.a ? gy.a.c : gy.a.a;
         return Optional.of(new dqu($$0, $$1, $$5)).filter($$2);
      }
   }

   public dqu(cgy $$0, gt $$1, gy.a $$2) {
      this.f = $$0;
      this.g = $$2;
      this.h = $$2 == gy.a.a ? gy.e : gy.d;
      this.j = this.a($$1);
      if (this.j == null) {
         this.j = $$1;
         this.l = 1;
         this.k = 1;
      } else {
         this.l = this.d();
         if (this.l > 0) {
            this.k = this.e();
         }
      }

   }

   @Nullable
   private gt a(gt $$0) {
      int $$1 = Math.max(this.f.u_(), $$0.v() - 21);

      while($$0.v() > $$1 && a(this.f.a_($$0.c()))) {
         $$0 = $$0.c();
      }

      gy $$2 = this.h.g();
      int $$3 = this.a($$0, $$2) - 1;
      return $$3 < 0 ? null : $$0.a($$2, $$3);
   }

   private int d() {
      int $$0 = this.a(this.j, this.h);
      return $$0 >= 2 && $$0 <= 21 ? $$0 : 0;
   }

   private int a(gt $$0, gy $$1) {
      gt.a $$2 = new gt.a();

      for(int $$3 = 0; $$3 <= 21; ++$$3) {
         $$2.g($$0).c($$1, $$3);
         cvo $$4 = this.f.a_($$2);
         if (!a($$4)) {
            if (e.test($$4, this.f, $$2)) {
               return $$3;
            }
            break;
         }

         cvo $$5 = this.f.a_($$2.c(gy.a));
         if (!e.test($$5, this.f, $$2)) {
            break;
         }
      }

      return 0;
   }

   private int e() {
      gt.a $$0 = new gt.a();
      int $$1 = this.a($$0);
      return $$1 >= 3 && $$1 <= 21 && this.a($$0, $$1) ? $$1 : 0;
   }

   private boolean a(gt.a $$0, int $$1) {
      for(int $$2 = 0; $$2 < this.l; ++$$2) {
         gt.a $$3 = $$0.g(this.j).c(gy.b, $$1).c(this.h, $$2);
         if (!e.test(this.f.a_($$3), this.f, $$3)) {
            return false;
         }
      }

      return true;
   }

   private int a(gt.a $$0) {
      for(int $$1 = 0; $$1 < 21; ++$$1) {
         $$0.g(this.j).c(gy.b, $$1).c(this.h, -1);
         if (!e.test(this.f.a_($$0), this.f, $$0)) {
            return $$1;
         }

         $$0.g(this.j).c(gy.b, $$1).c(this.h, this.l);
         if (!e.test(this.f.a_($$0), this.f, $$0)) {
            return $$1;
         }

         for(int $$2 = 0; $$2 < this.l; ++$$2) {
            $$0.g(this.j).c(gy.b, $$1).c(this.h, $$2);
            cvo $$3 = this.f.a_($$0);
            if (!a($$3)) {
               return $$1;
            }

            if ($$3.a(cju.dn)) {
               ++this.i;
            }
         }
      }

      return 21;
   }

   private static boolean a(cvo $$0) {
      return $$0.h() || $$0.a(akl.aB) || $$0.a(cju.dn);
   }

   public boolean a() {
      return this.j != null && this.l >= 2 && this.l <= 21 && this.k >= 3 && this.k <= 21;
   }

   public void b() {
      cvo $$0 = cju.dn.m().a(cop.a, this.g);
      gt.a(this.j, this.j.a(gy.b, this.k - 1).a(this.h, this.l - 1)).forEach($$1 -> this.f.a($$1, $$0, 18));
   }

   public boolean c() {
      return this.a() && this.i == this.l * this.k;
   }

   public static dwq a(n.a $$0, gy.a $$1, dwq $$2, bbo $$3) {
      double $$4 = (double)$$0.b - (double)$$3.a;
      double $$5 = (double)$$0.c - (double)$$3.b;
      gt $$6 = $$0.a;
      double $$8;
      if ($$4 > 0.0) {
         float $$7 = (float)$$6.a($$1) + $$3.a / 2.0F;
         $$8 = ami.a(ami.c($$2.a($$1) - (double)$$7, 0.0, $$4), 0.0, 1.0);
      } else {
         $$8 = 0.5;
      }

      double $$11;
      if ($$5 > 0.0) {
         gy.a $$10 = gy.a.b;
         $$11 = ami.a(ami.c($$2.a($$10) - (double)$$6.a($$10), 0.0, $$5), 0.0, 1.0);
      } else {
         $$11 = 0.0;
      }

      gy.a $$13 = $$1 == gy.a.a ? gy.a.c : gy.a.a;
      double $$14 = $$2.a($$13) - ((double)$$6.a($$13) + 0.5);
      return new dwq($$8, $$11, $$14);
   }

   public static dqt a(agg $$0, n.a $$1, gy.a $$2, dwq $$3, bbo $$4, dwq $$5, float $$6, float $$7) {
      gt $$8 = $$1.a;
      cvo $$9 = $$0.a_($$8);
      gy.a $$10 = (gy.a)$$9.d(cwe.I).orElse(gy.a.a);
      double $$11 = (double)$$1.b;
      double $$12 = (double)$$1.c;
      int $$13 = $$2 == $$10 ? 0 : 90;
      dwq $$14 = $$2 == $$10 ? $$5 : new dwq($$5.e, $$5.d, -$$5.c);
      double $$15 = (double)$$4.a / 2.0 + ($$11 - (double)$$4.a) * $$3.a();
      double $$16 = ($$12 - (double)$$4.b) * $$3.b();
      double $$17 = 0.5 + $$3.c();
      boolean $$18 = $$10 == gy.a.a;
      dwq $$19 = new dwq((double)$$8.u() + ($$18 ? $$15 : $$17), (double)$$8.v() + $$16, (double)$$8.w() + ($$18 ? $$17 : $$15));
      return new dqt($$19, $$14, $$6 + (float)$$13, $$7);
   }
}
