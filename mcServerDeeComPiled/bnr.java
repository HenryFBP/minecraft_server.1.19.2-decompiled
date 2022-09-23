import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class bnr extends bnl implements bcs {
   private static final aaj<String> bX = aam.a(bnr.class, aal.d);
   private static final int bY = 1024;
   @Nullable
   private bbe ca;
   private int cb;
   @Nullable
   private UUID cc;

   public bnr(bbr<? extends bnr> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gt $$0, cha $$1) {
      return $$1.a_($$0.c()).a(cju.es) ? 10.0F : $$1.z($$0);
   }

   public static boolean c(bbr<bnr> $$0, cgy $$1, bcg $$2, gt $$3, amn $$4) {
      return $$1.a_($$3.c()).a(akl.bG) && a($$1, $$3);
   }

   @Override
   public void a(agg $$0, bcb $$1) {
      UUID $$2 = $$1.co();
      if (!$$2.equals(this.cc)) {
         this.a(this.t() == bnr.a.a ? bnr.a.b : bnr.a.a);
         this.cc = $$2;
         this.a(ajw.ll, 2.0F, 1.0F);
      }

   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(bX, bnr.a.a.c);
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if ($$2.a(caz.nM) && !this.y_()) {
         boolean $$3 = false;
         cax $$4;
         if (this.ca != null) {
            $$3 = true;
            $$4 = new cax(caz.tN);
            cce.a($$4, this.ca, this.cb);
            this.ca = null;
            this.cb = 0;
         } else {
            $$4 = new cax(caz.nN);
         }

         cax $$6 = cay.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ajv $$7;
         if ($$3) {
            $$7 = ajw.lo;
         } else {
            $$7 = ajw.ln;
         }

         this.a($$7, 1.0F, 1.0F);
         return baj.a(this.s.y);
      } else if ($$2.a(caz.qd) && this.a()) {
         this.a(ajx.h);
         this.a(czv.O, $$0);
         if (!this.s.y) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return baj.a(this.s.y);
      } else if (this.t() == bnr.a.b && $$2.a(aks.K)) {
         if (this.ca != null) {
            for(int $$9 = 0; $$9 < 2; ++$$9) {
               this.s.a(io.Y, this.df() + this.R.j() / 2.0, this.e(0.5), this.dl() + this.R.j() / 2.0, 0.0, this.R.j() / 5.0, 0.0);
            }
         } else {
            Optional<Pair<bbe, Integer>> $$10 = this.m($$2);
            if (!$$10.isPresent()) {
               return baj.d;
            }

            Pair<bbe, Integer> $$11 = (Pair)$$10.get();
            if (!$$0.fB().d) {
               $$2.g(1);
            }

            for(int $$12 = 0; $$12 < 4; ++$$12) {
               this.s.a(io.q, this.df() + this.R.j() / 2.0, this.e(0.5), this.dl() + this.R.j() / 2.0, 0.0, this.R.j() / 5.0, 0.0);
            }

            this.ca = (bbe)$$11.getLeft();
            this.cb = $$11.getRight();
            this.a(ajw.lm, 2.0F, 1.0F);
         }

         return baj.a(this.s.y);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ajx $$0) {
      this.s.a(null, this, ajw.lp, $$0, 1.0F, 1.0F);
      if (!this.s.k_()) {
         ((agg)this.s).a(io.x, this.df(), this.e(0.5), this.dl(), 1, 0.0, 0.0, 0.0, 0.0);
         this.ah();
         bnl $$1 = bbr.p.a(this.s);
         $$1.b(this.df(), this.dh(), this.dl(), this.dq(), this.ds());
         $$1.c(this.ef());
         $$1.aX = this.aX;
         if (this.Y()) {
            $$1.b(this.Z());
            $$1.n(this.ct());
         }

         if (this.fr()) {
            $$1.fp();
         }

         $$1.m(this.ci());
         this.s.b($$1);

         for(int $$2 = 0; $$2 < 5; ++$$2) {
            this.s.b(new bqv(this.s, this.df(), this.e(1.0), this.dl(), new cax(this.t().d.b())));
         }
      }

   }

   @Override
   public boolean a() {
      return this.bo() && !this.y_();
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c);
      if (this.ca != null) {
         $$0.a("EffectId", bbe.a(this.ca));
         $$0.a("EffectDuration", this.cb);
      }

   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.a(bnr.a.a($$0.l("Type")));
      if ($$0.b("EffectId", 1)) {
         this.ca = bbe.a($$0.h("EffectId"));
      }

      if ($$0.b("EffectDuration", 3)) {
         this.cb = $$0.h("EffectDuration");
      }

   }

   private Optional<Pair<bbe, Integer>> m(cax $$0) {
      cat $$1 = $$0.c();
      if ($$1 instanceof byx) {
         cjt $$2 = ((byx)$$1).e();
         if ($$2 instanceof cmk $$3) {
            return Optional.of(Pair.of($$3.b(), $$3.c()));
         }
      }

      return Optional.empty();
   }

   private void a(bnr.a $$0) {
      this.Y.b(bX, $$0.c);
   }

   public bnr.a t() {
      return bnr.a.a(this.Y.a(bX));
   }

   public bnr c(agg $$0, bbk $$1) {
      bnr $$2 = bbr.ak.a((cgx)$$0);
      $$2.a(this.a((bnr)$$1));
      return $$2;
   }

   private bnr.a a(bnr $$0) {
      bnr.a $$1 = this.t();
      bnr.a $$2 = $$0.t();
      bnr.a $$3;
      if ($$1 == $$2 && this.R.a(1024) == 0) {
         $$3 = $$1 == bnr.a.b ? bnr.a.a : bnr.a.b;
      } else {
         $$3 = this.R.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a {
      a("red", cju.bS.m()),
      b("brown", cju.bR.m());

      final String c;
      final cvo d;

      private a(String $$0, cvo $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public cvo a() {
         return this.d;
      }

      static bnr.a a(String $$0) {
         for(bnr.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
