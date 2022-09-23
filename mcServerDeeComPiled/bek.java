import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bek extends bdo<btp> {
   private static final int d = 200;
   public static final float a = 0.5F;
   @Nullable
   private gt e;
   private long f;
   private int g;
   private final List<gt> h = Lists.newArrayList();

   public bek() {
      super(ImmutableMap.of(bku.n, bkv.b, bku.m, bkv.b, bku.f, bkv.a));
   }

   protected boolean a(agg $$0, btp $$1) {
      if (!$$0.W().b(cgt.c)) {
         return false;
      } else if ($$1.fU().b() != bts.g) {
         return false;
      } else {
         gt.a $$2 = $$1.da().i();
         this.h.clear();

         for(int $$3 = -1; $$3 <= 1; ++$$3) {
            for(int $$4 = -1; $$4 <= 1; ++$$4) {
               for(int $$5 = -1; $$5 <= 1; ++$$5) {
                  $$2.c($$1.df() + (double)$$3, $$1.dh() + (double)$$4, $$1.dl() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gt($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gt a(agg $$0) {
      return this.h.isEmpty() ? null : (gt)this.h.get($$0.r_().a(this.h.size()));
   }

   private boolean a(gt $$0, agg $$1) {
      cvo $$2 = $$1.a_($$0);
      cjt $$3 = $$2.b();
      cjt $$4 = $$1.a_($$0.c()).b();
      return $$3 instanceof clf && ((clf)$$3).h($$2) || $$2.h() && $$4 instanceof cmf;
   }

   protected void a(agg $$0, btp $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dy().a(bku.n, new bdq(this.e));
         $$1.dy().a(bku.m, new bkx(new bdq(this.e), 0.5F, 1));
      }

   }

   protected void b(agg $$0, btp $$1, long $$2) {
      $$1.dy().b(bku.n);
      $$1.dy().b(bku.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(agg $$0, btp $$1, long $$2) {
      if (this.e == null || this.e.a($$1.cY(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            cvo $$3 = $$0.a_(this.e);
            cjt $$4 = $$3.b();
            cjt $$5 = $$0.a_(this.e.c()).b();
            if ($$4 instanceof clf && ((clf)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.h() && $$5 instanceof cmf && $$1.ge()) {
               bao $$6 = $$1.t();

               for(int $$7 = 0; $$7 < $$6.b(); ++$$7) {
                  cax $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b()) {
                     if ($$8.a(caz.nR)) {
                        cvo $$10 = cju.cm.m();
                        $$0.b(this.e, $$10);
                        $$0.a(czv.i, this.e, czv.a.a($$1, $$10));
                        $$9 = true;
                     } else if ($$8.a(caz.sd)) {
                        cvo $$11 = cju.fz.m();
                        $$0.b(this.e, $$11);
                        $$0.a(czv.i, this.e, czv.a.a($$1, $$11));
                        $$9 = true;
                     } else if ($$8.a(caz.sc)) {
                        cvo $$12 = cju.fy.m();
                        $$0.b(this.e, $$12);
                        $$0.a(czv.i, this.e, czv.a.a($$1, $$12));
                        $$9 = true;
                     } else if ($$8.a(caz.tf)) {
                        cvo $$13 = cju.jp.m();
                        $$0.b(this.e, $$13);
                        $$0.a(czv.i, this.e, czv.a.a($$1, $$13));
                        $$9 = true;
                     }
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), ajw.dP, ajx.e, 1.0F, 1.0F);
                     $$8.g(1);
                     if ($$8.b()) {
                        $$6.a($$7, cax.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof clf && !((clf)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dy().a(bku.m, new bkx(new bdq(this.e), 0.5F, 1));
                  $$1.dy().a(bku.n, new bdq(this.e));
               }
            }
         }

         ++this.g;
      }
   }

   protected boolean d(agg $$0, btp $$1, long $$2) {
      return this.g < 200;
   }
}
