import java.util.Optional;
import javax.annotation.Nullable;

public abstract class dpy extends dpt {
   public static final float e = 0.44444445F;

   @Override
   public dpu d() {
      return dpw.d;
   }

   @Override
   public dpu e() {
      return dpw.e;
   }

   @Override
   public cat a() {
      return caz.oJ;
   }

   @Override
   public void a(cgx $$0, gt $$1, dpv $$2, amn $$3) {
      gt $$4 = $$1.b();
      if ($$0.a_($$4).h() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(io.S, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, ajw.kr, ajx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), ajw.kp, ajx.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }

   }

   @Override
   public void b(cgx $$0, gt $$1, dpv $$2, amn $$3) {
      if ($$0.W().b(cgt.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            gt $$5 = $$1;

            for(int $$6 = 0; $$6 < $$4; ++$$6) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               cvo $$7 = $$0.a_($$5);
               if ($$7.h()) {
                  if (this.a((cha)$$0, $$5)) {
                     $$0.b($$5, cjh.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d().c()) {
                  return;
               }
            }
         } else {
            for(int $$8 = 0; $$8 < 3; ++$$8) {
               gt $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.x($$9.b()) && this.b($$0, $$9)) {
                  $$0.b($$9.b(), cjh.a($$0, $$9));
               }
            }
         }

      }
   }

   private boolean a(cha $$0, gt $$1) {
      for(gy $$2 : gy.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(cha $$0, gt $$1) {
      return $$1.v() >= $$0.u_() && $$1.v() < $$0.ah() && !$$0.E($$1) ? false : $$0.a_($$1).d().d();
   }

   @Nullable
   @Override
   public im i() {
      return io.j;
   }

   @Override
   protected void a(cgy $$0, gt $$1, cvo $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(cha $$0) {
      return $$0.q_().i() ? 4 : 2;
   }

   @Override
   public cvo b(dpv $$0) {
      return cju.D.m().a(cnz.a, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(dpu $$0) {
      return $$0 == dpw.e || $$0 == dpw.d;
   }

   @Override
   public int c(cha $$0) {
      return $$0.q_().i() ? 1 : 2;
   }

   @Override
   public boolean a(dpv $$0, cgd $$1, gt $$2, dpu $$3, gy $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(akp.a);
   }

   @Override
   public int a(cha $$0) {
      return $$0.q_().i() ? 10 : 30;
   }

   @Override
   public int a(cgx $$0, gt $$1, dpv $$2, dpv $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cgd)$$0, $$1) > $$2.a((cgd)$$0, $$1) && $$0.r_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(cgy $$0, gt $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean f() {
      return false;
   }

   @Override
   protected void a(cgy $$0, gt $$1, cvo $$2, gy $$3, dpv $$4) {
      if ($$3 == gy.a) {
         dpv $$5 = $$0.b_($$1);
         if (this.a(akp.b) && $$5.a(akp.a)) {
            if ($$2.b() instanceof cnz) {
               $$0.a($$1, cju.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean j() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ajv> k() {
      return Optional.of(ajw.cj);
   }

   public static class a extends dpy {
      @Override
      protected void a(cvp.a<dpu, dpv> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(dpv $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(dpv $$0) {
         return false;
      }
   }

   public static class b extends dpy {
      @Override
      public int d(dpv $$0) {
         return 8;
      }

      @Override
      public boolean c(dpv $$0) {
         return true;
      }
   }
}
