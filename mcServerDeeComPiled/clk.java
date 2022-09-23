import java.util.List;
import java.util.function.Predicate;

public class clk extends cjj {
   public static final cwm<cws> d = cwe.ah;
   public static final cwf e = cwe.w;
   private static final int f = 20;

   public clk(cvn.c $$0) {
      super(true, $$0);
      this.k(this.D.b().a(e, Boolean.valueOf(false)).a(d, cws.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(cvo $$0) {
      return true;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, bbn $$3) {
      if (!$$1.y) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(cvo $$0, agg $$1, gt $$2, amn $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(cvo $$0, cgd $$1, gt $$2, gy $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == gy.b ? 15 : 0;
      }
   }

   private void a(cgx $$0, gt $$1, cvo $$2) {
      if (this.a($$2, (cha)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<bvt> $$5 = this.a($$0, $$1, bvt.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            cvo $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.c(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            cvo $$7 = $$2.a(e, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.c(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
      cpj $$4 = new cpj($$0, $$1, $$2);

      for(gt $$6 : $$4.a()) {
         cvo $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }

   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         cvo $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public cwr<cws> c() {
      return d;
   }

   @Override
   public boolean d_(cvo $$0) {
      return true;
   }

   @Override
   public int a(cvo $$0, cgx $$1, gt $$2) {
      if ($$0.c(e)) {
         List<bwb> $$3 = this.a($$1, $$2, bwb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return ((bwb)$$3.get(0)).y().j();
         }

         List<bvt> $$4 = this.a($$1, $$2, bvt.class, bbq.d);
         if (!$$4.isEmpty()) {
            return bwm.b((bac)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends bvt> List<T> a(cgx $$0, gt $$1, Class<T> $$2, Predicate<bbn> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private dwl a(gt $$0) {
      double $$1 = 0.2;
      return new dwl(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public cvo a(cvo $$0, cpw $$1) {
      switch($$1) {
         case c:
            switch((cws)$$0.c(d)) {
               case c:
                  return $$0.a(d, cws.d);
               case d:
                  return $$0.a(d, cws.c);
               case e:
                  return $$0.a(d, cws.f);
               case f:
                  return $$0.a(d, cws.e);
               case g:
                  return $$0.a(d, cws.i);
               case h:
                  return $$0.a(d, cws.j);
               case i:
                  return $$0.a(d, cws.g);
               case j:
                  return $$0.a(d, cws.h);
            }
         case d:
            switch((cws)$$0.c(d)) {
               case c:
                  return $$0.a(d, cws.e);
               case d:
                  return $$0.a(d, cws.f);
               case e:
                  return $$0.a(d, cws.d);
               case f:
                  return $$0.a(d, cws.c);
               case g:
                  return $$0.a(d, cws.j);
               case h:
                  return $$0.a(d, cws.g);
               case i:
                  return $$0.a(d, cws.h);
               case j:
                  return $$0.a(d, cws.i);
               case a:
                  return $$0.a(d, cws.b);
               case b:
                  return $$0.a(d, cws.a);
            }
         case b:
            switch((cws)$$0.c(d)) {
               case c:
                  return $$0.a(d, cws.f);
               case d:
                  return $$0.a(d, cws.e);
               case e:
                  return $$0.a(d, cws.c);
               case f:
                  return $$0.a(d, cws.d);
               case g:
                  return $$0.a(d, cws.h);
               case h:
                  return $$0.a(d, cws.i);
               case i:
                  return $$0.a(d, cws.j);
               case j:
                  return $$0.a(d, cws.g);
               case a:
                  return $$0.a(d, cws.b);
               case b:
                  return $$0.a(d, cws.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public cvo a(cvo $$0, coh $$1) {
      cws $$2 = $$0.c(d);
      switch($$1) {
         case b:
            switch($$2) {
               case e:
                  return $$0.a(d, cws.f);
               case f:
                  return $$0.a(d, cws.e);
               case g:
                  return $$0.a(d, cws.j);
               case h:
                  return $$0.a(d, cws.i);
               case i:
                  return $$0.a(d, cws.h);
               case j:
                  return $$0.a(d, cws.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch($$2) {
               case c:
                  return $$0.a(d, cws.d);
               case d:
                  return $$0.a(d, cws.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, cws.h);
               case h:
                  return $$0.a(d, cws.g);
               case i:
                  return $$0.a(d, cws.j);
               case j:
                  return $$0.a(d, cws.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(d, e, c);
   }
}
