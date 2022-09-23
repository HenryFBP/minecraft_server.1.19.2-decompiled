import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.BiConsumer;

public class byh extends bwm {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final bwx t;
   private final bxc u = bxc.a();
   private final cgx v;
   private List<ced> w = Lists.newArrayList();
   private cax x = cax.b;
   long y;
   final byd m;
   final byd n;
   Runnable z = () -> {
   };
   public final bac o = new bao(1) {
      @Override
      public void e() {
         super.e();
         byh.this.a(this);
         byh.this.z.run();
      }
   };
   final bxy A = new bxy();

   public byh(int $$0, bub $$1) {
      this($$0, $$1, bwx.a);
   }

   public byh(int $$0, bub $$1, final bwx $$2) {
      super(bxq.x, $$0);
      this.t = $$2;
      this.v = $$1.l.s;
      this.m = this.a(new byd(this.o, 0, 20, 33));
      this.n = this.a(new byd(this.A, 1, 143, 33) {
         @Override
         public boolean a(cax $$0) {
            return false;
         }

         @Override
         public void a(buc $$0, cax $$1) {
            $$1.a($$0.s, $$0, $$1.K());
            byh.this.A.b($$0);
            cax $$2 = byh.this.m.a(1);
            if (!$$2.b()) {
               byh.this.p();
            }

            $$2.a((BiConsumer<cgx, gt>)(($$0x, $$1x) -> {
               long $$2xxx = $$0x.U();
               if (byh.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, ajw.vw, ajx.e, 1.0F, 1.0F);
                  byh.this.y = $$2xxx;
               }

            }));
            super.a($$0, $$1);
         }
      });

      for(int $$3 = 0; $$3 < 3; ++$$3) {
         for(int $$4 = 0; $$4 < 9; ++$$4) {
            this.a(new byd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for(int $$5 = 0; $$5 < 9; ++$$5) {
         this.a(new byd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<ced> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.t, $$0, cju.mN);
   }

   @Override
   public boolean b(buc $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(bac $$0) {
      cax $$1 = this.m.e();
      if (!$$1.a(this.x.c())) {
         this.x = $$1.o();
         this.a($$0, $$1);
      }

   }

   private void a(bac $$0, cax $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.d(cax.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cds.f, $$0, this.v);
      }

   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         ced $$0 = (ced)this.w.get(this.u.b());
         this.A.a($$0);
         this.n.d($$0.a(this.o));
      } else {
         this.n.d(cax.b);
      }

      this.d();
   }

   @Override
   public bxq<?> a() {
      return bxq.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cax $$0, byd $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         cat $$5 = $$4.c();
         $$2 = $$4.o();
         if ($$1 == 1) {
            $$5.b($$4, $$0.s, $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cax.b;
            }
         } else if (this.v.q().a(cds.f, new bao($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cax.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cax.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         }

         $$3.d();
         if ($$4.K() == $$2.K()) {
            return cax.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a((BiConsumer<cgx, gt>)(($$1, $$2) -> this.a($$0, this.o)));
   }
}
