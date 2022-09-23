import java.util.EnumSet;

public class bjp<T extends brq & bru & brd> extends bip {
   public static final azu a = anc.a(1, 2);
   private final T b;
   private bjp.a c = bjp.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public bjp(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(bip.a.a, bip.a.b));
   }

   @Override
   public boolean a() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(caz.tM);
   }

   @Override
   public boolean b() {
      return this.i() && (this.a() || !this.b.D().l()) && this.h();
   }

   private boolean i() {
      return this.b.G() != null && this.b.G().bo();
   }

   @Override
   public void d() {
      super.d();
      this.b.u(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.eT()) {
         this.b.eZ();
         this.b.b(false);
         bzk.a(this.b.eV(), false);
      }

   }

   @Override
   public boolean E_() {
      return true;
   }

   @Override
   public void e() {
      bcc $$0 = this.b.G();
      if ($$0 != null) {
         boolean $$1 = this.b.E().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            ++this.f;
         } else {
            --this.f;
         }

         double $$3 = this.b.f((bbn)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            --this.h;
            if (this.h <= 0) {
               this.b.D().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dQ());
            }
         } else {
            this.h = 0;
            this.b.D().n();
         }

         this.b.z().a($$0, 30.0F, 30.0F);
         if (this.c == bjp.a.a) {
            if (!$$4) {
               this.b.c(buv.a(this.b, caz.tM));
               this.c = bjp.a.b;
               this.b.b(true);
            }
         } else if (this.c == bjp.a.b) {
            if (!this.b.eT()) {
               this.c = bjp.a.a;
            }

            int $$5 = this.b.eX();
            cax $$6 = this.b.eV();
            if ($$5 >= bzk.k($$6)) {
               this.b.eY();
               this.c = bjp.a.c;
               this.g = 20 + this.b.dQ().a(20);
               this.b.b(false);
            }
         } else if (this.c == bjp.a.c) {
            --this.g;
            if (this.g == 0) {
               this.c = bjp.a.d;
            }
         } else if (this.c == bjp.a.d && $$1) {
            this.b.a($$0, 1.0F);
            cax $$7 = this.b.b(buv.a(this.b, caz.tM));
            bzk.a($$7, false);
            this.c = bjp.a.a;
         }

      }
   }

   private boolean k() {
      return this.c == bjp.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
