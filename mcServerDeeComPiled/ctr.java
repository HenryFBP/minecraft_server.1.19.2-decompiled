import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;

public class ctr extends cti {
   private static final int b = 2;
   private static final int c = 13;
   private static final float d = -0.0375F;
   private static final int e = 16;
   private static final int f = 42;
   private static final int g = 8;
   private static final cjt[] h = new cjt[]{cju.gX, cju.gY, cju.hg, cju.gZ};
   public int a;
   private float i;
   private boolean j;
   private boolean k;
   private final List<gt> l = Lists.newArrayList();
   @Nullable
   private bcc m;
   @Nullable
   private UUID q;
   private long r;

   public ctr(gt $$0, cvo $$1) {
      super(ctk.y, $$0, $$1);
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      if ($$0.b("Target")) {
         this.q = $$0.a("Target");
      } else {
         this.q = null;
      }

   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      if (this.m != null) {
         $$0.a("Target", this.m.co());
      }

   }

   public tn c() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctr $$3) {
      ++$$3.a;
      long $$4 = $$0.U();
      List<gt> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         $$3.j = a($$0, $$1, $$5);
         a($$3, $$5);
      }

      a($$0, $$1, $$3);
      a($$0, $$1, $$5, $$3.m, $$3.a);
      if ($$3.d()) {
         ++$$3.i;
      }

   }

   public static void b(cgx $$0, gt $$1, cvo $$2, ctr $$3) {
      ++$$3.a;
      long $$4 = $$0.U();
      List<gt> $$5 = $$3.l;
      if ($$4 % 40L == 0L) {
         boolean $$6 = a($$0, $$1, $$5);
         if ($$6 != $$3.j) {
            ajv $$7 = $$6 ? ajw.dr : ajw.dv;
            $$0.a(null, $$1, $$7, ajx.e, 1.0F, 1.0F);
         }

         $$3.j = $$6;
         a($$3, $$5);
         if ($$6) {
            b($$0, $$1, $$5);
            a($$0, $$1, $$2, $$5, $$3);
         }
      }

      if ($$3.d()) {
         if ($$4 % 80L == 0L) {
            $$0.a(null, $$1, ajw.ds, ajx.e, 1.0F, 1.0F);
         }

         if ($$4 > $$3.r) {
            $$3.r = $$4 + 60L + (long)$$0.r_().a(40);
            $$0.a(null, $$1, ajw.dt, ajx.e, 1.0F, 1.0F);
         }
      }

   }

   private static void a(ctr $$0, List<gt> $$1) {
      $$0.a($$1.size() >= 42);
   }

   private static boolean a(cgx $$0, gt $$1, List<gt> $$2) {
      $$2.clear();

      for(int $$3 = -1; $$3 <= 1; ++$$3) {
         for(int $$4 = -1; $$4 <= 1; ++$$4) {
            for(int $$5 = -1; $$5 <= 1; ++$$5) {
               gt $$6 = $$1.b($$3, $$4, $$5);
               if (!$$0.C($$6)) {
                  return false;
               }
            }
         }
      }

      for(int $$7 = -2; $$7 <= 2; ++$$7) {
         for(int $$8 = -2; $$8 <= 2; ++$$8) {
            for(int $$9 = -2; $$9 <= 2; ++$$9) {
               int $$10 = Math.abs($$7);
               int $$11 = Math.abs($$8);
               int $$12 = Math.abs($$9);
               if (($$10 > 1 || $$11 > 1 || $$12 > 1)
                  && ($$7 == 0 && ($$11 == 2 || $$12 == 2) || $$8 == 0 && ($$10 == 2 || $$12 == 2) || $$9 == 0 && ($$10 == 2 || $$11 == 2))) {
                  gt $$13 = $$1.b($$7, $$8, $$9);
                  cvo $$14 = $$0.a_($$13);

                  for(cjt $$15 : h) {
                     if ($$14.a($$15)) {
                        $$2.add($$13);
                     }
                  }
               }
            }
         }
      }

      return $$2.size() >= 16;
   }

   private static void b(cgx $$0, gt $$1, List<gt> $$2) {
      int $$3 = $$2.size();
      int $$4 = $$3 / 7 * 16;
      int $$5 = $$1.u();
      int $$6 = $$1.v();
      int $$7 = $$1.w();
      dwl $$8 = new dwl((double)$$5, (double)$$6, (double)$$7, (double)($$5 + 1), (double)($$6 + 1), (double)($$7 + 1))
         .g((double)$$4)
         .b(0.0, (double)$$0.v_(), 0.0);
      List<buc> $$9 = $$0.a(buc.class, $$8);
      if (!$$9.isEmpty()) {
         for(buc $$10 : $$9) {
            if ($$1.a($$10.da(), (double)$$4) && $$10.aS()) {
               $$10.b(new bbg(bbi.C, 260, 0, true, true));
            }
         }

      }
   }

   private static void a(cgx $$0, gt $$1, cvo $$2, List<gt> $$3, ctr $$4) {
      bcc $$5 = $$4.m;
      int $$6 = $$3.size();
      if ($$6 < 42) {
         $$4.m = null;
      } else if ($$4.m == null && $$4.q != null) {
         $$4.m = a($$0, $$1, $$4.q);
         $$4.q = null;
      } else if ($$4.m == null) {
         List<bcc> $$7 = $$0.a(bcc.class, a($$1), $$0x -> $$0x instanceof bri && $$0x.aS());
         if (!$$7.isEmpty()) {
            $$4.m = (bcc)$$7.get($$0.w.a($$7.size()));
         }
      } else if (!$$4.m.bo() || !$$1.a($$4.m.da(), 8.0)) {
         $$4.m = null;
      }

      if ($$4.m != null) {
         $$0.a(null, $$4.m.df(), $$4.m.dh(), $$4.m.dl(), ajw.du, ajx.e, 1.0F, 1.0F);
         $$4.m.a(baw.o, 4.0F);
      }

      if ($$5 != $$4.m) {
         $$0.a($$1, $$2, $$2, 2);
      }

   }

   private static void a(cgx $$0, gt $$1, ctr $$2) {
      if ($$2.q == null) {
         $$2.m = null;
      } else if ($$2.m == null || !$$2.m.co().equals($$2.q)) {
         $$2.m = a($$0, $$1, $$2.q);
         if ($$2.m == null) {
            $$2.q = null;
         }
      }

   }

   private static dwl a(gt $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      return new dwl((double)$$1, (double)$$2, (double)$$3, (double)($$1 + 1), (double)($$2 + 1), (double)($$3 + 1)).g(8.0);
   }

   @Nullable
   private static bcc a(cgx $$0, gt $$1, UUID $$2) {
      List<bcc> $$3 = $$0.a(bcc.class, a($$1), $$1x -> $$1x.co().equals($$2));
      return $$3.size() == 1 ? (bcc)$$3.get(0) : null;
   }

   private static void a(cgx $$0, gt $$1, List<gt> $$2, @Nullable bbn $$3, int $$4) {
      amn $$5 = $$0.w;
      double $$6 = (double)(ami.a((float)($$4 + 35) * 0.1F) / 2.0F + 0.5F);
      $$6 = ($$6 * $$6 + $$6) * 0.3F;
      dwq $$7 = new dwq((double)$$1.u() + 0.5, (double)$$1.v() + 1.5 + $$6, (double)$$1.w() + 0.5);

      for(gt $$8 : $$2) {
         if ($$5.a(50) == 0) {
            gt $$9 = $$8.b($$1);
            float $$10 = -0.5F + $$5.i() + (float)$$9.u();
            float $$11 = -2.0F + $$5.i() + (float)$$9.v();
            float $$12 = -0.5F + $$5.i() + (float)$$9.w();
            $$0.a(io.ak, $$7.c, $$7.d, $$7.e, (double)$$10, (double)$$11, (double)$$12);
         }
      }

      if ($$3 != null) {
         dwq $$13 = new dwq($$3.df(), $$3.dj(), $$3.dl());
         float $$14 = (-0.5F + $$5.i()) * (3.0F + $$3.cW());
         float $$15 = -1.0F + $$5.i() * $$3.cX();
         float $$16 = (-0.5F + $$5.i()) * (3.0F + $$3.cW());
         dwq $$17 = new dwq((double)$$14, (double)$$15, (double)$$16);
         $$0.a(io.ak, $$13.c, $$13.d, $$13.e, $$17.c, $$17.d, $$17.e);
      }

   }

   public boolean d() {
      return this.j;
   }

   public boolean f() {
      return this.k;
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   public float a(float $$0) {
      return (this.i + $$0) * -0.0375F;
   }
}
