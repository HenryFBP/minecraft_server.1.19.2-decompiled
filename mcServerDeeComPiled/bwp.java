import java.util.Optional;
import javax.annotation.Nullable;

public class bwp extends bwm {
   private static final int k = 0;
   private static final int l = 1;
   private static final int m = 3;
   private static final int n = 1;
   private static final int o = 28;
   private static final int p = 28;
   private static final int q = 37;
   private final bac r = new bao(1) {
      @Override
      public boolean b(int $$0, cax $$1) {
         return $$1.a(aks.ar);
      }

      @Override
      public int O_() {
         return 1;
      }
   };
   private final bwp.a s;
   private final bwx t;
   private final bww u;

   public bwp(int $$0, bac $$1) {
      this($$0, $$1, new byc(3), bwx.a);
   }

   public bwp(int $$0, bac $$1, bww $$2, bwx $$3) {
      super(bxq.i, $$0);
      a($$2, 3);
      this.u = $$2;
      this.t = $$3;
      this.s = new bwp.a(this.r, 0, 136, 110);
      this.a(this.s);
      this.a($$2);
      int $$4 = 36;
      int $$5 = 137;

      for(int $$6 = 0; $$6 < 3; ++$$6) {
         for(int $$7 = 0; $$7 < 9; ++$$7) {
            this.a(new byd($$1, $$7 + $$6 * 9 + 9, 36 + $$7 * 18, 137 + $$6 * 18));
         }
      }

      for(int $$8 = 0; $$8 < 9; ++$$8) {
         this.a(new byd($$1, $$8, 36 + $$8 * 18, 195));
      }

   }

   @Override
   public void b(buc $$0) {
      super.b($$0);
      if (!$$0.s.y) {
         cax $$1 = this.s.a(this.s.a());
         if (!$$1.b()) {
            $$0.a($$1, false);
         }

      }
   }

   @Override
   public boolean a(buc $$0) {
      return a(this.t, $$0, cju.eV);
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public cax a(buc $$0, int $$1) {
      cax $$2 = cax.b;
      byd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cax $$4 = $$3.e();
         $$2 = $$4.o();
         if ($$1 == 0) {
            if (!this.a($$4, 1, 37, true)) {
               return cax.b;
            }

            $$3.a($$4, $$2);
         } else if (!this.s.f() && this.s.a($$4) && $$4.K() == 1) {
            if (!this.a($$4, 0, 1, false)) {
               return cax.b;
            }
         } else if ($$1 >= 1 && $$1 < 28) {
            if (!this.a($$4, 28, 37, false)) {
               return cax.b;
            }
         } else if ($$1 >= 28 && $$1 < 37) {
            if (!this.a($$4, 1, 28, false)) {
               return cax.b;
            }
         } else if (!this.a($$4, 1, 37, false)) {
            return cax.b;
         }

         if ($$4.b()) {
            $$3.d(cax.b);
         } else {
            $$3.d();
         }

         if ($$4.K() == $$2.K()) {
            return cax.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.u.a(0);
   }

   @Nullable
   public bbe m() {
      return bbe.a(this.u.a(1));
   }

   @Nullable
   public bbe n() {
      return bbe.a(this.u.a(2));
   }

   public void a(Optional<bbe> $$0, Optional<bbe> $$1) {
      if (this.s.f()) {
         this.u.a(1, $$0.map(bbe::a).orElse(-1));
         this.u.a(2, $$1.map(bbe::a).orElse(-1));
         this.s.a(1);
         this.t.a(cgx::p);
      }

   }

   public boolean o() {
      return !this.r.a(0).b();
   }

   class a extends byd {
      public a(bac $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cax $$0) {
         return $$0.a(aks.ar);
      }

      @Override
      public int a() {
         return 1;
      }
   }
}
