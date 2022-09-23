import com.mojang.logging.LogUtils;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class bqo extends bqn {
   private static final Logger f = LogUtils.getLogger();
   private static final aaj<cax> ao = aam.a(bqo.class, aal.g);
   private static final aaj<Integer> ap = aam.a(bqo.class, aal.b);
   public static final int e = 8;
   private float aq = 1.0F;
   private boolean ar;

   public bqo(bbr<? extends bqo> $$0, cgx $$1) {
      super($$0, $$1);
   }

   public bqo(cgx $$0, gt $$1, gy $$2) {
      this(bbr.U, $$0, $$1, $$2);
   }

   public bqo(bbr<? extends bqo> $$0, cgx $$1, gt $$2, gy $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected float a(bco $$0, bbo $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      this.ai().a(ao, cax.b);
      this.ai().a(ap, 0);
   }

   @Override
   protected void a(gy $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.p(0.0F);
         this.o((float)(this.d.e() * 90));
      } else {
         this.p((float)(-90 * $$0.f().a()));
         this.o(0.0F);
      }

      this.x = this.ds();
      this.w = this.dq();
      this.q();
   }

   @Override
   protected void q() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.o($$1, $$2, $$3);
         double $$4 = (double)this.s();
         double $$5 = (double)this.t();
         double $$6 = (double)this.s();
         gy.a $$7 = this.d.o();
         switch($$7) {
            case a:
               $$4 = 1.0;
               break;
            case b:
               $$5 = 1.0;
               break;
            case c:
               $$6 = 1.0;
         }

         $$4 /= 32.0;
         $$5 /= 32.0;
         $$6 /= 32.0;
         this.a(new dwl($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean r() {
      if (this.ar) {
         return true;
      } else if (!this.s.g(this)) {
         return false;
      } else {
         cvo $$0 = this.s.a_(this.c.a(this.d.g()));
         return $$0.d().b() || this.d.o().d() && cll.n($$0) ? this.s.a(this, this.cy(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bci $$0, dwq $$1) {
      if (!this.ar) {
         super.a($$0, $$1);
      }

   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.ar) {
         super.i($$0, $$1, $$2);
      }

   }

   @Override
   public float bx() {
      return 0.0F;
   }

   @Override
   public void ag() {
      this.c(this.x());
      super.ag();
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.ar) {
         return $$0 != baw.m && !$$0.D() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.d() && !this.x().b()) {
         if (!this.s.y) {
            this.b($$0.m(), false);
            this.a(this.h(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public ajv h() {
      return ajw.jZ;
   }

   @Override
   public int s() {
      return 12;
   }

   @Override
   public int t() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cs();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(@Nullable bbn $$0) {
      this.a(this.i(), 1.0F, 1.0F);
      this.b($$0, true);
   }

   public ajv i() {
      return ajw.jX;
   }

   @Override
   public void u() {
      this.a(this.j(), 1.0F, 1.0F);
   }

   public ajv j() {
      return ajw.jY;
   }

   private void b(@Nullable bbn $$0, boolean $$1) {
      if (!this.ar) {
         cax $$2 = this.x();
         this.a(cax.b);
         if (!this.s.W().b(cgt.h)) {
            if ($$0 == null) {
               this.c($$2);
            }

         } else {
            if ($$0 instanceof buc $$3 && $$3.fB().d) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.o());
            }

            if (!$$2.b()) {
               $$2 = $$2.o();
               this.c($$2);
               if (this.R.i() < this.aq) {
                  this.b($$2);
               }
            }

         }
      }
   }

   private void c(cax $$0) {
      this.y().ifPresent($$0x -> {
         drg $$1 = cbd.a($$0x, this.s);
         if ($$1 != null) {
            $$1.a(this.c, this.ae());
            $$1.a(true);
         }

      });
      $$0.a(null);
   }

   public cax x() {
      return this.ai().a(ao);
   }

   public OptionalInt y() {
      cax $$0 = this.x();
      if ($$0.a(caz.qc)) {
         Integer $$1 = cbd.d($$0);
         if ($$1 != null) {
            return OptionalInt.of($$1);
         }
      }

      return OptionalInt.empty();
   }

   public boolean z() {
      return this.y().isPresent();
   }

   public void a(cax $$0) {
      this.a($$0, true);
   }

   public void a(cax $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.o();
         $$0.e(1);
      }

      this.d($$0);
      this.ai().b(ao, $$0);
      if (!$$0.b()) {
         this.a(this.l(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.s.c(this.c, cju.a);
      }

   }

   public ajv l() {
      return ajw.jW;
   }

   @Override
   public bct k(int $$0) {
      return $$0 == 0 ? new bct() {
         @Override
         public cax a() {
            return bqo.this.x();
         }

         @Override
         public boolean a(cax $$0) {
            bqo.this.a($$0);
            return true;
         }
      } : super.k($$0);
   }

   @Override
   public void a(aaj<?> $$0) {
      if ($$0.equals(ao)) {
         this.d(this.x());
      }

   }

   private void d(cax $$0) {
      if (!$$0.b() && $$0.F() != this) {
         $$0.a(this);
      }

      this.q();
   }

   public int A() {
      return this.ai().a(ap);
   }

   public void a(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ai().b(ap, $$0 % 8);
      if ($$1 && this.c != null) {
         this.s.c(this.c, cju.a);
      }

   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (!this.x().b()) {
         $$0.a("Item", (qc)this.x().b(new pj()));
         $$0.a("ItemRotation", (byte)this.A());
         $$0.a("ItemDropChance", this.aq);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.bX());
      $$0.a("Fixed", this.ar);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      pj $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.f()) {
         cax $$2 = cax.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cax $$3 = this.x();
         if (!$$3.b() && !cax.b($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.aq = $$0.j("ItemDropChance");
         }
      }

      this.a(gy.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.ar = $$0.q("Fixed");
   }

   @Override
   public baj a(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      boolean $$3 = !this.x().b();
      boolean $$4 = !$$2.b();
      if (this.ar) {
         return baj.d;
      } else if (!this.s.y) {
         if (!$$3) {
            if ($$4 && !this.dt()) {
               if ($$2.a(caz.qc)) {
                  drg $$5 = cbd.a($$2, this.s);
                  if ($$5 != null && $$5.b(256)) {
                     return baj.e;
                  }
               }

               this.a($$2);
               if (!$$0.fB().d) {
                  $$2.g(1);
               }
            }
         } else {
            this.a(this.n(), 1.0F, 1.0F);
            this.a(this.A() + 1);
         }

         return baj.b;
      } else {
         return !$$3 && !$$4 ? baj.d : baj.a;
      }
   }

   public ajv n() {
      return ajw.ka;
   }

   public int C() {
      return this.x().b() ? 0 : this.A() % 8 + 1;
   }

   @Override
   public tc<?> S() {
      return new tg(this, this.d.d(), this.w());
   }

   @Override
   public void a(tg $$0) {
      super.a($$0);
      this.a(gy.a($$0.n()));
   }

   @Override
   public cax dn() {
      cax $$0 = this.x();
      return $$0.b() ? this.o() : $$0.o();
   }

   protected cax o() {
      return new cax(caz.rZ);
   }

   @Override
   public float dr() {
      gy $$0 = this.cv();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)ami.b(180 + $$0.e() * 90 + this.A() * 45 + $$1);
   }
}
