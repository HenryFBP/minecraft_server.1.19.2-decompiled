import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsk extends bsj implements btr {
   private static final Logger b = LogUtils.getLogger();
   private static final aaj<Boolean> c = aam.a(bsk.class, aal.i);
   private static final aaj<btq> d = aam.a(bsk.class, aal.r);
   private static final int ca = 3600;
   private static final int cb = 6000;
   private static final int cc = 14;
   private static final int cd = 4;
   private int ce;
   @Nullable
   private UUID cf;
   @Nullable
   private qc cg;
   @Nullable
   private pj ch;
   private int ci;

   public bsk(bbr<? extends bsk> $$0, cgx $$1) {
      super($$0, $$1);
      hm.ap.a(this.R).ifPresent($$0x -> this.a(this.fU().a((bts)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(c, false);
      this.Y.a(d, new btq(btu.c, bts.b, 1));
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      btq.c.encodeStart(pu.a, this.fU()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ch != null) {
         $$0.a("Offers", (qc)this.ch);
      }

      if (this.cg != null) {
         $$0.a("Gossips", this.cg);
      }

      $$0.a("ConversionTime", this.fT() ? this.ce : -1);
      if (this.cf != null) {
         $$0.a("ConversionPlayer", this.cf);
      }

      $$0.a("Xp", this.ci);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<btq> $$1 = btq.c.parse(new Dynamic(pu.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.ch = $$0.p("Offers");
      }

      if ($$0.b("Gossips", 10)) {
         this.cg = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.ci = $$0.h("Xp");
      }

   }

   @Override
   public void k() {
      if (!this.s.y && this.bo() && this.fT()) {
         int $$0 = this.fW();
         this.ce -= $$0;
         if (this.ce <= 0) {
            this.c((agg)this.s);
         }
      }

      super.k();
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.ow)) {
         if (this.a(bbi.r)) {
            if (!$$0.fB().d) {
               $$2.g(1);
            }

            if (!this.s.y) {
               this.a($$0.co(), this.R.a(2401) + 3600);
            }

            return baj.a;
         } else {
            return baj.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean fK() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.fT() && this.ci == 0;
   }

   public boolean fT() {
      return this.ai().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cf = $$0;
      this.ce = $$1;
      this.ai().b(c, true);
      this.d(bbi.r);
      this.b(new bbg(bbi.e, $$1, Math.min(this.s.ag().a() - 1, 0)));
      this.s.a(this, (byte)16);
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 16) {
         if (!this.aM()) {
            this.s.a(this.df(), this.dj(), this.dl(), ajw.yl, this.cR(), 1.0F + this.R.i(), this.R.i() * 0.7F + 0.3F, false);
         }

      } else {
         super.a($$0);
      }
   }

   private void c(agg $$0) {
      btp $$1 = this.a(bbr.aZ, false);

      for(bbs $$2 : bbs.values()) {
         cax $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cet.d($$3)) {
               $$1.k($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.fU());
      if (this.cg != null) {
         $$1.a(this.cg);
      }

      if (this.ch != null) {
         $$1.b(new cfw(this.ch));
      }

      $$1.u(this.ci);
      $$1.a($$0, $$0.d_($$1.da()), bcg.i, null, null);
      $$1.c($$0);
      if (this.cf != null) {
         buc $$5 = $$0.b(this.cf);
         if ($$5 instanceof agh) {
            aj.r.a((agh)$$5, this, $$1);
            $$0.a(bmp.a, $$5, $$1);
         }
      }

      $$1.b(new bbg(bbi.i, 200, 0));
      if (!this.aM()) {
         $$0.a(null, 1027, this.da(), 0);
      }

   }

   private int fW() {
      int $$0 = 1;
      if (this.R.i() < 0.01F) {
         int $$1 = 0;
         gt.a $$2 = new gt.a();

         for(int $$3 = (int)this.df() - 4; $$3 < (int)this.df() + 4 && $$1 < 14; ++$$3) {
            for(int $$4 = (int)this.dh() - 4; $$4 < (int)this.dh() + 4 && $$1 < 14; ++$$4) {
               for(int $$5 = (int)this.dl() - 4; $$5 < (int)this.dl() + 4 && $$1 < 14; ++$$5) {
                  cvo $$6 = this.s.a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cju.ee) || $$6.b() instanceof cjm) {
                     if (this.R.i() < 0.3F) {
                        ++$$0;
                     }

                     ++$$1;
                  }
               }
            }
         }
      }

      return $$0;
   }

   @Override
   public float eD() {
      return this.y_() ? (this.R.i() - this.R.i()) * 0.2F + 2.0F : (this.R.i() - this.R.i()) * 0.2F + 1.0F;
   }

   @Override
   public ajv r() {
      return ajw.yj;
   }

   @Override
   public ajv c(baw $$0) {
      return ajw.yn;
   }

   @Override
   public ajv x_() {
      return ajw.ym;
   }

   @Override
   public ajv t() {
      return ajw.yo;
   }

   @Override
   protected cax fJ() {
      return cax.b;
   }

   public void c(pj $$0) {
      this.ch = $$0;
   }

   public void a(qc $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      this.a(this.fU().a(btu.a($$0.w(this.da()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(btq $$0) {
      btq $$1 = this.fU();
      if ($$1.b() != $$0.b()) {
         this.ch = null;
      }

      this.Y.b(d, $$0);
   }

   @Override
   public btq fU() {
      return this.Y.a(d);
   }

   public int fV() {
      return this.ci;
   }

   @Override
   public void a(int $$0) {
      this.ci = $$0;
   }
}
