import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class dpt extends dpu {
   public static final cwf a = cwe.i;
   public static final cwo b = cwe.aM;
   private static final int e = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cjt.a>> f = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cjt.a> $$0 = new Object2ByteLinkedOpenHashMap<cjt.a>(200) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });
   private final Map<dpv, dxj> g = Maps.newIdentityHashMap();

   @Override
   protected void a(cvp.a<dpu, dpv> $$0) {
      $$0.a(a);
   }

   @Override
   public dwq a(cgd $$0, gt $$1, dpv $$2) {
      double $$3 = 0.0;
      double $$4 = 0.0;
      gt.a $$5 = new gt.a();

      for(gy $$6 : gy.c.a) {
         $$5.a($$1, $$6);
         dpv $$7 = $$0.b_($$5);
         if (this.g($$7)) {
            float $$8 = $$7.d();
            float $$9 = 0.0F;
            if ($$8 == 0.0F) {
               if (!$$0.a_($$5).d().c()) {
                  gt $$10 = $$5.c();
                  dpv $$11 = $$0.b_($$10);
                  if (this.g($$11)) {
                     $$8 = $$11.d();
                     if ($$8 > 0.0F) {
                        $$9 = $$2.d() - ($$8 - 0.8888889F);
                     }
                  }
               }
            } else if ($$8 > 0.0F) {
               $$9 = $$2.d() - $$8;
            }

            if ($$9 != 0.0F) {
               $$3 += (double)((float)$$6.j() * $$9);
               $$4 += (double)((float)$$6.l() * $$9);
            }
         }
      }

      dwq $$12 = new dwq($$3, 0.0, $$4);
      if ($$2.c(a)) {
         for(gy $$13 : gy.c.a) {
            $$5.a($$1, $$13);
            if (this.a($$0, $$5, $$13) || this.a($$0, $$5.b(), $$13)) {
               $$12 = $$12.d().b(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return $$12.d();
   }

   private boolean g(dpv $$0) {
      return $$0.c() || $$0.a().a(this);
   }

   protected boolean a(cgd $$0, gt $$1, gy $$2) {
      cvo $$3 = $$0.a_($$1);
      dpv $$4 = $$0.b_($$1);
      if ($$4.a().a(this)) {
         return false;
      } else if ($$2 == gy.b) {
         return true;
      } else {
         return $$3.d() == dpz.H ? false : $$3.d($$0, $$1, $$2);
      }
   }

   protected void a(cgy $$0, gt $$1, dpv $$2) {
      if (!$$2.c()) {
         cvo $$3 = $$0.a_($$1);
         gt $$4 = $$1.c();
         cvo $$5 = $$0.a_($$4);
         dpv $$6 = this.a((cha)$$0, $$4, $$5);
         if (this.a($$0, $$1, $$3, gy.a, $$4, $$5, $$0.b_($$4), $$6.a())) {
            this.a($$0, $$4, $$5, gy.a, $$6);
            if (this.a($$0, $$1) >= 3) {
               this.a($$0, $$1, $$2, $$3);
            }
         } else if ($$2.b() || !this.a($$0, $$6.a(), $$1, $$3, $$4, $$5)) {
            this.a($$0, $$1, $$2, $$3);
         }

      }
   }

   private void a(cgy $$0, gt $$1, dpv $$2, cvo $$3) {
      int $$4 = $$2.e() - this.c($$0);
      if ($$2.c(a)) {
         $$4 = 7;
      }

      if ($$4 > 0) {
         Map<gy, dpv> $$5 = this.b($$0, $$1, $$3);

         for(Entry<gy, dpv> $$6 : $$5.entrySet()) {
            gy $$7 = (gy)$$6.getKey();
            dpv $$8 = (dpv)$$6.getValue();
            gt $$9 = $$1.a($$7);
            cvo $$10 = $$0.a_($$9);
            if (this.a($$0, $$1, $$3, $$7, $$9, $$10, $$0.b_($$9), $$8.a())) {
               this.a($$0, $$9, $$10, $$7, $$8);
            }
         }

      }
   }

   protected dpv a(cha $$0, gt $$1, cvo $$2) {
      int $$3 = 0;
      int $$4 = 0;

      for(gy $$5 : gy.c.a) {
         gt $$6 = $$1.a($$5);
         cvo $$7 = $$0.a_($$6);
         dpv $$8 = $$7.p();
         if ($$8.a().a(this) && this.a($$5, $$0, $$1, $$2, $$6, $$7)) {
            if ($$8.b()) {
               ++$$4;
            }

            $$3 = Math.max($$3, $$8.e());
         }
      }

      if (this.f() && $$4 >= 2) {
         cvo $$9 = $$0.a_($$1.c());
         dpv $$10 = $$9.p();
         if ($$9.d().b() || this.h($$10)) {
            return this.a(false);
         }
      }

      gt $$11 = $$1.b();
      cvo $$12 = $$0.a_($$11);
      dpv $$13 = $$12.p();
      if (!$$13.c() && $$13.a().a(this) && this.a(gy.b, $$0, $$1, $$2, $$11, $$12)) {
         return this.a(8, true);
      } else {
         int $$14 = $$3 - this.c($$0);
         return $$14 <= 0 ? dpw.a.h() : this.a($$14, false);
      }
   }

   private boolean a(gy $$0, cgd $$1, gt $$2, cvo $$3, gt $$4, cvo $$5) {
      Object2ByteLinkedOpenHashMap<cjt.a> $$7;
      if (!$$3.b().n() && !$$5.b().n()) {
         $$7 = (Object2ByteLinkedOpenHashMap)f.get();
      } else {
         $$7 = null;
      }

      cjt.a $$8;
      if ($$7 != null) {
         $$8 = new cjt.a($$3, $$5, $$0);
         byte $$9 = $$7.getAndMoveToFirst($$8);
         if ($$9 != 127) {
            return $$9 != 0;
         }
      } else {
         $$8 = null;
      }

      dxj $$11 = $$3.k($$1, $$2);
      dxj $$12 = $$5.k($$1, $$4);
      boolean $$13 = !dxg.b($$11, $$12, $$0);
      if ($$7 != null) {
         if ($$7.size() == 200) {
            $$7.removeLastByte();
         }

         $$7.putAndMoveToFirst($$8, (byte)($$13 ? 1 : 0));
      }

      return $$13;
   }

   public abstract dpu d();

   public dpv a(int $$0, boolean $$1) {
      return this.d().h().a(b, $$0).a(a, $$1);
   }

   public abstract dpu e();

   public dpv a(boolean $$0) {
      return this.e().h().a(a, $$0);
   }

   protected abstract boolean f();

   protected void a(cgy $$0, gt $$1, cvo $$2, gy $$3, dpv $$4) {
      if ($$2.b() instanceof coa) {
         ((coa)$$2.b()).a($$0, $$1, $$2, $$4);
      } else {
         if (!$$2.h()) {
            this.a($$0, $$1, $$2);
         }

         $$0.a($$1, $$4.g(), 3);
      }

   }

   protected abstract void a(cgy var1, gt var2, cvo var3);

   private static short a(gt $$0, gt $$1) {
      int $$2 = $$1.u() - $$0.u();
      int $$3 = $$1.w() - $$0.w();
      return (short)(($$2 + 128 & 0xFF) << 8 | $$3 + 128 & 0xFF);
   }

   protected int a(cha $$0, gt $$1, int $$2, gy $$3, cvo $$4, gt $$5, Short2ObjectMap<Pair<cvo, dpv>> $$6, Short2BooleanMap $$7) {
      int $$8 = 1000;

      for(gy $$9 : gy.c.a) {
         if ($$9 != $$3) {
            gt $$10 = $$1.a($$9);
            short $$11 = a($$5, $$10);
            Pair<cvo, dpv> $$12 = (Pair)$$6.computeIfAbsent($$11, $$2x -> {
               cvo $$3x = $$0.a_($$10);
               return Pair.of($$3x, $$3x.p());
            });
            cvo $$13 = (cvo)$$12.getFirst();
            dpv $$14 = (dpv)$$12.getSecond();
            if (this.a($$0, this.d(), $$1, $$4, $$9, $$10, $$13, $$14)) {
               boolean $$15 = $$7.computeIfAbsent($$11, $$3x -> {
                  gt $$4x = $$10.c();
                  cvo $$5x = $$0.a_($$4x);
                  return this.a($$0, this.d(), $$10, $$13, $$4x, $$5x);
               });
               if ($$15) {
                  return $$2;
               }

               if ($$2 < this.b($$0)) {
                  int $$16 = this.a($$0, $$10, $$2 + 1, $$9.g(), $$13, $$5, $$6, $$7);
                  if ($$16 < $$8) {
                     $$8 = $$16;
                  }
               }
            }
         }
      }

      return $$8;
   }

   private boolean a(cgd $$0, dpu $$1, gt $$2, cvo $$3, gt $$4, cvo $$5) {
      if (!this.a(gy.a, $$0, $$2, $$3, $$4, $$5)) {
         return false;
      } else {
         return $$5.p().a().a(this) ? true : this.a($$0, $$4, $$5, $$1);
      }
   }

   private boolean a(cgd $$0, dpu $$1, gt $$2, cvo $$3, gy $$4, gt $$5, cvo $$6, dpv $$7) {
      return !this.h($$7) && this.a($$4, $$0, $$2, $$3, $$5, $$6) && this.a($$0, $$5, $$6, $$1);
   }

   private boolean h(dpv $$0) {
      return $$0.a().a(this) && $$0.b();
   }

   protected abstract int b(cha var1);

   private int a(cha $$0, gt $$1) {
      int $$2 = 0;

      for(gy $$3 : gy.c.a) {
         gt $$4 = $$1.a($$3);
         dpv $$5 = $$0.b_($$4);
         if (this.h($$5)) {
            ++$$2;
         }
      }

      return $$2;
   }

   protected Map<gy, dpv> b(cha $$0, gt $$1, cvo $$2) {
      int $$3 = 1000;
      Map<gy, dpv> $$4 = Maps.newEnumMap(gy.class);
      Short2ObjectMap<Pair<cvo, dpv>> $$5 = new Short2ObjectOpenHashMap();
      Short2BooleanMap $$6 = new Short2BooleanOpenHashMap();

      for(gy $$7 : gy.c.a) {
         gt $$8 = $$1.a($$7);
         short $$9 = a($$1, $$8);
         Pair<cvo, dpv> $$10 = (Pair)$$5.computeIfAbsent($$9, $$2x -> {
            cvo $$3x = $$0.a_($$8);
            return Pair.of($$3x, $$3x.p());
         });
         cvo $$11 = (cvo)$$10.getFirst();
         dpv $$12 = (dpv)$$10.getSecond();
         dpv $$13 = this.a($$0, $$8, $$11);
         if (this.a($$0, $$13.a(), $$1, $$2, $$7, $$8, $$11, $$12)) {
            gt $$14 = $$8.c();
            boolean $$15 = $$6.computeIfAbsent($$9, $$4x -> {
               cvo $$5x = $$0.a_($$14);
               return this.a($$0, this.d(), $$8, $$11, $$14, $$5x);
            });
            int $$16;
            if ($$15) {
               $$16 = 0;
            } else {
               $$16 = this.a($$0, $$8, 1, $$7.g(), $$11, $$1, $$5, $$6);
            }

            if ($$16 < $$3) {
               $$4.clear();
            }

            if ($$16 <= $$3) {
               $$4.put($$7, $$13);
               $$3 = $$16;
            }
         }
      }

      return $$4;
   }

   private boolean a(cgd $$0, gt $$1, cvo $$2, dpu $$3) {
      cjt $$4 = $$2.b();
      if ($$4 instanceof coa) {
         return ((coa)$$4).a($$0, $$1, $$2, $$3);
      } else if (!($$4 instanceof clp) && !$$2.a(akl.as) && !$$2.a(cju.cx) && !$$2.a(cju.db) && !$$2.a(cju.lO)) {
         dpz $$5 = $$2.d();
         if ($$5 != dpz.c && $$5 != dpz.b && $$5 != dpz.f && $$5 != dpz.i) {
            return !$$5.c();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   protected boolean a(cgd $$0, gt $$1, cvo $$2, gy $$3, gt $$4, cvo $$5, dpv $$6, dpu $$7) {
      return $$6.a($$0, $$4, $$7, $$3) && this.a($$3, $$0, $$1, $$2, $$4, $$5) && this.a($$0, $$4, $$5, $$7);
   }

   protected abstract int c(cha var1);

   protected int a(cgx $$0, gt $$1, dpv $$2, dpv $$3) {
      return this.a($$0);
   }

   @Override
   public void a(cgx $$0, gt $$1, dpv $$2) {
      if (!$$2.b()) {
         dpv $$3 = this.a((cha)$$0, $$1, $$0.a_($$1));
         int $$4 = this.a($$0, $$1, $$2, $$3);
         if ($$3.c()) {
            $$2 = $$3;
            $$0.a($$1, cju.a.m(), 3);
         } else if (!$$3.equals($$2)) {
            $$2 = $$3;
            cvo $$5 = $$3.g();
            $$0.a($$1, $$5, 2);
            $$0.a($$1, $$3.a(), $$4);
            $$0.a($$1, $$5.b());
         }
      }

      this.a((cgy)$$0, $$1, $$2);
   }

   protected static int e(dpv $$0) {
      return $$0.b() ? 0 : 8 - Math.min($$0.e(), 8) + ($$0.c(a) ? 8 : 0);
   }

   private static boolean c(dpv $$0, cgd $$1, gt $$2) {
      return $$0.a().a($$1.b_($$2.b()).a());
   }

   @Override
   public float a(dpv $$0, cgd $$1, gt $$2) {
      return c($$0, $$1, $$2) ? 1.0F : $$0.d();
   }

   @Override
   public float a(dpv $$0) {
      return (float)$$0.e() / 9.0F;
   }

   @Override
   public abstract int d(dpv var1);

   @Override
   public dxj b(dpv $$0, cgd $$1, gt $$2) {
      return $$0.e() == 9 && c($$0, $$1, $$2) ? dxg.b() : (dxj)this.g.computeIfAbsent($$0, $$2x -> dxg.a(0.0, 0.0, 0.0, 1.0, (double)$$2x.a($$1, $$2), 1.0));
   }
}
