import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

public abstract class dpj<M extends dph<M>, S extends dpl<M>> extends dpi implements dpk {
   public static final long a = Long.MAX_VALUE;
   private static final gy[] f = gy.values();
   protected final cxv b;
   protected final chg c;
   protected final S d;
   private boolean g;
   protected final gt.a e = new gt.a();
   private static final int h = 2;
   private final long[] i = new long[2];
   private final cgd[] j = new cgd[2];

   public dpj(cxv $$0, chg $$1, S $$2) {
      super(16, 256, 8192);
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.d();
   }

   @Override
   protected void f(long $$0) {
      this.d.d();
      if (this.d.g(hq.e($$0))) {
         super.f($$0);
      }

   }

   @Nullable
   private cgd a(int $$0, int $$1) {
      long $$2 = cge.c($$0, $$1);

      for(int $$3 = 0; $$3 < 2; ++$$3) {
         if ($$2 == this.i[$$3]) {
            return this.j[$$3];
         }
      }

      cgd $$4 = this.b.c($$0, $$1);

      for(int $$5 = 1; $$5 > 0; --$$5) {
         this.i[$$5] = this.i[$$5 - 1];
         this.j[$$5] = this.j[$$5 - 1];
      }

      this.i[0] = $$2;
      this.j[0] = $$4;
      return $$4;
   }

   private void d() {
      Arrays.fill(this.i, cge.a);
      Arrays.fill(this.j, null);
   }

   protected cvo a(long $$0, @Nullable MutableInt $$1) {
      if ($$0 == Long.MAX_VALUE) {
         if ($$1 != null) {
            $$1.setValue(0);
         }

         return cju.a.m();
      } else {
         int $$2 = hq.a(gt.a($$0));
         int $$3 = hq.a(gt.c($$0));
         cgd $$4 = this.a($$2, $$3);
         if ($$4 == null) {
            if ($$1 != null) {
               $$1.setValue(16);
            }

            return cju.B.m();
         } else {
            this.e.f($$0);
            cvo $$5 = $$4.a_(this.e);
            boolean $$6 = $$5.m() && $$5.f();
            if ($$1 != null) {
               $$1.setValue($$5.b(this.b.p(), this.e));
            }

            return $$6 ? $$5 : cju.a.m();
         }
      }
   }

   protected dxj a(cvo $$0, long $$1, gy $$2) {
      return $$0.m() ? $$0.a(this.b.p(), this.e.f($$1), $$2) : dxg.a();
   }

   public static int a(cgd $$0, cvo $$1, gt $$2, cvo $$3, gt $$4, gy $$5, int $$6) {
      boolean $$7 = $$1.m() && $$1.f();
      boolean $$8 = $$3.m() && $$3.f();
      if (!$$7 && !$$8) {
         return $$6;
      } else {
         dxj $$9 = $$7 ? $$1.c($$0, $$2) : dxg.a();
         dxj $$10 = $$8 ? $$3.c($$0, $$4) : dxg.a();
         return dxg.b($$9, $$10, $$5) ? 16 : $$6;
      }
   }

   @Override
   protected boolean a(long $$0) {
      return $$0 == Long.MAX_VALUE;
   }

   @Override
   protected int a(long $$0, long $$1, int $$2) {
      return 0;
   }

   @Override
   protected int c(long $$0) {
      return $$0 == Long.MAX_VALUE ? 0 : 15 - this.d.i($$0);
   }

   protected int a(cxo $$0, long $$1) {
      return 15 - $$0.a(hq.b(gt.a($$1)), hq.b(gt.b($$1)), hq.b(gt.c($$1)));
   }

   @Override
   protected void a(long $$0, int $$1) {
      this.d.b($$0, Math.min(15, 15 - $$1));
   }

   @Override
   protected int b(long $$0, long $$1, int $$2) {
      return 0;
   }

   @Override
   public boolean A_() {
      return this.b() || this.d.b() || this.d.a();
   }

   @Override
   public int a(int $$0, boolean $$1, boolean $$2) {
      if (!this.g) {
         if (this.d.b()) {
            $$0 = this.d.b($$0);
            if ($$0 == 0) {
               return $$0;
            }
         }

         this.d.a(this, $$1, $$2);
      }

      this.g = true;
      if (this.b()) {
         $$0 = this.b($$0);
         this.d();
         if ($$0 == 0) {
            return $$0;
         }
      }

      this.g = false;
      this.d.e();
      return $$0;
   }

   protected void a(long $$0, @Nullable cxo $$1, boolean $$2) {
      this.d.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public cxo a(hq $$0) {
      return this.d.h($$0.s());
   }

   @Override
   public int b(gt $$0) {
      return this.d.d($$0.a());
   }

   public String b(long $$0) {
      return this.d.c($$0) + "";
   }

   @Override
   public void a(gt $$0) {
      long $$1 = $$0.a();
      this.f($$1);

      for(gy $$2 : f) {
         this.f(gt.a($$1, $$2));
      }

   }

   @Override
   public void a(gt $$0, int $$1) {
   }

   @Override
   public void a(hq $$0, boolean $$1) {
      this.d.d($$0.s(), $$1);
   }

   @Override
   public void a(cge $$0, boolean $$1) {
      long $$2 = hq.f(hq.b($$0.e, 0, $$0.f));
      this.d.b($$2, $$1);
   }

   public void b(cge $$0, boolean $$1) {
      long $$2 = hq.f(hq.b($$0.e, 0, $$0.f));
      this.d.c($$2, $$1);
   }
}
