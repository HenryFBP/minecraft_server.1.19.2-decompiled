import java.util.Optional;
import javax.annotation.Nullable;

public class ctm extends cti implements baa {
   private static final int a = 2;
   private static final int b = 4;
   private final hi<cax> c = hi.a(4, cax.b);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cdq.a<bac, cdg> f = cdq.b(cds.e);

   public ctm(gt $$0, cvo $$1) {
      super(ctk.F, $$0, $$1);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctm $$3) {
      boolean $$4 = false;

      for(int $$5 = 0; $$5 < $$3.c.size(); ++$$5) {
         cax $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            int var10002 = $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bac $$7 = new bao($$6);
               cax $$8 = (cax)$$3.f.a($$7, $$0).map($$1x -> $$1x.a($$7)).orElse($$6);
               baf.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
               $$3.c.set($$5, cax.b);
               $$0.a($$1, $$2, $$2, 3);
               $$0.a(czv.c, $$1, czv.a.a($$2));
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }

   }

   public static void b(cgx $$0, gt $$1, cvo $$2, ctm $$3) {
      boolean $$4 = false;

      for(int $$5 = 0; $$5 < $$3.c.size(); ++$$5) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ami.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }

   }

   public static void c(cgx $$0, gt $$1, cvo $$2, ctm $$3) {
      amn $$4 = $$0.w;
      if ($$4.i() < 0.11F) {
         for(int $$5 = 0; $$5 < $$4.a(2) + 2; ++$$5) {
            cke.a($$0, $$1, $$2.c(cke.c), false);
         }
      }

      int $$6 = ((gy)$$2.c(cke.e)).e();

      for(int $$7 = 0; $$7 < $$3.c.size(); ++$$7) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            gy $$8 = gy.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for(int $$13 = 0; $$13 < 4; ++$$13) {
               $$0.a(io.Y, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }

   }

   public hi<cax> c() {
      return this.c;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.c.clear();
      bad.b($$0, this.c);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$1 = $$0.n("CookingTimes");
         System.arraycopy($$1, 0, this.d, 0, Math.min(this.e.length, $$1.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$2 = $$0.n("CookingTotalTimes");
         System.arraycopy($$2, 0, this.e, 0, Math.min(this.e.length, $$2.length));
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      bad.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public tn d() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      pj $$0 = new pj();
      bad.a($$0, this.c, true);
      return $$0;
   }

   public Optional<cdg> a(cax $$0) {
      return this.c.stream().noneMatch(cax::b) ? Optional.empty() : this.f.a(new bao($$0), this.n);
   }

   public boolean a(@Nullable bbn $$0, cax $$1, int $$2) {
      for(int $$3 = 0; $$3 < this.c.size(); ++$$3) {
         cax $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.n.a(czv.c, this.p(), czv.a.a($$0, this.q()));
            this.g();
            return true;
         }
      }

      return false;
   }

   private void g() {
      this.e();
      this.k().a(this.p(), this.q(), this.q(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void f() {
      if (this.n != null) {
         this.g();
      }

   }
}
