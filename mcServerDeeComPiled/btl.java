import java.util.List;

public class btl implements cgk {
   private static final int a = 1200;
   private int b;

   @Override
   public int a(agg $$0, boolean $$1, boolean $$2) {
      if ($$2 && $$0.W().b(cgt.e)) {
         --this.b;
         if (this.b > 0) {
            return 0;
         } else {
            this.b = 1200;
            buc $$3 = $$0.i();
            if ($$3 == null) {
               return 0;
            } else {
               amn $$4 = $$0.w;
               int $$5 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               int $$6 = (8 + $$4.a(24)) * ($$4.h() ? -1 : 1);
               gt $$7 = $$3.da().b($$5, 0, $$6);
               int $$8 = 10;
               if (!$$0.b($$7.u() - 10, $$7.w() - 10, $$7.u() + 10, $$7.w() + 10)) {
                  return 0;
               } else {
                  if (chi.a(bcv.c.a, $$0, $$7, bbr.l)) {
                     if ($$0.a($$7, 2)) {
                        return this.a($$0, $$7);
                     }

                     if ($$0.a().a($$7, akv.f).b()) {
                        return this.b($$0, $$7);
                     }
                  }

                  return 0;
               }
            }
         }
      } else {
         return 0;
      }
   }

   private int a(agg $$0, gt $$1) {
      int $$2 = 48;
      if ($$0.x().a($$0x -> $$0x.a(bmw.n), $$1, 48, bms.b.b) > 4L) {
         List<bnh> $$3 = $$0.a(bnh.class, new dwl($$1).c(48.0, 8.0, 48.0));
         if ($$3.size() < 5) {
            return this.a($$1, $$0);
         }
      }

      return 0;
   }

   private int b(agg $$0, gt $$1) {
      int $$2 = 16;
      List<bnh> $$3 = $$0.a(bnh.class, new dwl($$1).c(16.0, 8.0, 16.0));
      return $$3.size() < 1 ? this.a($$1, $$0) : 0;
   }

   private int a(gt $$0, agg $$1) {
      bnh $$2 = bbr.l.a((cgx)$$1);
      if ($$2 == null) {
         return 0;
      } else {
         $$2.a($$1, $$1.d_($$0), bcg.a, null, null);
         $$2.a($$0, 0.0F, 0.0F);
         $$1.a_($$2);
         return 1;
      }
   }
}
