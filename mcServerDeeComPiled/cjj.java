public abstract class cjj extends cjt implements cql {
   protected static final dxj a = cjt.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final dxj b = cjt.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final cwf c = cwe.C;
   private final boolean d;

   public static boolean a(cgx $$0, gt $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(cvo $$0) {
      return $$0.a(akl.J) && $$0.b() instanceof cjj;
   }

   protected cjj(boolean $$0, cvn.c $$1) {
      super($$1);
      this.d = $$0;
   }

   public boolean b() {
      return this.d;
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      cws $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   public boolean a(cvo $$0, cha $$1, gt $$2) {
      return c($$1, $$2.c());
   }

   @Override
   public void b(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected cvo a(cvo $$0, cgx $$1, gt $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cjt $$3, gt $$4, boolean $$5) {
      if (!$$1.y && $$1.a_($$2).a(this)) {
         cws $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }

      }
   }

   private static boolean a(gt $$0, cgx $$1, cws $$2) {
      if (!c($$1, $$0.c())) {
         return true;
      } else {
         switch($$2) {
            case c:
               return !c($$1, $$0.g());
            case d:
               return !c($$1, $$0.f());
            case e:
               return !c($$1, $$0.d());
            case f:
               return !c($$1, $$0.e());
            default:
               return false;
         }
      }
   }

   protected void a(cvo $$0, cgx $$1, gt $$2, cjt $$3) {
   }

   protected cvo a(cgx $$0, gt $$1, cvo $$2, boolean $$3) {
      if ($$0.y) {
         return $$2;
      } else {
         cws $$4 = $$2.c(this.c());
         return new cpj($$0, $$1, $$2).a($$0.r($$1), $$3, $$4).c();
      }
   }

   @Override
   public dqb d(cvo $$0) {
      return dqb.a;
   }

   @Override
   public void a(cvo $$0, cgx $$1, gt $$2, cvo $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (((cws)$$0.c(this.c())).b()) {
            $$1.a($$2.b(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.c(), this);
         }

      }
   }

   @Override
   public cvo a(ccx $$0) {
      dpv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == dpw.c;
      cvo $$3 = super.m();
      gy $$4 = $$0.g();
      boolean $$5 = $$4 == gy.f || $$4 == gy.e;
      return $$3.a(this.c(), $$5 ? cws.b : cws.a).a(c, Boolean.valueOf($$2));
   }

   public abstract cwr<cws> c();

   @Override
   public cvo a(cvo $$0, gy $$1, cvo $$2, cgy $$3, gt $$4, gt $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dpw.c, dpw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpv c_(cvo $$0) {
      return $$0.c(c) ? dpw.c.a(false) : super.c_($$0);
   }
}
