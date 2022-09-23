import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;

public class ccm extends cat implements cco {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;
   private final Multimap<bcy, bdb> d;

   public ccm(cat.a $$0) {
      super($$0);
      Builder<bcy, bdb> $$1 = ImmutableMultimap.builder();
      $$1.put(bdd.f, new bdb(l, "Tool modifier", 8.0, bdb.a.a));
      $$1.put(bdd.h, new bdb(m, "Tool modifier", -2.9F, bdb.a.a));
      this.d = $$1.build();
   }

   @Override
   public boolean a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      return !$$3.f();
   }

   @Override
   public ccn c(cax $$0) {
      return ccn.f;
   }

   @Override
   public int b(cax $$0) {
      return 72000;
   }

   @Override
   public void a(cax $$0, cgx $$1, bcc $$2, int $$3) {
      if ($$2 instanceof buc) {
         buc $$4 = (buc)$$2;
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = cet.g($$0);
            if ($$6 <= 0 || $$4.aS()) {
               if (!$$1.y) {
                  $$0.a(1, $$4, $$1x -> $$1x.d($$2.eU()));
                  if ($$6 == 0) {
                     bvg $$7 = new bvg($$1, $$4, $$0);
                     $$7.a($$4, $$4.ds(), $$4.dq(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fB().d) {
                        $$7.d = bui.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, ajw.uR, ajx.h, 1.0F, 1.0F);
                     if (!$$4.fB().d) {
                        $$4.fA().g($$0);
                     }
                  }
               }

               $$4.b(akg.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dq();
                  float $$9 = $$4.ds();
                  float $$10 = -ami.a($$8 * (float) (Math.PI / 180.0)) * ami.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ami.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ami.b($$8 * (float) (Math.PI / 180.0)) * ami.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ami.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.i((double)$$10, (double)$$11, (double)$$12);
                  $$4.t(20);
                  if ($$4.aw()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bci.a, new dwq(0.0, 1.1999999F, 0.0));
                  }

                  ajv $$16;
                  if ($$6 >= 3) {
                     $$16 = ajw.uQ;
                  } else if ($$6 == 2) {
                     $$16 = ajw.uP;
                  } else {
                     $$16 = ajw.uO;
                  }

                  $$1.a(null, $$4, $$16, ajx.h, 1.0F, 1.0F);
               }

            }
         }
      }
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      if ($$3.j() >= $$3.k() - 1) {
         return bak.d($$3);
      } else if (cet.g($$3) > 0 && !$$1.aS()) {
         return bak.d($$3);
      } else {
         $$1.c($$2);
         return bak.b($$3);
      }
   }

   @Override
   public boolean a(cax $$0, bcc $$1, bcc $$2) {
      $$0.a(1, $$2, $$0x -> $$0x.d(bbs.a));
      return true;
   }

   @Override
   public boolean a(cax $$0, cgx $$1, cvo $$2, gt $$3, bcc $$4) {
      if ((double)$$2.h($$1, $$3) != 0.0) {
         $$0.a(2, $$4, $$0x -> $$0x.d(bbs.a));
      }

      return true;
   }

   @Override
   public Multimap<bcy, bdb> a(bbs $$0) {
      return $$0 == bbs.a ? this.d : super.a($$0);
   }

   @Override
   public int c() {
      return 1;
   }
}
