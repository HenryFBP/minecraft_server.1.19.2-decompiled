import java.util.function.ToIntFunction;

public class cnx extends cjt implements cql {
   public static final int a = 15;
   public static final cwo b = cwe.aP;
   public static final cwf c = cwe.C;
   public static final ToIntFunction<cvo> d = $$0 -> $$0.c(b);

   public cnx(cvn.c $$0) {
      super($$0);
      this.k(this.D.b().a(b, Integer.valueOf(15)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(cvp.a<cjt, cvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public baj a(cvo $$0, cgx $$1, gt $$2, buc $$3, bai $$4, dwm $$5) {
      if (!$$1.y) {
         $$1.a($$2, $$0.a(b), 2);
         return baj.a;
      } else {
         return baj.b;
      }
   }

   @Override
   public dxj a(cvo $$0, cgd $$1, gt $$2, dwv $$3) {
      return $$3.a(caz.gG) ? dxg.b() : dxg.a();
   }

   @Override
   public boolean c(cvo $$0, cgd $$1, gt $$2) {
      return true;
   }

   @Override
   public cpp b_(cvo $$0) {
      return cpp.a;
   }

   @Override
   public float b(cvo $$0, cgd $$1, gt $$2) {
      return 1.0F;
   }

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

   @Override
   public cax a(cgd $$0, gt $$1, cvo $$2) {
      cax $$3 = super.a($$0, $$1, $$2);
      if ($$2.c(b) != 15) {
         pj $$4 = new pj();
         $$4.a(b.f(), String.valueOf($$2.c(b)));
         $$3.a("BlockStateTag", $$4);
      }

      return $$3;
   }
}
