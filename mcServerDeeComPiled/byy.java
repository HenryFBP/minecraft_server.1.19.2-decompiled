import java.util.List;
import java.util.function.Predicate;

public class byy extends cat {
   private static final Predicate<bbn> a = bbq.f.and(bbn::bk);
   private final bvv.b b;
   private final boolean c;

   public byy(boolean $$0, bvv.b $$1, cat.a $$2) {
      super($$2);
      this.c = $$0;
      this.b = $$1;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      dwo $$4 = a($$0, $$1, cgg.b.c);
      if ($$4.c() == dwo.a.a) {
         return bak.c($$3);
      } else {
         dwq $$5 = $$1.e(1.0F);
         double $$6 = 5.0;
         List<bbn> $$7 = $$0.a($$1, $$1.cy().b($$5.a(5.0)).g(1.0), a);
         if (!$$7.isEmpty()) {
            dwq $$8 = $$1.bj();

            for(bbn $$9 : $$7) {
               dwl $$10 = $$9.cy().g((double)$$9.bx());
               if ($$10.d($$8)) {
                  return bak.c($$3);
               }
            }
         }

         if ($$4.c() == dwo.a.b) {
            bvv $$11 = this.a($$0, $$4);
            $$11.a(this.b);
            $$11.o($$1.dq());
            if (!$$0.a($$11, $$11.cy())) {
               return bak.d($$3);
            } else {
               if (!$$0.y) {
                  $$0.b($$11);
                  $$0.a($$1, czv.s, $$4.e());
                  if (!$$1.fB().d) {
                     $$3.g(1);
                  }
               }

               $$1.b(akg.c.b(this));
               return bak.a($$3, $$0.k_());
            }
         } else {
            return bak.c($$3);
         }
      }
   }

   private bvv a(cgx $$0, dwo $$1) {
      return (bvv)(this.c ? new bvw($$0, $$1.e().c, $$1.e().d, $$1.e().e) : new bvv($$0, $$1.e().c, $$1.e().d, $$1.e().e));
   }
}
