public class bwi {
   private int a = 20;
   private float b;
   private float c;
   private int d;
   private int e = 20;

   public bwi() {
      this.b = 5.0F;
   }

   public void a(int $$0, float $$1) {
      this.a = Math.min($$0 + this.a, 20);
      this.b = Math.min(this.b + (float)$$0 * $$1 * 2.0F, (float)this.a);
   }

   public void a(cat $$0, cax $$1) {
      if ($$0.v()) {
         bwj $$2 = $$0.w();
         this.a($$2.a(), $$2.b());
      }

   }

   public void a(buc $$0) {
      bag $$1 = $$0.s.ag();
      this.e = this.a;
      if (this.c > 4.0F) {
         this.c -= 4.0F;
         if (this.b > 0.0F) {
            this.b = Math.max(this.b - 1.0F, 0.0F);
         } else if ($$1 != bag.a) {
            this.a = Math.max(this.a - 1, 0);
         }
      }

      boolean $$2 = $$0.s.W().b(cgt.j);
      if ($$2 && this.b > 0.0F && $$0.fM() && this.a >= 20) {
         ++this.d;
         if (this.d >= 10) {
            float $$3 = Math.min(this.b, 6.0F);
            $$0.b($$3 / 6.0F);
            this.a($$3);
            this.d = 0;
         }
      } else if ($$2 && this.a >= 18 && $$0.fM()) {
         ++this.d;
         if (this.d >= 80) {
            $$0.b(1.0F);
            this.a(6.0F);
            this.d = 0;
         }
      } else if (this.a <= 0) {
         ++this.d;
         if (this.d >= 80) {
            if ($$0.ef() > 10.0F || $$1 == bag.d || $$0.ef() > 1.0F && $$1 == bag.c) {
               $$0.a(baw.i, 1.0F);
            }

            this.d = 0;
         }
      } else {
         this.d = 0;
      }

   }

   public void a(pj $$0) {
      if ($$0.b("foodLevel", 99)) {
         this.a = $$0.h("foodLevel");
         this.d = $$0.h("foodTickTimer");
         this.b = $$0.j("foodSaturationLevel");
         this.c = $$0.j("foodExhaustionLevel");
      }

   }

   public void b(pj $$0) {
      $$0.a("foodLevel", this.a);
      $$0.a("foodTickTimer", this.d);
      $$0.a("foodSaturationLevel", this.b);
      $$0.a("foodExhaustionLevel", this.c);
   }

   public int a() {
      return this.a;
   }

   public int b() {
      return this.e;
   }

   public boolean c() {
      return this.a < 20;
   }

   public void a(float $$0) {
      this.c = Math.min(this.c + $$0, 40.0F);
   }

   public float d() {
      return this.c;
   }

   public float e() {
      return this.b;
   }

   public void a(int $$0) {
      this.a = $$0;
   }

   public void b(float $$0) {
      this.b = $$0;
   }

   public void c(float $$0) {
      this.c = $$0;
   }
}
