import java.util.BitSet;

public final class dwt extends dwz {
   private final BitSet d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;

   public dwt(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
      this.d = new BitSet($$0 * $$1 * $$2);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public static dwt a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
      dwt $$9 = new dwt($$0, $$1, $$2);
      $$9.e = $$3;
      $$9.f = $$4;
      $$9.g = $$5;
      $$9.h = $$6;
      $$9.i = $$7;
      $$9.j = $$8;

      for(int $$10 = $$3; $$10 < $$6; ++$$10) {
         for(int $$11 = $$4; $$11 < $$7; ++$$11) {
            for(int $$12 = $$5; $$12 < $$8; ++$$12) {
               $$9.a($$10, $$11, $$12, false);
            }
         }
      }

      return $$9;
   }

   public dwt(dwz $$0) {
      super($$0.a, $$0.b, $$0.c);
      if ($$0 instanceof dwt) {
         this.d = (BitSet)((dwt)$$0).d.clone();
      } else {
         this.d = new BitSet(this.a * this.b * this.c);

         for(int $$1 = 0; $$1 < this.a; ++$$1) {
            for(int $$2 = 0; $$2 < this.b; ++$$2) {
               for(int $$3 = 0; $$3 < this.c; ++$$3) {
                  if ($$0.b($$1, $$2, $$3)) {
                     this.d.set(this.a($$1, $$2, $$3));
                  }
               }
            }
         }
      }

      this.e = $$0.a(gy.a.a);
      this.f = $$0.a(gy.a.b);
      this.g = $$0.a(gy.a.c);
      this.h = $$0.b(gy.a.a);
      this.i = $$0.b(gy.a.b);
      this.j = $$0.b(gy.a.c);
   }

   protected int a(int $$0, int $$1, int $$2) {
      return ($$0 * this.b + $$1) * this.c + $$2;
   }

   @Override
   public boolean b(int $$0, int $$1, int $$2) {
      return this.d.get(this.a($$0, $$1, $$2));
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3) {
      this.d.set(this.a($$0, $$1, $$2));
      if ($$3) {
         this.e = Math.min(this.e, $$0);
         this.f = Math.min(this.f, $$1);
         this.g = Math.min(this.g, $$2);
         this.h = Math.max(this.h, $$0 + 1);
         this.i = Math.max(this.i, $$1 + 1);
         this.j = Math.max(this.j, $$2 + 1);
      }

   }

   @Override
   public void c(int $$0, int $$1, int $$2) {
      this.a($$0, $$1, $$2, true);
   }

   @Override
   public boolean a() {
      return this.d.isEmpty();
   }

   @Override
   public int a(gy.a $$0) {
      return $$0.a(this.e, this.f, this.g);
   }

   @Override
   public int b(gy.a $$0) {
      return $$0.a(this.h, this.i, this.j);
   }

   static dwt a(dwz $$0, dwz $$1, dxc $$2, dxc $$3, dxc $$4, dwu $$5) {
      dwt $$6 = new dwt($$2.size() - 1, $$3.size() - 1, $$4.size() - 1);
      int[] $$7 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      $$2.a(($$7x, $$8, $$9) -> {
         boolean[] $$10 = new boolean[]{false};
         $$3.a(($$10x, $$11, $$12) -> {
            boolean[] $$13 = new boolean[]{false};
            $$4.a(($$12x, $$13x, $$14) -> {
               if ($$5.apply($$0.d($$7x, $$10x, $$12x), $$1.d($$8, $$11, $$13x))) {
                  $$6.d.set($$6.a($$9, $$12, $$14));
                  $$7[2] = Math.min($$7[2], $$14);
                  $$7[5] = Math.max($$7[5], $$14);
                  $$13[0] = true;
               }

               return true;
            });
            if ($$13[0]) {
               $$7[1] = Math.min($$7[1], $$12);
               $$7[4] = Math.max($$7[4], $$12);
               $$10[0] = true;
            }

            return true;
         });
         if ($$10[0]) {
            $$7[0] = Math.min($$7[0], $$9);
            $$7[3] = Math.max($$7[3], $$9);
         }

         return true;
      });
      $$6.e = $$7[0];
      $$6.f = $$7[1];
      $$6.g = $$7[2];
      $$6.h = $$7[3] + 1;
      $$6.i = $$7[4] + 1;
      $$6.j = $$7[5] + 1;
      return $$6;
   }

   protected static void a(dwz $$0, dwz.b $$1, boolean $$2) {
      dwt $$3 = new dwt($$0);

      for(int $$4 = 0; $$4 < $$3.b; ++$$4) {
         for(int $$5 = 0; $$5 < $$3.a; ++$$5) {
            int $$6 = -1;

            for(int $$7 = 0; $$7 <= $$3.c; ++$$7) {
               if ($$3.d($$5, $$4, $$7)) {
                  if ($$2) {
                     if ($$6 == -1) {
                        $$6 = $$7;
                     }
                  } else {
                     $$1.consume($$5, $$4, $$7, $$5 + 1, $$4 + 1, $$7 + 1);
                  }
               } else if ($$6 != -1) {
                  int $$8 = $$5;
                  int $$9 = $$4;
                  $$3.b($$6, $$7, $$5, $$4);

                  while($$3.a($$6, $$7, $$8 + 1, $$4)) {
                     $$3.b($$6, $$7, $$8 + 1, $$4);
                     ++$$8;
                  }

                  while($$3.a($$5, $$8 + 1, $$6, $$7, $$9 + 1)) {
                     for(int $$10 = $$5; $$10 <= $$8; ++$$10) {
                        $$3.b($$6, $$7, $$10, $$9 + 1);
                     }

                     ++$$9;
                  }

                  $$1.consume($$5, $$4, $$6, $$8 + 1, $$9 + 1, $$7);
                  $$6 = -1;
               }
            }
         }
      }

   }

   private boolean a(int $$0, int $$1, int $$2, int $$3) {
      if ($$2 < this.a && $$3 < this.b) {
         return this.d.nextClearBit(this.a($$2, $$3, $$0)) >= this.a($$2, $$3, $$1);
      } else {
         return false;
      }
   }

   private boolean a(int $$0, int $$1, int $$2, int $$3, int $$4) {
      for(int $$5 = $$0; $$5 < $$1; ++$$5) {
         if (!this.a($$2, $$3, $$5, $$4)) {
            return false;
         }
      }

      return true;
   }

   private void b(int $$0, int $$1, int $$2, int $$3) {
      this.d.clear(this.a($$2, $$3, $$0), this.a($$2, $$3, $$1));
   }
}
