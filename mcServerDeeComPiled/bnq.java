import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bnq extends bnc implements bcj {
   protected static final aaj<Byte> c = aam.a(bnq.class, aal.a);
   private static final int d = 25;
   private int e;
   private int bX;
   private static final azu bY = anc.a(20, 39);
   private int bZ;
   @Nullable
   private UUID ca;

   public bnq(bbr<? extends bnq> $$0, cgx $$1) {
      super($$0, $$1);
      this.P = 1.0F;
   }

   @Override
   protected void u() {
      this.bS.a(1, new biz(this, 1.0, true));
      this.bS.a(2, new bje(this, 0.9, 32.0F));
      this.bS.a(2, new bja(this, 0.6, false));
      this.bS.a(4, new bir(this, 0.6));
      this.bS.a(5, new bjg(this));
      this.bS.a(7, new bix(this, buc.class, 6.0F));
      this.bS.a(8, new bjk(this));
      this.bT.a(1, new bkf(this));
      this.bT.a(2, new bkg(this));
      this.bT.a(3, new bkh(this, buc.class, 10, true, false, this::a_));
      this.bT.a(3, new bkh(this, bce.class, 5, false, false, $$0 -> $$0 instanceof bri && !($$0 instanceof brc)));
      this.bT.a(4, new bkn<>(this, false));
   }

   @Override
   protected void a_() {
      super.a_();
      this.Y.a(c, (byte)0);
   }

   public static bdc.a n() {
      return bce.w().a(bdd.a, 100.0).a(bdd.d, 0.25).a(bdd.c, 1.0).a(bdd.f, 15.0);
   }

   @Override
   protected int m(int $$0) {
      return $$0;
   }

   @Override
   protected void A(bbn $$0) {
      if ($$0 instanceof bri && !($$0 instanceof brc) && this.dQ().a(20) == 0) {
         this.h((bcc)$$0);
      }

      super.A($$0);
   }

   @Override
   public void w_() {
      super.w_();
      if (this.e > 0) {
         --this.e;
      }

      if (this.bX > 0) {
         --this.bX;
      }

      if (this.dd().i() > 2.5000003E-7F && this.R.a(5) == 0) {
         int $$0 = ami.b(this.df());
         int $$1 = ami.b(this.dh() - 0.2F);
         int $$2 = ami.b(this.dl());
         cvo $$3 = this.s.a_(new gt($$0, $$1, $$2));
         if (!$$3.h()) {
            this.s
               .a(
                  new ig(io.c, $$3),
                  this.df() + ((double)this.R.i() - 0.5) * (double)this.cW(),
                  this.dh() + 0.1,
                  this.dl() + ((double)this.R.i() - 0.5) * (double)this.cW(),
                  4.0 * ((double)this.R.i() - 0.5),
                  0.5,
                  ((double)this.R.i() - 0.5) * 4.0
               );
         }
      }

      if (!this.s.y) {
         this.a((agg)this.s, true);
      }

   }

   @Override
   public boolean a(bbr<?> $$0) {
      if (this.fK() && $$0 == bbr.bn) {
         return false;
      } else {
         return $$0 == bbr.q ? false : super.a($$0);
      }
   }

   @Override
   public void b(pj $$0) {
      super.b($$0);
      $$0.a("PlayerCreated", this.fK());
      this.c($$0);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.w($$0.q("PlayerCreated"));
      this.a(this.s, $$0);
   }

   @Override
   public void c() {
      this.a(bY.a(this.R));
   }

   @Override
   public void a(int $$0) {
      this.bZ = $$0;
   }

   @Override
   public int a() {
      return this.bZ;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ca = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ca;
   }

   private float fL() {
      return (float)this.b(bdd.f);
   }

   @Override
   public boolean z(bbn $$0) {
      this.e = 10;
      this.s.a(this, (byte)4);
      float $$1 = this.fL();
      float $$2 = (int)$$1 > 0 ? $$1 / 2.0F + (float)this.R.a((int)$$1) : $$1;
      boolean $$3 = $$0.a(baw.c(this), $$2);
      if ($$3) {
         double $$5 = $$0 instanceof bcc $$4 ? $$4.b(bdd.c) : 0.0;
         double $$6 = Math.max(0.0, 1.0 - $$5);
         $$0.f($$0.dd().b(0.0, 0.4F * $$6, 0.0));
         this.a(this, $$0);
      }

      this.a(ajw.jO, 1.0F, 1.0F);
      return $$3;
   }

   @Override
   public boolean a(baw $$0, float $$1) {
      bnq.a $$2 = this.q();
      boolean $$3 = super.a($$0, $$1);
      if ($$3 && this.q() != $$2) {
         this.a(ajw.jP, 1.0F, 1.0F);
      }

      return $$3;
   }

   public bnq.a q() {
      return bnq.a.a(this.ef() / this.et());
   }

   @Override
   public void a(byte $$0) {
      if ($$0 == 4) {
         this.e = 10;
         this.a(ajw.jO, 1.0F, 1.0F);
      } else if ($$0 == 11) {
         this.bX = 400;
      } else if ($$0 == 34) {
         this.bX = 0;
      } else {
         super.a($$0);
      }

   }

   public int t() {
      return this.e;
   }

   public void v(boolean $$0) {
      if ($$0) {
         this.bX = 400;
         this.s.a(this, (byte)11);
      } else {
         this.bX = 0;
         this.s.a(this, (byte)34);
      }

   }

   @Override
   protected ajv c(baw $$0) {
      return ajw.jR;
   }

   @Override
   protected ajv x_() {
      return ajw.jQ;
   }

   @Override
   protected baj b(buc $$0, bai $$1) {
      cax $$2 = $$0.b($$1);
      if (!$$2.a(caz.na)) {
         return baj.d;
      } else {
         float $$3 = this.ef();
         this.b(25.0F);
         if (this.ef() == $$3) {
            return baj.d;
         } else {
            float $$4 = 1.0F + (this.R.i() - this.R.i()) * 0.2F;
            this.a(ajw.jS, 1.0F, $$4);
            if (!$$0.fB().d) {
               $$2.g(1);
            }

            return baj.a(this.s.y);
         }
      }
   }

   @Override
   protected void b(gt $$0, cvo $$1) {
      this.a(ajw.jT, 1.0F, 1.0F);
   }

   public int fJ() {
      return this.bX;
   }

   public boolean fK() {
      return (this.Y.a(c) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.Y.a(c);
      if ($$0) {
         this.Y.b(c, (byte)($$1 | 1));
      } else {
         this.Y.b(c, (byte)($$1 & -2));
      }

   }

   @Override
   public void a(baw $$0) {
      super.a($$0);
   }

   @Override
   public boolean a(cha $$0) {
      gt $$1 = this.da();
      gt $$2 = $$1.c();
      cvo $$3 = $$0.a_($$2);
      if (!$$3.a($$0, $$2, this)) {
         return false;
      } else {
         for(int $$4 = 1; $$4 < 3; ++$$4) {
            gt $$5 = $$1.b($$4);
            cvo $$6 = $$0.a_($$5);
            if (!chi.a($$0, $$5, $$6, $$6.p(), bbr.S)) {
               return false;
            }
         }

         return chi.a($$0, $$1, $$0.a_($$1), dpw.a.h(), bbr.S) && $$0.f(this);
      }
   }

   @Override
   public dwq cB() {
      return new dwq(0.0, (double)(0.875F * this.cA()), (double)(this.cW() * 0.4F));
   }

   public static enum a {
      a(1.0F),
      b(0.75F),
      c(0.5F),
      d(0.25F);

      private static final List<bnq.a> e = (List<bnq.a>)Stream.of(values())
         .sorted(Comparator.comparingDouble($$0 -> (double)$$0.f))
         .collect(ImmutableList.toImmutableList());
      private final float f;

      private a(float $$0) {
         this.f = $$0;
      }

      public static bnq.a a(float $$0) {
         for(bnq.a $$1 : e) {
            if ($$0 < $$1.f) {
               return $$1;
            }
         }

         return a;
      }
   }
}
