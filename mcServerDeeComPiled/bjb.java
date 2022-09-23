import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class bjb extends bip {
   protected final bcl a;
   private final double b;
   @Nullable
   private dql c;
   private gt d;
   private final boolean e;
   private final List<gt> f = Lists.newArrayList();
   private final int g;
   private final BooleanSupplier h;

   public bjb(bcl $$0, double $$1, boolean $$2, int $$3, BooleanSupplier $$4) {
      this.a = $$0;
      this.b = $$1;
      this.e = $$2;
      this.g = $$3;
      this.h = $$4;
      this.a(EnumSet.of(bip.a.a));
      if (!bmk.a($$0)) {
         throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
      }
   }

   @Override
   public boolean a() {
      if (!bmk.a(this.a)) {
         return false;
      } else {
         this.h();
         if (this.e && this.a.s.M()) {
            return false;
         } else {
            agg $$0 = (agg)this.a.s;
            gt $$1 = this.a.da();
            if (!$$0.a($$1, 6)) {
               return false;
            } else {
               dwq $$2 = bmm.a(this.a, 15, 7, $$2x -> {
                  if (!$$0.b($$2x)) {
                     return Double.NEGATIVE_INFINITY;
                  } else {
                     Optional<gt> $$3x = $$0.x().d($$0xx -> $$0xx.a(aku.b), this::a, $$2x, 10, bms.b.b);
                     return $$3x.map($$1xx -> -$$1xx.j($$1)).orElse(Double.NEGATIVE_INFINITY);
                  }
               });
               if ($$2 == null) {
                  return false;
               } else {
                  Optional<gt> $$3 = $$0.x().d($$0x -> $$0x.a(aku.b), this::a, new gt($$2), 10, bms.b.b);
                  if ($$3.isEmpty()) {
                     return false;
                  } else {
                     this.d = ((gt)$$3.get()).h();
                     blb $$4 = (blb)this.a.D();
                     boolean $$5 = $$4.f();
                     $$4.b(this.h.getAsBoolean());
                     this.c = $$4.a(this.d, 0);
                     $$4.b($$5);
                     if (this.c == null) {
                        dwq $$6 = bmj.a(this.a, 10, 7, dwq.c(this.d), (float) (Math.PI / 2));
                        if ($$6 == null) {
                           return false;
                        }

                        $$4.b(this.h.getAsBoolean());
                        this.c = this.a.D().a($$6.c, $$6.d, $$6.e, 0);
                        $$4.b($$5);
                        if (this.c == null) {
                           return false;
                        }
                     }

                     for(int $$7 = 0; $$7 < this.c.e(); ++$$7) {
                        dqj $$8 = this.c.a($$7);
                        gt $$9 = new gt($$8.a, $$8.b + 1, $$8.c);
                        if (clp.a(this.a.s, $$9)) {
                           this.c = this.a.D().a((double)$$8.a, (double)$$8.b, (double)$$8.c, 0);
                           break;
                        }
                     }

                     return this.c != null;
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean b() {
      if (this.a.D().l()) {
         return false;
      } else {
         return !this.d.a(this.a.cY(), (double)(this.a.cW() + (float)this.g));
      }
   }

   @Override
   public void c() {
      this.a.D().a(this.c, this.b);
   }

   @Override
   public void d() {
      if (this.a.D().l() || this.d.a(this.a.cY(), (double)this.g)) {
         this.f.add(this.d);
      }

   }

   private boolean a(gt $$0) {
      for(gt $$1 : this.f) {
         if (Objects.equals($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   private void h() {
      if (this.f.size() > 15) {
         this.f.remove(0);
      }

   }
}
