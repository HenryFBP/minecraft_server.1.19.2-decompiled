import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpi extends bpd {
   private int cn = 47999;

   public bpi(bbr<? extends bpi> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean go() {
      return true;
   }

   @Override
   protected bpd gt() {
      return bbr.aV.a(this.s);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cn);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cn = $$0.h("DespawnDelay");
      }

   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(1, new bji(this, 2.0));
      this.bT.a(1, new bpi.a(this));
   }

   @Override
   public void x(int $$0) {
      this.cn = $$0;
   }

   @Override
   protected void e(buc $$0) {
      bbn $$1 = this.fz();
      if (!($$1 instanceof btv)) {
         super.e($$0);
      }
   }

   @Override
   public void w_() {
      super.w_();
      if (!this.s.y) {
         this.gy();
      }

   }

   private void gy() {
      if (this.gz()) {
         this.cn = this.gA() ? ((btv)this.fz()).fT() - 1 : this.cn - 1;
         if (this.cn <= 0) {
            this.a(true, false);
            this.ah();
         }

      }
   }

   private boolean gz() {
      return !this.fS() && !this.gB() && !this.cN();
   }

   private boolean gA() {
      return this.fz() instanceof btv;
   }

   private boolean gB() {
      return this.fy() && !this.gA();
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      if ($$2 == bcg.h) {
         this.b_(0);
      }

      if ($$3 == null) {
         $$3 = new bbk.a(false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected static class a extends bko {
      private final bpd a;
      private bcc b;
      private int c;

      public a(bpd $$0) {
         super($$0, false);
         this.a = $$0;
         this.a(EnumSet.of(bip.a.d));
      }

      @Override
      public boolean a() {
         if (!this.a.fy()) {
            return false;
         } else {
            bbn $$0 = this.a.fz();
            if (!($$0 instanceof btv)) {
               return false;
            } else {
               btv $$1 = (btv)$$0;
               this.b = $$1.dR();
               int $$2 = $$1.dS();
               return $$2 != this.c && this.a(this.b, bmf.a);
            }
         }
      }

      @Override
      public void c() {
         this.e.h(this.b);
         bbn $$0 = this.a.fz();
         if ($$0 instanceof btv) {
            this.c = ((btv)$$0).dS();
         }

         super.c();
      }
   }
}
