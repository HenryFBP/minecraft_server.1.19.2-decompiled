import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bcw extends bne implements bck {
   protected static final aaj<Byte> bX = aam.a(bcw.class, aal.a);
   protected static final aaj<Optional<UUID>> bY = aam.a(bcw.class, aal.o);
   private boolean ca;

   protected bcw(bbr<? extends bcw> $$0, cgx $$1) {
      super($$0, $$1);
      this.t();
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, (byte)0);
      this.Y.a(bY, Optional.empty());
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.d() != null) {
         $$0.a("Owner", this.d());
      }

      $$0.a("Sitting", this.ca);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = aiy.a(this.cD(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.w(true);
         } catch (Throwable var4) {
            this.w(false);
         }
      }

      this.ca = $$0.q("Sitting");
      this.x(this.ca);
   }

   @Override
   public boolean a(buc $$0) {
      return !this.fy();
   }

   protected void v(boolean $$0) {
      im $$1 = io.L;
      if (!$$0) {
         $$1 = io.Y;
      }

      for(int $$2 = 0; $$2 < 7; ++$$2) {
         double $$3 = this.R.k() * 0.02;
         double $$4 = this.R.k() * 0.02;
         double $$5 = this.R.k() * 0.02;
         this.s.a($$1, this.d(1.0), this.di() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }

   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 7) {
         this.v(true);
      } else if ($$0 == 6) {
         this.v(false);
      } else {
         super.a($$0);
      }

   }

   public boolean q() {
      return (this.Y.a(bX) & 4) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.Y.a(bX);
      if ($$0) {
         this.Y.b(bX, (byte)($$1 | 4));
      } else {
         this.Y.b(bX, (byte)($$1 & -5));
      }

      this.t();
   }

   protected void t() {
   }

   public boolean fJ() {
      return (this.Y.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.Y.a(bX);
      if ($$0) {
         this.Y.b(bX, (byte)($$1 | 1));
      } else {
         this.Y.b(bX, (byte)($$1 & -2));
      }

   }

   @Nullable
   @Override
   public UUID d() {
      return (UUID)((Optional)this.Y.a(bY)).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.Y.b(bY, Optional.ofNullable($$0));
   }

   public void e(buc $$0) {
      this.w(true);
      this.b($$0.co());
      if ($$0 instanceof agh) {
         aj.x.a((agh)$$0, this);
      }

   }

   @Nullable
   public bcc fK() {
      try {
         UUID $$0 = this.d();
         return $$0 == null ? null : this.s.b($$0);
      } catch (IllegalArgumentException var2) {
         return null;
      }
   }

   @Override
   public boolean c(bcc $$0) {
      return this.k($$0) ? false : super.c($$0);
   }

   public boolean k(bcc $$0) {
      return $$0 == this.fK();
   }

   public boolean a(bcc $$0, bcc $$1) {
      return true;
   }

   @Override
   public dxq bY() {
      if (this.q()) {
         bcc $$0 = this.fK();
         if ($$0 != null) {
            return $$0.bY();
         }
      }

      return super.bY();
   }

   @Override
   public boolean p(bbn $$0) {
      if (this.q()) {
         bcc $$1 = this.fK();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.p($$0);
         }
      }

      return super.p($$0);
   }

   @Override
   public void a(baw $$0) {
      if (!this.s.y && this.s.W().b(cgt.m) && this.fK() instanceof agh) {
         this.fK().a(this.er().b());
      }

      super.a($$0);
   }

   public boolean fL() {
      return this.ca;
   }

   public void y(boolean $$0) {
      this.ca = $$0;
   }
}
