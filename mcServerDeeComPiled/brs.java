import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class brs extends bbu implements bri {
   public static final float b = 7.448451F;
   public static final int c = ami.f(24.166098F);
   private static final aaj<Integer> d = aam.a(brs.class, aal.b);
   dwq e = dwq.b;
   gt bW = gt.b;
   brs.a bX = brs.a.a;

   public brs(bbr<? extends brs> $$0, cgx $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new brs.g(this);
      this.bO = new brs.f(this);
   }

   @Override
   public boolean aL() {
      return (this.q() + this.S) % c == 0;
   }

   @Override
   protected bhn y() {
      return new brs.d(this);
   }

   @Override
   protected void u() {
      this.bS.a(1, new brs.c());
      this.bS.a(2, new brs.i());
      this.bS.a(3, new brs.e());
      this.bT.a(1, new brs.b());
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(d, 0);
   }

   public void a(int $$0) {
      this.Y.b(d, ami.a($$0, 0, 64));
   }

   private void t() {
      this.z_();
      this.a(bdd.f).a((double)(6 + this.n()));
   }

   public int n() {
      return this.Y.a(d);
   }

   @Override
   protected float b(bco $$0, bbo $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(aaj<?> $$0) {
      if (d.equals($$0)) {
         this.t();
      }

      super.a($$0);
   }

   public int q() {
      return this.ae() * 3;
   }

   @Override
   protected boolean Q() {
      return true;
   }

   @Override
   public void k() {
      super.k();
      if (this.s.y) {
         float $$0 = ami.b((float)(this.q() + this.S) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ami.b((float)(this.q() + this.S + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.s.a(this.df(), this.dh(), this.dl(), ajw.pe, this.cR(), 0.95F + this.R.i() * 0.05F, 0.95F + this.R.i() * 0.05F, false);
         }

         int $$2 = this.n();
         float $$3 = ami.b(this.dq() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = ami.a(this.dq() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.s.a(io.T, this.df() + (double)$$3, this.dh() + (double)$$5, this.dl() + (double)$$4, 0.0, 0.0, 0.0);
         this.s.a(io.T, this.df() - (double)$$3, this.dh() + (double)$$5, this.dl() - (double)$$4, 0.0, 0.0, 0.0);
      }

   }

   @Override
   public void w_() {
      if (this.bo() && this.fD()) {
         this.f(8);
      }

      super.w_();
   }

   @Override
   protected void T() {
      super.T();
   }

   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.bW = this.da().b(5);
      this.a(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bW = new gt($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.a($$0.h("Size"));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("AX", this.bW.u());
      $$0.a("AY", this.bW.v());
      $$0.a("AZ", this.bW.w());
      $$0.a("Size", this.n());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public ajx cR() {
      return ajx.f;
   }

   @Override
   protected ajv r() {
      return ajw.pb;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.pf;
   }

   @Override
   protected ajv x_() {
      return ajw.pd;
   }

   @Override
   public bch ey() {
      return bch.b;
   }

   @Override
   protected float eC() {
      return 1.0F;
   }

   @Override
   public boolean a(bbr<?> $$0) {
      return true;
   }

   @Override
   public bbo a(bco $$0) {
      int $$1 = this.n();
      bbo $$2 = super.a($$0);
      float $$3 = ($$2.a + 0.2F * (float)$$1) / $$2.a;
      return $$2.a($$3);
   }

   static enum a {
      a,
      b;
   }

   class b extends bip {
      private final bmf b = bmf.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            --this.c;
            return false;
         } else {
            this.c = b(60);
            List<buc> $$0 = brs.this.s.a(this.b, brs.this, brs.this.cy().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bbn::dh).reversed());

               for(buc $$1 : $$0) {
                  if (brs.this.a($$1, bmf.a)) {
                     brs.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bcc $$0 = brs.this.G();
         return $$0 != null ? brs.this.a($$0, bmf.a) : false;
      }
   }

   class c extends bip {
      private int b;

      @Override
      public boolean a() {
         bcc $$0 = brs.this.G();
         return $$0 != null ? brs.this.a($$0, bmf.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         brs.this.bX = brs.a.a;
         this.h();
      }

      @Override
      public void d() {
         brs.this.bW = brs.this.s.a(dar.a.e, brs.this.bW).b(10 + brs.this.R.a(20));
      }

      @Override
      public void e() {
         if (brs.this.bX == brs.a.a) {
            --this.b;
            if (this.b <= 0) {
               brs.this.bX = brs.a.b;
               this.h();
               this.b = this.a((8 + brs.this.R.a(4)) * 20);
               brs.this.a(ajw.pg, 10.0F, 0.95F + brs.this.R.i() * 0.1F);
            }
         }

      }

      private void h() {
         brs.this.bW = brs.this.G().da().b(20 + brs.this.R.a(20));
         if (brs.this.bW.v() < brs.this.s.m_()) {
            brs.this.bW = new gt(brs.this.bW.u(), brs.this.s.m_() + 1, brs.this.bW.w());
         }

      }
   }

   class d extends bhn {
      public d(bce $$0) {
         super($$0);
      }

      @Override
      public void a() {
         brs.this.aZ = brs.this.aX;
         brs.this.aX = brs.this.dq();
      }
   }

   class e extends brs.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return brs.this.G() == null || brs.this.bX == brs.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + brs.this.R.i() * 10.0F;
         this.e = -4.0F + brs.this.R.i() * 9.0F;
         this.f = brs.this.R.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (brs.this.R.a(this.a(350)) == 0) {
            this.e = -4.0F + brs.this.R.i() * 9.0F;
         }

         if (brs.this.R.a(this.a(250)) == 0) {
            ++this.d;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (brs.this.R.a(this.a(450)) == 0) {
            this.c = brs.this.R.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (brs.this.e.d < brs.this.dh() && !brs.this.s.x(brs.this.da().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (brs.this.e.d > brs.this.dh() && !brs.this.s.x(brs.this.da().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }

      }

      private void i() {
         if (gt.b.equals(brs.this.bW)) {
            brs.this.bW = brs.this.da();
         }

         this.c += this.f * 15.0F * (float) (Math.PI / 180.0);
         brs.this.e = dwq.b(brs.this.bW).b((double)(this.d * ami.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ami.a(this.c)));
      }
   }

   class f extends bhr {
      public f(bce $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bhs {
      private float m = 0.1F;

      public g(bce $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (brs.this.z) {
            brs.this.o(brs.this.dq() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = brs.this.e.c - brs.this.df();
         double $$1 = brs.this.e.d - brs.this.dh();
         double $$2 = brs.this.e.e - brs.this.dl();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = brs.this.dq();
            float $$7 = (float)ami.d($$2, $$0);
            float $$8 = ami.g(brs.this.dq() + 90.0F);
            float $$9 = ami.g($$7 * 180.0F / (float)Math.PI);
            brs.this.o(ami.e($$8, $$9, 4.0F) - 90.0F);
            brs.this.aX = brs.this.dq();
            if (ami.d($$6, brs.this.dq()) < 3.0F) {
               this.m = ami.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ami.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ami.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            brs.this.p($$10);
            float $$11 = brs.this.dq() + 90.0F;
            double $$12 = (double)(this.m * ami.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ami.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ami.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            dwq $$15 = brs.this.dd();
            brs.this.f($$15.e(new dwq($$12, $$14, $$13).d($$15).a(0.2)));
         }

      }
   }

   abstract class h extends bip {
      public h() {
         this.a(EnumSet.of(bip.a.a));
      }

      protected boolean h() {
         return brs.this.e.c(brs.this.df(), brs.this.dh(), brs.this.dl()) < 4.0;
      }
   }

   class i extends brs.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return brs.this.G() != null && brs.this.bX == brs.a.b;
      }

      @Override
      public boolean b() {
         bcc $$0 = brs.this.G();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bo()) {
            return false;
         } else {
            if ($$0 instanceof buc $$1 && ($$0.B_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (brs.this.S > this.e) {
                  this.e = brs.this.S + 20;
                  List<bnh> $$2 = brs.this.s.a(bnh.class, brs.this.cy().g(16.0), bbq.a);

                  for(bnh $$3 : $$2) {
                     $$3.fW();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         brs.this.h(null);
         brs.this.bX = brs.a.a;
      }

      @Override
      public void e() {
         bcc $$0 = brs.this.G();
         if ($$0 != null) {
            brs.this.e = new dwq($$0.df(), $$0.e(0.5), $$0.dl());
            if (brs.this.cy().g(0.2F).c($$0.cy())) {
               brs.this.z($$0);
               brs.this.bX = brs.a.a;
               if (!brs.this.aM()) {
                  brs.this.s.c(1039, brs.this.da(), 0);
               }
            } else if (brs.this.z || brs.this.aK > 0) {
               brs.this.bX = brs.a.a;
            }

         }
      }
   }
}
