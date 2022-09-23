import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class dqi extends dqq {
   private final Long2ObjectMap<dqh> l = new Long2ObjectOpenHashMap();

   @Override
   public void a(chk $$0, bce $$1) {
      super.a($$0, $$1);
      this.l.clear();
      this.k = $$1.a(dqh.j);
   }

   @Override
   public void b() {
      this.b.a(dqh.j, this.k);
      this.l.clear();
      super.b();
   }

   @Nullable
   @Override
   public dqj a() {
      int $$0;
      if (this.f() && this.b.aR()) {
         $$0 = this.b.dg();
         gt.a $$1 = new gt.a(this.b.df(), (double)$$0, this.b.dl());

         for(cvo $$2 = this.a.a_($$1); $$2.a(cju.C); $$2 = this.a.a_($$1)) {
            $$1.c(this.b.df(), (double)(++$$0), this.b.dl());
         }
      } else {
         $$0 = ami.b(this.b.dh() + 0.5);
      }

      gt $$4 = this.b.da();
      dqh $$5 = this.b($$4.u(), $$0, $$4.w());
      if (this.b.a($$5) < 0.0F) {
         for(gt $$6 : this.b.fF()) {
            dqh $$7 = this.b($$6.u(), $$6.v(), $$6.w());
            if (this.b.a($$7) >= 0.0F) {
               return super.c($$6);
            }
         }
      }

      return super.c(new gt($$4.u(), $$0, $$4.w()));
   }

   @Override
   public dqp a(double $$0, double $$1, double $$2) {
      return this.a(super.a(ami.b($$0), ami.b($$1), ami.b($$2)));
   }

   @Override
   public int a(dqj[] $$0, dqj $$1) {
      int $$2 = 0;
      dqj $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      dqj $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      dqj $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      dqj $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      dqj $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      dqj $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      dqj $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      dqj $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      dqj $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      dqj $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      dqj $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      dqj $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      dqj $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      dqj $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      dqj $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      dqj $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      dqj $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      dqj $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      dqj $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      dqj $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      dqj $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      dqj $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      dqj $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      dqj $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      dqj $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      dqj $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable dqj $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable dqj $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected dqj a(int $$0, int $$1, int $$2) {
      dqj $$3 = null;
      dqh $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = super.a($$0, $$1, $$2);
         if ($$3 != null) {
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if ($$4 == dqh.c) {
               ++$$3.k;
            }
         }
      }

      return $$3;
   }

   private dqh b(int $$0, int $$1, int $$2) {
      return (dqh)this.l.computeIfAbsent(gt.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b, this.d, this.e, this.f, this.e(), this.d()));
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3, bce $$4, int $$5, int $$6, int $$7, boolean $$8, boolean $$9) {
      EnumSet<dqh> $$10 = EnumSet.noneOf(dqh.class);
      dqh $$11 = dqh.a;
      gt $$12 = $$4.da();
      $$11 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12);
      if ($$10.contains(dqh.h)) {
         return dqh.h;
      } else {
         dqh $$13 = dqh.a;

         for(dqh $$14 : $$10) {
            if ($$4.a($$14) < 0.0F) {
               return $$14;
            }

            if ($$4.a($$14) >= $$4.a($$13)) {
               $$13 = $$14;
            }
         }

         return $$11 == dqh.b && $$4.a($$13) == 0.0F ? dqh.b : $$13;
      }
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3) {
      gt.a $$4 = new gt.a();
      dqh $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == dqh.b && $$2 >= $$0.u_() + 1) {
         dqh $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == dqh.o || $$6 == dqh.i) {
            $$5 = dqh.o;
         } else if ($$6 == dqh.q) {
            $$5 = dqh.q;
         } else if ($$6 == dqh.s) {
            $$5 = dqh.s;
         } else if ($$6 == dqh.z) {
            $$5 = dqh.z;
         } else if ($$6 == dqh.h) {
            if (!$$4.equals(this.b.da())) {
               $$5 = dqh.h;
            }
         } else {
            $$5 = $$6 != dqh.c && $$6 != dqh.b && $$6 != dqh.j ? dqh.c : dqh.b;
         }
      }

      if ($$5 == dqh.c || $$5 == dqh.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }
}
