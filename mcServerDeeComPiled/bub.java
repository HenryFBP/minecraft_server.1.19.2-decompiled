import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class bub implements bac, ban {
   public static final int b = 5;
   public static final int c = 36;
   private static final int m = 9;
   public static final int d = 40;
   public static final int e = -1;
   public static final int[] f = new int[]{0, 1, 2, 3};
   public static final int[] g = new int[]{3};
   public final hi<cax> h = hi.a(36, cax.b);
   public final hi<cax> i = hi.a(4, cax.b);
   public final hi<cax> j = hi.a(1, cax.b);
   private final List<hi<cax>> n = ImmutableList.of(this.h, this.i, this.j);
   public int k;
   public final buc l;
   private int o;

   public bub(buc $$0) {
      this.l = $$0;
   }

   public cax f() {
      return d(this.k) ? this.h.get(this.k) : cax.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cax $$0, cax $$1) {
      return !$$0.b() && cax.e($$0, $$1) && $$0.g() && $$0.K() < $$0.f() && $$0.K() < this.O_();
   }

   public int h() {
      for(int $$0 = 0; $$0 < this.h.size(); ++$$0) {
         if (this.h.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cax $$0) {
      int $$1 = this.b($$0);
      if (d($$1)) {
         this.k = $$1;
      } else {
         if ($$1 == -1) {
            this.k = this.i();
            if (!this.h.get(this.k).b()) {
               int $$2 = this.h();
               if ($$2 != -1) {
                  this.h.set($$2, this.h.get(this.k));
               }
            }

            this.h.set(this.k, $$0);
         } else {
            this.c($$1);
         }

      }
   }

   public void c(int $$0) {
      this.k = this.i();
      cax $$1 = this.h.get(this.k);
      this.h.set(this.k, this.h.get($$0));
      this.h.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cax $$0) {
      for(int $$1 = 0; $$1 < this.h.size(); ++$$1) {
         if (!this.h.get($$1).b() && cax.e($$0, this.h.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cax $$0) {
      for(int $$1 = 0; $$1 < this.h.size(); ++$$1) {
         cax $$2 = this.h.get($$1);
         if (!this.h.get($$1).b() && cax.e($$0, this.h.get($$1)) && !this.h.get($$1).i() && !$$2.D() && !$$2.z()) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for(int $$0 = 0; $$0 < 9; ++$$0) {
         int $$1 = (this.k + $$0) % 9;
         if (this.h.get($$1).b()) {
            return $$1;
         }
      }

      for(int $$2 = 0; $$2 < 9; ++$$2) {
         int $$3 = (this.k + $$2) % 9;
         if (!this.h.get($$3).D()) {
            return $$3;
         }
      }

      return this.k;
   }

   public void a(double $$0) {
      int $$1 = (int)Math.signum($$0);
      this.k -= $$1;

      while(this.k < 0) {
         this.k += 9;
      }

      while(this.k >= 9) {
         this.k -= 9;
      }

   }

   public int a(Predicate<cax> $$0, int $$1, bac $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bad.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bad.a($$2, $$0, $$1 - $$3, $$4);
      cax $$5 = this.l.bU.g();
      $$3 += bad.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.l.bU.b(cax.b);
      }

      return $$3;
   }

   private int i(cax $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.K() : this.d($$1, $$0);
   }

   private int d(int $$0, cax $$1) {
      cat $$2 = $$1.c();
      int $$3 = $$1.K();
      cax $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cax($$2, 0);
         if ($$1.t()) {
            $$4.c($$1.u().g());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.f() - $$4.K()) {
         $$5 = $$4.f() - $$4.K();
      }

      if ($$5 > this.O_() - $$4.K()) {
         $$5 = this.O_() - $$4.K();
      }

      if ($$5 == 0) {
         return $$3;
      } else {
         $$3 -= $$5;
         $$4.f($$5);
         $$4.d(5);
         return $$3;
      }
   }

   public int d(cax $$0) {
      if (this.a(this.a(this.k), $$0)) {
         return this.k;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for(int $$1 = 0; $$1 < this.h.size(); ++$$1) {
            if (this.a(this.h.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void j() {
      for(hi<cax> $$0 : this.n) {
         for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.l.s, this.l, $$1, this.k == $$1);
            }
         }
      }

   }

   public boolean e(cax $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cax $$1) {
      if ($$1.b()) {
         return false;
      } else {
         try {
            if ($$1.i()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.h.set($$0, $$1.o());
                  this.h.get($$0).d(5);
                  $$1.e(0);
                  return true;
               } else if (this.l.fB().d) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.K();
                  if ($$0 == -1) {
                     $$1.e(this.i($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while(!$$1.b() && $$1.K() < $$2);

               if ($$1.K() == $$2 && this.l.fB().d) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.K() < $$2;
               }
            }
         } catch (Throwable var6) {
            q $$4 = q.a(var6, "Adding item to inventory");
            r $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cat.a($$1.c()));
            $$5.a("Item data", $$1.j());
            $$5.a("Item name", (s<String>)(() -> $$1.x().getString()));
            throw new z($$4);
         }
      }
   }

   public void f(cax $$0) {
      this.a($$0, true);
   }

   public void a(cax $$0, boolean $$1) {
      while(!$$0.b()) {
         int $$2 = this.d($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.l.a($$0, false);
            break;
         }

         int $$3 = $$0.f() - this.a($$2).K();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.l instanceof agh) {
            ((agh)this.l).b.a(new tz(-2, 0, $$2, this.a($$2)));
         }
      }

   }

   @Override
   public cax a(int $$0, int $$1) {
      List<cax> $$2 = null;

      for(hi<cax> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !((cax)$$2.get($$0)).b() ? bad.a($$2, $$0, $$1) : cax.b;
   }

   public void g(cax $$0) {
      for(hi<cax> $$1 : this.n) {
         for(int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cax.b);
               break;
            }
         }
      }

   }

   @Override
   public cax b(int $$0) {
      hi<cax> $$1 = null;

      for(hi<cax> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cax $$3 = $$1.get($$0);
         $$1.set($$0, cax.b);
         return $$3;
      } else {
         return cax.b;
      }
   }

   @Override
   public void a(int $$0, cax $$1) {
      hi<cax> $$2 = null;

      for(hi<cax> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      if ($$2 != null) {
         $$2.set($$0, $$1);
      }

   }

   public float a(cvo $$0) {
      return this.h.get(this.k).a($$0);
   }

   public pp a(pp $$0) {
      for(int $$1 = 0; $$1 < this.h.size(); ++$$1) {
         if (!this.h.get($$1).b()) {
            pj $$2 = new pj();
            $$2.a("Slot", (byte)$$1);
            this.h.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for(int $$3 = 0; $$3 < this.i.size(); ++$$3) {
         if (!this.i.get($$3).b()) {
            pj $$4 = new pj();
            $$4.a("Slot", (byte)($$3 + 100));
            this.i.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for(int $$5 = 0; $$5 < this.j.size(); ++$$5) {
         if (!this.j.get($$5).b()) {
            pj $$6 = new pj();
            $$6.a("Slot", (byte)($$5 + 150));
            this.j.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(pp $$0) {
      this.h.clear();
      this.i.clear();
      this.j.clear();

      for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
         pj $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cax $$4 = cax.a($$2);
         if (!$$4.b()) {
            if ($$3 >= 0 && $$3 < this.h.size()) {
               this.h.set($$3, $$4);
            } else if ($$3 >= 100 && $$3 < this.i.size() + 100) {
               this.i.set($$3 - 100, $$4);
            } else if ($$3 >= 150 && $$3 < this.j.size() + 150) {
               this.j.set($$3 - 150, $$4);
            }
         }
      }

   }

   @Override
   public int b() {
      return this.h.size() + this.i.size() + this.j.size();
   }

   @Override
   public boolean c() {
      for(cax $$0 : this.h) {
         if (!$$0.b()) {
            return false;
         }
      }

      for(cax $$1 : this.i) {
         if (!$$1.b()) {
            return false;
         }
      }

      for(cax $$2 : this.j) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cax a(int $$0) {
      List<cax> $$1 = null;

      for(hi<cax> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cax.b : (cax)$$1.get($$0);
   }

   @Override
   public rq X() {
      return rq.c("container.inventory");
   }

   public cax e(int $$0) {
      return this.i.get($$0);
   }

   public void a(baw $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for(int $$3 : $$2) {
            cax $$4 = this.i.get($$3);
            if ((!$$0.u() || !$$4.c().x()) && $$4.c() instanceof byo) {
               $$4.a((int)$$1, this.l, $$1x -> $$1x.d(bbs.a(bbs.a.b, $$3)));
            }
         }

      }
   }

   public void k() {
      for(List<cax> $$0 : this.n) {
         for(int $$1 = 0; $$1 < $$0.size(); ++$$1) {
            cax $$2 = (cax)$$0.get($$1);
            if (!$$2.b()) {
               this.l.a($$2, true, false);
               $$0.set($$1, cax.b);
            }
         }
      }

   }

   @Override
   public void e() {
      ++this.o;
   }

   public int l() {
      return this.o;
   }

   @Override
   public boolean a(buc $$0) {
      if (this.l.dt()) {
         return false;
      } else {
         return !($$0.f(this.l) > 64.0);
      }
   }

   public boolean h(cax $$0) {
      for(List<cax> $$1 : this.n) {
         for(cax $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(akz<cat> $$0) {
      for(List<cax> $$1 : this.n) {
         for(cax $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(bub $$0) {
      for(int $$1 = 0; $$1 < this.b(); ++$$1) {
         this.a($$1, $$0.a($$1));
      }

      this.k = $$0.k;
   }

   @Override
   public void a() {
      for(List<cax> $$0 : this.n) {
         $$0.clear();
      }

   }

   public void a(bug $$0) {
      for(cax $$1 : this.h) {
         $$0.a($$1);
      }

   }

   public cax a(boolean $$0) {
      cax $$1 = this.f();
      return $$1.b() ? cax.b : this.a(this.k, $$0 ? $$1.K() : 1);
   }
}
