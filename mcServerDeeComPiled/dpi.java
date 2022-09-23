import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongList;
import java.util.function.LongPredicate;

public abstract class dpi {
   private static final int a = 255;
   private final int b;
   private final LongLinkedOpenHashSet[] c;
   private final Long2ByteMap d;
   private int e;
   private volatile boolean f;

   protected dpi(int $$0, final int $$1, final int $$2) {
      if ($$0 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.b = $$0;
         this.c = new LongLinkedOpenHashSet[$$0];

         for(int $$3 = 0; $$3 < $$0; ++$$3) {
            this.c[$$3] = new LongLinkedOpenHashSet($$1, 0.5F) {
               protected void rehash(int $$0) {
                  if ($$0 > $$1) {
                     super.rehash($$0);
                  }

               }
            };
         }

         this.d = new Long2ByteOpenHashMap($$2, 0.5F) {
            protected void rehash(int $$0) {
               if ($$0 > $$2) {
                  super.rehash($$0);
               }

            }
         };
         this.d.defaultReturnValue((byte)-1);
         this.e = $$0;
      }
   }

   private int a(int $$0, int $$1) {
      int $$2 = $$0;
      if ($$0 > $$1) {
         $$2 = $$1;
      }

      if ($$2 > this.b - 1) {
         $$2 = this.b - 1;
      }

      return $$2;
   }

   private void a(int $$0) {
      int $$1 = this.e;
      this.e = $$0;

      for(int $$2 = $$1 + 1; $$2 < $$0; ++$$2) {
         if (!this.c[$$2].isEmpty()) {
            this.e = $$2;
            break;
         }
      }

   }

   protected void e(long $$0) {
      int $$1 = this.d.get($$0) & 255;
      if ($$1 != 255) {
         int $$2 = this.c($$0);
         int $$3 = this.a($$2, $$1);
         this.a($$0, $$3, this.b, true);
         this.f = this.e < this.b;
      }
   }

   public void a(LongPredicate $$0) {
      LongList $$1 = new LongArrayList();
      this.d.keySet().forEach($$2 -> {
         if ($$0.test($$2)) {
            $$1.add($$2);
         }

      });
      $$1.forEach(this::e);
   }

   private void a(long $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         this.d.remove($$0);
      }

      this.c[$$1].remove($$0);
      if (this.c[$$1].isEmpty() && this.e == $$1) {
         this.a($$2);
      }

   }

   private void a(long $$0, int $$1, int $$2) {
      this.d.put($$0, (byte)$$1);
      this.c[$$2].add($$0);
      if (this.e > $$2) {
         this.e = $$2;
      }

   }

   protected void f(long $$0) {
      this.a($$0, $$0, this.b - 1, false);
   }

   protected void a(long $$0, long $$1, int $$2, boolean $$3) {
      this.a($$0, $$1, $$2, this.c($$1), this.d.get($$1) & 255, $$3);
      this.f = this.e < this.b;
   }

   private void a(long $$0, long $$1, int $$2, int $$3, int $$4, boolean $$5) {
      if (!this.a($$1)) {
         $$2 = ami.a($$2, 0, this.b - 1);
         $$3 = ami.a($$3, 0, this.b - 1);
         boolean $$6;
         if ($$4 == 255) {
            $$6 = true;
            $$4 = $$3;
         } else {
            $$6 = false;
         }

         int $$8;
         if ($$5) {
            $$8 = Math.min($$4, $$2);
         } else {
            $$8 = ami.a(this.a($$1, $$0, $$2), 0, this.b - 1);
         }

         int $$10 = this.a($$3, $$4);
         if ($$3 != $$8) {
            int $$11 = this.a($$3, $$8);
            if ($$10 != $$11 && !$$6) {
               this.a($$1, $$10, $$11, false);
            }

            this.a($$1, $$8, $$11);
         } else if (!$$6) {
            this.a($$1, $$10, this.b, true);
         }

      }
   }

   protected final void b(long $$0, long $$1, int $$2, boolean $$3) {
      int $$4 = this.d.get($$1) & 255;
      int $$5 = ami.a(this.b($$0, $$1, $$2), 0, this.b - 1);
      if ($$3) {
         this.a($$0, $$1, $$5, this.c($$1), $$4, true);
      } else {
         int $$7;
         boolean $$6;
         if ($$4 == 255) {
            $$6 = true;
            $$7 = ami.a(this.c($$1), 0, this.b - 1);
         } else {
            $$7 = $$4;
            $$6 = false;
         }

         if ($$5 == $$7) {
            this.a($$0, $$1, this.b - 1, $$6 ? $$7 : this.c($$1), $$4, false);
         }
      }

   }

   protected final boolean b() {
      return this.f;
   }

   protected final int b(int $$0) {
      if (this.e >= this.b) {
         return $$0;
      } else {
         while(this.e < this.b && $$0 > 0) {
            --$$0;
            LongLinkedOpenHashSet $$1 = this.c[this.e];
            long $$2 = $$1.removeFirstLong();
            int $$3 = ami.a(this.c($$2), 0, this.b - 1);
            if ($$1.isEmpty()) {
               this.a(this.b);
            }

            int $$4 = this.d.remove($$2) & 255;
            if ($$4 < $$3) {
               this.a($$2, $$4);
               this.a($$2, $$4, true);
            } else if ($$4 > $$3) {
               this.a($$2, $$4, this.a(this.b - 1, $$4));
               this.a($$2, this.b - 1);
               this.a($$2, $$3, false);
            }
         }

         this.f = this.e < this.b;
         return $$0;
      }
   }

   public int c() {
      return this.d.size();
   }

   protected abstract boolean a(long var1);

   protected abstract int a(long var1, long var3, int var5);

   protected abstract void a(long var1, int var3, boolean var4);

   protected abstract int c(long var1);

   protected abstract void a(long var1, int var3);

   protected abstract int b(long var1, long var3, int var5);
}
