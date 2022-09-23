import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bwm {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final hi<cax> l = hi.a();
   public final hi<byd> i = hi.a();
   private final List<bxc> m = Lists.newArrayList();
   private cax n = cax.b;
   private final hi<cax> o = hi.a();
   private final IntList p = new IntArrayList();
   private cax q = cax.b;
   private int r;
   @Nullable
   private final bxq<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<byd> v = Sets.newHashSet();
   private final List<bwy> w = Lists.newArrayList();
   @Nullable
   private bwz x;
   private boolean y;

   protected bwm(@Nullable bxq<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(bwx $$0, buc $$1, cjt $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.h((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0, true);
   }

   public bxq<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(bac $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(bww $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected byd a(byd $$0) {
      $$0.e = this.i.size();
      this.i.add($$0);
      this.l.add(cax.b);
      this.o.add(cax.b);
      return $$0;
   }

   protected bxc a(bxc $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(bww $$0) {
      for(int $$1 = 0; $$1 < $$0.a(); ++$$1) {
         this.a(bxc.a($$0, $$1));
      }

   }

   public void a(bwy $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(bwz $$0) {
      this.x = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for(int $$1 = this.i.size(); $$0 < $$1; ++$$0) {
         this.o.set($$0, this.i.get($$0).e().o());
      }

      this.q = this.g().o();
      $$0 = 0;

      for(int $$3 = this.m.size(); $$0 < $$3; ++$$0) {
         this.p.set($$0, ((bxc)this.m.get($$0)).b());
      }

      if (this.x != null) {
         this.x.a(this, this.o, this.q, this.p.toIntArray());
      }

   }

   public void b(bwy $$0) {
      this.w.remove($$0);
   }

   public hi<cax> c() {
      hi<cax> $$0 = hi.a();

      for(byd $$1 : this.i) {
         $$0.add($$1.e());
      }

      return $$0;
   }

   public void d() {
      for(int $$0 = 0; $$0 < this.i.size(); ++$$0) {
         cax $$1 = this.i.get($$0).e();
         Supplier<cax> $$2 = Suppliers.memoize($$1::o);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for(int $$3 = 0; $$3 < this.m.size(); ++$$3) {
         bxc $$4 = (bxc)this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }

   }

   public void e() {
      for(int $$0 = 0; $$0 < this.i.size(); ++$$0) {
         cax $$1 = this.i.get($$0).e();
         this.a($$0, $$1, $$1::o);
      }

      for(int $$2 = 0; $$2 < this.m.size(); ++$$2) {
         bxc $$3 = (bxc)this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for(bwy $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }

   }

   private void a(int $$0, cax $$1, Supplier<cax> $$2) {
      cax $$3 = this.l.get($$0);
      if (!cax.b($$3, $$1)) {
         cax $$4 = (cax)$$2.get();
         this.l.set($$0, $$4);

         for(bwy $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }

   }

   private void b(int $$0, cax $$1, Supplier<cax> $$2) {
      if (!this.y) {
         cax $$3 = this.o.get($$0);
         if (!cax.b($$3, $$1)) {
            cax $$4 = (cax)$$2.get();
            this.o.set($$0, $$4);
            if (this.x != null) {
               this.x.a(this, $$0, $$4);
            }
         }

      }
   }

   private void d(int $$0, int $$1) {
      if (!this.y) {
         int $$2 = this.p.getInt($$0);
         if ($$2 != $$1) {
            this.p.set($$0, $$1);
            if (this.x != null) {
               this.x.a(this, $$0, $$1);
            }
         }

      }
   }

   private void l() {
      if (!this.y) {
         if (!cax.b(this.g(), this.q)) {
            this.q = this.g().o();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }

      }
   }

   public void a(int $$0, cax $$1) {
      this.o.set($$0, $$1.o());
   }

   public void b(int $$0, cax $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(cax $$0) {
      this.q = $$0.o();
   }

   public boolean b(buc $$0, int $$1) {
      return false;
   }

   public byd b(int $$0) {
      return this.i.get($$0);
   }

   public abstract cax a(buc var1, int var2);

   public void a(int $$0, int $$1, bwv $$2, buc $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         q $$5 = q.a(var8, "Container click");
         r $$6 = $$5.a("Click info");
         $$6.a("Menu Type", (s<String>)(() -> this.s != null ? hm.ah.b(this.s).toString() : "<no type>"));
         $$6.a("Menu Class", (s<String>)(() -> this.getClass().getCanonicalName()));
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new z($$5);
      }
   }

   private void b(int $$0, int $$1, bwv $$2, buc $$3) {
      bub $$4 = $$3.fA();
      if ($$2 == bwv.f) {
         int $$5 = this.u;
         this.u = d($$1);
         if (($$5 != 1 || this.u != 2) && $$5 != this.u) {
            this.f();
         } else if (this.g().b()) {
            this.f();
         } else if (this.u == 0) {
            this.t = c($$1);
            if (a(this.t, $$3)) {
               this.u = 1;
               this.v.clear();
            } else {
               this.f();
            }
         } else if (this.u == 1) {
            byd $$6 = this.i.get($$0);
            cax $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.K() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = ((byd)this.v.iterator().next()).e;
                  this.f();
                  this.b($$8, this.t, bwv.a, $$3);
                  return;
               }

               cax $$9 = this.g().o();
               int $$10 = this.g().K();

               for(byd $$11 : this.v) {
                  cax $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.K() >= this.v.size()) && this.b($$11)) {
                     cax $$13 = $$9.o();
                     int $$14 = $$11.f() ? $$11.e().K() : 0;
                     a(this.v, this.t, $$13, $$14);
                     int $$15 = Math.min($$13.f(), $$11.a_($$13));
                     if ($$13.K() > $$15) {
                        $$13.e($$15);
                     }

                     $$10 -= $$13.K() - $$14;
                     $$11.d($$13);
                  }
               }

               $$9.e($$10);
               this.b($$9);
            }

            this.f();
         } else {
            this.f();
         }
      } else if (this.u != 0) {
         this.f();
      } else if (($$2 == bwv.a || $$2 == bwv.b) && ($$1 == 0 || $$1 == 1)) {
         bwu $$16 = $$1 == 0 ? bwu.a : bwu.b;
         if ($$0 == -999) {
            if (!this.g().b()) {
               if ($$16 == bwu.a) {
                  $$3.a(this.g(), true);
                  this.b(cax.b);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == bwv.b) {
            if ($$0 < 0) {
               return;
            }

            byd $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            cax $$18 = this.a($$3, $$0);

            while(!$$18.b() && cax.c($$17.e(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            byd $$19 = this.i.get($$0);
            cax $$20 = $$19.e();
            cax $$21 = this.g();
            $$3.a($$21, $$19.e(), $$16);
            if (!$$21.a($$19, $$16, $$3) && !$$20.a($$21, $$19, $$16, $$3, this.m())) {
               if ($$20.b()) {
                  if (!$$21.b()) {
                     int $$22 = $$16 == bwu.a ? $$21.K() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.b()) {
                     int $$23 = $$16 == bwu.a ? $$20.K() : ($$20.K() + 1) / 2;
                     Optional<cax> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (cax.e($$20, $$21)) {
                        int $$25 = $$16 == bwu.a ? $$21.K() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.K() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.d($$21);
                     }
                  } else if (cax.e($$20, $$21)) {
                     Optional<cax> $$26 = $$19.a($$20.K(), $$21.f() - $$21.K(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.f($$3x.K());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.d();
         }
      } else if ($$2 == bwv.c) {
         byd $$27 = this.i.get($$0);
         cax $$28 = $$4.a($$1);
         cax $$29 = $$27.e();
         if (!$$28.b() || !$$29.b()) {
            if ($$28.b()) {
               if ($$27.a($$3)) {
                  $$4.a($$1, $$29);
                  $$27.b($$29.K());
                  $$27.d(cax.b);
                  $$27.a($$3, $$29);
               }
            } else if ($$29.b()) {
               if ($$27.a($$28)) {
                  int $$30 = $$27.a_($$28);
                  if ($$28.K() > $$30) {
                     $$27.d($$28.a($$30));
                  } else {
                     $$4.a($$1, cax.b);
                     $$27.d($$28);
                  }
               }
            } else if ($$27.a($$3) && $$27.a($$28)) {
               int $$31 = $$27.a_($$28);
               if ($$28.K() > $$31) {
                  $$27.d($$28.a($$31));
                  $$27.a($$3, $$29);
                  if (!$$4.e($$29)) {
                     $$3.a($$29, true);
                  }
               } else {
                  $$4.a($$1, $$29);
                  $$27.d($$28);
                  $$27.a($$3, $$29);
               }
            }
         }
      } else if ($$2 == bwv.d && $$3.fB().d && this.g().b() && $$0 >= 0) {
         byd $$32 = this.i.get($$0);
         if ($$32.f()) {
            cax $$33 = $$32.e().o();
            $$33.e($$33.f());
            this.b($$33);
         }
      } else if ($$2 == bwv.e && this.g().b() && $$0 >= 0) {
         byd $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.e().K();
         cax $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == bwv.g && $$0 >= 0) {
         byd $$37 = this.i.get($$0);
         cax $$38 = this.g();
         if (!$$38.b() && (!$$37.f() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for(int $$41 = 0; $$41 < 2; ++$$41) {
               for(int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.K() < $$38.f(); $$42 += $$40) {
                  byd $$43 = this.i.get($$42);
                  if ($$43.f() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     cax $$44 = $$43.e();
                     if ($$41 != 0 || $$44.K() != $$44.f()) {
                        cax $$45 = $$43.b($$44.K(), $$38.f() - $$38.K(), $$3);
                        $$38.f($$45.K());
                     }
                  }
               }
            }
         }
      }

   }

   private bct m() {
      return new bct() {
         @Override
         public cax a() {
            return bwm.this.g();
         }

         @Override
         public boolean a(cax $$0) {
            bwm.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(cax $$0, byd $$1) {
      return true;
   }

   public void b(buc $$0) {
      if ($$0 instanceof agh) {
         cax $$1 = this.g();
         if (!$$1.b()) {
            if ($$0.bo() && !((agh)$$0).t()) {
               $$0.fA().f($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(cax.b);
         }
      }

   }

   protected void a(buc $$0, bac $$1) {
      if (!$$0.bo() || $$0 instanceof agh && ((agh)$$0).t()) {
         for(int $$2 = 0; $$2 < $$1.b(); ++$$2) {
            $$0.a($$1.b($$2), false);
         }

      } else {
         for(int $$3 = 0; $$3 < $$1.b(); ++$$3) {
            bub $$4 = $$0.fA();
            if ($$4.l instanceof agh) {
               $$4.f($$1.b($$3));
            }
         }

      }
   }

   public void a(bac $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, cax $$2) {
      this.b($$0).d($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<cax> $$1, cax $$2) {
      for(int $$3 = 0; $$3 < $$1.size(); ++$$3) {
         this.b($$3).e((cax)$$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      ((bxc)this.m.get($$0)).a($$1);
   }

   public abstract boolean a(buc var1);

   protected boolean a(cax $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.g()) {
         while(!$$0.b()) {
            if ($$3) {
               if ($$5 < $$1) {
                  break;
               }
            } else if ($$5 >= $$2) {
               break;
            }

            byd $$6 = this.i.get($$5);
            cax $$7 = $$6.e();
            if (!$$7.b() && cax.e($$0, $$7)) {
               int $$8 = $$7.K() + $$0.K();
               if ($$8 <= $$0.f()) {
                  $$0.e(0);
                  $$7.e($$8);
                  $$6.d();
                  $$4 = true;
               } else if ($$7.K() < $$0.f()) {
                  $$0.g($$0.f() - $$7.K());
                  $$7.e($$0.f());
                  $$6.d();
                  $$4 = true;
               }
            }

            if ($$3) {
               --$$5;
            } else {
               ++$$5;
            }
         }
      }

      if (!$$0.b()) {
         if ($$3) {
            $$5 = $$2 - 1;
         } else {
            $$5 = $$1;
         }

         while(true) {
            if ($$3) {
               if ($$5 < $$1) {
                  break;
               }
            } else if ($$5 >= $$2) {
               break;
            }

            byd $$9 = this.i.get($$5);
            cax $$10 = $$9.e();
            if ($$10.b() && $$9.a($$0)) {
               if ($$0.K() > $$9.a()) {
                  $$9.d($$0.a($$9.a()));
               } else {
                  $$9.d($$0.a($$0.K()));
               }

               $$9.d();
               $$4 = true;
               break;
            }

            if ($$3) {
               --$$5;
            } else {
               ++$$5;
            }
         }
      }

      return $$4;
   }

   public static int c(int $$0) {
      return $$0 >> 2 & 3;
   }

   public static int d(int $$0) {
      return $$0 & 3;
   }

   public static int b(int $$0, int $$1) {
      return $$0 & 3 | ($$1 & 3) << 2;
   }

   public static boolean a(int $$0, buc $$1) {
      if ($$0 == 0) {
         return true;
      } else if ($$0 == 1) {
         return true;
      } else {
         return $$0 == 2 && $$1.fB().d;
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable byd $$0, cax $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.f();
      if (!$$3 && cax.e($$1, $$0.e())) {
         return $$0.e().K() + ($$2 ? 0 : $$1.K()) <= $$1.f();
      } else {
         return $$3;
      }
   }

   public static void a(Set<byd> $$0, int $$1, cax $$2, int $$3) {
      switch($$1) {
         case 0:
            $$2.e(ami.d((float)$$2.K() / (float)$$0.size()));
            break;
         case 1:
            $$2.e(1);
            break;
         case 2:
            $$2.e($$2.c().m());
      }

      $$2.f($$3);
   }

   public boolean b(byd $$0) {
      return true;
   }

   public static int a(@Nullable cti $$0) {
      return $$0 instanceof bac ? b((bac)$$0) : 0;
   }

   public static int b(@Nullable bac $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = 0;
         float $$2 = 0.0F;

         for(int $$3 = 0; $$3 < $$0.b(); ++$$3) {
            cax $$4 = $$0.a($$3);
            if (!$$4.b()) {
               $$2 += (float)$$4.K() / (float)Math.min($$0.O_(), $$4.f());
               ++$$1;
            }
         }

         $$2 /= (float)$$0.b();
         return ami.d($$2 * 14.0F) + ($$1 > 0 ? 1 : 0);
      }
   }

   public void b(cax $$0) {
      this.n = $$0;
   }

   public cax g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(bwm $$0) {
      Table<bac, Integer, Integer> $$1 = HashBasedTable.create();

      for(int $$2 = 0; $$2 < $$0.i.size(); ++$$2) {
         byd $$3 = $$0.i.get($$2);
         $$1.put($$3.d, $$3.g(), $$2);
      }

      for(int $$4 = 0; $$4 < this.i.size(); ++$$4) {
         byd $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.d, $$5.g());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }

   }

   public OptionalInt b(bac $$0, int $$1) {
      for(int $$2 = 0; $$2 < this.i.size(); ++$$2) {
         byd $$3 = this.i.get($$2);
         if ($$3.d == $$0 && $$1 == $$3.g()) {
            return OptionalInt.of($$2);
         }
      }

      return OptionalInt.empty();
   }

   public int j() {
      return this.r;
   }

   public int k() {
      this.r = this.r + 1 & 32767;
      return this.r;
   }
}
