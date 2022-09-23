public class cpf extends cjj {
   public static final cwm<cws> d = cwe.ah;
   public static final cwf e = cwe.w;

   protected cpf(cvn.c $$0) {
      super(true, $$0);
      this.k(this.D.b().a(d, cws.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cgx $$0, gt $$1, cvo $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         cws $$9 = $$2.c(d);
         switch($$9) {
            case a:
               if ($$3) {
                  ++$$7;
               } else {
                  --$$7;
               }
               break;
            case b:
               if ($$3) {
                  --$$5;
               } else {
                  ++$$5;
               }
               break;
            case c:
               if ($$3) {
                  --$$5;
               } else {
                  ++$$5;
                  ++$$6;
                  $$8 = false;
               }

               $$9 = cws.b;
               break;
            case d:
               if ($$3) {
                  --$$5;
                  ++$$6;
                  $$8 = false;
               } else {
                  ++$$5;
               }

               $$9 = cws.b;
               break;
            case e:
               if ($$3) {
                  ++$$7;
               } else {
                  --$$7;
                  ++$$6;
                  $$8 = false;
               }

               $$9 = cws.a;
               break;
            case f:
               if ($$3) {
                  ++$$7;
                  ++$$6;
                  $$8 = false;
               } else {
                  --$$7;
               }

               $$9 = cws.a;
         }

         if (this.a($$0, new gt($$5, $$6, $$7), $$3, $$4, $$9)) {
            return true;
         } else {
            return $$8 && this.a($$0, new gt($$5, $$6 - 1, $$7), $$3, $$4, $$9);
         }
      }
   }

   protected boolean a(cgx $$0, gt $$1, boolean $$2, int $$3, cws $$4) {
      cvo $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         cws $$6 = $$5.c(d);
         if ($$4 != cws.b || $$6 != cws.a && $$6 != cws.e && $$6 != cws.f) {
            if ($$4 != cws.a || $$6 != cws.b && $$6 != cws.c && $$6 != cws.d) {
               if (!$$5.c(e)) {
                  return false;
               } else {
                  return $$0.r($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   protected void a(cvo $$0, cgx $$1, gt $$2, cjt $$3) {
      boolean $$4 = $$0.c(e);
      boolean $$5 = $$1.r($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(e, Boolean.valueOf($$5)), 3);
         $$1.a($$2.c(), this);
         if (((cws)$$0.c(d)).b()) {
            $$1.a($$2.b(), this);
         }
      }

   }

   @Override
   public cwr<cws> c() {
      return d;
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
               case a:
                  return $$0.a(d, cws.b);
               case b:
                  return $$0.a(d, cws.a);
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
            }
         case b:
            switch((cws)$$0.c(d)) {
               case a:
                  return $$0.a(d, cws.b);
               case b:
                  return $$0.a(d, cws.a);
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
