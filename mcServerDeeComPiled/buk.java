import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

public class buk extends bui {
   private static final int f = 600;
   private static final int ao = -1;
   private static final aaj<Integer> ap = aam.a(buk.class, aal.b);
   private static final byte aq = 0;
   private ccs ar = ccv.a;
   private final Set<bbg> as = Sets.newHashSet();
   private boolean at;

   public buk(bbr<? extends buk> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public buk(cgx $$0, double $$1, double $$2, double $$3) {
      super(bbr.e, $$1, $$2, $$3, $$0);
   }

   public buk(cgx $$0, bcc $$1) {
      super(bbr.e, $$1, $$0);
   }

   public void a(cax $$0) {
      if ($$0.a(caz.tk)) {
         this.ar = ccu.d($$0);
         Collection<bbg> $$1 = ccu.b($$0);
         if (!$$1.isEmpty()) {
            for(bbg $$2 : $$1) {
               this.as.add(new bbg($$2));
            }
         }

         int $$3 = c($$0);
         if ($$3 == -1) {
            this.A();
         } else {
            this.c($$3);
         }
      } else if ($$0.a(caz.mR)) {
         this.ar = ccv.a;
         this.as.clear();
         this.Y.b(ap, -1);
      }

   }

   public static int c(cax $$0) {
      pj $$1 = $$0.u();
      return $$1 != null && $$1.b("CustomPotionColor", 99) ? $$1.h("CustomPotionColor") : -1;
   }

   private void A() {
      this.at = false;
      if (this.ar == ccv.a && this.as.isEmpty()) {
         this.Y.b(ap, -1);
      } else {
         this.Y.b(ap, ccu.a(ccu.a(this.ar, this.as)));
      }

   }

   public void a(bbg $$0) {
      this.as.add($$0);
      this.ai().b(ap, ccu.a(ccu.a(this.ar, this.as)));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(ap, -1);
   }

   @Override
   public void k() {
      super.k();
      if (this.s.y) {
         if (this.b) {
            if (this.c % 5 == 0) {
               this.b(1);
            }
         } else {
            this.b(2);
         }
      } else if (this.b && this.c != 0 && !this.as.isEmpty() && this.c >= 600) {
         this.s.a(this, (byte)0);
         this.ar = ccv.a;
         this.as.clear();
         this.Y.b(ap, -1);
      }

   }

   private void b(int $$0) {
      int $$1 = this.w();
      if ($$1 != -1 && $$0 > 0) {
         double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
         double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
         double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

         for(int $$5 = 0; $$5 < $$0; ++$$5) {
            this.s.a(io.v, this.d(0.5), this.di(), this.g(0.5), $$2, $$3, $$4);
         }

      }
   }

   public int w() {
      return this.Y.a(ap);
   }

   private void c(int $$0) {
      this.at = true;
      this.Y.b(ap, $$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.ar != ccv.a) {
         $$0.a("Potion", hm.Z.b(this.ar).toString());
      }

      if (this.at) {
         $$0.a("Color", this.w());
      }

      if (!this.as.isEmpty()) {
         pp $$1 = new pp();

         for(bbg $$2 : this.as) {
            $$1.add($$2.a(new pj()));
         }

         $$0.a("CustomPotionEffects", (qc)$$1);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Potion", 8)) {
         this.ar = ccu.c($$0);
      }

      for(bbg $$1 : ccu.b($$0)) {
         this.a($$1);
      }

      if ($$0.b("Color", 99)) {
         this.c($$0.h("Color"));
      } else {
         this.A();
      }

   }

   @Override
   protected void a(bcc $$0) {
      super.a($$0);
      bbn $$1 = this.y();

      for(bbg $$2 : this.ar.a()) {
         $$0.b(new bbg($$2.b(), Math.max($$2.c() / 8, 1), $$2.d(), $$2.e(), $$2.f()), $$1);
      }

      if (!this.as.isEmpty()) {
         for(bbg $$3 : this.as) {
            $$0.b($$3, $$1);
         }
      }

   }

   @Override
   protected cax l() {
      if (this.as.isEmpty() && this.ar == ccv.a) {
         return new cax(caz.mR);
      } else {
         cax $$0 = new cax(caz.tk);
         ccu.a($$0, this.ar);
         ccu.a($$0, this.as);
         if (this.at) {
            $$0.v().a("CustomPotionColor", this.w());
         }

         return $$0;
      }
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 0) {
         int $$1 = this.w();
         if ($$1 != -1) {
            double $$2 = (double)($$1 >> 16 & 0xFF) / 255.0;
            double $$3 = (double)($$1 >> 8 & 0xFF) / 255.0;
            double $$4 = (double)($$1 >> 0 & 0xFF) / 255.0;

            for(int $$5 = 0; $$5 < 20; ++$$5) {
               this.s.a(io.v, this.d(0.5), this.di(), this.g(0.5), $$2, $$3, $$4);
            }
         }
      } else {
         super.a($$0);
      }

   }
}
