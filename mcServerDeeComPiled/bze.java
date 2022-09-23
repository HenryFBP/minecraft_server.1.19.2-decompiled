import javax.annotation.Nullable;

public class bze extends cat implements bzo {
   private final dpu a;

   public bze(dpu $$0, cat.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bak<cax> a(cgx $$0, buc $$1, bai $$2) {
      cax $$3 = $$1.b($$2);
      dwm $$4 = a($$0, $$1, this.a == dpw.a ? cgg.b.b : cgg.b.a);
      if ($$4.c() == dwo.a.a) {
         return bak.c($$3);
      } else if ($$4.c() != dwo.a.b) {
         return bak.c($$3);
      } else {
         gt $$5 = $$4.a();
         gy $$6 = $$4.b();
         gt $$7 = $$5.a($$6);
         if (!$$0.a($$1, $$5) || !$$1.a($$7, $$6, $$3)) {
            return bak.d($$3);
         } else if (this.a == dpw.a) {
            cvo $$8 = $$0.a_($$5);
            if ($$8.b() instanceof cjy $$9) {
               cax $$10 = $$9.c($$0, $$5, $$8);
               if (!$$10.b()) {
                  $$1.b(akg.c.b(this));
                  $$9.X_().ifPresent($$1x -> $$1.a($$1x, 1.0F, 1.0F));
                  $$0.a($$1, czv.y, $$5);
                  cax $$11 = cay.a($$3, $$1, $$10);
                  if (!$$0.y) {
                     aj.j.a((agh)$$1, $$10);
                  }

                  return bak.a($$11, $$0.k_());
               }
            }

            return bak.d($$3);
         } else {
            cvo $$12 = $$0.a_($$5);
            gt $$13 = $$12.b() instanceof coa && this.a == dpw.c ? $$5 : $$7;
            if (this.a($$1, $$0, $$13, $$4)) {
               this.a($$1, $$0, $$3, $$13);
               if ($$1 instanceof agh) {
                  aj.y.a((agh)$$1, $$13, $$3);
               }

               $$1.b(akg.c.b(this));
               return bak.a(a($$3, $$1), $$0.k_());
            } else {
               return bak.d($$3);
            }
         }
      }
   }

   public static cax a(cax $$0, buc $$1) {
      return !$$1.fB().d ? new cax(caz.oH) : $$0;
   }

   @Override
   public void a(@Nullable buc $$0, cgx $$1, cax $$2, gt $$3) {
   }

   @Override
   public boolean a(@Nullable buc $$0, cgx $$1, gt $$2, @Nullable dwm $$3) {
      if (!(this.a instanceof dpt)) {
         return false;
      } else {
         cvo $$4 = $$1.a_($$2);
         cjt $$5 = $$4.b();
         dpz $$6 = $$4.d();
         boolean $$7 = $$4.a(this.a);
         boolean $$8 = $$4.h() || $$7 || $$5 instanceof coa && ((coa)$$5).a($$1, $$2, $$4, this.a);
         if (!$$8) {
            return $$3 != null && this.a($$0, $$1, $$3.a().a($$3.b()), null);
         } else if ($$1.q_().i() && this.a.a(akp.a)) {
            int $$9 = $$2.u();
            int $$10 = $$2.v();
            int $$11 = $$2.w();
            $$1.a($$0, $$2, ajw.go, ajx.e, 0.5F, 2.6F + ($$1.w.i() - $$1.w.i()) * 0.8F);

            for(int $$12 = 0; $$12 < 8; ++$$12) {
               $$1.a(io.R, (double)$$9 + Math.random(), (double)$$10 + Math.random(), (double)$$11 + Math.random(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if ($$5 instanceof coa && this.a == dpw.c) {
            ((coa)$$5).a($$1, $$2, $$4, ((dpt)this.a).a(false));
            this.a($$0, $$1, $$2);
            return true;
         } else {
            if (!$$1.y && $$7 && !$$6.a()) {
               $$1.b($$2, true);
            }

            if (!$$1.a($$2, this.a.h().g(), 11) && !$$4.p().b()) {
               return false;
            } else {
               this.a($$0, $$1, $$2);
               return true;
            }
         }
      }
   }

   protected void a(@Nullable buc $$0, cgy $$1, gt $$2) {
      ajv $$3 = this.a.a(akp.b) ? ajw.cd : ajw.ca;
      $$1.a($$0, $$2, $$3, ajx.e, 1.0F, 1.0F);
      $$1.a($$0, czv.z, $$2);
   }
}
