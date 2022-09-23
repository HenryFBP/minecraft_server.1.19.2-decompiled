import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ctd extends cti implements bam {
   private static final int f = 4;
   public static final bbe[][] a = new bbe[][]{{bbi.a, bbi.c}, {bbi.k, bbi.h}, {bbi.e}, {bbi.j}};
   private static final Set<bbe> g = (Set<bbe>)Arrays.stream(a).flatMap(Arrays::stream).collect(Collectors.toSet());
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 3;
   private static final int h = 10;
   List<ctd.a> i = Lists.newArrayList();
   private List<ctd.a> j = Lists.newArrayList();
   int k;
   private int l;
   @Nullable
   bbe m;
   @Nullable
   bbe q;
   @Nullable
   private rq r;
   private bal s = bal.a;
   private final bww t = new bww() {
      @Override
      public int a(int $$0) {
         return switch($$0) {
            case 0 -> ctd.this.k;
            case 1 -> bbe.b(ctd.this.m);
            case 2 -> bbe.b(ctd.this.q);
            default -> 0;
         };
      }

      @Override
      public void a(int $$0, int $$1) {
         switch($$0) {
            case 0:
               ctd.this.k = $$1;
               break;
            case 1:
               if (!ctd.this.n.y && !ctd.this.i.isEmpty()) {
                  ctd.a(ctd.this.n, ctd.this.o, ajw.bi);
               }

               ctd.this.m = ctd.a($$1);
               break;
            case 2:
               ctd.this.q = ctd.a($$1);
         }

      }

      @Override
      public int a() {
         return 3;
      }
   };

   public ctd(gt $$0, cvo $$1) {
      super(ctk.n, $$0, $$1);
   }

   public static void a(cgx $$0, gt $$1, cvo $$2, ctd $$3) {
      int $$4 = $$1.u();
      int $$5 = $$1.v();
      int $$6 = $$1.w();
      gt $$7;
      if ($$3.l < $$5) {
         $$7 = $$1;
         $$3.j = Lists.newArrayList();
         $$3.l = $$1.v() - 1;
      } else {
         $$7 = new gt($$4, $$3.l + 1, $$6);
      }

      ctd.a $$9 = $$3.j.isEmpty() ? null : (ctd.a)$$3.j.get($$3.j.size() - 1);
      int $$10 = $$0.a(dar.a.b, $$4, $$6);

      for(int $$11 = 0; $$11 < 10 && $$7.v() <= $$10; ++$$11) {
         cvo $$12 = $$0.a_($$7);
         cjt $$13 = $$12.b();
         if ($$13 instanceof cjk) {
            float[] $$14 = ((cjk)$$13).a().d();
            if ($$3.j.size() <= 1) {
               $$9 = new ctd.a($$14);
               $$3.j.add($$9);
            } else if ($$9 != null) {
               if (Arrays.equals($$14, $$9.a)) {
                  $$9.a();
               } else {
                  $$9 = new ctd.a(new float[]{($$9.a[0] + $$14[0]) / 2.0F, ($$9.a[1] + $$14[1]) / 2.0F, ($$9.a[2] + $$14[2]) / 2.0F});
                  $$3.j.add($$9);
               }
            }
         } else {
            if ($$9 == null || $$12.b((cgd)$$0, $$7) >= 15 && !$$12.a(cju.B)) {
               $$3.j.clear();
               $$3.l = $$10;
               break;
            }

            $$9.a();
         }

         $$7 = $$7.b();
         ++$$3.l;
      }

      int $$15 = $$3.k;
      if ($$0.U() % 80L == 0L) {
         if (!$$3.i.isEmpty()) {
            $$3.k = a($$0, $$4, $$5, $$6);
         }

         if ($$3.k > 0 && !$$3.i.isEmpty()) {
            a($$0, $$1, $$3.k, $$3.m, $$3.q);
            a($$0, $$1, ajw.bg);
         }
      }

      if ($$3.l >= $$10) {
         $$3.l = $$0.u_() - 1;
         boolean $$16 = $$15 > 0;
         $$3.i = $$3.j;
         if (!$$0.y) {
            boolean $$17 = $$3.k > 0;
            if (!$$16 && $$17) {
               a($$0, $$1, ajw.bf);

               for(agh $$18 : $$0.a(agh.class, new dwl((double)$$4, (double)$$5, (double)$$6, (double)$$4, (double)($$5 - 4), (double)$$6).c(10.0, 5.0, 10.0))) {
                  aj.l.a($$18, $$3.k);
               }
            } else if ($$16 && !$$17) {
               a($$0, $$1, ajw.bh);
            }
         }
      }

   }

   private static int a(cgx $$0, int $$1, int $$2, int $$3) {
      int $$4 = 0;

      for(int $$5 = 1; $$5 <= 4; $$4 = $$5++) {
         int $$6 = $$2 - $$5;
         if ($$6 < $$0.u_()) {
            break;
         }

         boolean $$7 = true;

         for(int $$8 = $$1 - $$5; $$8 <= $$1 + $$5 && $$7; ++$$8) {
            for(int $$9 = $$3 - $$5; $$9 <= $$3 + $$5; ++$$9) {
               if (!$$0.a_(new gt($$8, $$6, $$9)).a(akl.aD)) {
                  $$7 = false;
                  break;
               }
            }
         }

         if (!$$7) {
            break;
         }
      }

      return $$4;
   }

   @Override
   public void ab_() {
      a(this.n, this.o, ajw.bh);
      super.ab_();
   }

   private static void a(cgx $$0, gt $$1, int $$2, @Nullable bbe $$3, @Nullable bbe $$4) {
      if (!$$0.y && $$3 != null) {
         double $$5 = (double)($$2 * 10 + 10);
         int $$6 = 0;
         if ($$2 >= 4 && $$3 == $$4) {
            $$6 = 1;
         }

         int $$7 = (9 + $$2 * 2) * 20;
         dwl $$8 = new dwl($$1).g($$5).b(0.0, (double)$$0.v_(), 0.0);
         List<buc> $$9 = $$0.a(buc.class, $$8);

         for(buc $$10 : $$9) {
            $$10.b(new bbg($$3, $$7, $$6, true, true));
         }

         if ($$2 >= 4 && $$3 != $$4 && $$4 != null) {
            for(buc $$11 : $$9) {
               $$11.b(new bbg($$4, $$7, 0, true, true));
            }
         }

      }
   }

   public static void a(cgx $$0, gt $$1, ajv $$2) {
      $$0.a(null, $$1, $$2, ajx.e, 1.0F, 1.0F);
   }

   public List<ctd.a> c() {
      return (List<ctd.a>)(this.k == 0 ? ImmutableList.of() : this.i);
   }

   public tn f() {
      return tn.a(this);
   }

   @Override
   public pj aa_() {
      return this.o();
   }

   @Nullable
   static bbe a(int $$0) {
      bbe $$1 = bbe.a($$0);
      return g.contains($$1) ? $$1 : null;
   }

   @Override
   public void a(pj $$0) {
      super.a($$0);
      this.m = a($$0.h("Primary"));
      this.q = a($$0.h("Secondary"));
      if ($$0.b("CustomName", 8)) {
         this.r = rq.a.a($$0.l("CustomName"));
      }

      this.s = bal.b($$0);
   }

   @Override
   protected void b(pj $$0) {
      super.b($$0);
      $$0.a("Primary", bbe.b(this.m));
      $$0.a("Secondary", bbe.b(this.q));
      $$0.a("Levels", this.k);
      if (this.r != null) {
         $$0.a("CustomName", rq.a.a(this.r));
      }

      this.s.a($$0);
   }

   public void a(@Nullable rq $$0) {
      this.r = $$0;
   }

   @Nullable
   @Override
   public bwm createMenu(int $$0, bub $$1, buc $$2) {
      return ctc.a($$2, this.s, this.C_()) ? new bwp($$0, $$1, this.t, bwx.a(this.n, this.p())) : null;
   }

   @Override
   public rq C_() {
      return (rq)(this.r != null ? this.r : rq.c("container.beacon"));
   }

   @Override
   public void a(cgx $$0) {
      super.a($$0);
      this.l = $$0.u_() - 1;
   }

   public static class a {
      final float[] a;
      private int b;

      public a(float[] $$0) {
         this.a = $$0;
         this.b = 1;
      }

      protected void a() {
         ++this.b;
      }

      public float[] b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }
   }
}
