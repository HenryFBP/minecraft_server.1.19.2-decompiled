import javax.annotation.Nullable;

public class dpm implements dpn {
   public static final int a = 15;
   public static final int b = 1;
   protected final cgz c;
   @Nullable
   private final dpj<?, ?> d;
   @Nullable
   private final dpj<?, ?> e;

   public dpm(cxv $$0, boolean $$1, boolean $$2) {
      this.c = $$0.p();
      this.d = $$1 ? new dpf($$0) : null;
      this.e = $$2 ? new dpo($$0) : null;
   }

   @Override
   public void a(gt $$0) {
      if (this.d != null) {
         this.d.a($$0);
      }

      if (this.e != null) {
         this.e.a($$0);
      }

   }

   @Override
   public void a(gt $$0, int $$1) {
      if (this.d != null) {
         this.d.a($$0, $$1);
      }

   }

   @Override
   public boolean A_() {
      if (this.e != null && this.e.A_()) {
         return true;
      } else {
         return this.d != null && this.d.A_();
      }
   }

   @Override
   public int a(int $$0, boolean $$1, boolean $$2) {
      if (this.d != null && this.e != null) {
         int $$3 = $$0 / 2;
         int $$4 = this.d.a($$3, $$1, $$2);
         int $$5 = $$0 - $$3 + $$4;
         int $$6 = this.e.a($$5, $$1, $$2);
         return $$4 == 0 && $$6 > 0 ? this.d.a($$6, $$1, $$2) : $$6;
      } else if (this.d != null) {
         return this.d.a($$0, $$1, $$2);
      } else {
         return this.e != null ? this.e.a($$0, $$1, $$2) : $$0;
      }
   }

   @Override
   public void a(hq $$0, boolean $$1) {
      if (this.d != null) {
         this.d.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }

   }

   @Override
   public void a(cge $$0, boolean $$1) {
      if (this.d != null) {
         this.d.a($$0, $$1);
      }

      if (this.e != null) {
         this.e.a($$0, $$1);
      }

   }

   public dpk a(chg $$0) {
      if ($$0 == chg.b) {
         return (dpk)(this.d == null ? dpk.a.a : this.d);
      } else {
         return (dpk)(this.e == null ? dpk.a.a : this.e);
      }
   }

   public String a(chg $$0, hq $$1) {
      if ($$0 == chg.b) {
         if (this.d != null) {
            return this.d.b($$1.s());
         }
      } else if (this.e != null) {
         return this.e.b($$1.s());
      }

      return "n/a";
   }

   public void a(chg $$0, hq $$1, @Nullable cxo $$2, boolean $$3) {
      if ($$0 == chg.b) {
         if (this.d != null) {
            this.d.a($$1.s(), $$2, $$3);
         }
      } else if (this.e != null) {
         this.e.a($$1.s(), $$2, $$3);
      }

   }

   public void b(cge $$0, boolean $$1) {
      if (this.d != null) {
         this.d.b($$0, $$1);
      }

      if (this.e != null) {
         this.e.b($$0, $$1);
      }

   }

   public int b(gt $$0, int $$1) {
      int $$2 = this.e == null ? 0 : this.e.b($$0) - $$1;
      int $$3 = this.d == null ? 0 : this.d.b($$0);
      return Math.max($$3, $$2);
   }

   public int b() {
      return this.c.ai() + 2;
   }

   public int c() {
      return this.c.aj() - 1;
   }

   public int d() {
      return this.c() + this.b();
   }
}
