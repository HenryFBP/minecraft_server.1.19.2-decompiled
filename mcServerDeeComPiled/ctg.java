import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class ctg extends cti {
   private static final int d = 50;
   private static final int e = 60;
   private static final int f = 60;
   private static final int g = 40;
   private static final int h = 5;
   private static final int i = 48;
   private static final int j = 32;
   private static final int k = 48;
   private long l;
   public int a;
   public boolean b;
   public gy c;
   private List<bcc> m;
   private boolean q;
   private int r;

   public ctg(gt $$0, cvo $$1) {
      super(ctk.D, $$0, $$1);
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.c();
         this.r = 0;
         this.c = gy.a($$1);
         this.a = 0;
         this.b = true;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   private static void a(cgx $$0, gt $$1, cvo $$2, ctg $$3, ctg.a $$4) {
      if ($$3.b) {
         ++$$3.a;
      }

      if ($$3.a >= 50) {
         $$3.b = false;
         $$3.a = 0;
      }

      if ($$3.a >= 5 && $$3.r == 0 && a($$1, $$3.m)) {
         $$3.q = true;
         $$0.a(null, $$1, ajw.bv, ajx.e, 1.0F, 1.0F);
      }

      if ($$3.q) {
         if ($$3.r < 40) {
            ++$$3.r;
         } else {
            $$4.run($$0, $$1, $$3.m);
            $$3.q = false;
         }
      }

   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctg $$3) {
      a($$0, $$1, $$2, $$3, ctg::b);
   }

   public static void b(cgx $$0, gt $$1, cvo $$2, ctg $$3) {
      a($$0, $$1, $$2, $$3, ctg::a);
   }

   public void a(gy $$0) {
      gt $$1 = this.p();
      this.c = $$0;
      if (this.b) {
         this.a = 0;
      } else {
         this.b = true;
      }

      this.n.a($$1, this.q().b(), 1, $$0.d());
   }

   private void c() {
      gt $$0 = this.p();
      if (this.n.U() > this.l + 60L || this.m == null) {
         this.l = this.n.U();
         dwl $$1 = new dwl($$0).g(48.0);
         this.m = this.n.a(bcc.class, $$1);
      }

      if (!this.n.y) {
         for(bcc $$2 : this.m) {
            if ($$2.bo() && !$$2.dt() && $$0.a($$2.cY(), 32.0)) {
               $$2.dy().a(bku.D, this.n.U());
            }
         }
      }

   }

   private static boolean a(gt $$0, List<bcc> $$1) {
      for(bcc $$2 : $$1) {
         if ($$2.bo() && !$$2.dt() && $$0.a($$2.cY(), 32.0) && $$2.ad().a(akn.b)) {
            return true;
         }
      }

      return false;
   }

   private static void a(cgx $$0, gt $$1, List<bcc> $$2) {
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach(ctg::a);
   }

   private static void b(cgx $$0, gt $$1, List<bcc> $$2) {
      MutableInt $$3 = new MutableInt(16700985);
      int $$4 = (int)$$2.stream().filter($$1x -> $$1.a($$1x.cY(), 48.0)).count();
      $$2.stream().filter($$1x -> a($$1, $$1x)).forEach($$4x -> {
         float $$5 = 1.0F;
         double $$6 = Math.sqrt(($$4x.df() - (double)$$1.u()) * ($$4x.df() - (double)$$1.u()) + ($$4x.dl() - (double)$$1.w()) * ($$4x.dl() - (double)$$1.w()));
         double $$7 = (double)((float)$$1.u() + 0.5F) + 1.0 / $$6 * ($$4x.df() - (double)$$1.u());
         double $$8 = (double)((float)$$1.w() + 0.5F) + 1.0 / $$6 * ($$4x.dl() - (double)$$1.w());
         int $$9 = ami.a(($$4 - 21) / -2, 3, 15);

         for(int $$10 = 0; $$10 < $$9; ++$$10) {
            int $$11 = $$3.addAndGet(5);
            double $$12 = (double)als.a.b($$11) / 255.0;
            double $$13 = (double)als.a.c($$11) / 255.0;
            double $$14 = (double)als.a.d($$11) / 255.0;
            $$0.a(io.v, $$7, (double)((float)$$1.v() + 0.5F), $$8, $$12, $$13, $$14);
         }

      });
   }

   private static boolean a(gt $$0, bcc $$1) {
      return $$1.bo() && !$$1.dt() && $$0.a($$1.cY(), 48.0) && $$1.ad().a(akn.b);
   }

   private static void a(bcc $$0) {
      $$0.b(new bbg(bbi.x, 60));
   }

   @FunctionalInterface
   interface a {
      void run(cgx var1, gt var2, List<bcc> var3);
   }
}
