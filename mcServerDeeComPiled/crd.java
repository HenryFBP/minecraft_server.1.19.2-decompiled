import java.util.stream.IntStream;

public class crd extends cjt implements cql {
   public static final cwi a = cnf.aD;
   public static final cwm<cwn> b = cwe.af;
   public static final cwm<cww> c = cwe.bj;
   public static final cwf d = cwe.C;
   protected static final dxj e = cqn.d;
   protected static final dxj f = cqn.c;
   protected static final dxj g = cjt.a(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   protected static final dxj h = cjt.a(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   protected static final dxj i = cjt.a(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   protected static final dxj j = cjt.a(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   protected static final dxj k = cjt.a(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   protected static final dxj l = cjt.a(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   protected static final dxj m = cjt.a(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   protected static final dxj n = cjt.a(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   protected static final dxj[] E = a(e, g, k, h, l);
   protected static final dxj[] F = a(f, i, m, j, n);
   private static final int[] G = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final cjt H;
   private final cvo I;

   private static dxj[] a(dxj $$0, dxj $$1, dxj $$2, dxj $$3, dxj $$4) {
      return (dxj[])IntStream.range(0, 16).mapToObj($$5 -> a($$5, $$0, $$1, $$2, $$3, $$4)).toArray($$0x -> new dxj[$$0x]);
   }

   private static dxj a(int $$0, dxj $$1, dxj $$2, dxj $$3, dxj $$4, dxj $$5) {
      dxj $$6 = $$1;
      if (($$0 & 1) != 0) {
         $$6 = dxg.a($$1, $$2);
      }

      if (($$0 & 2) != 0) {
         $$6 = dxg.a($$6, $$3);
      }

      if (($$0 & 4) != 0) {
         $$6 = dxg.a($$6, $$4);
      }

      if (($$0 & 8) != 0) {
         $$6 = dxg.a($$6, $$5);
      }

      return $$6;
   }

   protected crd(cvo $$0, cvn.c $$1) {
      super($$1);
      this.k(this.D.b().a(a, gy.c).a(b, cwn.b).a(c, cww.a).a(d, Boolean.valueOf(false)));
      this.H = $$0.b();
      this.I = $$0;
   }

   @Override
   public boolean g_(cvo $$0) {
      return true;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return ($$0.c(b) == cwn.a ? E : F)[G[this.n($$0)]];
   }

   private int n(cvo $$0) {
      return ((cww)$$0.c(c)).ordinal() * 4 + ((gy)$$0.c(a)).e();
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, amn $$3) {
      this.H.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, buc $$3) {
      this.I.a($$1, $$2, $$3);
   }

   @Override
   public void a(cgy $$0, gt $$1, cvo $$2) {
      this.H.a($$0, $$1, $$2);
   }

   @Override
   public float e() {
      return this.H.e();
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$0.b())) {
         $$1.a(this.I, $$2, cju.a, $$2, false);
         this.H.b(this.I, $$1, $$2, $$3, false);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         this.I.b($$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, bbn $$3) {
      this.H.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(cvo $$0) {
      return this.H.e_($$0);
   }

   @Override
   public void b(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.H.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      this.H.a($$0, $$1, $$2, $$3);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      return this.I.a($$1, $$3, $$4, $$5);
   }

   @Override
   public void a(cgx $$0, gt $$1, cgp $$2) {
      this.H.a($$0, $$1, $$2);
   }

   @Override
   public cvo a(ccx $$0) {
      gy $$1 = $$0.k();
      gt $$2 = $$0.a();
      dpv $$3 = $$0.q().b_($$2);
      cvo $$4 = this.m()
         .a(a, $$0.g())
         .a(b, $$1 != gy.a && ($$1 == gy.b || !($$0.l().d - (double)$$2.v() > 0.5)) ? cwn.b : cwn.a)
         .a(d, Boolean.valueOf($$3.a() == dpw.c));
      return $$4.a(c, i($$4, $$0.q(), $$2));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(c, i($$0, $$3, $$4)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static cww i(cvo $$0, cgd $$1, gt $$2) {
      gy $$3 = $$0.c(a);
      cvo $$4 = $$1.a_($$2.a($$3));
      if (h($$4) && $$0.c(b) == $$4.c(b)) {
         gy $$5 = $$4.c(a);
         if ($$5.o() != ((gy)$$0.c(a)).o() && c($$0, $$1, $$2, $$5.g())) {
            if ($$5 == $$3.i()) {
               return cww.d;
            }

            return cww.e;
         }
      }

      cvo $$6 = $$1.a_($$2.a($$3.g()));
      if (h($$6) && $$0.c(b) == $$6.c(b)) {
         gy $$7 = $$6.c(a);
         if ($$7.o() != ((gy)$$0.c(a)).o() && c($$0, $$1, $$2, $$7)) {
            if ($$7 == $$3.i()) {
               return cww.b;
            }

            return cww.c;
         }
      }

      return cww.a;
   }

   private static boolean c(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      cvo $$4 = $$1.a_($$2.a($$3));
      return !h($$4) || $$4.c(a) != $$0.c(a) || $$4.c(b) != $$0.c(b);
   }

   public static boolean h(cvo $$0) {
      return $$0.b() instanceof crd;
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      gy $$2 = $$0.c(a);
      cww $$3 = $$0.c(c);
      switch($$1) {
         case b:
            if ($$2.o() == gy.a.c) {
               switch($$3) {
                  case b:
                     return $$0.a(cpw.c).a(c, cww.c);
                  case c:
                     return $$0.a(cpw.c).a(c, cww.b);
                  case d:
                     return $$0.a(cpw.c).a(c, cww.e);
                  case e:
                     return $$0.a(cpw.c).a(c, cww.d);
                  default:
                     return $$0.a(cpw.c);
               }
            }
            break;
         case c:
            if ($$2.o() == gy.a.a) {
               switch($$3) {
                  case b:
                     return $$0.a(cpw.c).a(c, cww.b);
                  case c:
                     return $$0.a(cpw.c).a(c, cww.c);
                  case d:
                     return $$0.a(cpw.c).a(c, cww.e);
                  case e:
                     return $$0.a(cpw.c).a(c, cww.d);
                  case a:
                     return $$0.a(cpw.c);
               }
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c, d);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(d) ? dpw.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cvo $$0, cgd $$1, gt $$2, dqm $$3) {
      return false;
   }
}
