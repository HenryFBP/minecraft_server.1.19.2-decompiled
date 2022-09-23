import java.util.List;
import java.util.Map;

public class crx extends cjt {
   public static final cwf a = cwe.w;
   public static final cwf b = cwe.a;
   public static final cwf c = cwe.d;
   public static final cwf d = cox.a;
   public static final cwf e = cox.b;
   public static final cwf f = cox.c;
   public static final cwf g = cox.d;
   private static final Map<gy, cwf> j = clg.f;
   protected static final dxj h = cjt.a(0.0, 1.0, 0.0, 16.0, 2.5, 16.0);
   protected static final dxj i = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final int k = 10;
   private final cry l;

   public crx(cry $$0, cvn.c $$1) {
      super($$1);
      this.k(
         this.D
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
      this.l = $$0;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$0.c(b) ? h : i;
   }

   @Override
   public cvo a(ccx $$0) {
      cgd $$1 = $$0.q();
      gt $$2 = $$0.a();
      return this.m()
         .a(d, Boolean.valueOf(this.a($$1.a_($$2.d()), gy.c)))
         .a(e, Boolean.valueOf(this.a($$1.a_($$2.g()), gy.f)))
         .a(f, Boolean.valueOf(this.a($$1.a_($$2.e()), gy.d)))
         .a(g, Boolean.valueOf(this.a($$1.a_($$2.f()), gy.e)));
   }

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      return $$1.o().d() ? $$0.a((cwr)j.get($$1), Boolean.valueOf(this.a($$2, $$1))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         this.a($$1, $$2, $$0.a(a, Boolean.valueOf(true)));
      }
   }

   @Override
   public void a(cgx $$0, gt $$1, cvo $$2, buc $$3) {
      if (!$$0.y && !$$3.ez().b() && $$3.ez().a(caz.qd)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$3, czv.O, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      for(gy $$3 : new gy[]{gy.d, gy.e}) {
         for(int $$4 = 1; $$4 < 42; ++$$4) {
            gt $$5 = $$1.a($$3, $$4);
            cvo $$6 = $$0.a_($$5);
            if ($$6.a(this.l)) {
               if ($$6.c(cry.a) == $$3.g()) {
                  this.l.a($$0, $$5, $$6, false, true, $$4, $$2);
               }
               break;
            }

            if (!$$6.a(this)) {
               break;
            }
         }
      }

   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y) {
         if (!$$0.c(a)) {
            this.a($$1, $$2);
         }
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$1.a_($$2).c(a)) {
         this.a($$1, $$2);
      }
   }

   private void a(cgx $$0, gt $$1) {
      cvo $$2 = $$0.a_($$1);
      boolean $$3 = $$2.c(a);
      boolean $$4 = false;
      List<? extends bbn> $$5 = $$0.a_(null, $$2.j($$0, $$1).a().a($$1));
      if (!$$5.isEmpty()) {
         for(bbn $$6 : $$5) {
            if (!$$6.cm()) {
               $$4 = true;
               break;
            }
         }
      }

      if ($$4 != $$3) {
         $$2 = $$2.a(a, Boolean.valueOf($$4));
         $$0.a($$1, $$2, 3);
         this.a($$0, $$1, $$2);
      }

      if ($$4) {
         $$0.a(new gt($$1), this, 10);
      }

   }

   public boolean a(cvo $$0, gy $$1) {
      if ($$0.a(this.l)) {
         return $$0.c(cry.a) == $$1.g();
      } else {
         return $$0.a(this);
      }
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            return $$0.a(d, (Boolean)$$0.c(f)).a(e, (Boolean)$$0.c(g)).a(f, (Boolean)$$0.c(d)).a(g, (Boolean)$$0.c(e));
         case d:
            return $$0.a(d, (Boolean)$$0.c(e)).a(e, (Boolean)$$0.c(f)).a(f, (Boolean)$$0.c(g)).a(g, (Boolean)$$0.c(d));
         case b:
            return $$0.a(d, (Boolean)$$0.c(g)).a(e, (Boolean)$$0.c(d)).a(f, (Boolean)$$0.c(e)).a(g, (Boolean)$$0.c(f));
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      switch($$1) {
         case b:
            return $$0.a(d, (Boolean)$$0.c(f)).a(f, (Boolean)$$0.c(d));
         case c:
            return $$0.a(e, (Boolean)$$0.c(g)).a(g, (Boolean)$$0.c(e));
         default:
            return super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(a, b, c, d, e, g, f);
   }
}
