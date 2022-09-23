import java.util.Arrays;
import javax.annotation.Nullable;

public class ctl extends ctc implements baq {
   private static final int g = 3;
   private static final int h = 4;
   private static final int[] i = new int[]{3};
   private static final int[] j = new int[]{0, 1, 2, 3};
   private static final int[] k = new int[]{0, 1, 2, 4};
   public static final int b = 20;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   private hi<cax> l = hi.a(5, cax.b);
   int m;
   private boolean[] q;
   private cat r;
   int s;
   protected final bww f = new bww() {
      @Override
      public int a(int $$0) {
         switch($$0) {
            case 0:
               return ctl.this.m;
            case 1:
               return ctl.this.s;
            default:
               return 0;
         }
      }

      @Override
      public void a(int $$0, int $$1) {
         switch($$0) {
            case 0:
               ctl.this.m = $$1;
               break;
            case 1:
               ctl.this.s = $$1;
         }

      }

      @Override
      public int a() {
         return 2;
      }
   };

   public ctl(gt $$0, cvo $$1) {
      super(ctk.k, $$0, $$1);
   }

   @Override
   protected rq g() {
      return rq.c("container.brewing");
   }

   @Override
   public int b() {
      return this.l.size();
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.l) {
         if (!$$0.b()) {
            return false;
         }
      }

      return true;
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctl $$3) {
      cax $$4 = $$3.l.get(4);
      if ($$3.s <= 0 && $$4.a(caz.qw)) {
         $$3.s = 20;
         $$4.g(1);
         a($$0, $$1, $$2);
      }

      boolean $$5 = a($$3.l);
      boolean $$6 = $$3.m > 0;
      cax $$7 = $$3.l.get(3);
      if ($$6) {
         --$$3.m;
         boolean $$8 = $$3.m == 0;
         if ($$8 && $$5) {
            a($$0, $$1, $$3.l);
            a($$0, $$1, $$2);
         } else if (!$$5 || !$$7.a($$3.r)) {
            $$3.m = 0;
            a($$0, $$1, $$2);
         }
      } else if ($$5 && $$3.s > 0) {
         --$$3.s;
         $$3.m = 400;
         $$3.r = $$7.c();
         a($$0, $$1, $$2);
      }

      boolean[] $$9 = $$3.f();
      if (!Arrays.equals($$9, $$3.q)) {
         $$3.q = $$9;
         cvo $$10 = $$2;
         if (!($$2.b() instanceof cjw)) {
            return;
         }

         for(int $$11 = 0; $$11 < cjw.a.length; ++$$11) {
            $$10 = $$10.a(cjw.a[$$11], Boolean.valueOf($$9[$$11]));
         }

         $$0.a($$1, $$10, 2);
      }

   }

   private boolean[] f() {
      boolean[] $$0 = new boolean[3];

      for(int $$1 = 0; $$1 < 3; ++$$1) {
         if (!this.l.get($$1).b()) {
            $$0[$$1] = true;
         }
      }

      return $$0;
   }

   private static boolean a(hi<cax> $$0) {
      cax $$1 = $$0.get(3);
      if ($$1.b()) {
         return false;
      } else if (!cct.a($$1)) {
         return false;
      } else {
         for(int $$2 = 0; $$2 < 3; ++$$2) {
            cax $$3 = $$0.get($$2);
            if (!$$3.b() && cct.a($$3, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static void a(cgx $$0, gt $$1, hi<cax> $$2) {
      cax $$3 = $$2.get(3);

      for(int $$4 = 0; $$4 < 3; ++$$4) {
         $$2.set($$4, cct.d($$3, $$2.get($$4)));
      }

      $$3.g(1);
      if ($$3.c().t()) {
         cax $$5 = new cax($$3.c().s());
         if ($$3.b()) {
            $$3 = $$5;
         } else {
            baf.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$5);
         }
      }

      $$2.set(3, $$3);
      $$0.c(1035, $$1, 0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.l = hi.a(this.b(), cax.b);
      bad.b($$0, this.l);
      this.m = $$0.g("BrewTime");
      this.s = $$0.f("Fuel");
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("BrewTime", (short)this.m);
      bad.a($$0, this.l);
      $$0.a("Fuel", (byte)this.s);
   }

   @Override
   public cax a(int $$0) {
      return $$0 >= 0 && $$0 < this.l.size() ? this.l.get($$0) : cax.b;
   }

   @Override
   public cax a(int $$0, int $$1) {
      return bad.a(this.l, $$0, $$1);
   }

   @Override
   public cax b(int $$0) {
      return bad.a(this.l, $$0);
   }

   @Override
   public void a(int $$0, cax $$1) {
      if ($$0 >= 0 && $$0 < this.l.size()) {
         this.l.set($$0, $$1);
      }

   }

   @Override
   public boolean a(buc $$0) {
      if (this.n.c_(this.o) != this) {
         return false;
      } else {
         return !($$0.h((double)this.o.u() + 0.5, (double)this.o.v() + 0.5, (double)this.o.w() + 0.5) > 64.0);
      }
   }

   @Override
   public boolean b(int $$0, cax $$1) {
      if ($$0 == 3) {
         return cct.a($$1);
      } else if ($$0 == 4) {
         return $$1.a(caz.qw);
      } else {
         return ($$1.a(caz.qs) || $$1.a(caz.ti) || $$1.a(caz.tl) || $$1.a(caz.qt)) && this.a($$0).b();
      }
   }

   @Override
   public int[] a(gy $$0) {
      if ($$0 == gy.b) {
         return i;
      } else {
         return $$0 == gy.a ? j : k;
      }
   }

   @Override
   public boolean a(int $$0, cax $$1, @Nullable gy $$2) {
      return this.b($$0, $$1);
   }

   @Override
   public boolean b(int $$0, cax $$1, gy $$2) {
      return $$0 == 3 ? $$1.a(caz.qt) : true;
   }

   @Override
   public void a() {
      this.l.clear();
   }

   @Override
   protected bwm a(int $$0, bub $$1) {
      return new bwr($$0, $$1, this, this.f);
   }
}
