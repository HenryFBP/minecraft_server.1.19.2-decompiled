import java.util.OptionalInt;
import javax.annotation.Nullable;

public class bup extends buu implements bur {
   private static final aaj<cax> b = aam.a(bup.class, aal.g);
   private static final aaj<OptionalInt> c = aam.a(bup.class, aal.s);
   private static final aaj<Boolean> d = aam.a(bup.class, aal.i);
   private int e;
   private int f;
   @Nullable
   private bcc ao;

   public bup(bbr<? extends bup> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bup(cgx $$0, double $$1, double $$2, double $$3, cax $$4) {
      super(bbr.F, $$0);
      this.e = 0;
      this.e($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.t()) {
         this.Y.b(b, $$4.o());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.n(this.R.a(0.0, 0.002297), 0.05, this.R.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.R.a(6) + this.R.a(7);
   }

   public bup(cgx $$0, @Nullable bbn $$1, double $$2, double $$3, double $$4, cax $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public bup(cgx $$0, cax $$1, bcc $$2) {
      this($$0, $$2, $$2.df(), $$2.dh(), $$2.dl(), $$1);
      this.Y.b(c, OptionalInt.of($$2.ae()));
      this.ao = $$2;
   }

   public bup(cgx $$0, cax $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.Y.b(d, $$5);
   }

   public bup(cgx $$0, cax $$1, bbn $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.Y.a(b, cax.b);
      this.Y.a(c, OptionalInt.empty());
      this.Y.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.o();
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return super.j($$0, $$1, $$2) && !this.o();
   }

   @Override
   public void k() {
      super.k();
      if (this.o()) {
         if (this.ao == null) {
            ((OptionalInt)this.Y.a(c)).ifPresent($$0x -> {
               bbn $$1x = this.s.a($$0x);
               if ($$1x instanceof bcc) {
                  this.ao = (bcc)$$1x;
               }

            });
         }

         if (this.ao != null) {
            dwq $$4;
            if (this.ao.fc()) {
               dwq $$0 = this.ao.by();
               double $$1 = 1.5;
               double $$2 = 0.1;
               dwq $$3 = this.ao.dd();
               this.ao
                  .f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.ao.a(caz.sq);
            } else {
               $$4 = dwq.b;
            }

            this.e(this.ao.df() + $$4.c, this.ao.dh() + $$4.d, this.ao.dl() + $$4.e);
            this.f(this.ao.dd());
         }
      } else {
         if (!this.i()) {
            double $$6 = this.z ? 1.0 : 1.15;
            this.f(this.dd().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         dwq $$7 = this.dd();
         this.a(bci.a, $$7);
         this.f($$7);
      }

      dwo $$8 = buv.a(this, this::a);
      if (!this.Q) {
         this.a($$8);
         this.af = true;
      }

      this.z();
      if (this.e == 0 && !this.aM()) {
         this.s.a(null, this.df(), this.dh(), this.dl(), ajw.gj, ajx.i, 3.0F, 1.0F);
      }

      ++this.e;
      if (this.s.y && this.e % 2 < 2) {
         this.s.a(io.A, this.df(), this.dh(), this.dl(), this.R.k() * 0.05, -this.dd().d * 0.5, this.R.k() * 0.05);
      }

      if (!this.s.y && this.e > this.f) {
         this.j();
      }

   }

   private void j() {
      this.s.a(this, (byte)17);
      this.a(czv.w, this.x());
      this.n();
      this.ah();
   }

   @Override
   protected void a(dwn $$0) {
      super.a($$0);
      if (!this.s.y) {
         this.j();
      }
   }

   @Override
   protected void a(dwm $$0) {
      gt $$1 = new gt($$0.a());
      this.s.a_($$1).a(this.s, $$1, this);
      if (!this.s.k_() && this.l()) {
         this.j();
      }

      super.a($$0);
   }

   private boolean l() {
      cax $$0 = this.Y.a(b);
      pj $$1 = $$0.b() ? null : $$0.b("Fireworks");
      pp $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void n() {
      float $$0 = 0.0F;
      cax $$1 = this.Y.a(b);
      pj $$2 = $$1.b() ? null : $$1.b("Fireworks");
      pp $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.ao != null) {
            this.ao.a(baw.a(this, this.x()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         dwq $$5 = this.cY();

         for(bcc $$7 : this.s.a(bcc.class, this.cy().g(5.0))) {
            if ($$7 != this.ao && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for(int $$9 = 0; $$9 < 2; ++$$9) {
                  dwq $$10 = new dwq($$7.df(), $$7.e(0.5 * (double)$$9), $$7.dl());
                  dwo $$11 = this.s.a(new cgg($$5, $$10, cgg.a.a, cgg.b.a, this));
                  if ($$11.c() == dwo.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(baw.a(this, this.x()), $$12);
               }
            }
         }
      }

   }

   private boolean o() {
      return ((OptionalInt)this.Y.a(c)).isPresent();
   }

   @Override
   public boolean i() {
      return this.Y.a(d);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 17 && this.s.y) {
         if (!this.l()) {
            for(int $$1 = 0; $$1 < this.R.a(3) + 2; ++$$1) {
               this.s.a(io.V, this.df(), this.dh(), this.dl(), this.R.k() * 0.05, 0.005, this.R.k() * 0.05);
            }
         } else {
            cax $$2 = this.Y.a(b);
            pj $$3 = $$2.b() ? null : $$2.b("Fireworks");
            dwq $$4 = this.dd();
            this.s.a(this.df(), this.dh(), this.dl(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.a($$0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cax $$1 = this.Y.a(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", (qc)$$1.b(new pj()));
      }

      $$0.a("ShotAtAngle", this.Y.a(d));
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cax $$1 = cax.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.Y.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.Y.b(d, $$0.q("ShotAtAngle"));
      }

   }

   @Override
   public cax h() {
      cax $$0 = this.Y.a(b);
      return $$0.b() ? new cax(caz.sq) : $$0;
   }

   @Override
   public boolean ch() {
      return false;
   }
}
