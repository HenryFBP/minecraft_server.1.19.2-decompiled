import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;

public class dpp extends dpl<dpp.a> {
   private static final gy[] n = new gy[]{gy.c, gy.d, gy.e, gy.f};
   private final LongSet o = new LongOpenHashSet();
   private final LongSet p = new LongOpenHashSet();
   private final LongSet q = new LongOpenHashSet();
   private final LongSet r = new LongOpenHashSet();
   private volatile boolean s;

   protected dpp(cxv $$0) {
      super(chg.a, $$0, new dpp.a(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected int d(long $$0) {
      return this.e($$0, false);
   }

   protected int e(long $$0, boolean $$1) {
      long $$2 = hq.e($$0);
      int $$3 = hq.c($$2);
      dpp.a $$4 = $$1 ? this.i : this.h;
      int $$5 = $$4.c.get(hq.f($$2));
      if ($$5 != $$4.b && $$3 < $$5) {
         cxo $$6 = this.a($$4, $$2);
         if ($$6 == null) {
            for($$0 = gt.e($$0); $$6 == null; $$6 = this.a($$4, $$2)) {
               if (++$$3 >= $$5) {
                  return 15;
               }

               $$0 = gt.a($$0, 0, 16, 0);
               $$2 = hq.a($$2, gy.b);
            }
         }

         return $$6.a(hq.b(gt.a($$0)), hq.b(gt.b($$0)), hq.b(gt.c($$0)));
      } else {
         return $$1 && !this.n($$2) ? 0 : 15;
      }
   }

   @Override
   protected void k(long $$0) {
      int $$1 = hq.c($$0);
      if (this.i.b > $$1) {
         this.i.b = $$1;
         this.i.c.defaultReturnValue(this.i.b);
      }

      long $$2 = hq.f($$0);
      int $$3 = this.i.c.get($$2);
      if ($$3 < $$1 + 1) {
         this.i.c.put($$2, $$1 + 1);
         if (this.r.contains($$2)) {
            this.p($$0);
            if ($$3 > this.i.b) {
               long $$4 = hq.b(hq.b($$0), $$3 - 1, hq.d($$0));
               this.o($$4);
            }

            this.f();
         }
      }

   }

   private void o(long $$0) {
      this.q.add($$0);
      this.p.remove($$0);
   }

   private void p(long $$0) {
      this.p.add($$0);
      this.q.remove($$0);
   }

   private void f() {
      this.s = !this.p.isEmpty() || !this.q.isEmpty();
   }

   @Override
   protected void l(long $$0) {
      long $$1 = hq.f($$0);
      boolean $$2 = this.r.contains($$1);
      if ($$2) {
         this.o($$0);
      }

      int $$3 = hq.c($$0);
      if (this.i.c.get($$1) == $$3 + 1) {
         long $$4;
         for($$4 = $$0; !this.g($$4) && this.a($$3); $$4 = hq.a($$4, gy.a)) {
            --$$3;
         }

         if (this.g($$4)) {
            this.i.c.put($$1, $$3 + 1);
            if ($$2) {
               this.p($$4);
            }
         } else {
            this.i.c.remove($$1);
         }
      }

      if ($$2) {
         this.f();
      }

   }

   @Override
   protected void b(long $$0, boolean $$1) {
      this.d();
      if ($$1 && this.r.add($$0)) {
         int $$2 = this.i.c.get($$0);
         if ($$2 != this.i.b) {
            long $$3 = hq.b(hq.b($$0), $$2 - 1, hq.d($$0));
            this.p($$3);
            this.f();
         }
      } else if (!$$1) {
         this.r.remove($$0);
      }

   }

   @Override
   protected boolean a() {
      return super.a() || this.s;
   }

   @Override
   protected cxo j(long $$0) {
      cxo $$1 = (cxo)this.l.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         long $$2 = hq.a($$0, gy.b);
         int $$3 = this.i.c.get(hq.f($$0));
         if ($$3 != this.i.b && hq.c($$2) < $$3) {
            cxo $$4;
            while(($$4 = this.a($$2, true)) == null) {
               $$2 = hq.a($$2, gy.b);
            }

            return a($$4);
         } else {
            return new cxo();
         }
      }
   }

   private static cxo a(cxo $$0) {
      if ($$0.c()) {
         return new cxo();
      } else {
         byte[] $$1 = $$0.a();
         byte[] $$2 = new byte[2048];

         for(int $$3 = 0; $$3 < 16; ++$$3) {
            System.arraycopy($$1, 0, $$2, $$3 * 128, 128);
         }

         return new cxo($$2);
      }
   }

   @Override
   protected void a(dpj<dpp.a, ?> $$0, boolean $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1) {
         if (!this.p.isEmpty()) {
            LongIterator var4 = this.p.iterator();

            while(var4.hasNext()) {
               long $$3 = var4.next();
               int $$4 = this.c($$3);
               if ($$4 != 2 && !this.q.contains($$3) && this.o.add($$3)) {
                  if ($$4 == 1) {
                     this.a($$0, $$3);
                     if (this.j.add($$3)) {
                        this.i.a($$3);
                     }

                     Arrays.fill(this.a($$3, true).a(), (byte)-1);
                     int $$5 = hq.c(hq.b($$3));
                     int $$6 = hq.c(hq.c($$3));
                     int $$7 = hq.c(hq.d($$3));

                     for(gy $$8 : n) {
                        long $$9 = hq.a($$3, $$8);
                        if ((this.q.contains($$9) || !this.o.contains($$9) && !this.p.contains($$9)) && this.g($$9)) {
                           for(int $$10 = 0; $$10 < 16; ++$$10) {
                              for(int $$11 = 0; $$11 < 16; ++$$11) {
                                 long $$12;
                                 long $$13;
                                 switch($$8) {
                                    case c:
                                       $$12 = gt.a($$5 + $$10, $$6 + $$11, $$7);
                                       $$13 = gt.a($$5 + $$10, $$6 + $$11, $$7 - 1);
                                       break;
                                    case d:
                                       $$12 = gt.a($$5 + $$10, $$6 + $$11, $$7 + 16 - 1);
                                       $$13 = gt.a($$5 + $$10, $$6 + $$11, $$7 + 16);
                                       break;
                                    case e:
                                       $$12 = gt.a($$5, $$6 + $$10, $$7 + $$11);
                                       $$13 = gt.a($$5 - 1, $$6 + $$10, $$7 + $$11);
                                       break;
                                    default:
                                       $$12 = gt.a($$5 + 16 - 1, $$6 + $$10, $$7 + $$11);
                                       $$13 = gt.a($$5 + 16, $$6 + $$10, $$7 + $$11);
                                 }

                                 $$0.a($$12, $$13, $$0.b($$12, $$13, 0), true);
                              }
                           }
                        }
                     }

                     for(int $$20 = 0; $$20 < 16; ++$$20) {
                        for(int $$21 = 0; $$21 < 16; ++$$21) {
                           long $$22 = gt.a(hq.a(hq.b($$3), $$20), hq.c(hq.c($$3)), hq.a(hq.d($$3), $$21));
                           long $$23 = gt.a(hq.a(hq.b($$3), $$20), hq.c(hq.c($$3)) - 1, hq.a(hq.d($$3), $$21));
                           $$0.a($$22, $$23, $$0.b($$22, $$23, 0), true);
                        }
                     }
                  } else {
                     for(int $$24 = 0; $$24 < 16; ++$$24) {
                        for(int $$25 = 0; $$25 < 16; ++$$25) {
                           long $$26 = gt.a(hq.a(hq.b($$3), $$24), hq.a(hq.c($$3), 15), hq.a(hq.d($$3), $$25));
                           $$0.a(Long.MAX_VALUE, $$26, 0, true);
                        }
                     }
                  }
               }
            }
         }

         this.p.clear();
         if (!this.q.isEmpty()) {
            LongIterator var23 = this.q.iterator();

            while(var23.hasNext()) {
               long $$27 = var23.next();
               if (this.o.remove($$27) && this.g($$27)) {
                  for(int $$28 = 0; $$28 < 16; ++$$28) {
                     for(int $$29 = 0; $$29 < 16; ++$$29) {
                        long $$30 = gt.a(hq.a(hq.b($$27), $$28), hq.a(hq.c($$27), 15), hq.a(hq.d($$27), $$29));
                        $$0.a(Long.MAX_VALUE, $$30, 15, false);
                     }
                  }
               }
            }
         }

         this.q.clear();
         this.s = false;
      }
   }

   protected boolean a(int $$0) {
      return $$0 >= this.i.b;
   }

   protected boolean m(long $$0) {
      long $$1 = hq.f($$0);
      int $$2 = this.i.c.get($$1);
      return $$2 == this.i.b || hq.c($$0) >= $$2;
   }

   protected boolean n(long $$0) {
      long $$1 = hq.f($$0);
      return this.r.contains($$1);
   }

   protected static final class a extends dph<dpp.a> {
      int b;
      final Long2IntOpenHashMap c;

      public a(Long2ObjectOpenHashMap<cxo> $$0, Long2IntOpenHashMap $$1, int $$2) {
         super($$0);
         this.c = $$1;
         $$1.defaultReturnValue($$2);
         this.b = $$2;
      }

      public dpp.a a() {
         return new dpp.a(this.a.clone(), this.c.clone(), this.b);
      }
   }
}
