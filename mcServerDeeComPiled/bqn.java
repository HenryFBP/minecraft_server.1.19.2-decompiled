import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class bqn extends bbn {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bbn> b = $$0 -> $$0 instanceof bqn;
   private int f;
   protected gt c;
   protected gy d;

   protected bqn(bbr<? extends bqn> $$0, cgx $$1) {
      super($$0, $$1);
      this.d = gy.d;
   }

   protected bqn(bbr<? extends bqn> $$0, cgx $$1, gt $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a_() {
   }

   protected void a(gy $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.o((float)(this.d.e() * 90));
      this.w = this.dq();
      this.q();
   }

   protected void q() {
      if (this.d != null) {
         double $$0 = (double)this.c.u() + 0.5;
         double $$1 = (double)this.c.v() + 0.5;
         double $$2 = (double)this.c.w() + 0.5;
         double $$3 = 0.46875;
         double $$4 = this.a(this.s());
         double $$5 = this.a(this.t());
         $$0 -= (double)this.d.j() * 0.46875;
         $$2 -= (double)this.d.l() * 0.46875;
         $$1 += $$5;
         gy $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.o($$0, $$1, $$2);
         double $$7 = (double)this.s();
         double $$8 = (double)this.t();
         double $$9 = (double)this.s();
         if (this.d.o() == gy.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new dwl($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double a(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void k() {
      if (!this.s.y) {
         this.ao();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dt() && !this.r()) {
               this.ah();
               this.a(null);
            }
         }
      }

   }

   public boolean r() {
      if (!this.s.g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.s() / 16);
         int $$1 = Math.max(1, this.t() / 16);
         gt $$2 = this.c.a(this.d.g());
         gy $$3 = this.d.i();
         gt.a $$4 = new gt.a();

         for(int $$5 = 0; $$5 < $$0; ++$$5) {
            for(int $$6 = 0; $$6 < $$1; ++$$6) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(gy.b, $$6 + $$8);
               cvo $$9 = this.s.a_($$4);
               if (!$$9.d().b() && !cll.n($$9)) {
                  return false;
               }
            }
         }

         return this.s.a(this, this.cy(), b).isEmpty();
      }
   }

   @Override
   public boolean bk() {
      return true;
   }

   @Override
   public boolean r(bbn $$0) {
      if ($$0 instanceof buc $$1) {
         return !this.s.a($$1, this.c) ? true : this.a(baw.a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public gy cv() {
      return this.d;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dt() && !this.s.y) {
            this.ag();
            this.bi();
            this.a($$0.m());
         }

         return true;
      }
   }

   @Override
   public void a(bci $$0, dwq $$1) {
      if (!this.s.y && !this.dt() && $$1.g() > 0.0) {
         this.ag();
         this.a(null);
      }

   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.s.y && !this.dt() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.ag();
         this.a(null);
      }

   }

   @Override
   public void b(pj $$0) {
      gt $$1 = this.w();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(pj $$0) {
      gt $$1 = new gt($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.da(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int s();

   public abstract int t();

   public abstract void a(@Nullable bbn var1);

   public abstract void u();

   @Override
   public bqv a(cax $$0, float $$1) {
      bqv $$2 = new bqv(this.s, this.df() + (double)((float)this.d.j() * 0.15F), this.dh() + (double)$$1, this.dl() + (double)((float)this.d.l() * 0.15F), $$0);
      $$2.o();
      this.s.b($$2);
      return $$2;
   }

   @Override
   protected boolean bm() {
      return false;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      this.c = new gt($$0, $$1, $$2);
      this.q();
      this.af = true;
   }

   public gt w() {
      return this.c;
   }

   @Override
   public float a(cpw $$0) {
      if (this.d.o() != gy.a.b) {
         switch($$0) {
            case c:
               this.d = this.d.g();
               break;
            case d:
               this.d = this.d.i();
               break;
            case b:
               this.d = this.d.h();
         }
      }

      float $$1 = ami.g(this.dq());
      switch($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 90.0F;
         case b:
            return $$1 + 270.0F;
         default:
            return $$1;
      }
   }

   @Override
   public float a(coh $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(agg $$0, bcb $$1) {
   }

   @Override
   public void z_() {
   }
}
