import com.google.common.collect.Lists;
import java.util.Queue;

public class cqy extends cjt {
   public static final int a = 6;
   public static final int b = 64;

   protected cqy(cvn.c $$0) {
      super($$0);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(cgx $$0, gt $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, cju.aC.m(), 2);
         $$0.c(2001, $$1, cjt.i(cju.C.m()));
      }

   }

   private boolean b(cgx $$0, gt $$1) {
      Queue<ane<gt, Integer>> $$2 = Lists.newLinkedList();
      $$2.add(new ane<>($$1, 0));
      int $$3 = 0;

      while(!$$2.isEmpty()) {
         ane<gt, Integer> $$4 = (ane)$$2.poll();
         gt $$5 = $$4.a();
         int $$6 = $$4.b();

         for(gy $$7 : gy.values()) {
            gt $$8 = $$5.a($$7);
            cvo $$9 = $$0.a_($$8);
            dpv $$10 = $$0.b_($$8);
            dpz $$11 = $$9.d();
            if ($$10.a(akp.a)) {
               if ($$9.b() instanceof cjy && !((cjy)$$9.b()).c($$0, $$8, $$9).b()) {
                  ++$$3;
                  if ($$6 < 6) {
                     $$2.add(new ane<>($$8, $$6 + 1));
                  }
               } else if ($$9.b() instanceof cnz) {
                  $$0.a($$8, cju.a.m(), 3);
                  ++$$3;
                  if ($$6 < 6) {
                     $$2.add(new ane<>($$8, $$6 + 1));
                  }
               } else if ($$11 == dpz.f || $$11 == dpz.i) {
                  cti $$12 = $$9.o() ? $$0.c_($$8) : null;
                  a($$9, $$0, $$8, $$12);
                  $$0.a($$8, cju.a.m(), 3);
                  ++$$3;
                  if ($$6 < 6) {
                     $$2.add(new ane<>($$8, $$6 + 1));
                  }
               }
            }
         }

         if ($$3 > 64) {
            break;
         }
      }

      return $$3 > 0;
   }
}
