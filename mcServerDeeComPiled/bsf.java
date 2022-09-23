import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsf extends bqy {
   private static final String b = "Johnny";
   static final Predicate<bag> e = $$0 -> $$0 == bag.c || $$0 == bag.d;
   boolean bX;

   public bsf(bbr<? extends bsf> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void u() {
      super.u();
      this.bS.a(0, new bij(this));
      this.bS.a(1, new bsf.a(this));
      this.bS.a(2, new bqy.b(this));
      this.bS.a(3, new bvk.a(this, 10.0F));
      this.bS.a(4, new bsf.c(this));
      this.bT.a(1, new bkg(this, bvk.class).a());
      this.bT.a(2, new bkh(this, buc.class, true));
      this.bT.a(3, new bkh(this, btk.class, true));
      this.bT.a(3, new bkh(this, bnq.class, true));
      this.bT.a(4, new bsf.b(this));
      this.bS.a(8, new bjl(this, 0.6));
      this.bS.a(9, new bix(this, buc.class, 3.0F, 1.0F));
      this.bS.a(10, new bix(this, bce.class, 8.0F));
   }

   @Override
   protected void T() {
      if (!this.fA() && bmk.a(this)) {
         boolean $$0 = ((agg)this.s).d(this.da());
         ((blb)this.D()).b($$0);
      }

      super.T();
   }

   public static bdc.a q() {
      return brq.fO().a(bdd.d, 0.35F).a(bdd.b, 12.0).a(bdd.a, 24.0).a(bdd.f, 5.0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      if (this.bX) {
         $$0.a("Johnny", true);
      }

   }

   @Override
   public bqy.a n() {
      if (this.fC()) {
         return bqy.a.b;
      } else {
         return this.ga() ? bqy.a.g : bqy.a.a;
      }
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bX = $$0.q("Johnny");
      }

   }

   @Override
   public ajv L_() {
      return ajw.wa;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      bcu $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((blb)this.D()).b(true);
      amn $$6 = $$0.r_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(amn $$0, bah $$1) {
      if (this.fX() == null) {
         this.a(bbs.a, new cax(caz.nz));
      }

   }

   @Override
   public boolean p(bbn $$0) {
      if (super.p($$0)) {
         return true;
      } else if ($$0 instanceof bcc && ((bcc)$$0).ey() == bch.d) {
         return this.bY() == null && $$0.bY() == null;
      } else {
         return false;
      }
   }

   @Override
   public void b(@Nullable rq $$0) {
      super.b($$0);
      if (!this.bX && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bX = true;
      }

   }

   @Override
   protected ajv r() {
      return ajw.vZ;
   }

   @Override
   protected ajv x_() {
      return ajw.wb;
   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.wc;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cax $$2 = new cax(caz.nz);
      bvj $$3 = this.fX();
      int $$4 = 1;
      if ($$0 > $$3.a(bag.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.R.i() <= $$3.w();
      if ($$5) {
         Map<cer, Integer> $$6 = Maps.newHashMap();
         $$6.put(cev.n, $$4);
         cet.a($$6, $$2);
      }

      this.a(bbs.a, $$2);
   }

   static class a extends bhz {
      public a(bce $$0) {
         super($$0, 6, bsf.e);
         this.a(EnumSet.of(bip.a.a));
      }

      @Override
      public boolean b() {
         bsf $$0 = (bsf)this.d;
         return $$0.fY() && super.b();
      }

      @Override
      public boolean a() {
         bsf $$0 = (bsf)this.d;
         return $$0.fY() && $$0.R.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bkh<bcc> {
      public b(bsf $$0) {
         super($$0, bcc.class, 0, true, true, bcc::ff);
      }

      @Override
      public boolean a() {
         return ((bsf)this.e).bX && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }

   class c extends biz {
      public c(bsf $$0) {
         super($$0, 1.0, false);
      }

      @Override
      protected double a(bcc $$0) {
         if (this.a.cQ() instanceof brv) {
            float $$1 = this.a.cQ().cW() - 0.1F;
            return (double)($$1 * 2.0F * $$1 * 2.0F + $$0.cW());
         } else {
            return super.a($$0);
         }
      }
   }
}
