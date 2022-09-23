import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dxj {
   protected final dwz a;
   @Nullable
   private dxj[] b;

   dxj(dwz $$0) {
      this.a = $$0;
   }

   public double b(gy.a $$0) {
      int $$1 = this.a.a($$0);
      return $$1 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$1);
   }

   public double c(gy.a $$0) {
      int $$1 = this.a.b($$0);
      return $$1 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$1);
   }

   public dwl a() {
      if (this.b()) {
         throw (UnsupportedOperationException)ad.c(new UnsupportedOperationException("No bounds for empty shape."));
      } else {
         return new dwl(this.b(gy.a.a), this.b(gy.a.b), this.b(gy.a.c), this.c(gy.a.a), this.c(gy.a.b), this.c(gy.a.c));
      }
   }

   protected double a(gy.a $$0, int $$1) {
      return this.a($$0).getDouble($$1);
   }

   protected abstract DoubleList a(gy.a var1);

   public boolean b() {
      return this.a.a();
   }

   public dxj a(double $$0, double $$1, double $$2) {
      return (dxj)(this.b()
         ? dxg.a()
         : new dws(this.a, (DoubleList)(new dxf(this.a(gy.a.a), $$0)), (DoubleList)(new dxf(this.a(gy.a.b), $$1)), (DoubleList)(new dxf(this.a(gy.a.c), $$2))));
   }

   public dxj c() {
      dxj[] $$0 = new dxj[]{dxg.a()};
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0[0] = dxg.b($$0[0], dxg.a($$1, $$2, $$3, $$4, $$5, $$6), dwu.o));
      return $$0[0];
   }

   public void a(dxg.a $$0) {
      this.a
         .a(
            ($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.consume(
                  this.a(gy.a.a, $$1), this.a(gy.a.b, $$2), this.a(gy.a.c, $$3), this.a(gy.a.a, $$4), this.a(gy.a.b, $$5), this.a(gy.a.c, $$6)
               ),
            true
         );
   }

   public void b(dxg.a $$0) {
      DoubleList $$1 = this.a(gy.a.a);
      DoubleList $$2 = this.a(gy.a.b);
      DoubleList $$3 = this.a(gy.a.c);
      this.a
         .b(
            ($$4, $$5, $$6, $$7, $$8, $$9) -> $$0.consume(
                  $$1.getDouble($$4), $$2.getDouble($$5), $$3.getDouble($$6), $$1.getDouble($$7), $$2.getDouble($$8), $$3.getDouble($$9)
               ),
            true
         );
   }

   public List<dwl> d() {
      List<dwl> $$0 = Lists.newArrayList();
      this.b(($$1, $$2, $$3, $$4, $$5, $$6) -> $$0.add(new dwl($$1, $$2, $$3, $$4, $$5, $$6)));
      return $$0;
   }

   public double a(gy.a $$0, double $$1, double $$2) {
      gy.a $$3 = gr.b.a($$0);
      gy.a $$4 = gr.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.a($$0, $$5, $$6);
      return $$7 >= this.a.c($$0) ? Double.POSITIVE_INFINITY : this.a($$0, $$7);
   }

   public double b(gy.a $$0, double $$1, double $$2) {
      gy.a $$3 = gr.b.a($$0);
      gy.a $$4 = gr.c.a($$0);
      int $$5 = this.a($$3, $$1);
      int $$6 = this.a($$4, $$2);
      int $$7 = this.a.b($$0, $$5, $$6);
      return $$7 <= 0 ? Double.NEGATIVE_INFINITY : this.a($$0, $$7);
   }

   protected int a(gy.a $$0, double $$1) {
      return ami.a(0, this.a.c($$0) + 1, $$2 -> $$1 < this.a($$0, $$2)) - 1;
   }

   @Nullable
   public dwm a(dwq $$0, dwq $$1, gt $$2) {
      if (this.b()) {
         return null;
      } else {
         dwq $$3 = $$1.d($$0);
         if ($$3.g() < 1.0E-7) {
            return null;
         } else {
            dwq $$4 = $$0.e($$3.a(0.001));
            return this.a.d(this.a(gy.a.a, $$4.c - (double)$$2.u()), this.a(gy.a.b, $$4.d - (double)$$2.v()), this.a(gy.a.c, $$4.e - (double)$$2.w()))
               ? new dwm($$4, gy.a($$3.c, $$3.d, $$3.e).g(), $$2, true)
               : dwl.a(this.d(), $$0, $$1, $$2);
         }
      }
   }

   public Optional<dwq> a(dwq $$0) {
      if (this.b()) {
         return Optional.empty();
      } else {
         dwq[] $$1 = new dwq[1];
         this.b(($$2, $$3, $$4, $$5, $$6, $$7) -> {
            double $$8 = ami.a($$0.a(), $$2, $$5);
            double $$9 = ami.a($$0.b(), $$3, $$6);
            double $$10 = ami.a($$0.c(), $$4, $$7);
            if ($$1[0] == null || $$0.c($$8, $$9, $$10) < $$0.g($$1[0])) {
               $$1[0] = new dwq($$8, $$9, $$10);
            }

         });
         return Optional.of($$1[0]);
      }
   }

   public dxj a(gy $$0) {
      if (!this.b() && this != dxg.b()) {
         if (this.b != null) {
            dxj $$1 = this.b[$$0.ordinal()];
            if ($$1 != null) {
               return $$1;
            }
         } else {
            this.b = new dxj[6];
         }

         dxj $$2 = this.b($$0);
         this.b[$$0.ordinal()] = $$2;
         return $$2;
      } else {
         return this;
      }
   }

   private dxj b(gy $$0) {
      gy.a $$1 = $$0.o();
      DoubleList $$2 = this.a($$1);
      if ($$2.size() == 2 && DoubleMath.fuzzyEquals($$2.getDouble(0), 0.0, 1.0E-7) && DoubleMath.fuzzyEquals($$2.getDouble(1), 1.0, 1.0E-7)) {
         return this;
      } else {
         gy.b $$3 = $$0.f();
         int $$4 = this.a($$1, $$3 == gy.b.a ? 0.9999999 : 1.0E-7);
         return new dxh(this, $$1, $$4);
      }
   }

   public double a(gy.a $$0, dwl $$1, double $$2) {
      return this.a(gr.a($$0, gy.a.a), $$1, $$2);
   }

   protected double a(gr $$0, dwl $$1, double $$2) {
      if (this.b()) {
         return $$2;
      } else if (Math.abs($$2) < 1.0E-7) {
         return 0.0;
      } else {
         gr $$3 = $$0.a();
         gy.a $$4 = $$3.a(gy.a.a);
         gy.a $$5 = $$3.a(gy.a.b);
         gy.a $$6 = $$3.a(gy.a.c);
         double $$7 = $$1.b($$4);
         double $$8 = $$1.a($$4);
         int $$9 = this.a($$4, $$8 + 1.0E-7);
         int $$10 = this.a($$4, $$7 - 1.0E-7);
         int $$11 = Math.max(0, this.a($$5, $$1.a($$5) + 1.0E-7));
         int $$12 = Math.min(this.a.c($$5), this.a($$5, $$1.b($$5) - 1.0E-7) + 1);
         int $$13 = Math.max(0, this.a($$6, $$1.a($$6) + 1.0E-7));
         int $$14 = Math.min(this.a.c($$6), this.a($$6, $$1.b($$6) - 1.0E-7) + 1);
         int $$15 = this.a.c($$4);
         if ($$2 > 0.0) {
            for(int $$16 = $$10 + 1; $$16 < $$15; ++$$16) {
               for(int $$17 = $$11; $$17 < $$12; ++$$17) {
                  for(int $$18 = $$13; $$18 < $$14; ++$$18) {
                     if (this.a.a($$3, $$16, $$17, $$18)) {
                        double $$19 = this.a($$4, $$16) - $$7;
                        if ($$19 >= -1.0E-7) {
                           $$2 = Math.min($$2, $$19);
                        }

                        return $$2;
                     }
                  }
               }
            }
         } else if ($$2 < 0.0) {
            for(int $$20 = $$9 - 1; $$20 >= 0; --$$20) {
               for(int $$21 = $$11; $$21 < $$12; ++$$21) {
                  for(int $$22 = $$13; $$22 < $$14; ++$$22) {
                     if (this.a.a($$3, $$20, $$21, $$22)) {
                        double $$23 = this.a($$4, $$20 + 1) - $$8;
                        if ($$23 <= 1.0E-7) {
                           $$2 = Math.max($$2, $$23);
                        }

                        return $$2;
                     }
                  }
               }
            }
         }

         return $$2;
      }
   }

   public String toString() {
      return this.b() ? "EMPTY" : "VoxelShape[" + this.a() + "]";
   }
}
