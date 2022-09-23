import javax.annotation.Nullable;

public abstract class bbk extends bcl {
   private static final aaj<Boolean> bX = aam.a(bbk.class, aal.i);
   public static final int b = -24000;
   private static final int bY = 40;
   protected int c;
   protected int d;
   protected int e;

   protected bbk(bbr<? extends bbk> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$3 == null) {
         $$3 = new bbk.a(true);
      }

      bbk.a $$5 = (bbk.a)$$3;
      if ($$5.c() && $$5.a() > 0 && $$0.r_().i() <= $$5.d()) {
         this.b_(-24000);
      }

      $$5.b();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public abstract bbk a(agg var1, bbk var2);

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, false);
   }

   public boolean g() {
      return false;
   }

   public int j() {
      if (this.s.y) {
         return this.Y.a(bX) ? -1 : 1;
      } else {
         return this.c;
      }
   }

   public void a(int $$0, boolean $$1) {
      int $$2 = this.j();
      $$2 += $$0 * 20;
      if ($$2 > 0) {
         $$2 = 0;
      }

      int $$4 = $$2 - $$2;
      this.b_($$2);
      if ($$1) {
         this.d += $$4;
         if (this.e == 0) {
            this.e = 40;
         }
      }

      if (this.j() == 0) {
         this.b_(this.d);
      }

   }

   public void a_(int $$0) {
      this.a($$0, false);
   }

   public void b_(int $$0) {
      int $$1 = this.j();
      this.c = $$0;
      if ($$1 < 0 && $$0 >= 0 || $$1 >= 0 && $$0 < 0) {
         this.Y.b(bX, $$0 < 0);
         this.n();
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Age", this.j());
      $$0.a("ForcedAge", this.d);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.b_($$0.h("Age"));
      this.d = $$0.h("ForcedAge");
   }

   @Override
   public void a(aaj<?> $$0) {
      if (bX.equals($$0)) {
         this.z_();
      }

      super.a($$0);
   }

   @Override
   public void w_() {
      super.w_();
      if (this.s.y) {
         if (this.e > 0) {
            if (this.e % 4 == 0) {
               this.s.a(io.J, this.d(1.0), this.di() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            }

            --this.e;
         }
      } else if (this.bo()) {
         int $$0 = this.j();
         if ($$0 < 0) {
            this.b_(++$$0);
         } else if ($$0 > 0) {
            this.b_(--$$0);
         }
      }

   }

   @Override
   protected void n() {
   }

   @Override
   public boolean y_() {
      return this.j() < 0;
   }

   @Override
   public void a(boolean $$0) {
      this.b_($$0 ? -24000 : 0);
   }

   public static int c(int $$0) {
      return (int)((float)($$0 / 20) * 0.1F);
   }

   public static class a implements bcu {
      private int a;
      private final boolean b;
      private final float c;

      private a(boolean $$0, float $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public a(boolean $$0) {
         this($$0, 0.05F);
      }

      public a(float $$0) {
         this(true, $$0);
      }

      public int a() {
         return this.a;
      }

      public void b() {
         ++this.a;
      }

      public boolean c() {
         return this.b;
      }

      public float d() {
         return this.c;
      }
   }
}
