import java.util.UUID;
import javax.annotation.Nullable;

public class bpc extends bpa {
   private static final UUID bX = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aaj<Integer> cn = aam.a(bpc.class, aal.b);

   public bpc(bbr<? extends bpc> $$0, cgx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(amn $$0) {
      this.a(bdd.a).a((double)this.b($$0));
      this.a(bdd.d).a(this.d($$0));
      this.a(bdd.m).a(this.c($$0));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(cn, 0);
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("Variant", this.fL());
      if (!this.ci.a(1).b()) {
         $$0.a("ArmorItem", (qc)this.ci.a(1).b(new pj()));
      }

   }

   public cax q() {
      return this.c(bbs.e);
   }

   private void o(cax $$0) {
      this.a(bbs.e, $$0);
      this.a(bbs.e, 0.0F);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cax $$1 = cax.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.m($$1)) {
            this.ci.a(1, $$1);
         }
      }

      this.ga();
   }

   private void w(int $$0) {
      this.Y.b(cn, $$0);
   }

   private int fL() {
      return this.Y.a(cn);
   }

   private void a(bpj $$0, bpe $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bpj t() {
      return bpj.a(this.fL() & 0xFF);
   }

   public bpe fK() {
      return bpe.a((this.fL() & 0xFF00) >> 8);
   }

   @Override
   protected void ga() {
      if (!this.s.y) {
         super.ga();
         this.p(this.ci.a(1));
         this.a(bbs.e, 0.0F);
      }
   }

   private void p(cax $$0) {
      this.o($$0);
      if (!this.s.y) {
         this.a(bdd.i).b(bX);
         if (this.m($$0)) {
            int $$1 = ((cap)$$0.c()).j();
            if ($$1 != 0) {
               this.a(bdd.i).b(new bdb(bX, "Horse armor bonus", (double)$$1, bdb.a.a));
            }
         }
      }

   }

   @Override
   public void a(bac $$0) {
      cax $$1 = this.q();
      super.a($$0);
      cax $$2 = this.q();
      if (this.S > 20 && this.m($$2) && $$1 != $$2) {
         this.a(ajw.ji, 0.5F, 1.0F);
      }

   }

   @Override
   protected void a(cqw $$0) {
      super.a($$0);
      if (this.R.a(10) == 0) {
         this.a(ajw.jj, $$0.a() * 0.6F, $$0.b());
      }

   }

   @Override
   protected ajv r() {
      super.r();
      return ajw.jg;
   }

   @Override
   protected ajv x_() {
      super.x_();
      return ajw.jk;
   }

   @Nullable
   @Override
   protected ajv gc() {
      return ajw.jl;
   }

   @Override
   protected ajv c(baw $$0) {
      super.c($$0);
      return ajw.jn;
   }

   @Override
   protected ajv gd() {
      super.gd();
      return ajw.jh;
   }

   @Override
   public baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!this.y_()) {
         if (this.fS() && $$0.fo()) {
            this.b($$0);
            return baj.a(this.s.y);
         }

         if (this.bJ()) {
            return super.b($$0, $$1);
         }
      }

      if (!$$2.b()) {
         if (this.n($$2)) {
            return this.a($$0, $$2);
         }

         baj $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }

         if (!this.fS()) {
            this.gi();
            return baj.a(this.s.y);
         }

         boolean $$4 = !this.y_() && !this.d() && $$2.a(caz.mn);
         if (this.m($$2) || $$4) {
            this.b($$0);
            return baj.a(this.s.y);
         }
      }

      if (this.y_()) {
         return super.b($$0, $$1);
      } else {
         this.e($$0);
         return baj.a(this.s.y);
      }
   }

   @Override
   public boolean a(bne $$0) {
      if ($$0 == this) {
         return false;
      } else if (!($$0 instanceof bpb) && !($$0 instanceof bpc)) {
         return false;
      } else {
         return this.gk() && ((bpa)$$0).gk();
      }
   }

   @Override
   public bbk a(agg $$0, bbk $$1) {
      bpa $$2;
      if ($$1 instanceof bpb) {
         $$2 = bbr.aj.a((cgx)$$0);
      } else {
         bpc $$3 = (bpc)$$1;
         $$2 = bbr.P.a((cgx)$$0);
         int $$5 = this.R.a(9);
         bpj $$6;
         if ($$5 < 4) {
            $$6 = this.t();
         } else if ($$5 < 8) {
            $$6 = $$3.t();
         } else {
            $$6 = ad.a((bpj[])bpj.values(), this.R);
         }

         int $$9 = this.R.a(5);
         bpe $$10;
         if ($$9 < 2) {
            $$10 = this.fK();
         } else if ($$9 < 4) {
            $$10 = $$3.fK();
         } else {
            $$10 = ad.a((bpe[])bpe.values(), this.R);
         }

         ((bpc)$$2).a($$6, $$10);
      }

      this.a($$1, $$2);
      return $$2;
   }

   @Override
   public boolean gl() {
      return true;
   }

   @Override
   public boolean m(cax $$0) {
      return $$0.c() instanceof cap;
   }

   @Nullable
   @Override
   public bcu a(chm $$0, bah $$1, bcg $$2, @Nullable bcu $$3, @Nullable pj $$4) {
      amn $$5 = $$0.r_();
      bpj $$6;
      if ($$3 instanceof bpc.a) {
         $$6 = ((bpc.a)$$3).a;
      } else {
         $$6 = ad.a((bpj[])bpj.values(), $$5);
         $$3 = new bpc.a($$6);
      }

      this.a($$6, ad.a((bpe[])bpe.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bbk.a {
      public final bpj a;

      public a(bpj $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
