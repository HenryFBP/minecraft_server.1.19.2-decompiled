import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dqo extends dqk {
   private final boolean j;
   private final Long2ObjectMap<dqh> k = new Long2ObjectOpenHashMap();

   public dqo(boolean $$0) {
      this.j = $$0;
   }

   @Override
   public void a(chk $$0, bce $$1) {
      super.a($$0, $$1);
      this.k.clear();
   }

   @Override
   public void b() {
      super.b();
      this.k.clear();
   }

   @Nullable
   @Override
   public dqj a() {
      return super.a(ami.b(this.b.cy().a), ami.b(this.b.cy().b + 0.5), ami.b(this.b.cy().c));
   }

   @Nullable
   @Override
   public dqp a(double $$0, double $$1, double $$2) {
      return this.a(super.a(ami.b($$0), ami.b($$1), ami.b($$2)));
   }

   @Override
   public int a(dqj[] $$0, dqj $$1) {
      int $$2 = 0;
      Map<gy, dqj> $$3 = Maps.newEnumMap(gy.class);

      for(gy $$4 : gy.values()) {
         dqj $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for(gy $$6 : gy.c.a) {
         gy $$7 = $$6.h();
         dqj $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, (dqj)$$3.get($$6), (dqj)$$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable dqj $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable dqj $$0, @Nullable dqj $$1, @Nullable dqj $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   @Override
   protected dqj a(int $$0, int $$1, int $$2) {
      dqj $$3 = null;
      dqh $$4 = this.b($$0, $$1, $$2);
      if (this.j && $$4 == dqh.w || $$4 == dqh.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = super.a($$0, $$1, $$2);
            if ($$3 != null) {
               $$3.l = $$4;
               $$3.k = Math.max($$3.k, $$5);
               if (this.a.b_(new gt($$0, $$1, $$2)).c()) {
                  $$3.k += 8.0F;
               }
            }
         }
      }

      return $$3;
   }

   protected dqh b(int $$0, int $$1, int $$2) {
      return (dqh)this.k.computeIfAbsent(gt.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b, this.d, this.e, this.f, this.e(), this.d());
   }

   @Override
   public dqh a(cgd $$0, int $$1, int $$2, int $$3, bce $$4, int $$5, int $$6, int $$7, boolean $$8, boolean $$9) {
      gt.a $$10 = new gt.a();

      for(int $$11 = $$1; $$11 < $$1 + $$5; ++$$11) {
         for(int $$12 = $$2; $$12 < $$2 + $$6; ++$$12) {
            for(int $$13 = $$3; $$13 < $$3 + $$7; ++$$13) {
               dpv $$14 = $$0.b_($$10.d($$11, $$12, $$13));
               cvo $$15 = $$0.a_($$10.d($$11, $$12, $$13));
               if ($$14.c() && $$15.a($$0, $$10.c(), dqm.b) && $$15.h()) {
                  return dqh.w;
               }

               if (!$$14.a(akp.a)) {
                  return dqh.a;
               }
            }
         }
      }

      cvo $$16 = $$0.a_($$10);
      return $$16.a($$0, $$10, dqm.b) ? dqh.j : dqh.a;
   }
}
