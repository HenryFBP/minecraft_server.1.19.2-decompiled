import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public abstract class dpl<M extends dph<M>> extends agc {
   protected static final int a = 0;
   protected static final int b = 1;
   protected static final int c = 2;
   protected static final cxo d = new cxo();
   private static final gy[] n = gy.values();
   private final chg o;
   private final cxv p;
   protected final LongSet e = new LongOpenHashSet();
   protected final LongSet f = new LongOpenHashSet();
   protected final LongSet g = new LongOpenHashSet();
   protected volatile M h;
   protected final M i;
   protected final LongSet j = new LongOpenHashSet();
   protected final LongSet k = new LongOpenHashSet();
   protected final Long2ObjectMap<cxo> l = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet q = new LongOpenHashSet();
   private final LongSet r = new LongOpenHashSet();
   private final LongSet s = new LongOpenHashSet();
   protected volatile boolean m;

   protected dpl(chg $$0, cxv $$1, M $$2) {
      super(3, 16, 256);
      this.o = $$0;
      this.p = $$1;
      this.i = $$2;
      this.h = $$2.b();
      this.h.d();
   }

   protected boolean g(long $$0) {
      return this.a($$0, true) != null;
   }

   @Nullable
   protected cxo a(long $$0, boolean $$1) {
      return this.a((M)($$1 ? this.i : this.h), $$0);
   }

   @Nullable
   protected cxo a(M $$0, long $$1) {
      return $$0.c($$1);
   }

   @Nullable
   public cxo h(long $$0) {
      cxo $$1 = (cxo)this.l.get($$0);
      return $$1 != null ? $$1 : this.a($$0, false);
   }

   protected abstract int d(long var1);

   protected int i(long $$0) {
      long $$1 = hq.e($$0);
      cxo $$2 = this.a($$1, true);
      return $$2.a(hq.b(gt.a($$0)), hq.b(gt.b($$0)), hq.b(gt.c($$0)));
   }

   protected void b(long $$0, int $$1) {
      long $$2 = hq.e($$0);
      if (this.j.add($$2)) {
         this.i.a($$2);
      }

      cxo $$3 = this.a($$2, true);
      $$3.a(hq.b(gt.a($$0)), hq.b(gt.b($$0)), hq.b(gt.c($$0)), $$1);
      hq.a($$0, this.k::add);
   }

   @Override
   protected int c(long $$0) {
      if ($$0 == Long.MAX_VALUE) {
         return 2;
      } else if (this.e.contains($$0)) {
         return 0;
      } else {
         return !this.s.contains($$0) && this.i.b($$0) ? 1 : 2;
      }
   }

   @Override
   protected int b(long $$0) {
      if (this.f.contains($$0)) {
         return 2;
      } else {
         return !this.e.contains($$0) && !this.g.contains($$0) ? 2 : 0;
      }
   }

   @Override
   protected void a(long $$0, int $$1) {
      int $$2 = this.c($$0);
      if ($$2 != 0 && $$1 == 0) {
         this.e.add($$0);
         this.g.remove($$0);
      }

      if ($$2 == 0 && $$1 != 0) {
         this.e.remove($$0);
         this.f.remove($$0);
      }

      if ($$2 >= 2 && $$1 != 2) {
         if (this.s.contains($$0)) {
            this.s.remove($$0);
         } else {
            this.i.a($$0, this.j($$0));
            this.j.add($$0);
            this.k($$0);
            int $$3 = hq.b($$0);
            int $$4 = hq.c($$0);
            int $$5 = hq.d($$0);

            for(int $$6 = -1; $$6 <= 1; ++$$6) {
               for(int $$7 = -1; $$7 <= 1; ++$$7) {
                  for(int $$8 = -1; $$8 <= 1; ++$$8) {
                     this.k.add(hq.b($$3 + $$7, $$4 + $$8, $$5 + $$6));
                  }
               }
            }
         }
      }

      if ($$2 != 2 && $$1 >= 2) {
         this.s.add($$0);
      }

      this.m = !this.s.isEmpty();
   }

   protected cxo j(long $$0) {
      cxo $$1 = (cxo)this.l.get($$0);
      return $$1 != null ? $$1 : new cxo();
   }

   protected void a(dpj<?, ?> $$0, long $$1) {
      if ($$0.c() != 0) {
         if ($$0.c() < 8192) {
            $$0.a($$1x -> hq.e($$1x) == $$1);
         } else {
            int $$2 = hq.c(hq.b($$1));
            int $$3 = hq.c(hq.c($$1));
            int $$4 = hq.c(hq.d($$1));

            for(int $$5 = 0; $$5 < 16; ++$$5) {
               for(int $$6 = 0; $$6 < 16; ++$$6) {
                  for(int $$7 = 0; $$7 < 16; ++$$7) {
                     long $$8 = gt.a($$2 + $$5, $$3 + $$6, $$4 + $$7);
                     $$0.e($$8);
                  }
               }
            }

         }
      }
   }

   protected boolean a() {
      return this.m;
   }

   protected void a(dpj<M, ?> $$0, boolean $$1, boolean $$2) {
      if (this.a() || !this.l.isEmpty()) {
         LongIterator $$12 = this.s.iterator();

         while($$12.hasNext()) {
            long $$3 = $$12.next();
            this.a($$0, $$3);
            cxo $$4 = (cxo)this.l.remove($$3);
            cxo $$5 = this.i.d($$3);
            if (this.r.contains(hq.f($$3))) {
               if ($$4 != null) {
                  this.l.put($$3, $$4);
               } else if ($$5 != null) {
                  this.l.put($$3, $$5);
               }
            }
         }

         this.i.c();
         $$12 = this.s.iterator();

         while($$12.hasNext()) {
            long $$6 = $$12.next();
            this.l($$6);
         }

         this.s.clear();
         this.m = false;
         ObjectIterator<Entry<cxo>> $$12 = this.l.long2ObjectEntrySet().iterator();

         while($$12.hasNext()) {
            Entry<cxo> $$7 = (Entry)$$12.next();
            long $$8 = $$7.getLongKey();
            if (this.g($$8)) {
               cxo $$9 = (cxo)$$7.getValue();
               if (this.i.c($$8) != $$9) {
                  this.a($$0, $$8);
                  this.i.a($$8, $$9);
                  this.j.add($$8);
               }
            }
         }

         this.i.c();
         if (!$$2) {
            LongIterator var11 = this.l.keySet().iterator();

            while(var11.hasNext()) {
               long $$10 = var11.next();
               this.b($$0, $$10);
            }
         } else {
            LongIterator var12 = this.q.iterator();

            while(var12.hasNext()) {
               long $$11 = var12.next();
               this.b($$0, $$11);
            }
         }

         this.q.clear();
         $$12 = this.l.long2ObjectEntrySet().iterator();

         while($$12.hasNext()) {
            Entry<cxo> $$13 = (Entry)$$12.next();
            long $$14 = $$13.getLongKey();
            if (this.g($$14)) {
               $$12.remove();
            }
         }

      }
   }

   private void b(dpj<M, ?> $$0, long $$1) {
      if (this.g($$1)) {
         int $$2 = hq.c(hq.b($$1));
         int $$3 = hq.c(hq.c($$1));
         int $$4 = hq.c(hq.d($$1));

         for(gy $$5 : n) {
            long $$6 = hq.a($$1, $$5);
            if (!this.l.containsKey($$6) && this.g($$6)) {
               for(int $$7 = 0; $$7 < 16; ++$$7) {
                  for(int $$8 = 0; $$8 < 16; ++$$8) {
                     long $$9;
                     long $$10;
                     switch($$5) {
                        case a:
                           $$9 = gt.a($$2 + $$8, $$3, $$4 + $$7);
                           $$10 = gt.a($$2 + $$8, $$3 - 1, $$4 + $$7);
                           break;
                        case b:
                           $$9 = gt.a($$2 + $$8, $$3 + 16 - 1, $$4 + $$7);
                           $$10 = gt.a($$2 + $$8, $$3 + 16, $$4 + $$7);
                           break;
                        case c:
                           $$9 = gt.a($$2 + $$7, $$3 + $$8, $$4);
                           $$10 = gt.a($$2 + $$7, $$3 + $$8, $$4 - 1);
                           break;
                        case d:
                           $$9 = gt.a($$2 + $$7, $$3 + $$8, $$4 + 16 - 1);
                           $$10 = gt.a($$2 + $$7, $$3 + $$8, $$4 + 16);
                           break;
                        case e:
                           $$9 = gt.a($$2, $$3 + $$7, $$4 + $$8);
                           $$10 = gt.a($$2 - 1, $$3 + $$7, $$4 + $$8);
                           break;
                        default:
                           $$9 = gt.a($$2 + 16 - 1, $$3 + $$7, $$4 + $$8);
                           $$10 = gt.a($$2 + 16, $$3 + $$7, $$4 + $$8);
                     }

                     $$0.a($$9, $$10, $$0.b($$9, $$10, $$0.c($$9)), false);
                     $$0.a($$10, $$9, $$0.b($$10, $$9, $$0.c($$10)), false);
                  }
               }
            }
         }

      }
   }

   protected void k(long $$0) {
   }

   protected void l(long $$0) {
   }

   protected void b(long $$0, boolean $$1) {
   }

   public void c(long $$0, boolean $$1) {
      if ($$1) {
         this.r.add($$0);
      } else {
         this.r.remove($$0);
      }

   }

   protected void a(long $$0, @Nullable cxo $$1, boolean $$2) {
      if ($$1 != null) {
         this.l.put($$0, $$1);
         if (!$$2) {
            this.q.add($$0);
         }
      } else {
         this.l.remove($$0);
      }

   }

   protected void d(long $$0, boolean $$1) {
      boolean $$2 = this.e.contains($$0);
      if (!$$2 && !$$1) {
         this.g.add($$0);
         this.a(Long.MAX_VALUE, $$0, 0, true);
      }

      if ($$2 && $$1) {
         this.f.add($$0);
         this.a(Long.MAX_VALUE, $$0, 2, false);
      }

   }

   protected void d() {
      if (this.b()) {
         this.b(Integer.MAX_VALUE);
      }

   }

   protected void e() {
      if (!this.j.isEmpty()) {
         M $$0 = this.i.b();
         $$0.d();
         this.h = $$0;
         this.j.clear();
      }

      if (!this.k.isEmpty()) {
         LongIterator $$1 = this.k.iterator();

         while($$1.hasNext()) {
            long $$2 = $$1.nextLong();
            this.p.a(this.o, hq.a($$2));
         }

         this.k.clear();
      }

   }
}
