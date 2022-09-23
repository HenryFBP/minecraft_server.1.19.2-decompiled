import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cha extends cga, cgh, chv.a {
   @Nullable
   cxj a(int var1, int var2, cxn var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dar.a var1, int var2, int var3);

   int o_();

   chv s_();

   default hc<cht> w(gt $$0) {
      return this.s_().a($$0);
   }

   default Stream<cvo> c(dwl $$0) {
      int $$1 = ami.b($$0.a);
      int $$2 = ami.b($$0.d);
      int $$3 = ami.b($$0.b);
      int $$4 = ami.b($$0.e);
      int $$5 = ami.b($$0.c);
      int $$6 = ami.b($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(gt $$0, cgi $$1) {
      return $$1.getColor(this.w($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default hc<cht> getNoiseBiome(int $$0, int $$1, int $$2) {
      cxj $$3 = this.a(hl.e($$0), hl.e($$2), cxn.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   hc<cht> a(int var1, int var2, int var3);

   boolean k_();

   @Deprecated
   int m_();

   cyu q_();

   @Override
   default int u_() {
      return this.q_().n();
   }

   @Override
   default int v_() {
      return this.q_().o();
   }

   default gt a(dar.a $$0, gt $$1) {
      return new gt($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean x(gt $$0) {
      return this.a_($$0).h();
   }

   default boolean y(gt $$0) {
      if ($$0.v() >= this.m_()) {
         return this.g($$0);
      } else {
         gt $$1 = new gt($$0.u(), this.m_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for(gt var4 = $$1.c(); var4.v() > $$0.v(); var4 = var4.c()) {
               cvo $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.d().a()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float z(gt $$0) {
      return this.A($$0) - 0.5F;
   }

   @Deprecated
   default float A(gt $$0) {
      float $$1 = (float)this.D($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ami.i(this.q_().s(), $$2, 1.0F);
   }

   default int c(gt $$0, gy $$1) {
      return this.a_($$0).c(this, $$0, $$1);
   }

   default cxj B(gt $$0) {
      return this.a(hq.a($$0.u()), hq.a($$0.w()));
   }

   default cxj a(int $$0, int $$1) {
      return this.a($$0, $$1, cxn.o, true);
   }

   default cxj a(int $$0, int $$1, cxn $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cgd c(int $$0, int $$1) {
      return this.a($$0, $$1, cxn.c, false);
   }

   default boolean C(gt $$0) {
      return this.b_($$0).a(akp.a);
   }

   default boolean d(dwl $$0) {
      int $$1 = ami.b($$0.a);
      int $$2 = ami.e($$0.d);
      int $$3 = ami.b($$0.b);
      int $$4 = ami.e($$0.e);
      int $$5 = ami.b($$0.c);
      int $$6 = ami.e($$0.f);
      gt.a $$7 = new gt.a();

      for(int $$8 = $$1; $$8 < $$2; ++$$8) {
         for(int $$9 = $$3; $$9 < $$4; ++$$9) {
            for(int $$10 = $$5; $$10 < $$6; ++$$10) {
               cvo $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.p().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int D(gt $$0) {
      return this.c($$0, this.o_());
   }

   default int c(gt $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(hq.a($$0), hq.a($$1));
   }

   @Deprecated
   default boolean E(gt $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(gt $$0, gt $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.u_() && $$1 < this.ah() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = hq.a($$0);
      int $$5 = hq.a($$2);
      int $$6 = hq.a($$1);
      int $$7 = hq.a($$3);

      for(int $$8 = $$4; $$8 <= $$5; ++$$8) {
         for(int $$9 = $$6; $$9 <= $$7; ++$$9) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }
}
