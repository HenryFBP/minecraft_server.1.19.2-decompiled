import javax.annotation.Nullable;

public class bjq extends bjc {
   private final cjt g;
   private final bce h;
   private int i;
   private static final int j = 20;

   public bjq(cjt $$0, bcl $$1, double $$2, int $$3) {
      super($$1, $$2, 24, $$3);
      this.g = $$0;
      this.h = $$1;
   }

   @Override
   public boolean a() {
      if (!this.h.s.W().b(cgt.c)) {
         return false;
      } else if (this.c > 0) {
         --this.c;
         return false;
      } else if (this.o()) {
         this.c = b(20);
         return true;
      } else {
         this.c = this.a(this.a);
         return false;
      }
   }

   private boolean o() {
      return this.e != null && this.a((cha)this.a.s, this.e) ? true : this.n();
   }

   @Override
   public void d() {
      super.d();
      this.h.L = 1.0F;
   }

   @Override
   public void c() {
      super.c();
      this.i = 0;
   }

   public void a(cgy $$0, gt $$1) {
   }

   public void a(cgx $$0, gt $$1) {
   }

   @Override
   public void e() {
      super.e();
      cgx $$0 = this.h.s;
      gt $$1 = this.h.da();
      gt $$2 = this.a($$1, $$0);
      amn $$3 = this.h.dQ();
      if (this.m() && $$2 != null) {
         if (this.i > 0) {
            dwq $$4 = this.h.dd();
            this.h.n($$4.c, 0.3, $$4.e);
            if (!$$0.y) {
               double $$5 = 0.08;
               ((agg)$$0)
                  .a(
                     new ik(io.N, new cax(caz.pa)),
                     (double)$$2.u() + 0.5,
                     (double)$$2.v() + 0.7,
                     (double)$$2.w() + 0.5,
                     3,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     ((double)$$3.i() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.i % 2 == 0) {
            dwq $$6 = this.h.dd();
            this.h.n($$6.c, -0.3, $$6.e);
            if (this.i % 6 == 0) {
               this.a((cgy)$$0, this.e);
            }
         }

         if (this.i > 60) {
            $$0.a($$2, false);
            if (!$$0.y) {
               for(int $$7 = 0; $$7 < 20; ++$$7) {
                  double $$8 = $$3.k() * 0.02;
                  double $$9 = $$3.k() * 0.02;
                  double $$10 = $$3.k() * 0.02;
                  ((agg)$$0).a(io.V, (double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5, 1, $$8, $$9, $$10, 0.15F);
               }

               this.a($$0, $$2);
            }
         }

         ++this.i;
      }

   }

   @Nullable
   private gt a(gt $$0, cgd $$1) {
      if ($$1.a_($$0).a(this.g)) {
         return $$0;
      } else {
         gt[] $$2 = new gt[]{$$0.c(), $$0.f(), $$0.g(), $$0.d(), $$0.e(), $$0.c().c()};

         for(gt $$3 : $$2) {
            if ($$1.a_($$3).a(this.g)) {
               return $$3;
            }
         }

         return null;
      }
   }

   @Override
   protected boolean a(cha $$0, gt $$1) {
      cxj $$2 = $$0.a(hq.a($$1.u()), hq.a($$1.w()), cxn.o, false);
      if ($$2 == null) {
         return false;
      } else {
         return $$2.a_($$1).a(this.g) && $$2.a_($$1.b()).h() && $$2.a_($$1.b(2)).h();
      }
   }
}
