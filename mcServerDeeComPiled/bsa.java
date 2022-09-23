import java.util.EnumSet;
import javax.annotation.Nullable;

public abstract class bsa extends bqy {
   private static final aaj<Byte> e = aam.a(bsa.class, aal.a);
   protected int b;
   private bsa.a bX = bsa.a.a;

   protected bsa(bbr<? extends bsa> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(e, (byte)0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b = $$0.h("SpellTicks");
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("SpellTicks", this.b);
   }

   @Override
   public bqy.a n() {
      if (this.fT()) {
         return bqy.a.c;
      } else {
         return this.ga() ? bqy.a.g : bqy.a.a;
      }
   }

   public boolean fT() {
      if (this.s.y) {
         return this.Y.a(e) > 0;
      } else {
         return this.b > 0;
      }
   }

   public void a(bsa.a $$0) {
      this.bX = $$0;
      this.Y.b(e, (byte)$$0.g);
   }

   protected bsa.a fU() {
      return !this.s.y ? this.bX : bsa.a.a(this.Y.a(e));
   }

   @Override
   protected void T() {
      super.T();
      if (this.b > 0) {
         --this.b;
      }

   }

   @Override
   public void k() {
      super.k();
      if (this.s.y && this.fT()) {
         bsa.a $$0 = this.fU();
         double $$1 = $$0.h[0];
         double $$2 = $$0.h[1];
         double $$3 = $$0.h[2];
         float $$4 = this.aX * (float) (Math.PI / 180.0) + ami.b((float)this.S * 0.6662F) * 0.25F;
         float $$5 = ami.b($$4);
         float $$6 = ami.a($$4);
         this.s.a(io.v, this.df() + (double)$$5 * 0.6, this.dh() + 1.8, this.dl() + (double)$$6 * 0.6, $$1, $$2, $$3);
         this.s.a(io.v, this.df() - (double)$$5 * 0.6, this.dh() + 1.8, this.dl() - (double)$$6 * 0.6, $$1, $$2, $$3);
      }

   }

   protected int fV() {
      return this.b;
   }

   protected abstract ajv fJ();

   protected static enum a {
      a(0, 0.0, 0.0, 0.0),
      b(1, 0.7, 0.7, 0.8),
      c(2, 0.4, 0.3, 0.35),
      d(3, 0.7, 0.5, 0.2),
      e(4, 0.3, 0.3, 0.8),
      f(5, 0.1, 0.1, 0.2);

      final int g;
      final double[] h;

      private a(int $$0, double $$1, double $$2, double $$3) {
         this.g = $$0;
         this.h = new double[]{$$1, $$2, $$3};
      }

      public static bsa.a a(int $$0) {
         for(bsa.a $$1 : values()) {
            if ($$0 == $$1.g) {
               return $$1;
            }
         }

         return a;
      }
   }

   protected class b extends bip {
      public b() {
         this.a(EnumSet.of(bip.a.a, bip.a.b));
      }

      @Override
      public boolean a() {
         return bsa.this.fV() > 0;
      }

      @Override
      public void c() {
         super.c();
         bsa.this.bR.n();
      }

      @Override
      public void d() {
         super.d();
         bsa.this.a(bsa.a.a);
      }

      @Override
      public void e() {
         if (bsa.this.G() != null) {
            bsa.this.z().a(bsa.this.G(), (float)bsa.this.V(), (float)bsa.this.U());
         }

      }
   }

   protected abstract class c extends bip {
      protected int b;
      protected int c;

      @Override
      public boolean a() {
         bcc $$0 = bsa.this.G();
         if ($$0 == null || !$$0.bo()) {
            return false;
         } else if (bsa.this.fT()) {
            return false;
         } else {
            return bsa.this.S >= this.c;
         }
      }

      @Override
      public boolean b() {
         bcc $$0 = bsa.this.G();
         return $$0 != null && $$0.bo() && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(this.n());
         bsa.this.b = this.h();
         this.c = bsa.this.S + this.i();
         ajv $$0 = this.l();
         if ($$0 != null) {
            bsa.this.a($$0, 1.0F, 1.0F);
         }

         bsa.this.a(this.m());
      }

      @Override
      public void e() {
         --this.b;
         if (this.b == 0) {
            this.k();
            bsa.this.a(bsa.this.fJ(), 1.0F, 1.0F);
         }

      }

      protected abstract void k();

      protected int n() {
         return 20;
      }

      protected abstract int h();

      protected abstract int i();

      @Nullable
      protected abstract ajv l();

      protected abstract bsa.a m();
   }
}
